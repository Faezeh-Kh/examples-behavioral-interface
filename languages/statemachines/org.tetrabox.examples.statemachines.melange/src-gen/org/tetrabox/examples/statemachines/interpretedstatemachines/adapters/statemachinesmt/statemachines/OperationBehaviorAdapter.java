package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior;
import statemachines.AttributeValue;

@SuppressWarnings("all")
public class OperationBehaviorAdapter extends EObjectAdapter<OperationBehavior> implements statemachines.OperationBehavior {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public OperationBehaviorAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<AttributeValue> attributeValues_;
  
  @Override
  public EList<AttributeValue> getAttributeValues() {
    if (attributeValues_ == null)
    	attributeValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAttributeValues(), adaptersFactory, eResource);
    return attributeValues_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getOperationBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.OPERATION_BEHAVIOR__NAME:
    		return getName();
    	case statemachines.StatemachinesPackage.OPERATION_BEHAVIOR__ATTRIBUTE_VALUES:
    		return getAttributeValues();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.OPERATION_BEHAVIOR__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.StatemachinesPackage.OPERATION_BEHAVIOR__ATTRIBUTE_VALUES:
    		return getAttributeValues() != null && !getAttributeValues().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.OPERATION_BEHAVIOR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.OPERATION_BEHAVIOR__ATTRIBUTE_VALUES:
    		getAttributeValues().clear();
    		getAttributeValues().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
