package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue;

@SuppressWarnings("all")
public class BooleanAttributeValueAspectBooleanAttributeValueAspectContext {
  public final static BooleanAttributeValueAspectBooleanAttributeValueAspectContext INSTANCE = new BooleanAttributeValueAspectBooleanAttributeValueAspectContext();
  
  public static BooleanAttributeValueAspectBooleanAttributeValueAspectProperties getSelf(final BooleanAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanAttributeValue, BooleanAttributeValueAspectBooleanAttributeValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties>();
  
  public Map<BooleanAttributeValue, BooleanAttributeValueAspectBooleanAttributeValueAspectProperties> getMap() {
    return map;
  }
}
