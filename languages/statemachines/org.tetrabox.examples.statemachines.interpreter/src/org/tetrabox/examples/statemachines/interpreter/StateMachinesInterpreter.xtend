package org.tetrabox.examples.statemachines.interpreter

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.gemoc.executionframework.engine.annotations.EventHandler
import statemachines.CustomEvent
import statemachines.almostuml.AlmostumlFactory
import statemachines.almostuml.CompletionEvent
import statemachines.almostuml.FinalState
import statemachines.almostuml.Pseudostate
import statemachines.almostuml.PseudostateKind
import statemachines.almostuml.Region
import statemachines.almostuml.State
import statemachines.almostuml.StateMachine
import statemachines.almostuml.Transition
import statemachines.almostuml.Vertex
import statemachinesexecutiondata.EventOccurrence
import statemachinesexecutiondata.StatemachinesexecutiondataFactory

import static extension org.tetrabox.examples.statemachines.interpreter.RegionAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.StateAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.StateMachineAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.TransitionAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.VertexAspect.*
import org.eclipse.gemoc.executionframework.engine.annotations.EventEmitter

@Aspect(className=StateMachine)
class StateMachineAspect {
	
	protected val List<CompletionEvent> completionEvents = new ArrayList
	protected val List<EventOccurrence> deferredEvents = new ArrayList
	protected val List<Vertex> activeVertice = new ArrayList

	@Step
	@EventHandler
	def void run() {
		_self.regions.forEach[enter(null, null)]
		_self.dispatchCompletionEvents
	}
	
	@Step
	@EventHandler
	def void eventOccurrenceReceived(CustomEvent eventType) {
		val eventOccurrence = StatemachinesexecutiondataFactory::eINSTANCE.createEventOccurrence
		eventOccurrence.event = eventType
		_self.dispatchEventOccurrence(eventOccurrence)
		
	}
	
	private def List<Transition> selectTransitions(CustomEvent eventType) {
		return _self.regions.map[r|_self._selectTransitions(r.vertice, eventType)].flatten.toList
	}
	
	private def List<Transition> _selectTransitions(List<Vertex> vertice, CustomEvent eventType) {
		vertice.filter[v|_self.activeVertice.contains(v)]
			.map[v|_self._selectTransitions(v, eventType)]
			.flatten.toList
	}
	
	private def List<Transition> _selectTransitions(Vertex vertex, CustomEvent eventType) {
		val transitions = new ArrayList
		if (vertex instanceof State) {
			if (vertex.regions !== null) {
				transitions.addAll(vertex.regions.map[r|_self._selectTransitions(r.vertice, eventType)].flatten)
			}
		}
		if (transitions.empty) {
			transitions.addAll(vertex.outgoingTransitions.filter[t|t.triggers.exists[event == eventType]])
			if (transitions.size > 1) {
				val electedTransition = transitions.head
				transitions.clear
				transitions.add(electedTransition)
			}
		}
		return transitions
	}
	
	private def void dispatchEventOccurrence(EventOccurrence eventOccurrence) {
		val eventType = eventOccurrence.event
		val deferringState = _self.getDeferringState(eventType)
		if (deferringState === null) {
			_self.selectTransitions(eventType).forEach[t|
				t.fire(eventOccurrence)
			]
			_self.dispatchCompletionEvents
			_self.dispatchDeferredEvents
		} else {
			deferringState.deferredEvents.add(eventOccurrence)
		}
	}
	
	private def void dispatchCompletionEvents() {
		while (!_self.completionEvents.empty) {
			val event = _self.completionEvents.remove(0)
			val transition = event.state.outgoingTransitions.filter[triggers === null || triggers.empty].head
			if (transition !== null) {
				transition.fire(null)
			}
		}
	}
	
	private def void dispatchDeferredEvents() {
		val toDispatch = new ArrayList(_self.deferredEvents)
		_self.deferredEvents.clear
		toDispatch.forEach[eventOccurrence|
			_self.dispatchEventOccurrence(eventOccurrence)
		]
	}
	
	private def State getDeferringState(CustomEvent eventType) {
		_self.regions.map[vertice].flatten.filter(State).filter[s|
			_self.activeVertice.contains(s)
		].map[s|
			_self._getDeferringState(eventType, s)
		].filterNull.head
	}
	
