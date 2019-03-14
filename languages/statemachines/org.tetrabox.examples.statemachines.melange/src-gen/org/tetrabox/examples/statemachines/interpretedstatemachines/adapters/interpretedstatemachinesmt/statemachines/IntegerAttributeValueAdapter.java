package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerAttribute;

@SuppressWarnings("all")
public class IntegerAttributeValueAdapter extends EObjectAdapter<IntegerAttributeValue> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerAttributeValue {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public IntegerAttributeValueAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
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
    	adaptee.setAttribute(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeAdapter) o).getAdaptee());
    else adaptee.setAttribute(null);
  }
  
  protected final static Integer VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getIntegerAttributeValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__ATTRIBUTE:
    		setAttribute(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerAttribute)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_ATTRIBUTE_VALUE__VALUE:
    		setValue(
    		(java.lang.Integer)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
