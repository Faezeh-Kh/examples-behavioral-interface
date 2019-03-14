package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation;

@SuppressWarnings("all")
public class CallEventOccurrenceAdapter extends EObjectAdapter<CallEventOccurrence> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CallEventOccurrence {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public CallEventOccurrenceAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Operation getOperation() {
    return (Operation) adaptersFactory.createAdapter(adaptee.getOperation(), eResource);
  }
  
  @Override
  public void setOperation(final Operation o) {
    if (o != null)
    	adaptee.setOperation(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationAdapter) o).getAdaptee());
    else adaptee.setOperation(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getCallEventOccurrence();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__OPERATION:
    		return getOperation();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__IN_PARAMETER_VALUES:
    		return getInParameterValues();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__OUT_PARAMETER_VALUES:
    		return getOutParameterValues();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__RETURN_VALUE:
    		return getReturnValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__OPERATION:
    		return getOperation() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__IN_PARAMETER_VALUES:
    		return getInParameterValues() != null && !getInParameterValues().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__OUT_PARAMETER_VALUES:
    		return getOutParameterValues() != null && !getOutParameterValues().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__RETURN_VALUE:
    		return getReturnValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__OPERATION:
    		setOperation(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__IN_PARAMETER_VALUES:
    		getInParameterValues().clear();
    		getInParameterValues().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__OUT_PARAMETER_VALUES:
    		getOutParameterValues().clear();
    		getOutParameterValues().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CALL_EVENT_OCCURRENCE__RETURN_VALUE:
    		setReturnValue(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.AttributeValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
