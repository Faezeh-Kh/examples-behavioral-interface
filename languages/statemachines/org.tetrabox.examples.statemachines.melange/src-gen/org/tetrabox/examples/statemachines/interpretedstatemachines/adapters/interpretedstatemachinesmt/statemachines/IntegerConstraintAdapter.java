package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerConstraint;

@SuppressWarnings("all")
public class IntegerConstraintAdapter extends EObjectAdapter<IntegerConstraint> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerConstraint {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public IntegerConstraintAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
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
    	adaptee.setAttribute(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.ecore.EObjectAdapter) o).getAdaptee());
    else adaptee.setAttribute(null);
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getIntegerConstraint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__VALUE:
    		return getValue();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__ATTRIBUTE:
    		return getAttribute();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__VALUE:
    		return getValue() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__ATTRIBUTE:
    		return getAttribute() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__VALUE:
    		setValue(
    		(java.lang.Integer)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.INTEGER_CONSTRAINT__ATTRIBUTE:
    		setAttribute(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerAttribute)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
