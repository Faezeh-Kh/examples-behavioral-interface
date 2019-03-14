package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;

@SuppressWarnings("all")
public class SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext {
  public final static SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext INSTANCE = new SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext();
  
  public static SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties getSelf(final SignalEventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SignalEventOccurrence, SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties>();
  
  public Map<SignalEventOccurrence, SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