	private def State _getDeferringState(CustomEvent eventType, State state) {
		var State deferred = state.regions.map[vertice].flatten.filter(State).filter[s|
			_self.activeVertice.contains(s)
		].map[s|
			_self._getDeferringState(eventType, s)
		].filterNull.head
		if (deferred === null && state.canDefer(eventType)) {
			if (_self._selectTransitions(state, eventType).empty) {
				deferred = state;
			}
		}
		return deferred;
	}
	
	@Step
	protected def void terminate() {
		_self.regions.forEach[terminate]
	}
}

@Aspect(className=Region)
class RegionAspect {
	
	protected boolean completed = false
	
	public Vertex currentVertex = null
	
	protected def void enter(Transition enteringTransition, EventOccurrence eventOccurrence) {
//		if (enteringTransition === null || enteringTransition.target == _self.state) {
		if (enteringTransition === null || !_self.contains(enteringTransition.target)) {
			val initialState = _self.vertice.filter(Pseudostate).findFirst[
				kind == PseudostateKind::INITIAL
			]
			if (initialState !== null) {
				initialState.enter(enteringTransition, eventOccurrence, null)
			} else {
				_self.completed = true
				if (_self.state !== null && _self.state.hasCompleted) {
					_self.state.complete
				}
			}
		}
	}
	
	protected def void exit(Transition exitingTransition, EventOccurrence eventOccurrence) {
		_self.vertice.filter[v|v.isExitable(exitingTransition)].forEach[exit(exitingTransition, eventOccurrence, null)]
	}
	
	protected def void terminate() {
		_self.vertice.forEach[terminate]
	}
	
	protected def StateMachine getContainingStateMachine() {
		if (_self.state !== null)
			return _self.state.container.containingStateMachine
		return _self.stateMachine
	}
	
	protected def Iterable<Vertex> getActiveVertice() {
		val result = new ArrayList(_self.containingStateMachine.activeVertice)
		result.retainAll(_self.vertice)
		result.addAll(_self.vertice.filter(State).map[activeVertice].flatten)
		return result
	}
	
	protected def boolean contains(Vertex vertex) {
		return _self.vertice.exists[contains(vertex)]
	}
}

@Aspect(className=Vertex)
class VertexAspect {
	
	protected def void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		if (leastCommonAncestor !== null && _self.container !== null && _self.container != leastCommonAncestor) {
			var containingState = _self.container.state
			if (containingState !== null) {
				containingState.enter(enteringTransition, eventOccurrence, leastCommonAncestor)
			}
		}
		_self.container.currentVertex = _self
		_self.container.containingStateMachine.activeVertice.add(_self)
	}
	
	protected def void exit(Transition exitingTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		_self.container.currentVertex = null
		_self.container.containingStateMachine.activeVertice.remove(_self)
		if(leastCommonAncestor !== null && _self.container !== null && leastCommonAncestor != _self.container){
			var containingState = _self.container.state
			if(containingState !== null){
				containingState.exit(exitingTransition, eventOccurrence, leastCommonAncestor);
			}
		}
	}
	
	protected def void terminate() {
		return
	}
	
	protected def boolean isActive() {
		_self.container.containingStateMachine.activeVertice.contains(_self)
	}
	
	protected def boolean isEnterable(Transition enteringTransition) {
		return true
	}
	
	protected def boolean isExitable(Transition exitingTransition) {
		return true
	}
	
	protected def boolean contains(Vertex vertex) {
		return false
	}
}

@Aspect(className=State)
class StateAspect extends VertexAspect {

	public boolean isEntryCompleted
	public boolean isDoActivityCompleted
	public boolean isExitCompleted
	
	protected List<EventOccurrence> deferredEvents = new ArrayList

