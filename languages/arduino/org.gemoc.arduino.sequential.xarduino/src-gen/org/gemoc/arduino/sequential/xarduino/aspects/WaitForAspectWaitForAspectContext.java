package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.WaitFor;

@SuppressWarnings("all")
public class WaitForAspectWaitForAspectContext {
  public final static WaitForAspectWaitForAspectContext INSTANCE = new WaitForAspectWaitForAspectContext();
  
  public static WaitForAspectWaitForAspectProperties getSelf(final WaitFor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<WaitFor, WaitForAspectWaitForAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.WaitFor, org.gemoc.arduino.sequential.xarduino.aspects.WaitForAspectWaitForAspectProperties>();
  
  public Map<WaitFor, WaitForAspectWaitForAspectProperties> getMap() {
    return map;
  }
}
