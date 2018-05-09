package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior;

@SuppressWarnings("all")
public class OperationBehaviorAspectOperationBehaviorAspectContext {
  public final static OperationBehaviorAspectOperationBehaviorAspectContext INSTANCE = new OperationBehaviorAspectOperationBehaviorAspectContext();
  
  public static OperationBehaviorAspectOperationBehaviorAspectProperties getSelf(final OperationBehavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OperationBehavior, OperationBehaviorAspectOperationBehaviorAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspectOperationBehaviorAspectProperties>();
  
  public Map<OperationBehavior, OperationBehaviorAspectOperationBehaviorAspectProperties> getMap() {
    return map;
  }
}
