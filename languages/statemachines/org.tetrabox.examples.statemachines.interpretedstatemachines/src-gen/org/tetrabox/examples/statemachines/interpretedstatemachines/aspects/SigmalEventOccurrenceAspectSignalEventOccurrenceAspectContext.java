package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;

@SuppressWarnings("all")
public class SigmalEventOccurrenceAspectSignalEventOccurrenceAspectContext {
  public final static SigmalEventOccurrenceAspectSignalEventOccurrenceAspectContext INSTANCE = new SigmalEventOccurrenceAspectSignalEventOccurrenceAspectContext();
  
  public static SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties getSelf(final SignalEventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SignalEventOccurrence, SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties>();
  
  public Map<SignalEventOccurrence, SigmalEventOccurrenceAspectSignalEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
