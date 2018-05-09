package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue;

@SuppressWarnings("all")
public class BooleanAttributeValueAdapter extends EObjectAdapter<BooleanAttributeValue> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanAttributeValue {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public BooleanAttributeValueAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Boolean getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final Boolean o) {
    adaptee.setValue(o);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanAttribute getAttribute() {
    return () adaptersFactory.createAdapter(adaptee.getAttribute(), eResource);
  }
  
  @Override
  public void setAttribute(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanAttribute o) {
    if (o != null)
    	adaptee.setAttribute(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeAdapter) o).getAdaptee());
    else adaptee.setAttribute(null);
  }
  
  protected final static Boolean VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getBooleanAttributeValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__ATTRIBUTE:
    		setAttribute(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanAttribute)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__VALUE:
    		setValue(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
