package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachinesexecutiondata;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CustomEvent;

@SuppressWarnings("all")
public class EventOccurrenceAdapter extends EObjectAdapter<EventOccurrence> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.EventOccurrence {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public EventOccurrenceAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public CustomEvent getEvent() {
    return (CustomEvent) adaptersFactory.createAdapter(adaptee.getEvent(), eResource);
  }
  
  @Override
  public void setEvent(final CustomEvent o) {
    if (o != null)
    	adaptee.setEvent(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CustomEventAdapter) o).getAdaptee());
    else adaptee.setEvent(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.StatemachinesexecutiondataPackage.eINSTANCE.getEventOccurrence();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT:
    		return getEvent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT:
    		return getEvent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT:
    		setEvent(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CustomEvent)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
