package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.IfAspectIfAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.If;

@SuppressWarnings("all")
public class IfAspectIfAspectContext {
  public final static IfAspectIfAspectContext INSTANCE = new IfAspectIfAspectContext();
  
  public static IfAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.IfAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, IfAspectIfAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.If, org.gemoc.arduino.sequential.xarduino.aspects.IfAspectIfAspectProperties>();
  
  public Map<If, IfAspectIfAspectProperties> getMap() {
    return map;
  }
}
