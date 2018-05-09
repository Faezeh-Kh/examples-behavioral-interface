package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType;
import statemachines.Operation;

@SuppressWarnings("all")
public class CallEventTypeAdapter extends EObjectAdapter<CallEventType> implements statemachines.CallEventType {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public CallEventTypeAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Operation getOperation() {
    return (Operation) adaptersFactory.createAdapter(adaptee.getOperation(), eResource);
  }
  
  @Override
  public void setOperation(final Operation o) {
    if (o != null)
    	adaptee.setOperation(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.OperationAdapter) o).getAdaptee());
    else adaptee.setOperation(null);
  }
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getCallEventType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CALL_EVENT_TYPE__OPERATION:
    		return getOperation();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CALL_EVENT_TYPE__OPERATION:
    		return getOperation() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CALL_EVENT_TYPE__OPERATION:
    		setOperation(
    		(statemachines.Operation)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
