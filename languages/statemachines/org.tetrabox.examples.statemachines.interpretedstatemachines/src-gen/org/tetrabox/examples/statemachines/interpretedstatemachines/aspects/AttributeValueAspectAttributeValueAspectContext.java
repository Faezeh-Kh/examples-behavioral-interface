package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;

@SuppressWarnings("all")
public class AttributeValueAspectAttributeValueAspectContext {
  public final static AttributeValueAspectAttributeValueAspectContext INSTANCE = new AttributeValueAspectAttributeValueAspectContext();
  
  public static AttributeValueAspectAttributeValueAspectProperties getSelf(final AttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AttributeValue, AttributeValueAspectAttributeValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.AttributeValueAspectAttributeValueAspectProperties>();
  
  public Map<AttributeValue, AttributeValueAspectAttributeValueAspectProperties> getMap() {
    return map;
  }
}
