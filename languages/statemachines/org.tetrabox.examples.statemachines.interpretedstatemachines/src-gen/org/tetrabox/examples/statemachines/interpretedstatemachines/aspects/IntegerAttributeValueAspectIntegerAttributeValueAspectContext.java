package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue;

@SuppressWarnings("all")
public class IntegerAttributeValueAspectIntegerAttributeValueAspectContext {
  public final static IntegerAttributeValueAspectIntegerAttributeValueAspectContext INSTANCE = new IntegerAttributeValueAspectIntegerAttributeValueAspectContext();
  
  public static IntegerAttributeValueAspectIntegerAttributeValueAspectProperties getSelf(final IntegerAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerAttributeValue, IntegerAttributeValueAspectIntegerAttributeValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties>();
  
  public Map<IntegerAttributeValue, IntegerAttributeValueAspectIntegerAttributeValueAspectProperties> getMap() {
    return map;
  }
}