	@OverrideAspectMethod
	protected def void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		if (!_self.active) {
			_self.super_enter(enteringTransition, eventOccurrence, leastCommonAncestor)
			_self.isEntryCompleted = _self.entry === null
			_self.isDoActivityCompleted = _self.doActivity === null
			_self.isExitCompleted = _self.exit === null
			if (_self.hasCompleted) {
				_self.complete
			} else {
				_self.tryExecuteEntry
				_self.tryExecuteDoActivity
				_self.enterRegions(enteringTransition, eventOccurrence)
			}
		}
	}

	@OverrideAspectMethod
	protected def void exit(Transition exitingTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		_self.regions.forEach[r|r.exit(exitingTransition, eventOccurrence)]
		_self.tryExecuteExit
		_self.super_exit(exitingTransition, eventOccurrence, leastCommonAncestor)
		_self.container.containingStateMachine.deferredEvents.addAll(_self.deferredEvents)
	}

	protected def void enterRegions(Transition enteringTransition, EventOccurrence eventOccurrence) {
		val targetedVertice = new ArrayList
		val source = enteringTransition.source
		if (source instanceof Pseudostate && (source as Pseudostate).kind == PseudostateKind.FORK) {
			targetedVertice.addAll(source.outgoingTransitions.map[target])
		} else {
			targetedVertice.add(enteringTransition.target)
		}
		_self.regions.filter[r|
			val vertice = new ArrayList(r.vertice)
			vertice.retainAll(targetedVertice)
			return vertice.empty
		].forEach[enter(enteringTransition, eventOccurrence)]
	}

	private def void tryExecuteEntry() {
		if (!_self.entryCompleted) {
			println(_self.name + "(" + _self.entry.name + ")")
			_self.isEntryCompleted = true
			if (_self.hasCompleted) {
				_self.complete
			}
		}
	}

	private def void tryExecuteDoActivity() {
		if (!_self.doActivityCompleted) {
			println(_self.name + "(" + _self.doActivity.name + ")")
			_self.isDoActivityCompleted = true
			if (_self.hasCompleted) {
				_self.complete
			}
		}
	}
	
	private def void tryExecuteExit() {
		if (!_self.exitCompleted) {
			println(_self.name + "(" + _self.exit.name + ")")
			_self.isExitCompleted = true
		}
	}

	@OverrideAspectMethod
	protected def void terminate() {
		_self.regions.forEach[terminate]
	}
	
	@OverrideAspectMethod
	protected def boolean isEnterable(Transition enteringTransition) {
		return !_self.active
	}
	
	@OverrideAspectMethod
	protected def boolean isExitable(Transition exitingTransition) {
		return _self.active
	}
	
	@OverrideAspectMethod
	protected def boolean contains(Vertex vertex) {
		if (_self == vertex) {
			return true
		} else {
			return _self.regions.exists[contains(vertex)]
		}
	}
	
	protected def boolean canDefer(CustomEvent eventType) {
		_self.deferrableTriggers.exists[event == eventType]
	}
	
	protected def List<Vertex> getActiveVertice() {
		return _self.regions.map[activeVertice].flatten.toList
	}
	
	protected def boolean hasCompleted() {
		return _self.entryCompleted && _self.doActivityCompleted && _self.regions.forall[completed]
	}
	
	protected def void complete() {
		val event = AlmostumlFactory::eINSTANCE.createCompletionEvent => [
			state = _self
		]
		_self.container.containingStateMachine.completionEvents.add(event)
	}
}

@Aspect(className=FinalState)
class FimalStateAspect extends StateAspect {
	
	@OverrideAspectMethod
	protected def void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		_self.container.currentVertex = null
		_self.container.completed = true
		val parentState = _self.container.state
		if (parentState !== null && parentState.hasCompleted) {
			parentState.complete
		}
		//TODO
		if (_self.container.eContainer instanceof StateMachine) {
			(_self.container.eContainer as StateMachine).terminate
		}
	}
}

@Aspect(className=Pseudostate)
class PseudostateAspect extends VertexAspect {

