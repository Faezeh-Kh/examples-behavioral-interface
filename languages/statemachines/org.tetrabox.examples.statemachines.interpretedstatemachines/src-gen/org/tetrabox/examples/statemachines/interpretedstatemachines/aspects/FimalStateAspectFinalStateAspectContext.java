package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState;

@SuppressWarnings("all")
public class FimalStateAspectFinalStateAspectContext {
  public final static FimalStateAspectFinalStateAspectContext INSTANCE = new FimalStateAspectFinalStateAspectContext();
  
  public static FimalStateAspectFinalStateAspectProperties getSelf(final FinalState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FinalState, FimalStateAspectFinalStateAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectProperties>();
  
  public Map<FinalState, FimalStateAspectFinalStateAspectProperties> getMap() {
    return map;
  }
}
