package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspectPushButtonAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.PushButton;

@SuppressWarnings("all")
public class PushButtonAspectPushButtonAspectContext {
  public final static PushButtonAspectPushButtonAspectContext INSTANCE = new PushButtonAspectPushButtonAspectContext();
  
  public static PushButtonAspectPushButtonAspectProperties getSelf(final PushButton _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspectPushButtonAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PushButton, PushButtonAspectPushButtonAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.PushButton, org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspectPushButtonAspectProperties>();
  
  public Map<PushButton, PushButtonAspectPushButtonAspectProperties> getMap() {
    return map;
  }
}
