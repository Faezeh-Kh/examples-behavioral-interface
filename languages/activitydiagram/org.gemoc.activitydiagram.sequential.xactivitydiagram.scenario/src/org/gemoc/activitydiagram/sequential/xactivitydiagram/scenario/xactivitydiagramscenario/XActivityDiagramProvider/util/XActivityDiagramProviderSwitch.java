/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.util;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.ElementProvider;
import fr.inria.diverse.event.commons.model.scenario.ElementQuery;
import fr.inria.diverse.event.commons.model.scenario.ElementReference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.*;

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
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage
 * @generated
 */
public class XActivityDiagramProviderSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XActivityDiagramProviderPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramProviderSwitch() {
		if (modelPackage == null) {
			modelPackage = XActivityDiagramProviderPackage.eINSTANCE;
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
			case XActivityDiagramProviderPackage.ACCEPT_EVENT_ACTION_PROVIDER: {
				AcceptEventActionProvider acceptEventActionProvider = (AcceptEventActionProvider)theEObject;
				T1 result = caseAcceptEventActionProvider(acceptEventActionProvider);
				if (result == null) result = caseElementProvider(acceptEventActionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACCEPT_EVENT_ACTION_REFERENCE: {
				AcceptEventActionReference acceptEventActionReference = (AcceptEventActionReference)theEObject;
				T1 result = caseAcceptEventActionReference(acceptEventActionReference);
				if (result == null) result = caseElementReference(acceptEventActionReference);
				if (result == null) result = caseAcceptEventActionProvider(acceptEventActionReference);
				if (result == null) result = caseElementProvider(acceptEventActionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACCEPT_EVENT_ACTION_QUERY: {
				AcceptEventActionQuery acceptEventActionQuery = (AcceptEventActionQuery)theEObject;
				T1 result = caseAcceptEventActionQuery(acceptEventActionQuery);
				if (result == null) result = caseElementQuery(acceptEventActionQuery);
				if (result == null) result = caseAcceptEventActionProvider(acceptEventActionQuery);
				if (result == null) result = caseElementProvider(acceptEventActionQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.EVENT_PROVIDER: {
				EventProvider eventProvider = (EventProvider)theEObject;
				T1 result = caseEventProvider(eventProvider);
				if (result == null) result = caseElementProvider(eventProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.EVENT_REFERENCE: {
				EventReference eventReference = (EventReference)theEObject;
				T1 result = caseEventReference(eventReference);
				if (result == null) result = caseElementReference(eventReference);
				if (result == null) result = caseEventProvider(eventReference);
				if (result == null) result = caseElementProvider(eventReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.EVENT_QUERY: {
				EventQuery eventQuery = (EventQuery)theEObject;
				T1 result = caseEventQuery(eventQuery);
				if (result == null) result = caseElementQuery(eventQuery);
				if (result == null) result = caseEventProvider(eventQuery);
				if (result == null) result = caseElementProvider(eventQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.JOIN_NODE_PROVIDER: {
				JoinNodeProvider joinNodeProvider = (JoinNodeProvider)theEObject;
				T1 result = caseJoinNodeProvider(joinNodeProvider);
				if (result == null) result = caseElementProvider(joinNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.JOIN_NODE_REFERENCE: {
				JoinNodeReference joinNodeReference = (JoinNodeReference)theEObject;
				T1 result = caseJoinNodeReference(joinNodeReference);
				if (result == null) result = caseElementReference(joinNodeReference);
				if (result == null) result = caseJoinNodeProvider(joinNodeReference);
				if (result == null) result = caseElementProvider(joinNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.JOIN_NODE_QUERY: {
				JoinNodeQuery joinNodeQuery = (JoinNodeQuery)theEObject;
				T1 result = caseJoinNodeQuery(joinNodeQuery);
				if (result == null) result = caseElementQuery(joinNodeQuery);
				if (result == null) result = caseJoinNodeProvider(joinNodeQuery);
				if (result == null) result = caseElementProvider(joinNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FINAL_NODE_PROVIDER: {
				FinalNodeProvider finalNodeProvider = (FinalNodeProvider)theEObject;
				T1 result = caseFinalNodeProvider(finalNodeProvider);
				if (result == null) result = caseElementProvider(finalNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FINAL_NODE_REFERENCE: {
				FinalNodeReference finalNodeReference = (FinalNodeReference)theEObject;
				T1 result = caseFinalNodeReference(finalNodeReference);
				if (result == null) result = caseElementReference(finalNodeReference);
				if (result == null) result = caseFinalNodeProvider(finalNodeReference);
				if (result == null) result = caseElementProvider(finalNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FINAL_NODE_QUERY: {
				FinalNodeQuery finalNodeQuery = (FinalNodeQuery)theEObject;
				T1 result = caseFinalNodeQuery(finalNodeQuery);
				if (result == null) result = caseElementQuery(finalNodeQuery);
				if (result == null) result = caseFinalNodeProvider(finalNodeQuery);
				if (result == null) result = caseElementProvider(finalNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.DECISION_NODE_PROVIDER: {
				DecisionNodeProvider decisionNodeProvider = (DecisionNodeProvider)theEObject;
				T1 result = caseDecisionNodeProvider(decisionNodeProvider);
				if (result == null) result = caseElementProvider(decisionNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.DECISION_NODE_REFERENCE: {
				DecisionNodeReference decisionNodeReference = (DecisionNodeReference)theEObject;
				T1 result = caseDecisionNodeReference(decisionNodeReference);
				if (result == null) result = caseElementReference(decisionNodeReference);
				if (result == null) result = caseDecisionNodeProvider(decisionNodeReference);
				if (result == null) result = caseElementProvider(decisionNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.DECISION_NODE_QUERY: {
				DecisionNodeQuery decisionNodeQuery = (DecisionNodeQuery)theEObject;
				T1 result = caseDecisionNodeQuery(decisionNodeQuery);
				if (result == null) result = caseElementQuery(decisionNodeQuery);
				if (result == null) result = caseDecisionNodeProvider(decisionNodeQuery);
				if (result == null) result = caseElementProvider(decisionNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_FINAL_NODE_PROVIDER: {
				ActivityFinalNodeProvider activityFinalNodeProvider = (ActivityFinalNodeProvider)theEObject;
				T1 result = caseActivityFinalNodeProvider(activityFinalNodeProvider);
				if (result == null) result = caseElementProvider(activityFinalNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_FINAL_NODE_REFERENCE: {
				ActivityFinalNodeReference activityFinalNodeReference = (ActivityFinalNodeReference)theEObject;
				T1 result = caseActivityFinalNodeReference(activityFinalNodeReference);
				if (result == null) result = caseElementReference(activityFinalNodeReference);
				if (result == null) result = caseActivityFinalNodeProvider(activityFinalNodeReference);
				if (result == null) result = caseElementProvider(activityFinalNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_FINAL_NODE_QUERY: {
				ActivityFinalNodeQuery activityFinalNodeQuery = (ActivityFinalNodeQuery)theEObject;
				T1 result = caseActivityFinalNodeQuery(activityFinalNodeQuery);
				if (result == null) result = caseElementQuery(activityFinalNodeQuery);
				if (result == null) result = caseActivityFinalNodeProvider(activityFinalNodeQuery);
				if (result == null) result = caseElementProvider(activityFinalNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_NODE_PROVIDER: {
				ActivityNodeProvider activityNodeProvider = (ActivityNodeProvider)theEObject;
				T1 result = caseActivityNodeProvider(activityNodeProvider);
				if (result == null) result = caseElementProvider(activityNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_NODE_REFERENCE: {
				ActivityNodeReference activityNodeReference = (ActivityNodeReference)theEObject;
				T1 result = caseActivityNodeReference(activityNodeReference);
				if (result == null) result = caseElementReference(activityNodeReference);
				if (result == null) result = caseActivityNodeProvider(activityNodeReference);
				if (result == null) result = caseElementProvider(activityNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_NODE_QUERY: {
				ActivityNodeQuery activityNodeQuery = (ActivityNodeQuery)theEObject;
				T1 result = caseActivityNodeQuery(activityNodeQuery);
				if (result == null) result = caseElementQuery(activityNodeQuery);
				if (result == null) result = caseActivityNodeProvider(activityNodeQuery);
				if (result == null) result = caseElementProvider(activityNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.OPAQUE_ACTION_PROVIDER: {
				OpaqueActionProvider opaqueActionProvider = (OpaqueActionProvider)theEObject;
				T1 result = caseOpaqueActionProvider(opaqueActionProvider);
				if (result == null) result = caseElementProvider(opaqueActionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.OPAQUE_ACTION_REFERENCE: {
				OpaqueActionReference opaqueActionReference = (OpaqueActionReference)theEObject;
				T1 result = caseOpaqueActionReference(opaqueActionReference);
				if (result == null) result = caseElementReference(opaqueActionReference);
				if (result == null) result = caseOpaqueActionProvider(opaqueActionReference);
				if (result == null) result = caseElementProvider(opaqueActionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.OPAQUE_ACTION_QUERY: {
				OpaqueActionQuery opaqueActionQuery = (OpaqueActionQuery)theEObject;
				T1 result = caseOpaqueActionQuery(opaqueActionQuery);
				if (result == null) result = caseElementQuery(opaqueActionQuery);
				if (result == null) result = caseOpaqueActionProvider(opaqueActionQuery);
				if (result == null) result = caseElementProvider(opaqueActionQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.VARIABLE_ASSIGNMENT_PROVIDER: {
				VariableAssignmentProvider variableAssignmentProvider = (VariableAssignmentProvider)theEObject;
				T1 result = caseVariableAssignmentProvider(variableAssignmentProvider);
				if (result == null) result = caseElementProvider(variableAssignmentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.VARIABLE_ASSIGNMENT_REFERENCE: {
				VariableAssignmentReference variableAssignmentReference = (VariableAssignmentReference)theEObject;
				T1 result = caseVariableAssignmentReference(variableAssignmentReference);
				if (result == null) result = caseElementReference(variableAssignmentReference);
				if (result == null) result = caseVariableAssignmentProvider(variableAssignmentReference);
				if (result == null) result = caseElementProvider(variableAssignmentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.VARIABLE_ASSIGNMENT_QUERY: {
				VariableAssignmentQuery variableAssignmentQuery = (VariableAssignmentQuery)theEObject;
				T1 result = caseVariableAssignmentQuery(variableAssignmentQuery);
				if (result == null) result = caseElementQuery(variableAssignmentQuery);
				if (result == null) result = caseVariableAssignmentProvider(variableAssignmentQuery);
				if (result == null) result = caseElementProvider(variableAssignmentQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.MERGE_NODE_PROVIDER: {
				MergeNodeProvider mergeNodeProvider = (MergeNodeProvider)theEObject;
				T1 result = caseMergeNodeProvider(mergeNodeProvider);
				if (result == null) result = caseElementProvider(mergeNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.MERGE_NODE_REFERENCE: {
				MergeNodeReference mergeNodeReference = (MergeNodeReference)theEObject;
				T1 result = caseMergeNodeReference(mergeNodeReference);
				if (result == null) result = caseElementReference(mergeNodeReference);
				if (result == null) result = caseMergeNodeProvider(mergeNodeReference);
				if (result == null) result = caseElementProvider(mergeNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.MERGE_NODE_QUERY: {
				MergeNodeQuery mergeNodeQuery = (MergeNodeQuery)theEObject;
				T1 result = caseMergeNodeQuery(mergeNodeQuery);
				if (result == null) result = caseElementQuery(mergeNodeQuery);
				if (result == null) result = caseMergeNodeProvider(mergeNodeQuery);
				if (result == null) result = caseElementProvider(mergeNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.VARIABLE_PROVIDER: {
				VariableProvider variableProvider = (VariableProvider)theEObject;
				T1 result = caseVariableProvider(variableProvider);
				if (result == null) result = caseElementProvider(variableProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.VARIABLE_REFERENCE: {
				VariableReference variableReference = (VariableReference)theEObject;
				T1 result = caseVariableReference(variableReference);
				if (result == null) result = caseElementReference(variableReference);
				if (result == null) result = caseVariableProvider(variableReference);
				if (result == null) result = caseElementProvider(variableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.VARIABLE_QUERY: {
				VariableQuery variableQuery = (VariableQuery)theEObject;
				T1 result = caseVariableQuery(variableQuery);
				if (result == null) result = caseElementQuery(variableQuery);
				if (result == null) result = caseVariableProvider(variableQuery);
				if (result == null) result = caseElementProvider(variableQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_PROVIDER: {
				ActivityProvider activityProvider = (ActivityProvider)theEObject;
				T1 result = caseActivityProvider(activityProvider);
				if (result == null) result = caseElementProvider(activityProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_REFERENCE: {
				ActivityReference activityReference = (ActivityReference)theEObject;
				T1 result = caseActivityReference(activityReference);
				if (result == null) result = caseElementReference(activityReference);
				if (result == null) result = caseActivityProvider(activityReference);
				if (result == null) result = caseElementProvider(activityReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.ACTIVITY_QUERY: {
				ActivityQuery activityQuery = (ActivityQuery)theEObject;
				T1 result = caseActivityQuery(activityQuery);
				if (result == null) result = caseElementQuery(activityQuery);
				if (result == null) result = caseActivityProvider(activityQuery);
				if (result == null) result = caseElementProvider(activityQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FORK_NODE_PROVIDER: {
				ForkNodeProvider forkNodeProvider = (ForkNodeProvider)theEObject;
				T1 result = caseForkNodeProvider(forkNodeProvider);
				if (result == null) result = caseElementProvider(forkNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FORK_NODE_REFERENCE: {
				ForkNodeReference forkNodeReference = (ForkNodeReference)theEObject;
				T1 result = caseForkNodeReference(forkNodeReference);
				if (result == null) result = caseElementReference(forkNodeReference);
				if (result == null) result = caseForkNodeProvider(forkNodeReference);
				if (result == null) result = caseElementProvider(forkNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FORK_NODE_QUERY: {
				ForkNodeQuery forkNodeQuery = (ForkNodeQuery)theEObject;
				T1 result = caseForkNodeQuery(forkNodeQuery);
				if (result == null) result = caseElementQuery(forkNodeQuery);
				if (result == null) result = caseForkNodeProvider(forkNodeQuery);
				if (result == null) result = caseElementProvider(forkNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FLOW_FINAL_NODE_PROVIDER: {
				FlowFinalNodeProvider flowFinalNodeProvider = (FlowFinalNodeProvider)theEObject;
				T1 result = caseFlowFinalNodeProvider(flowFinalNodeProvider);
				if (result == null) result = caseElementProvider(flowFinalNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FLOW_FINAL_NODE_REFERENCE: {
				FlowFinalNodeReference flowFinalNodeReference = (FlowFinalNodeReference)theEObject;
				T1 result = caseFlowFinalNodeReference(flowFinalNodeReference);
				if (result == null) result = caseElementReference(flowFinalNodeReference);
				if (result == null) result = caseFlowFinalNodeProvider(flowFinalNodeReference);
				if (result == null) result = caseElementProvider(flowFinalNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.FLOW_FINAL_NODE_QUERY: {
				FlowFinalNodeQuery flowFinalNodeQuery = (FlowFinalNodeQuery)theEObject;
				T1 result = caseFlowFinalNodeQuery(flowFinalNodeQuery);
				if (result == null) result = caseElementQuery(flowFinalNodeQuery);
				if (result == null) result = caseFlowFinalNodeProvider(flowFinalNodeQuery);
				if (result == null) result = caseElementProvider(flowFinalNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.INITIAL_NODE_PROVIDER: {
				InitialNodeProvider initialNodeProvider = (InitialNodeProvider)theEObject;
				T1 result = caseInitialNodeProvider(initialNodeProvider);
				if (result == null) result = caseElementProvider(initialNodeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.INITIAL_NODE_REFERENCE: {
				InitialNodeReference initialNodeReference = (InitialNodeReference)theEObject;
				T1 result = caseInitialNodeReference(initialNodeReference);
				if (result == null) result = caseElementReference(initialNodeReference);
				if (result == null) result = caseInitialNodeProvider(initialNodeReference);
				if (result == null) result = caseElementProvider(initialNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.INITIAL_NODE_QUERY: {
				InitialNodeQuery initialNodeQuery = (InitialNodeQuery)theEObject;
				T1 result = caseInitialNodeQuery(initialNodeQuery);
				if (result == null) result = caseElementQuery(initialNodeQuery);
				if (result == null) result = caseInitialNodeProvider(initialNodeQuery);
				if (result == null) result = caseElementProvider(initialNodeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.BOOLEAN_VARIABLE_ASSIGNMENT_PROVIDER: {
				BooleanVariableAssignmentProvider booleanVariableAssignmentProvider = (BooleanVariableAssignmentProvider)theEObject;
				T1 result = caseBooleanVariableAssignmentProvider(booleanVariableAssignmentProvider);
				if (result == null) result = caseElementProvider(booleanVariableAssignmentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.BOOLEAN_VARIABLE_ASSIGNMENT_REFERENCE: {
				BooleanVariableAssignmentReference booleanVariableAssignmentReference = (BooleanVariableAssignmentReference)theEObject;
				T1 result = caseBooleanVariableAssignmentReference(booleanVariableAssignmentReference);
				if (result == null) result = caseElementReference(booleanVariableAssignmentReference);
				if (result == null) result = caseBooleanVariableAssignmentProvider(booleanVariableAssignmentReference);
				if (result == null) result = caseElementProvider(booleanVariableAssignmentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.BOOLEAN_VARIABLE_ASSIGNMENT_QUERY: {
				BooleanVariableAssignmentQuery booleanVariableAssignmentQuery = (BooleanVariableAssignmentQuery)theEObject;
				T1 result = caseBooleanVariableAssignmentQuery(booleanVariableAssignmentQuery);
				if (result == null) result = caseElementQuery(booleanVariableAssignmentQuery);
				if (result == null) result = caseBooleanVariableAssignmentProvider(booleanVariableAssignmentQuery);
				if (result == null) result = caseElementProvider(booleanVariableAssignmentQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.INTEGER_VARIABLE_ASSIGNMENT_PROVIDER: {
				IntegerVariableAssignmentProvider integerVariableAssignmentProvider = (IntegerVariableAssignmentProvider)theEObject;
				T1 result = caseIntegerVariableAssignmentProvider(integerVariableAssignmentProvider);
				if (result == null) result = caseElementProvider(integerVariableAssignmentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.INTEGER_VARIABLE_ASSIGNMENT_REFERENCE: {
				IntegerVariableAssignmentReference integerVariableAssignmentReference = (IntegerVariableAssignmentReference)theEObject;
				T1 result = caseIntegerVariableAssignmentReference(integerVariableAssignmentReference);
				if (result == null) result = caseElementReference(integerVariableAssignmentReference);
				if (result == null) result = caseIntegerVariableAssignmentProvider(integerVariableAssignmentReference);
				if (result == null) result = caseElementProvider(integerVariableAssignmentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramProviderPackage.INTEGER_VARIABLE_ASSIGNMENT_QUERY: {
				IntegerVariableAssignmentQuery integerVariableAssignmentQuery = (IntegerVariableAssignmentQuery)theEObject;
				T1 result = caseIntegerVariableAssignmentQuery(integerVariableAssignmentQuery);
				if (result == null) result = caseElementQuery(integerVariableAssignmentQuery);
				if (result == null) result = caseIntegerVariableAssignmentProvider(integerVariableAssignmentQuery);
				if (result == null) result = caseElementProvider(integerVariableAssignmentQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionProvider(AcceptEventActionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionReference(AcceptEventActionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptEventActionQuery(AcceptEventActionQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventProvider(EventProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventReference(EventReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventQuery(EventQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeProvider(JoinNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeReference(JoinNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJoinNodeQuery(JoinNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeProvider(FinalNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeReference(FinalNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinalNodeQuery(FinalNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeProvider(DecisionNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeReference(DecisionNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDecisionNodeQuery(DecisionNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeProvider(ActivityFinalNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeReference(ActivityFinalNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityFinalNodeQuery(ActivityFinalNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeProvider(ActivityNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeReference(ActivityNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNodeQuery(ActivityNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionProvider(OpaqueActionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionReference(OpaqueActionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOpaqueActionQuery(OpaqueActionQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableAssignmentProvider(VariableAssignmentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableAssignmentReference(VariableAssignmentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableAssignmentQuery(VariableAssignmentQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeProvider(MergeNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeReference(MergeNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMergeNodeQuery(MergeNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableProvider(VariableProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableReference(VariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableQuery(VariableQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityProvider(ActivityProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityReference(ActivityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityQuery(ActivityQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeProvider(ForkNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeReference(ForkNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkNodeQuery(ForkNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeProvider(FlowFinalNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeReference(FlowFinalNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowFinalNodeQuery(FlowFinalNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeProvider(InitialNodeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeReference(InitialNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitialNodeQuery(InitialNodeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableAssignmentProvider(BooleanVariableAssignmentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableAssignmentReference(BooleanVariableAssignmentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Assignment Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariableAssignmentQuery(BooleanVariableAssignmentQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Assignment Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Assignment Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableAssignmentProvider(IntegerVariableAssignmentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Assignment Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Assignment Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableAssignmentReference(IntegerVariableAssignmentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Assignment Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Assignment Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariableAssignmentQuery(IntegerVariableAssignmentQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseElementProvider(ElementProvider<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseElementReference(ElementReference<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T, P extends StateProperty<T>> T1 caseElementQuery(ElementQuery<T, P> object) {
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

} //XActivityDiagramProviderSwitch
