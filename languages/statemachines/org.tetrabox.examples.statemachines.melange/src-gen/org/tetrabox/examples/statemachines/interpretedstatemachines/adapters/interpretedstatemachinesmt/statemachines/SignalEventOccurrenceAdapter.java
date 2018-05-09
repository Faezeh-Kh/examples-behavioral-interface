package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;

@SuppressWarnings("all")
public class SignalEventOccurrenceAdapter extends EObjectAdapter<SignalEventOccurrence> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.SignalEventOccurrence {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public SignalEventOccurrenceAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Signal getSignal() {
    return () adaptersFactory.createAdapter(adaptee.getSignal(), eResource);
  }
  
  @Override
  public void setSignal(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Signal o) {
    if (o != null)
    	adaptee.setSignal(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalAdapter) o).getAdaptee());
    else adaptee.setSignal(null);
  }
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.AttributeValue> */Object getAttributeValues() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.SigmalEventOccurrenceAspect.attributeValues(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getSignalEventOccurrence();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_OCCURRENCE__SIGNAL:
    		return getSignal();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_OCCURRENCE__ATTRIBUTE_VALUES:
    		return getAttributeValues();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_OCCURRENCE__SIGNAL:
    		return getSignal() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_OCCURRENCE__ATTRIBUTE_VALUES:
    		return getAttributeValues() != null && !getAttributeValues().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_OCCURRENCE__SIGNAL:
    		setSignal(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Signal)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.SIGNAL_EVENT_OCCURRENCE__ATTRIBUTE_VALUES:
    		getAttributeValues().clear();
    		getAttributeValues().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
