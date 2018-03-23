package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.ArrayList;
import java.util.List;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence;

@SuppressWarnings("all")
public class StateAspectStateAspectProperties {
  public boolean isEntryCompleted;
  
  public boolean isDoActivityCompleted;
  
  public boolean isExitCompleted;
  
  public List<EventOccurrence> deferredEvents = new ArrayList<EventOccurrence>();
}
