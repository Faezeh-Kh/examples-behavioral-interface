package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem;
import statemachines.CustomEvent;
import statemachines.almostuml.StateMachine;

@SuppressWarnings("all")
public class CustomSystemAdapter extends EObjectAdapter<CustomSystem> implements statemachines.CustomSystem {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public CustomSystemAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public StateMachine getStatemachine() {
    return (StateMachine) adaptersFactory.createAdapter(adaptee.getStatemachine(), eResource);
  }
  
  @Override
  public void setStatemachine(final StateMachine o) {
    if (o != null)
    	adaptee.setStatemachine(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateMachineAdapter) o).getAdaptee());
    else adaptee.setStatemachine(null);
  }
  
  private EList<CustomEvent> events_;
  
  @Override
  public EList<CustomEvent> getEvents() {
    if (events_ == null)
    	events_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEvents(), adaptersFactory, eResource);
    return events_;
  }
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getCustomSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
    		return getStatemachine();
    	case statemachines.StatemachinesPackage.CUSTOM_SYSTEM__EVENTS:
    		return getEvents();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
    		return getStatemachine() != null;
    	case statemachines.StatemachinesPackage.CUSTOM_SYSTEM__EVENTS:
    		return getEvents() != null && !getEvents().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
    		setStatemachine(
    		(statemachines.almostuml.StateMachine)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.CUSTOM_SYSTEM__EVENTS:
    		getEvents().clear();
    		getEvents().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
