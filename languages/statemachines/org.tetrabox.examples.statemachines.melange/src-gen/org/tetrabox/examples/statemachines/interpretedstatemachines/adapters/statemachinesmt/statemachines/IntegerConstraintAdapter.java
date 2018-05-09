package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerConstraint;

@SuppressWarnings("all")
public class IntegerConstraintAdapter extends EObjectAdapter<IntegerConstraint> implements statemachines.IntegerConstraint {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public IntegerConstraintAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Object getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final Object o) {
    adaptee.setValue(o);
  }
  
  @Override
  public Object getAttribute() {
    return adaptee.getAttribute();
  }
  
  @Override
  public void setAttribute(final Object o) {
    if (o != null)
    	adaptee.setAttribute(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.ecore.EObjectAdapter) o).getAdaptee());
    else adaptee.setAttribute(null);
  }
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getIntegerConstraint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__VALUE:
    		return getValue();
    	case statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__ATTRIBUTE:
    		return getAttribute();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__VALUE:
    		return getValue() != null;
    	case statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__ATTRIBUTE:
    		return getAttribute() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__VALUE:
    		setValue(
    		(java.lang.Integer)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__ATTRIBUTE:
    		setAttribute(
    		(statemachines.IntegerAttribute)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
