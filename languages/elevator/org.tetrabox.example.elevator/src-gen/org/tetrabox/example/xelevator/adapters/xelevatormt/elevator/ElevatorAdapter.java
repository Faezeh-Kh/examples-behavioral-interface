package org.tetrabox.example.xelevator.adapters.xelevatormt.elevator;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory;
import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevatormt.elevator.ElevatorButton;
import org.tetrabox.example.xelevatormt.elevator.Floor;

@SuppressWarnings("all")
public class ElevatorAdapter extends EObjectAdapter<Elevator> implements org.tetrabox.example.xelevatormt.elevator.Elevator {
  private XElevatorMTAdaptersFactory adaptersFactory;
  
  public ElevatorAdapter() {
    super(org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance();
  }
  
  private EList<ElevatorButton> elevatorButtons_;
  
  @Override
  public EList<ElevatorButton> getElevatorButtons() {
    if (elevatorButtons_ == null)
    	elevatorButtons_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getElevatorButtons(), adaptersFactory, eResource);
    return elevatorButtons_;
  }
  
  @Override
  public void changeToDown() {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.changeToDown(adaptee);
  }
  
  @Override
  public void changeToUp() {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.changeToUp(adaptee);
  }
  
  @Override
  public void closeDoor() {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.closeDoor(adaptee);
  }
  
  @Override
  public Floor getCurrentFloor() {
    return (Floor) adaptersFactory.createAdapter(org.tetrabox.example.xelevator.aspects.ElevatorAspect.currentFloor(adaptee), eResource);
  }
  
  @Override
  public void setCurrentFloor(final Floor currentFloor) {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.currentFloor(adaptee, (org.tetrabox.example.xelevator.elevator.Floor)((EObjectAdapter)currentFloor).getAdaptee()
    );
  }
  
  @Override
  public boolean isDoorsOpen() {
    return org.tetrabox.example.xelevator.aspects.ElevatorAspect.doorsOpen(adaptee);
  }
  
  @Override
  public void setDoorsOpen(final boolean doorsOpen) {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.doorsOpen(adaptee, doorsOpen
    );
  }
  
  @Override
  public boolean isGoingUp() {
    return org.tetrabox.example.xelevator.aspects.ElevatorAspect.goingUp(adaptee);
  }
  
  @Override
  public void setGoingUp(final boolean goingUp) {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.goingUp(adaptee, goingUp
    );
  }
  
  @Override
  public void moveDown() {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.moveDown(adaptee);
  }
  
  @Override
  public void moveUp() {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.moveUp(adaptee);
  }
  
  @Override
  public void openDoorDown() {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.openDoorDown(adaptee);
  }
  
  @Override
  public void openDoorUp() {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.openDoorUp(adaptee);
  }
  
  @Override
  public void run() {
    org.tetrabox.example.xelevator.aspects.ElevatorAspect.run(adaptee);
  }
  
  protected final static boolean DOORS_OPEN_EDEFAULT = false;
  
  protected final static boolean GOING_UP_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.eINSTANCE.getElevator();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS:
    		return getElevatorButtons();
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__DOORS_OPEN:
    		return isDoorsOpen() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__GOING_UP:
    		return isGoingUp() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__CURRENT_FLOOR:
    		return getCurrentFloor();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS:
    		return getElevatorButtons() != null && !getElevatorButtons().isEmpty();
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__DOORS_OPEN:
    		return isDoorsOpen() != DOORS_OPEN_EDEFAULT;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__GOING_UP:
    		return isGoingUp() != GOING_UP_EDEFAULT;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__CURRENT_FLOOR:
    		return getCurrentFloor() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__ELEVATOR_BUTTONS:
    		getElevatorButtons().clear();
    		getElevatorButtons().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__DOORS_OPEN:
    		setDoorsOpen(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__GOING_UP:
    		setGoingUp(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR__CURRENT_FLOOR:
    		setCurrentFloor(
    		(org.tetrabox.example.xelevatormt.elevator.Floor)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
