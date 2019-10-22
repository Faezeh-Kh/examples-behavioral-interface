package org.tetrabox.examples.statemachines.interpreter

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import statemachines.Attribute
import statemachines.AttributeValue
import statemachines.Behavior
import statemachines.BooleanAttribute
import statemachines.BooleanAttributeValue
import statemachines.CallEventOccurrence
import statemachines.CallEventType
import statemachines.CompletionEventOccurrence
import statemachines.Constraint
import statemachines.EventOccurrence
import statemachines.FinalState
import statemachines.IntegerAttribute
import statemachines.IntegerAttributeValue
import statemachines.NamedElement
import statemachines.OperationBehavior
import statemachines.Pseudostate
import statemachines.PseudostateKind
import statemachines.Region
import statemachines.SignalEventOccurrence
import statemachines.SignalEventType
import statemachines.State
import statemachines.StateMachine
import statemachines.StatemachinesFactory
import statemachines.StringAttribute
import statemachines.StringAttributeValue
import statemachines.Transition
import statemachines.Vertex

import static extension org.tetrabox.examples.statemachines.interpreter.AttributeValueAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.BehaviorAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.CallEventOccurrenceAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.ConstraintAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.EventOccurrenceAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.RegionAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.StateAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.StateMachineAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.TransitionAspect.*
import static extension org.tetrabox.examples.statemachines.interpreter.VertexAspect.*

@Aspect(className=StateMachine)
class StateMachineAspect {
	
	protected val List<CompletionEventOccurrence> completionEvents = new ArrayList
	protected val List<EventOccurrence> deferredEvents = new ArrayList
	protected val List<Vertex> activeVertice = new ArrayList

	@Step
	def void run() {
		_self.regions.forEach[enter(null, null)]
		_self.dispatchCompletionEvents
	}
	
	@Step
	def void eventOccurrenceReceived(EventOccurrence event) {
		_self.dispatchEventOccurrence(event)
	}
	
	private def List<Transition> selectTransitions(EventOccurrence event) {
		return _self.regions.map[r|_self._selectTransitions(r.vertice, event)].flatten.toList
	}
	
	private def List<Transition> _selectTransitions(List<Vertex> vertice, EventOccurrence event) {
		vertice.filter[v|_self.activeVertice.contains(v)]
			.map[v|_self._selectTransitions(v, event)]
			.flatten.toList
	}
	
	private def List<Transition> _selectTransitions(Vertex vertex, EventOccurrence event) {
		val transitions = new ArrayList
		if (vertex instanceof State) {
			if (vertex.regions !== null) {
				transitions.addAll(vertex.regions.map[r|_self._selectTransitions(r.vertice, event)].flatten)
			}
		}
		if (transitions.empty) {
			transitions.addAll(vertex.outgoingTransitions.filter[canFireOn(event)])
			if (transitions.size > 1) {
				val selectedTransition = transitions.head
				transitions.clear
				transitions.add(selectedTransition)
			}
		}
		return transitions
	}
	
	private def void dispatchEventOccurrence(EventOccurrence eventOccurrence) {
		val deferringState = _self.getDeferringState(eventOccurrence)
		if (deferringState === null) {
			_self.selectTransitions(eventOccurrence).forEach[t|
				t.fire(eventOccurrence)
			]
			if (eventOccurrence !== null && eventOccurrence instanceof CallEventOccurrence) {
				val out = (eventOccurrence as CallEventOccurrence).outValues
				if (!out.empty) {
					println(out)
				}
			}
			_self.dispatchCompletionEvents
			_self.dispatchDeferredEvents
		} else {
			deferringState.deferredEvents.add(eventOccurrence)
		}
	}
	
