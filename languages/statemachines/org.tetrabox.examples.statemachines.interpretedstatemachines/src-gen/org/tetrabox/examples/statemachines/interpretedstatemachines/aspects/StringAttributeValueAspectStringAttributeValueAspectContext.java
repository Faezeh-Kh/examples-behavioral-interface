package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import java.util.Map;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue;

@SuppressWarnings("all")
public class StringAttributeValueAspectStringAttributeValueAspectContext {
  public final static StringAttributeValueAspectStringAttributeValueAspectContext INSTANCE = new StringAttributeValueAspectStringAttributeValueAspectContext();
  
  public static StringAttributeValueAspectStringAttributeValueAspectProperties getSelf(final StringAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringAttributeValue, StringAttributeValueAspectStringAttributeValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue, org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StringAttributeValueAspectStringAttributeValueAspectProperties>();
  
  public Map<StringAttributeValue, StringAttributeValueAspectStringAttributeValueAspectProperties> getMap() {
    return map;
  }
}
