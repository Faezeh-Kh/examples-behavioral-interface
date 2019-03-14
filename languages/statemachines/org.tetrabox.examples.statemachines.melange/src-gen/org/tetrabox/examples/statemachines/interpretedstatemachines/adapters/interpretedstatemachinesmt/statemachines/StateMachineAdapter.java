package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region;

@SuppressWarnings("all")
public class StateMachineAdapter extends EObjectAdapter<StateMachine> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StateMachine {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public StateMachineAdapter() {
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
  
  private EList<Region> regions_;
  
  @Override
  public EList<Region> getRegions() {
    if (regions_ == null)
    	regions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRegions(), adaptersFactory, eResource);
    return regions_;
  }
  
  @Override
  public void eventOccurrenceReceived(final EventOccurrence event) {
    org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect.eventOccurrenceReceived(adaptee, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence)((EObjectAdapter)event).getAdaptee()
    );
  }
  
  @Override
  public void run() {
    org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect.run(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getStateMachine();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.STATE_MACHINE__NAME:
    		return getName();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.STATE_MACHINE__REGIONS:
    		return getRegions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.STATE_MACHINE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.STATE_MACHINE__REGIONS:
    		return getRegions() != null && !getRegions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.STATE_MACHINE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.STATE_MACHINE__REGIONS:
    		getRegions().clear();
    		getRegions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
