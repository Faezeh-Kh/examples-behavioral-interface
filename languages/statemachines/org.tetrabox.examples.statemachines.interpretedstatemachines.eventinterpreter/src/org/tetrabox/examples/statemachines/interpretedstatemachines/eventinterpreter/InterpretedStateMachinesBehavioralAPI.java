package org.tetrabox.examples.statemachines.interpretedstatemachines.eventinterpreter;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gemoc.executionframework.event.manager.IBehavioralAPI;
import org.eclipse.gemoc.executionframework.event.model.event.Event;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineRunEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;

public class InterpretedStateMachinesBehavioralAPI implements IBehavioralAPI {

	private final Set<EClass> eventClasses = new HashSet<>();
	private final Set<EClass> startEventClasses = new HashSet<>();
	private final Set<EClass> interruptibleEventClasses = new HashSet<>();
	
	public InterpretedStateMachinesBehavioralAPI() {
		eventClasses.add(InterpretedstatemachineseventPackage.eINSTANCE.getStateMachineRunEvent());
		eventClasses.add(InterpretedstatemachineseventPackage.eINSTANCE.getStateMachineEventOccurrenceReceivedEvent());
	}
	
	@Override
	public boolean canSendEvent(Event _event) {
		if (_event instanceof StateMachineRunEvent) {
			return true;
		} else
		if (_event instanceof StateMachineEventOccurrenceReceivedEvent) {
			return true;
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		return eventClasses;
	}
	
	@Override
	public Set<EClass> getStartEventClasses() {
		return Collections.emptySet();
	}
	
	@Override
	public boolean isInterruptible(EClass eventClass) {
		return interruptibleEventClasses.contains(eventClass);
	}
	
	@Override
	public void dispatchEvent(Event _event) {
		if (_event instanceof StateMachineRunEvent) {
			handleStateMachineRunEvent((StateMachineRunEvent) _event);
		} else
		if (_event instanceof StateMachineEventOccurrenceReceivedEvent) {
			handleStateMachineEventOccurrenceReceivedEvent((StateMachineEventOccurrenceReceivedEvent) _event);
		}
	}
	
	private void handleStateMachineRunEvent(StateMachineRunEvent _event) {
		final StateMachine stateMachine = _event.getStateMachine();
		StateMachineAspect.run(stateMachine);
	}
	
	private void handleStateMachineEventOccurrenceReceivedEvent(StateMachineEventOccurrenceReceivedEvent _event) {
		final StateMachine stateMachine = _event.getStateMachine();
		final CustomEvent eventType = _event.getEventType();
		StateMachineAspect.eventOccurrenceReceived(stateMachine, eventType);
	}
	
	@Override
	public Event getOutputEvent(EOperation operation, EObject caller, List<Object> parameters) {
		return null;
	}
	
	@Override
	public boolean canHandle(EPackage pkg) {
		return pkg == StatemachinesPackage.eINSTANCE;
	}
	
}
