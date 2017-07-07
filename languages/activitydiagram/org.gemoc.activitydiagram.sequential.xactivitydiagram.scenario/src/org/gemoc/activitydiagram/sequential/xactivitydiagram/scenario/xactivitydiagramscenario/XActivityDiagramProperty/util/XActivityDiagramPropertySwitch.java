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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage
 * @generated
 */
public class XActivityDiagramPropertySwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XActivityDiagramPropertyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramPropertySwitch() {
		if (modelPackage == null) {
			modelPackage = XActivityDiagramPropertyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XActivityDiagramPropertyPackage.JOIN_NODE_EXECUTE_PROPERTY: {
				JoinNodeExecuteProperty joinNodeExecuteProperty = (JoinNodeExecuteProperty)theEObject;
				T1 result = caseJoinNodeExecuteProperty(joinNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(joinNodeExecuteProperty);
				if (result == null) result = caseStepProperty(joinNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(joinNodeExecuteProperty);
				if (result == null) result = caseProperty(joinNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(joinNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(joinNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FINAL_NODE_EXECUTE_PROPERTY: {
				FinalNodeExecuteProperty finalNodeExecuteProperty = (FinalNodeExecuteProperty)theEObject;
				T1 result = caseFinalNodeExecuteProperty(finalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(finalNodeExecuteProperty);
				if (result == null) result = caseStepProperty(finalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(finalNodeExecuteProperty);
				if (result == null) result = caseProperty(finalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(finalNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(finalNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.DECISION_NODE_EXECUTE_PROPERTY: {
				DecisionNodeExecuteProperty decisionNodeExecuteProperty = (DecisionNodeExecuteProperty)theEObject;
				T1 result = caseDecisionNodeExecuteProperty(decisionNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(decisionNodeExecuteProperty);
				if (result == null) result = caseStepProperty(decisionNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(decisionNodeExecuteProperty);
				if (result == null) result = caseProperty(decisionNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(decisionNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(decisionNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_EXECUTE_PROPERTY: {
				ActivityFinalNodeExecuteProperty activityFinalNodeExecuteProperty = (ActivityFinalNodeExecuteProperty)theEObject;
				T1 result = caseActivityFinalNodeExecuteProperty(activityFinalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(activityFinalNodeExecuteProperty);
				if (result == null) result = caseStepProperty(activityFinalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityFinalNodeExecuteProperty);
				if (result == null) result = caseProperty(activityFinalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityFinalNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(activityFinalNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_TERMINATE_PROPERTY: {
				ActivityNodeTerminateProperty activityNodeTerminateProperty = (ActivityNodeTerminateProperty)theEObject;
				T1 result = caseActivityNodeTerminateProperty(activityNodeTerminateProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(activityNodeTerminateProperty);
				if (result == null) result = caseStepProperty(activityNodeTerminateProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeTerminateProperty);
				if (result == null) result = caseProperty(activityNodeTerminateProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeTerminateProperty);
				if (result == null) result = caseAbstractProperty(activityNodeTerminateProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_EXECUTE_PROPERTY: {
				OpaqueActionExecuteProperty opaqueActionExecuteProperty = (OpaqueActionExecuteProperty)theEObject;
				T1 result = caseOpaqueActionExecuteProperty(opaqueActionExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(opaqueActionExecuteProperty);
				if (result == null) result = caseStepProperty(opaqueActionExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionExecuteProperty);
				if (result == null) result = caseProperty(opaqueActionExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionExecuteProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_ADD_TOKEN_PROPERTY: {
				ActivityNodeAddTokenProperty activityNodeAddTokenProperty = (ActivityNodeAddTokenProperty)theEObject;
				T1 result = caseActivityNodeAddTokenProperty(activityNodeAddTokenProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(activityNodeAddTokenProperty);
				if (result == null) result = caseStepProperty(activityNodeAddTokenProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeAddTokenProperty);
				if (result == null) result = caseProperty(activityNodeAddTokenProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeAddTokenProperty);
				if (result == null) result = caseAbstractProperty(activityNodeAddTokenProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY: {
				VariableAssignmentExecuteProperty variableAssignmentExecuteProperty = (VariableAssignmentExecuteProperty)theEObject;
				T1 result = caseVariableAssignmentExecuteProperty(variableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(variableAssignmentExecuteProperty);
				if (result == null) result = caseStepProperty(variableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(variableAssignmentExecuteProperty);
				if (result == null) result = caseProperty(variableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(variableAssignmentExecuteProperty);
				if (result == null) result = caseAbstractProperty(variableAssignmentExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.MERGE_NODE_EXECUTE_PROPERTY: {
				MergeNodeExecuteProperty mergeNodeExecuteProperty = (MergeNodeExecuteProperty)theEObject;
				T1 result = caseMergeNodeExecuteProperty(mergeNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(mergeNodeExecuteProperty);
				if (result == null) result = caseStepProperty(mergeNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(mergeNodeExecuteProperty);
				if (result == null) result = caseProperty(mergeNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(mergeNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(mergeNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.VARIABLE_INIT_PROPERTY: {
				VariableInitProperty variableInitProperty = (VariableInitProperty)theEObject;
				T1 result = caseVariableInitProperty(variableInitProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(variableInitProperty);
				if (result == null) result = caseStepProperty(variableInitProperty);
				if (result == null) result = caseXActivityDiagramProperty(variableInitProperty);
				if (result == null) result = caseProperty(variableInitProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(variableInitProperty);
				if (result == null) result = caseAbstractProperty(variableInitProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EXECUTE_PROPERTY: {
				ActivityExecuteProperty activityExecuteProperty = (ActivityExecuteProperty)theEObject;
				T1 result = caseActivityExecuteProperty(activityExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(activityExecuteProperty);
				if (result == null) result = caseStepProperty(activityExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityExecuteProperty);
				if (result == null) result = caseProperty(activityExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityExecuteProperty);
				if (result == null) result = caseAbstractProperty(activityExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FORK_NODE_EXECUTE_PROPERTY: {
				ForkNodeExecuteProperty forkNodeExecuteProperty = (ForkNodeExecuteProperty)theEObject;
				T1 result = caseForkNodeExecuteProperty(forkNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(forkNodeExecuteProperty);
				if (result == null) result = caseStepProperty(forkNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(forkNodeExecuteProperty);
				if (result == null) result = caseProperty(forkNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(forkNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(forkNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_EXECUTE_PROPERTY: {
				AcceptEventActionExecuteProperty acceptEventActionExecuteProperty = (AcceptEventActionExecuteProperty)theEObject;
				T1 result = caseAcceptEventActionExecuteProperty(acceptEventActionExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(acceptEventActionExecuteProperty);
				if (result == null) result = caseStepProperty(acceptEventActionExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionExecuteProperty);
				if (result == null) result = caseProperty(acceptEventActionExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionExecuteProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_EXECUTE_PROPERTY: {
				FlowFinalNodeExecuteProperty flowFinalNodeExecuteProperty = (FlowFinalNodeExecuteProperty)theEObject;
				T1 result = caseFlowFinalNodeExecuteProperty(flowFinalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(flowFinalNodeExecuteProperty);
				if (result == null) result = caseStepProperty(flowFinalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(flowFinalNodeExecuteProperty);
				if (result == null) result = caseProperty(flowFinalNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(flowFinalNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(flowFinalNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INITIAL_NODE_EXECUTE_PROPERTY: {
				InitialNodeExecuteProperty initialNodeExecuteProperty = (InitialNodeExecuteProperty)theEObject;
				T1 result = caseInitialNodeExecuteProperty(initialNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(initialNodeExecuteProperty);
				if (result == null) result = caseStepProperty(initialNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(initialNodeExecuteProperty);
				if (result == null) result = caseProperty(initialNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(initialNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(initialNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY: {
				BooleanVariableAssignmentExecuteProperty booleanVariableAssignmentExecuteProperty = (BooleanVariableAssignmentExecuteProperty)theEObject;
				T1 result = caseBooleanVariableAssignmentExecuteProperty(booleanVariableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(booleanVariableAssignmentExecuteProperty);
				if (result == null) result = caseStepProperty(booleanVariableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanVariableAssignmentExecuteProperty);
				if (result == null) result = caseProperty(booleanVariableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanVariableAssignmentExecuteProperty);
				if (result == null) result = caseAbstractProperty(booleanVariableAssignmentExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_REMOVE_TOKEN_PROPERTY: {
				ActivityNodeRemoveTokenProperty activityNodeRemoveTokenProperty = (ActivityNodeRemoveTokenProperty)theEObject;
				T1 result = caseActivityNodeRemoveTokenProperty(activityNodeRemoveTokenProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(activityNodeRemoveTokenProperty);
				if (result == null) result = caseStepProperty(activityNodeRemoveTokenProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeRemoveTokenProperty);
				if (result == null) result = caseProperty(activityNodeRemoveTokenProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeRemoveTokenProperty);
				if (result == null) result = caseAbstractProperty(activityNodeRemoveTokenProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY: {
				IntegerVariableAssignmentExecuteProperty integerVariableAssignmentExecuteProperty = (IntegerVariableAssignmentExecuteProperty)theEObject;
				T1 result = caseIntegerVariableAssignmentExecuteProperty(integerVariableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(integerVariableAssignmentExecuteProperty);
				if (result == null) result = caseStepProperty(integerVariableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerVariableAssignmentExecuteProperty);
				if (result == null) result = caseProperty(integerVariableAssignmentExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerVariableAssignmentExecuteProperty);
				if (result == null) result = caseAbstractProperty(integerVariableAssignmentExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_ACCEPT_PROPERTY: {
				AcceptEventActionAcceptProperty acceptEventActionAcceptProperty = (AcceptEventActionAcceptProperty)theEObject;
				T1 result = caseAcceptEventActionAcceptProperty(acceptEventActionAcceptProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(acceptEventActionAcceptProperty);
				if (result == null) result = caseStepProperty(acceptEventActionAcceptProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionAcceptProperty);
				if (result == null) result = caseProperty(acceptEventActionAcceptProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionAcceptProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionAcceptProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_EXECUTE_PROPERTY: {
				ActivityNodeExecuteProperty activityNodeExecuteProperty = (ActivityNodeExecuteProperty)theEObject;
				T1 result = caseActivityNodeExecuteProperty(activityNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(activityNodeExecuteProperty);
				if (result == null) result = caseStepProperty(activityNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeExecuteProperty);
				if (result == null) result = caseProperty(activityNodeExecuteProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeExecuteProperty);
				if (result == null) result = caseAbstractProperty(activityNodeExecuteProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_WAIT_FOR_EVENT_PROPERTY: {
				AcceptEventActionWaitForEventProperty acceptEventActionWaitForEventProperty = (AcceptEventActionWaitForEventProperty)theEObject;
				T1 result = caseAcceptEventActionWaitForEventProperty(acceptEventActionWaitForEventProperty);
				if (result == null) result = caseXActivityDiagramStepProperty(acceptEventActionWaitForEventProperty);
				if (result == null) result = caseStepProperty(acceptEventActionWaitForEventProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionWaitForEventProperty);
				if (result == null) result = caseProperty(acceptEventActionWaitForEventProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionWaitForEventProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionWaitForEventProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_ABSTRACT_PROPERTY: {
				XActivityDiagramAbstractProperty xActivityDiagramAbstractProperty = (XActivityDiagramAbstractProperty)theEObject;
				T1 result = caseXActivityDiagramAbstractProperty(xActivityDiagramAbstractProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramAbstractProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_TEMPORAL_PROPERTY: {
				XActivityDiagramTemporalProperty xActivityDiagramTemporalProperty = (XActivityDiagramTemporalProperty)theEObject;
				T1 result = caseXActivityDiagramTemporalProperty(xActivityDiagramTemporalProperty);
				if (result == null) result = caseTemporalProperty(xActivityDiagramTemporalProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(xActivityDiagramTemporalProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramTemporalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_PROPERTY: {
				XActivityDiagramProperty xActivityDiagramProperty = (XActivityDiagramProperty)theEObject;
				T1 result = caseXActivityDiagramProperty(xActivityDiagramProperty);
				if (result == null) result = caseProperty(xActivityDiagramProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(xActivityDiagramProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_STATE_PROPERTY: {
				XActivityDiagramStateProperty<?> xActivityDiagramStateProperty = (XActivityDiagramStateProperty<?>)theEObject;
				T1 result = caseXActivityDiagramStateProperty(xActivityDiagramStateProperty);
				if (result == null) result = caseStateProperty(xActivityDiagramStateProperty);
				if (result == null) result = caseXActivityDiagramProperty(xActivityDiagramStateProperty);
				if (result == null) result = caseProperty(xActivityDiagramStateProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(xActivityDiagramStateProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramStateProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_STEP_PROPERTY: {
				XActivityDiagramStepProperty<?> xActivityDiagramStepProperty = (XActivityDiagramStepProperty<?>)theEObject;
				T1 result = caseXActivityDiagramStepProperty(xActivityDiagramStepProperty);
				if (result == null) result = caseStepProperty(xActivityDiagramStepProperty);
				if (result == null) result = caseXActivityDiagramProperty(xActivityDiagramStepProperty);
				if (result == null) result = caseProperty(xActivityDiagramStepProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(xActivityDiagramStepProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramStepProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.NAMED_ELEMENT_PROPERTY: {
				NamedElementProperty<?> namedElementProperty = (NamedElementProperty<?>)theEObject;
				T1 result = caseNamedElementProperty(namedElementProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(namedElementProperty);
				if (result == null) result = caseStateProperty(namedElementProperty);
				if (result == null) result = caseXActivityDiagramProperty(namedElementProperty);
				if (result == null) result = caseProperty(namedElementProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(namedElementProperty);
				if (result == null) result = caseAbstractProperty(namedElementProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_NAMED_ELEMENT_PROPERTY: {
				UnaryNamedElementProperty unaryNamedElementProperty = (UnaryNamedElementProperty)theEObject;
				T1 result = caseUnaryNamedElementProperty(unaryNamedElementProperty);
				if (result == null) result = caseNamedElementProperty(unaryNamedElementProperty);
				if (result == null) result = caseUnaryProperty(unaryNamedElementProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryNamedElementProperty);
				if (result == null) result = caseStateProperty(unaryNamedElementProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryNamedElementProperty);
				if (result == null) result = caseProperty(unaryNamedElementProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryNamedElementProperty);
				if (result == null) result = caseAbstractProperty(unaryNamedElementProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_NAMED_ELEMENT_PROPERTY: {
				BinaryNamedElementProperty binaryNamedElementProperty = (BinaryNamedElementProperty)theEObject;
				T1 result = caseBinaryNamedElementProperty(binaryNamedElementProperty);
				if (result == null) result = caseNamedElementProperty(binaryNamedElementProperty);
				if (result == null) result = caseBinaryProperty(binaryNamedElementProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryNamedElementProperty);
				if (result == null) result = caseStateProperty(binaryNamedElementProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryNamedElementProperty);
				if (result == null) result = caseProperty(binaryNamedElementProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryNamedElementProperty);
				if (result == null) result = caseAbstractProperty(binaryNamedElementProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.NAMED_ELEMENT_NAME_PROPERTY: {
				NamedElementNameProperty namedElementNameProperty = (NamedElementNameProperty)theEObject;
				T1 result = caseNamedElementNameProperty(namedElementNameProperty);
				if (result == null) result = caseNamedElementProperty(namedElementNameProperty);
				if (result == null) result = caseStringAttributeProperty(namedElementNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(namedElementNameProperty);
				if (result == null) result = caseStateProperty(namedElementNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(namedElementNameProperty);
				if (result == null) result = caseProperty(namedElementNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(namedElementNameProperty);
				if (result == null) result = caseAbstractProperty(namedElementNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_PROPERTY: {
				ActivityProperty<?> activityProperty = (ActivityProperty<?>)theEObject;
				T1 result = caseActivityProperty(activityProperty);
				if (result == null) result = caseNamedElementProperty(activityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityProperty);
				if (result == null) result = caseStateProperty(activityProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityProperty);
				if (result == null) result = caseProperty(activityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityProperty);
				if (result == null) result = caseAbstractProperty(activityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_ACTIVITY_PROPERTY: {
				UnaryActivityProperty unaryActivityProperty = (UnaryActivityProperty)theEObject;
				T1 result = caseUnaryActivityProperty(unaryActivityProperty);
				if (result == null) result = caseActivityProperty(unaryActivityProperty);
				if (result == null) result = caseUnaryProperty(unaryActivityProperty);
				if (result == null) result = caseNamedElementProperty(unaryActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryActivityProperty);
				if (result == null) result = caseStateProperty(unaryActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryActivityProperty);
				if (result == null) result = caseProperty(unaryActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryActivityProperty);
				if (result == null) result = caseAbstractProperty(unaryActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_ACTIVITY_PROPERTY: {
				BinaryActivityProperty binaryActivityProperty = (BinaryActivityProperty)theEObject;
				T1 result = caseBinaryActivityProperty(binaryActivityProperty);
				if (result == null) result = caseActivityProperty(binaryActivityProperty);
				if (result == null) result = caseBinaryProperty(binaryActivityProperty);
				if (result == null) result = caseNamedElementProperty(binaryActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryActivityProperty);
				if (result == null) result = caseStateProperty(binaryActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryActivityProperty);
				if (result == null) result = caseProperty(binaryActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryActivityProperty);
				if (result == null) result = caseAbstractProperty(binaryActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NAME_PROPERTY: {
				ActivityNameProperty activityNameProperty = (ActivityNameProperty)theEObject;
				T1 result = caseActivityNameProperty(activityNameProperty);
				if (result == null) result = caseActivityProperty(activityNameProperty);
				if (result == null) result = caseStringAttributeProperty(activityNameProperty);
				if (result == null) result = caseNamedElementProperty(activityNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityNameProperty);
				if (result == null) result = caseStateProperty(activityNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNameProperty);
				if (result == null) result = caseProperty(activityNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNameProperty);
				if (result == null) result = caseAbstractProperty(activityNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.EVENT_ACTIVITY_CONTAINER_PROPERTY: {
				EventActivityContainerProperty eventActivityContainerProperty = (EventActivityContainerProperty)theEObject;
				T1 result = caseEventActivityContainerProperty(eventActivityContainerProperty);
				if (result == null) result = caseEventProperty(eventActivityContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(eventActivityContainerProperty);
				if (result == null) result = caseNamedElementProperty(eventActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(eventActivityContainerProperty);
				if (result == null) result = caseStateProperty(eventActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(eventActivityContainerProperty);
				if (result == null) result = caseProperty(eventActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(eventActivityContainerProperty);
				if (result == null) result = caseAbstractProperty(eventActivityContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.EVENT_PROPERTY: {
				EventProperty<?> eventProperty = (EventProperty<?>)theEObject;
				T1 result = caseEventProperty(eventProperty);
				if (result == null) result = caseNamedElementProperty(eventProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(eventProperty);
				if (result == null) result = caseStateProperty(eventProperty);
				if (result == null) result = caseXActivityDiagramProperty(eventProperty);
				if (result == null) result = caseProperty(eventProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(eventProperty);
				if (result == null) result = caseAbstractProperty(eventProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_EVENT_PROPERTY: {
				UnaryEventProperty unaryEventProperty = (UnaryEventProperty)theEObject;
				T1 result = caseUnaryEventProperty(unaryEventProperty);
				if (result == null) result = caseEventProperty(unaryEventProperty);
				if (result == null) result = caseUnaryProperty(unaryEventProperty);
				if (result == null) result = caseNamedElementProperty(unaryEventProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryEventProperty);
				if (result == null) result = caseStateProperty(unaryEventProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryEventProperty);
				if (result == null) result = caseProperty(unaryEventProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryEventProperty);
				if (result == null) result = caseAbstractProperty(unaryEventProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_EVENT_PROPERTY: {
				BinaryEventProperty binaryEventProperty = (BinaryEventProperty)theEObject;
				T1 result = caseBinaryEventProperty(binaryEventProperty);
				if (result == null) result = caseEventProperty(binaryEventProperty);
				if (result == null) result = caseBinaryProperty(binaryEventProperty);
				if (result == null) result = caseNamedElementProperty(binaryEventProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryEventProperty);
				if (result == null) result = caseStateProperty(binaryEventProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryEventProperty);
				if (result == null) result = caseProperty(binaryEventProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryEventProperty);
				if (result == null) result = caseAbstractProperty(binaryEventProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.EVENT_NAME_PROPERTY: {
				EventNameProperty eventNameProperty = (EventNameProperty)theEObject;
				T1 result = caseEventNameProperty(eventNameProperty);
				if (result == null) result = caseEventProperty(eventNameProperty);
				if (result == null) result = caseStringAttributeProperty(eventNameProperty);
				if (result == null) result = caseNamedElementProperty(eventNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(eventNameProperty);
				if (result == null) result = caseStateProperty(eventNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(eventNameProperty);
				if (result == null) result = caseProperty(eventNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(eventNameProperty);
				if (result == null) result = caseAbstractProperty(eventNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EVENTS_PROPERTY: {
				ActivityEventsProperty activityEventsProperty = (ActivityEventsProperty)theEObject;
				T1 result = caseActivityEventsProperty(activityEventsProperty);
				if (result == null) result = caseActivityProperty(activityEventsProperty);
				if (result == null) result = caseManyReferenceProperty(activityEventsProperty);
				if (result == null) result = caseNamedElementProperty(activityEventsProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityEventsProperty);
				if (result == null) result = caseStateProperty(activityEventsProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityEventsProperty);
				if (result == null) result = caseProperty(activityEventsProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityEventsProperty);
				if (result == null) result = caseAbstractProperty(activityEventsProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODES_PROPERTY: {
				ActivityNodesProperty activityNodesProperty = (ActivityNodesProperty)theEObject;
				T1 result = caseActivityNodesProperty(activityNodesProperty);
				if (result == null) result = caseActivityProperty(activityNodesProperty);
				if (result == null) result = caseManyReferenceProperty(activityNodesProperty);
				if (result == null) result = caseNamedElementProperty(activityNodesProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityNodesProperty);
				if (result == null) result = caseStateProperty(activityNodesProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodesProperty);
				if (result == null) result = caseProperty(activityNodesProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodesProperty);
				if (result == null) result = caseAbstractProperty(activityNodesProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_PROPERTY: {
				ActivityNodeProperty<?> activityNodeProperty = (ActivityNodeProperty<?>)theEObject;
				T1 result = caseActivityNodeProperty(activityNodeProperty);
				if (result == null) result = caseNamedElementProperty(activityNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityNodeProperty);
				if (result == null) result = caseStateProperty(activityNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeProperty);
				if (result == null) result = caseProperty(activityNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeProperty);
				if (result == null) result = caseAbstractProperty(activityNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_ACTIVITY_NODE_PROPERTY: {
				UnaryActivityNodeProperty unaryActivityNodeProperty = (UnaryActivityNodeProperty)theEObject;
				T1 result = caseUnaryActivityNodeProperty(unaryActivityNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryActivityNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryActivityNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryActivityNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryActivityNodeProperty);
				if (result == null) result = caseStateProperty(unaryActivityNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryActivityNodeProperty);
				if (result == null) result = caseProperty(unaryActivityNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryActivityNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryActivityNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_ACTIVITY_NODE_PROPERTY: {
				BinaryActivityNodeProperty binaryActivityNodeProperty = (BinaryActivityNodeProperty)theEObject;
				T1 result = caseBinaryActivityNodeProperty(binaryActivityNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryActivityNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryActivityNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryActivityNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryActivityNodeProperty);
				if (result == null) result = caseStateProperty(binaryActivityNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryActivityNodeProperty);
				if (result == null) result = caseProperty(binaryActivityNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryActivityNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryActivityNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_NAME_PROPERTY: {
				ActivityNodeNameProperty activityNodeNameProperty = (ActivityNodeNameProperty)theEObject;
				T1 result = caseActivityNodeNameProperty(activityNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(activityNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(activityNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(activityNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityNodeNameProperty);
				if (result == null) result = caseStateProperty(activityNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeNameProperty);
				if (result == null) result = caseProperty(activityNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeNameProperty);
				if (result == null) result = caseAbstractProperty(activityNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_ACTIVITY_PROPERTY: {
				ActivityNodeActivityProperty activityNodeActivityProperty = (ActivityNodeActivityProperty)theEObject;
				T1 result = caseActivityNodeActivityProperty(activityNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(activityNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(activityNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(activityNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityNodeActivityProperty);
				if (result == null) result = caseStateProperty(activityNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeActivityProperty);
				if (result == null) result = caseProperty(activityNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(activityNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_RUNNING_PROPERTY: {
				ActivityNodeRunningProperty activityNodeRunningProperty = (ActivityNodeRunningProperty)theEObject;
				T1 result = caseActivityNodeRunningProperty(activityNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(activityNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(activityNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(activityNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityNodeRunningProperty);
				if (result == null) result = caseStateProperty(activityNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeRunningProperty);
				if (result == null) result = caseProperty(activityNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(activityNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTIVITY_NODE_CONTAINER_PROPERTY: {
				ControlTokenActivityNodeContainerProperty controlTokenActivityNodeContainerProperty = (ControlTokenActivityNodeContainerProperty)theEObject;
				T1 result = caseControlTokenActivityNodeContainerProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenActivityNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_PROPERTY: {
				ControlTokenProperty<?> controlTokenProperty = (ControlTokenProperty<?>)theEObject;
				T1 result = caseControlTokenProperty(controlTokenProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenProperty);
				if (result == null) result = caseStateProperty(controlTokenProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenProperty);
				if (result == null) result = caseProperty(controlTokenProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenProperty);
				if (result == null) result = caseAbstractProperty(controlTokenProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_CONTROL_TOKEN_PROPERTY: {
				UnaryControlTokenProperty unaryControlTokenProperty = (UnaryControlTokenProperty)theEObject;
				T1 result = caseUnaryControlTokenProperty(unaryControlTokenProperty);
				if (result == null) result = caseControlTokenProperty(unaryControlTokenProperty);
				if (result == null) result = caseUnaryProperty(unaryControlTokenProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryControlTokenProperty);
				if (result == null) result = caseStateProperty(unaryControlTokenProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryControlTokenProperty);
				if (result == null) result = caseProperty(unaryControlTokenProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryControlTokenProperty);
				if (result == null) result = caseAbstractProperty(unaryControlTokenProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_TOKEN_PROPERTY: {
				BinaryControlTokenProperty binaryControlTokenProperty = (BinaryControlTokenProperty)theEObject;
				T1 result = caseBinaryControlTokenProperty(binaryControlTokenProperty);
				if (result == null) result = caseControlTokenProperty(binaryControlTokenProperty);
				if (result == null) result = caseBinaryProperty(binaryControlTokenProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryControlTokenProperty);
				if (result == null) result = caseStateProperty(binaryControlTokenProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryControlTokenProperty);
				if (result == null) result = caseProperty(binaryControlTokenProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryControlTokenProperty);
				if (result == null) result = caseAbstractProperty(binaryControlTokenProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_NODE_HELD_TOKENS_PROPERTY: {
				ActivityNodeHeldTokensProperty activityNodeHeldTokensProperty = (ActivityNodeHeldTokensProperty)theEObject;
				T1 result = caseActivityNodeHeldTokensProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(activityNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_ACTIVITY_CONTAINER_PROPERTY: {
				ActivityEdgeActivityContainerProperty activityEdgeActivityContainerProperty = (ActivityEdgeActivityContainerProperty)theEObject;
				T1 result = caseActivityEdgeActivityContainerProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseActivityEdgeProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseNamedElementProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseStateProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = caseAbstractProperty(activityEdgeActivityContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_PROPERTY: {
				ActivityEdgeProperty<?> activityEdgeProperty = (ActivityEdgeProperty<?>)theEObject;
				T1 result = caseActivityEdgeProperty(activityEdgeProperty);
				if (result == null) result = caseNamedElementProperty(activityEdgeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityEdgeProperty);
				if (result == null) result = caseStateProperty(activityEdgeProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityEdgeProperty);
				if (result == null) result = caseProperty(activityEdgeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityEdgeProperty);
				if (result == null) result = caseAbstractProperty(activityEdgeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_ACTIVITY_EDGE_PROPERTY: {
				UnaryActivityEdgeProperty unaryActivityEdgeProperty = (UnaryActivityEdgeProperty)theEObject;
				T1 result = caseUnaryActivityEdgeProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseActivityEdgeProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseUnaryProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseNamedElementProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseStateProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryActivityEdgeProperty);
				if (result == null) result = caseAbstractProperty(unaryActivityEdgeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_ACTIVITY_EDGE_PROPERTY: {
				BinaryActivityEdgeProperty binaryActivityEdgeProperty = (BinaryActivityEdgeProperty)theEObject;
				T1 result = caseBinaryActivityEdgeProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseActivityEdgeProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseBinaryProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseNamedElementProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseStateProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryActivityEdgeProperty);
				if (result == null) result = caseAbstractProperty(binaryActivityEdgeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_NAME_PROPERTY: {
				ActivityEdgeNameProperty activityEdgeNameProperty = (ActivityEdgeNameProperty)theEObject;
				T1 result = caseActivityEdgeNameProperty(activityEdgeNameProperty);
				if (result == null) result = caseActivityEdgeProperty(activityEdgeNameProperty);
				if (result == null) result = caseStringAttributeProperty(activityEdgeNameProperty);
				if (result == null) result = caseNamedElementProperty(activityEdgeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityEdgeNameProperty);
				if (result == null) result = caseStateProperty(activityEdgeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityEdgeNameProperty);
				if (result == null) result = caseProperty(activityEdgeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityEdgeNameProperty);
				if (result == null) result = caseAbstractProperty(activityEdgeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_SOURCE_PROPERTY: {
				ActivityEdgeSourceProperty activityEdgeSourceProperty = (ActivityEdgeSourceProperty)theEObject;
				T1 result = caseActivityEdgeSourceProperty(activityEdgeSourceProperty);
				if (result == null) result = caseActivityEdgeProperty(activityEdgeSourceProperty);
				if (result == null) result = caseSingleReferenceProperty(activityEdgeSourceProperty);
				if (result == null) result = caseNamedElementProperty(activityEdgeSourceProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityEdgeSourceProperty);
				if (result == null) result = caseStateProperty(activityEdgeSourceProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityEdgeSourceProperty);
				if (result == null) result = caseProperty(activityEdgeSourceProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityEdgeSourceProperty);
				if (result == null) result = caseAbstractProperty(activityEdgeSourceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_TARGET_PROPERTY: {
				ActivityEdgeTargetProperty activityEdgeTargetProperty = (ActivityEdgeTargetProperty)theEObject;
				T1 result = caseActivityEdgeTargetProperty(activityEdgeTargetProperty);
				if (result == null) result = caseActivityEdgeProperty(activityEdgeTargetProperty);
				if (result == null) result = caseSingleReferenceProperty(activityEdgeTargetProperty);
				if (result == null) result = caseNamedElementProperty(activityEdgeTargetProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityEdgeTargetProperty);
				if (result == null) result = caseStateProperty(activityEdgeTargetProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityEdgeTargetProperty);
				if (result == null) result = caseProperty(activityEdgeTargetProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityEdgeTargetProperty);
				if (result == null) result = caseAbstractProperty(activityEdgeTargetProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTIVITY_EDGE_CONTAINER_PROPERTY: {
				ControlTokenActivityEdgeContainerProperty controlTokenActivityEdgeContainerProperty = (ControlTokenActivityEdgeContainerProperty)theEObject;
				T1 result = caseControlTokenActivityEdgeContainerProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = caseProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenActivityEdgeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGE_OFFERED_TOKENS_PROPERTY: {
				ActivityEdgeOfferedTokensProperty activityEdgeOfferedTokensProperty = (ActivityEdgeOfferedTokensProperty)theEObject;
				T1 result = caseActivityEdgeOfferedTokensProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseActivityEdgeProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseManyReferenceProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseNamedElementProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseStateProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = caseAbstractProperty(activityEdgeOfferedTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_EDGES_PROPERTY: {
				ActivityEdgesProperty activityEdgesProperty = (ActivityEdgesProperty)theEObject;
				T1 result = caseActivityEdgesProperty(activityEdgesProperty);
				if (result == null) result = caseActivityProperty(activityEdgesProperty);
				if (result == null) result = caseManyReferenceProperty(activityEdgesProperty);
				if (result == null) result = caseNamedElementProperty(activityEdgesProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityEdgesProperty);
				if (result == null) result = caseStateProperty(activityEdgesProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityEdgesProperty);
				if (result == null) result = caseProperty(activityEdgesProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityEdgesProperty);
				if (result == null) result = caseAbstractProperty(activityEdgesProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.VARIABLE_ACTIVITY_CONTAINER_PROPERTY: {
				VariableActivityContainerProperty variableActivityContainerProperty = (VariableActivityContainerProperty)theEObject;
				T1 result = caseVariableActivityContainerProperty(variableActivityContainerProperty);
				if (result == null) result = caseVariableProperty(variableActivityContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(variableActivityContainerProperty);
				if (result == null) result = caseExpressionProperty(variableActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(variableActivityContainerProperty);
				if (result == null) result = caseStateProperty(variableActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(variableActivityContainerProperty);
				if (result == null) result = caseProperty(variableActivityContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(variableActivityContainerProperty);
				if (result == null) result = caseAbstractProperty(variableActivityContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.VARIABLE_PROPERTY: {
				VariableProperty<?> variableProperty = (VariableProperty<?>)theEObject;
				T1 result = caseVariableProperty(variableProperty);
				if (result == null) result = caseExpressionProperty(variableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(variableProperty);
				if (result == null) result = caseStateProperty(variableProperty);
				if (result == null) result = caseXActivityDiagramProperty(variableProperty);
				if (result == null) result = caseProperty(variableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(variableProperty);
				if (result == null) result = caseAbstractProperty(variableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.EXPRESSION_PROPERTY: {
				ExpressionProperty<?> expressionProperty = (ExpressionProperty<?>)theEObject;
				T1 result = caseExpressionProperty(expressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(expressionProperty);
				if (result == null) result = caseStateProperty(expressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(expressionProperty);
				if (result == null) result = caseProperty(expressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(expressionProperty);
				if (result == null) result = caseAbstractProperty(expressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_EXPRESSION_PROPERTY: {
				UnaryExpressionProperty unaryExpressionProperty = (UnaryExpressionProperty)theEObject;
				T1 result = caseUnaryExpressionProperty(unaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(unaryExpressionProperty);
				if (result == null) result = caseUnaryProperty(unaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryExpressionProperty);
				if (result == null) result = caseStateProperty(unaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryExpressionProperty);
				if (result == null) result = caseProperty(unaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(unaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_EXPRESSION_PROPERTY: {
				BinaryExpressionProperty binaryExpressionProperty = (BinaryExpressionProperty)theEObject;
				T1 result = caseBinaryExpressionProperty(binaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(binaryExpressionProperty);
				if (result == null) result = caseBinaryProperty(binaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryExpressionProperty);
				if (result == null) result = caseStateProperty(binaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryExpressionProperty);
				if (result == null) result = caseProperty(binaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(binaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_VARIABLE_PROPERTY: {
				UnaryVariableProperty unaryVariableProperty = (UnaryVariableProperty)theEObject;
				T1 result = caseUnaryVariableProperty(unaryVariableProperty);
				if (result == null) result = caseVariableProperty(unaryVariableProperty);
				if (result == null) result = caseUnaryProperty(unaryVariableProperty);
				if (result == null) result = caseExpressionProperty(unaryVariableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryVariableProperty);
				if (result == null) result = caseStateProperty(unaryVariableProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryVariableProperty);
				if (result == null) result = caseProperty(unaryVariableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryVariableProperty);
				if (result == null) result = caseAbstractProperty(unaryVariableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_VARIABLE_PROPERTY: {
				BinaryVariableProperty binaryVariableProperty = (BinaryVariableProperty)theEObject;
				T1 result = caseBinaryVariableProperty(binaryVariableProperty);
				if (result == null) result = caseVariableProperty(binaryVariableProperty);
				if (result == null) result = caseBinaryProperty(binaryVariableProperty);
				if (result == null) result = caseExpressionProperty(binaryVariableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryVariableProperty);
				if (result == null) result = caseStateProperty(binaryVariableProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryVariableProperty);
				if (result == null) result = caseProperty(binaryVariableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryVariableProperty);
				if (result == null) result = caseAbstractProperty(binaryVariableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.VARIABLE_NAME_PROPERTY: {
				VariableNameProperty variableNameProperty = (VariableNameProperty)theEObject;
				T1 result = caseVariableNameProperty(variableNameProperty);
				if (result == null) result = caseVariableProperty(variableNameProperty);
				if (result == null) result = caseStringAttributeProperty(variableNameProperty);
				if (result == null) result = caseExpressionProperty(variableNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(variableNameProperty);
				if (result == null) result = caseStateProperty(variableNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(variableNameProperty);
				if (result == null) result = caseProperty(variableNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(variableNameProperty);
				if (result == null) result = caseAbstractProperty(variableNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_LOCALS_PROPERTY: {
				ActivityLocalsProperty activityLocalsProperty = (ActivityLocalsProperty)theEObject;
				T1 result = caseActivityLocalsProperty(activityLocalsProperty);
				if (result == null) result = caseActivityProperty(activityLocalsProperty);
				if (result == null) result = caseManyReferenceProperty(activityLocalsProperty);
				if (result == null) result = caseNamedElementProperty(activityLocalsProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityLocalsProperty);
				if (result == null) result = caseStateProperty(activityLocalsProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityLocalsProperty);
				if (result == null) result = caseProperty(activityLocalsProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityLocalsProperty);
				if (result == null) result = caseAbstractProperty(activityLocalsProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_PROPERTY: {
				ControlFlowProperty<?> controlFlowProperty = (ControlFlowProperty<?>)theEObject;
				T1 result = caseControlFlowProperty(controlFlowProperty);
				if (result == null) result = caseActivityEdgeProperty(controlFlowProperty);
				if (result == null) result = caseNamedElementProperty(controlFlowProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlFlowProperty);
				if (result == null) result = caseStateProperty(controlFlowProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlFlowProperty);
				if (result == null) result = caseProperty(controlFlowProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlFlowProperty);
				if (result == null) result = caseAbstractProperty(controlFlowProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_CONTROL_FLOW_PROPERTY: {
				UnaryControlFlowProperty unaryControlFlowProperty = (UnaryControlFlowProperty)theEObject;
				T1 result = caseUnaryControlFlowProperty(unaryControlFlowProperty);
				if (result == null) result = caseControlFlowProperty(unaryControlFlowProperty);
				if (result == null) result = caseUnaryProperty(unaryControlFlowProperty);
				if (result == null) result = caseActivityEdgeProperty(unaryControlFlowProperty);
				if (result == null) result = caseNamedElementProperty(unaryControlFlowProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryControlFlowProperty);
				if (result == null) result = caseStateProperty(unaryControlFlowProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryControlFlowProperty);
				if (result == null) result = caseProperty(unaryControlFlowProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryControlFlowProperty);
				if (result == null) result = caseAbstractProperty(unaryControlFlowProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_FLOW_PROPERTY: {
				BinaryControlFlowProperty binaryControlFlowProperty = (BinaryControlFlowProperty)theEObject;
				T1 result = caseBinaryControlFlowProperty(binaryControlFlowProperty);
				if (result == null) result = caseControlFlowProperty(binaryControlFlowProperty);
				if (result == null) result = caseBinaryProperty(binaryControlFlowProperty);
				if (result == null) result = caseActivityEdgeProperty(binaryControlFlowProperty);
				if (result == null) result = caseNamedElementProperty(binaryControlFlowProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryControlFlowProperty);
				if (result == null) result = caseStateProperty(binaryControlFlowProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryControlFlowProperty);
				if (result == null) result = caseProperty(binaryControlFlowProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryControlFlowProperty);
				if (result == null) result = caseAbstractProperty(binaryControlFlowProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_NAME_PROPERTY: {
				ControlFlowNameProperty controlFlowNameProperty = (ControlFlowNameProperty)theEObject;
				T1 result = caseControlFlowNameProperty(controlFlowNameProperty);
				if (result == null) result = caseControlFlowProperty(controlFlowNameProperty);
				if (result == null) result = caseStringAttributeProperty(controlFlowNameProperty);
				if (result == null) result = caseActivityEdgeProperty(controlFlowNameProperty);
				if (result == null) result = caseNamedElementProperty(controlFlowNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlFlowNameProperty);
				if (result == null) result = caseStateProperty(controlFlowNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlFlowNameProperty);
				if (result == null) result = caseProperty(controlFlowNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlFlowNameProperty);
				if (result == null) result = caseAbstractProperty(controlFlowNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_SOURCE_PROPERTY: {
				ControlFlowSourceProperty controlFlowSourceProperty = (ControlFlowSourceProperty)theEObject;
				T1 result = caseControlFlowSourceProperty(controlFlowSourceProperty);
				if (result == null) result = caseControlFlowProperty(controlFlowSourceProperty);
				if (result == null) result = caseSingleReferenceProperty(controlFlowSourceProperty);
				if (result == null) result = caseActivityEdgeProperty(controlFlowSourceProperty);
				if (result == null) result = caseNamedElementProperty(controlFlowSourceProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlFlowSourceProperty);
				if (result == null) result = caseStateProperty(controlFlowSourceProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlFlowSourceProperty);
				if (result == null) result = caseProperty(controlFlowSourceProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlFlowSourceProperty);
				if (result == null) result = caseAbstractProperty(controlFlowSourceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_TARGET_PROPERTY: {
				ControlFlowTargetProperty controlFlowTargetProperty = (ControlFlowTargetProperty)theEObject;
				T1 result = caseControlFlowTargetProperty(controlFlowTargetProperty);
				if (result == null) result = caseControlFlowProperty(controlFlowTargetProperty);
				if (result == null) result = caseSingleReferenceProperty(controlFlowTargetProperty);
				if (result == null) result = caseActivityEdgeProperty(controlFlowTargetProperty);
				if (result == null) result = caseNamedElementProperty(controlFlowTargetProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlFlowTargetProperty);
				if (result == null) result = caseStateProperty(controlFlowTargetProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlFlowTargetProperty);
				if (result == null) result = caseProperty(controlFlowTargetProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlFlowTargetProperty);
				if (result == null) result = caseAbstractProperty(controlFlowTargetProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_CONTROL_FLOW_CONTAINER_PROPERTY: {
				ControlTokenControlFlowContainerProperty controlTokenControlFlowContainerProperty = (ControlTokenControlFlowContainerProperty)theEObject;
				T1 result = caseControlTokenControlFlowContainerProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = caseProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenControlFlowContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_OFFERED_TOKENS_PROPERTY: {
				ControlFlowOfferedTokensProperty controlFlowOfferedTokensProperty = (ControlFlowOfferedTokensProperty)theEObject;
				T1 result = caseControlFlowOfferedTokensProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseControlFlowProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseManyReferenceProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseActivityEdgeProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseNamedElementProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseStateProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = caseAbstractProperty(controlFlowOfferedTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_FLOW_GUARD_PROPERTY: {
				ControlFlowGuardProperty controlFlowGuardProperty = (ControlFlowGuardProperty)theEObject;
				T1 result = caseControlFlowGuardProperty(controlFlowGuardProperty);
				if (result == null) result = caseControlFlowProperty(controlFlowGuardProperty);
				if (result == null) result = caseSingleReferenceProperty(controlFlowGuardProperty);
				if (result == null) result = caseActivityEdgeProperty(controlFlowGuardProperty);
				if (result == null) result = caseNamedElementProperty(controlFlowGuardProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlFlowGuardProperty);
				if (result == null) result = caseStateProperty(controlFlowGuardProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlFlowGuardProperty);
				if (result == null) result = caseProperty(controlFlowGuardProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlFlowGuardProperty);
				if (result == null) result = caseAbstractProperty(controlFlowGuardProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_PROPERTY: {
				BooleanVariableProperty<?> booleanVariableProperty = (BooleanVariableProperty<?>)theEObject;
				T1 result = caseBooleanVariableProperty(booleanVariableProperty);
				if (result == null) result = caseVariableProperty(booleanVariableProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanVariableProperty);
				if (result == null) result = caseExpressionProperty(booleanVariableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanVariableProperty);
				if (result == null) result = caseStateProperty(booleanVariableProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanVariableProperty);
				if (result == null) result = caseProperty(booleanVariableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanVariableProperty);
				if (result == null) result = caseAbstractProperty(booleanVariableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_EXPRESSION_PROPERTY: {
				BooleanExpressionProperty<?> booleanExpressionProperty = (BooleanExpressionProperty<?>)theEObject;
				T1 result = caseBooleanExpressionProperty(booleanExpressionProperty);
				if (result == null) result = caseExpressionProperty(booleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanExpressionProperty);
				if (result == null) result = caseStateProperty(booleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanExpressionProperty);
				if (result == null) result = caseProperty(booleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanExpressionProperty);
				if (result == null) result = caseAbstractProperty(booleanExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_EXPRESSION_PROPERTY: {
				UnaryBooleanExpressionProperty unaryBooleanExpressionProperty = (UnaryBooleanExpressionProperty)theEObject;
				T1 result = caseUnaryBooleanExpressionProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseUnaryProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseExpressionProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseStateProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryBooleanExpressionProperty);
				if (result == null) result = caseAbstractProperty(unaryBooleanExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_EXPRESSION_PROPERTY: {
				BinaryBooleanExpressionProperty binaryBooleanExpressionProperty = (BinaryBooleanExpressionProperty)theEObject;
				T1 result = caseBinaryBooleanExpressionProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseBinaryProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseExpressionProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseStateProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryBooleanExpressionProperty);
				if (result == null) result = caseAbstractProperty(binaryBooleanExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_VARIABLE_PROPERTY: {
				UnaryBooleanVariableProperty unaryBooleanVariableProperty = (UnaryBooleanVariableProperty)theEObject;
				T1 result = caseUnaryBooleanVariableProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseBooleanVariableProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseUnaryProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseVariableProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseBooleanExpressionProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseExpressionProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseStateProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryBooleanVariableProperty);
				if (result == null) result = caseAbstractProperty(unaryBooleanVariableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_VARIABLE_PROPERTY: {
				BinaryBooleanVariableProperty binaryBooleanVariableProperty = (BinaryBooleanVariableProperty)theEObject;
				T1 result = caseBinaryBooleanVariableProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseBooleanVariableProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseBinaryProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseVariableProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseBooleanExpressionProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseExpressionProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseStateProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryBooleanVariableProperty);
				if (result == null) result = caseAbstractProperty(binaryBooleanVariableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_NAME_PROPERTY: {
				BooleanVariableNameProperty booleanVariableNameProperty = (BooleanVariableNameProperty)theEObject;
				T1 result = caseBooleanVariableNameProperty(booleanVariableNameProperty);
				if (result == null) result = caseBooleanVariableProperty(booleanVariableNameProperty);
				if (result == null) result = caseStringAttributeProperty(booleanVariableNameProperty);
				if (result == null) result = caseVariableProperty(booleanVariableNameProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanVariableNameProperty);
				if (result == null) result = caseExpressionProperty(booleanVariableNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanVariableNameProperty);
				if (result == null) result = caseStateProperty(booleanVariableNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanVariableNameProperty);
				if (result == null) result = caseProperty(booleanVariableNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanVariableNameProperty);
				if (result == null) result = caseAbstractProperty(booleanVariableNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_INITIAL_VALUE_PROPERTY: {
				BooleanVariableInitialValueProperty booleanVariableInitialValueProperty = (BooleanVariableInitialValueProperty)theEObject;
				T1 result = caseBooleanVariableInitialValueProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseBooleanVariableProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseBooleanAttributeProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseVariableProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseExpressionProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseStateProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanVariableInitialValueProperty);
				if (result == null) result = caseAbstractProperty(booleanVariableInitialValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_CURRENT_VALUE_PROPERTY: {
				BooleanVariableCurrentValueProperty booleanVariableCurrentValueProperty = (BooleanVariableCurrentValueProperty)theEObject;
				T1 result = caseBooleanVariableCurrentValueProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseBooleanVariableProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseBooleanAttributeProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseVariableProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseExpressionProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseStateProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = caseAbstractProperty(booleanVariableCurrentValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTION_PROPERTY: {
				ActionProperty<?> actionProperty = (ActionProperty<?>)theEObject;
				T1 result = caseActionProperty(actionProperty);
				if (result == null) result = caseActivityNodeProperty(actionProperty);
				if (result == null) result = caseNamedElementProperty(actionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(actionProperty);
				if (result == null) result = caseStateProperty(actionProperty);
				if (result == null) result = caseXActivityDiagramProperty(actionProperty);
				if (result == null) result = caseProperty(actionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(actionProperty);
				if (result == null) result = caseAbstractProperty(actionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_ACTION_PROPERTY: {
				UnaryActionProperty unaryActionProperty = (UnaryActionProperty)theEObject;
				T1 result = caseUnaryActionProperty(unaryActionProperty);
				if (result == null) result = caseActionProperty(unaryActionProperty);
				if (result == null) result = caseUnaryProperty(unaryActionProperty);
				if (result == null) result = caseActivityNodeProperty(unaryActionProperty);
				if (result == null) result = caseNamedElementProperty(unaryActionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryActionProperty);
				if (result == null) result = caseStateProperty(unaryActionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryActionProperty);
				if (result == null) result = caseProperty(unaryActionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryActionProperty);
				if (result == null) result = caseAbstractProperty(unaryActionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_ACTION_PROPERTY: {
				BinaryActionProperty binaryActionProperty = (BinaryActionProperty)theEObject;
				T1 result = caseBinaryActionProperty(binaryActionProperty);
				if (result == null) result = caseActionProperty(binaryActionProperty);
				if (result == null) result = caseBinaryProperty(binaryActionProperty);
				if (result == null) result = caseActivityNodeProperty(binaryActionProperty);
				if (result == null) result = caseNamedElementProperty(binaryActionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryActionProperty);
				if (result == null) result = caseStateProperty(binaryActionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryActionProperty);
				if (result == null) result = caseProperty(binaryActionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryActionProperty);
				if (result == null) result = caseAbstractProperty(binaryActionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTION_NAME_PROPERTY: {
				ActionNameProperty actionNameProperty = (ActionNameProperty)theEObject;
				T1 result = caseActionNameProperty(actionNameProperty);
				if (result == null) result = caseActionProperty(actionNameProperty);
				if (result == null) result = caseStringAttributeProperty(actionNameProperty);
				if (result == null) result = caseActivityNodeProperty(actionNameProperty);
				if (result == null) result = caseNamedElementProperty(actionNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(actionNameProperty);
				if (result == null) result = caseStateProperty(actionNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(actionNameProperty);
				if (result == null) result = caseProperty(actionNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(actionNameProperty);
				if (result == null) result = caseAbstractProperty(actionNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTION_ACTIVITY_PROPERTY: {
				ActionActivityProperty actionActivityProperty = (ActionActivityProperty)theEObject;
				T1 result = caseActionActivityProperty(actionActivityProperty);
				if (result == null) result = caseActionProperty(actionActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(actionActivityProperty);
				if (result == null) result = caseActivityNodeProperty(actionActivityProperty);
				if (result == null) result = caseNamedElementProperty(actionActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(actionActivityProperty);
				if (result == null) result = caseStateProperty(actionActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(actionActivityProperty);
				if (result == null) result = caseProperty(actionActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(actionActivityProperty);
				if (result == null) result = caseAbstractProperty(actionActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTION_RUNNING_PROPERTY: {
				ActionRunningProperty actionRunningProperty = (ActionRunningProperty)theEObject;
				T1 result = caseActionRunningProperty(actionRunningProperty);
				if (result == null) result = caseActionProperty(actionRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(actionRunningProperty);
				if (result == null) result = caseActivityNodeProperty(actionRunningProperty);
				if (result == null) result = caseNamedElementProperty(actionRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(actionRunningProperty);
				if (result == null) result = caseStateProperty(actionRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(actionRunningProperty);
				if (result == null) result = caseProperty(actionRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(actionRunningProperty);
				if (result == null) result = caseAbstractProperty(actionRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTION_CONTAINER_PROPERTY: {
				ControlTokenActionContainerProperty controlTokenActionContainerProperty = (ControlTokenActionContainerProperty)theEObject;
				T1 result = caseControlTokenActionContainerProperty(controlTokenActionContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenActionContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenActionContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenActionContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenActionContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenActionContainerProperty);
				if (result == null) result = caseProperty(controlTokenActionContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenActionContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenActionContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTION_HELD_TOKENS_PROPERTY: {
				ActionHeldTokensProperty actionHeldTokensProperty = (ActionHeldTokensProperty)theEObject;
				T1 result = caseActionHeldTokensProperty(actionHeldTokensProperty);
				if (result == null) result = caseActionProperty(actionHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(actionHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(actionHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(actionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(actionHeldTokensProperty);
				if (result == null) result = caseStateProperty(actionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(actionHeldTokensProperty);
				if (result == null) result = caseProperty(actionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(actionHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(actionHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTION_INCOMING_PROPERTY: {
				ActionIncomingProperty actionIncomingProperty = (ActionIncomingProperty)theEObject;
				T1 result = caseActionIncomingProperty(actionIncomingProperty);
				if (result == null) result = caseActionProperty(actionIncomingProperty);
				if (result == null) result = caseSingleReferenceProperty(actionIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(actionIncomingProperty);
				if (result == null) result = caseNamedElementProperty(actionIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(actionIncomingProperty);
				if (result == null) result = caseStateProperty(actionIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(actionIncomingProperty);
				if (result == null) result = caseProperty(actionIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(actionIncomingProperty);
				if (result == null) result = caseAbstractProperty(actionIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTION_OUTGOING_PROPERTY: {
				ActionOutgoingProperty actionOutgoingProperty = (ActionOutgoingProperty)theEObject;
				T1 result = caseActionOutgoingProperty(actionOutgoingProperty);
				if (result == null) result = caseActionProperty(actionOutgoingProperty);
				if (result == null) result = caseSingleReferenceProperty(actionOutgoingProperty);
				if (result == null) result = caseActivityNodeProperty(actionOutgoingProperty);
				if (result == null) result = caseNamedElementProperty(actionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(actionOutgoingProperty);
				if (result == null) result = caseStateProperty(actionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramProperty(actionOutgoingProperty);
				if (result == null) result = caseProperty(actionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(actionOutgoingProperty);
				if (result == null) result = caseAbstractProperty(actionOutgoingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_PROPERTY: {
				OpaqueActionProperty<?> opaqueActionProperty = (OpaqueActionProperty<?>)theEObject;
				T1 result = caseOpaqueActionProperty(opaqueActionProperty);
				if (result == null) result = caseActionProperty(opaqueActionProperty);
				if (result == null) result = caseActivityNodeProperty(opaqueActionProperty);
				if (result == null) result = caseNamedElementProperty(opaqueActionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(opaqueActionProperty);
				if (result == null) result = caseStateProperty(opaqueActionProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionProperty);
				if (result == null) result = caseProperty(opaqueActionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_OPAQUE_ACTION_PROPERTY: {
				UnaryOpaqueActionProperty unaryOpaqueActionProperty = (UnaryOpaqueActionProperty)theEObject;
				T1 result = caseUnaryOpaqueActionProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseOpaqueActionProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseUnaryProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseActionProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseActivityNodeProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseNamedElementProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseStateProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryOpaqueActionProperty);
				if (result == null) result = caseAbstractProperty(unaryOpaqueActionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_OPAQUE_ACTION_PROPERTY: {
				BinaryOpaqueActionProperty binaryOpaqueActionProperty = (BinaryOpaqueActionProperty)theEObject;
				T1 result = caseBinaryOpaqueActionProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseOpaqueActionProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseBinaryProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseActionProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseActivityNodeProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseNamedElementProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseStateProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryOpaqueActionProperty);
				if (result == null) result = caseAbstractProperty(binaryOpaqueActionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_NAME_PROPERTY: {
				OpaqueActionNameProperty opaqueActionNameProperty = (OpaqueActionNameProperty)theEObject;
				T1 result = caseOpaqueActionNameProperty(opaqueActionNameProperty);
				if (result == null) result = caseOpaqueActionProperty(opaqueActionNameProperty);
				if (result == null) result = caseStringAttributeProperty(opaqueActionNameProperty);
				if (result == null) result = caseActionProperty(opaqueActionNameProperty);
				if (result == null) result = caseActivityNodeProperty(opaqueActionNameProperty);
				if (result == null) result = caseNamedElementProperty(opaqueActionNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(opaqueActionNameProperty);
				if (result == null) result = caseStateProperty(opaqueActionNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionNameProperty);
				if (result == null) result = caseProperty(opaqueActionNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionNameProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_ACTIVITY_PROPERTY: {
				OpaqueActionActivityProperty opaqueActionActivityProperty = (OpaqueActionActivityProperty)theEObject;
				T1 result = caseOpaqueActionActivityProperty(opaqueActionActivityProperty);
				if (result == null) result = caseOpaqueActionProperty(opaqueActionActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(opaqueActionActivityProperty);
				if (result == null) result = caseActionProperty(opaqueActionActivityProperty);
				if (result == null) result = caseActivityNodeProperty(opaqueActionActivityProperty);
				if (result == null) result = caseNamedElementProperty(opaqueActionActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(opaqueActionActivityProperty);
				if (result == null) result = caseStateProperty(opaqueActionActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionActivityProperty);
				if (result == null) result = caseProperty(opaqueActionActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionActivityProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_RUNNING_PROPERTY: {
				OpaqueActionRunningProperty opaqueActionRunningProperty = (OpaqueActionRunningProperty)theEObject;
				T1 result = caseOpaqueActionRunningProperty(opaqueActionRunningProperty);
				if (result == null) result = caseOpaqueActionProperty(opaqueActionRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(opaqueActionRunningProperty);
				if (result == null) result = caseActionProperty(opaqueActionRunningProperty);
				if (result == null) result = caseActivityNodeProperty(opaqueActionRunningProperty);
				if (result == null) result = caseNamedElementProperty(opaqueActionRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(opaqueActionRunningProperty);
				if (result == null) result = caseStateProperty(opaqueActionRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionRunningProperty);
				if (result == null) result = caseProperty(opaqueActionRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionRunningProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_OPAQUE_ACTION_CONTAINER_PROPERTY: {
				ControlTokenOpaqueActionContainerProperty controlTokenOpaqueActionContainerProperty = (ControlTokenOpaqueActionContainerProperty)theEObject;
				T1 result = caseControlTokenOpaqueActionContainerProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = caseProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenOpaqueActionContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_HELD_TOKENS_PROPERTY: {
				OpaqueActionHeldTokensProperty opaqueActionHeldTokensProperty = (OpaqueActionHeldTokensProperty)theEObject;
				T1 result = caseOpaqueActionHeldTokensProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseOpaqueActionProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseActionProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseStateProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_INCOMING_PROPERTY: {
				OpaqueActionIncomingProperty opaqueActionIncomingProperty = (OpaqueActionIncomingProperty)theEObject;
				T1 result = caseOpaqueActionIncomingProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseOpaqueActionProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseSingleReferenceProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseActionProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseNamedElementProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseStateProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionIncomingProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_OUTGOING_PROPERTY: {
				OpaqueActionOutgoingProperty opaqueActionOutgoingProperty = (OpaqueActionOutgoingProperty)theEObject;
				T1 result = caseOpaqueActionOutgoingProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseOpaqueActionProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseSingleReferenceProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseActionProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseActivityNodeProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseNamedElementProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseStateProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionOutgoingProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionOutgoingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY: {
				VariableAssignmentOpaqueActionContainerProperty variableAssignmentOpaqueActionContainerProperty = (VariableAssignmentOpaqueActionContainerProperty)theEObject;
				T1 result = caseVariableAssignmentOpaqueActionContainerProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = caseVariableAssignmentProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = caseStateProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = caseProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = caseAbstractProperty(variableAssignmentOpaqueActionContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.VARIABLE_ASSIGNMENT_PROPERTY: {
				VariableAssignmentProperty<?> variableAssignmentProperty = (VariableAssignmentProperty<?>)theEObject;
				T1 result = caseVariableAssignmentProperty(variableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(variableAssignmentProperty);
				if (result == null) result = caseStateProperty(variableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(variableAssignmentProperty);
				if (result == null) result = caseProperty(variableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(variableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(variableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_VARIABLE_ASSIGNMENT_PROPERTY: {
				UnaryVariableAssignmentProperty unaryVariableAssignmentProperty = (UnaryVariableAssignmentProperty)theEObject;
				T1 result = caseUnaryVariableAssignmentProperty(unaryVariableAssignmentProperty);
				if (result == null) result = caseVariableAssignmentProperty(unaryVariableAssignmentProperty);
				if (result == null) result = caseUnaryProperty(unaryVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryVariableAssignmentProperty);
				if (result == null) result = caseStateProperty(unaryVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryVariableAssignmentProperty);
				if (result == null) result = caseProperty(unaryVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryVariableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(unaryVariableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_VARIABLE_ASSIGNMENT_PROPERTY: {
				BinaryVariableAssignmentProperty binaryVariableAssignmentProperty = (BinaryVariableAssignmentProperty)theEObject;
				T1 result = caseBinaryVariableAssignmentProperty(binaryVariableAssignmentProperty);
				if (result == null) result = caseVariableAssignmentProperty(binaryVariableAssignmentProperty);
				if (result == null) result = caseBinaryProperty(binaryVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryVariableAssignmentProperty);
				if (result == null) result = caseStateProperty(binaryVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryVariableAssignmentProperty);
				if (result == null) result = caseProperty(binaryVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryVariableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(binaryVariableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OPAQUE_ACTION_ASSIGNMENTS_PROPERTY: {
				OpaqueActionAssignmentsProperty opaqueActionAssignmentsProperty = (OpaqueActionAssignmentsProperty)theEObject;
				T1 result = caseOpaqueActionAssignmentsProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseOpaqueActionProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseManyReferenceProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseActionProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseActivityNodeProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseNamedElementProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseStateProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseXActivityDiagramProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = caseAbstractProperty(opaqueActionAssignmentsProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_PROPERTY: {
				AcceptEventActionProperty<?> acceptEventActionProperty = (AcceptEventActionProperty<?>)theEObject;
				T1 result = caseAcceptEventActionProperty(acceptEventActionProperty);
				if (result == null) result = caseActivityNodeProperty(acceptEventActionProperty);
				if (result == null) result = caseNamedElementProperty(acceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(acceptEventActionProperty);
				if (result == null) result = caseStateProperty(acceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionProperty);
				if (result == null) result = caseProperty(acceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_ACCEPT_EVENT_ACTION_PROPERTY: {
				UnaryAcceptEventActionProperty unaryAcceptEventActionProperty = (UnaryAcceptEventActionProperty)theEObject;
				T1 result = caseUnaryAcceptEventActionProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseAcceptEventActionProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseUnaryProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseActivityNodeProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseNamedElementProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseStateProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryAcceptEventActionProperty);
				if (result == null) result = caseAbstractProperty(unaryAcceptEventActionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_ACCEPT_EVENT_ACTION_PROPERTY: {
				BinaryAcceptEventActionProperty binaryAcceptEventActionProperty = (BinaryAcceptEventActionProperty)theEObject;
				T1 result = caseBinaryAcceptEventActionProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseAcceptEventActionProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseBinaryProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseActivityNodeProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseNamedElementProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseStateProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryAcceptEventActionProperty);
				if (result == null) result = caseAbstractProperty(binaryAcceptEventActionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_NAME_PROPERTY: {
				AcceptEventActionNameProperty acceptEventActionNameProperty = (AcceptEventActionNameProperty)theEObject;
				T1 result = caseAcceptEventActionNameProperty(acceptEventActionNameProperty);
				if (result == null) result = caseAcceptEventActionProperty(acceptEventActionNameProperty);
				if (result == null) result = caseStringAttributeProperty(acceptEventActionNameProperty);
				if (result == null) result = caseActivityNodeProperty(acceptEventActionNameProperty);
				if (result == null) result = caseNamedElementProperty(acceptEventActionNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(acceptEventActionNameProperty);
				if (result == null) result = caseStateProperty(acceptEventActionNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionNameProperty);
				if (result == null) result = caseProperty(acceptEventActionNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionNameProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_ACTIVITY_PROPERTY: {
				AcceptEventActionActivityProperty acceptEventActionActivityProperty = (AcceptEventActionActivityProperty)theEObject;
				T1 result = caseAcceptEventActionActivityProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseAcceptEventActionProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseActivityNodeProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseNamedElementProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseStateProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionActivityProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_RUNNING_PROPERTY: {
				AcceptEventActionRunningProperty acceptEventActionRunningProperty = (AcceptEventActionRunningProperty)theEObject;
				T1 result = caseAcceptEventActionRunningProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseAcceptEventActionProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseActivityNodeProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseNamedElementProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseStateProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionRunningProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACCEPT_EVENT_ACTION_CONTAINER_PROPERTY: {
				ControlTokenAcceptEventActionContainerProperty controlTokenAcceptEventActionContainerProperty = (ControlTokenAcceptEventActionContainerProperty)theEObject;
				T1 result = caseControlTokenAcceptEventActionContainerProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = caseProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenAcceptEventActionContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_HELD_TOKENS_PROPERTY: {
				AcceptEventActionHeldTokensProperty acceptEventActionHeldTokensProperty = (AcceptEventActionHeldTokensProperty)theEObject;
				T1 result = caseAcceptEventActionHeldTokensProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseAcceptEventActionProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseStateProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_EVENT_TYPE_PROPERTY: {
				AcceptEventActionEventTypeProperty acceptEventActionEventTypeProperty = (AcceptEventActionEventTypeProperty)theEObject;
				T1 result = caseAcceptEventActionEventTypeProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseAcceptEventActionProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseSingleReferenceProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseActivityNodeProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseNamedElementProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseStateProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionEventTypeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_INCOMING_PROPERTY: {
				AcceptEventActionIncomingProperty acceptEventActionIncomingProperty = (AcceptEventActionIncomingProperty)theEObject;
				T1 result = caseAcceptEventActionIncomingProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseAcceptEventActionProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseSingleReferenceProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseNamedElementProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseStateProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionIncomingProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACCEPT_EVENT_ACTION_OUTGOING_PROPERTY: {
				AcceptEventActionOutgoingProperty acceptEventActionOutgoingProperty = (AcceptEventActionOutgoingProperty)theEObject;
				T1 result = caseAcceptEventActionOutgoingProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseAcceptEventActionProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseSingleReferenceProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseActivityNodeProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseNamedElementProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseStateProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = caseAbstractProperty(acceptEventActionOutgoingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_NODE_PROPERTY: {
				ControlNodeProperty<?> controlNodeProperty = (ControlNodeProperty<?>)theEObject;
				T1 result = caseControlNodeProperty(controlNodeProperty);
				if (result == null) result = caseActivityNodeProperty(controlNodeProperty);
				if (result == null) result = caseNamedElementProperty(controlNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlNodeProperty);
				if (result == null) result = caseStateProperty(controlNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlNodeProperty);
				if (result == null) result = caseProperty(controlNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlNodeProperty);
				if (result == null) result = caseAbstractProperty(controlNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_CONTROL_NODE_PROPERTY: {
				UnaryControlNodeProperty unaryControlNodeProperty = (UnaryControlNodeProperty)theEObject;
				T1 result = caseUnaryControlNodeProperty(unaryControlNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryControlNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryControlNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryControlNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryControlNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryControlNodeProperty);
				if (result == null) result = caseStateProperty(unaryControlNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryControlNodeProperty);
				if (result == null) result = caseProperty(unaryControlNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryControlNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryControlNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_CONTROL_NODE_PROPERTY: {
				BinaryControlNodeProperty binaryControlNodeProperty = (BinaryControlNodeProperty)theEObject;
				T1 result = caseBinaryControlNodeProperty(binaryControlNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryControlNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryControlNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryControlNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryControlNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryControlNodeProperty);
				if (result == null) result = caseStateProperty(binaryControlNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryControlNodeProperty);
				if (result == null) result = caseProperty(binaryControlNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryControlNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryControlNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_NODE_NAME_PROPERTY: {
				ControlNodeNameProperty controlNodeNameProperty = (ControlNodeNameProperty)theEObject;
				T1 result = caseControlNodeNameProperty(controlNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(controlNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(controlNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(controlNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(controlNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlNodeNameProperty);
				if (result == null) result = caseStateProperty(controlNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlNodeNameProperty);
				if (result == null) result = caseProperty(controlNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlNodeNameProperty);
				if (result == null) result = caseAbstractProperty(controlNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_NODE_ACTIVITY_PROPERTY: {
				ControlNodeActivityProperty controlNodeActivityProperty = (ControlNodeActivityProperty)theEObject;
				T1 result = caseControlNodeActivityProperty(controlNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(controlNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(controlNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(controlNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(controlNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlNodeActivityProperty);
				if (result == null) result = caseStateProperty(controlNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlNodeActivityProperty);
				if (result == null) result = caseProperty(controlNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(controlNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_NODE_RUNNING_PROPERTY: {
				ControlNodeRunningProperty controlNodeRunningProperty = (ControlNodeRunningProperty)theEObject;
				T1 result = caseControlNodeRunningProperty(controlNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(controlNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(controlNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(controlNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(controlNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlNodeRunningProperty);
				if (result == null) result = caseStateProperty(controlNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlNodeRunningProperty);
				if (result == null) result = caseProperty(controlNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(controlNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_CONTROL_NODE_CONTAINER_PROPERTY: {
				ControlTokenControlNodeContainerProperty controlTokenControlNodeContainerProperty = (ControlTokenControlNodeContainerProperty)theEObject;
				T1 result = caseControlTokenControlNodeContainerProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenControlNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_NODE_HELD_TOKENS_PROPERTY: {
				ControlNodeHeldTokensProperty controlNodeHeldTokensProperty = (ControlNodeHeldTokensProperty)theEObject;
				T1 result = caseControlNodeHeldTokensProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(controlNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INITIAL_NODE_PROPERTY: {
				InitialNodeProperty<?> initialNodeProperty = (InitialNodeProperty<?>)theEObject;
				T1 result = caseInitialNodeProperty(initialNodeProperty);
				if (result == null) result = caseControlNodeProperty(initialNodeProperty);
				if (result == null) result = caseActivityNodeProperty(initialNodeProperty);
				if (result == null) result = caseNamedElementProperty(initialNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(initialNodeProperty);
				if (result == null) result = caseStateProperty(initialNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(initialNodeProperty);
				if (result == null) result = caseProperty(initialNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(initialNodeProperty);
				if (result == null) result = caseAbstractProperty(initialNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_INITIAL_NODE_PROPERTY: {
				UnaryInitialNodeProperty unaryInitialNodeProperty = (UnaryInitialNodeProperty)theEObject;
				T1 result = caseUnaryInitialNodeProperty(unaryInitialNodeProperty);
				if (result == null) result = caseInitialNodeProperty(unaryInitialNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryInitialNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryInitialNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryInitialNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryInitialNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryInitialNodeProperty);
				if (result == null) result = caseStateProperty(unaryInitialNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryInitialNodeProperty);
				if (result == null) result = caseProperty(unaryInitialNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryInitialNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryInitialNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_INITIAL_NODE_PROPERTY: {
				BinaryInitialNodeProperty binaryInitialNodeProperty = (BinaryInitialNodeProperty)theEObject;
				T1 result = caseBinaryInitialNodeProperty(binaryInitialNodeProperty);
				if (result == null) result = caseInitialNodeProperty(binaryInitialNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryInitialNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryInitialNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryInitialNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryInitialNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryInitialNodeProperty);
				if (result == null) result = caseStateProperty(binaryInitialNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryInitialNodeProperty);
				if (result == null) result = caseProperty(binaryInitialNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryInitialNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryInitialNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INITIAL_NODE_NAME_PROPERTY: {
				InitialNodeNameProperty initialNodeNameProperty = (InitialNodeNameProperty)theEObject;
				T1 result = caseInitialNodeNameProperty(initialNodeNameProperty);
				if (result == null) result = caseInitialNodeProperty(initialNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(initialNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(initialNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(initialNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(initialNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(initialNodeNameProperty);
				if (result == null) result = caseStateProperty(initialNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(initialNodeNameProperty);
				if (result == null) result = caseProperty(initialNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(initialNodeNameProperty);
				if (result == null) result = caseAbstractProperty(initialNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INITIAL_NODE_ACTIVITY_PROPERTY: {
				InitialNodeActivityProperty initialNodeActivityProperty = (InitialNodeActivityProperty)theEObject;
				T1 result = caseInitialNodeActivityProperty(initialNodeActivityProperty);
				if (result == null) result = caseInitialNodeProperty(initialNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(initialNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(initialNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(initialNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(initialNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(initialNodeActivityProperty);
				if (result == null) result = caseStateProperty(initialNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(initialNodeActivityProperty);
				if (result == null) result = caseProperty(initialNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(initialNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(initialNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INITIAL_NODE_RUNNING_PROPERTY: {
				InitialNodeRunningProperty initialNodeRunningProperty = (InitialNodeRunningProperty)theEObject;
				T1 result = caseInitialNodeRunningProperty(initialNodeRunningProperty);
				if (result == null) result = caseInitialNodeProperty(initialNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(initialNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(initialNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(initialNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(initialNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(initialNodeRunningProperty);
				if (result == null) result = caseStateProperty(initialNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(initialNodeRunningProperty);
				if (result == null) result = caseProperty(initialNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(initialNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(initialNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_INITIAL_NODE_CONTAINER_PROPERTY: {
				ControlTokenInitialNodeContainerProperty controlTokenInitialNodeContainerProperty = (ControlTokenInitialNodeContainerProperty)theEObject;
				T1 result = caseControlTokenInitialNodeContainerProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenInitialNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INITIAL_NODE_HELD_TOKENS_PROPERTY: {
				InitialNodeHeldTokensProperty initialNodeHeldTokensProperty = (InitialNodeHeldTokensProperty)theEObject;
				T1 result = caseInitialNodeHeldTokensProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseInitialNodeProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(initialNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(initialNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INITIAL_NODE_OUTGOING_PROPERTY: {
				InitialNodeOutgoingProperty initialNodeOutgoingProperty = (InitialNodeOutgoingProperty)theEObject;
				T1 result = caseInitialNodeOutgoingProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseInitialNodeProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseSingleReferenceProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseControlNodeProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseActivityNodeProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseNamedElementProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseStateProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(initialNodeOutgoingProperty);
				if (result == null) result = caseAbstractProperty(initialNodeOutgoingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.DECISION_NODE_PROPERTY: {
				DecisionNodeProperty<?> decisionNodeProperty = (DecisionNodeProperty<?>)theEObject;
				T1 result = caseDecisionNodeProperty(decisionNodeProperty);
				if (result == null) result = caseControlNodeProperty(decisionNodeProperty);
				if (result == null) result = caseActivityNodeProperty(decisionNodeProperty);
				if (result == null) result = caseNamedElementProperty(decisionNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(decisionNodeProperty);
				if (result == null) result = caseStateProperty(decisionNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(decisionNodeProperty);
				if (result == null) result = caseProperty(decisionNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(decisionNodeProperty);
				if (result == null) result = caseAbstractProperty(decisionNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_DECISION_NODE_PROPERTY: {
				UnaryDecisionNodeProperty unaryDecisionNodeProperty = (UnaryDecisionNodeProperty)theEObject;
				T1 result = caseUnaryDecisionNodeProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseDecisionNodeProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseStateProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryDecisionNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryDecisionNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_DECISION_NODE_PROPERTY: {
				BinaryDecisionNodeProperty binaryDecisionNodeProperty = (BinaryDecisionNodeProperty)theEObject;
				T1 result = caseBinaryDecisionNodeProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseDecisionNodeProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseStateProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryDecisionNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryDecisionNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.DECISION_NODE_NAME_PROPERTY: {
				DecisionNodeNameProperty decisionNodeNameProperty = (DecisionNodeNameProperty)theEObject;
				T1 result = caseDecisionNodeNameProperty(decisionNodeNameProperty);
				if (result == null) result = caseDecisionNodeProperty(decisionNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(decisionNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(decisionNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(decisionNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(decisionNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(decisionNodeNameProperty);
				if (result == null) result = caseStateProperty(decisionNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(decisionNodeNameProperty);
				if (result == null) result = caseProperty(decisionNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(decisionNodeNameProperty);
				if (result == null) result = caseAbstractProperty(decisionNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.DECISION_NODE_ACTIVITY_PROPERTY: {
				DecisionNodeActivityProperty decisionNodeActivityProperty = (DecisionNodeActivityProperty)theEObject;
				T1 result = caseDecisionNodeActivityProperty(decisionNodeActivityProperty);
				if (result == null) result = caseDecisionNodeProperty(decisionNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(decisionNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(decisionNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(decisionNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(decisionNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(decisionNodeActivityProperty);
				if (result == null) result = caseStateProperty(decisionNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(decisionNodeActivityProperty);
				if (result == null) result = caseProperty(decisionNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(decisionNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(decisionNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.DECISION_NODE_RUNNING_PROPERTY: {
				DecisionNodeRunningProperty decisionNodeRunningProperty = (DecisionNodeRunningProperty)theEObject;
				T1 result = caseDecisionNodeRunningProperty(decisionNodeRunningProperty);
				if (result == null) result = caseDecisionNodeProperty(decisionNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(decisionNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(decisionNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(decisionNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(decisionNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(decisionNodeRunningProperty);
				if (result == null) result = caseStateProperty(decisionNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(decisionNodeRunningProperty);
				if (result == null) result = caseProperty(decisionNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(decisionNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(decisionNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_DECISION_NODE_CONTAINER_PROPERTY: {
				ControlTokenDecisionNodeContainerProperty controlTokenDecisionNodeContainerProperty = (ControlTokenDecisionNodeContainerProperty)theEObject;
				T1 result = caseControlTokenDecisionNodeContainerProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenDecisionNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.DECISION_NODE_HELD_TOKENS_PROPERTY: {
				DecisionNodeHeldTokensProperty decisionNodeHeldTokensProperty = (DecisionNodeHeldTokensProperty)theEObject;
				T1 result = caseDecisionNodeHeldTokensProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseDecisionNodeProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(decisionNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.DECISION_NODE_INCOMING_PROPERTY: {
				DecisionNodeIncomingProperty decisionNodeIncomingProperty = (DecisionNodeIncomingProperty)theEObject;
				T1 result = caseDecisionNodeIncomingProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseDecisionNodeProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseSingleReferenceProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseControlNodeProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseNamedElementProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseStateProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(decisionNodeIncomingProperty);
				if (result == null) result = caseAbstractProperty(decisionNodeIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.DECISION_NODE_OUTGOING_PROPERTY: {
				DecisionNodeOutgoingProperty decisionNodeOutgoingProperty = (DecisionNodeOutgoingProperty)theEObject;
				T1 result = caseDecisionNodeOutgoingProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseDecisionNodeProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseManyReferenceProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseControlNodeProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseActivityNodeProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseNamedElementProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseStateProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(decisionNodeOutgoingProperty);
				if (result == null) result = caseAbstractProperty(decisionNodeOutgoingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.MERGE_NODE_PROPERTY: {
				MergeNodeProperty<?> mergeNodeProperty = (MergeNodeProperty<?>)theEObject;
				T1 result = caseMergeNodeProperty(mergeNodeProperty);
				if (result == null) result = caseControlNodeProperty(mergeNodeProperty);
				if (result == null) result = caseActivityNodeProperty(mergeNodeProperty);
				if (result == null) result = caseNamedElementProperty(mergeNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(mergeNodeProperty);
				if (result == null) result = caseStateProperty(mergeNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(mergeNodeProperty);
				if (result == null) result = caseProperty(mergeNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(mergeNodeProperty);
				if (result == null) result = caseAbstractProperty(mergeNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_MERGE_NODE_PROPERTY: {
				UnaryMergeNodeProperty unaryMergeNodeProperty = (UnaryMergeNodeProperty)theEObject;
				T1 result = caseUnaryMergeNodeProperty(unaryMergeNodeProperty);
				if (result == null) result = caseMergeNodeProperty(unaryMergeNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryMergeNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryMergeNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryMergeNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryMergeNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryMergeNodeProperty);
				if (result == null) result = caseStateProperty(unaryMergeNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryMergeNodeProperty);
				if (result == null) result = caseProperty(unaryMergeNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryMergeNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryMergeNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_MERGE_NODE_PROPERTY: {
				BinaryMergeNodeProperty binaryMergeNodeProperty = (BinaryMergeNodeProperty)theEObject;
				T1 result = caseBinaryMergeNodeProperty(binaryMergeNodeProperty);
				if (result == null) result = caseMergeNodeProperty(binaryMergeNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryMergeNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryMergeNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryMergeNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryMergeNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryMergeNodeProperty);
				if (result == null) result = caseStateProperty(binaryMergeNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryMergeNodeProperty);
				if (result == null) result = caseProperty(binaryMergeNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryMergeNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryMergeNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.MERGE_NODE_NAME_PROPERTY: {
				MergeNodeNameProperty mergeNodeNameProperty = (MergeNodeNameProperty)theEObject;
				T1 result = caseMergeNodeNameProperty(mergeNodeNameProperty);
				if (result == null) result = caseMergeNodeProperty(mergeNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(mergeNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(mergeNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(mergeNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(mergeNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(mergeNodeNameProperty);
				if (result == null) result = caseStateProperty(mergeNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(mergeNodeNameProperty);
				if (result == null) result = caseProperty(mergeNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(mergeNodeNameProperty);
				if (result == null) result = caseAbstractProperty(mergeNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.MERGE_NODE_ACTIVITY_PROPERTY: {
				MergeNodeActivityProperty mergeNodeActivityProperty = (MergeNodeActivityProperty)theEObject;
				T1 result = caseMergeNodeActivityProperty(mergeNodeActivityProperty);
				if (result == null) result = caseMergeNodeProperty(mergeNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(mergeNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(mergeNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(mergeNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(mergeNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(mergeNodeActivityProperty);
				if (result == null) result = caseStateProperty(mergeNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(mergeNodeActivityProperty);
				if (result == null) result = caseProperty(mergeNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(mergeNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(mergeNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.MERGE_NODE_RUNNING_PROPERTY: {
				MergeNodeRunningProperty mergeNodeRunningProperty = (MergeNodeRunningProperty)theEObject;
				T1 result = caseMergeNodeRunningProperty(mergeNodeRunningProperty);
				if (result == null) result = caseMergeNodeProperty(mergeNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(mergeNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(mergeNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(mergeNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(mergeNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(mergeNodeRunningProperty);
				if (result == null) result = caseStateProperty(mergeNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(mergeNodeRunningProperty);
				if (result == null) result = caseProperty(mergeNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(mergeNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(mergeNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_MERGE_NODE_CONTAINER_PROPERTY: {
				ControlTokenMergeNodeContainerProperty controlTokenMergeNodeContainerProperty = (ControlTokenMergeNodeContainerProperty)theEObject;
				T1 result = caseControlTokenMergeNodeContainerProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenMergeNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.MERGE_NODE_HELD_TOKENS_PROPERTY: {
				MergeNodeHeldTokensProperty mergeNodeHeldTokensProperty = (MergeNodeHeldTokensProperty)theEObject;
				T1 result = caseMergeNodeHeldTokensProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseMergeNodeProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(mergeNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.MERGE_NODE_INCOMING_PROPERTY: {
				MergeNodeIncomingProperty mergeNodeIncomingProperty = (MergeNodeIncomingProperty)theEObject;
				T1 result = caseMergeNodeIncomingProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseMergeNodeProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseManyReferenceProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseControlNodeProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseNamedElementProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseStateProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(mergeNodeIncomingProperty);
				if (result == null) result = caseAbstractProperty(mergeNodeIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.MERGE_NODE_OUTGOING_PROPERTY: {
				MergeNodeOutgoingProperty mergeNodeOutgoingProperty = (MergeNodeOutgoingProperty)theEObject;
				T1 result = caseMergeNodeOutgoingProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseMergeNodeProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseSingleReferenceProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseControlNodeProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseActivityNodeProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseNamedElementProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseStateProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(mergeNodeOutgoingProperty);
				if (result == null) result = caseAbstractProperty(mergeNodeOutgoingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FORK_NODE_PROPERTY: {
				ForkNodeProperty<?> forkNodeProperty = (ForkNodeProperty<?>)theEObject;
				T1 result = caseForkNodeProperty(forkNodeProperty);
				if (result == null) result = caseControlNodeProperty(forkNodeProperty);
				if (result == null) result = caseActivityNodeProperty(forkNodeProperty);
				if (result == null) result = caseNamedElementProperty(forkNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(forkNodeProperty);
				if (result == null) result = caseStateProperty(forkNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(forkNodeProperty);
				if (result == null) result = caseProperty(forkNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(forkNodeProperty);
				if (result == null) result = caseAbstractProperty(forkNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_FORK_NODE_PROPERTY: {
				UnaryForkNodeProperty unaryForkNodeProperty = (UnaryForkNodeProperty)theEObject;
				T1 result = caseUnaryForkNodeProperty(unaryForkNodeProperty);
				if (result == null) result = caseForkNodeProperty(unaryForkNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryForkNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryForkNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryForkNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryForkNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryForkNodeProperty);
				if (result == null) result = caseStateProperty(unaryForkNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryForkNodeProperty);
				if (result == null) result = caseProperty(unaryForkNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryForkNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryForkNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_FORK_NODE_PROPERTY: {
				BinaryForkNodeProperty binaryForkNodeProperty = (BinaryForkNodeProperty)theEObject;
				T1 result = caseBinaryForkNodeProperty(binaryForkNodeProperty);
				if (result == null) result = caseForkNodeProperty(binaryForkNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryForkNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryForkNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryForkNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryForkNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryForkNodeProperty);
				if (result == null) result = caseStateProperty(binaryForkNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryForkNodeProperty);
				if (result == null) result = caseProperty(binaryForkNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryForkNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryForkNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FORK_NODE_NAME_PROPERTY: {
				ForkNodeNameProperty forkNodeNameProperty = (ForkNodeNameProperty)theEObject;
				T1 result = caseForkNodeNameProperty(forkNodeNameProperty);
				if (result == null) result = caseForkNodeProperty(forkNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(forkNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(forkNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(forkNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(forkNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(forkNodeNameProperty);
				if (result == null) result = caseStateProperty(forkNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(forkNodeNameProperty);
				if (result == null) result = caseProperty(forkNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(forkNodeNameProperty);
				if (result == null) result = caseAbstractProperty(forkNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FORK_NODE_ACTIVITY_PROPERTY: {
				ForkNodeActivityProperty forkNodeActivityProperty = (ForkNodeActivityProperty)theEObject;
				T1 result = caseForkNodeActivityProperty(forkNodeActivityProperty);
				if (result == null) result = caseForkNodeProperty(forkNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(forkNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(forkNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(forkNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(forkNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(forkNodeActivityProperty);
				if (result == null) result = caseStateProperty(forkNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(forkNodeActivityProperty);
				if (result == null) result = caseProperty(forkNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(forkNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(forkNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FORK_NODE_RUNNING_PROPERTY: {
				ForkNodeRunningProperty forkNodeRunningProperty = (ForkNodeRunningProperty)theEObject;
				T1 result = caseForkNodeRunningProperty(forkNodeRunningProperty);
				if (result == null) result = caseForkNodeProperty(forkNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(forkNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(forkNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(forkNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(forkNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(forkNodeRunningProperty);
				if (result == null) result = caseStateProperty(forkNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(forkNodeRunningProperty);
				if (result == null) result = caseProperty(forkNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(forkNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(forkNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_FORK_NODE_CONTAINER_PROPERTY: {
				ControlTokenForkNodeContainerProperty controlTokenForkNodeContainerProperty = (ControlTokenForkNodeContainerProperty)theEObject;
				T1 result = caseControlTokenForkNodeContainerProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenForkNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FORK_NODE_HELD_TOKENS_PROPERTY: {
				ForkNodeHeldTokensProperty forkNodeHeldTokensProperty = (ForkNodeHeldTokensProperty)theEObject;
				T1 result = caseForkNodeHeldTokensProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseForkNodeProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(forkNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(forkNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FORK_NODE_INCOMING_PROPERTY: {
				ForkNodeIncomingProperty forkNodeIncomingProperty = (ForkNodeIncomingProperty)theEObject;
				T1 result = caseForkNodeIncomingProperty(forkNodeIncomingProperty);
				if (result == null) result = caseForkNodeProperty(forkNodeIncomingProperty);
				if (result == null) result = caseSingleReferenceProperty(forkNodeIncomingProperty);
				if (result == null) result = caseControlNodeProperty(forkNodeIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(forkNodeIncomingProperty);
				if (result == null) result = caseNamedElementProperty(forkNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(forkNodeIncomingProperty);
				if (result == null) result = caseStateProperty(forkNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(forkNodeIncomingProperty);
				if (result == null) result = caseProperty(forkNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(forkNodeIncomingProperty);
				if (result == null) result = caseAbstractProperty(forkNodeIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FORK_NODE_OUTGOING_PROPERTY: {
				ForkNodeOutgoingProperty forkNodeOutgoingProperty = (ForkNodeOutgoingProperty)theEObject;
				T1 result = caseForkNodeOutgoingProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseForkNodeProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseManyReferenceProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseControlNodeProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseActivityNodeProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseNamedElementProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseStateProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(forkNodeOutgoingProperty);
				if (result == null) result = caseAbstractProperty(forkNodeOutgoingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.JOIN_NODE_PROPERTY: {
				JoinNodeProperty<?> joinNodeProperty = (JoinNodeProperty<?>)theEObject;
				T1 result = caseJoinNodeProperty(joinNodeProperty);
				if (result == null) result = caseControlNodeProperty(joinNodeProperty);
				if (result == null) result = caseActivityNodeProperty(joinNodeProperty);
				if (result == null) result = caseNamedElementProperty(joinNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(joinNodeProperty);
				if (result == null) result = caseStateProperty(joinNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(joinNodeProperty);
				if (result == null) result = caseProperty(joinNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(joinNodeProperty);
				if (result == null) result = caseAbstractProperty(joinNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_JOIN_NODE_PROPERTY: {
				UnaryJoinNodeProperty unaryJoinNodeProperty = (UnaryJoinNodeProperty)theEObject;
				T1 result = caseUnaryJoinNodeProperty(unaryJoinNodeProperty);
				if (result == null) result = caseJoinNodeProperty(unaryJoinNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryJoinNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryJoinNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryJoinNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryJoinNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryJoinNodeProperty);
				if (result == null) result = caseStateProperty(unaryJoinNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryJoinNodeProperty);
				if (result == null) result = caseProperty(unaryJoinNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryJoinNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryJoinNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_JOIN_NODE_PROPERTY: {
				BinaryJoinNodeProperty binaryJoinNodeProperty = (BinaryJoinNodeProperty)theEObject;
				T1 result = caseBinaryJoinNodeProperty(binaryJoinNodeProperty);
				if (result == null) result = caseJoinNodeProperty(binaryJoinNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryJoinNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryJoinNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryJoinNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryJoinNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryJoinNodeProperty);
				if (result == null) result = caseStateProperty(binaryJoinNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryJoinNodeProperty);
				if (result == null) result = caseProperty(binaryJoinNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryJoinNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryJoinNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.JOIN_NODE_NAME_PROPERTY: {
				JoinNodeNameProperty joinNodeNameProperty = (JoinNodeNameProperty)theEObject;
				T1 result = caseJoinNodeNameProperty(joinNodeNameProperty);
				if (result == null) result = caseJoinNodeProperty(joinNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(joinNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(joinNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(joinNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(joinNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(joinNodeNameProperty);
				if (result == null) result = caseStateProperty(joinNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(joinNodeNameProperty);
				if (result == null) result = caseProperty(joinNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(joinNodeNameProperty);
				if (result == null) result = caseAbstractProperty(joinNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.JOIN_NODE_ACTIVITY_PROPERTY: {
				JoinNodeActivityProperty joinNodeActivityProperty = (JoinNodeActivityProperty)theEObject;
				T1 result = caseJoinNodeActivityProperty(joinNodeActivityProperty);
				if (result == null) result = caseJoinNodeProperty(joinNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(joinNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(joinNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(joinNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(joinNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(joinNodeActivityProperty);
				if (result == null) result = caseStateProperty(joinNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(joinNodeActivityProperty);
				if (result == null) result = caseProperty(joinNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(joinNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(joinNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.JOIN_NODE_RUNNING_PROPERTY: {
				JoinNodeRunningProperty joinNodeRunningProperty = (JoinNodeRunningProperty)theEObject;
				T1 result = caseJoinNodeRunningProperty(joinNodeRunningProperty);
				if (result == null) result = caseJoinNodeProperty(joinNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(joinNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(joinNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(joinNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(joinNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(joinNodeRunningProperty);
				if (result == null) result = caseStateProperty(joinNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(joinNodeRunningProperty);
				if (result == null) result = caseProperty(joinNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(joinNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(joinNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_JOIN_NODE_CONTAINER_PROPERTY: {
				ControlTokenJoinNodeContainerProperty controlTokenJoinNodeContainerProperty = (ControlTokenJoinNodeContainerProperty)theEObject;
				T1 result = caseControlTokenJoinNodeContainerProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenJoinNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.JOIN_NODE_HELD_TOKENS_PROPERTY: {
				JoinNodeHeldTokensProperty joinNodeHeldTokensProperty = (JoinNodeHeldTokensProperty)theEObject;
				T1 result = caseJoinNodeHeldTokensProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseJoinNodeProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(joinNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(joinNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.JOIN_NODE_INCOMING_PROPERTY: {
				JoinNodeIncomingProperty joinNodeIncomingProperty = (JoinNodeIncomingProperty)theEObject;
				T1 result = caseJoinNodeIncomingProperty(joinNodeIncomingProperty);
				if (result == null) result = caseJoinNodeProperty(joinNodeIncomingProperty);
				if (result == null) result = caseManyReferenceProperty(joinNodeIncomingProperty);
				if (result == null) result = caseControlNodeProperty(joinNodeIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(joinNodeIncomingProperty);
				if (result == null) result = caseNamedElementProperty(joinNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(joinNodeIncomingProperty);
				if (result == null) result = caseStateProperty(joinNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(joinNodeIncomingProperty);
				if (result == null) result = caseProperty(joinNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(joinNodeIncomingProperty);
				if (result == null) result = caseAbstractProperty(joinNodeIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.JOIN_NODE_OUTGOING_PROPERTY: {
				JoinNodeOutgoingProperty joinNodeOutgoingProperty = (JoinNodeOutgoingProperty)theEObject;
				T1 result = caseJoinNodeOutgoingProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseJoinNodeProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseSingleReferenceProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseControlNodeProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseActivityNodeProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseNamedElementProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseStateProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(joinNodeOutgoingProperty);
				if (result == null) result = caseAbstractProperty(joinNodeOutgoingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FINAL_NODE_PROPERTY: {
				FinalNodeProperty<?> finalNodeProperty = (FinalNodeProperty<?>)theEObject;
				T1 result = caseFinalNodeProperty(finalNodeProperty);
				if (result == null) result = caseControlNodeProperty(finalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(finalNodeProperty);
				if (result == null) result = caseNamedElementProperty(finalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(finalNodeProperty);
				if (result == null) result = caseStateProperty(finalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(finalNodeProperty);
				if (result == null) result = caseProperty(finalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(finalNodeProperty);
				if (result == null) result = caseAbstractProperty(finalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_FINAL_NODE_PROPERTY: {
				UnaryFinalNodeProperty unaryFinalNodeProperty = (UnaryFinalNodeProperty)theEObject;
				T1 result = caseUnaryFinalNodeProperty(unaryFinalNodeProperty);
				if (result == null) result = caseFinalNodeProperty(unaryFinalNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryFinalNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryFinalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryFinalNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryFinalNodeProperty);
				if (result == null) result = caseStateProperty(unaryFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryFinalNodeProperty);
				if (result == null) result = caseProperty(unaryFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryFinalNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryFinalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_FINAL_NODE_PROPERTY: {
				BinaryFinalNodeProperty binaryFinalNodeProperty = (BinaryFinalNodeProperty)theEObject;
				T1 result = caseBinaryFinalNodeProperty(binaryFinalNodeProperty);
				if (result == null) result = caseFinalNodeProperty(binaryFinalNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryFinalNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryFinalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryFinalNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryFinalNodeProperty);
				if (result == null) result = caseStateProperty(binaryFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryFinalNodeProperty);
				if (result == null) result = caseProperty(binaryFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryFinalNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryFinalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FINAL_NODE_NAME_PROPERTY: {
				FinalNodeNameProperty finalNodeNameProperty = (FinalNodeNameProperty)theEObject;
				T1 result = caseFinalNodeNameProperty(finalNodeNameProperty);
				if (result == null) result = caseFinalNodeProperty(finalNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(finalNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(finalNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(finalNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(finalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(finalNodeNameProperty);
				if (result == null) result = caseStateProperty(finalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(finalNodeNameProperty);
				if (result == null) result = caseProperty(finalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(finalNodeNameProperty);
				if (result == null) result = caseAbstractProperty(finalNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FINAL_NODE_ACTIVITY_PROPERTY: {
				FinalNodeActivityProperty finalNodeActivityProperty = (FinalNodeActivityProperty)theEObject;
				T1 result = caseFinalNodeActivityProperty(finalNodeActivityProperty);
				if (result == null) result = caseFinalNodeProperty(finalNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(finalNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(finalNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(finalNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(finalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(finalNodeActivityProperty);
				if (result == null) result = caseStateProperty(finalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(finalNodeActivityProperty);
				if (result == null) result = caseProperty(finalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(finalNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(finalNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FINAL_NODE_RUNNING_PROPERTY: {
				FinalNodeRunningProperty finalNodeRunningProperty = (FinalNodeRunningProperty)theEObject;
				T1 result = caseFinalNodeRunningProperty(finalNodeRunningProperty);
				if (result == null) result = caseFinalNodeProperty(finalNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(finalNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(finalNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(finalNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(finalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(finalNodeRunningProperty);
				if (result == null) result = caseStateProperty(finalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(finalNodeRunningProperty);
				if (result == null) result = caseProperty(finalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(finalNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(finalNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_FINAL_NODE_CONTAINER_PROPERTY: {
				ControlTokenFinalNodeContainerProperty controlTokenFinalNodeContainerProperty = (ControlTokenFinalNodeContainerProperty)theEObject;
				T1 result = caseControlTokenFinalNodeContainerProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenFinalNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FINAL_NODE_HELD_TOKENS_PROPERTY: {
				FinalNodeHeldTokensProperty finalNodeHeldTokensProperty = (FinalNodeHeldTokensProperty)theEObject;
				T1 result = caseFinalNodeHeldTokensProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseFinalNodeProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(finalNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(finalNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FINAL_NODE_INCOMING_PROPERTY: {
				FinalNodeIncomingProperty finalNodeIncomingProperty = (FinalNodeIncomingProperty)theEObject;
				T1 result = caseFinalNodeIncomingProperty(finalNodeIncomingProperty);
				if (result == null) result = caseFinalNodeProperty(finalNodeIncomingProperty);
				if (result == null) result = caseSingleReferenceProperty(finalNodeIncomingProperty);
				if (result == null) result = caseControlNodeProperty(finalNodeIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(finalNodeIncomingProperty);
				if (result == null) result = caseNamedElementProperty(finalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(finalNodeIncomingProperty);
				if (result == null) result = caseStateProperty(finalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(finalNodeIncomingProperty);
				if (result == null) result = caseProperty(finalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(finalNodeIncomingProperty);
				if (result == null) result = caseAbstractProperty(finalNodeIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_PROPERTY: {
				ActivityFinalNodeProperty<?> activityFinalNodeProperty = (ActivityFinalNodeProperty<?>)theEObject;
				T1 result = caseActivityFinalNodeProperty(activityFinalNodeProperty);
				if (result == null) result = caseFinalNodeProperty(activityFinalNodeProperty);
				if (result == null) result = caseControlNodeProperty(activityFinalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(activityFinalNodeProperty);
				if (result == null) result = caseNamedElementProperty(activityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityFinalNodeProperty);
				if (result == null) result = caseStateProperty(activityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityFinalNodeProperty);
				if (result == null) result = caseProperty(activityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityFinalNodeProperty);
				if (result == null) result = caseAbstractProperty(activityFinalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_ACTIVITY_FINAL_NODE_PROPERTY: {
				UnaryActivityFinalNodeProperty unaryActivityFinalNodeProperty = (UnaryActivityFinalNodeProperty)theEObject;
				T1 result = caseUnaryActivityFinalNodeProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseActivityFinalNodeProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseFinalNodeProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseStateProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryActivityFinalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_ACTIVITY_FINAL_NODE_PROPERTY: {
				BinaryActivityFinalNodeProperty binaryActivityFinalNodeProperty = (BinaryActivityFinalNodeProperty)theEObject;
				T1 result = caseBinaryActivityFinalNodeProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseActivityFinalNodeProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseFinalNodeProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseStateProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryActivityFinalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_NAME_PROPERTY: {
				ActivityFinalNodeNameProperty activityFinalNodeNameProperty = (ActivityFinalNodeNameProperty)theEObject;
				T1 result = caseActivityFinalNodeNameProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseActivityFinalNodeProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseFinalNodeProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseStateProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityFinalNodeNameProperty);
				if (result == null) result = caseAbstractProperty(activityFinalNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_ACTIVITY_PROPERTY: {
				ActivityFinalNodeActivityProperty activityFinalNodeActivityProperty = (ActivityFinalNodeActivityProperty)theEObject;
				T1 result = caseActivityFinalNodeActivityProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseActivityFinalNodeProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseFinalNodeProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseStateProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityFinalNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(activityFinalNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_RUNNING_PROPERTY: {
				ActivityFinalNodeRunningProperty activityFinalNodeRunningProperty = (ActivityFinalNodeRunningProperty)theEObject;
				T1 result = caseActivityFinalNodeRunningProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseActivityFinalNodeProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseFinalNodeProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseStateProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityFinalNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(activityFinalNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_ACTIVITY_FINAL_NODE_CONTAINER_PROPERTY: {
				ControlTokenActivityFinalNodeContainerProperty controlTokenActivityFinalNodeContainerProperty = (ControlTokenActivityFinalNodeContainerProperty)theEObject;
				T1 result = caseControlTokenActivityFinalNodeContainerProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenActivityFinalNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_HELD_TOKENS_PROPERTY: {
				ActivityFinalNodeHeldTokensProperty activityFinalNodeHeldTokensProperty = (ActivityFinalNodeHeldTokensProperty)theEObject;
				T1 result = caseActivityFinalNodeHeldTokensProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseActivityFinalNodeProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseFinalNodeProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(activityFinalNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.ACTIVITY_FINAL_NODE_INCOMING_PROPERTY: {
				ActivityFinalNodeIncomingProperty activityFinalNodeIncomingProperty = (ActivityFinalNodeIncomingProperty)theEObject;
				T1 result = caseActivityFinalNodeIncomingProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseActivityFinalNodeProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseSingleReferenceProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseFinalNodeProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseControlNodeProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseNamedElementProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseStateProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = caseAbstractProperty(activityFinalNodeIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_PROPERTY: {
				FlowFinalNodeProperty<?> flowFinalNodeProperty = (FlowFinalNodeProperty<?>)theEObject;
				T1 result = caseFlowFinalNodeProperty(flowFinalNodeProperty);
				if (result == null) result = caseFinalNodeProperty(flowFinalNodeProperty);
				if (result == null) result = caseControlNodeProperty(flowFinalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(flowFinalNodeProperty);
				if (result == null) result = caseNamedElementProperty(flowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(flowFinalNodeProperty);
				if (result == null) result = caseStateProperty(flowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(flowFinalNodeProperty);
				if (result == null) result = caseProperty(flowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(flowFinalNodeProperty);
				if (result == null) result = caseAbstractProperty(flowFinalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_FLOW_FINAL_NODE_PROPERTY: {
				UnaryFlowFinalNodeProperty unaryFlowFinalNodeProperty = (UnaryFlowFinalNodeProperty)theEObject;
				T1 result = caseUnaryFlowFinalNodeProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseFlowFinalNodeProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseUnaryProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseFinalNodeProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseControlNodeProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseNamedElementProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseStateProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = caseAbstractProperty(unaryFlowFinalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_FLOW_FINAL_NODE_PROPERTY: {
				BinaryFlowFinalNodeProperty binaryFlowFinalNodeProperty = (BinaryFlowFinalNodeProperty)theEObject;
				T1 result = caseBinaryFlowFinalNodeProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseFlowFinalNodeProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseBinaryProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseFinalNodeProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseControlNodeProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseActivityNodeProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseNamedElementProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseStateProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = caseAbstractProperty(binaryFlowFinalNodeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_NAME_PROPERTY: {
				FlowFinalNodeNameProperty flowFinalNodeNameProperty = (FlowFinalNodeNameProperty)theEObject;
				T1 result = caseFlowFinalNodeNameProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseFlowFinalNodeProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseStringAttributeProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseFinalNodeProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseControlNodeProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseActivityNodeProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseNamedElementProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseStateProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(flowFinalNodeNameProperty);
				if (result == null) result = caseAbstractProperty(flowFinalNodeNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_ACTIVITY_PROPERTY: {
				FlowFinalNodeActivityProperty flowFinalNodeActivityProperty = (FlowFinalNodeActivityProperty)theEObject;
				T1 result = caseFlowFinalNodeActivityProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseFlowFinalNodeProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseSingleReferenceProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseFinalNodeProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseControlNodeProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseActivityNodeProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseNamedElementProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseStateProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(flowFinalNodeActivityProperty);
				if (result == null) result = caseAbstractProperty(flowFinalNodeActivityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_RUNNING_PROPERTY: {
				FlowFinalNodeRunningProperty flowFinalNodeRunningProperty = (FlowFinalNodeRunningProperty)theEObject;
				T1 result = caseFlowFinalNodeRunningProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseFlowFinalNodeProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseBooleanAttributeProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseFinalNodeProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseControlNodeProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseActivityNodeProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseNamedElementProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseStateProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(flowFinalNodeRunningProperty);
				if (result == null) result = caseAbstractProperty(flowFinalNodeRunningProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.CONTROL_TOKEN_FLOW_FINAL_NODE_CONTAINER_PROPERTY: {
				ControlTokenFlowFinalNodeContainerProperty controlTokenFlowFinalNodeContainerProperty = (ControlTokenFlowFinalNodeContainerProperty)theEObject;
				T1 result = caseControlTokenFlowFinalNodeContainerProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = caseControlTokenProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = caseStateProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = caseProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = caseAbstractProperty(controlTokenFlowFinalNodeContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY: {
				FlowFinalNodeHeldTokensProperty flowFinalNodeHeldTokensProperty = (FlowFinalNodeHeldTokensProperty)theEObject;
				T1 result = caseFlowFinalNodeHeldTokensProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseFlowFinalNodeProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseManyReferenceProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseFinalNodeProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseControlNodeProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseActivityNodeProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseNamedElementProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseStateProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = caseAbstractProperty(flowFinalNodeHeldTokensProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.FLOW_FINAL_NODE_INCOMING_PROPERTY: {
				FlowFinalNodeIncomingProperty flowFinalNodeIncomingProperty = (FlowFinalNodeIncomingProperty)theEObject;
				T1 result = caseFlowFinalNodeIncomingProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseFlowFinalNodeProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseSingleReferenceProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseFinalNodeProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseControlNodeProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseActivityNodeProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseNamedElementProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseStateProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = caseAbstractProperty(flowFinalNodeIncomingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.VALUE_PROPERTY: {
				ValueProperty<?> valueProperty = (ValueProperty<?>)theEObject;
				T1 result = caseValueProperty(valueProperty);
				if (result == null) result = caseExpressionProperty(valueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(valueProperty);
				if (result == null) result = caseStateProperty(valueProperty);
				if (result == null) result = caseXActivityDiagramProperty(valueProperty);
				if (result == null) result = caseProperty(valueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(valueProperty);
				if (result == null) result = caseAbstractProperty(valueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_VALUE_PROPERTY: {
				UnaryValueProperty unaryValueProperty = (UnaryValueProperty)theEObject;
				T1 result = caseUnaryValueProperty(unaryValueProperty);
				if (result == null) result = caseValueProperty(unaryValueProperty);
				if (result == null) result = caseUnaryProperty(unaryValueProperty);
				if (result == null) result = caseExpressionProperty(unaryValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryValueProperty);
				if (result == null) result = caseStateProperty(unaryValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryValueProperty);
				if (result == null) result = caseProperty(unaryValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryValueProperty);
				if (result == null) result = caseAbstractProperty(unaryValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_VALUE_PROPERTY: {
				BinaryValueProperty binaryValueProperty = (BinaryValueProperty)theEObject;
				T1 result = caseBinaryValueProperty(binaryValueProperty);
				if (result == null) result = caseValueProperty(binaryValueProperty);
				if (result == null) result = caseBinaryProperty(binaryValueProperty);
				if (result == null) result = caseExpressionProperty(binaryValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryValueProperty);
				if (result == null) result = caseStateProperty(binaryValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryValueProperty);
				if (result == null) result = caseProperty(binaryValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryValueProperty);
				if (result == null) result = caseAbstractProperty(binaryValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_EXPRESSION_PROPERTY: {
				IntegerExpressionProperty<?> integerExpressionProperty = (IntegerExpressionProperty<?>)theEObject;
				T1 result = caseIntegerExpressionProperty(integerExpressionProperty);
				if (result == null) result = caseExpressionProperty(integerExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerExpressionProperty);
				if (result == null) result = caseStateProperty(integerExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerExpressionProperty);
				if (result == null) result = caseProperty(integerExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerExpressionProperty);
				if (result == null) result = caseAbstractProperty(integerExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_EXPRESSION_PROPERTY: {
				UnaryIntegerExpressionProperty unaryIntegerExpressionProperty = (UnaryIntegerExpressionProperty)theEObject;
				T1 result = caseUnaryIntegerExpressionProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseIntegerExpressionProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseUnaryProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseExpressionProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseStateProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryIntegerExpressionProperty);
				if (result == null) result = caseAbstractProperty(unaryIntegerExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_EXPRESSION_PROPERTY: {
				BinaryIntegerExpressionProperty binaryIntegerExpressionProperty = (BinaryIntegerExpressionProperty)theEObject;
				T1 result = caseBinaryIntegerExpressionProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseIntegerExpressionProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseBinaryProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseExpressionProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseStateProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryIntegerExpressionProperty);
				if (result == null) result = caseAbstractProperty(binaryIntegerExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_PROPERTY: {
				IntegerVariableProperty<?> integerVariableProperty = (IntegerVariableProperty<?>)theEObject;
				T1 result = caseIntegerVariableProperty(integerVariableProperty);
				if (result == null) result = caseVariableProperty(integerVariableProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerVariableProperty);
				if (result == null) result = caseExpressionProperty(integerVariableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerVariableProperty);
				if (result == null) result = caseStateProperty(integerVariableProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerVariableProperty);
				if (result == null) result = caseProperty(integerVariableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerVariableProperty);
				if (result == null) result = caseAbstractProperty(integerVariableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_VARIABLE_PROPERTY: {
				UnaryIntegerVariableProperty unaryIntegerVariableProperty = (UnaryIntegerVariableProperty)theEObject;
				T1 result = caseUnaryIntegerVariableProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseIntegerVariableProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseUnaryProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseVariableProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseIntegerExpressionProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseExpressionProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseStateProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryIntegerVariableProperty);
				if (result == null) result = caseAbstractProperty(unaryIntegerVariableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VARIABLE_PROPERTY: {
				BinaryIntegerVariableProperty binaryIntegerVariableProperty = (BinaryIntegerVariableProperty)theEObject;
				T1 result = caseBinaryIntegerVariableProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseIntegerVariableProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseBinaryProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseVariableProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseIntegerExpressionProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseExpressionProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseStateProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryIntegerVariableProperty);
				if (result == null) result = caseAbstractProperty(binaryIntegerVariableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_NAME_PROPERTY: {
				IntegerVariableNameProperty integerVariableNameProperty = (IntegerVariableNameProperty)theEObject;
				T1 result = caseIntegerVariableNameProperty(integerVariableNameProperty);
				if (result == null) result = caseIntegerVariableProperty(integerVariableNameProperty);
				if (result == null) result = caseStringAttributeProperty(integerVariableNameProperty);
				if (result == null) result = caseVariableProperty(integerVariableNameProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerVariableNameProperty);
				if (result == null) result = caseExpressionProperty(integerVariableNameProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerVariableNameProperty);
				if (result == null) result = caseStateProperty(integerVariableNameProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerVariableNameProperty);
				if (result == null) result = caseProperty(integerVariableNameProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerVariableNameProperty);
				if (result == null) result = caseAbstractProperty(integerVariableNameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_INITIAL_VALUE_PROPERTY: {
				IntegerVariableInitialValueProperty integerVariableInitialValueProperty = (IntegerVariableInitialValueProperty)theEObject;
				T1 result = caseIntegerVariableInitialValueProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseIntegerVariableProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseIntegerAttributeProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseVariableProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseExpressionProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseStateProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerVariableInitialValueProperty);
				if (result == null) result = caseAbstractProperty(integerVariableInitialValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_CURRENT_VALUE_PROPERTY: {
				IntegerVariableCurrentValueProperty integerVariableCurrentValueProperty = (IntegerVariableCurrentValueProperty)theEObject;
				T1 result = caseIntegerVariableCurrentValueProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseIntegerVariableProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseIntegerAttributeProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseVariableProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseExpressionProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseStateProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerVariableCurrentValueProperty);
				if (result == null) result = caseAbstractProperty(integerVariableCurrentValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VALUE_PROPERTY: {
				BooleanValueProperty<?> booleanValueProperty = (BooleanValueProperty<?>)theEObject;
				T1 result = caseBooleanValueProperty(booleanValueProperty);
				if (result == null) result = caseValueProperty(booleanValueProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanValueProperty);
				if (result == null) result = caseExpressionProperty(booleanValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanValueProperty);
				if (result == null) result = caseStateProperty(booleanValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanValueProperty);
				if (result == null) result = caseProperty(booleanValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanValueProperty);
				if (result == null) result = caseAbstractProperty(booleanValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_VALUE_PROPERTY: {
				UnaryBooleanValueProperty unaryBooleanValueProperty = (UnaryBooleanValueProperty)theEObject;
				T1 result = caseUnaryBooleanValueProperty(unaryBooleanValueProperty);
				if (result == null) result = caseBooleanValueProperty(unaryBooleanValueProperty);
				if (result == null) result = caseUnaryProperty(unaryBooleanValueProperty);
				if (result == null) result = caseValueProperty(unaryBooleanValueProperty);
				if (result == null) result = caseBooleanExpressionProperty(unaryBooleanValueProperty);
				if (result == null) result = caseExpressionProperty(unaryBooleanValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryBooleanValueProperty);
				if (result == null) result = caseStateProperty(unaryBooleanValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryBooleanValueProperty);
				if (result == null) result = caseProperty(unaryBooleanValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryBooleanValueProperty);
				if (result == null) result = caseAbstractProperty(unaryBooleanValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_VALUE_PROPERTY: {
				BinaryBooleanValueProperty binaryBooleanValueProperty = (BinaryBooleanValueProperty)theEObject;
				T1 result = caseBinaryBooleanValueProperty(binaryBooleanValueProperty);
				if (result == null) result = caseBooleanValueProperty(binaryBooleanValueProperty);
				if (result == null) result = caseBinaryProperty(binaryBooleanValueProperty);
				if (result == null) result = caseValueProperty(binaryBooleanValueProperty);
				if (result == null) result = caseBooleanExpressionProperty(binaryBooleanValueProperty);
				if (result == null) result = caseExpressionProperty(binaryBooleanValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryBooleanValueProperty);
				if (result == null) result = caseStateProperty(binaryBooleanValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryBooleanValueProperty);
				if (result == null) result = caseProperty(binaryBooleanValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryBooleanValueProperty);
				if (result == null) result = caseAbstractProperty(binaryBooleanValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VALUE_VALUE_PROPERTY: {
				BooleanValueValueProperty booleanValueValueProperty = (BooleanValueValueProperty)theEObject;
				T1 result = caseBooleanValueValueProperty(booleanValueValueProperty);
				if (result == null) result = caseBooleanValueProperty(booleanValueValueProperty);
				if (result == null) result = caseBooleanAttributeProperty(booleanValueValueProperty);
				if (result == null) result = caseValueProperty(booleanValueValueProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanValueValueProperty);
				if (result == null) result = caseExpressionProperty(booleanValueValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanValueValueProperty);
				if (result == null) result = caseStateProperty(booleanValueValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanValueValueProperty);
				if (result == null) result = caseProperty(booleanValueValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanValueValueProperty);
				if (result == null) result = caseAbstractProperty(booleanValueValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VALUE_PROPERTY: {
				IntegerValueProperty<?> integerValueProperty = (IntegerValueProperty<?>)theEObject;
				T1 result = caseIntegerValueProperty(integerValueProperty);
				if (result == null) result = caseValueProperty(integerValueProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerValueProperty);
				if (result == null) result = caseExpressionProperty(integerValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerValueProperty);
				if (result == null) result = caseStateProperty(integerValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerValueProperty);
				if (result == null) result = caseProperty(integerValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerValueProperty);
				if (result == null) result = caseAbstractProperty(integerValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_VALUE_PROPERTY: {
				UnaryIntegerValueProperty unaryIntegerValueProperty = (UnaryIntegerValueProperty)theEObject;
				T1 result = caseUnaryIntegerValueProperty(unaryIntegerValueProperty);
				if (result == null) result = caseIntegerValueProperty(unaryIntegerValueProperty);
				if (result == null) result = caseUnaryProperty(unaryIntegerValueProperty);
				if (result == null) result = caseValueProperty(unaryIntegerValueProperty);
				if (result == null) result = caseIntegerExpressionProperty(unaryIntegerValueProperty);
				if (result == null) result = caseExpressionProperty(unaryIntegerValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryIntegerValueProperty);
				if (result == null) result = caseStateProperty(unaryIntegerValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryIntegerValueProperty);
				if (result == null) result = caseProperty(unaryIntegerValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryIntegerValueProperty);
				if (result == null) result = caseAbstractProperty(unaryIntegerValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VALUE_PROPERTY: {
				BinaryIntegerValueProperty binaryIntegerValueProperty = (BinaryIntegerValueProperty)theEObject;
				T1 result = caseBinaryIntegerValueProperty(binaryIntegerValueProperty);
				if (result == null) result = caseIntegerValueProperty(binaryIntegerValueProperty);
				if (result == null) result = caseBinaryProperty(binaryIntegerValueProperty);
				if (result == null) result = caseValueProperty(binaryIntegerValueProperty);
				if (result == null) result = caseIntegerExpressionProperty(binaryIntegerValueProperty);
				if (result == null) result = caseExpressionProperty(binaryIntegerValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryIntegerValueProperty);
				if (result == null) result = caseStateProperty(binaryIntegerValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryIntegerValueProperty);
				if (result == null) result = caseProperty(binaryIntegerValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryIntegerValueProperty);
				if (result == null) result = caseAbstractProperty(binaryIntegerValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VALUE_VALUE_PROPERTY: {
				IntegerValueValueProperty integerValueValueProperty = (IntegerValueValueProperty)theEObject;
				T1 result = caseIntegerValueValueProperty(integerValueValueProperty);
				if (result == null) result = caseIntegerValueProperty(integerValueValueProperty);
				if (result == null) result = caseIntegerAttributeProperty(integerValueValueProperty);
				if (result == null) result = caseValueProperty(integerValueValueProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerValueValueProperty);
				if (result == null) result = caseExpressionProperty(integerValueValueProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerValueValueProperty);
				if (result == null) result = caseStateProperty(integerValueValueProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerValueValueProperty);
				if (result == null) result = caseProperty(integerValueValueProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerValueValueProperty);
				if (result == null) result = caseAbstractProperty(integerValueValueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_PROPERTY: {
				IntegerBinaryExpressionProperty<?> integerBinaryExpressionProperty = (IntegerBinaryExpressionProperty<?>)theEObject;
				T1 result = caseIntegerBinaryExpressionProperty(integerBinaryExpressionProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerBinaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(integerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerBinaryExpressionProperty);
				if (result == null) result = caseStateProperty(integerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerBinaryExpressionProperty);
				if (result == null) result = caseProperty(integerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerBinaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(integerBinaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_BINARY_EXPRESSION_PROPERTY: {
				UnaryIntegerBinaryExpressionProperty unaryIntegerBinaryExpressionProperty = (UnaryIntegerBinaryExpressionProperty)theEObject;
				T1 result = caseUnaryIntegerBinaryExpressionProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseIntegerBinaryExpressionProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseUnaryProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseIntegerExpressionProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseStateProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(unaryIntegerBinaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_BINARY_EXPRESSION_PROPERTY: {
				BinaryIntegerBinaryExpressionProperty binaryIntegerBinaryExpressionProperty = (BinaryIntegerBinaryExpressionProperty)theEObject;
				T1 result = caseBinaryIntegerBinaryExpressionProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseIntegerBinaryExpressionProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseBinaryProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseIntegerExpressionProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseStateProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(binaryIntegerBinaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY: {
				IntegerBinaryExpressionOperand1Property integerBinaryExpressionOperand1Property = (IntegerBinaryExpressionOperand1Property)theEObject;
				T1 result = caseIntegerBinaryExpressionOperand1Property(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseIntegerBinaryExpressionProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseSingleReferenceProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseIntegerExpressionProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseExpressionProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramStateProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseStateProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = caseAbstractProperty(integerBinaryExpressionOperand1Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERAND2_PROPERTY: {
				IntegerBinaryExpressionOperand2Property integerBinaryExpressionOperand2Property = (IntegerBinaryExpressionOperand2Property)theEObject;
				T1 result = caseIntegerBinaryExpressionOperand2Property(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseIntegerBinaryExpressionProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseSingleReferenceProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseIntegerExpressionProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseExpressionProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramStateProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseStateProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = caseAbstractProperty(integerBinaryExpressionOperand2Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_BINARY_EXPRESSION_OPERATOR_PROPERTY: {
				IntegerBinaryExpressionOperatorProperty integerBinaryExpressionOperatorProperty = (IntegerBinaryExpressionOperatorProperty)theEObject;
				T1 result = caseIntegerBinaryExpressionOperatorProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseIntegerBinaryExpressionProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseExpressionProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseStateProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = caseAbstractProperty(integerBinaryExpressionOperatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_COMPARISON_EXPRESSION_PROPERTY: {
				IntegerComparisonExpressionProperty<?> integerComparisonExpressionProperty = (IntegerComparisonExpressionProperty<?>)theEObject;
				T1 result = caseIntegerComparisonExpressionProperty(integerComparisonExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(integerComparisonExpressionProperty);
				if (result == null) result = caseExpressionProperty(integerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerComparisonExpressionProperty);
				if (result == null) result = caseStateProperty(integerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerComparisonExpressionProperty);
				if (result == null) result = caseProperty(integerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerComparisonExpressionProperty);
				if (result == null) result = caseAbstractProperty(integerComparisonExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY: {
				UnaryIntegerComparisonExpressionProperty unaryIntegerComparisonExpressionProperty = (UnaryIntegerComparisonExpressionProperty)theEObject;
				T1 result = caseUnaryIntegerComparisonExpressionProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseIntegerComparisonExpressionProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseUnaryProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseExpressionProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseStateProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseAbstractProperty(unaryIntegerComparisonExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY: {
				BinaryIntegerComparisonExpressionProperty binaryIntegerComparisonExpressionProperty = (BinaryIntegerComparisonExpressionProperty)theEObject;
				T1 result = caseBinaryIntegerComparisonExpressionProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseIntegerComparisonExpressionProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseBinaryProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseExpressionProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseStateProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = caseAbstractProperty(binaryIntegerComparisonExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_COMPARISON_EXPRESSION_OPERATOR_PROPERTY: {
				IntegerComparisonExpressionOperatorProperty integerComparisonExpressionOperatorProperty = (IntegerComparisonExpressionOperatorProperty)theEObject;
				T1 result = caseIntegerComparisonExpressionOperatorProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseIntegerComparisonExpressionProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseBooleanExpressionProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseExpressionProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseStateProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = caseAbstractProperty(integerComparisonExpressionOperatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_COMPARISON_EXPRESSION_OPERAND1_PROPERTY: {
				IntegerComparisonExpressionOperand1Property integerComparisonExpressionOperand1Property = (IntegerComparisonExpressionOperand1Property)theEObject;
				T1 result = caseIntegerComparisonExpressionOperand1Property(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseIntegerComparisonExpressionProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseSingleReferenceProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseBooleanExpressionProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseExpressionProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramStateProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseStateProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = caseAbstractProperty(integerComparisonExpressionOperand1Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_COMPARISON_EXPRESSION_OPERAND2_PROPERTY: {
				IntegerComparisonExpressionOperand2Property integerComparisonExpressionOperand2Property = (IntegerComparisonExpressionOperand2Property)theEObject;
				T1 result = caseIntegerComparisonExpressionOperand2Property(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseIntegerComparisonExpressionProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseSingleReferenceProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseBooleanExpressionProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseExpressionProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramStateProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseStateProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = caseAbstractProperty(integerComparisonExpressionOperand2Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_UNARY_EXPRESSION_PROPERTY: {
				BooleanUnaryExpressionProperty<?> booleanUnaryExpressionProperty = (BooleanUnaryExpressionProperty<?>)theEObject;
				T1 result = caseBooleanUnaryExpressionProperty(booleanUnaryExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanUnaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(booleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanUnaryExpressionProperty);
				if (result == null) result = caseStateProperty(booleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanUnaryExpressionProperty);
				if (result == null) result = caseProperty(booleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanUnaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(booleanUnaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY: {
				UnaryBooleanUnaryExpressionProperty unaryBooleanUnaryExpressionProperty = (UnaryBooleanUnaryExpressionProperty)theEObject;
				T1 result = caseUnaryBooleanUnaryExpressionProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseBooleanUnaryExpressionProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseUnaryProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseStateProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(unaryBooleanUnaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY: {
				BinaryBooleanUnaryExpressionProperty binaryBooleanUnaryExpressionProperty = (BinaryBooleanUnaryExpressionProperty)theEObject;
				T1 result = caseBinaryBooleanUnaryExpressionProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseBooleanUnaryExpressionProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseBinaryProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseStateProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(binaryBooleanUnaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_PROPERTY: {
				BooleanUnaryExpressionOperandProperty booleanUnaryExpressionOperandProperty = (BooleanUnaryExpressionOperandProperty)theEObject;
				T1 result = caseBooleanUnaryExpressionOperandProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseBooleanUnaryExpressionProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseSingleReferenceProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseExpressionProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseStateProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = caseAbstractProperty(booleanUnaryExpressionOperandProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_UNARY_EXPRESSION_OPERATOR_PROPERTY: {
				BooleanUnaryExpressionOperatorProperty booleanUnaryExpressionOperatorProperty = (BooleanUnaryExpressionOperatorProperty)theEObject;
				T1 result = caseBooleanUnaryExpressionOperatorProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseBooleanUnaryExpressionProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseExpressionProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseStateProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = caseAbstractProperty(booleanUnaryExpressionOperatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_BINARY_EXPRESSION_PROPERTY: {
				BooleanBinaryExpressionProperty<?> booleanBinaryExpressionProperty = (BooleanBinaryExpressionProperty<?>)theEObject;
				T1 result = caseBooleanBinaryExpressionProperty(booleanBinaryExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanBinaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(booleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanBinaryExpressionProperty);
				if (result == null) result = caseStateProperty(booleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanBinaryExpressionProperty);
				if (result == null) result = caseProperty(booleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanBinaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(booleanBinaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY: {
				UnaryBooleanBinaryExpressionProperty unaryBooleanBinaryExpressionProperty = (UnaryBooleanBinaryExpressionProperty)theEObject;
				T1 result = caseUnaryBooleanBinaryExpressionProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseBooleanBinaryExpressionProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseUnaryProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseStateProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(unaryBooleanBinaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY: {
				BinaryBooleanBinaryExpressionProperty binaryBooleanBinaryExpressionProperty = (BinaryBooleanBinaryExpressionProperty)theEObject;
				T1 result = caseBinaryBooleanBinaryExpressionProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseBooleanBinaryExpressionProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseBinaryProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseBooleanExpressionProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseExpressionProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseStateProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = caseAbstractProperty(binaryBooleanBinaryExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND1_PROPERTY: {
				BooleanBinaryExpressionOperand1Property booleanBinaryExpressionOperand1Property = (BooleanBinaryExpressionOperand1Property)theEObject;
				T1 result = caseBooleanBinaryExpressionOperand1Property(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseBooleanBinaryExpressionProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseSingleReferenceProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseBooleanExpressionProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseExpressionProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseStateProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = caseAbstractProperty(booleanBinaryExpressionOperand1Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_PROPERTY: {
				BooleanBinaryExpressionOperand2Property booleanBinaryExpressionOperand2Property = (BooleanBinaryExpressionOperand2Property)theEObject;
				T1 result = caseBooleanBinaryExpressionOperand2Property(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseBooleanBinaryExpressionProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseSingleReferenceProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseBooleanExpressionProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseExpressionProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseStateProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = caseAbstractProperty(booleanBinaryExpressionOperand2Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_BINARY_EXPRESSION_OPERATOR_PROPERTY: {
				BooleanBinaryExpressionOperatorProperty booleanBinaryExpressionOperatorProperty = (BooleanBinaryExpressionOperatorProperty)theEObject;
				T1 result = caseBooleanBinaryExpressionOperatorProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseBooleanBinaryExpressionProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseExpressionProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseStateProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = caseAbstractProperty(booleanBinaryExpressionOperatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY: {
				BooleanVariableAssignmentProperty<?> booleanVariableAssignmentProperty = (BooleanVariableAssignmentProperty<?>)theEObject;
				T1 result = caseBooleanVariableAssignmentProperty(booleanVariableAssignmentProperty);
				if (result == null) result = caseVariableAssignmentProperty(booleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanVariableAssignmentProperty);
				if (result == null) result = caseStateProperty(booleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanVariableAssignmentProperty);
				if (result == null) result = caseProperty(booleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanVariableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(booleanVariableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY: {
				UnaryBooleanVariableAssignmentProperty unaryBooleanVariableAssignmentProperty = (UnaryBooleanVariableAssignmentProperty)theEObject;
				T1 result = caseUnaryBooleanVariableAssignmentProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseBooleanVariableAssignmentProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseUnaryProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseVariableAssignmentProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseStateProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(unaryBooleanVariableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY: {
				BinaryBooleanVariableAssignmentProperty binaryBooleanVariableAssignmentProperty = (BinaryBooleanVariableAssignmentProperty)theEObject;
				T1 result = caseBinaryBooleanVariableAssignmentProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseBooleanVariableAssignmentProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseBinaryProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseVariableAssignmentProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseStateProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(binaryBooleanVariableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY: {
				BooleanVariableAssignmentAssigneeProperty booleanVariableAssignmentAssigneeProperty = (BooleanVariableAssignmentAssigneeProperty)theEObject;
				T1 result = caseBooleanVariableAssignmentAssigneeProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseBooleanVariableAssignmentProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseSingleReferenceProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseVariableAssignmentProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseStateProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = caseAbstractProperty(booleanVariableAssignmentAssigneeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_EXPRESSION_BOOLEAN_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY: {
				BooleanExpressionBooleanVariableAssignmentContainerProperty booleanExpressionBooleanVariableAssignmentContainerProperty = (BooleanExpressionBooleanVariableAssignmentContainerProperty)theEObject;
				T1 result = caseBooleanExpressionBooleanVariableAssignmentContainerProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseBooleanExpressionProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseExpressionProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseStateProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = caseAbstractProperty(booleanExpressionBooleanVariableAssignmentContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BOOLEAN_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY: {
				BooleanVariableAssignmentExpressionProperty booleanVariableAssignmentExpressionProperty = (BooleanVariableAssignmentExpressionProperty)theEObject;
				T1 result = caseBooleanVariableAssignmentExpressionProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseBooleanVariableAssignmentProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseSingleReferenceProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseVariableAssignmentProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseStateProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = caseAbstractProperty(booleanVariableAssignmentExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_ASSIGNMENT_PROPERTY: {
				IntegerVariableAssignmentProperty<?> integerVariableAssignmentProperty = (IntegerVariableAssignmentProperty<?>)theEObject;
				T1 result = caseIntegerVariableAssignmentProperty(integerVariableAssignmentProperty);
				if (result == null) result = caseVariableAssignmentProperty(integerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerVariableAssignmentProperty);
				if (result == null) result = caseStateProperty(integerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerVariableAssignmentProperty);
				if (result == null) result = caseProperty(integerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerVariableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(integerVariableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY: {
				UnaryIntegerVariableAssignmentProperty unaryIntegerVariableAssignmentProperty = (UnaryIntegerVariableAssignmentProperty)theEObject;
				T1 result = caseUnaryIntegerVariableAssignmentProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseIntegerVariableAssignmentProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseUnaryProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseVariableAssignmentProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseStateProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(unaryIntegerVariableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY: {
				BinaryIntegerVariableAssignmentProperty binaryIntegerVariableAssignmentProperty = (BinaryIntegerVariableAssignmentProperty)theEObject;
				T1 result = caseBinaryIntegerVariableAssignmentProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseIntegerVariableAssignmentProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseBinaryProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseVariableAssignmentProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseStateProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = caseAbstractProperty(binaryIntegerVariableAssignmentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY: {
				IntegerVariableAssignmentAssigneeProperty integerVariableAssignmentAssigneeProperty = (IntegerVariableAssignmentAssigneeProperty)theEObject;
				T1 result = caseIntegerVariableAssignmentAssigneeProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseIntegerVariableAssignmentProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseSingleReferenceProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseVariableAssignmentProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseStateProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = caseAbstractProperty(integerVariableAssignmentAssigneeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_EXPRESSION_INTEGER_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY: {
				IntegerExpressionIntegerVariableAssignmentContainerProperty integerExpressionIntegerVariableAssignmentContainerProperty = (IntegerExpressionIntegerVariableAssignmentContainerProperty)theEObject;
				T1 result = caseIntegerExpressionIntegerVariableAssignmentContainerProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseIntegerExpressionProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseExpressionProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseStateProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = caseAbstractProperty(integerExpressionIntegerVariableAssignmentContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.INTEGER_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY: {
				IntegerVariableAssignmentExpressionProperty integerVariableAssignmentExpressionProperty = (IntegerVariableAssignmentExpressionProperty)theEObject;
				T1 result = caseIntegerVariableAssignmentExpressionProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseIntegerVariableAssignmentProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseSingleReferenceProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseVariableAssignmentProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseStateProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseXActivityDiagramProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = caseAbstractProperty(integerVariableAssignmentExpressionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.OFFER_PROPERTY: {
				OfferProperty<?> offerProperty = (OfferProperty<?>)theEObject;
				T1 result = caseOfferProperty(offerProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(offerProperty);
				if (result == null) result = caseStateProperty(offerProperty);
				if (result == null) result = caseXActivityDiagramProperty(offerProperty);
				if (result == null) result = caseProperty(offerProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(offerProperty);
				if (result == null) result = caseAbstractProperty(offerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.UNARY_OFFER_PROPERTY: {
				UnaryOfferProperty unaryOfferProperty = (UnaryOfferProperty)theEObject;
				T1 result = caseUnaryOfferProperty(unaryOfferProperty);
				if (result == null) result = caseOfferProperty(unaryOfferProperty);
				if (result == null) result = caseUnaryProperty(unaryOfferProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(unaryOfferProperty);
				if (result == null) result = caseStateProperty(unaryOfferProperty);
				if (result == null) result = caseXActivityDiagramProperty(unaryOfferProperty);
				if (result == null) result = caseProperty(unaryOfferProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(unaryOfferProperty);
				if (result == null) result = caseAbstractProperty(unaryOfferProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.BINARY_OFFER_PROPERTY: {
				BinaryOfferProperty binaryOfferProperty = (BinaryOfferProperty)theEObject;
				T1 result = caseBinaryOfferProperty(binaryOfferProperty);
				if (result == null) result = caseOfferProperty(binaryOfferProperty);
				if (result == null) result = caseBinaryProperty(binaryOfferProperty);
				if (result == null) result = caseXActivityDiagramStateProperty(binaryOfferProperty);
				if (result == null) result = caseStateProperty(binaryOfferProperty);
				if (result == null) result = caseXActivityDiagramProperty(binaryOfferProperty);
				if (result == null) result = caseProperty(binaryOfferProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(binaryOfferProperty);
				if (result == null) result = caseAbstractProperty(binaryOfferProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_NEXT_PROPERTY: {
				XActivityDiagramNextProperty xActivityDiagramNextProperty = (XActivityDiagramNextProperty)theEObject;
				T1 result = caseXActivityDiagramNextProperty(xActivityDiagramNextProperty);
				if (result == null) result = caseNextProperty(xActivityDiagramNextProperty);
				if (result == null) result = caseXActivityDiagramTemporalProperty(xActivityDiagramNextProperty);
				if (result == null) result = caseTemporalProperty(xActivityDiagramNextProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(xActivityDiagramNextProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramNextProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_UNTIL_PROPERTY: {
				XActivityDiagramUntilProperty xActivityDiagramUntilProperty = (XActivityDiagramUntilProperty)theEObject;
				T1 result = caseXActivityDiagramUntilProperty(xActivityDiagramUntilProperty);
				if (result == null) result = caseUntilProperty(xActivityDiagramUntilProperty);
				if (result == null) result = caseXActivityDiagramTemporalProperty(xActivityDiagramUntilProperty);
				if (result == null) result = caseTemporalProperty(xActivityDiagramUntilProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(xActivityDiagramUntilProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramUntilProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_RELEASE_PROPERTY: {
				XActivityDiagramReleaseProperty xActivityDiagramReleaseProperty = (XActivityDiagramReleaseProperty)theEObject;
				T1 result = caseXActivityDiagramReleaseProperty(xActivityDiagramReleaseProperty);
				if (result == null) result = caseReleaseProperty(xActivityDiagramReleaseProperty);
				if (result == null) result = caseXActivityDiagramTemporalProperty(xActivityDiagramReleaseProperty);
				if (result == null) result = caseTemporalProperty(xActivityDiagramReleaseProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(xActivityDiagramReleaseProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramReleaseProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramPropertyPackage.XACTIVITY_DIAGRAM_NEGATION_TEMPORAL_PROPERTY: {
				XActivityDiagramNegationTemporalProperty xActivityDiagramNegationTemporalProperty = (XActivityDiagramNegationTemporalProperty)theEObject;
				T1 result = caseXActivityDiagramNegationTemporalProperty(xActivityDiagramNegationTemporalProperty);
				if (result == null) result = caseNegationTemporalProperty(xActivityDiagramNegationTemporalProperty);
				if (result == null) result = caseXActivityDiagramTemporalProperty(xActivityDiagramNegationTemporalProperty);
				if (result == null) result = caseTemporalProperty(xActivityDiagramNegationTemporalProperty);
				if (result == null) result = caseXActivityDiagramAbstractProperty(xActivityDiagramNegationTemporalProperty);
				if (result == null) result = caseAbstractProperty(xActivityDiagramNegationTemporalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeExecuteProperty(JoinNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeExecuteProperty(FinalNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeExecuteProperty(DecisionNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeExecuteProperty(ActivityFinalNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Terminate Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Terminate Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeTerminateProperty(ActivityNodeTerminateProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionExecuteProperty(OpaqueActionExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Add Token Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Add Token Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeAddTokenProperty(ActivityNodeAddTokenProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableAssignmentExecuteProperty(VariableAssignmentExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeExecuteProperty(MergeNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Init Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Init Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableInitProperty(VariableInitProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityExecuteProperty(ActivityExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeExecuteProperty(ForkNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionExecuteProperty(AcceptEventActionExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeExecuteProperty(FlowFinalNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeExecuteProperty(InitialNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableAssignmentExecuteProperty(BooleanVariableAssignmentExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Remove Token Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Remove Token Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeRemoveTokenProperty(ActivityNodeRemoveTokenProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Assignment Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Assignment Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableAssignmentExecuteProperty(IntegerVariableAssignmentExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Accept Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Accept Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionAcceptProperty(AcceptEventActionAcceptProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Execute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Execute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeExecuteProperty(ActivityNodeExecuteProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Wait For Event Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Wait For Event Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionWaitForEventProperty(AcceptEventActionWaitForEventProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramAbstractProperty(XActivityDiagramAbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramTemporalProperty(XActivityDiagramTemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramProperty(XActivityDiagramProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram State Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram State Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseXActivityDiagramStateProperty(XActivityDiagramStateProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Step Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Step Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseXActivityDiagramStepProperty(XActivityDiagramStepProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends NamedElement> T1 caseNamedElementProperty(NamedElementProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Named Element Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Named Element Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryNamedElementProperty(UnaryNamedElementProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Named Element Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Named Element Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryNamedElementProperty(BinaryNamedElementProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElementNameProperty(NamedElementNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Activity> T1 caseActivityProperty(ActivityProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryActivityProperty(UnaryActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryActivityProperty(BinaryActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNameProperty(ActivityNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Activity Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Activity Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventActivityContainerProperty(EventActivityContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Event> T1 caseEventProperty(EventProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Event Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Event Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryEventProperty(UnaryEventProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Event Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Event Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryEventProperty(BinaryEventProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventNameProperty(EventNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Events Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Events Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEventsProperty(ActivityEventsProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Nodes Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Nodes Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodesProperty(ActivityNodesProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ActivityNode> T1 caseActivityNodeProperty(ActivityNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Activity Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Activity Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryActivityNodeProperty(UnaryActivityNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Activity Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Activity Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryActivityNodeProperty(BinaryActivityNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeNameProperty(ActivityNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeActivityProperty(ActivityNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeRunningProperty(ActivityNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Activity Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Activity Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenActivityNodeContainerProperty(ControlTokenActivityNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ControlToken> T1 caseControlTokenProperty(ControlTokenProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Control Token Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Control Token Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryControlTokenProperty(UnaryControlTokenProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Control Token Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Control Token Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryControlTokenProperty(BinaryControlTokenProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeHeldTokensProperty(ActivityNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Activity Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Activity Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdgeActivityContainerProperty(ActivityEdgeActivityContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ActivityEdge> T1 caseActivityEdgeProperty(ActivityEdgeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Activity Edge Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Activity Edge Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryActivityEdgeProperty(UnaryActivityEdgeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Activity Edge Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Activity Edge Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryActivityEdgeProperty(BinaryActivityEdgeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdgeNameProperty(ActivityEdgeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Source Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Source Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdgeSourceProperty(ActivityEdgeSourceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Target Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Target Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdgeTargetProperty(ActivityEdgeTargetProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Activity Edge Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Activity Edge Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenActivityEdgeContainerProperty(ControlTokenActivityEdgeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Offered Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Offered Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdgeOfferedTokensProperty(ActivityEdgeOfferedTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edges Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edges Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdgesProperty(ActivityEdgesProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Activity Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Activity Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableActivityContainerProperty(VariableActivityContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Variable> T1 caseVariableProperty(VariableProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Expression> T1 caseExpressionProperty(ExpressionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryExpressionProperty(UnaryExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryExpressionProperty(BinaryExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryVariableProperty(UnaryVariableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryVariableProperty(BinaryVariableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableNameProperty(VariableNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Locals Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Locals Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityLocalsProperty(ActivityLocalsProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ControlFlow> T1 caseControlFlowProperty(ControlFlowProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Control Flow Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Control Flow Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryControlFlowProperty(UnaryControlFlowProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Control Flow Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Control Flow Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryControlFlowProperty(BinaryControlFlowProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowNameProperty(ControlFlowNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Source Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Source Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowSourceProperty(ControlFlowSourceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Target Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Target Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowTargetProperty(ControlFlowTargetProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Control Flow Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Control Flow Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenControlFlowContainerProperty(ControlTokenControlFlowContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Offered Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Offered Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowOfferedTokensProperty(ControlFlowOfferedTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Guard Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Guard Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowGuardProperty(ControlFlowGuardProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends BooleanVariable> T1 caseBooleanVariableProperty(BooleanVariableProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends BooleanExpression> T1 caseBooleanExpressionProperty(BooleanExpressionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Boolean Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Boolean Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryBooleanExpressionProperty(UnaryBooleanExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Boolean Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Boolean Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryBooleanExpressionProperty(BinaryBooleanExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Boolean Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Boolean Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryBooleanVariableProperty(UnaryBooleanVariableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Boolean Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Boolean Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryBooleanVariableProperty(BinaryBooleanVariableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableNameProperty(BooleanVariableNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Initial Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Initial Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableInitialValueProperty(BooleanVariableInitialValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Current Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Current Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableCurrentValueProperty(BooleanVariableCurrentValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Action> T1 caseActionProperty(ActionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryActionProperty(UnaryActionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryActionProperty(BinaryActionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionNameProperty(ActionNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionActivityProperty(ActionActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionRunningProperty(ActionRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Action Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Action Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenActionContainerProperty(ControlTokenActionContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionHeldTokensProperty(ActionHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionIncomingProperty(ActionIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Outgoing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Outgoing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionOutgoingProperty(ActionOutgoingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends OpaqueAction> T1 caseOpaqueActionProperty(OpaqueActionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Opaque Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Opaque Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryOpaqueActionProperty(UnaryOpaqueActionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Opaque Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Opaque Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryOpaqueActionProperty(BinaryOpaqueActionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionNameProperty(OpaqueActionNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionActivityProperty(OpaqueActionActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionRunningProperty(OpaqueActionRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Opaque Action Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Opaque Action Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenOpaqueActionContainerProperty(ControlTokenOpaqueActionContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionHeldTokensProperty(OpaqueActionHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionIncomingProperty(OpaqueActionIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Outgoing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Outgoing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionOutgoingProperty(OpaqueActionOutgoingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Opaque Action Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment Opaque Action Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableAssignmentOpaqueActionContainerProperty(VariableAssignmentOpaqueActionContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends VariableAssignment> T1 caseVariableAssignmentProperty(VariableAssignmentProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryVariableAssignmentProperty(UnaryVariableAssignmentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryVariableAssignmentProperty(BinaryVariableAssignmentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Assignments Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Assignments Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionAssignmentsProperty(OpaqueActionAssignmentsProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends AcceptEventAction> T1 caseAcceptEventActionProperty(AcceptEventActionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Accept Event Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Accept Event Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryAcceptEventActionProperty(UnaryAcceptEventActionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Accept Event Action Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Accept Event Action Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryAcceptEventActionProperty(BinaryAcceptEventActionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionNameProperty(AcceptEventActionNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionActivityProperty(AcceptEventActionActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionRunningProperty(AcceptEventActionRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Accept Event Action Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Accept Event Action Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenAcceptEventActionContainerProperty(ControlTokenAcceptEventActionContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionHeldTokensProperty(AcceptEventActionHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Event Type Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Event Type Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionEventTypeProperty(AcceptEventActionEventTypeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionIncomingProperty(AcceptEventActionIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Outgoing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Outgoing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionOutgoingProperty(AcceptEventActionOutgoingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ControlNode> T1 caseControlNodeProperty(ControlNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Control Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Control Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryControlNodeProperty(UnaryControlNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Control Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Control Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryControlNodeProperty(BinaryControlNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlNodeNameProperty(ControlNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlNodeActivityProperty(ControlNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlNodeRunningProperty(ControlNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Control Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Control Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenControlNodeContainerProperty(ControlTokenControlNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlNodeHeldTokensProperty(ControlNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends InitialNode> T1 caseInitialNodeProperty(InitialNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Initial Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Initial Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryInitialNodeProperty(UnaryInitialNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Initial Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Initial Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryInitialNodeProperty(BinaryInitialNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeNameProperty(InitialNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeActivityProperty(InitialNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeRunningProperty(InitialNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Initial Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Initial Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenInitialNodeContainerProperty(ControlTokenInitialNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeHeldTokensProperty(InitialNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Outgoing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Outgoing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeOutgoingProperty(InitialNodeOutgoingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends DecisionNode> T1 caseDecisionNodeProperty(DecisionNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Decision Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Decision Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryDecisionNodeProperty(UnaryDecisionNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Decision Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Decision Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryDecisionNodeProperty(BinaryDecisionNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeNameProperty(DecisionNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeActivityProperty(DecisionNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeRunningProperty(DecisionNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Decision Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Decision Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenDecisionNodeContainerProperty(ControlTokenDecisionNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeHeldTokensProperty(DecisionNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeIncomingProperty(DecisionNodeIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Outgoing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Outgoing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeOutgoingProperty(DecisionNodeOutgoingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends MergeNode> T1 caseMergeNodeProperty(MergeNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Merge Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Merge Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryMergeNodeProperty(UnaryMergeNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Merge Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Merge Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryMergeNodeProperty(BinaryMergeNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeNameProperty(MergeNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeActivityProperty(MergeNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeRunningProperty(MergeNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Merge Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Merge Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenMergeNodeContainerProperty(ControlTokenMergeNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeHeldTokensProperty(MergeNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeIncomingProperty(MergeNodeIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Outgoing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Outgoing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeOutgoingProperty(MergeNodeOutgoingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ForkNode> T1 caseForkNodeProperty(ForkNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Fork Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Fork Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryForkNodeProperty(UnaryForkNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Fork Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Fork Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryForkNodeProperty(BinaryForkNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeNameProperty(ForkNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeActivityProperty(ForkNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeRunningProperty(ForkNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Fork Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Fork Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenForkNodeContainerProperty(ControlTokenForkNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeHeldTokensProperty(ForkNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeIncomingProperty(ForkNodeIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Outgoing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Outgoing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeOutgoingProperty(ForkNodeOutgoingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends JoinNode> T1 caseJoinNodeProperty(JoinNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Join Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Join Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryJoinNodeProperty(UnaryJoinNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Join Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Join Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryJoinNodeProperty(BinaryJoinNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeNameProperty(JoinNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeActivityProperty(JoinNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeRunningProperty(JoinNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Join Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Join Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenJoinNodeContainerProperty(ControlTokenJoinNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeHeldTokensProperty(JoinNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeIncomingProperty(JoinNodeIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Outgoing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Outgoing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeOutgoingProperty(JoinNodeOutgoingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends FinalNode> T1 caseFinalNodeProperty(FinalNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryFinalNodeProperty(UnaryFinalNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryFinalNodeProperty(BinaryFinalNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeNameProperty(FinalNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeActivityProperty(FinalNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeRunningProperty(FinalNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Final Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Final Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenFinalNodeContainerProperty(ControlTokenFinalNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeHeldTokensProperty(FinalNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeIncomingProperty(FinalNodeIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ActivityFinalNode> T1 caseActivityFinalNodeProperty(ActivityFinalNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Activity Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Activity Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryActivityFinalNodeProperty(UnaryActivityFinalNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Activity Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Activity Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryActivityFinalNodeProperty(BinaryActivityFinalNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeNameProperty(ActivityFinalNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeActivityProperty(ActivityFinalNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeRunningProperty(ActivityFinalNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Activity Final Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Activity Final Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenActivityFinalNodeContainerProperty(ControlTokenActivityFinalNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeHeldTokensProperty(ActivityFinalNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeIncomingProperty(ActivityFinalNodeIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends FlowFinalNode> T1 caseFlowFinalNodeProperty(FlowFinalNodeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Flow Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Flow Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryFlowFinalNodeProperty(UnaryFlowFinalNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Flow Final Node Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Flow Final Node Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryFlowFinalNodeProperty(BinaryFlowFinalNodeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeNameProperty(FlowFinalNodeNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeActivityProperty(FlowFinalNodeActivityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Running Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Running Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeRunningProperty(FlowFinalNodeRunningProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Token Flow Final Node Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Token Flow Final Node Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlTokenFlowFinalNodeContainerProperty(ControlTokenFlowFinalNodeContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Held Tokens Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Held Tokens Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeHeldTokensProperty(FlowFinalNodeHeldTokensProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Incoming Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Incoming Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeIncomingProperty(FlowFinalNodeIncomingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Value> T1 caseValueProperty(ValueProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryValueProperty(UnaryValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryValueProperty(BinaryValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IntegerExpression> T1 caseIntegerExpressionProperty(IntegerExpressionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Integer Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Integer Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryIntegerExpressionProperty(UnaryIntegerExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Integer Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Integer Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryIntegerExpressionProperty(BinaryIntegerExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IntegerVariable> T1 caseIntegerVariableProperty(IntegerVariableProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Integer Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Integer Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryIntegerVariableProperty(UnaryIntegerVariableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Integer Variable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Integer Variable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryIntegerVariableProperty(BinaryIntegerVariableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Name Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Name Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableNameProperty(IntegerVariableNameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Initial Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Initial Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableInitialValueProperty(IntegerVariableInitialValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Current Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Current Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableCurrentValueProperty(IntegerVariableCurrentValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends BooleanValue> T1 caseBooleanValueProperty(BooleanValueProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Boolean Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Boolean Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryBooleanValueProperty(UnaryBooleanValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Boolean Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Boolean Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryBooleanValueProperty(BinaryBooleanValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanValueValueProperty(BooleanValueValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IntegerValue> T1 caseIntegerValueProperty(IntegerValueProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Integer Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Integer Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryIntegerValueProperty(UnaryIntegerValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Integer Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Integer Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryIntegerValueProperty(BinaryIntegerValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerValueValueProperty(IntegerValueValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Binary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Binary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IntegerBinaryExpression> T1 caseIntegerBinaryExpressionProperty(IntegerBinaryExpressionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Integer Binary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Integer Binary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryIntegerBinaryExpressionProperty(UnaryIntegerBinaryExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Integer Binary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Integer Binary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryIntegerBinaryExpressionProperty(BinaryIntegerBinaryExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Binary Expression Operand1 Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Binary Expression Operand1 Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerBinaryExpressionOperand1Property(IntegerBinaryExpressionOperand1Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Binary Expression Operand2 Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Binary Expression Operand2 Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerBinaryExpressionOperand2Property(IntegerBinaryExpressionOperand2Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Binary Expression Operator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Binary Expression Operator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerBinaryExpressionOperatorProperty(IntegerBinaryExpressionOperatorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IntegerComparisonExpression> T1 caseIntegerComparisonExpressionProperty(IntegerComparisonExpressionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Integer Comparison Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Integer Comparison Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryIntegerComparisonExpressionProperty(UnaryIntegerComparisonExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Integer Comparison Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Integer Comparison Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryIntegerComparisonExpressionProperty(BinaryIntegerComparisonExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression Operator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression Operator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerComparisonExpressionOperatorProperty(IntegerComparisonExpressionOperatorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression Operand1 Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression Operand1 Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerComparisonExpressionOperand1Property(IntegerComparisonExpressionOperand1Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression Operand2 Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression Operand2 Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerComparisonExpressionOperand2Property(IntegerComparisonExpressionOperand2Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends BooleanUnaryExpression> T1 caseBooleanUnaryExpressionProperty(BooleanUnaryExpressionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Boolean Unary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Boolean Unary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryBooleanUnaryExpressionProperty(UnaryBooleanUnaryExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Boolean Unary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Boolean Unary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryBooleanUnaryExpressionProperty(BinaryBooleanUnaryExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression Operand Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression Operand Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanUnaryExpressionOperandProperty(BooleanUnaryExpressionOperandProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression Operator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression Operator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanUnaryExpressionOperatorProperty(BooleanUnaryExpressionOperatorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends BooleanBinaryExpression> T1 caseBooleanBinaryExpressionProperty(BooleanBinaryExpressionProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Boolean Binary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Boolean Binary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryBooleanBinaryExpressionProperty(UnaryBooleanBinaryExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Boolean Binary Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Boolean Binary Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryBooleanBinaryExpressionProperty(BinaryBooleanBinaryExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression Operand1 Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression Operand1 Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanBinaryExpressionOperand1Property(BooleanBinaryExpressionOperand1Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression Operand2 Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression Operand2 Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanBinaryExpressionOperand2Property(BooleanBinaryExpressionOperand2Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression Operator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression Operator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanBinaryExpressionOperatorProperty(BooleanBinaryExpressionOperatorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends BooleanVariableAssignment> T1 caseBooleanVariableAssignmentProperty(BooleanVariableAssignmentProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Boolean Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Boolean Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryBooleanVariableAssignmentProperty(UnaryBooleanVariableAssignmentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Boolean Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Boolean Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryBooleanVariableAssignmentProperty(BinaryBooleanVariableAssignmentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Assignee Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Assignee Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableAssignmentAssigneeProperty(BooleanVariableAssignmentAssigneeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Boolean Variable Assignment Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression Boolean Variable Assignment Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanExpressionBooleanVariableAssignmentContainerProperty(BooleanExpressionBooleanVariableAssignmentContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableAssignmentExpressionProperty(BooleanVariableAssignmentExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IntegerVariableAssignment> T1 caseIntegerVariableAssignmentProperty(IntegerVariableAssignmentProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Integer Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Integer Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryIntegerVariableAssignmentProperty(UnaryIntegerVariableAssignmentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Integer Variable Assignment Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Integer Variable Assignment Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryIntegerVariableAssignmentProperty(BinaryIntegerVariableAssignmentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Assignment Assignee Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Assignment Assignee Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableAssignmentAssigneeProperty(IntegerVariableAssignmentAssigneeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression Integer Variable Assignment Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression Integer Variable Assignment Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerExpressionIntegerVariableAssignmentContainerProperty(IntegerExpressionIntegerVariableAssignmentContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Assignment Expression Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Assignment Expression Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableAssignmentExpressionProperty(IntegerVariableAssignmentExpressionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Offer> T1 caseOfferProperty(OfferProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Offer Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Offer Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryOfferProperty(UnaryOfferProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Offer Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Offer Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryOfferProperty(BinaryOfferProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Next Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Next Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramNextProperty(XActivityDiagramNextProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Until Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramUntilProperty(XActivityDiagramUntilProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Release Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Release Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramReleaseProperty(XActivityDiagramReleaseProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Negation Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Negation Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramNegationTemporalProperty(XActivityDiagramNegationTemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractProperty(AbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseStepProperty(StepProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTemporalProperty(TemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseStateProperty(StateProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseUnaryProperty(UnaryProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseBinaryProperty(BinaryProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseStringAttributeProperty(StringAttributeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseContainerReferenceProperty(ContainerReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseManyReferenceProperty(ManyReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseSingleReferenceProperty(SingleReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseBooleanAttributeProperty(BooleanAttributeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseIntegerAttributeProperty(IntegerAttributeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseNextProperty(NextProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseUntilProperty(UntilProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseReleaseProperty(ReleaseProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends TemporalProperty> T1 caseNegationTemporalProperty(NegationTemporalProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //XActivityDiagramPropertySwitch
