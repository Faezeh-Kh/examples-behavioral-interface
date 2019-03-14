package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Signal;

@SuppressWarnings("all")
public class SignalEventTypeAdapter extends EObjectAdapter<SignalEventType> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.SignalEventType {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public SignalEventTypeAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Signal getSignal() {
    return (Signal) adaptersFactory.createAdapter(adaptee.getSignal(), eResource);
  }
  
  @Override
  public void setSignal(final Signal o) {
    if (o != null)
    	adaptee.setSignal(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalAdapter) o).getAdaptee());
    else adaptee.setSignal(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getSignalEventType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_TYPE__SIGNAL:
    		return getSignal();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_TYPE__SIGNAL:
    		return getSignal() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_TYPE__SIGNAL:
    		setSignal(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Signal)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
