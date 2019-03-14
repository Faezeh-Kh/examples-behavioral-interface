package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Control;

@SuppressWarnings("all")
public class ControlAspectControlAspectContext {
  public final static ControlAspectControlAspectContext INSTANCE = new ControlAspectControlAspectContext();
  
  public static ControlAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Control, ControlAspectControlAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Control, org.gemoc.arduino.sequential.xarduino.aspects.ControlAspectControlAspectProperties>();
  
  public Map<Control, ControlAspectControlAspectProperties> getMap() {
    return map;
  }
}
