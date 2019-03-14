package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.ConstantAspectConstantAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Constant;

@SuppressWarnings("all")
public class ConstantAspectConstantAspectContext {
  public final static ConstantAspectConstantAspectContext INSTANCE = new ConstantAspectConstantAspectContext();
  
  public static ConstantAspectConstantAspectProperties getSelf(final Constant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.ConstantAspectConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constant, ConstantAspectConstantAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Constant, org.gemoc.arduino.sequential.xarduino.aspects.ConstantAspectConstantAspectProperties>();
  
  public Map<Constant, ConstantAspectConstantAspectProperties> getMap() {
    return map;
  }
}
