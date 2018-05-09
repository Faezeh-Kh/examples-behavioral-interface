package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.ConstraintAspectConstraintAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Constraint;

@SuppressWarnings("all")
public class ConstraintAspectConstraintAspectContext {
  public final static ConstraintAspectConstraintAspectContext INSTANCE = new ConstraintAspectConstraintAspectContext();
  
  public static ConstraintAspectConstraintAspectProperties getSelf(final Constraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.ConstraintAspectConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constraint, ConstraintAspectConstraintAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Constraint, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.ConstraintAspectConstraintAspectProperties>();
  
  public Map<Constraint, ConstraintAspectConstraintAspectProperties> getMap() {
    return map;
  }
}
