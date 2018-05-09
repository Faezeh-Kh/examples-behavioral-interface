package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue;
import statemachines.BooleanAttribute;

@SuppressWarnings("all")
public class BooleanAttributeValueAdapter extends EObjectAdapter<BooleanAttributeValue> implements statemachines.BooleanAttributeValue {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public BooleanAttributeValueAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
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
  public BooleanAttribute getAttribute() {
    return (BooleanAttribute) adaptersFactory.createAdapter(adaptee.getAttribute(), eResource);
  }
  
  @Override
  public void setAttribute(final BooleanAttribute o) {
    if (o != null)
    	adaptee.setAttribute(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.BooleanAttributeAdapter) o).getAdaptee());
    else adaptee.setAttribute(null);
  }
  
  protected final static Boolean VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getBooleanAttributeValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute();
    	case statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute() != null;
    	case statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__ATTRIBUTE:
    		setAttribute(
    		(statemachines.BooleanAttribute)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.BOOLEAN_ATTRIBUTE_VALUE__VALUE:
    		setValue(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
