package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation;
import statemachines.Attribute;

@SuppressWarnings("all")
public class OperationAdapter extends EObjectAdapter<Operation> implements statemachines.Operation {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public OperationAdapter() {
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
  
  private EList<Attribute> inParameters_;
  
  @Override
  public EList<Attribute> getInParameters() {
    if (inParameters_ == null)
    	inParameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInParameters(), adaptersFactory, eResource);
    return inParameters_;
  }
  
  private EList<Attribute> outParameters_;
  
  @Override
  public EList<Attribute> getOutParameters() {
    if (outParameters_ == null)
    	outParameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutParameters(), adaptersFactory, eResource);
    return outParameters_;
  }
  
  @Override
  public Attribute getReturn() {
    return (Attribute) adaptersFactory.createAdapter(adaptee.getReturn(), eResource);
  }
  
  @Override
  public void setReturn(final Attribute o) {
    if (o != null)
    	adaptee.setReturn(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.AttributeAdapter) o).getAdaptee());
    else adaptee.setReturn(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getOperation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.OPERATION__NAME:
    		return getName();
    	case statemachines.StatemachinesPackage.OPERATION__IN_PARAMETERS:
    		return getInParameters();
    	case statemachines.StatemachinesPackage.OPERATION__OUT_PARAMETERS:
    		return getOutParameters();
    	case statemachines.StatemachinesPackage.OPERATION__RETURN:
    		return getReturn();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.OPERATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.StatemachinesPackage.OPERATION__IN_PARAMETERS:
    		return getInParameters() != null && !getInParameters().isEmpty();
    	case statemachines.StatemachinesPackage.OPERATION__OUT_PARAMETERS:
    		return getOutParameters() != null && !getOutParameters().isEmpty();
    	case statemachines.StatemachinesPackage.OPERATION__RETURN:
    		return getReturn() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.OPERATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.OPERATION__IN_PARAMETERS:
    		getInParameters().clear();
    		getInParameters().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.OPERATION__OUT_PARAMETERS:
    		getOutParameters().clear();
    		getOutParameters().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.OPERATION__RETURN:
    		setReturn(
    		(statemachines.Attribute)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
