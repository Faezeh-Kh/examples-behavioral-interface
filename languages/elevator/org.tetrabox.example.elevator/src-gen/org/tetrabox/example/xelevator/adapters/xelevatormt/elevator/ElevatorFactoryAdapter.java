package org.tetrabox.example.xelevator.adapters.xelevatormt.elevator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory;
import org.tetrabox.example.xelevatormt.elevator.DownButton;
import org.tetrabox.example.xelevatormt.elevator.Elevator;
import org.tetrabox.example.xelevatormt.elevator.ElevatorButton;
import org.tetrabox.example.xelevatormt.elevator.ElevatorFactory;
import org.tetrabox.example.xelevatormt.elevator.ElevatorPackage;
import org.tetrabox.example.xelevatormt.elevator.ElevatorSystem;
import org.tetrabox.example.xelevatormt.elevator.Floor;
import org.tetrabox.example.xelevatormt.elevator.UpButton;

@SuppressWarnings("all")
public class ElevatorFactoryAdapter extends EFactoryImpl implements ElevatorFactory {
  private XElevatorMTAdaptersFactory adaptersFactory = org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance();
  
  private org.tetrabox.example.xelevator.elevator.ElevatorFactory elevatorAdaptee = org.tetrabox.example.xelevator.elevator.ElevatorFactory.eINSTANCE;
  
  @Override
  public Floor createFloor() {
    return adaptersFactory.createFloorAdapter(elevatorAdaptee.createFloor(), null);
  }
  
  @Override
  public Elevator createElevator() {
    return adaptersFactory.createElevatorAdapter(elevatorAdaptee.createElevator(), null);
  }
  
  @Override
  public ElevatorButton createElevatorButton() {
    return adaptersFactory.createElevatorButtonAdapter(elevatorAdaptee.createElevatorButton(), null);
  }
  
  @Override
  public UpButton createUpButton() {
    return adaptersFactory.createUpButtonAdapter(elevatorAdaptee.createUpButton(), null);
  }
  
  @Override
  public DownButton createDownButton() {
    return adaptersFactory.createDownButtonAdapter(elevatorAdaptee.createDownButton(), null);
  }
  
  @Override
  public ElevatorSystem createElevatorSystem() {
    return adaptersFactory.createElevatorSystemAdapter(elevatorAdaptee.createElevatorSystem(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getElevatorPackage();
  }
  
  public ElevatorPackage getElevatorPackage() {
    return org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.eINSTANCE;
  }
}
