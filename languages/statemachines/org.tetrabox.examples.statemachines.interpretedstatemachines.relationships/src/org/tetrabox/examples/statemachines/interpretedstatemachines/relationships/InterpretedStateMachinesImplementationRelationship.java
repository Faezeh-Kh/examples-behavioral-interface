package org.tetrabox.examples.statemachines.interpretedstatemachines.relationships;


import static org.eclipse.gemoc.executionframework.event.manager.IImplementationRelationship.loadBehavioralInterface;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.gemoc.executionframework.event.manager.SimpleImplementationRelationship;
import org.eclipse.gemoc.xdsmlframework.behavioralinterface.behavioralInterface.BehavioralInterface;
import org.eclipse.gemoc.xdsmlframework.behavioralinterface.behavioralInterface.Event;

public class InterpretedStateMachinesImplementationRelationship extends SimpleImplementationRelationship {

	private static Set<String> computeRunToCompletionMap(List<Event> events) {
		final Set<String> result = new HashSet<>();
		events.stream().filter(e -> e.getName().equals("call_eventOccurrenceReceived")).findFirst()
				.ifPresent(e -> result.add(e.eResource().getURIFragment(e)));
		events.stream().filter(e -> e.getName().equals("call_run")).findFirst()
				.ifPresent(e -> result.add(e.eResource().getURIFragment(e)));
		return result;
	}

	public InterpretedStateMachinesImplementationRelationship() {
		this(loadBehavioralInterface(
				"platform:/plugin/org.tetrabox.examples.statemachines.interpretedstatemachines/model/InterpretedStateMachines.bi"));
	}

	public InterpretedStateMachinesImplementationRelationship(BehavioralInterface behavioralInterface) {
		super(behavioralInterface, computeRunToCompletionMap(behavioralInterface.getEvents()));
	}
}
