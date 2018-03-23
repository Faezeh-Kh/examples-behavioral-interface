package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState;
import statemachines.almostuml.Behavior;
import statemachines.almostuml.Region;
import statemachines.almostuml.Transition;
import statemachines.almostuml.Trigger;

@SuppressWarnings("all")
public class FinalStateAdapter extends EObjectAdapter<FinalState> implements statemachines.almostuml.FinalState {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public FinalStateAdapter() {
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
  
  @Override
  public Region getContainer() {
    return (Region) adaptersFactory.createAdapter(adaptee.getContainer(), eResource);
  }
  
  @Override
  public void setContainer(final Region o) {
    if (o != null)
    	adaptee.setContainer(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.RegionAdapter) o).getAdaptee());
    else adaptee.setContainer(null);
  }
  
  private EList<Transition> outgoingTransitions_;
  
  @Override
  public EList<Transition> getOutgoingTransitions() {
    if (outgoingTransitions_ == null)
    	outgoingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransitions(), adaptersFactory, eResource);
    return outgoingTransitions_;
  }
  
  private EList<Transition> incomingTransitions_;
  
  @Override
  public EList<Transition> getIncomingTransitions() {
    if (incomingTransitions_ == null)
    	incomingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransitions(), adaptersFactory, eResource);
    return incomingTransitions_;
  }
  
  private EList<Region> regions_;
  
  @Override
  public EList<Region> getRegions() {
    if (regions_ == null)
    	regions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRegions(), adaptersFactory, eResource);
    return regions_;
  }
  
  @Override
  public Behavior getEntry() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getEntry(), eResource);
  }
  
  @Override
  public void setEntry(final Behavior o) {
    if (o != null)
    	adaptee.setEntry(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.BehaviorAdapter) o).getAdaptee());
    else adaptee.setEntry(null);
  }
  
  @Override
  public Behavior getDoActivity() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getDoActivity(), eResource);
  }
  
  @Override
  public void setDoActivity(final Behavior o) {
    if (o != null)
    	adaptee.setDoActivity(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.BehaviorAdapter) o).getAdaptee());
    else adaptee.setDoActivity(null);
  }
  
  @Override
  public Behavior getExit() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getExit(), eResource);
  }
  
  @Override
  public void setExit(final Behavior o) {
    if (o != null)
    	adaptee.setExit(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.BehaviorAdapter) o).getAdaptee());
    else adaptee.setExit(null);
  }
  
  private EList<Trigger> deferrableTriggers_;
  
  @Override
  public EList<Trigger> getDeferrableTriggers() {
    if (deferrableTriggers_ == null)
    	deferrableTriggers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeferrableTriggers(), adaptersFactory, eResource);
    return deferrableTriggers_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.almostuml.AlmostumlPackage.eINSTANCE.getFinalState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__NAME:
    		return getName();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__CONTAINER:
    		return getContainer();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__REGIONS:
    		return getRegions();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__ENTRY:
    		return getEntry();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__DO_ACTIVITY:
    		return getDoActivity();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__EXIT:
    		return getExit();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__CONTAINER:
    		return getContainer() != null;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__REGIONS:
    		return getRegions() != null && !getRegions().isEmpty();
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__ENTRY:
    		return getEntry() != null;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__DO_ACTIVITY:
    		return getDoActivity() != null;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__EXIT:
    		return getExit() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__CONTAINER:
    		setContainer(
    		(statemachines.almostuml.Region)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__REGIONS:
    		getRegions().clear();
    		getRegions().addAll((Collection) newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__ENTRY:
    		setEntry(
    		(statemachines.almostuml.Behavior)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__DO_ACTIVITY:
    		setDoActivity(
    		(statemachines.almostuml.Behavior)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.FINAL_STATE__EXIT:
    		setExit(
    		(statemachines.almostuml.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
