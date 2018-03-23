package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate;
import statemachines.almostuml.PseudostateKind;
import statemachines.almostuml.Region;
import statemachines.almostuml.Transition;

@SuppressWarnings("all")
public class PseudostateAdapter extends EObjectAdapter<Pseudostate> implements statemachines.almostuml.Pseudostate {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public PseudostateAdapter() {
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
  public PseudostateKind getKind() {
    return statemachines.almostuml.PseudostateKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final PseudostateKind o) {
    adaptee.setKind(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.PseudostateKind.get(o.getValue()));
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
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static PseudostateKind KIND_EDEFAULT = statemachines.almostuml.PseudostateKind.INITIAL;
  
  @Override
  public EClass eClass() {
    return statemachines.almostuml.AlmostumlPackage.eINSTANCE.getPseudostate();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__NAME:
    		return getName();
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__CONTAINER:
    		return getContainer();
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__KIND:
    		return getKind();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__CONTAINER:
    		return getContainer() != null;
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__KIND:
    		return getKind() != KIND_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__CONTAINER:
    		setContainer(
    		(statemachines.almostuml.Region)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.PSEUDOSTATE__KIND:
    		setKind(
    		(statemachines.almostuml.PseudostateKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
