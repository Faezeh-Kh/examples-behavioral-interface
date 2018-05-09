package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Trigger;
import statemachines.EventType;

@SuppressWarnings("all")
public class TriggerAdapter extends EObjectAdapter<Trigger> implements statemachines.Trigger {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public TriggerAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public EventType getEventType() {
    return (EventType) adaptersFactory.createAdapter(adaptee.getEventType(), eResource);
  }
  
  @Override
  public void setEventType(final EventType o) {
    if (o != null)
    	adaptee.setEventType(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.EventTypeAdapter) o).getAdaptee());
    else adaptee.setEventType(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getTrigger();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.TRIGGER__NAME:
    		return getName();
    	case statemachines.StatemachinesPackage.TRIGGER__EVENT_TYPE:
    		return getEventType();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.TRIGGER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.StatemachinesPackage.TRIGGER__EVENT_TYPE:
    		return getEventType() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.TRIGGER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.TRIGGER__EVENT_TYPE:
    		setEventType(
    		(statemachines.EventType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
