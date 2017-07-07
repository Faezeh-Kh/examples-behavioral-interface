package org.tetrabox.example.xelevator.aspects;

import org.tetrabox.example.xelevator.elevator.Button;
import java.util.Map;
import org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectProperties;

@SuppressWarnings("all")
public class ButtonAspectButtonAspectContext {
  public final static ButtonAspectButtonAspectContext INSTANCE = new ButtonAspectButtonAspectContext();
  
  public static ButtonAspectButtonAspectProperties getSelf(final Button _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Button, ButtonAspectButtonAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.xelevator.elevator.Button, org.tetrabox.example.xelevator.aspects.ButtonAspectButtonAspectProperties>();
  
  public Map<Button, ButtonAspectButtonAspectProperties> getMap() {
    return map;
  }
}
