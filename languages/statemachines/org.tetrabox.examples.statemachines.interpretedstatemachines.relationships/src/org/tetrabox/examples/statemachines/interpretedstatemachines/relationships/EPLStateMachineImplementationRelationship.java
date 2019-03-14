package org.tetrabox.examples.statemachines.interpretedstatemachines.relationships;

import static org.eclipse.gemoc.executionframework.event.manager.IImplementationRelationship.loadBehavioralInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gemoc.executionframework.event.manager.EPLImplementationRelationship;
import org.eclipse.gemoc.executionframework.event.manager.ImplementationRuleSubscriber;
import org.eclipse.gemoc.executionframework.event.manager.SimpleCallRequest;
import org.eclipse.gemoc.xdsmlframework.behavioralinterface.behavioralInterface.BehavioralInterface;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;

public class EPLStateMachineImplementationRelationship extends EPLImplementationRelationship {
	
	private static List<ImplementationRuleSubscriber> computeRuleSubscribers() {
		final List<ImplementationRuleSubscriber> result = new ArrayList<>();
		result.add(new OnRun());
		result.add(new OnSignalReceived());
		result.add(new OnBehaviorExecuted());
		return result;
	}

	public EPLStateMachineImplementationRelationship() {
		this(loadBehavioralInterface("platform:/plugin/org.tetrabox.examples.statemachines.interpretedstatemachines.relationships/InterpretedStateMachines.bi"));
	}

	public EPLStateMachineImplementationRelationship(BehavioralInterface behavioralInterface) {
		super(behavioralInterface, computeRuleSubscribers());
	}
	
	static public class OnRun extends ImplementationRuleSubscriber {
		@Override
		public String getStatement() {
			return "select args('state_machine') from EPLEventOccurrence(event.name='run')";
		}
		
		public void update(Object stateMachine) {
			final String name = "org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect.run";
			final List<Object> arguments = Arrays.asList(new Object[] {stateMachine});
			final boolean rtc = true;
			consumeCallRequest(new SimpleCallRequest(name, arguments, rtc));
		}
	}
	
	static public class OnSignalReceived extends ImplementationRuleSubscriber {
		@Override
		public String getStatement() {
			return "select args('state_machine'), args('signal_occurrence') from EPLEventOccurrence(event.name='signal_received')";
		}
		
		public void update(Object stateMachine, Object signalOccurrence) {
			final String name = "org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect.eventOccurrenceReceived";
			final List<Object> arguments = Arrays.asList(new Object[] {stateMachine, signalOccurrence});
			final boolean rtc = true;
			consumeCallRequest(new SimpleCallRequest(name, arguments, rtc));
		}
	}
	
	static public class OnBehaviorExecuted extends ImplementationRuleSubscriber {
		@Override
		public String getStatement() {
			return "select arguments('_self') from " +
					"ReturnNotification(behavioralUnit='org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior.execute')";
		}
		
		private boolean precondition(Behavior behavior) {
			return true;
//			return !behavior.getEmittedSignals().isEmpty();
		}
		
		public void update(Object object) {
			final Behavior behavior = (Behavior) object;
			if (precondition(behavior)) {
				if (behavior.getEmittedSignals().isEmpty()) {
					final Map<String, Object> parameters = new HashMap<>();
					final SignalEventOccurrence o = StatemachinesFactory.eINSTANCE.createSignalEventOccurrence();
					final Signal signal = StatemachinesFactory.eINSTANCE.createSignal();
					signal.setName(behavior.getName());
					o.setSignal(signal);
					parameters.put("signal_occurrence", o);
					consumeEventOccurrence(createEventOccurrence("signal_sent", parameters));
				} else {
					behavior.getEmittedSignals().forEach(o -> {
						final Map<String, Object> parameters = new HashMap<>();
						parameters.put("signal_occurrence", o);
						consumeEventOccurrence(createEventOccurrence("signal_sent", parameters));
					});
				}
			}
		}
	}
}