	private def void dispatchCompletionEvents() {
		while (!_self.completionEvents.empty) {
			val event = _self.completionEvents.remove(0)
			if (_self.activeVertice.contains(event.state)) {
				val transition = event.state.outgoingTransitions.filter[canFireOn(null)].head
				if (transition !== null) {
					transition.fire(null)
				}
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
	
	private def State getDeferringState(EventOccurrence event) {
		_self.regions.map[vertice].flatten.filter(State).filter[s|
			_self.activeVertice.contains(s)
		].map[s|
			_self._getDeferringState(event, s)
		].filterNull.head
	}
	
	private def State _getDeferringState(EventOccurrence event, State state) {
		var State deferred = state.regions.map[vertice].flatten.filter(State).filter[s|
			_self.activeVertice.contains(s)
		].map[s|
			_self._getDeferringState(event, s)
		].filterNull.head
		if (deferred === null && state.canDefer(event)) {
			if (_self._selectTransitions(state, event).empty) {
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
		_self.containingRegion.currentVertex = _self
		_self.containingRegion.containingStateMachine.activeVertice.add(_self)
	}
	
	protected def void exit(Transition exitingTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		_self.containingRegion.currentVertex = null
		_self.containingRegion.containingStateMachine.activeVertice.remove(_self)
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
	
	protected def Region getContainingRegion() {
		return _self.container
	}
	
	protected def State getParentState() {
		return _self.container.state
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
				_self.tryExecuteEntry(eventOccurrence)
				_self.tryExecuteDoActivity(eventOccurrence)
				_self.enterRegions(enteringTransition, eventOccurrence)
			}
		}
	}

	@OverrideAspectMethod
	protected def void exit(Transition exitingTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		_self.regions.forEach[r|r.exit(exitingTransition, eventOccurrence)]
		_self.tryExecuteExit(eventOccurrence)
		_self.super_exit(exitingTransition, eventOccurrence, leastCommonAncestor)
		_self.container.containingStateMachine.deferredEvents.addAll(_self.deferredEvents)
	}

	protected def void enterRegions(Transition enteringTransition, EventOccurrence eventOccurrence) {
		val targetedVertice = new ArrayList
		val source = enteringTransition.source
		val target = enteringTransition.target
		if (source instanceof Pseudostate && (source as Pseudostate).kind == PseudostateKind.FORK) {
			targetedVertice.addAll(source.outgoingTransitions.map[t|t.target])
		} else {
			targetedVertice.add(enteringTransition.target)
		}
		if (target instanceof Pseudostate && (target as Pseudostate).kind == PseudostateKind.ENTRYPOINT) {
			targetedVertice.addAll(target.outgoingTransitions.map[t|t.target])
		}
		_self.regions.filter[r|
			val vertice = new ArrayList(r.vertice)
			vertice.retainAll(targetedVertice)
			return vertice.empty
		].forEach[enter(enteringTransition, eventOccurrence)]
	}

	private def void tryExecuteEntry(EventOccurrence eventOccurrence) {
		if (!_self.entryCompleted) {
			_self.entry.execute(eventOccurrence)
//			if (_self.entry instanceof OperationBehavior) {
//				(_self.entry as OperationBehavior).execute(eventOccurrence as CallEventOccurrence)
//			}
//			println(_self.name + "(" + _self.entry.name + ")" + if (eventOccurrence !== null) {eventOccurrence.parameters} else {""})
			_self.isEntryCompleted = true
			if (_self.hasCompleted) {
				_self.complete
			}
		}
	}

	private def void tryExecuteDoActivity(EventOccurrence eventOccurrence) {
		if (!_self.doActivityCompleted) {
			_self.doActivity.execute(eventOccurrence)
//			if (_self.doActivity instanceof OperationBehavior) {
//				(_self.doActivity as OperationBehavior).execute(eventOccurrence as CallEventOccurrence)
//			}
//			println(_self.name + "(" + _self.doActivity.name + ")" + if (eventOccurrence !== null) {eventOccurrence.parameters} else {""})
			_self.isDoActivityCompleted = true
			if (_self.hasCompleted) {
				_self.complete
			}
		}
	}
	
	private def void tryExecuteExit(EventOccurrence eventOccurrence) {
		if (!_self.exitCompleted) {
			_self.exit.execute(eventOccurrence)
//			if (_self.exit instanceof OperationBehavior) {
//				(_self.exit as OperationBehavior).execute(eventOccurrence as CallEventOccurrence)
//			}
//			println(_self.name + "(" + _self.exit.name + ")" + if (eventOccurrence !== null) {eventOccurrence.parameters} else {""})
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
		if (_self == vertex || _self == vertex.eContainer)
			return true
		return _self.regions.exists[contains(vertex)]
	}
	
	protected def boolean canDefer(EventOccurrence eventOccurrence) {
		if (eventOccurrence instanceof SignalEventOccurrence) {
			return _self.deferrableTriggers.exists[t|
				val type = t.eventType
				type instanceof SignalEventType &&
						eventOccurrence.signal == (type as SignalEventType).signal
			]
		} else if (eventOccurrence instanceof CallEventOccurrence) {
			return _self.deferrableTriggers.exists[t|
				val type = t.eventType
				type instanceof CallEventType &&
						eventOccurrence.operation == (type as CallEventType).operation
			]
		}
		return false
	}
	
	protected def List<Vertex> getActiveVertice() {
		return _self.regions.map[activeVertice].flatten.toList
	}
	
	protected def boolean hasCompleted() {
		return _self.entryCompleted && _self.doActivityCompleted && _self.regions.forall[completed]
	}
	
	protected def void complete() {
		val event = StatemachinesFactory::eINSTANCE.createCompletionEventOccurrence => [
			state = _self
		]
		_self.container.containingStateMachine.completionEvents.add(event)
	}
}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {
	
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
			
			case ENTRYPOINT: {
				_self.state.enter(enteringTransition, eventOccurrence, leastCommonAncestor)
				_self.state.container.currentVertex = _self
				_self.state.container.containingStateMachine.activeVertice.add(_self)
				if (_self.state.regions.size > 1) {
					_self.outgoingTransitions.forEach[fire(eventOccurrence)]
				} else {
					_self.outgoingTransitions.head?.fire(eventOccurrence)
				}
			}
			
			case EXITPOINT: {
				if (_self.outgoingTransitions.size > 0) {
					var selectedTransition = _self.outgoingTransitions.head
					_self.super_enter(enteringTransition, eventOccurrence, null)
					_self.state.exit(enteringTransition, eventOccurrence, null)
					selectedTransition.fire(eventOccurrence)
				}
			}
			
			default: {
				_self.super_enter(enteringTransition, eventOccurrence, leastCommonAncestor)
			}
		}
	}
	
	@OverrideAspectMethod
	protected def void exit(Transition exitingTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor) {
		if (_self.kind == PseudostateKind.ENTRYPOINT) {
			_self.super_exit(exitingTransition, eventOccurrence, null)
		} else {
			_self.super_exit(exitingTransition, eventOccurrence, leastCommonAncestor)
		}
	}
	
	
	
	@OverrideAspectMethod
	protected def boolean isEnterable(Transition enteringTransition) {
		switch (_self.kind) {
			case JOIN: {
				return _self.incomingTransitions.filter[it != enteringTransition].forall[traversed]
			}
			case EXITPOINT: {
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
			case ENTRYPOINT: {
				return _self.outgoingTransitions.filter[it != exitingTransition].forall[traversed]
			}
			default: {
				return _self.super_isExitable(exitingTransition)
			}
		}
	}
	
	@OverrideAspectMethod
	protected def boolean isActive() {
		if (_self.kind == PseudostateKind.ENTRYPOINT || _self.kind == PseudostateKind.EXITPOINT) {
			return _self.state.container.containingStateMachine.activeVertice.contains(_self)
		} else {
			return _self.super_isActive
		}
	}
	
	@OverrideAspectMethod
	protected def Region getContainingRegion() {
		if (_self.state !== null)
			return _self.state.container
		return _self.container
	}
	
	@OverrideAspectMethod
	protected def State getParentState() {
		if (_self.state !== null)
			return _self.state
		return _self.container.state
	}
}

@Aspect(className=Transition)
class TransitionAspect {

	protected boolean traversed = false
	Region _leastCommonAncestor = null

	@Step
	def void fire(EventOccurrence eventOccurrence) {
		_self.exitSource(eventOccurrence)
		//TODO execute effect behavior
		if (_self.effect !== null) {
			_self.effect.execute(eventOccurrence)
//			if (_self.effect instanceof OperationBehavior) {
//				(_self.effect as OperationBehavior).execute(eventOccurrence as CallEventOccurrence)
//			}
//			println(_self.name + "(" + _self.effect.name + ")" + if (eventOccurrence !== null) {eventOccurrence.parameters} else {""})
		}
		_self.traversed = true
		_self.enterTarget(eventOccurrence)
	}
	
	protected def boolean canFireOn(EventOccurrence eventOccurrence) {
		var canFire = false
		if (eventOccurrence === null) {
			canFire = _self.triggers === null || _self.triggers.empty
		} else {
			if (eventOccurrence instanceof SignalEventOccurrence) {
				canFire = _self.triggers.exists[t|
					val type = t.eventType
					type instanceof SignalEventType &&
							eventOccurrence.signal == (type as SignalEventType).signal
				]
			} else if (eventOccurrence instanceof CallEventOccurrence) {
				canFire = _self.triggers.exists[t|
					val type = t.eventType
					type instanceof CallEventType &&
							eventOccurrence.operation == (type as CallEventType).operation
				]
			}
		}
		if (canFire) {
			val guard = _self.constraint
			if (guard !== null) {
				canFire = guard.evaluate(eventOccurrence)
			}
		}
		return canFire
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
		if (_self.source instanceof Pseudostate && (_self.source as Pseudostate).kind == PseudostateKind.ENTRYPOINT)
			return (_self.source as Pseudostate).state
		if (_self.source.contains(_self.target))
			return _self.source as State
		return _self.target as State
	}
	
	private def Region getRegion(EObject object) {
		if (object instanceof Region) {
			return object as Region
		} else if (object instanceof State) {
			return (object as State).container
		}
	}
	
	private def Region getLeastCommonAncestor() {
		if (_self.source.parentState != _self.target.parentState) {
			if (_self._leastCommonAncestor === null) {
				var Region result = null
				var parentSourceState = _self.source.parentState
				var parentTargetState = _self.target.parentState
				if (parentSourceState !== null && parentSourceState.connectionPoint.contains(_self.source) &&
						parentSourceState.contains(_self.target)) {
					result = parentSourceState.regions.findFirst[contains(_self.target)]
				} else if (parentTargetState !== null && parentTargetState.connectionPoint.contains(_self.target) &&
						parentTargetState.contains(_self.source)) {
					result = parentTargetState.regions.findFirst[contains(_self.source)]
				} else {
					val sourceAncestors = new ArrayList<EObject>()
					val targetAncestors = new ArrayList<EObject>()
					var EObject currentAncestor = _self.source.eContainer
					while (!(currentAncestor instanceof StateMachine)) {
						if (currentAncestor instanceof Region || currentAncestor instanceof State) {
							sourceAncestors.add(currentAncestor)
						}
						currentAncestor = currentAncestor.eContainer
					}
					currentAncestor = _self.target.eContainer
					while (!(currentAncestor instanceof StateMachine)) {
						if (currentAncestor instanceof Region || currentAncestor instanceof State) {
							targetAncestors.add(currentAncestor)
						}
						currentAncestor = currentAncestor.eContainer
					}
					for (var i = 0; i < sourceAncestors.size && result === null; i++) {
						for (var j = 0; j < targetAncestors.size && result === null; j++) {
							if (sourceAncestors.get(i) == targetAncestors.get(j)) {
								result = _self.getRegion(sourceAncestors.get(i))
							}
						}
					}
				}
				
				_self._leastCommonAncestor = result
			}
		}
		return _self._leastCommonAncestor
	}
}


@Aspect(className=Behavior)
class BehaviorAspect {
	@Step
	protected def void execute(EventOccurrence eventOccurrence) {
		println((_self.eContainer as NamedElement).name +
				"(" + _self.name + ")" + if (eventOccurrence !== null)
				{eventOccurrence.parameters} else {""})
	}
}

@Aspect(className=OperationBehavior)
class OperationBehaviorAspect extends BehaviorAspect {
	@Step
	@OverrideAspectMethod
	protected def void execute(EventOccurrence eventOccurrence) {
		val callEventOccurrence = eventOccurrence as CallEventOccurrence
		val op = callEventOccurrence.operation
		val outParameters = new ArrayList(op.outParameters)
		val returnParameter = op.^return
		_self.attributeValues.forEach[toSet|
			val attribute = toSet._attribute
			val value = toSet._value
			var paramValue = callEventOccurrence.outParameterValues.findFirst[v|v._attribute == attribute]
			if (paramValue === null) {
				if (attribute instanceof BooleanAttribute) {
					paramValue = StatemachinesFactory::eINSTANCE.createBooleanAttributeValue;
					(paramValue as BooleanAttributeValue).attribute = attribute
				} else if (attribute instanceof IntegerAttribute) {
					paramValue = StatemachinesFactory::eINSTANCE.createIntegerAttributeValue;
					(paramValue as IntegerAttributeValue).attribute = (attribute as IntegerAttribute)
				} else {
					paramValue = StatemachinesFactory::eINSTANCE.createStringAttributeValue;
					(paramValue as StringAttributeValue).attribute = (attribute as StringAttribute)
				}
				if (outParameters.contains(attribute)) {
					callEventOccurrence.outParameterValues.add(paramValue)
				} else if (returnParameter == attribute) {
					callEventOccurrence.returnValue = paramValue
				}
			}
			paramValue.set_value(value)
		]
		println((_self.eContainer as NamedElement).name +
				"(" + _self.name + ")" + if (eventOccurrence !== null)
				{eventOccurrence.parameters} else {""})
	}
}

@Aspect(className=Constraint)
class ConstraintAspect {
	protected def boolean evaluate(EventOccurrence eventOccurrence) {
		val attribute = _self.attribute
		if (attribute === null) {
			return true
		}
		val values = if (eventOccurrence instanceof SignalEventOccurrence) {
			new ArrayList(eventOccurrence.attributeValues)
		} else if (eventOccurrence instanceof CallEventOccurrence) {
			val result = new ArrayList(eventOccurrence.inParameterValues)
			result.addAll(eventOccurrence.outParameterValues)
			result.add(eventOccurrence.returnValue)
			result
		}
		val eventAttributeValue = values.findFirst[v|
			v._attribute == attribute
		]
		if (eventAttributeValue === null) {
			return false
		}
		if (_self.value instanceof Boolean) {
			return eventAttributeValue._value == if (_self.value as Boolean) 1 else 0
		}
		return eventAttributeValue._value == _self.value
	}
}

@Aspect(className=EventOccurrence)
abstract class EventOccurrenceAspect {
	protected abstract def String getParameters()
}

@Aspect(className=SignalEventOccurrence)
class SignalEventOccurrenceAspect extends EventOccurrenceAspect {
	@OverrideAspectMethod
	protected def String getParameters() {
		return "" + _self.attributeValues.filter[v|v._attribute !== null].map[v|"[in=" + v.string + "]"].join
	}
}

@Aspect(className=CallEventOccurrence)
class CallEventOccurrenceAspect extends EventOccurrenceAspect {
	@OverrideAspectMethod
	protected def String getParameters() {
		val inString = "" + _self.inParameterValues.filter[v|v._attribute !== null].map[v|"[in=" + v.string + "]"].join
		val outString = "" + _self.outParameterValues.filter[v|v._attribute !== null].map[v|"[out=" + v.string + "]"].join
		val returnString = "" + if (_self.returnValue !== null) {"[out=" + _self.returnValue.string + "]"} else {""}
		return inString + outString + returnString
	}
	
	protected def String getOutValues() {
		val outString = "" + _self.outParameterValues.filter[v|v._attribute !== null].map[v|"[out=" + v.string + "]"].join
		val returnString = "" + if (_self.returnValue !== null) {"[out=" + _self.returnValue.string + "]"} else {""}
		return outString + returnString
	}
}

@Aspect(className=AttributeValue)
abstract class AttributeValueAspect {
	protected abstract def int get_value()
	protected abstract def void set_value(int value)
	protected abstract def Attribute get_attribute()
	protected abstract def String getString()
}

@Aspect(className=BooleanAttributeValue)
class BooleanAttributeValueAspect extends AttributeValueAspect {
	@OverrideAspectMethod
	protected def int get_value() {
		return if (_self.value) 1 else 0
	}
	
	@OverrideAspectMethod
	protected def void set_value(int value) {
		_self.value = value == 1
	}
	
	@OverrideAspectMethod
	protected def Attribute get_attribute() {
		return _self.attribute
	}
	
	@OverrideAspectMethod
	protected def String getString() {
		return "" + _self.value
	}
}

@Aspect(className=IntegerAttributeValue)
class IntegerAttributeValueAspect extends AttributeValueAspect {
	@OverrideAspectMethod
	protected def int get_value() {
		return _self.value
	}
	
	@OverrideAspectMethod
	protected def void set_value(int value) {
		_self.value = value
	}
	
	@OverrideAspectMethod
	protected def Attribute get_attribute() {
		return _self.attribute
	}
	
	@OverrideAspectMethod
	protected def String getString() {
		return "" + _self.value
	}
}

@Aspect(className=StringAttributeValue)
class StringAttributeValueAspect extends AttributeValueAspect {
	@OverrideAspectMethod
	protected def String get_value() {
		return _self.value
	}
	
	@OverrideAspectMethod
	protected def void set_value(String value) {
		_self.value = value
	}
	
	@OverrideAspectMethod
	protected def Attribute get_attribute() {
		return _self.attribute
	}
	
	@OverrideAspectMethod
	protected def String getString() {
		return _self.value
	}
}
