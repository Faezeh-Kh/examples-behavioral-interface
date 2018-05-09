package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region;
import statemachines.State;
import statemachines.StateMachine;
import statemachines.Transition;
import statemachines.Vertex;

@SuppressWarnings("all")
public class RegionAdapter extends EObjectAdapter<Region> implements statemachines.Region {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public RegionAdapter() {
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
  
  private EList<Vertex> vertice_;
  
  @Override
  public EList<Vertex> getVertice() {
    if (vertice_ == null)
    	vertice_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVertice(), adaptersFactory, eResource);
    return vertice_;
  }
  
  private EList<Transition> transitions_;
  
  @Override
  public EList<Transition> getTransitions() {
    if (transitions_ == null)
    	transitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransitions(), adaptersFactory, eResource);
    return transitions_;
  }
  
  @Override
  public StateMachine getStateMachine() {
    return (StateMachine) adaptersFactory.createAdapter(adaptee.getStateMachine(), eResource);
  }
  
  @Override
  public void setStateMachine(final StateMachine o) {
    if (o != null)
    	adaptee.setStateMachine(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.StateMachineAdapter) o).getAdaptee());
    else adaptee.setStateMachine(null);
  }
  
  @Override
  public State getState() {
    return (State) adaptersFactory.createAdapter(adaptee.getState(), eResource);
  }
  
  @Override
  public void setState(final State o) {
    if (o != null)
    	adaptee.setState(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.StateAdapter) o).getAdaptee());
    else adaptee.setState(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getRegion();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.REGION__NAME:
    		return getName();
    	case statemachines.StatemachinesPackage.REGION__VERTICE:
    		return getVertice();
    	case statemachines.StatemachinesPackage.REGION__TRANSITIONS:
    		return getTransitions();
    	case statemachines.StatemachinesPackage.REGION__STATE_MACHINE:
    		return getStateMachine();
    	case statemachines.StatemachinesPackage.REGION__STATE:
    		return getState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.REGION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.StatemachinesPackage.REGION__VERTICE:
    		return getVertice() != null && !getVertice().isEmpty();
    	case statemachines.StatemachinesPackage.REGION__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case statemachines.StatemachinesPackage.REGION__STATE_MACHINE:
    		return getStateMachine() != null;
    	case statemachines.StatemachinesPackage.REGION__STATE:
    		return getState() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.REGION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.REGION__VERTICE:
    		getVertice().clear();
    		getVertice().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.REGION__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.REGION__STATE_MACHINE:
    		setStateMachine(
    		(statemachines.StateMachine)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.REGION__STATE:
    		setState(
    		(statemachines.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
