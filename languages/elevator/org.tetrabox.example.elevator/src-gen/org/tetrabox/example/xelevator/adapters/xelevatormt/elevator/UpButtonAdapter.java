package org.tetrabox.example.xelevator.adapters.xelevatormt.elevator;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory;
import org.tetrabox.example.xelevator.elevator.UpButton;
import org.tetrabox.example.xelevatormt.elevator.Floor;

@SuppressWarnings("all")
public class UpButtonAdapter extends EObjectAdapter<UpButton> implements org.tetrabox.example.xelevatormt.elevator.UpButton {
  private XElevatorMTAdaptersFactory adaptersFactory;
  
  public UpButtonAdapter() {
    super(org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Floor getRequestedFloor() {
    return (Floor) adaptersFactory.createAdapter(adaptee.getRequestedFloor(), eResource);
  }
  
  @Override
  public void setRequestedFloor(final Floor o) {
    if (o != null)
    	adaptee.setRequestedFloor(((org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorAdapter) o).getAdaptee());
    else adaptee.setRequestedFloor(null);
  }
  
  @Override
  public boolean notPressed() {
    return org.tetrabox.example.xelevator.aspects.ButtonAspect.notPressed(adaptee);
  }
  
  @Override
  public void press() {
    org.tetrabox.example.xelevator.aspects.ButtonAspect.press(adaptee);
  }
  
  @Override
  public boolean isPressed() {
    return org.tetrabox.example.xelevator.aspects.ButtonAspect.pressed(adaptee);
  }
  
  @Override
  public void setPressed(final boolean pressed) {
    org.tetrabox.example.xelevator.aspects.ButtonAspect.pressed(adaptee, pressed
    );
  }
  
  protected final static boolean PRESSED_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.eINSTANCE.getUpButton();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.UP_BUTTON__REQUESTED_FLOOR:
    		return getRequestedFloor();
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.UP_BUTTON__PRESSED:
    		return isPressed() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.UP_BUTTON__REQUESTED_FLOOR:
    		return getRequestedFloor() != null;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.UP_BUTTON__PRESSED:
    		return isPressed() != PRESSED_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.UP_BUTTON__REQUESTED_FLOOR:
    		setRequestedFloor(
    		(org.tetrabox.example.xelevatormt.elevator.Floor)
    		 newValue);
    		return;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.UP_BUTTON__PRESSED:
    		setPressed(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
