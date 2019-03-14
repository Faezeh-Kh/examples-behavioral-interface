package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.PseudostateKind;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.State;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition;

@SuppressWarnings("all")
public class PseudostateAdapter extends EObjectAdapter<Pseudostate> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Pseudostate {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public PseudostateAdapter() {
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
  public PseudostateKind getKind() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.PseudostateKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final PseudostateKind o) {
    adaptee.setKind(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.PseudostateKind.get(o.getValue()));
  }
  
  @Override
  public Region getContainer() {
    return (Region) adaptersFactory.createAdapter(adaptee.getContainer(), eResource);
  }
  
  @Override
  public void setContainer(final Region o) {
    if (o != null)
    	adaptee.setContainer(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.RegionAdapter) o).getAdaptee());
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
  
  @Override
  public State getState() {
    return (State) adaptersFactory.createAdapter(adaptee.getState(), eResource);
  }
  
  @Override
  public void setState(final State o) {
    if (o != null)
    	adaptee.setState(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateAdapter) o).getAdaptee());
    else adaptee.setState(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static PseudostateKind KIND_EDEFAULT = org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.PseudostateKind.INITIAL;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getPseudostate();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__NAME:
    		return getName();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__CONTAINER:
    		return getContainer();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__KIND:
    		return getKind();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__STATE:
    		return getState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__CONTAINER:
    		return getContainer() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__STATE:
    		return getState() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__CONTAINER:
    		setContainer(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__KIND:
    		setKind(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.PseudostateKind)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.PSEUDOSTATE__STATE:
    		setState(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
