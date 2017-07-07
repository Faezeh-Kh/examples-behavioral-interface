/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramPropertyFactoryImpl extends EFactoryImpl implements XActivityDiagramPropertyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XActivityDiagramPropertyFactory init() {
		try {
			XActivityDiagramPropertyFactory theXActivityDiagramPropertyFactory = (XActivityDiagramPropertyFactory)EPackage.Registry.INSTANCE.getEFactory(XActivityDiagramPropertyPackage.eNS_URI);
			if (theXActivityDiagramPropertyFactory != null) {
				return theXActivityDiagramPropertyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XActivityDiagramPropertyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramPropertyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XActivityDiagramPropertyPackage.JOIN_NODE_EXECUTE_PROPERTY: return createJoinNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.FINAL_NODE_EXECUTE_PROPERTY: return createFinalNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.DECISION_NODE_EXECUTE_PROPERTY: return createDecisionNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_EXECUTE_PROPERTY: return createActivityFinalNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_TERMINATE_PROPERTY: return createActivityNodeTerminateProperty();
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_EXECUTE_PROPERTY: return createOpaqueActionExecuteProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_ADD_TOKEN_PROPERTY: return createActivityNodeAddTokenProperty();
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY: return createVariableAssignmentExecuteProperty();
			case XActivityDiagramPropertyPackage.MERGE_NODE_EXECUTE_PROPERTY: return createMergeNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.VARIABLE_INIT_PROPERTY: return createVariableInitProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_EXECUTE_PROPERTY: return createActivityExecuteProperty();
			case XActivityDiagramPropertyPackage.FORK_NODE_EXECUTE_PROPERTY: return createForkNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_EXECUTE_PROPERTY: return createAcceptEventActionExecuteProperty();
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_EXECUTE_PROPERTY: return createFlowFinalNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.INITIAL_NODE_EXECUTE_PROPERTY: return createInitialNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY: return createBooleanVariableAssignmentExecuteProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_REMOVE_TOKEN_PROPERTY: return createActivityNodeRemoveTokenProperty();
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY: return createIntegerVariableAssignmentExecuteProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_ACCEPT_PROPERTY: return createAcceptEventActionAcceptProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_EXECUTE_PROPERTY: return createActivityNodeExecuteProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_WAIT_FOR_EVENT_PROPERTY: return createAcceptEventActionWaitForEventProperty();
			case XActivityDiagramPropertyPackage.UNARY_NAMED_ELEMENT_PROPERTY: return createUnaryNamedElementProperty();
			case XActivityDiagramPropertyPackage.BINARY_NAMED_ELEMENT_PROPERTY: return createBinaryNamedElementProperty();
			case XActivityDiagramPropertyPackage.NAMED_ELEMENT_NAME_PROPERTY: return createNamedElementNameProperty();
			case XActivityDiagramPropertyPackage.UNARY_ACTIVITY_PROPERTY: return createUnaryActivityProperty();
			case XActivityDiagramPropertyPackage.BINARY_ACTIVITY_PROPERTY: return createBinaryActivityProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NAME_PROPERTY: return createActivityNameProperty();
			case XActivityDiagramPropertyPackage.EVENT_ACTIVITY_CONTAINER_PROPERTY: return createEventActivityContainerProperty();
			case XActivityDiagramPropertyPackage.UNARY_EVENT_PROPERTY: return createUnaryEventProperty();
			case XActivityDiagramPropertyPackage.BINARY_EVENT_PROPERTY: return createBinaryEventProperty();
			case XActivityDiagramPropertyPackage.EVENT_NAME_PROPERTY: return createEventNameProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_EVENTS_PROPERTY: return createActivityEventsProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODES_PROPERTY: return createActivityNodesProperty();
			case XActivityDiagramPropertyPackage.UNARY_ACTIVITY_NODE_PROPERTY: return createUnaryActivityNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_ACTIVITY_NODE_PROPERTY: return createBinaryActivityNodeProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_NAME_PROPERTY: return createActivityNodeNameProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_ACTIVITY_PROPERTY: return createActivityNodeActivityProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_RUNNING_PROPERTY: return createActivityNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTIVITY_NODE_CONTAINER_PROPERTY: return createControlTokenActivityNodeContainerProperty();
			case XActivityDiagramPropertyPackage.UNARY_CONTROL_TOKEN_PROPERTY: return createUnaryControlTokenProperty();
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY: return createBinaryControlTokenProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_HELD_TOKENS_PROPERTY: return createActivityNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_ACTIVITY_CONTAINER_PROPERTY: return createActivityEdgeActivityContainerProperty();
			case XActivityDiagramPropertyPackage.UNARY_ACTIVITY_EDGE_PROPERTY: return createUnaryActivityEdgeProperty();
			case XActivityDiagramPropertyPackage.BINARY_ACTIVITY_EDGE_PROPERTY: return createBinaryActivityEdgeProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_NAME_PROPERTY: return createActivityEdgeNameProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_SOURCE_PROPERTY: return createActivityEdgeSourceProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_TARGET_PROPERTY: return createActivityEdgeTargetProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTIVITY_EDGE_CONTAINER_PROPERTY: return createControlTokenActivityEdgeContainerProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_OFFERED_TOKENS_PROPERTY: return createActivityEdgeOfferedTokensProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGES_PROPERTY: return createActivityEdgesProperty();
			case XActivityDiagramPropertyPackage.VARIABLE_ACTIVITY_CONTAINER_PROPERTY: return createVariableActivityContainerProperty();
			case XActivityDiagramPropertyPackage.UNARY_EXPRESSION_PROPERTY: return createUnaryExpressionProperty();
			case XActivityDiagramPropertyPackage.BINARY_EXPRESSION_PROPERTY: return createBinaryExpressionProperty();
			case XActivityDiagramPropertyPackage.UNARY_VARIABLE_PROPERTY: return createUnaryVariableProperty();
			case XActivityDiagramPropertyPackage.BINARY_VARIABLE_PROPERTY: return createBinaryVariableProperty();
			case XActivityDiagramPropertyPackage.VARIABLE_NAME_PROPERTY: return createVariableNameProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_LOCALS_PROPERTY: return createActivityLocalsProperty();
			case XActivityDiagramPropertyPackage.UNARY_CONTROL_FLOW_PROPERTY: return createUnaryControlFlowProperty();
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_FLOW_PROPERTY: return createBinaryControlFlowProperty();
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_NAME_PROPERTY: return createControlFlowNameProperty();
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_SOURCE_PROPERTY: return createControlFlowSourceProperty();
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_TARGET_PROPERTY: return createControlFlowTargetProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_CONTROL_FLOW_CONTAINER_PROPERTY: return createControlTokenControlFlowContainerProperty();
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_OFFERED_TOKENS_PROPERTY: return createControlFlowOfferedTokensProperty();
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_GUARD_PROPERTY: return createControlFlowGuardProperty();
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_EXPRESSION_PROPERTY: return createUnaryBooleanExpressionProperty();
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_EXPRESSION_PROPERTY: return createBinaryBooleanExpressionProperty();
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_VARIABLE_PROPERTY: return createUnaryBooleanVariableProperty();
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_VARIABLE_PROPERTY: return createBinaryBooleanVariableProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_NAME_PROPERTY: return createBooleanVariableNameProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_INITIAL_VALUE_PROPERTY: return createBooleanVariableInitialValueProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_CURRENT_VALUE_PROPERTY: return createBooleanVariableCurrentValueProperty();
			case XActivityDiagramPropertyPackage.UNARY_ACTION_PROPERTY: return createUnaryActionProperty();
			case XActivityDiagramPropertyPackage.BINARY_ACTION_PROPERTY: return createBinaryActionProperty();
			case XActivityDiagramPropertyPackage.ACTION_NAME_PROPERTY: return createActionNameProperty();
			case XActivityDiagramPropertyPackage.ACTION_ACTIVITY_PROPERTY: return createActionActivityProperty();
			case XActivityDiagramPropertyPackage.ACTION_RUNNING_PROPERTY: return createActionRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTION_CONTAINER_PROPERTY: return createControlTokenActionContainerProperty();
			case XActivityDiagramPropertyPackage.ACTION_HELD_TOKENS_PROPERTY: return createActionHeldTokensProperty();
			case XActivityDiagramPropertyPackage.ACTION_INCOMING_PROPERTY: return createActionIncomingProperty();
			case XActivityDiagramPropertyPackage.ACTION_OUTGOING_PROPERTY: return createActionOutgoingProperty();
			case XActivityDiagramPropertyPackage.UNARY_OPAQUE_ACTION_PROPERTY: return createUnaryOpaqueActionProperty();
			case XActivityDiagramPropertyPackage.BINARY_OPAQUE_ACTION_PROPERTY: return createBinaryOpaqueActionProperty();
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_NAME_PROPERTY: return createOpaqueActionNameProperty();
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_ACTIVITY_PROPERTY: return createOpaqueActionActivityProperty();
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_RUNNING_PROPERTY: return createOpaqueActionRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_OPAQUE_ACTION_CONTAINER_PROPERTY: return createControlTokenOpaqueActionContainerProperty();
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_HELD_TOKENS_PROPERTY: return createOpaqueActionHeldTokensProperty();
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_INCOMING_PROPERTY: return createOpaqueActionIncomingProperty();
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_OUTGOING_PROPERTY: return createOpaqueActionOutgoingProperty();
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY: return createVariableAssignmentOpaqueActionContainerProperty();
			case XActivityDiagramPropertyPackage.UNARY_VARIABLE_ASSIGNMENT_PROPERTY: return createUnaryVariableAssignmentProperty();
			case XActivityDiagramPropertyPackage.BINARY_VARIABLE_ASSIGNMENT_PROPERTY: return createBinaryVariableAssignmentProperty();
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_ASSIGNMENTS_PROPERTY: return createOpaqueActionAssignmentsProperty();
			case XActivityDiagramPropertyPackage.UNARY_ACCEPT_EVENT_ACTION_PROPERTY: return createUnaryAcceptEventActionProperty();
			case XActivityDiagramPropertyPackage.BINARY_ACCEPT_EVENT_ACTION_PROPERTY: return createBinaryAcceptEventActionProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_NAME_PROPERTY: return createAcceptEventActionNameProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_ACTIVITY_PROPERTY: return createAcceptEventActionActivityProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_RUNNING_PROPERTY: return createAcceptEventActionRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACCEPT_EVENT_ACTION_CONTAINER_PROPERTY: return createControlTokenAcceptEventActionContainerProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_HELD_TOKENS_PROPERTY: return createAcceptEventActionHeldTokensProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_EVENT_TYPE_PROPERTY: return createAcceptEventActionEventTypeProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_INCOMING_PROPERTY: return createAcceptEventActionIncomingProperty();
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_OUTGOING_PROPERTY: return createAcceptEventActionOutgoingProperty();
			case XActivityDiagramPropertyPackage.UNARY_CONTROL_NODE_PROPERTY: return createUnaryControlNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_NODE_PROPERTY: return createBinaryControlNodeProperty();
			case XActivityDiagramPropertyPackage.CONTROL_NODE_NAME_PROPERTY: return createControlNodeNameProperty();
			case XActivityDiagramPropertyPackage.CONTROL_NODE_ACTIVITY_PROPERTY: return createControlNodeActivityProperty();
			case XActivityDiagramPropertyPackage.CONTROL_NODE_RUNNING_PROPERTY: return createControlNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_CONTROL_NODE_CONTAINER_PROPERTY: return createControlTokenControlNodeContainerProperty();
			case XActivityDiagramPropertyPackage.CONTROL_NODE_HELD_TOKENS_PROPERTY: return createControlNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.UNARY_INITIAL_NODE_PROPERTY: return createUnaryInitialNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_INITIAL_NODE_PROPERTY: return createBinaryInitialNodeProperty();
			case XActivityDiagramPropertyPackage.INITIAL_NODE_NAME_PROPERTY: return createInitialNodeNameProperty();
			case XActivityDiagramPropertyPackage.INITIAL_NODE_ACTIVITY_PROPERTY: return createInitialNodeActivityProperty();
			case XActivityDiagramPropertyPackage.INITIAL_NODE_RUNNING_PROPERTY: return createInitialNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_INITIAL_NODE_CONTAINER_PROPERTY: return createControlTokenInitialNodeContainerProperty();
			case XActivityDiagramPropertyPackage.INITIAL_NODE_HELD_TOKENS_PROPERTY: return createInitialNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.INITIAL_NODE_OUTGOING_PROPERTY: return createInitialNodeOutgoingProperty();
			case XActivityDiagramPropertyPackage.UNARY_DECISION_NODE_PROPERTY: return createUnaryDecisionNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_DECISION_NODE_PROPERTY: return createBinaryDecisionNodeProperty();
			case XActivityDiagramPropertyPackage.DECISION_NODE_NAME_PROPERTY: return createDecisionNodeNameProperty();
			case XActivityDiagramPropertyPackage.DECISION_NODE_ACTIVITY_PROPERTY: return createDecisionNodeActivityProperty();
			case XActivityDiagramPropertyPackage.DECISION_NODE_RUNNING_PROPERTY: return createDecisionNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_DECISION_NODE_CONTAINER_PROPERTY: return createControlTokenDecisionNodeContainerProperty();
			case XActivityDiagramPropertyPackage.DECISION_NODE_HELD_TOKENS_PROPERTY: return createDecisionNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.DECISION_NODE_INCOMING_PROPERTY: return createDecisionNodeIncomingProperty();
			case XActivityDiagramPropertyPackage.DECISION_NODE_OUTGOING_PROPERTY: return createDecisionNodeOutgoingProperty();
			case XActivityDiagramPropertyPackage.UNARY_MERGE_NODE_PROPERTY: return createUnaryMergeNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_MERGE_NODE_PROPERTY: return createBinaryMergeNodeProperty();
			case XActivityDiagramPropertyPackage.MERGE_NODE_NAME_PROPERTY: return createMergeNodeNameProperty();
			case XActivityDiagramPropertyPackage.MERGE_NODE_ACTIVITY_PROPERTY: return createMergeNodeActivityProperty();
			case XActivityDiagramPropertyPackage.MERGE_NODE_RUNNING_PROPERTY: return createMergeNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_MERGE_NODE_CONTAINER_PROPERTY: return createControlTokenMergeNodeContainerProperty();
			case XActivityDiagramPropertyPackage.MERGE_NODE_HELD_TOKENS_PROPERTY: return createMergeNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.MERGE_NODE_INCOMING_PROPERTY: return createMergeNodeIncomingProperty();
			case XActivityDiagramPropertyPackage.MERGE_NODE_OUTGOING_PROPERTY: return createMergeNodeOutgoingProperty();
			case XActivityDiagramPropertyPackage.UNARY_FORK_NODE_PROPERTY: return createUnaryForkNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_FORK_NODE_PROPERTY: return createBinaryForkNodeProperty();
			case XActivityDiagramPropertyPackage.FORK_NODE_NAME_PROPERTY: return createForkNodeNameProperty();
			case XActivityDiagramPropertyPackage.FORK_NODE_ACTIVITY_PROPERTY: return createForkNodeActivityProperty();
			case XActivityDiagramPropertyPackage.FORK_NODE_RUNNING_PROPERTY: return createForkNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_FORK_NODE_CONTAINER_PROPERTY: return createControlTokenForkNodeContainerProperty();
			case XActivityDiagramPropertyPackage.FORK_NODE_HELD_TOKENS_PROPERTY: return createForkNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.FORK_NODE_INCOMING_PROPERTY: return createForkNodeIncomingProperty();
			case XActivityDiagramPropertyPackage.FORK_NODE_OUTGOING_PROPERTY: return createForkNodeOutgoingProperty();
			case XActivityDiagramPropertyPackage.UNARY_JOIN_NODE_PROPERTY: return createUnaryJoinNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_JOIN_NODE_PROPERTY: return createBinaryJoinNodeProperty();
			case XActivityDiagramPropertyPackage.JOIN_NODE_NAME_PROPERTY: return createJoinNodeNameProperty();
			case XActivityDiagramPropertyPackage.JOIN_NODE_ACTIVITY_PROPERTY: return createJoinNodeActivityProperty();
			case XActivityDiagramPropertyPackage.JOIN_NODE_RUNNING_PROPERTY: return createJoinNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_JOIN_NODE_CONTAINER_PROPERTY: return createControlTokenJoinNodeContainerProperty();
			case XActivityDiagramPropertyPackage.JOIN_NODE_HELD_TOKENS_PROPERTY: return createJoinNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.JOIN_NODE_INCOMING_PROPERTY: return createJoinNodeIncomingProperty();
			case XActivityDiagramPropertyPackage.JOIN_NODE_OUTGOING_PROPERTY: return createJoinNodeOutgoingProperty();
			case XActivityDiagramPropertyPackage.UNARY_FINAL_NODE_PROPERTY: return createUnaryFinalNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_FINAL_NODE_PROPERTY: return createBinaryFinalNodeProperty();
			case XActivityDiagramPropertyPackage.FINAL_NODE_NAME_PROPERTY: return createFinalNodeNameProperty();
			case XActivityDiagramPropertyPackage.FINAL_NODE_ACTIVITY_PROPERTY: return createFinalNodeActivityProperty();
			case XActivityDiagramPropertyPackage.FINAL_NODE_RUNNING_PROPERTY: return createFinalNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_FINAL_NODE_CONTAINER_PROPERTY: return createControlTokenFinalNodeContainerProperty();
			case XActivityDiagramPropertyPackage.FINAL_NODE_HELD_TOKENS_PROPERTY: return createFinalNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.FINAL_NODE_INCOMING_PROPERTY: return createFinalNodeIncomingProperty();
			case XActivityDiagramPropertyPackage.UNARY_ACTIVITY_FINAL_NODE_PROPERTY: return createUnaryActivityFinalNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_ACTIVITY_FINAL_NODE_PROPERTY: return createBinaryActivityFinalNodeProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_NAME_PROPERTY: return createActivityFinalNodeNameProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_ACTIVITY_PROPERTY: return createActivityFinalNodeActivityProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_RUNNING_PROPERTY: return createActivityFinalNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTIVITY_FINAL_NODE_CONTAINER_PROPERTY: return createControlTokenActivityFinalNodeContainerProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_HELD_TOKENS_PROPERTY: return createActivityFinalNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_INCOMING_PROPERTY: return createActivityFinalNodeIncomingProperty();
			case XActivityDiagramPropertyPackage.UNARY_FLOW_FINAL_NODE_PROPERTY: return createUnaryFlowFinalNodeProperty();
			case XActivityDiagramPropertyPackage.BINARY_FLOW_FINAL_NODE_PROPERTY: return createBinaryFlowFinalNodeProperty();
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_NAME_PROPERTY: return createFlowFinalNodeNameProperty();
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_ACTIVITY_PROPERTY: return createFlowFinalNodeActivityProperty();
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_RUNNING_PROPERTY: return createFlowFinalNodeRunningProperty();
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_FLOW_FINAL_NODE_CONTAINER_PROPERTY: return createControlTokenFlowFinalNodeContainerProperty();
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY: return createFlowFinalNodeHeldTokensProperty();
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_INCOMING_PROPERTY: return createFlowFinalNodeIncomingProperty();
			case XActivityDiagramPropertyPackage.UNARY_VALUE_PROPERTY: return createUnaryValueProperty();
			case XActivityDiagramPropertyPackage.BINARY_VALUE_PROPERTY: return createBinaryValueProperty();
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_EXPRESSION_PROPERTY: return createUnaryIntegerExpressionProperty();
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_EXPRESSION_PROPERTY: return createBinaryIntegerExpressionProperty();
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_VARIABLE_PROPERTY: return createUnaryIntegerVariableProperty();
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VARIABLE_PROPERTY: return createBinaryIntegerVariableProperty();
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_NAME_PROPERTY: return createIntegerVariableNameProperty();
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_INITIAL_VALUE_PROPERTY: return createIntegerVariableInitialValueProperty();
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_CURRENT_VALUE_PROPERTY: return createIntegerVariableCurrentValueProperty();
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_VALUE_PROPERTY: return createUnaryBooleanValueProperty();
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_VALUE_PROPERTY: return createBinaryBooleanValueProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_VALUE_VALUE_PROPERTY: return createBooleanValueValueProperty();
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_VALUE_PROPERTY: return createUnaryIntegerValueProperty();
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VALUE_PROPERTY: return createBinaryIntegerValueProperty();
			case XActivityDiagramPropertyPackage.INTEGER_VALUE_VALUE_PROPERTY: return createIntegerValueValueProperty();
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_BINARY_EXPRESSION_PROPERTY: return createUnaryIntegerBinaryExpressionProperty();
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_BINARY_EXPRESSION_PROPERTY: return createBinaryIntegerBinaryExpressionProperty();
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY: return createIntegerBinaryExpressionOperand1Property();
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND2_PROPERTY: return createIntegerBinaryExpressionOperand2Property();
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERATOR_PROPERTY: return createIntegerBinaryExpressionOperatorProperty();
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY: return createUnaryIntegerComparisonExpressionProperty();
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY: return createBinaryIntegerComparisonExpressionProperty();
			case XActivityDiagramPropertyPackage.INTEGER_COMPARISON_EXPRESSION_OPERATOR_PROPERTY: return createIntegerComparisonExpressionOperatorProperty();
			case XActivityDiagramPropertyPackage.INTEGER_COMPARISON_EXPRESSION_OPERAND1_PROPERTY: return createIntegerComparisonExpressionOperand1Property();
			case XActivityDiagramPropertyPackage.INTEGER_COMPARISON_EXPRESSION_OPERAND2_PROPERTY: return createIntegerComparisonExpressionOperand2Property();
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY: return createUnaryBooleanUnaryExpressionProperty();
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY: return createBinaryBooleanUnaryExpressionProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_PROPERTY: return createBooleanUnaryExpressionOperandProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_UNARY_EXPRESSION_OPERATOR_PROPERTY: return createBooleanUnaryExpressionOperatorProperty();
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY: return createUnaryBooleanBinaryExpressionProperty();
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY: return createBinaryBooleanBinaryExpressionProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND1_PROPERTY: return createBooleanBinaryExpressionOperand1Property();
			case XActivityDiagramPropertyPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_PROPERTY: return createBooleanBinaryExpressionOperand2Property();
			case XActivityDiagramPropertyPackage.BOOLEAN_BINARY_EXPRESSION_OPERATOR_PROPERTY: return createBooleanBinaryExpressionOperatorProperty();
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY: return createUnaryBooleanVariableAssignmentProperty();
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY: return createBinaryBooleanVariableAssignmentProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY: return createBooleanVariableAssignmentAssigneeProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_EXPRESSION_BOOLEAN_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY: return createBooleanExpressionBooleanVariableAssignmentContainerProperty();
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY: return createBooleanVariableAssignmentExpressionProperty();
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY: return createUnaryIntegerVariableAssignmentProperty();
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY: return createBinaryIntegerVariableAssignmentProperty();
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY: return createIntegerVariableAssignmentAssigneeProperty();
			case XActivityDiagramPropertyPackage.INTEGER_EXPRESSION_INTEGER_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY: return createIntegerExpressionIntegerVariableAssignmentContainerProperty();
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY: return createIntegerVariableAssignmentExpressionProperty();
			case XActivityDiagramPropertyPackage.UNARY_OFFER_PROPERTY: return createUnaryOfferProperty();
			case XActivityDiagramPropertyPackage.BINARY_OFFER_PROPERTY: return createBinaryOfferProperty();
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_NEXT_PROPERTY: return createXActivityDiagramNextProperty();
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_UNTIL_PROPERTY: return createXActivityDiagramUntilProperty();
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_RELEASE_PROPERTY: return createXActivityDiagramReleaseProperty();
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_NEGATION_TEMPORAL_PROPERTY: return createXActivityDiagramNegationTemporalProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeExecuteProperty createJoinNodeExecuteProperty() {
		JoinNodeExecutePropertyImpl joinNodeExecuteProperty = new JoinNodeExecutePropertyImpl();
		return joinNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeExecuteProperty createFinalNodeExecuteProperty() {
		FinalNodeExecutePropertyImpl finalNodeExecuteProperty = new FinalNodeExecutePropertyImpl();
		return finalNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeExecuteProperty createDecisionNodeExecuteProperty() {
		DecisionNodeExecutePropertyImpl decisionNodeExecuteProperty = new DecisionNodeExecutePropertyImpl();
		return decisionNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeExecuteProperty createActivityFinalNodeExecuteProperty() {
		ActivityFinalNodeExecutePropertyImpl activityFinalNodeExecuteProperty = new ActivityFinalNodeExecutePropertyImpl();
		return activityFinalNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeTerminateProperty createActivityNodeTerminateProperty() {
		ActivityNodeTerminatePropertyImpl activityNodeTerminateProperty = new ActivityNodeTerminatePropertyImpl();
		return activityNodeTerminateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionExecuteProperty createOpaqueActionExecuteProperty() {
		OpaqueActionExecutePropertyImpl opaqueActionExecuteProperty = new OpaqueActionExecutePropertyImpl();
		return opaqueActionExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeAddTokenProperty createActivityNodeAddTokenProperty() {
		ActivityNodeAddTokenPropertyImpl activityNodeAddTokenProperty = new ActivityNodeAddTokenPropertyImpl();
		return activityNodeAddTokenProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentExecuteProperty createVariableAssignmentExecuteProperty() {
		VariableAssignmentExecutePropertyImpl variableAssignmentExecuteProperty = new VariableAssignmentExecutePropertyImpl();
		return variableAssignmentExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeExecuteProperty createMergeNodeExecuteProperty() {
		MergeNodeExecutePropertyImpl mergeNodeExecuteProperty = new MergeNodeExecutePropertyImpl();
		return mergeNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInitProperty createVariableInitProperty() {
		VariableInitPropertyImpl variableInitProperty = new VariableInitPropertyImpl();
		return variableInitProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityExecuteProperty createActivityExecuteProperty() {
		ActivityExecutePropertyImpl activityExecuteProperty = new ActivityExecutePropertyImpl();
		return activityExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeExecuteProperty createForkNodeExecuteProperty() {
		ForkNodeExecutePropertyImpl forkNodeExecuteProperty = new ForkNodeExecutePropertyImpl();
		return forkNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionExecuteProperty createAcceptEventActionExecuteProperty() {
		AcceptEventActionExecutePropertyImpl acceptEventActionExecuteProperty = new AcceptEventActionExecutePropertyImpl();
		return acceptEventActionExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeExecuteProperty createFlowFinalNodeExecuteProperty() {
		FlowFinalNodeExecutePropertyImpl flowFinalNodeExecuteProperty = new FlowFinalNodeExecutePropertyImpl();
		return flowFinalNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeExecuteProperty createInitialNodeExecuteProperty() {
		InitialNodeExecutePropertyImpl initialNodeExecuteProperty = new InitialNodeExecutePropertyImpl();
		return initialNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableAssignmentExecuteProperty createBooleanVariableAssignmentExecuteProperty() {
		BooleanVariableAssignmentExecutePropertyImpl booleanVariableAssignmentExecuteProperty = new BooleanVariableAssignmentExecutePropertyImpl();
		return booleanVariableAssignmentExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeRemoveTokenProperty createActivityNodeRemoveTokenProperty() {
		ActivityNodeRemoveTokenPropertyImpl activityNodeRemoveTokenProperty = new ActivityNodeRemoveTokenPropertyImpl();
		return activityNodeRemoveTokenProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableAssignmentExecuteProperty createIntegerVariableAssignmentExecuteProperty() {
		IntegerVariableAssignmentExecutePropertyImpl integerVariableAssignmentExecuteProperty = new IntegerVariableAssignmentExecutePropertyImpl();
		return integerVariableAssignmentExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionAcceptProperty createAcceptEventActionAcceptProperty() {
		AcceptEventActionAcceptPropertyImpl acceptEventActionAcceptProperty = new AcceptEventActionAcceptPropertyImpl();
		return acceptEventActionAcceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeExecuteProperty createActivityNodeExecuteProperty() {
		ActivityNodeExecutePropertyImpl activityNodeExecuteProperty = new ActivityNodeExecutePropertyImpl();
		return activityNodeExecuteProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionWaitForEventProperty createAcceptEventActionWaitForEventProperty() {
		AcceptEventActionWaitForEventPropertyImpl acceptEventActionWaitForEventProperty = new AcceptEventActionWaitForEventPropertyImpl();
		return acceptEventActionWaitForEventProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryNamedElementProperty createUnaryNamedElementProperty() {
		UnaryNamedElementPropertyImpl unaryNamedElementProperty = new UnaryNamedElementPropertyImpl();
		return unaryNamedElementProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryNamedElementProperty createBinaryNamedElementProperty() {
		BinaryNamedElementPropertyImpl binaryNamedElementProperty = new BinaryNamedElementPropertyImpl();
		return binaryNamedElementProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementNameProperty createNamedElementNameProperty() {
		NamedElementNamePropertyImpl namedElementNameProperty = new NamedElementNamePropertyImpl();
		return namedElementNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryActivityProperty createUnaryActivityProperty() {
		UnaryActivityPropertyImpl unaryActivityProperty = new UnaryActivityPropertyImpl();
		return unaryActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryActivityProperty createBinaryActivityProperty() {
		BinaryActivityPropertyImpl binaryActivityProperty = new BinaryActivityPropertyImpl();
		return binaryActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNameProperty createActivityNameProperty() {
		ActivityNamePropertyImpl activityNameProperty = new ActivityNamePropertyImpl();
		return activityNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventActivityContainerProperty createEventActivityContainerProperty() {
		EventActivityContainerPropertyImpl eventActivityContainerProperty = new EventActivityContainerPropertyImpl();
		return eventActivityContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryEventProperty createUnaryEventProperty() {
		UnaryEventPropertyImpl unaryEventProperty = new UnaryEventPropertyImpl();
		return unaryEventProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryEventProperty createBinaryEventProperty() {
		BinaryEventPropertyImpl binaryEventProperty = new BinaryEventPropertyImpl();
		return binaryEventProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventNameProperty createEventNameProperty() {
		EventNamePropertyImpl eventNameProperty = new EventNamePropertyImpl();
		return eventNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEventsProperty createActivityEventsProperty() {
		ActivityEventsPropertyImpl activityEventsProperty = new ActivityEventsPropertyImpl();
		return activityEventsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodesProperty createActivityNodesProperty() {
		ActivityNodesPropertyImpl activityNodesProperty = new ActivityNodesPropertyImpl();
		return activityNodesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryActivityNodeProperty createUnaryActivityNodeProperty() {
		UnaryActivityNodePropertyImpl unaryActivityNodeProperty = new UnaryActivityNodePropertyImpl();
		return unaryActivityNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryActivityNodeProperty createBinaryActivityNodeProperty() {
		BinaryActivityNodePropertyImpl binaryActivityNodeProperty = new BinaryActivityNodePropertyImpl();
		return binaryActivityNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeNameProperty createActivityNodeNameProperty() {
		ActivityNodeNamePropertyImpl activityNodeNameProperty = new ActivityNodeNamePropertyImpl();
		return activityNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeActivityProperty createActivityNodeActivityProperty() {
		ActivityNodeActivityPropertyImpl activityNodeActivityProperty = new ActivityNodeActivityPropertyImpl();
		return activityNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeRunningProperty createActivityNodeRunningProperty() {
		ActivityNodeRunningPropertyImpl activityNodeRunningProperty = new ActivityNodeRunningPropertyImpl();
		return activityNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenActivityNodeContainerProperty createControlTokenActivityNodeContainerProperty() {
		ControlTokenActivityNodeContainerPropertyImpl controlTokenActivityNodeContainerProperty = new ControlTokenActivityNodeContainerPropertyImpl();
		return controlTokenActivityNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryControlTokenProperty createUnaryControlTokenProperty() {
		UnaryControlTokenPropertyImpl unaryControlTokenProperty = new UnaryControlTokenPropertyImpl();
		return unaryControlTokenProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryControlTokenProperty createBinaryControlTokenProperty() {
		BinaryControlTokenPropertyImpl binaryControlTokenProperty = new BinaryControlTokenPropertyImpl();
		return binaryControlTokenProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeHeldTokensProperty createActivityNodeHeldTokensProperty() {
		ActivityNodeHeldTokensPropertyImpl activityNodeHeldTokensProperty = new ActivityNodeHeldTokensPropertyImpl();
		return activityNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeActivityContainerProperty createActivityEdgeActivityContainerProperty() {
		ActivityEdgeActivityContainerPropertyImpl activityEdgeActivityContainerProperty = new ActivityEdgeActivityContainerPropertyImpl();
		return activityEdgeActivityContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryActivityEdgeProperty createUnaryActivityEdgeProperty() {
		UnaryActivityEdgePropertyImpl unaryActivityEdgeProperty = new UnaryActivityEdgePropertyImpl();
		return unaryActivityEdgeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryActivityEdgeProperty createBinaryActivityEdgeProperty() {
		BinaryActivityEdgePropertyImpl binaryActivityEdgeProperty = new BinaryActivityEdgePropertyImpl();
		return binaryActivityEdgeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeNameProperty createActivityEdgeNameProperty() {
		ActivityEdgeNamePropertyImpl activityEdgeNameProperty = new ActivityEdgeNamePropertyImpl();
		return activityEdgeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeSourceProperty createActivityEdgeSourceProperty() {
		ActivityEdgeSourcePropertyImpl activityEdgeSourceProperty = new ActivityEdgeSourcePropertyImpl();
		return activityEdgeSourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeTargetProperty createActivityEdgeTargetProperty() {
		ActivityEdgeTargetPropertyImpl activityEdgeTargetProperty = new ActivityEdgeTargetPropertyImpl();
		return activityEdgeTargetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenActivityEdgeContainerProperty createControlTokenActivityEdgeContainerProperty() {
		ControlTokenActivityEdgeContainerPropertyImpl controlTokenActivityEdgeContainerProperty = new ControlTokenActivityEdgeContainerPropertyImpl();
		return controlTokenActivityEdgeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeOfferedTokensProperty createActivityEdgeOfferedTokensProperty() {
		ActivityEdgeOfferedTokensPropertyImpl activityEdgeOfferedTokensProperty = new ActivityEdgeOfferedTokensPropertyImpl();
		return activityEdgeOfferedTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgesProperty createActivityEdgesProperty() {
		ActivityEdgesPropertyImpl activityEdgesProperty = new ActivityEdgesPropertyImpl();
		return activityEdgesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableActivityContainerProperty createVariableActivityContainerProperty() {
		VariableActivityContainerPropertyImpl variableActivityContainerProperty = new VariableActivityContainerPropertyImpl();
		return variableActivityContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionProperty createUnaryExpressionProperty() {
		UnaryExpressionPropertyImpl unaryExpressionProperty = new UnaryExpressionPropertyImpl();
		return unaryExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionProperty createBinaryExpressionProperty() {
		BinaryExpressionPropertyImpl binaryExpressionProperty = new BinaryExpressionPropertyImpl();
		return binaryExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryVariableProperty createUnaryVariableProperty() {
		UnaryVariablePropertyImpl unaryVariableProperty = new UnaryVariablePropertyImpl();
		return unaryVariableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryVariableProperty createBinaryVariableProperty() {
		BinaryVariablePropertyImpl binaryVariableProperty = new BinaryVariablePropertyImpl();
		return binaryVariableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableNameProperty createVariableNameProperty() {
		VariableNamePropertyImpl variableNameProperty = new VariableNamePropertyImpl();
		return variableNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLocalsProperty createActivityLocalsProperty() {
		ActivityLocalsPropertyImpl activityLocalsProperty = new ActivityLocalsPropertyImpl();
		return activityLocalsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryControlFlowProperty createUnaryControlFlowProperty() {
		UnaryControlFlowPropertyImpl unaryControlFlowProperty = new UnaryControlFlowPropertyImpl();
		return unaryControlFlowProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryControlFlowProperty createBinaryControlFlowProperty() {
		BinaryControlFlowPropertyImpl binaryControlFlowProperty = new BinaryControlFlowPropertyImpl();
		return binaryControlFlowProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowNameProperty createControlFlowNameProperty() {
		ControlFlowNamePropertyImpl controlFlowNameProperty = new ControlFlowNamePropertyImpl();
		return controlFlowNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowSourceProperty createControlFlowSourceProperty() {
		ControlFlowSourcePropertyImpl controlFlowSourceProperty = new ControlFlowSourcePropertyImpl();
		return controlFlowSourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowTargetProperty createControlFlowTargetProperty() {
		ControlFlowTargetPropertyImpl controlFlowTargetProperty = new ControlFlowTargetPropertyImpl();
		return controlFlowTargetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenControlFlowContainerProperty createControlTokenControlFlowContainerProperty() {
		ControlTokenControlFlowContainerPropertyImpl controlTokenControlFlowContainerProperty = new ControlTokenControlFlowContainerPropertyImpl();
		return controlTokenControlFlowContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowOfferedTokensProperty createControlFlowOfferedTokensProperty() {
		ControlFlowOfferedTokensPropertyImpl controlFlowOfferedTokensProperty = new ControlFlowOfferedTokensPropertyImpl();
		return controlFlowOfferedTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowGuardProperty createControlFlowGuardProperty() {
		ControlFlowGuardPropertyImpl controlFlowGuardProperty = new ControlFlowGuardPropertyImpl();
		return controlFlowGuardProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanExpressionProperty createUnaryBooleanExpressionProperty() {
		UnaryBooleanExpressionPropertyImpl unaryBooleanExpressionProperty = new UnaryBooleanExpressionPropertyImpl();
		return unaryBooleanExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanExpressionProperty createBinaryBooleanExpressionProperty() {
		BinaryBooleanExpressionPropertyImpl binaryBooleanExpressionProperty = new BinaryBooleanExpressionPropertyImpl();
		return binaryBooleanExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanVariableProperty createUnaryBooleanVariableProperty() {
		UnaryBooleanVariablePropertyImpl unaryBooleanVariableProperty = new UnaryBooleanVariablePropertyImpl();
		return unaryBooleanVariableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanVariableProperty createBinaryBooleanVariableProperty() {
		BinaryBooleanVariablePropertyImpl binaryBooleanVariableProperty = new BinaryBooleanVariablePropertyImpl();
		return binaryBooleanVariableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableNameProperty createBooleanVariableNameProperty() {
		BooleanVariableNamePropertyImpl booleanVariableNameProperty = new BooleanVariableNamePropertyImpl();
		return booleanVariableNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableInitialValueProperty createBooleanVariableInitialValueProperty() {
		BooleanVariableInitialValuePropertyImpl booleanVariableInitialValueProperty = new BooleanVariableInitialValuePropertyImpl();
		return booleanVariableInitialValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableCurrentValueProperty createBooleanVariableCurrentValueProperty() {
		BooleanVariableCurrentValuePropertyImpl booleanVariableCurrentValueProperty = new BooleanVariableCurrentValuePropertyImpl();
		return booleanVariableCurrentValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryActionProperty createUnaryActionProperty() {
		UnaryActionPropertyImpl unaryActionProperty = new UnaryActionPropertyImpl();
		return unaryActionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryActionProperty createBinaryActionProperty() {
		BinaryActionPropertyImpl binaryActionProperty = new BinaryActionPropertyImpl();
		return binaryActionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionNameProperty createActionNameProperty() {
		ActionNamePropertyImpl actionNameProperty = new ActionNamePropertyImpl();
		return actionNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionActivityProperty createActionActivityProperty() {
		ActionActivityPropertyImpl actionActivityProperty = new ActionActivityPropertyImpl();
		return actionActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRunningProperty createActionRunningProperty() {
		ActionRunningPropertyImpl actionRunningProperty = new ActionRunningPropertyImpl();
		return actionRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenActionContainerProperty createControlTokenActionContainerProperty() {
		ControlTokenActionContainerPropertyImpl controlTokenActionContainerProperty = new ControlTokenActionContainerPropertyImpl();
		return controlTokenActionContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionHeldTokensProperty createActionHeldTokensProperty() {
		ActionHeldTokensPropertyImpl actionHeldTokensProperty = new ActionHeldTokensPropertyImpl();
		return actionHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionIncomingProperty createActionIncomingProperty() {
		ActionIncomingPropertyImpl actionIncomingProperty = new ActionIncomingPropertyImpl();
		return actionIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionOutgoingProperty createActionOutgoingProperty() {
		ActionOutgoingPropertyImpl actionOutgoingProperty = new ActionOutgoingPropertyImpl();
		return actionOutgoingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOpaqueActionProperty createUnaryOpaqueActionProperty() {
		UnaryOpaqueActionPropertyImpl unaryOpaqueActionProperty = new UnaryOpaqueActionPropertyImpl();
		return unaryOpaqueActionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOpaqueActionProperty createBinaryOpaqueActionProperty() {
		BinaryOpaqueActionPropertyImpl binaryOpaqueActionProperty = new BinaryOpaqueActionPropertyImpl();
		return binaryOpaqueActionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionNameProperty createOpaqueActionNameProperty() {
		OpaqueActionNamePropertyImpl opaqueActionNameProperty = new OpaqueActionNamePropertyImpl();
		return opaqueActionNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionActivityProperty createOpaqueActionActivityProperty() {
		OpaqueActionActivityPropertyImpl opaqueActionActivityProperty = new OpaqueActionActivityPropertyImpl();
		return opaqueActionActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionRunningProperty createOpaqueActionRunningProperty() {
		OpaqueActionRunningPropertyImpl opaqueActionRunningProperty = new OpaqueActionRunningPropertyImpl();
		return opaqueActionRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenOpaqueActionContainerProperty createControlTokenOpaqueActionContainerProperty() {
		ControlTokenOpaqueActionContainerPropertyImpl controlTokenOpaqueActionContainerProperty = new ControlTokenOpaqueActionContainerPropertyImpl();
		return controlTokenOpaqueActionContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionHeldTokensProperty createOpaqueActionHeldTokensProperty() {
		OpaqueActionHeldTokensPropertyImpl opaqueActionHeldTokensProperty = new OpaqueActionHeldTokensPropertyImpl();
		return opaqueActionHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionIncomingProperty createOpaqueActionIncomingProperty() {
		OpaqueActionIncomingPropertyImpl opaqueActionIncomingProperty = new OpaqueActionIncomingPropertyImpl();
		return opaqueActionIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionOutgoingProperty createOpaqueActionOutgoingProperty() {
		OpaqueActionOutgoingPropertyImpl opaqueActionOutgoingProperty = new OpaqueActionOutgoingPropertyImpl();
		return opaqueActionOutgoingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentOpaqueActionContainerProperty createVariableAssignmentOpaqueActionContainerProperty() {
		VariableAssignmentOpaqueActionContainerPropertyImpl variableAssignmentOpaqueActionContainerProperty = new VariableAssignmentOpaqueActionContainerPropertyImpl();
		return variableAssignmentOpaqueActionContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryVariableAssignmentProperty createUnaryVariableAssignmentProperty() {
		UnaryVariableAssignmentPropertyImpl unaryVariableAssignmentProperty = new UnaryVariableAssignmentPropertyImpl();
		return unaryVariableAssignmentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryVariableAssignmentProperty createBinaryVariableAssignmentProperty() {
		BinaryVariableAssignmentPropertyImpl binaryVariableAssignmentProperty = new BinaryVariableAssignmentPropertyImpl();
		return binaryVariableAssignmentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionAssignmentsProperty createOpaqueActionAssignmentsProperty() {
		OpaqueActionAssignmentsPropertyImpl opaqueActionAssignmentsProperty = new OpaqueActionAssignmentsPropertyImpl();
		return opaqueActionAssignmentsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryAcceptEventActionProperty createUnaryAcceptEventActionProperty() {
		UnaryAcceptEventActionPropertyImpl unaryAcceptEventActionProperty = new UnaryAcceptEventActionPropertyImpl();
		return unaryAcceptEventActionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryAcceptEventActionProperty createBinaryAcceptEventActionProperty() {
		BinaryAcceptEventActionPropertyImpl binaryAcceptEventActionProperty = new BinaryAcceptEventActionPropertyImpl();
		return binaryAcceptEventActionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionNameProperty createAcceptEventActionNameProperty() {
		AcceptEventActionNamePropertyImpl acceptEventActionNameProperty = new AcceptEventActionNamePropertyImpl();
		return acceptEventActionNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionActivityProperty createAcceptEventActionActivityProperty() {
		AcceptEventActionActivityPropertyImpl acceptEventActionActivityProperty = new AcceptEventActionActivityPropertyImpl();
		return acceptEventActionActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionRunningProperty createAcceptEventActionRunningProperty() {
		AcceptEventActionRunningPropertyImpl acceptEventActionRunningProperty = new AcceptEventActionRunningPropertyImpl();
		return acceptEventActionRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenAcceptEventActionContainerProperty createControlTokenAcceptEventActionContainerProperty() {
		ControlTokenAcceptEventActionContainerPropertyImpl controlTokenAcceptEventActionContainerProperty = new ControlTokenAcceptEventActionContainerPropertyImpl();
		return controlTokenAcceptEventActionContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionHeldTokensProperty createAcceptEventActionHeldTokensProperty() {
		AcceptEventActionHeldTokensPropertyImpl acceptEventActionHeldTokensProperty = new AcceptEventActionHeldTokensPropertyImpl();
		return acceptEventActionHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionEventTypeProperty createAcceptEventActionEventTypeProperty() {
		AcceptEventActionEventTypePropertyImpl acceptEventActionEventTypeProperty = new AcceptEventActionEventTypePropertyImpl();
		return acceptEventActionEventTypeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionIncomingProperty createAcceptEventActionIncomingProperty() {
		AcceptEventActionIncomingPropertyImpl acceptEventActionIncomingProperty = new AcceptEventActionIncomingPropertyImpl();
		return acceptEventActionIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionOutgoingProperty createAcceptEventActionOutgoingProperty() {
		AcceptEventActionOutgoingPropertyImpl acceptEventActionOutgoingProperty = new AcceptEventActionOutgoingPropertyImpl();
		return acceptEventActionOutgoingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryControlNodeProperty createUnaryControlNodeProperty() {
		UnaryControlNodePropertyImpl unaryControlNodeProperty = new UnaryControlNodePropertyImpl();
		return unaryControlNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryControlNodeProperty createBinaryControlNodeProperty() {
		BinaryControlNodePropertyImpl binaryControlNodeProperty = new BinaryControlNodePropertyImpl();
		return binaryControlNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNodeNameProperty createControlNodeNameProperty() {
		ControlNodeNamePropertyImpl controlNodeNameProperty = new ControlNodeNamePropertyImpl();
		return controlNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNodeActivityProperty createControlNodeActivityProperty() {
		ControlNodeActivityPropertyImpl controlNodeActivityProperty = new ControlNodeActivityPropertyImpl();
		return controlNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNodeRunningProperty createControlNodeRunningProperty() {
		ControlNodeRunningPropertyImpl controlNodeRunningProperty = new ControlNodeRunningPropertyImpl();
		return controlNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenControlNodeContainerProperty createControlTokenControlNodeContainerProperty() {
		ControlTokenControlNodeContainerPropertyImpl controlTokenControlNodeContainerProperty = new ControlTokenControlNodeContainerPropertyImpl();
		return controlTokenControlNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNodeHeldTokensProperty createControlNodeHeldTokensProperty() {
		ControlNodeHeldTokensPropertyImpl controlNodeHeldTokensProperty = new ControlNodeHeldTokensPropertyImpl();
		return controlNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryInitialNodeProperty createUnaryInitialNodeProperty() {
		UnaryInitialNodePropertyImpl unaryInitialNodeProperty = new UnaryInitialNodePropertyImpl();
		return unaryInitialNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryInitialNodeProperty createBinaryInitialNodeProperty() {
		BinaryInitialNodePropertyImpl binaryInitialNodeProperty = new BinaryInitialNodePropertyImpl();
		return binaryInitialNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeNameProperty createInitialNodeNameProperty() {
		InitialNodeNamePropertyImpl initialNodeNameProperty = new InitialNodeNamePropertyImpl();
		return initialNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeActivityProperty createInitialNodeActivityProperty() {
		InitialNodeActivityPropertyImpl initialNodeActivityProperty = new InitialNodeActivityPropertyImpl();
		return initialNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeRunningProperty createInitialNodeRunningProperty() {
		InitialNodeRunningPropertyImpl initialNodeRunningProperty = new InitialNodeRunningPropertyImpl();
		return initialNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenInitialNodeContainerProperty createControlTokenInitialNodeContainerProperty() {
		ControlTokenInitialNodeContainerPropertyImpl controlTokenInitialNodeContainerProperty = new ControlTokenInitialNodeContainerPropertyImpl();
		return controlTokenInitialNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeHeldTokensProperty createInitialNodeHeldTokensProperty() {
		InitialNodeHeldTokensPropertyImpl initialNodeHeldTokensProperty = new InitialNodeHeldTokensPropertyImpl();
		return initialNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeOutgoingProperty createInitialNodeOutgoingProperty() {
		InitialNodeOutgoingPropertyImpl initialNodeOutgoingProperty = new InitialNodeOutgoingPropertyImpl();
		return initialNodeOutgoingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryDecisionNodeProperty createUnaryDecisionNodeProperty() {
		UnaryDecisionNodePropertyImpl unaryDecisionNodeProperty = new UnaryDecisionNodePropertyImpl();
		return unaryDecisionNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDecisionNodeProperty createBinaryDecisionNodeProperty() {
		BinaryDecisionNodePropertyImpl binaryDecisionNodeProperty = new BinaryDecisionNodePropertyImpl();
		return binaryDecisionNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeNameProperty createDecisionNodeNameProperty() {
		DecisionNodeNamePropertyImpl decisionNodeNameProperty = new DecisionNodeNamePropertyImpl();
		return decisionNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeActivityProperty createDecisionNodeActivityProperty() {
		DecisionNodeActivityPropertyImpl decisionNodeActivityProperty = new DecisionNodeActivityPropertyImpl();
		return decisionNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeRunningProperty createDecisionNodeRunningProperty() {
		DecisionNodeRunningPropertyImpl decisionNodeRunningProperty = new DecisionNodeRunningPropertyImpl();
		return decisionNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenDecisionNodeContainerProperty createControlTokenDecisionNodeContainerProperty() {
		ControlTokenDecisionNodeContainerPropertyImpl controlTokenDecisionNodeContainerProperty = new ControlTokenDecisionNodeContainerPropertyImpl();
		return controlTokenDecisionNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeHeldTokensProperty createDecisionNodeHeldTokensProperty() {
		DecisionNodeHeldTokensPropertyImpl decisionNodeHeldTokensProperty = new DecisionNodeHeldTokensPropertyImpl();
		return decisionNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeIncomingProperty createDecisionNodeIncomingProperty() {
		DecisionNodeIncomingPropertyImpl decisionNodeIncomingProperty = new DecisionNodeIncomingPropertyImpl();
		return decisionNodeIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeOutgoingProperty createDecisionNodeOutgoingProperty() {
		DecisionNodeOutgoingPropertyImpl decisionNodeOutgoingProperty = new DecisionNodeOutgoingPropertyImpl();
		return decisionNodeOutgoingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryMergeNodeProperty createUnaryMergeNodeProperty() {
		UnaryMergeNodePropertyImpl unaryMergeNodeProperty = new UnaryMergeNodePropertyImpl();
		return unaryMergeNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryMergeNodeProperty createBinaryMergeNodeProperty() {
		BinaryMergeNodePropertyImpl binaryMergeNodeProperty = new BinaryMergeNodePropertyImpl();
		return binaryMergeNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeNameProperty createMergeNodeNameProperty() {
		MergeNodeNamePropertyImpl mergeNodeNameProperty = new MergeNodeNamePropertyImpl();
		return mergeNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeActivityProperty createMergeNodeActivityProperty() {
		MergeNodeActivityPropertyImpl mergeNodeActivityProperty = new MergeNodeActivityPropertyImpl();
		return mergeNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeRunningProperty createMergeNodeRunningProperty() {
		MergeNodeRunningPropertyImpl mergeNodeRunningProperty = new MergeNodeRunningPropertyImpl();
		return mergeNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenMergeNodeContainerProperty createControlTokenMergeNodeContainerProperty() {
		ControlTokenMergeNodeContainerPropertyImpl controlTokenMergeNodeContainerProperty = new ControlTokenMergeNodeContainerPropertyImpl();
		return controlTokenMergeNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeHeldTokensProperty createMergeNodeHeldTokensProperty() {
		MergeNodeHeldTokensPropertyImpl mergeNodeHeldTokensProperty = new MergeNodeHeldTokensPropertyImpl();
		return mergeNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeIncomingProperty createMergeNodeIncomingProperty() {
		MergeNodeIncomingPropertyImpl mergeNodeIncomingProperty = new MergeNodeIncomingPropertyImpl();
		return mergeNodeIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeOutgoingProperty createMergeNodeOutgoingProperty() {
		MergeNodeOutgoingPropertyImpl mergeNodeOutgoingProperty = new MergeNodeOutgoingPropertyImpl();
		return mergeNodeOutgoingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryForkNodeProperty createUnaryForkNodeProperty() {
		UnaryForkNodePropertyImpl unaryForkNodeProperty = new UnaryForkNodePropertyImpl();
		return unaryForkNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryForkNodeProperty createBinaryForkNodeProperty() {
		BinaryForkNodePropertyImpl binaryForkNodeProperty = new BinaryForkNodePropertyImpl();
		return binaryForkNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeNameProperty createForkNodeNameProperty() {
		ForkNodeNamePropertyImpl forkNodeNameProperty = new ForkNodeNamePropertyImpl();
		return forkNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeActivityProperty createForkNodeActivityProperty() {
		ForkNodeActivityPropertyImpl forkNodeActivityProperty = new ForkNodeActivityPropertyImpl();
		return forkNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeRunningProperty createForkNodeRunningProperty() {
		ForkNodeRunningPropertyImpl forkNodeRunningProperty = new ForkNodeRunningPropertyImpl();
		return forkNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenForkNodeContainerProperty createControlTokenForkNodeContainerProperty() {
		ControlTokenForkNodeContainerPropertyImpl controlTokenForkNodeContainerProperty = new ControlTokenForkNodeContainerPropertyImpl();
		return controlTokenForkNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeHeldTokensProperty createForkNodeHeldTokensProperty() {
		ForkNodeHeldTokensPropertyImpl forkNodeHeldTokensProperty = new ForkNodeHeldTokensPropertyImpl();
		return forkNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeIncomingProperty createForkNodeIncomingProperty() {
		ForkNodeIncomingPropertyImpl forkNodeIncomingProperty = new ForkNodeIncomingPropertyImpl();
		return forkNodeIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeOutgoingProperty createForkNodeOutgoingProperty() {
		ForkNodeOutgoingPropertyImpl forkNodeOutgoingProperty = new ForkNodeOutgoingPropertyImpl();
		return forkNodeOutgoingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryJoinNodeProperty createUnaryJoinNodeProperty() {
		UnaryJoinNodePropertyImpl unaryJoinNodeProperty = new UnaryJoinNodePropertyImpl();
		return unaryJoinNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryJoinNodeProperty createBinaryJoinNodeProperty() {
		BinaryJoinNodePropertyImpl binaryJoinNodeProperty = new BinaryJoinNodePropertyImpl();
		return binaryJoinNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeNameProperty createJoinNodeNameProperty() {
		JoinNodeNamePropertyImpl joinNodeNameProperty = new JoinNodeNamePropertyImpl();
		return joinNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeActivityProperty createJoinNodeActivityProperty() {
		JoinNodeActivityPropertyImpl joinNodeActivityProperty = new JoinNodeActivityPropertyImpl();
		return joinNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeRunningProperty createJoinNodeRunningProperty() {
		JoinNodeRunningPropertyImpl joinNodeRunningProperty = new JoinNodeRunningPropertyImpl();
		return joinNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenJoinNodeContainerProperty createControlTokenJoinNodeContainerProperty() {
		ControlTokenJoinNodeContainerPropertyImpl controlTokenJoinNodeContainerProperty = new ControlTokenJoinNodeContainerPropertyImpl();
		return controlTokenJoinNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeHeldTokensProperty createJoinNodeHeldTokensProperty() {
		JoinNodeHeldTokensPropertyImpl joinNodeHeldTokensProperty = new JoinNodeHeldTokensPropertyImpl();
		return joinNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeIncomingProperty createJoinNodeIncomingProperty() {
		JoinNodeIncomingPropertyImpl joinNodeIncomingProperty = new JoinNodeIncomingPropertyImpl();
		return joinNodeIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeOutgoingProperty createJoinNodeOutgoingProperty() {
		JoinNodeOutgoingPropertyImpl joinNodeOutgoingProperty = new JoinNodeOutgoingPropertyImpl();
		return joinNodeOutgoingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryFinalNodeProperty createUnaryFinalNodeProperty() {
		UnaryFinalNodePropertyImpl unaryFinalNodeProperty = new UnaryFinalNodePropertyImpl();
		return unaryFinalNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFinalNodeProperty createBinaryFinalNodeProperty() {
		BinaryFinalNodePropertyImpl binaryFinalNodeProperty = new BinaryFinalNodePropertyImpl();
		return binaryFinalNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeNameProperty createFinalNodeNameProperty() {
		FinalNodeNamePropertyImpl finalNodeNameProperty = new FinalNodeNamePropertyImpl();
		return finalNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeActivityProperty createFinalNodeActivityProperty() {
		FinalNodeActivityPropertyImpl finalNodeActivityProperty = new FinalNodeActivityPropertyImpl();
		return finalNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeRunningProperty createFinalNodeRunningProperty() {
		FinalNodeRunningPropertyImpl finalNodeRunningProperty = new FinalNodeRunningPropertyImpl();
		return finalNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenFinalNodeContainerProperty createControlTokenFinalNodeContainerProperty() {
		ControlTokenFinalNodeContainerPropertyImpl controlTokenFinalNodeContainerProperty = new ControlTokenFinalNodeContainerPropertyImpl();
		return controlTokenFinalNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeHeldTokensProperty createFinalNodeHeldTokensProperty() {
		FinalNodeHeldTokensPropertyImpl finalNodeHeldTokensProperty = new FinalNodeHeldTokensPropertyImpl();
		return finalNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeIncomingProperty createFinalNodeIncomingProperty() {
		FinalNodeIncomingPropertyImpl finalNodeIncomingProperty = new FinalNodeIncomingPropertyImpl();
		return finalNodeIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryActivityFinalNodeProperty createUnaryActivityFinalNodeProperty() {
		UnaryActivityFinalNodePropertyImpl unaryActivityFinalNodeProperty = new UnaryActivityFinalNodePropertyImpl();
		return unaryActivityFinalNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryActivityFinalNodeProperty createBinaryActivityFinalNodeProperty() {
		BinaryActivityFinalNodePropertyImpl binaryActivityFinalNodeProperty = new BinaryActivityFinalNodePropertyImpl();
		return binaryActivityFinalNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeNameProperty createActivityFinalNodeNameProperty() {
		ActivityFinalNodeNamePropertyImpl activityFinalNodeNameProperty = new ActivityFinalNodeNamePropertyImpl();
		return activityFinalNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeActivityProperty createActivityFinalNodeActivityProperty() {
		ActivityFinalNodeActivityPropertyImpl activityFinalNodeActivityProperty = new ActivityFinalNodeActivityPropertyImpl();
		return activityFinalNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeRunningProperty createActivityFinalNodeRunningProperty() {
		ActivityFinalNodeRunningPropertyImpl activityFinalNodeRunningProperty = new ActivityFinalNodeRunningPropertyImpl();
		return activityFinalNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenActivityFinalNodeContainerProperty createControlTokenActivityFinalNodeContainerProperty() {
		ControlTokenActivityFinalNodeContainerPropertyImpl controlTokenActivityFinalNodeContainerProperty = new ControlTokenActivityFinalNodeContainerPropertyImpl();
		return controlTokenActivityFinalNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeHeldTokensProperty createActivityFinalNodeHeldTokensProperty() {
		ActivityFinalNodeHeldTokensPropertyImpl activityFinalNodeHeldTokensProperty = new ActivityFinalNodeHeldTokensPropertyImpl();
		return activityFinalNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeIncomingProperty createActivityFinalNodeIncomingProperty() {
		ActivityFinalNodeIncomingPropertyImpl activityFinalNodeIncomingProperty = new ActivityFinalNodeIncomingPropertyImpl();
		return activityFinalNodeIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryFlowFinalNodeProperty createUnaryFlowFinalNodeProperty() {
		UnaryFlowFinalNodePropertyImpl unaryFlowFinalNodeProperty = new UnaryFlowFinalNodePropertyImpl();
		return unaryFlowFinalNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFlowFinalNodeProperty createBinaryFlowFinalNodeProperty() {
		BinaryFlowFinalNodePropertyImpl binaryFlowFinalNodeProperty = new BinaryFlowFinalNodePropertyImpl();
		return binaryFlowFinalNodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeNameProperty createFlowFinalNodeNameProperty() {
		FlowFinalNodeNamePropertyImpl flowFinalNodeNameProperty = new FlowFinalNodeNamePropertyImpl();
		return flowFinalNodeNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeActivityProperty createFlowFinalNodeActivityProperty() {
		FlowFinalNodeActivityPropertyImpl flowFinalNodeActivityProperty = new FlowFinalNodeActivityPropertyImpl();
		return flowFinalNodeActivityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeRunningProperty createFlowFinalNodeRunningProperty() {
		FlowFinalNodeRunningPropertyImpl flowFinalNodeRunningProperty = new FlowFinalNodeRunningPropertyImpl();
		return flowFinalNodeRunningProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTokenFlowFinalNodeContainerProperty createControlTokenFlowFinalNodeContainerProperty() {
		ControlTokenFlowFinalNodeContainerPropertyImpl controlTokenFlowFinalNodeContainerProperty = new ControlTokenFlowFinalNodeContainerPropertyImpl();
		return controlTokenFlowFinalNodeContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeHeldTokensProperty createFlowFinalNodeHeldTokensProperty() {
		FlowFinalNodeHeldTokensPropertyImpl flowFinalNodeHeldTokensProperty = new FlowFinalNodeHeldTokensPropertyImpl();
		return flowFinalNodeHeldTokensProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeIncomingProperty createFlowFinalNodeIncomingProperty() {
		FlowFinalNodeIncomingPropertyImpl flowFinalNodeIncomingProperty = new FlowFinalNodeIncomingPropertyImpl();
		return flowFinalNodeIncomingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryValueProperty createUnaryValueProperty() {
		UnaryValuePropertyImpl unaryValueProperty = new UnaryValuePropertyImpl();
		return unaryValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryValueProperty createBinaryValueProperty() {
		BinaryValuePropertyImpl binaryValueProperty = new BinaryValuePropertyImpl();
		return binaryValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerExpressionProperty createUnaryIntegerExpressionProperty() {
		UnaryIntegerExpressionPropertyImpl unaryIntegerExpressionProperty = new UnaryIntegerExpressionPropertyImpl();
		return unaryIntegerExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerExpressionProperty createBinaryIntegerExpressionProperty() {
		BinaryIntegerExpressionPropertyImpl binaryIntegerExpressionProperty = new BinaryIntegerExpressionPropertyImpl();
		return binaryIntegerExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerVariableProperty createUnaryIntegerVariableProperty() {
		UnaryIntegerVariablePropertyImpl unaryIntegerVariableProperty = new UnaryIntegerVariablePropertyImpl();
		return unaryIntegerVariableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerVariableProperty createBinaryIntegerVariableProperty() {
		BinaryIntegerVariablePropertyImpl binaryIntegerVariableProperty = new BinaryIntegerVariablePropertyImpl();
		return binaryIntegerVariableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableNameProperty createIntegerVariableNameProperty() {
		IntegerVariableNamePropertyImpl integerVariableNameProperty = new IntegerVariableNamePropertyImpl();
		return integerVariableNameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableInitialValueProperty createIntegerVariableInitialValueProperty() {
		IntegerVariableInitialValuePropertyImpl integerVariableInitialValueProperty = new IntegerVariableInitialValuePropertyImpl();
		return integerVariableInitialValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableCurrentValueProperty createIntegerVariableCurrentValueProperty() {
		IntegerVariableCurrentValuePropertyImpl integerVariableCurrentValueProperty = new IntegerVariableCurrentValuePropertyImpl();
		return integerVariableCurrentValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanValueProperty createUnaryBooleanValueProperty() {
		UnaryBooleanValuePropertyImpl unaryBooleanValueProperty = new UnaryBooleanValuePropertyImpl();
		return unaryBooleanValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanValueProperty createBinaryBooleanValueProperty() {
		BinaryBooleanValuePropertyImpl binaryBooleanValueProperty = new BinaryBooleanValuePropertyImpl();
		return binaryBooleanValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueValueProperty createBooleanValueValueProperty() {
		BooleanValueValuePropertyImpl booleanValueValueProperty = new BooleanValueValuePropertyImpl();
		return booleanValueValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerValueProperty createUnaryIntegerValueProperty() {
		UnaryIntegerValuePropertyImpl unaryIntegerValueProperty = new UnaryIntegerValuePropertyImpl();
		return unaryIntegerValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerValueProperty createBinaryIntegerValueProperty() {
		BinaryIntegerValuePropertyImpl binaryIntegerValueProperty = new BinaryIntegerValuePropertyImpl();
		return binaryIntegerValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueValueProperty createIntegerValueValueProperty() {
		IntegerValueValuePropertyImpl integerValueValueProperty = new IntegerValueValuePropertyImpl();
		return integerValueValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerBinaryExpressionProperty createUnaryIntegerBinaryExpressionProperty() {
		UnaryIntegerBinaryExpressionPropertyImpl unaryIntegerBinaryExpressionProperty = new UnaryIntegerBinaryExpressionPropertyImpl();
		return unaryIntegerBinaryExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerBinaryExpressionProperty createBinaryIntegerBinaryExpressionProperty() {
		BinaryIntegerBinaryExpressionPropertyImpl binaryIntegerBinaryExpressionProperty = new BinaryIntegerBinaryExpressionPropertyImpl();
		return binaryIntegerBinaryExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerBinaryExpressionOperand1Property createIntegerBinaryExpressionOperand1Property() {
		IntegerBinaryExpressionOperand1PropertyImpl integerBinaryExpressionOperand1Property = new IntegerBinaryExpressionOperand1PropertyImpl();
		return integerBinaryExpressionOperand1Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerBinaryExpressionOperand2Property createIntegerBinaryExpressionOperand2Property() {
		IntegerBinaryExpressionOperand2PropertyImpl integerBinaryExpressionOperand2Property = new IntegerBinaryExpressionOperand2PropertyImpl();
		return integerBinaryExpressionOperand2Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerBinaryExpressionOperatorProperty createIntegerBinaryExpressionOperatorProperty() {
		IntegerBinaryExpressionOperatorPropertyImpl integerBinaryExpressionOperatorProperty = new IntegerBinaryExpressionOperatorPropertyImpl();
		return integerBinaryExpressionOperatorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerComparisonExpressionProperty createUnaryIntegerComparisonExpressionProperty() {
		UnaryIntegerComparisonExpressionPropertyImpl unaryIntegerComparisonExpressionProperty = new UnaryIntegerComparisonExpressionPropertyImpl();
		return unaryIntegerComparisonExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerComparisonExpressionProperty createBinaryIntegerComparisonExpressionProperty() {
		BinaryIntegerComparisonExpressionPropertyImpl binaryIntegerComparisonExpressionProperty = new BinaryIntegerComparisonExpressionPropertyImpl();
		return binaryIntegerComparisonExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpressionOperatorProperty createIntegerComparisonExpressionOperatorProperty() {
		IntegerComparisonExpressionOperatorPropertyImpl integerComparisonExpressionOperatorProperty = new IntegerComparisonExpressionOperatorPropertyImpl();
		return integerComparisonExpressionOperatorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpressionOperand1Property createIntegerComparisonExpressionOperand1Property() {
		IntegerComparisonExpressionOperand1PropertyImpl integerComparisonExpressionOperand1Property = new IntegerComparisonExpressionOperand1PropertyImpl();
		return integerComparisonExpressionOperand1Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpressionOperand2Property createIntegerComparisonExpressionOperand2Property() {
		IntegerComparisonExpressionOperand2PropertyImpl integerComparisonExpressionOperand2Property = new IntegerComparisonExpressionOperand2PropertyImpl();
		return integerComparisonExpressionOperand2Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanUnaryExpressionProperty createUnaryBooleanUnaryExpressionProperty() {
		UnaryBooleanUnaryExpressionPropertyImpl unaryBooleanUnaryExpressionProperty = new UnaryBooleanUnaryExpressionPropertyImpl();
		return unaryBooleanUnaryExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanUnaryExpressionProperty createBinaryBooleanUnaryExpressionProperty() {
		BinaryBooleanUnaryExpressionPropertyImpl binaryBooleanUnaryExpressionProperty = new BinaryBooleanUnaryExpressionPropertyImpl();
		return binaryBooleanUnaryExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpressionOperandProperty createBooleanUnaryExpressionOperandProperty() {
		BooleanUnaryExpressionOperandPropertyImpl booleanUnaryExpressionOperandProperty = new BooleanUnaryExpressionOperandPropertyImpl();
		return booleanUnaryExpressionOperandProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpressionOperatorProperty createBooleanUnaryExpressionOperatorProperty() {
		BooleanUnaryExpressionOperatorPropertyImpl booleanUnaryExpressionOperatorProperty = new BooleanUnaryExpressionOperatorPropertyImpl();
		return booleanUnaryExpressionOperatorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanBinaryExpressionProperty createUnaryBooleanBinaryExpressionProperty() {
		UnaryBooleanBinaryExpressionPropertyImpl unaryBooleanBinaryExpressionProperty = new UnaryBooleanBinaryExpressionPropertyImpl();
		return unaryBooleanBinaryExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanBinaryExpressionProperty createBinaryBooleanBinaryExpressionProperty() {
		BinaryBooleanBinaryExpressionPropertyImpl binaryBooleanBinaryExpressionProperty = new BinaryBooleanBinaryExpressionPropertyImpl();
		return binaryBooleanBinaryExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpressionOperand1Property createBooleanBinaryExpressionOperand1Property() {
		BooleanBinaryExpressionOperand1PropertyImpl booleanBinaryExpressionOperand1Property = new BooleanBinaryExpressionOperand1PropertyImpl();
		return booleanBinaryExpressionOperand1Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpressionOperand2Property createBooleanBinaryExpressionOperand2Property() {
		BooleanBinaryExpressionOperand2PropertyImpl booleanBinaryExpressionOperand2Property = new BooleanBinaryExpressionOperand2PropertyImpl();
		return booleanBinaryExpressionOperand2Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpressionOperatorProperty createBooleanBinaryExpressionOperatorProperty() {
		BooleanBinaryExpressionOperatorPropertyImpl booleanBinaryExpressionOperatorProperty = new BooleanBinaryExpressionOperatorPropertyImpl();
		return booleanBinaryExpressionOperatorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanVariableAssignmentProperty createUnaryBooleanVariableAssignmentProperty() {
		UnaryBooleanVariableAssignmentPropertyImpl unaryBooleanVariableAssignmentProperty = new UnaryBooleanVariableAssignmentPropertyImpl();
		return unaryBooleanVariableAssignmentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanVariableAssignmentProperty createBinaryBooleanVariableAssignmentProperty() {
		BinaryBooleanVariableAssignmentPropertyImpl binaryBooleanVariableAssignmentProperty = new BinaryBooleanVariableAssignmentPropertyImpl();
		return binaryBooleanVariableAssignmentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableAssignmentAssigneeProperty createBooleanVariableAssignmentAssigneeProperty() {
		BooleanVariableAssignmentAssigneePropertyImpl booleanVariableAssignmentAssigneeProperty = new BooleanVariableAssignmentAssigneePropertyImpl();
		return booleanVariableAssignmentAssigneeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpressionBooleanVariableAssignmentContainerProperty createBooleanExpressionBooleanVariableAssignmentContainerProperty() {
		BooleanExpressionBooleanVariableAssignmentContainerPropertyImpl booleanExpressionBooleanVariableAssignmentContainerProperty = new BooleanExpressionBooleanVariableAssignmentContainerPropertyImpl();
		return booleanExpressionBooleanVariableAssignmentContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableAssignmentExpressionProperty createBooleanVariableAssignmentExpressionProperty() {
		BooleanVariableAssignmentExpressionPropertyImpl booleanVariableAssignmentExpressionProperty = new BooleanVariableAssignmentExpressionPropertyImpl();
		return booleanVariableAssignmentExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerVariableAssignmentProperty createUnaryIntegerVariableAssignmentProperty() {
		UnaryIntegerVariableAssignmentPropertyImpl unaryIntegerVariableAssignmentProperty = new UnaryIntegerVariableAssignmentPropertyImpl();
		return unaryIntegerVariableAssignmentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerVariableAssignmentProperty createBinaryIntegerVariableAssignmentProperty() {
		BinaryIntegerVariableAssignmentPropertyImpl binaryIntegerVariableAssignmentProperty = new BinaryIntegerVariableAssignmentPropertyImpl();
		return binaryIntegerVariableAssignmentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableAssignmentAssigneeProperty createIntegerVariableAssignmentAssigneeProperty() {
		IntegerVariableAssignmentAssigneePropertyImpl integerVariableAssignmentAssigneeProperty = new IntegerVariableAssignmentAssigneePropertyImpl();
		return integerVariableAssignmentAssigneeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpressionIntegerVariableAssignmentContainerProperty createIntegerExpressionIntegerVariableAssignmentContainerProperty() {
		IntegerExpressionIntegerVariableAssignmentContainerPropertyImpl integerExpressionIntegerVariableAssignmentContainerProperty = new IntegerExpressionIntegerVariableAssignmentContainerPropertyImpl();
		return integerExpressionIntegerVariableAssignmentContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableAssignmentExpressionProperty createIntegerVariableAssignmentExpressionProperty() {
		IntegerVariableAssignmentExpressionPropertyImpl integerVariableAssignmentExpressionProperty = new IntegerVariableAssignmentExpressionPropertyImpl();
		return integerVariableAssignmentExpressionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOfferProperty createUnaryOfferProperty() {
		UnaryOfferPropertyImpl unaryOfferProperty = new UnaryOfferPropertyImpl();
		return unaryOfferProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOfferProperty createBinaryOfferProperty() {
		BinaryOfferPropertyImpl binaryOfferProperty = new BinaryOfferPropertyImpl();
		return binaryOfferProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramNextProperty createXActivityDiagramNextProperty() {
		XActivityDiagramNextPropertyImpl xActivityDiagramNextProperty = new XActivityDiagramNextPropertyImpl();
		return xActivityDiagramNextProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramUntilProperty createXActivityDiagramUntilProperty() {
		XActivityDiagramUntilPropertyImpl xActivityDiagramUntilProperty = new XActivityDiagramUntilPropertyImpl();
		return xActivityDiagramUntilProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramReleaseProperty createXActivityDiagramReleaseProperty() {
		XActivityDiagramReleasePropertyImpl xActivityDiagramReleaseProperty = new XActivityDiagramReleasePropertyImpl();
		return xActivityDiagramReleaseProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramNegationTemporalProperty createXActivityDiagramNegationTemporalProperty() {
		XActivityDiagramNegationTemporalPropertyImpl xActivityDiagramNegationTemporalProperty = new XActivityDiagramNegationTemporalPropertyImpl();
		return xActivityDiagramNegationTemporalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramPropertyPackage getXActivityDiagramPropertyPackage() {
		return (XActivityDiagramPropertyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XActivityDiagramPropertyPackage getPackage() {
		return XActivityDiagramPropertyPackage.eINSTANCE;
	}

} //XActivityDiagramPropertyFactoryImpl
