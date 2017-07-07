package org.tetrabox.example.xelevator.aspects;

import org.tetrabox.example.xelevator.elevator.Elevator;
import java.util.Map;
import org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties;

@SuppressWarnings("all")
public class ElevatorAspectElevatorAspectContext {
  public final static ElevatorAspectElevatorAspectContext INSTANCE = new ElevatorAspectElevatorAspectContext();
  
  public static ElevatorAspectElevatorAspectProperties getSelf(final Elevator _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Elevator, ElevatorAspectElevatorAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.xelevator.elevator.Elevator, org.tetrabox.example.xelevator.aspects.ElevatorAspectElevatorAspectProperties>();
  
  public Map<Elevator, ElevatorAspectElevatorAspectProperties> getMap() {
    return map;
  }
}
