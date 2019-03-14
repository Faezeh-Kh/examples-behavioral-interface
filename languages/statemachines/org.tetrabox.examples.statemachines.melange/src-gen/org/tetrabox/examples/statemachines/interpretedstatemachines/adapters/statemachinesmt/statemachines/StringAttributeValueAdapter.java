package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue;
import statemachines.StringAttribute;

@SuppressWarnings("all")
public class StringAttributeValueAdapter extends EObjectAdapter<StringAttributeValue> implements statemachines.StringAttributeValue {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public StringAttributeValueAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final String o) {
    adaptee.setValue(o);
  }
  
  @Override
  public StringAttribute getAttribute() {
    return (StringAttribute) adaptersFactory.createAdapter(adaptee.getAttribute(), eResource);
  }
  
  @Override
  public void setAttribute(final StringAttribute o) {
    if (o != null)
    	adaptee.setAttribute(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.StringAttributeAdapter) o).getAdaptee());
    else adaptee.setAttribute(null);
  }
  
  protected final static String VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getStringAttributeValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.STRING_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute();
    	case statemachines.StatemachinesPackage.STRING_ATTRIBUTE_VALUE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.STRING_ATTRIBUTE_VALUE__ATTRIBUTE:
    		return getAttribute() != null;
    	case statemachines.StatemachinesPackage.STRING_ATTRIBUTE_VALUE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.STRING_ATTRIBUTE_VALUE__ATTRIBUTE:
    		setAttribute(
    		(statemachines.StringAttribute)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.STRING_ATTRIBUTE_VALUE__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
