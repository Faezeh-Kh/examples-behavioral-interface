package org.tetrabox.example.xelevator.aspects;

import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.Floor;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ElevatorAspectElevatorAspectProperties {
  public boolean doorsOpen;
  
  public boolean goingUp;
  
  public Floor currentFloor;
  
  public List<Consumer<Elevator>> commands = CollectionLiterals.<Consumer<Elevator>>newArrayList();
}
