package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence;
import statemachines.State;

@SuppressWarnings("all")
public class CompletionEventOccurrenceAdapter extends EObjectAdapter<CompletionEventOccurrence> implements statemachines.CompletionEventOccurrence {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public CompletionEventOccurrenceAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public State getState() {
    return (State) adaptersFactory.createAdapter(adaptee.getState(), eResource);
  }
  
  @Override
  public void setState(final State o) {
    if (o != null)
    	adaptee.setState(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.StateAdapter) o).getAdaptee());
    else adaptee.setState(null);
  }
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getCompletionEventOccurrence();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.COMPLETION_EVENT_OCCURRENCE__STATE:
    		return getState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.COMPLETION_EVENT_OCCURRENCE__STATE:
    		return getState() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.COMPLETION_EVENT_OCCURRENCE__STATE:
    		setState(
    		(statemachines.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
