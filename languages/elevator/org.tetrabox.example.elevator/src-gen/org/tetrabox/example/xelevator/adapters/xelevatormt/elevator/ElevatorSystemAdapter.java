package org.tetrabox.example.xelevator.adapters.xelevatormt.elevator;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory;
import org.tetrabox.example.xelevator.elevator.ElevatorSystem;
import org.tetrabox.example.xelevatormt.elevator.Elevator;
import org.tetrabox.example.xelevatormt.elevator.Floor;

@SuppressWarnings("all")
public class ElevatorSystemAdapter extends EObjectAdapter<ElevatorSystem> implements org.tetrabox.example.xelevatormt.elevator.ElevatorSystem {
  private XElevatorMTAdaptersFactory adaptersFactory;
  
  public ElevatorSystemAdapter() {
    super(org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance();
  }
  
  private EList<Elevator> elevators_;
  
  @Override
  public EList<Elevator> getElevators() {
    if (elevators_ == null)
    	elevators_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getElevators(), adaptersFactory, eResource);
    return elevators_;
  }
  
  private EList<Floor> floors_;
  
  @Override
  public EList<Floor> getFloors() {
    if (floors_ == null)
    	floors_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFloors(), adaptersFactory, eResource);
    return floors_;
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.eINSTANCE.getElevatorSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR_SYSTEM__ELEVATORS:
    		return getElevators();
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR_SYSTEM__FLOORS:
    		return getFloors();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR_SYSTEM__ELEVATORS:
    		return getElevators() != null && !getElevators().isEmpty();
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR_SYSTEM__FLOORS:
    		return getFloors() != null && !getFloors().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR_SYSTEM__ELEVATORS:
    		getElevators().clear();
    		getElevators().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.example.xelevatormt.elevator.ElevatorPackage.ELEVATOR_SYSTEM__FLOORS:
    		getFloors().clear();
    		getFloors().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
