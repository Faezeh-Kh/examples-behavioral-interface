package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspectSetLedAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.SetLed;

@SuppressWarnings("all")
public class SetLedAspectSetLedAspectContext {
  public final static SetLedAspectSetLedAspectContext INSTANCE = new SetLedAspectSetLedAspectContext();
  
  public static SetLedAspectSetLedAspectProperties getSelf(final SetLed _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspectSetLedAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SetLed, SetLedAspectSetLedAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.SetLed, org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspectSetLedAspectProperties>();
  
  public Map<SetLed, SetLedAspectSetLedAspectProperties> getMap() {
    return map;
  }
}
