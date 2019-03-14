package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Signal;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StateMachine;

@SuppressWarnings("all")
public class CustomSystemAdapter extends EObjectAdapter<CustomSystem> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CustomSystem {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public CustomSystemAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public StateMachine getStatemachine() {
    return (StateMachine) adaptersFactory.createAdapter(adaptee.getStatemachine(), eResource);
  }
  
  @Override
  public void setStatemachine(final StateMachine o) {
    if (o != null)
    	adaptee.setStatemachine(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateMachineAdapter) o).getAdaptee());
    else adaptee.setStatemachine(null);
  }
  
  private EList<Signal> signals_;
  
  @Override
  public EList<Signal> getSignals() {
    if (signals_ == null)
    	signals_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSignals(), adaptersFactory, eResource);
    return signals_;
  }
  
  private EList<Operation> operations_;
  
  @Override
  public EList<Operation> getOperations() {
    if (operations_ == null)
    	operations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOperations(), adaptersFactory, eResource);
    return operations_;
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getCustomSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
    		return getStatemachine();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__SIGNALS:
    		return getSignals();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__OPERATIONS:
    		return getOperations();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
    		return getStatemachine() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__SIGNALS:
    		return getSignals() != null && !getSignals().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__OPERATIONS:
    		return getOperations() != null && !getOperations().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
    		setStatemachine(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StateMachine)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__SIGNALS:
    		getSignals().clear();
    		getSignals().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.CUSTOM_SYSTEM__OPERATIONS:
    		getOperations().clear();
    		getOperations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
