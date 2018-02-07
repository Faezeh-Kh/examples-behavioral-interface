package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;
import statemachines.almostuml.Region;

@SuppressWarnings("all")
public class StateMachineAdapter extends EObjectAdapter<StateMachine> implements statemachines.almostuml.StateMachine {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public StateMachineAdapter() {
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
  
  private EList<Region> regions_;
  
  @Override
  public EList<Region> getRegions() {
    if (regions_ == null)
    	regions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRegions(), adaptersFactory, eResource);
    return regions_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.almostuml.AlmostumlPackage.eINSTANCE.getStateMachine();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.STATE_MACHINE__NAME:
    		return getName();
    	case statemachines.almostuml.AlmostumlPackage.STATE_MACHINE__REGIONS:
    		return getRegions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.STATE_MACHINE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.almostuml.AlmostumlPackage.STATE_MACHINE__REGIONS:
    		return getRegions() != null && !getRegions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.STATE_MACHINE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.STATE_MACHINE__REGIONS:
    		getRegions().clear();
    		getRegions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
