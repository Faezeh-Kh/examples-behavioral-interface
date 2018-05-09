package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState;

@SuppressWarnings("all")
public class FinalStateAdapter extends EObjectAdapter<FinalState> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.FinalState {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public FinalStateAdapter() {
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
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region getContainer() {
    return () adaptersFactory.createAdapter(adaptee.getContainer(), eResource);
  }
  
  @Override
  public void setContainer(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region o) {
    if (o != null)
    	adaptee.setContainer(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.RegionAdapter) o).getAdaptee());
    else adaptee.setContainer(null);
  }
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition> */Object outgoingTransitions_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition> */Object getOutgoingTransitions() {
    if (outgoingTransitions_ == null)
    	outgoingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransitions(), adaptersFactory, eResource);
    return outgoingTransitions_;
  }
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition> */Object incomingTransitions_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition> */Object getIncomingTransitions() {
    if (incomingTransitions_ == null)
    	incomingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransitions(), adaptersFactory, eResource);
    return incomingTransitions_;
  }
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region> */Object regions_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region> */Object getRegions() {
    if (regions_ == null)
    	regions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRegions(), adaptersFactory, eResource);
    return regions_;
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior getEntry() {
    return () adaptersFactory.createAdapter(adaptee.getEntry(), eResource);
  }
  
  @Override
  public void setEntry(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior o) {
    if (o != null)
    	adaptee.setEntry(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BehaviorAdapter) o).getAdaptee());
    else adaptee.setEntry(null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior getDoActivity() {
    return () adaptersFactory.createAdapter(adaptee.getDoActivity(), eResource);
  }
  
  @Override
  public void setDoActivity(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior o) {
    if (o != null)
    	adaptee.setDoActivity(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BehaviorAdapter) o).getAdaptee());
    else adaptee.setDoActivity(null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior getExit() {
    return () adaptersFactory.createAdapter(adaptee.getExit(), eResource);
  }
  
  @Override
  public void setExit(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior o) {
    if (o != null)
    	adaptee.setExit(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BehaviorAdapter) o).getAdaptee());
    else adaptee.setExit(null);
  }
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Trigger> */Object deferrableTriggers_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Trigger> */Object getDeferrableTriggers() {
    if (deferrableTriggers_ == null)
    	deferrableTriggers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeferrableTriggers(), adaptersFactory, eResource);
    return deferrableTriggers_;
  }
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Pseudostate> */Object connectionPoint_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Pseudostate> */Object getConnectionPoint() {
    if (connectionPoint_ == null)
    	connectionPoint_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConnectionPoint(), adaptersFactory, eResource);
    return connectionPoint_;
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
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getFinalState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__NAME:
    		return getName();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__CONTAINER:
    		return getContainer();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__REGIONS:
    		return getRegions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__ENTRY:
    		return getEntry();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__DO_ACTIVITY:
    		return getDoActivity();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__EXIT:
    		return getExit();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__DEFERRABLE_TRIGGERS:
    		return getDeferrableTriggers();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__CONNECTION_POINT:
    		return getConnectionPoint();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_ENTRY_COMPLETED:
    		return isIsEntryCompleted() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_DO_ACTIVITY_COMPLETED:
    		return isIsDoActivityCompleted() ? Boolean.TRUE : Boolean.FALSE;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_EXIT_COMPLETED:
    		return isIsExitCompleted() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__CONTAINER:
    		return getContainer() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__REGIONS:
    		return getRegions() != null && !getRegions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__ENTRY:
    		return getEntry() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__DO_ACTIVITY:
    		return getDoActivity() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__EXIT:
    		return getExit() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__DEFERRABLE_TRIGGERS:
    		return getDeferrableTriggers() != null && !getDeferrableTriggers().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__CONNECTION_POINT:
    		return getConnectionPoint() != null && !getConnectionPoint().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_ENTRY_COMPLETED:
    		return isIsEntryCompleted() != IS_ENTRY_COMPLETED_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_DO_ACTIVITY_COMPLETED:
    		return isIsDoActivityCompleted() != IS_DO_ACTIVITY_COMPLETED_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_EXIT_COMPLETED:
    		return isIsExitCompleted() != IS_EXIT_COMPLETED_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__CONTAINER:
    		setContainer(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__REGIONS:
    		getRegions().clear();
    		getRegions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__ENTRY:
    		setEntry(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__DO_ACTIVITY:
    		setDoActivity(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__EXIT:
    		setExit(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__DEFERRABLE_TRIGGERS:
    		getDeferrableTriggers().clear();
    		getDeferrableTriggers().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__CONNECTION_POINT:
    		getConnectionPoint().clear();
    		getConnectionPoint().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_ENTRY_COMPLETED:
    		setIsEntryCompleted(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_DO_ACTIVITY_COMPLETED:
    		setIsDoActivityCompleted(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.FINAL_STATE__IS_EXIT_COMPLETED:
    		setIsExitCompleted(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
