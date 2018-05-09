package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType;

@SuppressWarnings("all")
public class CallEventTypeAdapter extends EObjectAdapter<CallEventType> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CallEventType {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public CallEventTypeAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation getOperation() {
    return () adaptersFactory.createAdapter(adaptee.getOperation(), eResource);
  }
  
  @Override
  public void setOperation(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation o) {
    if (o != null)
    	adaptee.setOperation(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationAdapter) o).getAdaptee());
    else adaptee.setOperation(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getCallEventType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_TYPE__OPERATION:
    		return getOperation();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_TYPE__OPERATION:
    		return getOperation() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_TYPE__OPERATION:
    		setOperation(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
