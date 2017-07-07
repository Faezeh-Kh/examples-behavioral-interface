/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.util;

import fr.inria.diverse.event.commons.model.property.AbstractProperty;
import fr.inria.diverse.event.commons.model.property.BinaryProperty;
import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;
import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;
import fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty;
import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;
import fr.inria.diverse.event.commons.model.property.NegationTemporalProperty;
import fr.inria.diverse.event.commons.model.property.NextProperty;
import fr.inria.diverse.event.commons.model.property.Property;
import fr.inria.diverse.event.commons.model.property.ReleaseProperty;
import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;
import fr.inria.diverse.event.commons.model.property.StateProperty;
import fr.inria.diverse.event.commons.model.property.StepProperty;
import fr.inria.diverse.event.commons.model.property.StringAttributeProperty;
import fr.inria.diverse.event.commons.model.property.TemporalProperty;
import fr.inria.diverse.event.commons.model.property.UnaryProperty;
import fr.inria.diverse.event.commons.model.property.UntilProperty;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage
 * @generated
 */
public class XActivityDiagramPropertyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XActivityDiagramPropertyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramPropertyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XActivityDiagramPropertyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramPropertySwitch<Adapter> modelSwitch =
		new XActivityDiagramPropertySwitch<Adapter>() {
			@Override
			public Adapter caseJoinNodeExecuteProperty(JoinNodeExecuteProperty object) {
				return createJoinNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseFinalNodeExecuteProperty(FinalNodeExecuteProperty object) {
				return createFinalNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseDecisionNodeExecuteProperty(DecisionNodeExecuteProperty object) {
				return createDecisionNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeExecuteProperty(ActivityFinalNodeExecuteProperty object) {
				return createActivityFinalNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodeTerminateProperty(ActivityNodeTerminateProperty object) {
				return createActivityNodeTerminatePropertyAdapter();
			}
			@Override
			public Adapter caseOpaqueActionExecuteProperty(OpaqueActionExecuteProperty object) {
				return createOpaqueActionExecutePropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodeAddTokenProperty(ActivityNodeAddTokenProperty object) {
				return createActivityNodeAddTokenPropertyAdapter();
			}
			@Override
			public Adapter caseVariableAssignmentExecuteProperty(VariableAssignmentExecuteProperty object) {
				return createVariableAssignmentExecutePropertyAdapter();
			}
			@Override
			public Adapter caseMergeNodeExecuteProperty(MergeNodeExecuteProperty object) {
				return createMergeNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseVariableInitProperty(VariableInitProperty object) {
				return createVariableInitPropertyAdapter();
			}
			@Override
			public Adapter caseActivityExecuteProperty(ActivityExecuteProperty object) {
				return createActivityExecutePropertyAdapter();
			}
			@Override
			public Adapter caseForkNodeExecuteProperty(ForkNodeExecuteProperty object) {
				return createForkNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionExecuteProperty(AcceptEventActionExecuteProperty object) {
				return createAcceptEventActionExecutePropertyAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeExecuteProperty(FlowFinalNodeExecuteProperty object) {
				return createFlowFinalNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseInitialNodeExecuteProperty(InitialNodeExecuteProperty object) {
				return createInitialNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseBooleanVariableAssignmentExecuteProperty(BooleanVariableAssignmentExecuteProperty object) {
				return createBooleanVariableAssignmentExecutePropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodeRemoveTokenProperty(ActivityNodeRemoveTokenProperty object) {
				return createActivityNodeRemoveTokenPropertyAdapter();
			}
			@Override
			public Adapter caseIntegerVariableAssignmentExecuteProperty(IntegerVariableAssignmentExecuteProperty object) {
				return createIntegerVariableAssignmentExecutePropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionAcceptProperty(AcceptEventActionAcceptProperty object) {
				return createAcceptEventActionAcceptPropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodeExecuteProperty(ActivityNodeExecuteProperty object) {
				return createActivityNodeExecutePropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionWaitForEventProperty(AcceptEventActionWaitForEventProperty object) {
				return createAcceptEventActionWaitForEventPropertyAdapter();
			}
			@Override
			public Adapter caseXActivityDiagramAbstractProperty(XActivityDiagramAbstractProperty object) {
				return createXActivityDiagramAbstractPropertyAdapter();
			}
			@Override
			public Adapter caseXActivityDiagramTemporalProperty(XActivityDiagramTemporalProperty object) {
				return createXActivityDiagramTemporalPropertyAdapter();
			}
			@Override
			public Adapter caseXActivityDiagramProperty(XActivityDiagramProperty object) {
				return createXActivityDiagramPropertyAdapter();
			}
			@Override
			public <T> Adapter caseXActivityDiagramStateProperty(XActivityDiagramStateProperty<T> object) {
				return createXActivityDiagramStatePropertyAdapter();
			}
			@Override
			public <T> Adapter caseXActivityDiagramStepProperty(XActivityDiagramStepProperty<T> object) {
				return createXActivityDiagramStepPropertyAdapter();
			}
			@Override
			public <T extends NamedElement> Adapter caseNamedElementProperty(NamedElementProperty<T> object) {
				return createNamedElementPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryNamedElementProperty(UnaryNamedElementProperty object) {
				return createUnaryNamedElementPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryNamedElementProperty(BinaryNamedElementProperty object) {
				return createBinaryNamedElementPropertyAdapter();
			}
			@Override
			public Adapter caseNamedElementNameProperty(NamedElementNameProperty object) {
				return createNamedElementNamePropertyAdapter();
			}
			@Override
			public <T extends Activity> Adapter caseActivityProperty(ActivityProperty<T> object) {
				return createActivityPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryActivityProperty(UnaryActivityProperty object) {
				return createUnaryActivityPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryActivityProperty(BinaryActivityProperty object) {
				return createBinaryActivityPropertyAdapter();
			}
			@Override
			public Adapter caseActivityNameProperty(ActivityNameProperty object) {
				return createActivityNamePropertyAdapter();
			}
			@Override
			public Adapter caseEventActivityContainerProperty(EventActivityContainerProperty object) {
				return createEventActivityContainerPropertyAdapter();
			}
			@Override
			public <T extends Event> Adapter caseEventProperty(EventProperty<T> object) {
				return createEventPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryEventProperty(UnaryEventProperty object) {
				return createUnaryEventPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryEventProperty(BinaryEventProperty object) {
				return createBinaryEventPropertyAdapter();
			}
			@Override
			public Adapter caseEventNameProperty(EventNameProperty object) {
				return createEventNamePropertyAdapter();
			}
			@Override
			public Adapter caseActivityEventsProperty(ActivityEventsProperty object) {
				return createActivityEventsPropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodesProperty(ActivityNodesProperty object) {
				return createActivityNodesPropertyAdapter();
			}
			@Override
			public <T extends ActivityNode> Adapter caseActivityNodeProperty(ActivityNodeProperty<T> object) {
				return createActivityNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryActivityNodeProperty(UnaryActivityNodeProperty object) {
				return createUnaryActivityNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryActivityNodeProperty(BinaryActivityNodeProperty object) {
				return createBinaryActivityNodePropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodeNameProperty(ActivityNodeNameProperty object) {
				return createActivityNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodeActivityProperty(ActivityNodeActivityProperty object) {
				return createActivityNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodeRunningProperty(ActivityNodeRunningProperty object) {
				return createActivityNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenActivityNodeContainerProperty(ControlTokenActivityNodeContainerProperty object) {
				return createControlTokenActivityNodeContainerPropertyAdapter();
			}
			@Override
			public <T extends ControlToken> Adapter caseControlTokenProperty(ControlTokenProperty<T> object) {
				return createControlTokenPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryControlTokenProperty(UnaryControlTokenProperty object) {
				return createUnaryControlTokenPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryControlTokenProperty(BinaryControlTokenProperty object) {
				return createBinaryControlTokenPropertyAdapter();
			}
			@Override
			public Adapter caseActivityNodeHeldTokensProperty(ActivityNodeHeldTokensProperty object) {
				return createActivityNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseActivityEdgeActivityContainerProperty(ActivityEdgeActivityContainerProperty object) {
				return createActivityEdgeActivityContainerPropertyAdapter();
			}
			@Override
			public <T extends ActivityEdge> Adapter caseActivityEdgeProperty(ActivityEdgeProperty<T> object) {
				return createActivityEdgePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryActivityEdgeProperty(UnaryActivityEdgeProperty object) {
				return createUnaryActivityEdgePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryActivityEdgeProperty(BinaryActivityEdgeProperty object) {
				return createBinaryActivityEdgePropertyAdapter();
			}
			@Override
			public Adapter caseActivityEdgeNameProperty(ActivityEdgeNameProperty object) {
				return createActivityEdgeNamePropertyAdapter();
			}
			@Override
			public Adapter caseActivityEdgeSourceProperty(ActivityEdgeSourceProperty object) {
				return createActivityEdgeSourcePropertyAdapter();
			}
			@Override
			public Adapter caseActivityEdgeTargetProperty(ActivityEdgeTargetProperty object) {
				return createActivityEdgeTargetPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenActivityEdgeContainerProperty(ControlTokenActivityEdgeContainerProperty object) {
				return createControlTokenActivityEdgeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseActivityEdgeOfferedTokensProperty(ActivityEdgeOfferedTokensProperty object) {
				return createActivityEdgeOfferedTokensPropertyAdapter();
			}
			@Override
			public Adapter caseActivityEdgesProperty(ActivityEdgesProperty object) {
				return createActivityEdgesPropertyAdapter();
			}
			@Override
			public Adapter caseVariableActivityContainerProperty(VariableActivityContainerProperty object) {
				return createVariableActivityContainerPropertyAdapter();
			}
			@Override
			public <T extends Variable> Adapter caseVariableProperty(VariableProperty<T> object) {
				return createVariablePropertyAdapter();
			}
			@Override
			public <T extends Expression> Adapter caseExpressionProperty(ExpressionProperty<T> object) {
				return createExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryExpressionProperty(UnaryExpressionProperty object) {
				return createUnaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryExpressionProperty(BinaryExpressionProperty object) {
				return createBinaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryVariableProperty(UnaryVariableProperty object) {
				return createUnaryVariablePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryVariableProperty(BinaryVariableProperty object) {
				return createBinaryVariablePropertyAdapter();
			}
			@Override
			public Adapter caseVariableNameProperty(VariableNameProperty object) {
				return createVariableNamePropertyAdapter();
			}
			@Override
			public Adapter caseActivityLocalsProperty(ActivityLocalsProperty object) {
				return createActivityLocalsPropertyAdapter();
			}
			@Override
			public <T extends ControlFlow> Adapter caseControlFlowProperty(ControlFlowProperty<T> object) {
				return createControlFlowPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryControlFlowProperty(UnaryControlFlowProperty object) {
				return createUnaryControlFlowPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryControlFlowProperty(BinaryControlFlowProperty object) {
				return createBinaryControlFlowPropertyAdapter();
			}
			@Override
			public Adapter caseControlFlowNameProperty(ControlFlowNameProperty object) {
				return createControlFlowNamePropertyAdapter();
			}
			@Override
			public Adapter caseControlFlowSourceProperty(ControlFlowSourceProperty object) {
				return createControlFlowSourcePropertyAdapter();
			}
			@Override
			public Adapter caseControlFlowTargetProperty(ControlFlowTargetProperty object) {
				return createControlFlowTargetPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenControlFlowContainerProperty(ControlTokenControlFlowContainerProperty object) {
				return createControlTokenControlFlowContainerPropertyAdapter();
			}
			@Override
			public Adapter caseControlFlowOfferedTokensProperty(ControlFlowOfferedTokensProperty object) {
				return createControlFlowOfferedTokensPropertyAdapter();
			}
			@Override
			public Adapter caseControlFlowGuardProperty(ControlFlowGuardProperty object) {
				return createControlFlowGuardPropertyAdapter();
			}
			@Override
			public <T extends BooleanVariable> Adapter caseBooleanVariableProperty(BooleanVariableProperty<T> object) {
				return createBooleanVariablePropertyAdapter();
			}
			@Override
			public <T extends BooleanExpression> Adapter caseBooleanExpressionProperty(BooleanExpressionProperty<T> object) {
				return createBooleanExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryBooleanExpressionProperty(UnaryBooleanExpressionProperty object) {
				return createUnaryBooleanExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryBooleanExpressionProperty(BinaryBooleanExpressionProperty object) {
				return createBinaryBooleanExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryBooleanVariableProperty(UnaryBooleanVariableProperty object) {
				return createUnaryBooleanVariablePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryBooleanVariableProperty(BinaryBooleanVariableProperty object) {
				return createBinaryBooleanVariablePropertyAdapter();
			}
			@Override
			public Adapter caseBooleanVariableNameProperty(BooleanVariableNameProperty object) {
				return createBooleanVariableNamePropertyAdapter();
			}
			@Override
			public Adapter caseBooleanVariableInitialValueProperty(BooleanVariableInitialValueProperty object) {
				return createBooleanVariableInitialValuePropertyAdapter();
			}
			@Override
			public Adapter caseBooleanVariableCurrentValueProperty(BooleanVariableCurrentValueProperty object) {
				return createBooleanVariableCurrentValuePropertyAdapter();
			}
			@Override
			public <T extends Action> Adapter caseActionProperty(ActionProperty<T> object) {
				return createActionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryActionProperty(UnaryActionProperty object) {
				return createUnaryActionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryActionProperty(BinaryActionProperty object) {
				return createBinaryActionPropertyAdapter();
			}
			@Override
			public Adapter caseActionNameProperty(ActionNameProperty object) {
				return createActionNamePropertyAdapter();
			}
			@Override
			public Adapter caseActionActivityProperty(ActionActivityProperty object) {
				return createActionActivityPropertyAdapter();
			}
			@Override
			public Adapter caseActionRunningProperty(ActionRunningProperty object) {
				return createActionRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenActionContainerProperty(ControlTokenActionContainerProperty object) {
				return createControlTokenActionContainerPropertyAdapter();
			}
			@Override
			public Adapter caseActionHeldTokensProperty(ActionHeldTokensProperty object) {
				return createActionHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseActionIncomingProperty(ActionIncomingProperty object) {
				return createActionIncomingPropertyAdapter();
			}
			@Override
			public Adapter caseActionOutgoingProperty(ActionOutgoingProperty object) {
				return createActionOutgoingPropertyAdapter();
			}
			@Override
			public <T extends OpaqueAction> Adapter caseOpaqueActionProperty(OpaqueActionProperty<T> object) {
				return createOpaqueActionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryOpaqueActionProperty(UnaryOpaqueActionProperty object) {
				return createUnaryOpaqueActionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryOpaqueActionProperty(BinaryOpaqueActionProperty object) {
				return createBinaryOpaqueActionPropertyAdapter();
			}
			@Override
			public Adapter caseOpaqueActionNameProperty(OpaqueActionNameProperty object) {
				return createOpaqueActionNamePropertyAdapter();
			}
			@Override
			public Adapter caseOpaqueActionActivityProperty(OpaqueActionActivityProperty object) {
				return createOpaqueActionActivityPropertyAdapter();
			}
			@Override
			public Adapter caseOpaqueActionRunningProperty(OpaqueActionRunningProperty object) {
				return createOpaqueActionRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenOpaqueActionContainerProperty(ControlTokenOpaqueActionContainerProperty object) {
				return createControlTokenOpaqueActionContainerPropertyAdapter();
			}
			@Override
			public Adapter caseOpaqueActionHeldTokensProperty(OpaqueActionHeldTokensProperty object) {
				return createOpaqueActionHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseOpaqueActionIncomingProperty(OpaqueActionIncomingProperty object) {
				return createOpaqueActionIncomingPropertyAdapter();
			}
			@Override
			public Adapter caseOpaqueActionOutgoingProperty(OpaqueActionOutgoingProperty object) {
				return createOpaqueActionOutgoingPropertyAdapter();
			}
			@Override
			public Adapter caseVariableAssignmentOpaqueActionContainerProperty(VariableAssignmentOpaqueActionContainerProperty object) {
				return createVariableAssignmentOpaqueActionContainerPropertyAdapter();
			}
			@Override
			public <T extends VariableAssignment> Adapter caseVariableAssignmentProperty(VariableAssignmentProperty<T> object) {
				return createVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryVariableAssignmentProperty(UnaryVariableAssignmentProperty object) {
				return createUnaryVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryVariableAssignmentProperty(BinaryVariableAssignmentProperty object) {
				return createBinaryVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseOpaqueActionAssignmentsProperty(OpaqueActionAssignmentsProperty object) {
				return createOpaqueActionAssignmentsPropertyAdapter();
			}
			@Override
			public <T extends AcceptEventAction> Adapter caseAcceptEventActionProperty(AcceptEventActionProperty<T> object) {
				return createAcceptEventActionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryAcceptEventActionProperty(UnaryAcceptEventActionProperty object) {
				return createUnaryAcceptEventActionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryAcceptEventActionProperty(BinaryAcceptEventActionProperty object) {
				return createBinaryAcceptEventActionPropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionNameProperty(AcceptEventActionNameProperty object) {
				return createAcceptEventActionNamePropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionActivityProperty(AcceptEventActionActivityProperty object) {
				return createAcceptEventActionActivityPropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionRunningProperty(AcceptEventActionRunningProperty object) {
				return createAcceptEventActionRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenAcceptEventActionContainerProperty(ControlTokenAcceptEventActionContainerProperty object) {
				return createControlTokenAcceptEventActionContainerPropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionHeldTokensProperty(AcceptEventActionHeldTokensProperty object) {
				return createAcceptEventActionHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionEventTypeProperty(AcceptEventActionEventTypeProperty object) {
				return createAcceptEventActionEventTypePropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionIncomingProperty(AcceptEventActionIncomingProperty object) {
				return createAcceptEventActionIncomingPropertyAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionOutgoingProperty(AcceptEventActionOutgoingProperty object) {
				return createAcceptEventActionOutgoingPropertyAdapter();
			}
			@Override
			public <T extends ControlNode> Adapter caseControlNodeProperty(ControlNodeProperty<T> object) {
				return createControlNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryControlNodeProperty(UnaryControlNodeProperty object) {
				return createUnaryControlNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryControlNodeProperty(BinaryControlNodeProperty object) {
				return createBinaryControlNodePropertyAdapter();
			}
			@Override
			public Adapter caseControlNodeNameProperty(ControlNodeNameProperty object) {
				return createControlNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseControlNodeActivityProperty(ControlNodeActivityProperty object) {
				return createControlNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseControlNodeRunningProperty(ControlNodeRunningProperty object) {
				return createControlNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenControlNodeContainerProperty(ControlTokenControlNodeContainerProperty object) {
				return createControlTokenControlNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseControlNodeHeldTokensProperty(ControlNodeHeldTokensProperty object) {
				return createControlNodeHeldTokensPropertyAdapter();
			}
			@Override
			public <T extends InitialNode> Adapter caseInitialNodeProperty(InitialNodeProperty<T> object) {
				return createInitialNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryInitialNodeProperty(UnaryInitialNodeProperty object) {
				return createUnaryInitialNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryInitialNodeProperty(BinaryInitialNodeProperty object) {
				return createBinaryInitialNodePropertyAdapter();
			}
			@Override
			public Adapter caseInitialNodeNameProperty(InitialNodeNameProperty object) {
				return createInitialNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseInitialNodeActivityProperty(InitialNodeActivityProperty object) {
				return createInitialNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseInitialNodeRunningProperty(InitialNodeRunningProperty object) {
				return createInitialNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenInitialNodeContainerProperty(ControlTokenInitialNodeContainerProperty object) {
				return createControlTokenInitialNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseInitialNodeHeldTokensProperty(InitialNodeHeldTokensProperty object) {
				return createInitialNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseInitialNodeOutgoingProperty(InitialNodeOutgoingProperty object) {
				return createInitialNodeOutgoingPropertyAdapter();
			}
			@Override
			public <T extends DecisionNode> Adapter caseDecisionNodeProperty(DecisionNodeProperty<T> object) {
				return createDecisionNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryDecisionNodeProperty(UnaryDecisionNodeProperty object) {
				return createUnaryDecisionNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryDecisionNodeProperty(BinaryDecisionNodeProperty object) {
				return createBinaryDecisionNodePropertyAdapter();
			}
			@Override
			public Adapter caseDecisionNodeNameProperty(DecisionNodeNameProperty object) {
				return createDecisionNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseDecisionNodeActivityProperty(DecisionNodeActivityProperty object) {
				return createDecisionNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseDecisionNodeRunningProperty(DecisionNodeRunningProperty object) {
				return createDecisionNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenDecisionNodeContainerProperty(ControlTokenDecisionNodeContainerProperty object) {
				return createControlTokenDecisionNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseDecisionNodeHeldTokensProperty(DecisionNodeHeldTokensProperty object) {
				return createDecisionNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseDecisionNodeIncomingProperty(DecisionNodeIncomingProperty object) {
				return createDecisionNodeIncomingPropertyAdapter();
			}
			@Override
			public Adapter caseDecisionNodeOutgoingProperty(DecisionNodeOutgoingProperty object) {
				return createDecisionNodeOutgoingPropertyAdapter();
			}
			@Override
			public <T extends MergeNode> Adapter caseMergeNodeProperty(MergeNodeProperty<T> object) {
				return createMergeNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryMergeNodeProperty(UnaryMergeNodeProperty object) {
				return createUnaryMergeNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryMergeNodeProperty(BinaryMergeNodeProperty object) {
				return createBinaryMergeNodePropertyAdapter();
			}
			@Override
			public Adapter caseMergeNodeNameProperty(MergeNodeNameProperty object) {
				return createMergeNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseMergeNodeActivityProperty(MergeNodeActivityProperty object) {
				return createMergeNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseMergeNodeRunningProperty(MergeNodeRunningProperty object) {
				return createMergeNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenMergeNodeContainerProperty(ControlTokenMergeNodeContainerProperty object) {
				return createControlTokenMergeNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseMergeNodeHeldTokensProperty(MergeNodeHeldTokensProperty object) {
				return createMergeNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseMergeNodeIncomingProperty(MergeNodeIncomingProperty object) {
				return createMergeNodeIncomingPropertyAdapter();
			}
			@Override
			public Adapter caseMergeNodeOutgoingProperty(MergeNodeOutgoingProperty object) {
				return createMergeNodeOutgoingPropertyAdapter();
			}
			@Override
			public <T extends ForkNode> Adapter caseForkNodeProperty(ForkNodeProperty<T> object) {
				return createForkNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryForkNodeProperty(UnaryForkNodeProperty object) {
				return createUnaryForkNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryForkNodeProperty(BinaryForkNodeProperty object) {
				return createBinaryForkNodePropertyAdapter();
			}
			@Override
			public Adapter caseForkNodeNameProperty(ForkNodeNameProperty object) {
				return createForkNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseForkNodeActivityProperty(ForkNodeActivityProperty object) {
				return createForkNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseForkNodeRunningProperty(ForkNodeRunningProperty object) {
				return createForkNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenForkNodeContainerProperty(ControlTokenForkNodeContainerProperty object) {
				return createControlTokenForkNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseForkNodeHeldTokensProperty(ForkNodeHeldTokensProperty object) {
				return createForkNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseForkNodeIncomingProperty(ForkNodeIncomingProperty object) {
				return createForkNodeIncomingPropertyAdapter();
			}
			@Override
			public Adapter caseForkNodeOutgoingProperty(ForkNodeOutgoingProperty object) {
				return createForkNodeOutgoingPropertyAdapter();
			}
			@Override
			public <T extends JoinNode> Adapter caseJoinNodeProperty(JoinNodeProperty<T> object) {
				return createJoinNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryJoinNodeProperty(UnaryJoinNodeProperty object) {
				return createUnaryJoinNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryJoinNodeProperty(BinaryJoinNodeProperty object) {
				return createBinaryJoinNodePropertyAdapter();
			}
			@Override
			public Adapter caseJoinNodeNameProperty(JoinNodeNameProperty object) {
				return createJoinNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseJoinNodeActivityProperty(JoinNodeActivityProperty object) {
				return createJoinNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseJoinNodeRunningProperty(JoinNodeRunningProperty object) {
				return createJoinNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenJoinNodeContainerProperty(ControlTokenJoinNodeContainerProperty object) {
				return createControlTokenJoinNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseJoinNodeHeldTokensProperty(JoinNodeHeldTokensProperty object) {
				return createJoinNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseJoinNodeIncomingProperty(JoinNodeIncomingProperty object) {
				return createJoinNodeIncomingPropertyAdapter();
			}
			@Override
			public Adapter caseJoinNodeOutgoingProperty(JoinNodeOutgoingProperty object) {
				return createJoinNodeOutgoingPropertyAdapter();
			}
			@Override
			public <T extends FinalNode> Adapter caseFinalNodeProperty(FinalNodeProperty<T> object) {
				return createFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryFinalNodeProperty(UnaryFinalNodeProperty object) {
				return createUnaryFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryFinalNodeProperty(BinaryFinalNodeProperty object) {
				return createBinaryFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseFinalNodeNameProperty(FinalNodeNameProperty object) {
				return createFinalNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseFinalNodeActivityProperty(FinalNodeActivityProperty object) {
				return createFinalNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseFinalNodeRunningProperty(FinalNodeRunningProperty object) {
				return createFinalNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenFinalNodeContainerProperty(ControlTokenFinalNodeContainerProperty object) {
				return createControlTokenFinalNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseFinalNodeHeldTokensProperty(FinalNodeHeldTokensProperty object) {
				return createFinalNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseFinalNodeIncomingProperty(FinalNodeIncomingProperty object) {
				return createFinalNodeIncomingPropertyAdapter();
			}
			@Override
			public <T extends ActivityFinalNode> Adapter caseActivityFinalNodeProperty(ActivityFinalNodeProperty<T> object) {
				return createActivityFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryActivityFinalNodeProperty(UnaryActivityFinalNodeProperty object) {
				return createUnaryActivityFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryActivityFinalNodeProperty(BinaryActivityFinalNodeProperty object) {
				return createBinaryActivityFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeNameProperty(ActivityFinalNodeNameProperty object) {
				return createActivityFinalNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeActivityProperty(ActivityFinalNodeActivityProperty object) {
				return createActivityFinalNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeRunningProperty(ActivityFinalNodeRunningProperty object) {
				return createActivityFinalNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenActivityFinalNodeContainerProperty(ControlTokenActivityFinalNodeContainerProperty object) {
				return createControlTokenActivityFinalNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeHeldTokensProperty(ActivityFinalNodeHeldTokensProperty object) {
				return createActivityFinalNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeIncomingProperty(ActivityFinalNodeIncomingProperty object) {
				return createActivityFinalNodeIncomingPropertyAdapter();
			}
			@Override
			public <T extends FlowFinalNode> Adapter caseFlowFinalNodeProperty(FlowFinalNodeProperty<T> object) {
				return createFlowFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryFlowFinalNodeProperty(UnaryFlowFinalNodeProperty object) {
				return createUnaryFlowFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryFlowFinalNodeProperty(BinaryFlowFinalNodeProperty object) {
				return createBinaryFlowFinalNodePropertyAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeNameProperty(FlowFinalNodeNameProperty object) {
				return createFlowFinalNodeNamePropertyAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeActivityProperty(FlowFinalNodeActivityProperty object) {
				return createFlowFinalNodeActivityPropertyAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeRunningProperty(FlowFinalNodeRunningProperty object) {
				return createFlowFinalNodeRunningPropertyAdapter();
			}
			@Override
			public Adapter caseControlTokenFlowFinalNodeContainerProperty(ControlTokenFlowFinalNodeContainerProperty object) {
				return createControlTokenFlowFinalNodeContainerPropertyAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeHeldTokensProperty(FlowFinalNodeHeldTokensProperty object) {
				return createFlowFinalNodeHeldTokensPropertyAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeIncomingProperty(FlowFinalNodeIncomingProperty object) {
				return createFlowFinalNodeIncomingPropertyAdapter();
			}
			@Override
			public <T extends Value> Adapter caseValueProperty(ValueProperty<T> object) {
				return createValuePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryValueProperty(UnaryValueProperty object) {
				return createUnaryValuePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryValueProperty(BinaryValueProperty object) {
				return createBinaryValuePropertyAdapter();
			}
			@Override
			public <T extends IntegerExpression> Adapter caseIntegerExpressionProperty(IntegerExpressionProperty<T> object) {
				return createIntegerExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryIntegerExpressionProperty(UnaryIntegerExpressionProperty object) {
				return createUnaryIntegerExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryIntegerExpressionProperty(BinaryIntegerExpressionProperty object) {
				return createBinaryIntegerExpressionPropertyAdapter();
			}
			@Override
			public <T extends IntegerVariable> Adapter caseIntegerVariableProperty(IntegerVariableProperty<T> object) {
				return createIntegerVariablePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryIntegerVariableProperty(UnaryIntegerVariableProperty object) {
				return createUnaryIntegerVariablePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryIntegerVariableProperty(BinaryIntegerVariableProperty object) {
				return createBinaryIntegerVariablePropertyAdapter();
			}
			@Override
			public Adapter caseIntegerVariableNameProperty(IntegerVariableNameProperty object) {
				return createIntegerVariableNamePropertyAdapter();
			}
			@Override
			public Adapter caseIntegerVariableInitialValueProperty(IntegerVariableInitialValueProperty object) {
				return createIntegerVariableInitialValuePropertyAdapter();
			}
			@Override
			public Adapter caseIntegerVariableCurrentValueProperty(IntegerVariableCurrentValueProperty object) {
				return createIntegerVariableCurrentValuePropertyAdapter();
			}
			@Override
			public <T extends BooleanValue> Adapter caseBooleanValueProperty(BooleanValueProperty<T> object) {
				return createBooleanValuePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryBooleanValueProperty(UnaryBooleanValueProperty object) {
				return createUnaryBooleanValuePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryBooleanValueProperty(BinaryBooleanValueProperty object) {
				return createBinaryBooleanValuePropertyAdapter();
			}
			@Override
			public Adapter caseBooleanValueValueProperty(BooleanValueValueProperty object) {
				return createBooleanValueValuePropertyAdapter();
			}
			@Override
			public <T extends IntegerValue> Adapter caseIntegerValueProperty(IntegerValueProperty<T> object) {
				return createIntegerValuePropertyAdapter();
			}
			@Override
			public Adapter caseUnaryIntegerValueProperty(UnaryIntegerValueProperty object) {
				return createUnaryIntegerValuePropertyAdapter();
			}
			@Override
			public Adapter caseBinaryIntegerValueProperty(BinaryIntegerValueProperty object) {
				return createBinaryIntegerValuePropertyAdapter();
			}
			@Override
			public Adapter caseIntegerValueValueProperty(IntegerValueValueProperty object) {
				return createIntegerValueValuePropertyAdapter();
			}
			@Override
			public <T extends IntegerBinaryExpression> Adapter caseIntegerBinaryExpressionProperty(IntegerBinaryExpressionProperty<T> object) {
				return createIntegerBinaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryIntegerBinaryExpressionProperty(UnaryIntegerBinaryExpressionProperty object) {
				return createUnaryIntegerBinaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryIntegerBinaryExpressionProperty(BinaryIntegerBinaryExpressionProperty object) {
				return createBinaryIntegerBinaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseIntegerBinaryExpressionOperand1Property(IntegerBinaryExpressionOperand1Property object) {
				return createIntegerBinaryExpressionOperand1PropertyAdapter();
			}
			@Override
			public Adapter caseIntegerBinaryExpressionOperand2Property(IntegerBinaryExpressionOperand2Property object) {
				return createIntegerBinaryExpressionOperand2PropertyAdapter();
			}
			@Override
			public Adapter caseIntegerBinaryExpressionOperatorProperty(IntegerBinaryExpressionOperatorProperty object) {
				return createIntegerBinaryExpressionOperatorPropertyAdapter();
			}
			@Override
			public <T extends IntegerComparisonExpression> Adapter caseIntegerComparisonExpressionProperty(IntegerComparisonExpressionProperty<T> object) {
				return createIntegerComparisonExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryIntegerComparisonExpressionProperty(UnaryIntegerComparisonExpressionProperty object) {
				return createUnaryIntegerComparisonExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryIntegerComparisonExpressionProperty(BinaryIntegerComparisonExpressionProperty object) {
				return createBinaryIntegerComparisonExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpressionOperatorProperty(IntegerComparisonExpressionOperatorProperty object) {
				return createIntegerComparisonExpressionOperatorPropertyAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpressionOperand1Property(IntegerComparisonExpressionOperand1Property object) {
				return createIntegerComparisonExpressionOperand1PropertyAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpressionOperand2Property(IntegerComparisonExpressionOperand2Property object) {
				return createIntegerComparisonExpressionOperand2PropertyAdapter();
			}
			@Override
			public <T extends BooleanUnaryExpression> Adapter caseBooleanUnaryExpressionProperty(BooleanUnaryExpressionProperty<T> object) {
				return createBooleanUnaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryBooleanUnaryExpressionProperty(UnaryBooleanUnaryExpressionProperty object) {
				return createUnaryBooleanUnaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryBooleanUnaryExpressionProperty(BinaryBooleanUnaryExpressionProperty object) {
				return createBinaryBooleanUnaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBooleanUnaryExpressionOperandProperty(BooleanUnaryExpressionOperandProperty object) {
				return createBooleanUnaryExpressionOperandPropertyAdapter();
			}
			@Override
			public Adapter caseBooleanUnaryExpressionOperatorProperty(BooleanUnaryExpressionOperatorProperty object) {
				return createBooleanUnaryExpressionOperatorPropertyAdapter();
			}
			@Override
			public <T extends BooleanBinaryExpression> Adapter caseBooleanBinaryExpressionProperty(BooleanBinaryExpressionProperty<T> object) {
				return createBooleanBinaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryBooleanBinaryExpressionProperty(UnaryBooleanBinaryExpressionProperty object) {
				return createUnaryBooleanBinaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryBooleanBinaryExpressionProperty(BinaryBooleanBinaryExpressionProperty object) {
				return createBinaryBooleanBinaryExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpressionOperand1Property(BooleanBinaryExpressionOperand1Property object) {
				return createBooleanBinaryExpressionOperand1PropertyAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpressionOperand2Property(BooleanBinaryExpressionOperand2Property object) {
				return createBooleanBinaryExpressionOperand2PropertyAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpressionOperatorProperty(BooleanBinaryExpressionOperatorProperty object) {
				return createBooleanBinaryExpressionOperatorPropertyAdapter();
			}
			@Override
			public <T extends BooleanVariableAssignment> Adapter caseBooleanVariableAssignmentProperty(BooleanVariableAssignmentProperty<T> object) {
				return createBooleanVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryBooleanVariableAssignmentProperty(UnaryBooleanVariableAssignmentProperty object) {
				return createUnaryBooleanVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryBooleanVariableAssignmentProperty(BinaryBooleanVariableAssignmentProperty object) {
				return createBinaryBooleanVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseBooleanVariableAssignmentAssigneeProperty(BooleanVariableAssignmentAssigneeProperty object) {
				return createBooleanVariableAssignmentAssigneePropertyAdapter();
			}
			@Override
			public Adapter caseBooleanExpressionBooleanVariableAssignmentContainerProperty(BooleanExpressionBooleanVariableAssignmentContainerProperty object) {
				return createBooleanExpressionBooleanVariableAssignmentContainerPropertyAdapter();
			}
			@Override
			public Adapter caseBooleanVariableAssignmentExpressionProperty(BooleanVariableAssignmentExpressionProperty object) {
				return createBooleanVariableAssignmentExpressionPropertyAdapter();
			}
			@Override
			public <T extends IntegerVariableAssignment> Adapter caseIntegerVariableAssignmentProperty(IntegerVariableAssignmentProperty<T> object) {
				return createIntegerVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryIntegerVariableAssignmentProperty(UnaryIntegerVariableAssignmentProperty object) {
				return createUnaryIntegerVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryIntegerVariableAssignmentProperty(BinaryIntegerVariableAssignmentProperty object) {
				return createBinaryIntegerVariableAssignmentPropertyAdapter();
			}
			@Override
			public Adapter caseIntegerVariableAssignmentAssigneeProperty(IntegerVariableAssignmentAssigneeProperty object) {
				return createIntegerVariableAssignmentAssigneePropertyAdapter();
			}
			@Override
			public Adapter caseIntegerExpressionIntegerVariableAssignmentContainerProperty(IntegerExpressionIntegerVariableAssignmentContainerProperty object) {
				return createIntegerExpressionIntegerVariableAssignmentContainerPropertyAdapter();
			}
			@Override
			public Adapter caseIntegerVariableAssignmentExpressionProperty(IntegerVariableAssignmentExpressionProperty object) {
				return createIntegerVariableAssignmentExpressionPropertyAdapter();
			}
			@Override
			public <T extends Offer> Adapter caseOfferProperty(OfferProperty<T> object) {
				return createOfferPropertyAdapter();
			}
			@Override
			public Adapter caseUnaryOfferProperty(UnaryOfferProperty object) {
				return createUnaryOfferPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryOfferProperty(BinaryOfferProperty object) {
				return createBinaryOfferPropertyAdapter();
			}
			@Override
			public Adapter caseXActivityDiagramNextProperty(XActivityDiagramNextProperty object) {
				return createXActivityDiagramNextPropertyAdapter();
			}
			@Override
			public Adapter caseXActivityDiagramUntilProperty(XActivityDiagramUntilProperty object) {
				return createXActivityDiagramUntilPropertyAdapter();
			}
			@Override
			public Adapter caseXActivityDiagramReleaseProperty(XActivityDiagramReleaseProperty object) {
				return createXActivityDiagramReleasePropertyAdapter();
			}
			@Override
			public Adapter caseXActivityDiagramNegationTemporalProperty(XActivityDiagramNegationTemporalProperty object) {
				return createXActivityDiagramNegationTemporalPropertyAdapter();
			}
			@Override
			public Adapter caseAbstractProperty(AbstractProperty object) {
				return createAbstractPropertyAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public <T> Adapter caseStepProperty(StepProperty<T> object) {
				return createStepPropertyAdapter();
			}
			@Override
			public Adapter caseTemporalProperty(TemporalProperty object) {
				return createTemporalPropertyAdapter();
			}
			@Override
			public <T> Adapter caseStateProperty(StateProperty<T> object) {
				return createStatePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseUnaryProperty(UnaryProperty<P, T> object) {
				return createUnaryPropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseBinaryProperty(BinaryProperty<P, T> object) {
				return createBinaryPropertyAdapter();
			}
			@Override
			public <T> Adapter caseStringAttributeProperty(StringAttributeProperty<T> object) {
				return createStringAttributePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseContainerReferenceProperty(ContainerReferenceProperty<P, T> object) {
				return createContainerReferencePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseManyReferenceProperty(ManyReferenceProperty<P, T> object) {
				return createManyReferencePropertyAdapter();
			}
			@Override
			public <P extends StateProperty<?>, T> Adapter caseSingleReferenceProperty(SingleReferenceProperty<P, T> object) {
				return createSingleReferencePropertyAdapter();
			}
			@Override
			public <T> Adapter caseBooleanAttributeProperty(BooleanAttributeProperty<T> object) {
				return createBooleanAttributePropertyAdapter();
			}
			@Override
			public <T> Adapter caseIntegerAttributeProperty(IntegerAttributeProperty<T> object) {
				return createIntegerAttributePropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseNextProperty(NextProperty<P> object) {
				return createNextPropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseUntilProperty(UntilProperty<P> object) {
				return createUntilPropertyAdapter();
			}
			@Override
			public <P extends AbstractProperty> Adapter caseReleaseProperty(ReleaseProperty<P> object) {
				return createReleasePropertyAdapter();
			}
			@Override
			public <P extends TemporalProperty> Adapter caseNegationTemporalProperty(NegationTemporalProperty<P> object) {
				return createNegationTemporalPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeExecuteProperty <em>Join Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeExecuteProperty
	 * @generated
	 */
	public Adapter createJoinNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeExecuteProperty <em>Final Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeExecuteProperty
	 * @generated
	 */
	public Adapter createFinalNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeExecuteProperty <em>Decision Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeExecuteProperty
	 * @generated
	 */
	public Adapter createDecisionNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeExecuteProperty <em>Activity Final Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeExecuteProperty
	 * @generated
	 */
	public Adapter createActivityFinalNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeTerminateProperty <em>Activity Node Terminate Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeTerminateProperty
	 * @generated
	 */
	public Adapter createActivityNodeTerminatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionExecuteProperty <em>Opaque Action Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionExecuteProperty
	 * @generated
	 */
	public Adapter createOpaqueActionExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeAddTokenProperty <em>Activity Node Add Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeAddTokenProperty
	 * @generated
	 */
	public Adapter createActivityNodeAddTokenPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentExecuteProperty <em>Variable Assignment Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentExecuteProperty
	 * @generated
	 */
	public Adapter createVariableAssignmentExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeExecuteProperty <em>Merge Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeExecuteProperty
	 * @generated
	 */
	public Adapter createMergeNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableInitProperty <em>Variable Init Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableInitProperty
	 * @generated
	 */
	public Adapter createVariableInitPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityExecuteProperty <em>Activity Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityExecuteProperty
	 * @generated
	 */
	public Adapter createActivityExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeExecuteProperty <em>Fork Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeExecuteProperty
	 * @generated
	 */
	public Adapter createForkNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionExecuteProperty <em>Accept Event Action Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionExecuteProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeExecuteProperty <em>Flow Final Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeExecuteProperty
	 * @generated
	 */
	public Adapter createFlowFinalNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeExecuteProperty <em>Initial Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeExecuteProperty
	 * @generated
	 */
	public Adapter createInitialNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentExecuteProperty <em>Boolean Variable Assignment Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentExecuteProperty
	 * @generated
	 */
	public Adapter createBooleanVariableAssignmentExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeRemoveTokenProperty <em>Activity Node Remove Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeRemoveTokenProperty
	 * @generated
	 */
	public Adapter createActivityNodeRemoveTokenPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExecuteProperty <em>Integer Variable Assignment Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExecuteProperty
	 * @generated
	 */
	public Adapter createIntegerVariableAssignmentExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionAcceptProperty <em>Accept Event Action Accept Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionAcceptProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionAcceptPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeExecuteProperty <em>Activity Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeExecuteProperty
	 * @generated
	 */
	public Adapter createActivityNodeExecutePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionWaitForEventProperty <em>Accept Event Action Wait For Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionWaitForEventProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionWaitForEventPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramAbstractProperty <em>XActivity Diagram Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramAbstractProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramAbstractPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramTemporalProperty <em>XActivity Diagram Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramTemporalProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty <em>XActivity Diagram Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramStateProperty <em>XActivity Diagram State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramStateProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramStatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramStepProperty <em>XActivity Diagram Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramStepProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramStepPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.NamedElementProperty <em>Named Element Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.NamedElementProperty
	 * @generated
	 */
	public Adapter createNamedElementPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryNamedElementProperty <em>Unary Named Element Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryNamedElementProperty
	 * @generated
	 */
	public Adapter createUnaryNamedElementPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryNamedElementProperty <em>Binary Named Element Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryNamedElementProperty
	 * @generated
	 */
	public Adapter createBinaryNamedElementPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.NamedElementNameProperty <em>Named Element Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.NamedElementNameProperty
	 * @generated
	 */
	public Adapter createNamedElementNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityProperty <em>Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityProperty
	 * @generated
	 */
	public Adapter createActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityProperty <em>Unary Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityProperty
	 * @generated
	 */
	public Adapter createUnaryActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityProperty <em>Binary Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityProperty
	 * @generated
	 */
	public Adapter createBinaryActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNameProperty <em>Activity Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNameProperty
	 * @generated
	 */
	public Adapter createActivityNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventActivityContainerProperty <em>Event Activity Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventActivityContainerProperty
	 * @generated
	 */
	public Adapter createEventActivityContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventProperty <em>Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventProperty
	 * @generated
	 */
	public Adapter createEventPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryEventProperty <em>Unary Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryEventProperty
	 * @generated
	 */
	public Adapter createUnaryEventPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryEventProperty <em>Binary Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryEventProperty
	 * @generated
	 */
	public Adapter createBinaryEventPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventNameProperty <em>Event Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventNameProperty
	 * @generated
	 */
	public Adapter createEventNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEventsProperty <em>Activity Events Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEventsProperty
	 * @generated
	 */
	public Adapter createActivityEventsPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodesProperty <em>Activity Nodes Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodesProperty
	 * @generated
	 */
	public Adapter createActivityNodesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeProperty <em>Activity Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeProperty
	 * @generated
	 */
	public Adapter createActivityNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityNodeProperty <em>Unary Activity Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityNodeProperty
	 * @generated
	 */
	public Adapter createUnaryActivityNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityNodeProperty <em>Binary Activity Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityNodeProperty
	 * @generated
	 */
	public Adapter createBinaryActivityNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeNameProperty <em>Activity Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeNameProperty
	 * @generated
	 */
	public Adapter createActivityNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeActivityProperty <em>Activity Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeActivityProperty
	 * @generated
	 */
	public Adapter createActivityNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeRunningProperty <em>Activity Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeRunningProperty
	 * @generated
	 */
	public Adapter createActivityNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityNodeContainerProperty <em>Control Token Activity Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenActivityNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenProperty <em>Control Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenProperty
	 * @generated
	 */
	public Adapter createControlTokenPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlTokenProperty <em>Unary Control Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlTokenProperty
	 * @generated
	 */
	public Adapter createUnaryControlTokenPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlTokenProperty <em>Binary Control Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlTokenProperty
	 * @generated
	 */
	public Adapter createBinaryControlTokenPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeHeldTokensProperty <em>Activity Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createActivityNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeActivityContainerProperty <em>Activity Edge Activity Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeActivityContainerProperty
	 * @generated
	 */
	public Adapter createActivityEdgeActivityContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeProperty <em>Activity Edge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeProperty
	 * @generated
	 */
	public Adapter createActivityEdgePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityEdgeProperty <em>Unary Activity Edge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityEdgeProperty
	 * @generated
	 */
	public Adapter createUnaryActivityEdgePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityEdgeProperty <em>Binary Activity Edge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityEdgeProperty
	 * @generated
	 */
	public Adapter createBinaryActivityEdgePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeNameProperty <em>Activity Edge Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeNameProperty
	 * @generated
	 */
	public Adapter createActivityEdgeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeSourceProperty <em>Activity Edge Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeSourceProperty
	 * @generated
	 */
	public Adapter createActivityEdgeSourcePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeTargetProperty <em>Activity Edge Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeTargetProperty
	 * @generated
	 */
	public Adapter createActivityEdgeTargetPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityEdgeContainerProperty <em>Control Token Activity Edge Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityEdgeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenActivityEdgeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeOfferedTokensProperty <em>Activity Edge Offered Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeOfferedTokensProperty
	 * @generated
	 */
	public Adapter createActivityEdgeOfferedTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgesProperty <em>Activity Edges Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgesProperty
	 * @generated
	 */
	public Adapter createActivityEdgesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableActivityContainerProperty <em>Variable Activity Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableActivityContainerProperty
	 * @generated
	 */
	public Adapter createVariableActivityContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableProperty <em>Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableProperty
	 * @generated
	 */
	public Adapter createVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ExpressionProperty <em>Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ExpressionProperty
	 * @generated
	 */
	public Adapter createExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryExpressionProperty <em>Unary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryExpressionProperty
	 * @generated
	 */
	public Adapter createUnaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryExpressionProperty <em>Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryExpressionProperty
	 * @generated
	 */
	public Adapter createBinaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryVariableProperty <em>Unary Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryVariableProperty
	 * @generated
	 */
	public Adapter createUnaryVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryVariableProperty <em>Binary Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryVariableProperty
	 * @generated
	 */
	public Adapter createBinaryVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableNameProperty <em>Variable Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableNameProperty
	 * @generated
	 */
	public Adapter createVariableNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityLocalsProperty <em>Activity Locals Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityLocalsProperty
	 * @generated
	 */
	public Adapter createActivityLocalsPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowProperty <em>Control Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowProperty
	 * @generated
	 */
	public Adapter createControlFlowPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlFlowProperty <em>Unary Control Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlFlowProperty
	 * @generated
	 */
	public Adapter createUnaryControlFlowPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlFlowProperty <em>Binary Control Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlFlowProperty
	 * @generated
	 */
	public Adapter createBinaryControlFlowPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowNameProperty <em>Control Flow Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowNameProperty
	 * @generated
	 */
	public Adapter createControlFlowNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowSourceProperty <em>Control Flow Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowSourceProperty
	 * @generated
	 */
	public Adapter createControlFlowSourcePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowTargetProperty <em>Control Flow Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowTargetProperty
	 * @generated
	 */
	public Adapter createControlFlowTargetPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenControlFlowContainerProperty <em>Control Token Control Flow Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenControlFlowContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenControlFlowContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowOfferedTokensProperty <em>Control Flow Offered Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowOfferedTokensProperty
	 * @generated
	 */
	public Adapter createControlFlowOfferedTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowGuardProperty <em>Control Flow Guard Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowGuardProperty
	 * @generated
	 */
	public Adapter createControlFlowGuardPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableProperty <em>Boolean Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableProperty
	 * @generated
	 */
	public Adapter createBooleanVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanExpressionProperty <em>Boolean Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanExpressionProperty
	 * @generated
	 */
	public Adapter createBooleanExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanExpressionProperty <em>Unary Boolean Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanExpressionProperty
	 * @generated
	 */
	public Adapter createUnaryBooleanExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanExpressionProperty <em>Binary Boolean Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanExpressionProperty
	 * @generated
	 */
	public Adapter createBinaryBooleanExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanVariableProperty <em>Unary Boolean Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanVariableProperty
	 * @generated
	 */
	public Adapter createUnaryBooleanVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanVariableProperty <em>Binary Boolean Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanVariableProperty
	 * @generated
	 */
	public Adapter createBinaryBooleanVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableNameProperty <em>Boolean Variable Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableNameProperty
	 * @generated
	 */
	public Adapter createBooleanVariableNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableInitialValueProperty <em>Boolean Variable Initial Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableInitialValueProperty
	 * @generated
	 */
	public Adapter createBooleanVariableInitialValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableCurrentValueProperty <em>Boolean Variable Current Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableCurrentValueProperty
	 * @generated
	 */
	public Adapter createBooleanVariableCurrentValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionProperty <em>Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionProperty
	 * @generated
	 */
	public Adapter createActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActionProperty <em>Unary Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActionProperty
	 * @generated
	 */
	public Adapter createUnaryActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActionProperty <em>Binary Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActionProperty
	 * @generated
	 */
	public Adapter createBinaryActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionNameProperty <em>Action Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionNameProperty
	 * @generated
	 */
	public Adapter createActionNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionActivityProperty <em>Action Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionActivityProperty
	 * @generated
	 */
	public Adapter createActionActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionRunningProperty <em>Action Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionRunningProperty
	 * @generated
	 */
	public Adapter createActionRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActionContainerProperty <em>Control Token Action Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActionContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenActionContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionHeldTokensProperty <em>Action Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionHeldTokensProperty
	 * @generated
	 */
	public Adapter createActionHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionIncomingProperty <em>Action Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionIncomingProperty
	 * @generated
	 */
	public Adapter createActionIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionOutgoingProperty <em>Action Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionOutgoingProperty
	 * @generated
	 */
	public Adapter createActionOutgoingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionProperty <em>Opaque Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionProperty
	 * @generated
	 */
	public Adapter createOpaqueActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryOpaqueActionProperty <em>Unary Opaque Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryOpaqueActionProperty
	 * @generated
	 */
	public Adapter createUnaryOpaqueActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryOpaqueActionProperty <em>Binary Opaque Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryOpaqueActionProperty
	 * @generated
	 */
	public Adapter createBinaryOpaqueActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionNameProperty <em>Opaque Action Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionNameProperty
	 * @generated
	 */
	public Adapter createOpaqueActionNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionActivityProperty <em>Opaque Action Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionActivityProperty
	 * @generated
	 */
	public Adapter createOpaqueActionActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionRunningProperty <em>Opaque Action Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionRunningProperty
	 * @generated
	 */
	public Adapter createOpaqueActionRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenOpaqueActionContainerProperty <em>Control Token Opaque Action Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenOpaqueActionContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenOpaqueActionContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionHeldTokensProperty <em>Opaque Action Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionHeldTokensProperty
	 * @generated
	 */
	public Adapter createOpaqueActionHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionIncomingProperty <em>Opaque Action Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionIncomingProperty
	 * @generated
	 */
	public Adapter createOpaqueActionIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionOutgoingProperty <em>Opaque Action Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionOutgoingProperty
	 * @generated
	 */
	public Adapter createOpaqueActionOutgoingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentOpaqueActionContainerProperty <em>Variable Assignment Opaque Action Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentOpaqueActionContainerProperty
	 * @generated
	 */
	public Adapter createVariableAssignmentOpaqueActionContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentProperty <em>Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentProperty
	 * @generated
	 */
	public Adapter createVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryVariableAssignmentProperty <em>Unary Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryVariableAssignmentProperty
	 * @generated
	 */
	public Adapter createUnaryVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryVariableAssignmentProperty <em>Binary Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryVariableAssignmentProperty
	 * @generated
	 */
	public Adapter createBinaryVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionAssignmentsProperty <em>Opaque Action Assignments Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionAssignmentsProperty
	 * @generated
	 */
	public Adapter createOpaqueActionAssignmentsPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionProperty <em>Accept Event Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryAcceptEventActionProperty <em>Unary Accept Event Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryAcceptEventActionProperty
	 * @generated
	 */
	public Adapter createUnaryAcceptEventActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryAcceptEventActionProperty <em>Binary Accept Event Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryAcceptEventActionProperty
	 * @generated
	 */
	public Adapter createBinaryAcceptEventActionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionNameProperty <em>Accept Event Action Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionNameProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionActivityProperty <em>Accept Event Action Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionActivityProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionRunningProperty <em>Accept Event Action Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionRunningProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenAcceptEventActionContainerProperty <em>Control Token Accept Event Action Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenAcceptEventActionContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenAcceptEventActionContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionHeldTokensProperty <em>Accept Event Action Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionHeldTokensProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionEventTypeProperty <em>Accept Event Action Event Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionEventTypeProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionEventTypePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionIncomingProperty <em>Accept Event Action Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionIncomingProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionOutgoingProperty <em>Accept Event Action Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionOutgoingProperty
	 * @generated
	 */
	public Adapter createAcceptEventActionOutgoingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeProperty <em>Control Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeProperty
	 * @generated
	 */
	public Adapter createControlNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlNodeProperty <em>Unary Control Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlNodeProperty
	 * @generated
	 */
	public Adapter createUnaryControlNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlNodeProperty <em>Binary Control Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlNodeProperty
	 * @generated
	 */
	public Adapter createBinaryControlNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeNameProperty <em>Control Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeNameProperty
	 * @generated
	 */
	public Adapter createControlNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeActivityProperty <em>Control Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeActivityProperty
	 * @generated
	 */
	public Adapter createControlNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeRunningProperty <em>Control Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeRunningProperty
	 * @generated
	 */
	public Adapter createControlNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenControlNodeContainerProperty <em>Control Token Control Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenControlNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenControlNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeHeldTokensProperty <em>Control Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createControlNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeProperty <em>Initial Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeProperty
	 * @generated
	 */
	public Adapter createInitialNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryInitialNodeProperty <em>Unary Initial Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryInitialNodeProperty
	 * @generated
	 */
	public Adapter createUnaryInitialNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryInitialNodeProperty <em>Binary Initial Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryInitialNodeProperty
	 * @generated
	 */
	public Adapter createBinaryInitialNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeNameProperty <em>Initial Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeNameProperty
	 * @generated
	 */
	public Adapter createInitialNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeActivityProperty <em>Initial Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeActivityProperty
	 * @generated
	 */
	public Adapter createInitialNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeRunningProperty <em>Initial Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeRunningProperty
	 * @generated
	 */
	public Adapter createInitialNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenInitialNodeContainerProperty <em>Control Token Initial Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenInitialNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenInitialNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeHeldTokensProperty <em>Initial Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createInitialNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeOutgoingProperty <em>Initial Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeOutgoingProperty
	 * @generated
	 */
	public Adapter createInitialNodeOutgoingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeProperty <em>Decision Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeProperty
	 * @generated
	 */
	public Adapter createDecisionNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryDecisionNodeProperty <em>Unary Decision Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryDecisionNodeProperty
	 * @generated
	 */
	public Adapter createUnaryDecisionNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryDecisionNodeProperty <em>Binary Decision Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryDecisionNodeProperty
	 * @generated
	 */
	public Adapter createBinaryDecisionNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeNameProperty <em>Decision Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeNameProperty
	 * @generated
	 */
	public Adapter createDecisionNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeActivityProperty <em>Decision Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeActivityProperty
	 * @generated
	 */
	public Adapter createDecisionNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeRunningProperty <em>Decision Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeRunningProperty
	 * @generated
	 */
	public Adapter createDecisionNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenDecisionNodeContainerProperty <em>Control Token Decision Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenDecisionNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenDecisionNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeHeldTokensProperty <em>Decision Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createDecisionNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeIncomingProperty <em>Decision Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeIncomingProperty
	 * @generated
	 */
	public Adapter createDecisionNodeIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeOutgoingProperty <em>Decision Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeOutgoingProperty
	 * @generated
	 */
	public Adapter createDecisionNodeOutgoingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeProperty <em>Merge Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeProperty
	 * @generated
	 */
	public Adapter createMergeNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryMergeNodeProperty <em>Unary Merge Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryMergeNodeProperty
	 * @generated
	 */
	public Adapter createUnaryMergeNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryMergeNodeProperty <em>Binary Merge Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryMergeNodeProperty
	 * @generated
	 */
	public Adapter createBinaryMergeNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeNameProperty <em>Merge Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeNameProperty
	 * @generated
	 */
	public Adapter createMergeNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeActivityProperty <em>Merge Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeActivityProperty
	 * @generated
	 */
	public Adapter createMergeNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeRunningProperty <em>Merge Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeRunningProperty
	 * @generated
	 */
	public Adapter createMergeNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenMergeNodeContainerProperty <em>Control Token Merge Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenMergeNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenMergeNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeHeldTokensProperty <em>Merge Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createMergeNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeIncomingProperty <em>Merge Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeIncomingProperty
	 * @generated
	 */
	public Adapter createMergeNodeIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeOutgoingProperty <em>Merge Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeOutgoingProperty
	 * @generated
	 */
	public Adapter createMergeNodeOutgoingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeProperty <em>Fork Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeProperty
	 * @generated
	 */
	public Adapter createForkNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryForkNodeProperty <em>Unary Fork Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryForkNodeProperty
	 * @generated
	 */
	public Adapter createUnaryForkNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryForkNodeProperty <em>Binary Fork Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryForkNodeProperty
	 * @generated
	 */
	public Adapter createBinaryForkNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeNameProperty <em>Fork Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeNameProperty
	 * @generated
	 */
	public Adapter createForkNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeActivityProperty <em>Fork Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeActivityProperty
	 * @generated
	 */
	public Adapter createForkNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeRunningProperty <em>Fork Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeRunningProperty
	 * @generated
	 */
	public Adapter createForkNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenForkNodeContainerProperty <em>Control Token Fork Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenForkNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenForkNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeHeldTokensProperty <em>Fork Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createForkNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeIncomingProperty <em>Fork Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeIncomingProperty
	 * @generated
	 */
	public Adapter createForkNodeIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeOutgoingProperty <em>Fork Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeOutgoingProperty
	 * @generated
	 */
	public Adapter createForkNodeOutgoingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeProperty <em>Join Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeProperty
	 * @generated
	 */
	public Adapter createJoinNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryJoinNodeProperty <em>Unary Join Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryJoinNodeProperty
	 * @generated
	 */
	public Adapter createUnaryJoinNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryJoinNodeProperty <em>Binary Join Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryJoinNodeProperty
	 * @generated
	 */
	public Adapter createBinaryJoinNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeNameProperty <em>Join Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeNameProperty
	 * @generated
	 */
	public Adapter createJoinNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeActivityProperty <em>Join Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeActivityProperty
	 * @generated
	 */
	public Adapter createJoinNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeRunningProperty <em>Join Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeRunningProperty
	 * @generated
	 */
	public Adapter createJoinNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenJoinNodeContainerProperty <em>Control Token Join Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenJoinNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenJoinNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeHeldTokensProperty <em>Join Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createJoinNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeIncomingProperty <em>Join Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeIncomingProperty
	 * @generated
	 */
	public Adapter createJoinNodeIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeOutgoingProperty <em>Join Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeOutgoingProperty
	 * @generated
	 */
	public Adapter createJoinNodeOutgoingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeProperty <em>Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeProperty
	 * @generated
	 */
	public Adapter createFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryFinalNodeProperty <em>Unary Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryFinalNodeProperty
	 * @generated
	 */
	public Adapter createUnaryFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryFinalNodeProperty <em>Binary Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryFinalNodeProperty
	 * @generated
	 */
	public Adapter createBinaryFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeNameProperty <em>Final Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeNameProperty
	 * @generated
	 */
	public Adapter createFinalNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeActivityProperty <em>Final Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeActivityProperty
	 * @generated
	 */
	public Adapter createFinalNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeRunningProperty <em>Final Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeRunningProperty
	 * @generated
	 */
	public Adapter createFinalNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenFinalNodeContainerProperty <em>Control Token Final Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenFinalNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenFinalNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeHeldTokensProperty <em>Final Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createFinalNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeIncomingProperty <em>Final Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeIncomingProperty
	 * @generated
	 */
	public Adapter createFinalNodeIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeProperty <em>Activity Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeProperty
	 * @generated
	 */
	public Adapter createActivityFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityFinalNodeProperty <em>Unary Activity Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityFinalNodeProperty
	 * @generated
	 */
	public Adapter createUnaryActivityFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityFinalNodeProperty <em>Binary Activity Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityFinalNodeProperty
	 * @generated
	 */
	public Adapter createBinaryActivityFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeNameProperty <em>Activity Final Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeNameProperty
	 * @generated
	 */
	public Adapter createActivityFinalNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeActivityProperty <em>Activity Final Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeActivityProperty
	 * @generated
	 */
	public Adapter createActivityFinalNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeRunningProperty <em>Activity Final Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeRunningProperty
	 * @generated
	 */
	public Adapter createActivityFinalNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityFinalNodeContainerProperty <em>Control Token Activity Final Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityFinalNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenActivityFinalNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeHeldTokensProperty <em>Activity Final Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createActivityFinalNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeIncomingProperty <em>Activity Final Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeIncomingProperty
	 * @generated
	 */
	public Adapter createActivityFinalNodeIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeProperty <em>Flow Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeProperty
	 * @generated
	 */
	public Adapter createFlowFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryFlowFinalNodeProperty <em>Unary Flow Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryFlowFinalNodeProperty
	 * @generated
	 */
	public Adapter createUnaryFlowFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryFlowFinalNodeProperty <em>Binary Flow Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryFlowFinalNodeProperty
	 * @generated
	 */
	public Adapter createBinaryFlowFinalNodePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeNameProperty <em>Flow Final Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeNameProperty
	 * @generated
	 */
	public Adapter createFlowFinalNodeNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeActivityProperty <em>Flow Final Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeActivityProperty
	 * @generated
	 */
	public Adapter createFlowFinalNodeActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeRunningProperty <em>Flow Final Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeRunningProperty
	 * @generated
	 */
	public Adapter createFlowFinalNodeRunningPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenFlowFinalNodeContainerProperty <em>Control Token Flow Final Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenFlowFinalNodeContainerProperty
	 * @generated
	 */
	public Adapter createControlTokenFlowFinalNodeContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeHeldTokensProperty <em>Flow Final Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeHeldTokensProperty
	 * @generated
	 */
	public Adapter createFlowFinalNodeHeldTokensPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeIncomingProperty <em>Flow Final Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeIncomingProperty
	 * @generated
	 */
	public Adapter createFlowFinalNodeIncomingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ValueProperty <em>Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ValueProperty
	 * @generated
	 */
	public Adapter createValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryValueProperty <em>Unary Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryValueProperty
	 * @generated
	 */
	public Adapter createUnaryValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryValueProperty <em>Binary Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryValueProperty
	 * @generated
	 */
	public Adapter createBinaryValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionProperty <em>Integer Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionProperty
	 * @generated
	 */
	public Adapter createIntegerExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerExpressionProperty <em>Unary Integer Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerExpressionProperty
	 * @generated
	 */
	public Adapter createUnaryIntegerExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerExpressionProperty <em>Binary Integer Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerExpressionProperty
	 * @generated
	 */
	public Adapter createBinaryIntegerExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableProperty <em>Integer Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableProperty
	 * @generated
	 */
	public Adapter createIntegerVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerVariableProperty <em>Unary Integer Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerVariableProperty
	 * @generated
	 */
	public Adapter createUnaryIntegerVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableProperty <em>Binary Integer Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableProperty
	 * @generated
	 */
	public Adapter createBinaryIntegerVariablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableNameProperty <em>Integer Variable Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableNameProperty
	 * @generated
	 */
	public Adapter createIntegerVariableNamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableInitialValueProperty <em>Integer Variable Initial Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableInitialValueProperty
	 * @generated
	 */
	public Adapter createIntegerVariableInitialValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableCurrentValueProperty <em>Integer Variable Current Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableCurrentValueProperty
	 * @generated
	 */
	public Adapter createIntegerVariableCurrentValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanValueProperty <em>Boolean Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanValueProperty
	 * @generated
	 */
	public Adapter createBooleanValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanValueProperty <em>Unary Boolean Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanValueProperty
	 * @generated
	 */
	public Adapter createUnaryBooleanValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanValueProperty <em>Binary Boolean Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanValueProperty
	 * @generated
	 */
	public Adapter createBinaryBooleanValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanValueValueProperty <em>Boolean Value Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanValueValueProperty
	 * @generated
	 */
	public Adapter createBooleanValueValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerValueProperty <em>Integer Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerValueProperty
	 * @generated
	 */
	public Adapter createIntegerValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerValueProperty <em>Unary Integer Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerValueProperty
	 * @generated
	 */
	public Adapter createUnaryIntegerValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerValueProperty <em>Binary Integer Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerValueProperty
	 * @generated
	 */
	public Adapter createBinaryIntegerValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerValueValueProperty <em>Integer Value Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerValueValueProperty
	 * @generated
	 */
	public Adapter createIntegerValueValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionProperty <em>Integer Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionProperty
	 * @generated
	 */
	public Adapter createIntegerBinaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerBinaryExpressionProperty <em>Unary Integer Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerBinaryExpressionProperty
	 * @generated
	 */
	public Adapter createUnaryIntegerBinaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerBinaryExpressionProperty <em>Binary Integer Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerBinaryExpressionProperty
	 * @generated
	 */
	public Adapter createBinaryIntegerBinaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand1Property <em>Integer Binary Expression Operand1 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand1Property
	 * @generated
	 */
	public Adapter createIntegerBinaryExpressionOperand1PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand2Property <em>Integer Binary Expression Operand2 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand2Property
	 * @generated
	 */
	public Adapter createIntegerBinaryExpressionOperand2PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperatorProperty <em>Integer Binary Expression Operator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperatorProperty
	 * @generated
	 */
	public Adapter createIntegerBinaryExpressionOperatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionProperty <em>Integer Comparison Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionProperty
	 * @generated
	 */
	public Adapter createIntegerComparisonExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerComparisonExpressionProperty <em>Unary Integer Comparison Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerComparisonExpressionProperty
	 * @generated
	 */
	public Adapter createUnaryIntegerComparisonExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerComparisonExpressionProperty <em>Binary Integer Comparison Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerComparisonExpressionProperty
	 * @generated
	 */
	public Adapter createBinaryIntegerComparisonExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperatorProperty <em>Integer Comparison Expression Operator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperatorProperty
	 * @generated
	 */
	public Adapter createIntegerComparisonExpressionOperatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperand1Property <em>Integer Comparison Expression Operand1 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperand1Property
	 * @generated
	 */
	public Adapter createIntegerComparisonExpressionOperand1PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperand2Property <em>Integer Comparison Expression Operand2 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperand2Property
	 * @generated
	 */
	public Adapter createIntegerComparisonExpressionOperand2PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionProperty <em>Boolean Unary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionProperty
	 * @generated
	 */
	public Adapter createBooleanUnaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanUnaryExpressionProperty <em>Unary Boolean Unary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanUnaryExpressionProperty
	 * @generated
	 */
	public Adapter createUnaryBooleanUnaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanUnaryExpressionProperty <em>Binary Boolean Unary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanUnaryExpressionProperty
	 * @generated
	 */
	public Adapter createBinaryBooleanUnaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionOperandProperty <em>Boolean Unary Expression Operand Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionOperandProperty
	 * @generated
	 */
	public Adapter createBooleanUnaryExpressionOperandPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionOperatorProperty <em>Boolean Unary Expression Operator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionOperatorProperty
	 * @generated
	 */
	public Adapter createBooleanUnaryExpressionOperatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionProperty <em>Boolean Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionProperty
	 * @generated
	 */
	public Adapter createBooleanBinaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanBinaryExpressionProperty <em>Unary Boolean Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanBinaryExpressionProperty
	 * @generated
	 */
	public Adapter createUnaryBooleanBinaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanBinaryExpressionProperty <em>Binary Boolean Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanBinaryExpressionProperty
	 * @generated
	 */
	public Adapter createBinaryBooleanBinaryExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperand1Property <em>Boolean Binary Expression Operand1 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperand1Property
	 * @generated
	 */
	public Adapter createBooleanBinaryExpressionOperand1PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperand2Property <em>Boolean Binary Expression Operand2 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperand2Property
	 * @generated
	 */
	public Adapter createBooleanBinaryExpressionOperand2PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperatorProperty <em>Boolean Binary Expression Operator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperatorProperty
	 * @generated
	 */
	public Adapter createBooleanBinaryExpressionOperatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentProperty <em>Boolean Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentProperty
	 * @generated
	 */
	public Adapter createBooleanVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanVariableAssignmentProperty <em>Unary Boolean Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanVariableAssignmentProperty
	 * @generated
	 */
	public Adapter createUnaryBooleanVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanVariableAssignmentProperty <em>Binary Boolean Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanVariableAssignmentProperty
	 * @generated
	 */
	public Adapter createBinaryBooleanVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentAssigneeProperty <em>Boolean Variable Assignment Assignee Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentAssigneeProperty
	 * @generated
	 */
	public Adapter createBooleanVariableAssignmentAssigneePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanExpressionBooleanVariableAssignmentContainerProperty <em>Boolean Expression Boolean Variable Assignment Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanExpressionBooleanVariableAssignmentContainerProperty
	 * @generated
	 */
	public Adapter createBooleanExpressionBooleanVariableAssignmentContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentExpressionProperty <em>Boolean Variable Assignment Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentExpressionProperty
	 * @generated
	 */
	public Adapter createBooleanVariableAssignmentExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentProperty <em>Integer Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentProperty
	 * @generated
	 */
	public Adapter createIntegerVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerVariableAssignmentProperty <em>Unary Integer Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerVariableAssignmentProperty
	 * @generated
	 */
	public Adapter createUnaryIntegerVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableAssignmentProperty <em>Binary Integer Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableAssignmentProperty
	 * @generated
	 */
	public Adapter createBinaryIntegerVariableAssignmentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentAssigneeProperty <em>Integer Variable Assignment Assignee Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentAssigneeProperty
	 * @generated
	 */
	public Adapter createIntegerVariableAssignmentAssigneePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionIntegerVariableAssignmentContainerProperty <em>Integer Expression Integer Variable Assignment Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionIntegerVariableAssignmentContainerProperty
	 * @generated
	 */
	public Adapter createIntegerExpressionIntegerVariableAssignmentContainerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExpressionProperty <em>Integer Variable Assignment Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExpressionProperty
	 * @generated
	 */
	public Adapter createIntegerVariableAssignmentExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OfferProperty <em>Offer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OfferProperty
	 * @generated
	 */
	public Adapter createOfferPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryOfferProperty <em>Unary Offer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryOfferProperty
	 * @generated
	 */
	public Adapter createUnaryOfferPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryOfferProperty <em>Binary Offer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryOfferProperty
	 * @generated
	 */
	public Adapter createBinaryOfferPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramNextProperty <em>XActivity Diagram Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramNextProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramNextPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramUntilProperty <em>XActivity Diagram Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramUntilProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramUntilPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramReleaseProperty <em>XActivity Diagram Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramReleaseProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramReleasePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramNegationTemporalProperty <em>XActivity Diagram Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramNegationTemporalProperty
	 * @generated
	 */
	public Adapter createXActivityDiagramNegationTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.AbstractProperty <em>Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.AbstractProperty
	 * @generated
	 */
	public Adapter createAbstractPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.StepProperty <em>Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.StepProperty
	 * @generated
	 */
	public Adapter createStepPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.TemporalProperty <em>Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.TemporalProperty
	 * @generated
	 */
	public Adapter createTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.StateProperty <em>State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.StateProperty
	 * @generated
	 */
	public Adapter createStatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.UnaryProperty <em>Unary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.UnaryProperty
	 * @generated
	 */
	public Adapter createUnaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.BinaryProperty <em>Binary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.BinaryProperty
	 * @generated
	 */
	public Adapter createBinaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.StringAttributeProperty <em>String Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.StringAttributeProperty
	 * @generated
	 */
	public Adapter createStringAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty <em>Container Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty
	 * @generated
	 */
	public Adapter createContainerReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ManyReferenceProperty <em>Many Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ManyReferenceProperty
	 * @generated
	 */
	public Adapter createManyReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.SingleReferenceProperty <em>Single Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.SingleReferenceProperty
	 * @generated
	 */
	public Adapter createSingleReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty <em>Boolean Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty
	 * @generated
	 */
	public Adapter createBooleanAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty <em>Integer Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty
	 * @generated
	 */
	public Adapter createIntegerAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.NextProperty <em>Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.NextProperty
	 * @generated
	 */
	public Adapter createNextPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.UntilProperty <em>Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.UntilProperty
	 * @generated
	 */
	public Adapter createUntilPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.ReleaseProperty <em>Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.ReleaseProperty
	 * @generated
	 */
	public Adapter createReleasePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.property.NegationTemporalProperty <em>Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.property.NegationTemporalProperty
	 * @generated
	 */
	public Adapter createNegationTemporalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XActivityDiagramPropertyAdapterFactory
