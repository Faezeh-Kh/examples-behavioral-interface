package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence;

@SuppressWarnings("all")
public class CallEventOccurrenceAspectCallEventOccurrenceAspectContext {
  public final static CallEventOccurrenceAspectCallEventOccurrenceAspectContext INSTANCE = new CallEventOccurrenceAspectCallEventOccurrenceAspectContext();
  
  public static CallEventOccurrenceAspectCallEventOccurrenceAspectProperties getSelf(final CallEventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CallEventOccurrence, CallEventOccurrenceAspectCallEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties>();
  
  public Map<CallEventOccurrence, CallEventOccurrenceAspectCallEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
