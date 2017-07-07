package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ControlToken;

@SuppressWarnings("all")
public class MergeNodeAdapter extends EObjectAdapter<MergeNode> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.MergeNode {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public MergeNodeAdapter() {
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
  
  @Override
  public boolean isRunning() {
    return adaptee.isRunning();
  }
  
  @Override
  public void setRunning(final boolean o) {
    adaptee.setRunning(o);
  }
  
  @Override
  public Activity getActivity() {
    return (Activity) adaptersFactory.createAdapter(adaptee.getActivity(), eResource);
  }
  
  @Override
  public void setActivity(final Activity o) {
    if (o != null)
    	adaptee.setActivity(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityAdapter) o).getAdaptee());
    else adaptee.setActivity(null);
  }
  
  private EList<ActivityEdge> incoming_;
  
  @Override
  public EList<ActivityEdge> getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  @Override
  public ActivityEdge getOutgoing() {
    return (ActivityEdge) adaptersFactory.createAdapter(adaptee.getOutgoing(), eResource);
  }
  
  @Override
  public void setOutgoing(final ActivityEdge o) {
    if (o != null)
    	adaptee.setOutgoing(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityEdgeAdapter) o).getAdaptee());
    else adaptee.setOutgoing(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspect.execute(adaptee);
  }
  
  @Override
  public boolean hasOffers() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspect.hasOffers(adaptee);
  }
  
  @Override
  public void addToken(final ControlToken token) {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.addToken(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken)((EObjectAdapter)token).getAdaptee()
    );
  }
  
  @Override
  public boolean canAddToken(final ControlToken token) {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.canAddToken(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken)((EObjectAdapter)token).getAdaptee()
    );
  }
  
  @Override
  public EList<ControlToken> getHeldTokens() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.heldTokens(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public boolean isReady() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.isReady(adaptee);
  }
  
  @Override
  public void removeToken(final ControlToken token) {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.removeToken(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken)((EObjectAdapter)token).getAdaptee()
    );
  }
  
  @Override
  public void terminate() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.terminate(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean RUNNING_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		return getName();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		return getActivity();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		return isRunning() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__HELD_TOKENS:
    		return getHeldTokens();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		return getIncoming();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		return getOutgoing();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		return getActivity() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		return isRunning() != RUNNING_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__HELD_TOKENS:
    		return getHeldTokens() != null && !getHeldTokens().isEmpty();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		return getOutgoing() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		setActivity(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Activity)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		setRunning(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__HELD_TOKENS:
    		getHeldTokens().clear();
    		getHeldTokens().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		setOutgoing(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityEdge)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
