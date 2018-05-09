package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspectEventOccurrenceAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;

@SuppressWarnings("all")
public class EventOccurrenceAspectEventOccurrenceAspectContext {
  public final static EventOccurrenceAspectEventOccurrenceAspectContext INSTANCE = new EventOccurrenceAspectEventOccurrenceAspectContext();
  
  public static EventOccurrenceAspectEventOccurrenceAspectProperties getSelf(final EventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspectEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EventOccurrence, EventOccurrenceAspectEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspectEventOccurrenceAspectProperties>();
  
  public Map<EventOccurrence, EventOccurrenceAspectEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
