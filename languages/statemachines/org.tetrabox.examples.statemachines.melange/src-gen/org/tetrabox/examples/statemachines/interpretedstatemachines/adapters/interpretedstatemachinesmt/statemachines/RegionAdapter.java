package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region;

@SuppressWarnings("all")
public class RegionAdapter extends EObjectAdapter<Region> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public RegionAdapter() {
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
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex> */Object vertice_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex> */Object getVertice() {
    if (vertice_ == null)
    	vertice_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVertice(), adaptersFactory, eResource);
    return vertice_;
  }
  
  private /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition> */Object transitions_;
  
  @Override
  public /* EList<org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition> */Object getTransitions() {
    if (transitions_ == null)
    	transitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransitions(), adaptersFactory, eResource);
    return transitions_;
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StateMachine getStateMachine() {
    return () adaptersFactory.createAdapter(adaptee.getStateMachine(), eResource);
  }
  
  @Override
  public void setStateMachine(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StateMachine o) {
    if (o != null)
    	adaptee.setStateMachine(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateMachineAdapter) o).getAdaptee());
    else adaptee.setStateMachine(null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.State getState() {
    return () adaptersFactory.createAdapter(adaptee.getState(), eResource);
  }
  
  @Override
  public void setState(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.State o) {
    if (o != null)
    	adaptee.setState(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateAdapter) o).getAdaptee());
    else adaptee.setState(null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex getCurrentVertex() {
    org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect.currentVertex(adaptee);
  }
  
  @Override
  public void setCurrentVertex(final org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex currentVertex) {
    org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect.currentVertex(adaptee, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)((EObjectAdapter)currentVertex).getAdaptee()
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getRegion();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__NAME:
    		return getName();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__VERTICE:
    		return getVertice();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__TRANSITIONS:
    		return getTransitions();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__STATE_MACHINE:
    		return getStateMachine();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__STATE:
    		return getState();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__CURRENT_VERTEX:
    		return getCurrentVertex();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__VERTICE:
    		return getVertice() != null && !getVertice().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__STATE_MACHINE:
    		return getStateMachine() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__STATE:
    		return getState() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__CURRENT_VERTEX:
    		return getCurrentVertex() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__VERTICE:
    		getVertice().clear();
    		getVertice().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__STATE_MACHINE:
    		setStateMachine(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StateMachine)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__STATE:
    		setState(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.State)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.REGION__CURRENT_VERTEX:
    		setCurrentVertex(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
