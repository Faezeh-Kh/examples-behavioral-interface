package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.ArrayList;
import java.util.List;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectProperties {
  public final List<CompletionEventOccurrence> completionEvents = new ArrayList<CompletionEventOccurrence>();
  
  public final List<EventOccurrence> deferredEvents = new ArrayList<EventOccurrence>();
  
  public final List<Vertex> activeVertice = new ArrayList<Vertex>();
}
