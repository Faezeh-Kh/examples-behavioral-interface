package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspectBehaviorAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior;

@SuppressWarnings("all")
public class BehaviorAspectBehaviorAspectContext {
  public final static BehaviorAspectBehaviorAspectContext INSTANCE = new BehaviorAspectBehaviorAspectContext();
  
  public static BehaviorAspectBehaviorAspectProperties getSelf(final Behavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspectBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Behavior, BehaviorAspectBehaviorAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspectBehaviorAspectProperties>();
  
  public Map<Behavior, BehaviorAspectBehaviorAspectProperties> getMap() {
    return map;
  }
}
