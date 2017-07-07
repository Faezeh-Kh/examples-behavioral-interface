package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Event;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.AcceptEventActionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityEdgeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityFinalNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanExpressionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanValueAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAssignmentAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlFlowAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlTokenAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.DecisionNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.EventAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ExpressionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.FinalNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.FlowFinalNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ForkNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.InitialNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerBinaryExpressionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerExpressionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerValueAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAssignmentAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.JoinNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.MergeNodeAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.NamedElementAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.OfferAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.OpaqueActionAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ValueAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.VariableAdapter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.VariableAssignmentAdapter;

@SuppressWarnings("all")
public class XActivityDiagramMTAdaptersFactory implements AdaptersFactory {
  private static XActivityDiagramMTAdaptersFactory instance;
  
  public static XActivityDiagramMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XActivityDiagramMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity){
    	return createActivityAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Event){
    	return createEventAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Event) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow){
    	return createControlFlowAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction){
    	return createOpaqueActionAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction){
    	return createAcceptEventActionAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode){
    	return createInitialNodeAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode){
    	return createDecisionNodeAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode){
    	return createMergeNodeAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode){
    	return createForkNodeAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode){
    	return createJoinNodeAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode){
    	return createActivityFinalNodeAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode){
    	return createFlowFinalNodeAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable){
    	return createIntegerVariableAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable){
    	return createBooleanVariableAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue){
    	return createBooleanValueAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue){
    	return createIntegerValueAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression){
    	return createIntegerBinaryExpressionAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression){
    	return createIntegerComparisonExpressionAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression){
    	return createBooleanUnaryExpressionAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression){
    	return createBooleanBinaryExpressionAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment){
    	return createBooleanVariableAssignmentAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment){
    	return createIntegerVariableAssignmentAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken){
    	return createControlTokenAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) o, res);
    }
    if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer){
    	return createOfferAdapter((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o, res);
    }
    
    return null;
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.NamedElementAdapter) adapter;
    }
  }
  
  public ActivityAdapter createActivityAdapter(final Activity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityAdapter) adapter;
    }
  }
  
  public EventAdapter createEventAdapter(final Event adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.EventAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.EventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.EventAdapter) adapter;
    }
  }
  
  public ActivityEdgeAdapter createActivityEdgeAdapter(final ActivityEdge adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityEdgeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityEdgeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityEdgeAdapter) adapter;
    }
  }
  
  public ControlFlowAdapter createControlFlowAdapter(final ControlFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlFlowAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlFlowAdapter) adapter;
    }
  }
  
  public ActivityNodeAdapter createActivityNodeAdapter(final ActivityNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActionAdapter) adapter;
    }
  }
  
  public OpaqueActionAdapter createOpaqueActionAdapter(final OpaqueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.OpaqueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.OpaqueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.OpaqueActionAdapter) adapter;
    }
  }
  
  public AcceptEventActionAdapter createAcceptEventActionAdapter(final AcceptEventAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.AcceptEventActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.AcceptEventActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.AcceptEventActionAdapter) adapter;
    }
  }
  
  public ControlNodeAdapter createControlNodeAdapter(final ControlNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlNodeAdapter) adapter;
    }
  }
  
  public InitialNodeAdapter createInitialNodeAdapter(final InitialNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.InitialNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.InitialNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.InitialNodeAdapter) adapter;
    }
  }
  
  public DecisionNodeAdapter createDecisionNodeAdapter(final DecisionNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.DecisionNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.DecisionNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.DecisionNodeAdapter) adapter;
    }
  }
  
  public MergeNodeAdapter createMergeNodeAdapter(final MergeNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.MergeNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.MergeNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.MergeNodeAdapter) adapter;
    }
  }
  
  public ForkNodeAdapter createForkNodeAdapter(final ForkNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ForkNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ForkNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ForkNodeAdapter) adapter;
    }
  }
  
  public JoinNodeAdapter createJoinNodeAdapter(final JoinNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.JoinNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.JoinNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.JoinNodeAdapter) adapter;
    }
  }
  
  public FinalNodeAdapter createFinalNodeAdapter(final FinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.FinalNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.FinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.FinalNodeAdapter) adapter;
    }
  }
  
  public ActivityFinalNodeAdapter createActivityFinalNodeAdapter(final ActivityFinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityFinalNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityFinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityFinalNodeAdapter) adapter;
    }
  }
  
  public FlowFinalNodeAdapter createFlowFinalNodeAdapter(final FlowFinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.FlowFinalNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.FlowFinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.FlowFinalNodeAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ExpressionAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.VariableAdapter) adapter;
    }
  }
  
  public ValueAdapter createValueAdapter(final Value adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ValueAdapter) adapter;
    }
  }
  
  public IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerExpressionAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanExpressionAdapter) adapter;
    }
  }
  
  public IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAdapter) adapter;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAdapter) adapter;
    }
  }
  
  public BooleanValueAdapter createBooleanValueAdapter(final BooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanValueAdapter) adapter;
    }
  }
  
  public IntegerValueAdapter createIntegerValueAdapter(final IntegerValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerValueAdapter) adapter;
    }
  }
  
  public IntegerBinaryExpressionAdapter createIntegerBinaryExpressionAdapter(final IntegerBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerBinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerBinaryExpressionAdapter) adapter;
    }
  }
  
  public IntegerComparisonExpressionAdapter createIntegerComparisonExpressionAdapter(final IntegerComparisonExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter) adapter;
    }
  }
  
  public BooleanUnaryExpressionAdapter createBooleanUnaryExpressionAdapter(final BooleanUnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter) adapter;
    }
  }
  
  public BooleanBinaryExpressionAdapter createBooleanBinaryExpressionAdapter(final BooleanBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter) adapter;
    }
  }
  
  public VariableAssignmentAdapter createVariableAssignmentAdapter(final VariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.VariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.VariableAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.VariableAssignmentAdapter) adapter;
    }
  }
  
  public BooleanVariableAssignmentAdapter createBooleanVariableAssignmentAdapter(final BooleanVariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAssignmentAdapter) adapter;
    }
  }
  
  public IntegerVariableAssignmentAdapter createIntegerVariableAssignmentAdapter(final IntegerVariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAssignmentAdapter) adapter;
    }
  }
  
  public ControlTokenAdapter createControlTokenAdapter(final ControlToken adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlTokenAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlTokenAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ControlTokenAdapter) adapter;
    }
  }
  
  public OfferAdapter createOfferAdapter(final Offer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.OfferAdapter) adapter;
    else {
    	adapter = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.OfferAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.OfferAdapter) adapter;
    }
  }
}
