package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Event;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Variable;

@SuppressWarnings("all")
public class ActivityAdapter extends EObjectAdapter<Activity> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Activity {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ActivityAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<Event> events_;
  
  @Override
  public EList<Event> getEvents() {
    if (events_ == null)
    	events_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEvents(), adaptersFactory, eResource);
    return events_;
  }
  
  private EList<ActivityNode> nodes_;
  
  @Override
  public EList<ActivityNode> getNodes() {
    if (nodes_ == null)
    	nodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getNodes(), adaptersFactory, eResource);
    return nodes_;
  }
  
  private EList<ActivityEdge> edges_;
  
  @Override
  public EList<ActivityEdge> getEdges() {
    if (edges_ == null)
    	edges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEdges(), adaptersFactory, eResource);
    return edges_;
  }
  
  private EList<Variable> locals_;
  
  @Override
  public EList<Variable> getLocals() {
    if (locals_ == null)
    	locals_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLocals(), adaptersFactory, eResource);
    return locals_;
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspect.execute(adaptee);
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void main() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspect.main(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EVENTS:
    		return getEvents();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EVENTS:
    		return getEvents() != null && !getEvents().isEmpty();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes() != null && !getNodes().isEmpty();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges() != null && !getEdges().isEmpty();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals() != null && !getLocals().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EVENTS:
    		getEvents().clear();
    		getEvents().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		getNodes().clear();
    		getNodes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		getEdges().clear();
    		getEdges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		getLocals().clear();
    		getLocals().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
