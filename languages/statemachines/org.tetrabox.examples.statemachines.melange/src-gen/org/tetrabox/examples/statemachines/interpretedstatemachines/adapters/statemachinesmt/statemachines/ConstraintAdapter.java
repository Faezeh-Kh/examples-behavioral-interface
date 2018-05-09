package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Constraint;

@SuppressWarnings("all")
public class ConstraintAdapter<T, V> extends EObjectAdapter<Constraint<T, V>> implements statemachines.Constraint<T, V> {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public ConstraintAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public V getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final V o) {
    adaptee.setValue(o);
  }
  
  @Override
  public T getAttribute() {
    return adaptee.getAttribute();
  }
  
  @Override
  public void setAttribute(final T o) {
    if (o != null)
    	adaptee.setAttribute(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.ecore.EObjectAdapter) o).getAdaptee());
    else adaptee.setAttribute(null);
  }
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getConstraint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CONSTRAINT__VALUE:
    		return getValue();
    	case statemachines.StatemachinesPackage.CONSTRAINT__ATTRIBUTE:
    		return getAttribute();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CONSTRAINT__VALUE:
    		return getValue() != null;
    	case statemachines.StatemachinesPackage.CONSTRAINT__ATTRIBUTE:
    		return getAttribute() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.CONSTRAINT__VALUE:
    		setValue(
    		(V)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.CONSTRAINT__ATTRIBUTE:
    		setAttribute(
    		(T)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
