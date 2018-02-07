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

@Aspect(className=StateMachine)
class StateMachineAspect {
	
	protected val List<CompletionEvent> completionEvents = new ArrayList
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
		val transition = _self.regions.map[activeVertice].flatten
				.map[outgoingTransitions].flatten
				.filter[t|t.triggers.exists[event == eventType]]
				.head
		if (transition !== null) {
			val eventOccurrence = StatemachinesexecutiondataFactory::eINSTANCE.createEventOccurrence
			eventOccurrence.event = eventType
			transition.fire(eventOccurrence)
		}
		_self.dispatchCompletionEvents
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
	
	@Step
	def void terminate() {
		_self.regions.forEach[terminate]
		//TODO ulgy
		Thread::currentThread.destroy
	}
}

@Aspect(className=Region)
class RegionAspect {
	
	protected boolean completed = false
	
	@Step
	def void enter(Transition enteringTransition, EventOccurrence eventOccurrence) {
		val initialState = _self.vertice.filter(Pseudostate).findFirst[
			kind == PseudostateKind::INITIAL
		]
		if (initialState !== null) {
			initialState.enter(enteringTransition, eventOccurrence, null)
		} else {
			if (_self.state !== null && _self.state.hasCompleted) {
				_self.state.complete
			}
		}
	}
	
	def void exit(Transition exitingTransition, EventOccurrence eventOccurrence) {
		_self.vertice.forEach[exit(exitingTransition, eventOccurrence, null)]
	}
	
	def void terminate() {
		_self.vertice.forEach[terminate]
	}
	
	def StateMachine getContainingStateMachine() {
		if (_self.state !== null)
			return _self.state.container.containingStateMachine
		return _self.stateMachine
	}
	
	def Iterable<Vertex> getActiveVertice() {
		val result = new ArrayList(_self.containingStateMachine.activeVertice)
		result.retainAll(_self.vertice)
		result.addAll(_self.vertice.filter(State).map[activeVertice].flatten)
		return result
	}
	
	def boolean contains(Vertex vertex) {
		return _self.vertice.exists[contains(vertex)]
	}
}

@Aspect(className=Vertex)
class VertexAspect {
	
	@Step
	def void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		println("Entering vertex: " + _self.name)
		if (leastCommonAncestor !== null && _self.container !== null && _self.container != leastCommonAncestor) {
			var containingState = _self.container.state
			if (containingState !== null) {
				containingState.enter(enteringTransition, eventOccurrence, leastCommonAncestor)
			}
		}
		_self.container.containingStateMachine.activeVertice.add(_self)
		println("Entered vertex: " + _self.name)
	}
	
	@Step
	def void exit(Transition exitingTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		println("Exiting vertex: " + _self.name)
		_self.container.containingStateMachine.activeVertice.remove(_self)
		if(leastCommonAncestor !== null && _self.container !== null && leastCommonAncestor != _self.container){
			var containingState = _self.container.state
			if(containingState !== null){
				containingState.exit(exitingTransition, eventOccurrence, leastCommonAncestor);
			}
		}
		println("Exited vertex: " + _self.name)
	}
	
	def void terminate() {
		return
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

	@OverrideAspectMethod
	def void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		if (!_self.active) {
			_self.super_enter(enteringTransition, eventOccurrence, leastCommonAncestor)
			if (_self.hasCompleted) {
				_self.complete
			} else {
				_self.enterRegions(enteringTransition, eventOccurrence)
			}
		}
		
	}

	@OverrideAspectMethod
	def void exit(Transition exitingTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		_self.regions.forEach[r|r.exit(exitingTransition, eventOccurrence)]
		_self.super_exit(exitingTransition, eventOccurrence, leastCommonAncestor)
	}

	def void enterRegions(Transition enteringTransition, EventOccurrence eventOccurrence) {
		val targetedVertice = new ArrayList
		val source = enteringTransition.source
		if (source instanceof Pseudostate && (source as Pseudostate).kind == PseudostateKind.FORK) {
			targetedVertice.addAll(source.outgoingTransitions.map[target])
		} else {
			targetedVertice.add(enteringTransition.target)
		}
		//TODO weird that we pass the enteringTransition instead of the proper transition
		_self.regions.filter[r|
			val vertice = new ArrayList(r.vertice)
			vertice.retainAll(targetedVertice)
			return vertice.empty
		].forEach[enter(enteringTransition, eventOccurrence)]
	}
	
	@OverrideAspectMethod
	def void terminate() {
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
	
	private def boolean isActive() {
		_self.container.containingStateMachine.activeVertice.contains(_self)
	}
	
	@OverrideAspectMethod
	protected def boolean contains(Vertex vertex) {
		if (_self == vertex) {
			return true
		} else {
			return _self.regions.exists[contains(vertex)]
		}
	}
	
	def List<Vertex> getActiveVertice() {
		return _self.regions.map[activeVertice].flatten.toList
	}
	
	def boolean hasCompleted() {
		return _self.regions.forall[completed]
	}
	
	def void complete() {
		val event = AlmostumlFactory::eINSTANCE.createCompletionEvent => [
			state = _self
		]
		_self.container.containingStateMachine.completionEvents.add(0, event)
	}
}

@Aspect(className=FinalState)
class FimalStateAspect extends StateAspect {
	
	@OverrideAspectMethod
	def void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		_self.container.completed = true
		val parentState = _self.container.state
		if (parentState !== null && parentState.hasCompleted) {
			parentState.complete
		}
	}
}

@Aspect(className=Pseudostate)
class PseudostateAspect extends VertexAspect {

	@OverrideAspectMethod
	def void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		switch (_self.kind) {
			case INITIAL: {
				if (_self.outgoingTransitions.size == 1) {
					_self.outgoingTransitions.head.fire(eventOccurrence)
				}
			}
			case FORK: {
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
		_self.traversed = true
		println("Traversed " + _self.name)
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
					val hierarchy = new ArrayList
					var EObject currentElement = _self.target
					while (currentElement != containingState) {
						currentElement = currentElement.eContainer
						if (currentElement instanceof Vertex) {
							hierarchy.add(currentElement)
						}
					}
					val vertexToExit = hierarchy.last
					if (vertexToExit !== null) {
						vertexToExit.exit(_self, eventOccurrence, null)
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
		for (var i = 0; i < sourceAncestors.size && i < targetAncestors.size && result === null; i++) {
			if (sourceAncestors.get(i) == targetAncestors.get(i)) {
				result = sourceAncestors.get(i)
			}
		}
		return result
	}
}
