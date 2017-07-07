package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.AcceptEventAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityFinalNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanVariableAssignment;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.DecisionNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Event;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.FlowFinalNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ForkNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerVariableAssignment;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Offer;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.OpaqueAction;

@SuppressWarnings("all")
public class ActivitydiagramFactoryAdapter extends EFactoryImpl implements ActivitydiagramFactory {
  private XActivityDiagramMTAdaptersFactory adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  
  private org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory activitydiagramAdaptee = org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory.eINSTANCE;
  
  @Override
  public Activity createActivity() {
    return adaptersFactory.createActivityAdapter(activitydiagramAdaptee.createActivity(), null);
  }
  
  @Override
  public Event createEvent() {
    return adaptersFactory.createEventAdapter(activitydiagramAdaptee.createEvent(), null);
  }
  
  @Override
  public ControlFlow createControlFlow() {
    return adaptersFactory.createControlFlowAdapter(activitydiagramAdaptee.createControlFlow(), null);
  }
  
  @Override
  public OpaqueAction createOpaqueAction() {
    return adaptersFactory.createOpaqueActionAdapter(activitydiagramAdaptee.createOpaqueAction(), null);
  }
  
  @Override
  public AcceptEventAction createAcceptEventAction() {
    return adaptersFactory.createAcceptEventActionAdapter(activitydiagramAdaptee.createAcceptEventAction(), null);
  }
  
  @Override
  public InitialNode createInitialNode() {
    return adaptersFactory.createInitialNodeAdapter(activitydiagramAdaptee.createInitialNode(), null);
  }
  
  @Override
  public DecisionNode createDecisionNode() {
    return adaptersFactory.createDecisionNodeAdapter(activitydiagramAdaptee.createDecisionNode(), null);
  }
  
  @Override
  public MergeNode createMergeNode() {
    return adaptersFactory.createMergeNodeAdapter(activitydiagramAdaptee.createMergeNode(), null);
  }
  
  @Override
  public ForkNode createForkNode() {
    return adaptersFactory.createForkNodeAdapter(activitydiagramAdaptee.createForkNode(), null);
  }
  
  @Override
  public JoinNode createJoinNode() {
    return adaptersFactory.createJoinNodeAdapter(activitydiagramAdaptee.createJoinNode(), null);
  }
  
  @Override
  public ActivityFinalNode createActivityFinalNode() {
    return adaptersFactory.createActivityFinalNodeAdapter(activitydiagramAdaptee.createActivityFinalNode(), null);
  }
  
  @Override
  public FlowFinalNode createFlowFinalNode() {
    return adaptersFactory.createFlowFinalNodeAdapter(activitydiagramAdaptee.createFlowFinalNode(), null);
  }
  
  @Override
  public IntegerVariable createIntegerVariable() {
    return adaptersFactory.createIntegerVariableAdapter(activitydiagramAdaptee.createIntegerVariable(), null);
  }
  
  @Override
  public BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(activitydiagramAdaptee.createBooleanVariable(), null);
  }
  
  @Override
  public BooleanValue createBooleanValue() {
    return adaptersFactory.createBooleanValueAdapter(activitydiagramAdaptee.createBooleanValue(), null);
  }
  
  @Override
  public IntegerValue createIntegerValue() {
    return adaptersFactory.createIntegerValueAdapter(activitydiagramAdaptee.createIntegerValue(), null);
  }
  
  @Override
  public IntegerBinaryExpression createIntegerBinaryExpression() {
    return adaptersFactory.createIntegerBinaryExpressionAdapter(activitydiagramAdaptee.createIntegerBinaryExpression(), null);
  }
  
  @Override
  public IntegerComparisonExpression createIntegerComparisonExpression() {
    return adaptersFactory.createIntegerComparisonExpressionAdapter(activitydiagramAdaptee.createIntegerComparisonExpression(), null);
  }
  
  @Override
  public BooleanUnaryExpression createBooleanUnaryExpression() {
    return adaptersFactory.createBooleanUnaryExpressionAdapter(activitydiagramAdaptee.createBooleanUnaryExpression(), null);
  }
  
  @Override
  public BooleanBinaryExpression createBooleanBinaryExpression() {
    return adaptersFactory.createBooleanBinaryExpressionAdapter(activitydiagramAdaptee.createBooleanBinaryExpression(), null);
  }
  
  @Override
  public BooleanVariableAssignment createBooleanVariableAssignment() {
    return adaptersFactory.createBooleanVariableAssignmentAdapter(activitydiagramAdaptee.createBooleanVariableAssignment(), null);
  }
  
  @Override
  public IntegerVariableAssignment createIntegerVariableAssignment() {
    return adaptersFactory.createIntegerVariableAssignmentAdapter(activitydiagramAdaptee.createIntegerVariableAssignment(), null);
  }
  
  @Override
  public ControlToken createControlToken() {
    return adaptersFactory.createControlTokenAdapter(activitydiagramAdaptee.createControlToken(), null);
  }
  
  @Override
  public Offer createOffer() {
    return adaptersFactory.createOfferAdapter(activitydiagramAdaptee.createOffer(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getActivitydiagramPackage();
  }
  
  public ActivitydiagramPackage getActivitydiagramPackage() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE;
  }
}
