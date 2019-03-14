package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.WhileAspectWhileAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.While;

@SuppressWarnings("all")
public class WhileAspectWhileAspectContext {
  public final static WhileAspectWhileAspectContext INSTANCE = new WhileAspectWhileAspectContext();
  
  public static WhileAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.WhileAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, WhileAspectWhileAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.While, org.gemoc.arduino.sequential.xarduino.aspects.WhileAspectWhileAspectProperties>();
  
  public Map<While, WhileAspectWhileAspectProperties> getMap() {
    return map;
  }
}
