package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation;

@SuppressWarnings("all")
public class OperationAdapter extends EObjectAdapter<Operation> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public OperationAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Attribute> */Object inParameters_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Attribute> */Object getInParameters() {
    if (inParameters_ == null)
    	inParameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInParameters(), adaptersFactory, eResource);
    return inParameters_;
  }
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Attribute> */Object outParameters_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Attribute> */Object getOutParameters() {
    if (outParameters_ == null)
    	outParameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutParameters(), adaptersFactory, eResource);
    return outParameters_;
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Attribute getReturn() {
    return () adaptersFactory.createAdapter(adaptee.getReturn(), eResource);
  }
  
  @Override
  public void setReturn(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Attribute o) {
    if (o != null)
    	adaptee.setReturn(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeAdapter) o).getAdaptee());
    else adaptee.setReturn(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getOperation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__NAME:
    		return getName();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__IN_PARAMETERS:
    		return getInParameters();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__OUT_PARAMETERS:
    		return getOutParameters();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__RETURN:
    		return getReturn();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__IN_PARAMETERS:
    		return getInParameters() != null && !getInParameters().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__OUT_PARAMETERS:
    		return getOutParameters() != null && !getOutParameters().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__RETURN:
    		return getReturn() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__IN_PARAMETERS:
    		getInParameters().clear();
    		getInParameters().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__OUT_PARAMETERS:
    		getOutParameters().clear();
    		getOutParameters().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.OPERATION__RETURN:
    		setReturn(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Attribute)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