	@OverrideAspectMethod
	protected def void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		switch (_self.kind) {
			
			case INITIAL: {
				_self.container.currentVertex = _self
				if (_self.outgoingTransitions.size == 1) {
					_self.outgoingTransitions.head.fire(eventOccurrence)
				}
			}
			
			case FORK: {
				_self.super_enter(enteringTransition, eventOccurrence, leastCommonAncestor)
				_self.outgoingTransitions.forEach[fire(eventOccurrence)]
			}
			
			case JOIN: {
				_self.super_enter(enteringTransition, eventOccurrence, leastCommonAncestor)
				_self.outgoingTransitions.head.fire(eventOccurrence)
			}
			
			case TERMINATE: {
				_self.super_enter(enteringTransition, eventOccurrence, leastCommonAncestor)
				_self.container.containingStateMachine.terminate
				_self.exit(null, null, null)
			}
			
			default: {
				_self.super_enter(enteringTransition, eventOccurrence, leastCommonAncestor)
			}
		}
	}
	
	@OverrideAspectMethod
	protected def boolean isEnterable(Transition enteringTransition) {
		switch (_self.kind) {
			case JOIN: {
				return _self.incomingTransitions.filter[it != enteringTransition].forall[traversed]
			}
			default: {
				return _self.super_isEnterable(enteringTransition)
			}
		}
	}
	
	@OverrideAspectMethod
	protected def boolean isExitable(Transition exitingTransition) {
		switch (_self.kind) {
			case FORK: {
				return _self.outgoingTransitions.filter[it != exitingTransition].forall[traversed]
			}
			default: {
				return _self.super_isExitable(exitingTransition)
			}
		}
	}
}

@Aspect(className=Transition)
class TransitionAspect {

	protected boolean traversed = false

	@Step
	def void fire(EventOccurrence eventOccurrence) {
		_self.exitSource(eventOccurrence)
		//TODO execute effect behavior
		if (_self.effect !== null) {
			println(_self.name + "(" + _self.effect.name + ")")
		}
		_self.traversed = true
		_self.enterTarget(eventOccurrence)
	}
	
	private def void exitSource(EventOccurrence eventOccurrence) {
		switch (_self.kind) {
			case EXTERNAL: {
				if (_self.source.isExitable(_self)) {
					if (_self.target.isEnterable(_self)) {
						_self.source.exit(_self, eventOccurrence, _self.leastCommonAncestor)
					} else {
						_self.source.exit(_self, eventOccurrence, null)
					}
				}
			}
			case INTERNAL: {
				return
			}
			case LOCAL: {
				if (_self.source.isExitable(_self)) {
					val containingState = _self.containingState
					val containingRegion = containingState.regions.findFirst[r|r == _self.target.container]
					if (containingRegion !== null) {
						val vertexToExit = containingRegion.vertice.findFirst[active]
						if (vertexToExit !== null) {
							vertexToExit.exit(_self, eventOccurrence, null)
						}
					}
					if (_self.source != containingState) {
						_self.source.exit(_self, eventOccurrence, _self.leastCommonAncestor)
					}
				}
			}
		}
	}
	
	private def void enterTarget(EventOccurrence eventOccurrence) {
		switch (_self.kind) {
			case EXTERNAL: {
				if (_self.target.isEnterable(_self)) {
					_self.target.enter(_self, eventOccurrence, _self.leastCommonAncestor)
				} else if (_self.target instanceof State) {
					var targetContainingRegion = _self.target.container
					targetContainingRegion.completed = true
					if ((_self.target as State).hasCompleted) {
						(_self.target as State).complete
					}
				}
			}
			case INTERNAL: {
				return
			}
			case LOCAL: {
				if (_self.target.isEnterable(_self)) {
					if (_self.target != _self.containingState) {
						_self.target.enter(_self, eventOccurrence, _self.leastCommonAncestor)
					}
				}
			}
		}
	}
	
	private def State getContainingState() {
		var State containingState = null
		if (_self.source.contains(_self.target)) {
			containingState = _self.source as State
		} else {
			containingState = _self.target as State
		}
		return containingState
	}
	
	private def Region getLeastCommonAncestor() {
		val sourceAncestors = new ArrayList<Region>()
		val targetAncestors = new ArrayList<Region>()
		var EObject currentAncestor = _self.source.container
		while (!(currentAncestor instanceof StateMachine)) {
			if (currentAncestor instanceof Region) {
				sourceAncestors.add(currentAncestor)
			}
			currentAncestor = currentAncestor.eContainer
		}
		currentAncestor = _self.target.container
		while (!(currentAncestor instanceof StateMachine)) {
			if (currentAncestor instanceof Region) {
				targetAncestors.add(currentAncestor)
			}
			currentAncestor = currentAncestor.eContainer
		}
		var Region result = null
		for (var i = 0; i < sourceAncestors.size && result === null; i++) {
			for (var j = 0; j < targetAncestors.size && result === null; j++) {
				if (sourceAncestors.get(i) == targetAncestors.get(j)) {
					result = sourceAncestors.get(i)
				}
			}
		}
		return result
	}
}
