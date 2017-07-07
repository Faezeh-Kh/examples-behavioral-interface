/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramProviderFactoryImpl extends EFactoryImpl implements XActivityDiagramProviderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XActivityDiagramProviderFactory init() {
		try {
			XActivityDiagramProviderFactory theXActivityDiagramProviderFactory = (XActivityDiagramProviderFactory)EPackage.Registry.INSTANCE.getEFactory(XActivityDiagramProviderPackage.eNS_URI);
			if (theXActivityDiagramProviderFactory != null) {
				return theXActivityDiagramProviderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XActivityDiagramProviderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramProviderFactoryImpl() {
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
			case XActivityDiagramProviderPackage.ACCEPT_EVENT_ACTION_REFERENCE: return createAcceptEventActionReference();
			case XActivityDiagramProviderPackage.ACCEPT_EVENT_ACTION_QUERY: return createAcceptEventActionQuery();
			case XActivityDiagramProviderPackage.EVENT_REFERENCE: return createEventReference();
			case XActivityDiagramProviderPackage.EVENT_QUERY: return createEventQuery();
			case XActivityDiagramProviderPackage.JOIN_NODE_REFERENCE: return createJoinNodeReference();
			case XActivityDiagramProviderPackage.JOIN_NODE_QUERY: return createJoinNodeQuery();
			case XActivityDiagramProviderPackage.FINAL_NODE_REFERENCE: return createFinalNodeReference();
			case XActivityDiagramProviderPackage.FINAL_NODE_QUERY: return createFinalNodeQuery();
			case XActivityDiagramProviderPackage.DECISION_NODE_REFERENCE: return createDecisionNodeReference();
			case XActivityDiagramProviderPackage.DECISION_NODE_QUERY: return createDecisionNodeQuery();
			case XActivityDiagramProviderPackage.ACTIVITY_FINAL_NODE_REFERENCE: return createActivityFinalNodeReference();
			case XActivityDiagramProviderPackage.ACTIVITY_FINAL_NODE_QUERY: return createActivityFinalNodeQuery();
			case XActivityDiagramProviderPackage.ACTIVITY_NODE_REFERENCE: return createActivityNodeReference();
			case XActivityDiagramProviderPackage.ACTIVITY_NODE_QUERY: return createActivityNodeQuery();
			case XActivityDiagramProviderPackage.OPAQUE_ACTION_REFERENCE: return createOpaqueActionReference();
			case XActivityDiagramProviderPackage.OPAQUE_ACTION_QUERY: return createOpaqueActionQuery();
			case XActivityDiagramProviderPackage.VARIABLE_ASSIGNMENT_REFERENCE: return createVariableAssignmentReference();
			case XActivityDiagramProviderPackage.VARIABLE_ASSIGNMENT_QUERY: return createVariableAssignmentQuery();
			case XActivityDiagramProviderPackage.MERGE_NODE_REFERENCE: return createMergeNodeReference();
			case XActivityDiagramProviderPackage.MERGE_NODE_QUERY: return createMergeNodeQuery();
			case XActivityDiagramProviderPackage.VARIABLE_REFERENCE: return createVariableReference();
			case XActivityDiagramProviderPackage.VARIABLE_QUERY: return createVariableQuery();
			case XActivityDiagramProviderPackage.ACTIVITY_REFERENCE: return createActivityReference();
			case XActivityDiagramProviderPackage.ACTIVITY_QUERY: return createActivityQuery();
			case XActivityDiagramProviderPackage.FORK_NODE_REFERENCE: return createForkNodeReference();
			case XActivityDiagramProviderPackage.FORK_NODE_QUERY: return createForkNodeQuery();
			case XActivityDiagramProviderPackage.FLOW_FINAL_NODE_REFERENCE: return createFlowFinalNodeReference();
			case XActivityDiagramProviderPackage.FLOW_FINAL_NODE_QUERY: return createFlowFinalNodeQuery();
			case XActivityDiagramProviderPackage.INITIAL_NODE_REFERENCE: return createInitialNodeReference();
			case XActivityDiagramProviderPackage.INITIAL_NODE_QUERY: return createInitialNodeQuery();
			case XActivityDiagramProviderPackage.BOOLEAN_VARIABLE_ASSIGNMENT_REFERENCE: return createBooleanVariableAssignmentReference();
			case XActivityDiagramProviderPackage.BOOLEAN_VARIABLE_ASSIGNMENT_QUERY: return createBooleanVariableAssignmentQuery();
			case XActivityDiagramProviderPackage.INTEGER_VARIABLE_ASSIGNMENT_REFERENCE: return createIntegerVariableAssignmentReference();
			case XActivityDiagramProviderPackage.INTEGER_VARIABLE_ASSIGNMENT_QUERY: return createIntegerVariableAssignmentQuery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionReference createAcceptEventActionReference() {
		AcceptEventActionReferenceImpl acceptEventActionReference = new AcceptEventActionReferenceImpl();
		return acceptEventActionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionQuery createAcceptEventActionQuery() {
		AcceptEventActionQueryImpl acceptEventActionQuery = new AcceptEventActionQueryImpl();
		return acceptEventActionQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReference createEventReference() {
		EventReferenceImpl eventReference = new EventReferenceImpl();
		return eventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventQuery createEventQuery() {
		EventQueryImpl eventQuery = new EventQueryImpl();
		return eventQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeReference createJoinNodeReference() {
		JoinNodeReferenceImpl joinNodeReference = new JoinNodeReferenceImpl();
		return joinNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeQuery createJoinNodeQuery() {
		JoinNodeQueryImpl joinNodeQuery = new JoinNodeQueryImpl();
		return joinNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeReference createFinalNodeReference() {
		FinalNodeReferenceImpl finalNodeReference = new FinalNodeReferenceImpl();
		return finalNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeQuery createFinalNodeQuery() {
		FinalNodeQueryImpl finalNodeQuery = new FinalNodeQueryImpl();
		return finalNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeReference createDecisionNodeReference() {
		DecisionNodeReferenceImpl decisionNodeReference = new DecisionNodeReferenceImpl();
		return decisionNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeQuery createDecisionNodeQuery() {
		DecisionNodeQueryImpl decisionNodeQuery = new DecisionNodeQueryImpl();
		return decisionNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeReference createActivityFinalNodeReference() {
		ActivityFinalNodeReferenceImpl activityFinalNodeReference = new ActivityFinalNodeReferenceImpl();
		return activityFinalNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeQuery createActivityFinalNodeQuery() {
		ActivityFinalNodeQueryImpl activityFinalNodeQuery = new ActivityFinalNodeQueryImpl();
		return activityFinalNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeReference createActivityNodeReference() {
		ActivityNodeReferenceImpl activityNodeReference = new ActivityNodeReferenceImpl();
		return activityNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeQuery createActivityNodeQuery() {
		ActivityNodeQueryImpl activityNodeQuery = new ActivityNodeQueryImpl();
		return activityNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionReference createOpaqueActionReference() {
		OpaqueActionReferenceImpl opaqueActionReference = new OpaqueActionReferenceImpl();
		return opaqueActionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionQuery createOpaqueActionQuery() {
		OpaqueActionQueryImpl opaqueActionQuery = new OpaqueActionQueryImpl();
		return opaqueActionQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentReference createVariableAssignmentReference() {
		VariableAssignmentReferenceImpl variableAssignmentReference = new VariableAssignmentReferenceImpl();
		return variableAssignmentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentQuery createVariableAssignmentQuery() {
		VariableAssignmentQueryImpl variableAssignmentQuery = new VariableAssignmentQueryImpl();
		return variableAssignmentQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeReference createMergeNodeReference() {
		MergeNodeReferenceImpl mergeNodeReference = new MergeNodeReferenceImpl();
		return mergeNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeQuery createMergeNodeQuery() {
		MergeNodeQueryImpl mergeNodeQuery = new MergeNodeQueryImpl();
		return mergeNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableQuery createVariableQuery() {
		VariableQueryImpl variableQuery = new VariableQueryImpl();
		return variableQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityReference createActivityReference() {
		ActivityReferenceImpl activityReference = new ActivityReferenceImpl();
		return activityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityQuery createActivityQuery() {
		ActivityQueryImpl activityQuery = new ActivityQueryImpl();
		return activityQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeReference createForkNodeReference() {
		ForkNodeReferenceImpl forkNodeReference = new ForkNodeReferenceImpl();
		return forkNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeQuery createForkNodeQuery() {
		ForkNodeQueryImpl forkNodeQuery = new ForkNodeQueryImpl();
		return forkNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeReference createFlowFinalNodeReference() {
		FlowFinalNodeReferenceImpl flowFinalNodeReference = new FlowFinalNodeReferenceImpl();
		return flowFinalNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeQuery createFlowFinalNodeQuery() {
		FlowFinalNodeQueryImpl flowFinalNodeQuery = new FlowFinalNodeQueryImpl();
		return flowFinalNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeReference createInitialNodeReference() {
		InitialNodeReferenceImpl initialNodeReference = new InitialNodeReferenceImpl();
		return initialNodeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeQuery createInitialNodeQuery() {
		InitialNodeQueryImpl initialNodeQuery = new InitialNodeQueryImpl();
		return initialNodeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableAssignmentReference createBooleanVariableAssignmentReference() {
		BooleanVariableAssignmentReferenceImpl booleanVariableAssignmentReference = new BooleanVariableAssignmentReferenceImpl();
		return booleanVariableAssignmentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableAssignmentQuery createBooleanVariableAssignmentQuery() {
		BooleanVariableAssignmentQueryImpl booleanVariableAssignmentQuery = new BooleanVariableAssignmentQueryImpl();
		return booleanVariableAssignmentQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableAssignmentReference createIntegerVariableAssignmentReference() {
		IntegerVariableAssignmentReferenceImpl integerVariableAssignmentReference = new IntegerVariableAssignmentReferenceImpl();
		return integerVariableAssignmentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableAssignmentQuery createIntegerVariableAssignmentQuery() {
		IntegerVariableAssignmentQueryImpl integerVariableAssignmentQuery = new IntegerVariableAssignmentQueryImpl();
		return integerVariableAssignmentQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramProviderPackage getXActivityDiagramProviderPackage() {
		return (XActivityDiagramProviderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XActivityDiagramProviderPackage getPackage() {
		return XActivityDiagramProviderPackage.eINSTANCE;
	}

} //XActivityDiagramProviderFactoryImpl
