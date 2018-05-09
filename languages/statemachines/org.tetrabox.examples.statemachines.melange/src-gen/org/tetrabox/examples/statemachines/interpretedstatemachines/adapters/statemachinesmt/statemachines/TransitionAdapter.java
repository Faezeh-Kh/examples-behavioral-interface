package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition;
import statemachines.Behavior;
import statemachines.Constraint;
import statemachines.Region;
import statemachines.TransitionKind;
import statemachines.Trigger;
import statemachines.Vertex;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements statemachines.Transition {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
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
  public TransitionKind getKind() {
    return statemachines.TransitionKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final TransitionKind o) {
    adaptee.setKind(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.TransitionKind.get(o.getValue()));
  }
  
  @Override
  public Vertex getSource() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final Vertex o) {
    if (o != null)
    	adaptee.setSource(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.VertexAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public Vertex getTarget() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final Vertex o) {
    if (o != null)
    	adaptee.setTarget(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.VertexAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  private EList<Trigger> triggers_;
  
  @Override
  public EList<Trigger> getTriggers() {
    if (triggers_ == null)
    	triggers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTriggers(), adaptersFactory, eResource);
    return triggers_;
  }
  
  @Override
  public Region getContainer() {
    return (Region) adaptersFactory.createAdapter(adaptee.getContainer(), eResource);
  }
  
  @Override
  public void setContainer(final Region o) {
    if (o != null)
    	adaptee.setContainer(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.RegionAdapter) o).getAdaptee());
    else adaptee.setContainer(null);
  }
  
  @Override
  public Behavior getEffect() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getEffect(), eResource);
  }
  
  @Override
  public void setEffect(final Behavior o) {
    if (o != null)
    	adaptee.setEffect(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.BehaviorAdapter) o).getAdaptee());
    else adaptee.setEffect(null);
  }
  
  @Override
  public Constraint<?, ?> getConstraint() {
    return (Constraint) adaptersFactory.createAdapter(adaptee.getConstraint(), eResource);
  }
  
  @Override
  public void setConstraint(final Constraint<?, ?> o) {
    if (o != null)
    	adaptee.setConstraint(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.ConstraintAdapter) o).getAdaptee());
    else adaptee.setConstraint(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static TransitionKind KIND_EDEFAULT = statemachines.TransitionKind.INTERNAL;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.TRANSITION__NAME:
    		return getName();
    	case statemachines.StatemachinesPackage.TRANSITION__SOURCE:
    		return getSource();
    	case statemachines.StatemachinesPackage.TRANSITION__TARGET:
    		return getTarget();
    	case statemachines.StatemachinesPackage.TRANSITION__TRIGGERS:
    		return getTriggers();
    	case statemachines.StatemachinesPackage.TRANSITION__CONTAINER:
    		return getContainer();
    	case statemachines.StatemachinesPackage.TRANSITION__KIND:
    		return getKind();
    	case statemachines.StatemachinesPackage.TRANSITION__EFFECT:
    		return getEffect();
    	case statemachines.StatemachinesPackage.TRANSITION__CONSTRAINT:
    		return getConstraint();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.StatemachinesPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case statemachines.StatemachinesPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case statemachines.StatemachinesPackage.TRANSITION__TRIGGERS:
    		return getTriggers() != null && !getTriggers().isEmpty();
    	case statemachines.StatemachinesPackage.TRANSITION__CONTAINER:
    		return getContainer() != null;
    	case statemachines.StatemachinesPackage.TRANSITION__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case statemachines.StatemachinesPackage.TRANSITION__EFFECT:
    		return getEffect() != null;
    	case statemachines.StatemachinesPackage.TRANSITION__CONSTRAINT:
    		return getConstraint() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.TRANSITION__SOURCE:
    		setSource(
    		(statemachines.Vertex)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.TRANSITION__TARGET:
    		setTarget(
    		(statemachines.Vertex)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.TRANSITION__TRIGGERS:
    		getTriggers().clear();
    		getTriggers().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.TRANSITION__CONTAINER:
    		setContainer(
    		(statemachines.Region)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.TRANSITION__KIND:
    		setKind(
    		(statemachines.TransitionKind)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.TRANSITION__EFFECT:
    		setEffect(
    		(statemachines.Behavior)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.TRANSITION__CONSTRAINT:
    		setConstraint(
    		(statemachines.Constraint<?, ?>)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
