package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal;
import statemachines.Attribute;

@SuppressWarnings("all")
public class SignalAdapter extends EObjectAdapter<Signal> implements statemachines.Signal {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public SignalAdapter() {
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
  
  private EList<Attribute> attributes_;
  
  @Override
  public EList<Attribute> getAttributes() {
    if (attributes_ == null)
    	attributes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAttributes(), adaptersFactory, eResource);
    return attributes_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getSignal();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.SIGNAL__NAME:
    		return getName();
    	case statemachines.StatemachinesPackage.SIGNAL__ATTRIBUTES:
    		return getAttributes();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.SIGNAL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.StatemachinesPackage.SIGNAL__ATTRIBUTES:
    		return getAttributes() != null && !getAttributes().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.SIGNAL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.SIGNAL__ATTRIBUTES:
    		getAttributes().clear();
    		getAttributes().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
