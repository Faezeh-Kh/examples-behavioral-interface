package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import statemachines.almostuml.Behavior;
import statemachines.almostuml.Region;
import statemachines.almostuml.TransitionKind;
import statemachines.almostuml.Trigger;
import statemachines.almostuml.Vertex;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements statemachines.almostuml.Transition {
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
    return statemachines.almostuml.TransitionKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final TransitionKind o) {
    adaptee.setKind(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.TransitionKind.get(o.getValue()));
  }
  
  @Override
  public Vertex getSource() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final Vertex o) {
    if (o != null)
    	adaptee.setSource(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.VertexAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public Vertex getTarget() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final Vertex o) {
    if (o != null)
    	adaptee.setTarget(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.VertexAdapter) o).getAdaptee());
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
    	adaptee.setContainer(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.RegionAdapter) o).getAdaptee());
    else adaptee.setContainer(null);
  }
  
  @Override
  public Behavior getEffect() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getEffect(), eResource);
  }
  
  @Override
  public void setEffect(final Behavior o) {
    if (o != null)
    	adaptee.setEffect(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.BehaviorAdapter) o).getAdaptee());
    else adaptee.setEffect(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static TransitionKind KIND_EDEFAULT = statemachines.almostuml.TransitionKind.INTERNAL;
  
  @Override
  public EClass eClass() {
    return statemachines.almostuml.AlmostumlPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__NAME:
    		return getName();
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__SOURCE:
    		return getSource();
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__TARGET:
    		return getTarget();
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__TRIGGERS:
    		return getTriggers();
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__CONTAINER:
    		return getContainer();
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__KIND:
    		return getKind();
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__EFFECT:
    		return getEffect();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__TRIGGERS:
    		return getTriggers() != null && !getTriggers().isEmpty();
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__CONTAINER:
    		return getContainer() != null;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__EFFECT:
    		return getEffect() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__SOURCE:
    		setSource(
    		(statemachines.almostuml.Vertex)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__TARGET:
    		setTarget(
    		(statemachines.almostuml.Vertex)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__TRIGGERS:
    		getTriggers().clear();
    		getTriggers().addAll((Collection) newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__CONTAINER:
    		setContainer(
    		(statemachines.almostuml.Region)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__KIND:
    		setKind(
    		(statemachines.almostuml.TransitionKind)
    		 newValue);
    		return;
    	case statemachines.almostuml.AlmostumlPackage.TRANSITION__EFFECT:
    		setEffect(
    		(statemachines.almostuml.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
