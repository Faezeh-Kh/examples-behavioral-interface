package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior;
import statemachines.SignalEventOccurrence;

@SuppressWarnings("all")
public class BehaviorAdapter extends EObjectAdapter<Behavior> implements statemachines.Behavior {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public BehaviorAdapter() {
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
  
  private EList<SignalEventOccurrence> emittedSignals_;
  
  @Override
  public EList<SignalEventOccurrence> getEmittedSignals() {
    if (emittedSignals_ == null)
    	emittedSignals_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEmittedSignals(), adaptersFactory, eResource);
    return emittedSignals_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.BEHAVIOR__NAME:
    		return getName();
    	case statemachines.StatemachinesPackage.BEHAVIOR__EMITTED_SIGNALS:
    		return getEmittedSignals();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.BEHAVIOR__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.StatemachinesPackage.BEHAVIOR__EMITTED_SIGNALS:
    		return getEmittedSignals() != null && !getEmittedSignals().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.BEHAVIOR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.BEHAVIOR__EMITTED_SIGNALS:
    		getEmittedSignals().clear();
    		getEmittedSignals().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
