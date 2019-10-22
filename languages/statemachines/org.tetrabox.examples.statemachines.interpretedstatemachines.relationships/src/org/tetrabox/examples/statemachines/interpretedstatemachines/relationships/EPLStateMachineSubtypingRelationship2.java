package org.tetrabox.examples.statemachines.interpretedstatemachines.relationships;

import static org.eclipse.gemoc.executionframework.event.manager.IImplementationRelationship.loadBehavioralInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gemoc.executionframework.behavioralinterface.behavioralInterface.BehavioralInterface;
import org.eclipse.gemoc.executionframework.event.manager.EPLSubtypingRelationship;
import org.eclipse.gemoc.executionframework.event.manager.SubtypingRuleSubscriber;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue;

import com.google.common.collect.Streams;

public class EPLStateMachineSubtypingRelationship2 extends EPLSubtypingRelationship {

	private static List<SubtypingRuleSubscriber> computeRuleSubscribers() {
		final List<SubtypingRuleSubscriber> result = new ArrayList<>();
		result.add(new OnStart());
		result.add(new OnButtonPushed());
		result.add(new OnSignalSent());
		return result;
	}

	public EPLStateMachineSubtypingRelationship2() {
		this(loadBehavioralInterface("platform:/plugin/org.gemoc.arduino.sequential.xarduino.relationships/ButtonLight.bi"),
				loadBehavioralInterface("platform:/plugin/org.tetrabox.examples.statemachines.interpretedstatemachines.relationships/InterpretedStateMachines.bi"));
	}

	public EPLStateMachineSubtypingRelationship2(BehavioralInterface supertype, BehavioralInterface subtype) {
		super(supertype, subtype, computeRuleSubscribers());
	}

	@Override
	protected boolean isLocal(Class<?> clazz) {
		if (StatemachinesPackage.eINSTANCE.getEClassifiers().stream().map(c -> c.getInstanceClass())
				.anyMatch(c -> Arrays.asList(clazz.getInterfaces()).contains(c))) {
			return true;
		}
		return super.isLocal(clazz);
	}

	static public class OnStart extends SubtypingRuleSubscriber {
		@Override
		public String getStatement() {
			return "select * from EPLEventOccurrence(event.name='start')";
		}

		public void update(Object eventOccurrence) {
			final Map<String, Object> parameters = new HashMap<>();
			final StateMachine stateMachine = Streams.stream(executedResource.getAllContents())
					.filter(o -> o instanceof StateMachine)
					.findFirst().map(fsm -> (StateMachine) fsm).orElse(null);
			if (stateMachine != null) {
				parameters.put("state_machine", stateMachine);
				consumeEventOccurrence(createAcceptedEventOccurrence("run", parameters));
			}
		}
	}

	static public class OnButtonPushed extends SubtypingRuleSubscriber {
		@Override
		public String getStatement() {
			return "select args('button_id') from EPLEventOccurrence(event.name='button_pushed')";
		}

		public void update(Object buttonId) {
			final StateMachine stateMachine = Streams.stream(executedResource.getAllContents())
					.filter(o -> o instanceof StateMachine)
					.findFirst().map(fsm -> (StateMachine) fsm).orElse(null);
			final Signal signal = Streams.stream(executedResource.getAllContents())
					.filter(o -> o instanceof Signal)
					.filter(s -> ((Signal) s).getName().equals("button_pushed"))
					.findFirst().map(s -> (Signal) s).orElse(null);
			final StringAttribute attribute = signal.getAttributes().stream()
					.filter(a -> a.getName().equals("button_id"))
					.filter(a -> a instanceof StringAttribute)
					.findFirst().map(a -> (StringAttribute) a).orElse(null);
			if (stateMachine != null && signal != null && attribute != null) {
				final Map<String, Object> parameters = new HashMap<>();
				final SignalEventOccurrence signalOccurrence = StatemachinesFactory.eINSTANCE.createSignalEventOccurrence();
				final StringAttributeValue attributeValue = StatemachinesFactory.eINSTANCE.createStringAttributeValue();
				attributeValue.setAttribute(attribute);
				attributeValue.setValue("" + buttonId);
				signalOccurrence.getAttributeValues().add(attributeValue);
				signalOccurrence.setSignal(signal);
				parameters.put("state_machine", stateMachine);
				parameters.put("signal_occurrence", signalOccurrence);
				consumeEventOccurrence(createAcceptedEventOccurrence("signal_received", parameters));
			}
		}
	}

	static public class OnSignalSent extends SubtypingRuleSubscriber {
		@Override
		public String getStatement() {
			return "select args('signal_occurrence') from " +
					"EPLEventOccurrence(event.name='signal_sent', " +
					"args('signal_occurrence').signal?.name?='light_on' or "+
					"args('signal_occurrence').signal?.name?='light_off' or "+
					"args('signal_occurrence').signal?.name?='light_blinked')";
		}

		public void update(Object object) {
			if (object != null) {
				final SignalEventOccurrence signalOccurrence = (SignalEventOccurrence) object;
				final String signalName = signalOccurrence.getSignal().getName();
				final String lightId = signalOccurrence.getAttributeValues().stream()
						.filter(v -> v instanceof StringAttributeValue)
						.map(v -> (StringAttributeValue) v)
						.filter(v -> v.getAttribute().getName().equals("light_id"))
						.findFirst().map(v -> v.getValue()).orElse("");
				final Map<String, Object> parameters = new HashMap<>();
				parameters.put("light_id", lightId);
				consumeEventOccurrence(createExposedEventOccurrence(signalName, parameters));
			}
		}
	}
}
