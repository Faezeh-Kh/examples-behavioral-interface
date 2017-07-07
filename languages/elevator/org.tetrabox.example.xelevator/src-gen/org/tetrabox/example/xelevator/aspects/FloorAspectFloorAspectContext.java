package org.tetrabox.example.xelevator.aspects;

import org.tetrabox.example.xelevator.elevator.Floor;
import java.util.Map;
import org.tetrabox.example.xelevator.aspects.FloorAspectFloorAspectProperties;

@SuppressWarnings("all")
public class FloorAspectFloorAspectContext {
  public final static FloorAspectFloorAspectContext INSTANCE = new FloorAspectFloorAspectContext();
  
  public static FloorAspectFloorAspectProperties getSelf(final Floor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.xelevator.aspects.FloorAspectFloorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Floor, FloorAspectFloorAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.xelevator.elevator.Floor, org.tetrabox.example.xelevator.aspects.FloorAspectFloorAspectProperties>();
  
  public Map<Floor, FloorAspectFloorAspectProperties> getMap() {
    return map;
  }
}
