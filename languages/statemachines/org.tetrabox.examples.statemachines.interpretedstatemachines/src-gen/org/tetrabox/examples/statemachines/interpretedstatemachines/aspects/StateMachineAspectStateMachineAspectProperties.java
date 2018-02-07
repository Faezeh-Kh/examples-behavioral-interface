package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.ArrayList;
import java.util.List;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectProperties {
  public final List<CompletionEvent> completionEvents = new ArrayList<CompletionEvent>();
  
  public final List<Vertex> activeVertice = new ArrayList<Vertex>();
}
