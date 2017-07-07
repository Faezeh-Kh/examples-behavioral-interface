package org.tetrabox.example.xelevator.adapters.xelevatormt.elevator;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory;
import org.tetrabox.example.xelevator.elevator.Floor;
import org.tetrabox.example.xelevatormt.elevator.Button;

@SuppressWarnings("all")
public class FloorAdapter extends EObjectAdapter<Floor> implements org.tetrabox.example.xelevatormt.elevator.Floor {
  private XElevatorMTAdaptersFactory adaptersFactory;
  
  public FloorAdapter() {
    super(org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getNr() {
    return adaptee.getNr();
  }
  
  @Override
  public org.tetrabox.example.xelevatormt.elevator.Floor getNext() {
    return (org.tetrabox.example.xelevatormt.elevator.Floor) adaptersFactory.createAdapter(adaptee.getNext(), eResource);
  }
  
  @Override
  public void setNext(final org.tetrabox.example.xelevatormt.elevator.Floor o) {
    if (o != null)
    	adaptee.setNext(((org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorAdapter) o).getAdaptee());
    else adaptee.setNext(null);
  }
  
  private EList<Button> floorButtons_;
  
  @Override
  public EList<Button> getFloorButtons() {
    if (floorButtons_ == null)
    	floorButtons_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFloorButtons(), adaptersFactory, eResource);
    return floorButtons_;
  }
  
  @Override
  public org.tetrabox.example.xelevatormt.elevator.Floor getPrevious() {
    return (org.tetrabox.example.xelevatormt.elevator.Floor) adaptersFactory.createAdapter(adaptee.getPrevious(), eResource);
  }
  
  @Override
  public void setPrevious(final org.tetrabox.example.xelevatormt.elevator.Floor o) {
    if (o != null)
    	adaptee.setPrevious(((org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorAdapter) o).getAdaptee());
    else adaptee.setPrevious(null);
  }
  
  @Override
  public boolean hasLowerFloorLitButton() {
    return org.tetrabox.example.xelevator.aspects.FloorAspect.hasLowerFloorLitButton(adaptee);
  }
  
  @Override
  public boolean hasUpperFloorLitButton() {
    return org.tetrabox.example.xelevator.aspects.FloorAspect.hasUpperFloorLitButton(adaptee);
  }
  
  protected final static int NR_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.eINSTANCE.getFloor();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__NEXT:
    		return getNext();
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__NR:
    		return new java.lang.Integer(getNr());
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__FLOOR_BUTTONS:
    		return getFloorButtons();
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__PREVIOUS:
    		return getPrevious();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__NEXT:
    		return getNext() != null;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__NR:
    		return getNr() != NR_EDEFAULT;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__FLOOR_BUTTONS:
    		return getFloorButtons() != null && !getFloorButtons().isEmpty();
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__PREVIOUS:
    		return getPrevious() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__NEXT:
    		setNext(
    		(org.tetrabox.example.xelevatormt.elevator.Floor)
    		 newValue);
    		return;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__FLOOR_BUTTONS:
    		getFloorButtons().clear();
    		getFloorButtons().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.FLOOR__PREVIOUS:
    		setPrevious(
    		(org.tetrabox.example.xelevatormt.elevator.Floor)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
