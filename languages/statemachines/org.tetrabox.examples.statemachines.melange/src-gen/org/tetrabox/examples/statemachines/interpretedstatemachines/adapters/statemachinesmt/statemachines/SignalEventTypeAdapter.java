package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType;
import statemachines.Signal;

@SuppressWarnings("all")
public class SignalEventTypeAdapter extends EObjectAdapter<SignalEventType> implements statemachines.SignalEventType {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public SignalEventTypeAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Signal getSignal() {
    return (Signal) adaptersFactory.createAdapter(adaptee.getSignal(), eResource);
  }
  
  @Override
  public void setSignal(final Signal o) {
    if (o != null)
    	adaptee.setSignal(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.SignalAdapter) o).getAdaptee());
    else adaptee.setSignal(null);
  }
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getSignalEventType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.SIGNAL_EVENT_TYPE__SIGNAL:
    		return getSignal();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.SIGNAL_EVENT_TYPE__SIGNAL:
    		return getSignal() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.SIGNAL_EVENT_TYPE__SIGNAL:
    		setSignal(
    		(statemachines.Signal)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
