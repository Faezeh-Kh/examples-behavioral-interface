package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.almostuml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Trigger;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.State {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  
  @Override
  public Region getContainer() {
    return (Region) adaptersFactory.createAdapter(adaptee.getContainer(), eResource);
  }
  
  @Override
  public void setContainer(final Region o) {
    if (o != null)
    	adaptee.setContainer(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.almostuml.RegionAdapter) o).getAdaptee());
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
    	adaptee.setEntry(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.almostuml.BehaviorAdapter) o).getAdaptee());
    else adaptee.setEntry(null);
  }
  
  @Override
  public Behavior getDoActivity() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getDoActivity(), eResource);
  }
  
  @Override
  public void setDoActivity(final Behavior o) {
    if (o != null)
    	adaptee.setDoActivity(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.almostuml.BehaviorAdapter) o).getAdaptee());
    else adaptee.setDoActivity(null);
  }
  
  @Override
  public Behavior getExit() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getExit(), eResource);
  }
  
  @Override
  public void setExit(final Behavior o) {
    if (o != null)
    	adaptee.setExit(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.almostuml.BehaviorAdapter) o).getAdaptee());
    else adaptee.setExit(null);
  }
  
  private EList<Trigger> deferrableTriggers_;
  
  @Override
  public EList<Trigger> getDeferrableTriggers() {
    if (deferrableTriggers_ == null)
    	deferrableTriggers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeferrableTriggers(), adaptersFactory, eResource);
    return deferrableTriggers_;
  }
  
  @Override
  public boolean isIsDoActivityCompleted() {
    return org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isDoActivityCompleted(adaptee);
  }
  
  @Override
  public void setIsDoActivityCompleted(final boolean isDoActivityCompleted) {
    org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isDoActivityCompleted(adaptee, isDoActivityCompleted
    );
  }
  
  @Override
  public boolean isIsEntryCompleted() {
    return org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isEntryCompleted(adaptee);
  }
  
  @Override
  public void setIsEntryCompleted(final boolean isEntryCompleted) {
    org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isEntryCompleted(adaptee, isEntryCompleted
    );
  }
  
  @Override
  public boolean isIsExitCompleted() {
    return org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isExitCompleted(adaptee);
  }
  
  @Override
  public void setIsExitCompleted(final boolean isExitCompleted) {
    org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isExitCompleted(adaptee, isExitCompleted
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean IS_ENTRY_COMPLETED_EDEFAULT = false;
  
  protected final static boolean IS_DO_ACTIVITY_COMPLETED_EDEFAULT = false;
  
  protected final static boolean IS_EXIT_COMPLETED_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__NAME:
    		return getName();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__CONTAINER:
    		return getContainer();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__REGIONS:
    		return getRegions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__ENTRY:
    		return getEntry();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__DO_ACTIVITY:
    		return getDoActivity();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__EXIT:
    		return getExit();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS:
    		return getDeferrableTriggers();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_ENTRY_COMPLETED:
    		return isIsEntryCompleted() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_DO_ACTIVITY_COMPLETED:
    		return isIsDoActivityCompleted() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_EXIT_COMPLETED:
    		return isIsExitCompleted() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__CONTAINER:
    		return getContainer() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__REGIONS:
    		return getRegions() != null && !getRegions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__ENTRY:
    		return getEntry() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__DO_ACTIVITY:
    		return getDoActivity() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__EXIT:
    		return getExit() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS:
    		return getDeferrableTriggers() != null && !getDeferrableTriggers().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_ENTRY_COMPLETED:
    		return isIsEntryCompleted() != IS_ENTRY_COMPLETED_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_DO_ACTIVITY_COMPLETED:
    		return isIsDoActivityCompleted() != IS_DO_ACTIVITY_COMPLETED_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_EXIT_COMPLETED:
    		return isIsExitCompleted() != IS_EXIT_COMPLETED_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__CONTAINER:
    		setContainer(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Region)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__REGIONS:
    		getRegions().clear();
    		getRegions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__ENTRY:
    		setEntry(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Behavior)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__DO_ACTIVITY:
    		setDoActivity(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Behavior)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__EXIT:
    		setExit(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Behavior)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__DEFERRABLE_TRIGGERS:
    		getDeferrableTriggers().clear();
    		getDeferrableTriggers().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_ENTRY_COMPLETED:
    		setIsEntryCompleted(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_DO_ACTIVITY_COMPLETED:
    		setIsDoActivityCompleted(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.STATE__IS_EXIT_COMPLETED:
    		setIsExitCompleted(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
