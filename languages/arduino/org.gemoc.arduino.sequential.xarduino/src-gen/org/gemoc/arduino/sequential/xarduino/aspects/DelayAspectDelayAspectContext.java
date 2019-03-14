package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.DelayAspectDelayAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Delay;

@SuppressWarnings("all")
public class DelayAspectDelayAspectContext {
  public final static DelayAspectDelayAspectContext INSTANCE = new DelayAspectDelayAspectContext();
  
  public static DelayAspectDelayAspectProperties getSelf(final Delay _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.DelayAspectDelayAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Delay, DelayAspectDelayAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Delay, org.gemoc.arduino.sequential.xarduino.aspects.DelayAspectDelayAspectProperties>();
  
  public Map<Delay, DelayAspectDelayAspectProperties> getMap() {
    return map;
  }
}
