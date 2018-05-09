package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue;
import statemachines.IntegerAttribute;

@SuppressWarnings("all")
public class IntegerAttributeValueAdapter extends EObjectAdapter<IntegerAttributeValue> implements statemachines.IntegerAttributeValue {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public IntegerAttributeValueAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Integer getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final Integer o) {
    adaptee.setValue(o);
  }
  
  @Override
  public IntegerAttribute getAttribute() {
    return (IntegerAttribute) adaptersFactory.createAdapter(adaptee.getAttribute(), eResource);
  }
  
  @Override
  public void setAttribute(final IntegerAttribute o) {
    if (o != null)
    	adaptee.setAttribute(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.IntegerAttributeAdapter) o).getAdaptee());
    else adaptee.setAttribute(null);
  }
  
  protected final static Integer VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getIntegerAttributeValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute();
    	case statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute() != null;
    	case statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__ATTRIBUTE:
    		setAttribute(
    		(statemachines.IntegerAttribute)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__VALUE:
    		setValue(
    		(java.lang.Integer)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
