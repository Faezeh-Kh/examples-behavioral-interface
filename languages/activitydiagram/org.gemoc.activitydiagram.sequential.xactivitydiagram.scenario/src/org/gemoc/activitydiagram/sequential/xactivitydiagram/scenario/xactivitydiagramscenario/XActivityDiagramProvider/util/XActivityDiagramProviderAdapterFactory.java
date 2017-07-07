/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.util;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.ElementProvider;
import fr.inria.diverse.event.commons.model.scenario.ElementQuery;
import fr.inria.diverse.event.commons.model.scenario.ElementReference;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage
 * @generated
 */
public class XActivityDiagramProviderAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XActivityDiagramProviderPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramProviderAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XActivityDiagramProviderPackage.eINSTANCE;
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
	protected XActivityDiagramProviderSwitch<Adapter> modelSwitch =
		new XActivityDiagramProviderSwitch<Adapter>() {
			@Override
			public Adapter caseAcceptEventActionProvider(AcceptEventActionProvider object) {
				return createAcceptEventActionProviderAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionReference(AcceptEventActionReference object) {
				return createAcceptEventActionReferenceAdapter();
			}
			@Override
			public Adapter caseAcceptEventActionQuery(AcceptEventActionQuery object) {
				return createAcceptEventActionQueryAdapter();
			}
			@Override
			public Adapter caseEventProvider(EventProvider object) {
				return createEventProviderAdapter();
			}
			@Override
			public Adapter caseEventReference(EventReference object) {
				return createEventReferenceAdapter();
			}
			@Override
			public Adapter caseEventQuery(EventQuery object) {
				return createEventQueryAdapter();
			}
			@Override
			public Adapter caseJoinNodeProvider(JoinNodeProvider object) {
				return createJoinNodeProviderAdapter();
			}
			@Override
			public Adapter caseJoinNodeReference(JoinNodeReference object) {
				return createJoinNodeReferenceAdapter();
			}
			@Override
			public Adapter caseJoinNodeQuery(JoinNodeQuery object) {
				return createJoinNodeQueryAdapter();
			}
			@Override
			public Adapter caseFinalNodeProvider(FinalNodeProvider object) {
				return createFinalNodeProviderAdapter();
			}
			@Override
			public Adapter caseFinalNodeReference(FinalNodeReference object) {
				return createFinalNodeReferenceAdapter();
			}
			@Override
			public Adapter caseFinalNodeQuery(FinalNodeQuery object) {
				return createFinalNodeQueryAdapter();
			}
			@Override
			public Adapter caseDecisionNodeProvider(DecisionNodeProvider object) {
				return createDecisionNodeProviderAdapter();
			}
			@Override
			public Adapter caseDecisionNodeReference(DecisionNodeReference object) {
				return createDecisionNodeReferenceAdapter();
			}
			@Override
			public Adapter caseDecisionNodeQuery(DecisionNodeQuery object) {
				return createDecisionNodeQueryAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeProvider(ActivityFinalNodeProvider object) {
				return createActivityFinalNodeProviderAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeReference(ActivityFinalNodeReference object) {
				return createActivityFinalNodeReferenceAdapter();
			}
			@Override
			public Adapter caseActivityFinalNodeQuery(ActivityFinalNodeQuery object) {
				return createActivityFinalNodeQueryAdapter();
			}
			@Override
			public Adapter caseActivityNodeProvider(ActivityNodeProvider object) {
				return createActivityNodeProviderAdapter();
			}
			@Override
			public Adapter caseActivityNodeReference(ActivityNodeReference object) {
				return createActivityNodeReferenceAdapter();
			}
			@Override
			public Adapter caseActivityNodeQuery(ActivityNodeQuery object) {
				return createActivityNodeQueryAdapter();
			}
			@Override
			public Adapter caseOpaqueActionProvider(OpaqueActionProvider object) {
				return createOpaqueActionProviderAdapter();
			}
			@Override
			public Adapter caseOpaqueActionReference(OpaqueActionReference object) {
				return createOpaqueActionReferenceAdapter();
			}
			@Override
			public Adapter caseOpaqueActionQuery(OpaqueActionQuery object) {
				return createOpaqueActionQueryAdapter();
			}
			@Override
			public Adapter caseVariableAssignmentProvider(VariableAssignmentProvider object) {
				return createVariableAssignmentProviderAdapter();
			}
			@Override
			public Adapter caseVariableAssignmentReference(VariableAssignmentReference object) {
				return createVariableAssignmentReferenceAdapter();
			}
			@Override
			public Adapter caseVariableAssignmentQuery(VariableAssignmentQuery object) {
				return createVariableAssignmentQueryAdapter();
			}
			@Override
			public Adapter caseMergeNodeProvider(MergeNodeProvider object) {
				return createMergeNodeProviderAdapter();
			}
			@Override
			public Adapter caseMergeNodeReference(MergeNodeReference object) {
				return createMergeNodeReferenceAdapter();
			}
			@Override
			public Adapter caseMergeNodeQuery(MergeNodeQuery object) {
				return createMergeNodeQueryAdapter();
			}
			@Override
			public Adapter caseVariableProvider(VariableProvider object) {
				return createVariableProviderAdapter();
			}
			@Override
			public Adapter caseVariableReference(VariableReference object) {
				return createVariableReferenceAdapter();
			}
			@Override
			public Adapter caseVariableQuery(VariableQuery object) {
				return createVariableQueryAdapter();
			}
			@Override
			public Adapter caseActivityProvider(ActivityProvider object) {
				return createActivityProviderAdapter();
			}
			@Override
			public Adapter caseActivityReference(ActivityReference object) {
				return createActivityReferenceAdapter();
			}
			@Override
			public Adapter caseActivityQuery(ActivityQuery object) {
				return createActivityQueryAdapter();
			}
			@Override
			public Adapter caseForkNodeProvider(ForkNodeProvider object) {
				return createForkNodeProviderAdapter();
			}
			@Override
			public Adapter caseForkNodeReference(ForkNodeReference object) {
				return createForkNodeReferenceAdapter();
			}
			@Override
			public Adapter caseForkNodeQuery(ForkNodeQuery object) {
				return createForkNodeQueryAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeProvider(FlowFinalNodeProvider object) {
				return createFlowFinalNodeProviderAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeReference(FlowFinalNodeReference object) {
				return createFlowFinalNodeReferenceAdapter();
			}
			@Override
			public Adapter caseFlowFinalNodeQuery(FlowFinalNodeQuery object) {
				return createFlowFinalNodeQueryAdapter();
			}
			@Override
			public Adapter caseInitialNodeProvider(InitialNodeProvider object) {
				return createInitialNodeProviderAdapter();
			}
			@Override
			public Adapter caseInitialNodeReference(InitialNodeReference object) {
				return createInitialNodeReferenceAdapter();
			}
			@Override
			public Adapter caseInitialNodeQuery(InitialNodeQuery object) {
				return createInitialNodeQueryAdapter();
			}
			@Override
			public Adapter caseBooleanVariableAssignmentProvider(BooleanVariableAssignmentProvider object) {
				return createBooleanVariableAssignmentProviderAdapter();
			}
			@Override
			public Adapter caseBooleanVariableAssignmentReference(BooleanVariableAssignmentReference object) {
				return createBooleanVariableAssignmentReferenceAdapter();
			}
			@Override
			public Adapter caseBooleanVariableAssignmentQuery(BooleanVariableAssignmentQuery object) {
				return createBooleanVariableAssignmentQueryAdapter();
			}
			@Override
			public Adapter caseIntegerVariableAssignmentProvider(IntegerVariableAssignmentProvider object) {
				return createIntegerVariableAssignmentProviderAdapter();
			}
			@Override
			public Adapter caseIntegerVariableAssignmentReference(IntegerVariableAssignmentReference object) {
				return createIntegerVariableAssignmentReferenceAdapter();
			}
			@Override
			public Adapter caseIntegerVariableAssignmentQuery(IntegerVariableAssignmentQuery object) {
				return createIntegerVariableAssignmentQueryAdapter();
			}
			@Override
			public <T> Adapter caseElementProvider(ElementProvider<T> object) {
				return createElementProviderAdapter();
			}
			@Override
			public <T> Adapter caseElementReference(ElementReference<T> object) {
				return createElementReferenceAdapter();
			}
			@Override
			public <T, P extends StateProperty<T>> Adapter caseElementQuery(ElementQuery<T, P> object) {
				return createElementQueryAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionProvider <em>Accept Event Action Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionProvider
	 * @generated
	 */
	public Adapter createAcceptEventActionProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionReference <em>Accept Event Action Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionReference
	 * @generated
	 */
	public Adapter createAcceptEventActionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionQuery <em>Accept Event Action Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionQuery
	 * @generated
	 */
	public Adapter createAcceptEventActionQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventProvider <em>Event Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventProvider
	 * @generated
	 */
	public Adapter createEventProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventReference <em>Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventReference
	 * @generated
	 */
	public Adapter createEventReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventQuery <em>Event Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventQuery
	 * @generated
	 */
	public Adapter createEventQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeProvider <em>Join Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeProvider
	 * @generated
	 */
	public Adapter createJoinNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeReference <em>Join Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeReference
	 * @generated
	 */
	public Adapter createJoinNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeQuery <em>Join Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeQuery
	 * @generated
	 */
	public Adapter createJoinNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeProvider <em>Final Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeProvider
	 * @generated
	 */
	public Adapter createFinalNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeReference <em>Final Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeReference
	 * @generated
	 */
	public Adapter createFinalNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeQuery <em>Final Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeQuery
	 * @generated
	 */
	public Adapter createFinalNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeProvider <em>Decision Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeProvider
	 * @generated
	 */
	public Adapter createDecisionNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeReference <em>Decision Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeReference
	 * @generated
	 */
	public Adapter createDecisionNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeQuery <em>Decision Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeQuery
	 * @generated
	 */
	public Adapter createDecisionNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeProvider <em>Activity Final Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeProvider
	 * @generated
	 */
	public Adapter createActivityFinalNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeReference <em>Activity Final Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeReference
	 * @generated
	 */
	public Adapter createActivityFinalNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeQuery <em>Activity Final Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeQuery
	 * @generated
	 */
	public Adapter createActivityFinalNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeProvider <em>Activity Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeProvider
	 * @generated
	 */
	public Adapter createActivityNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeReference <em>Activity Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeReference
	 * @generated
	 */
	public Adapter createActivityNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeQuery <em>Activity Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeQuery
	 * @generated
	 */
	public Adapter createActivityNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionProvider <em>Opaque Action Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionProvider
	 * @generated
	 */
	public Adapter createOpaqueActionProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionReference <em>Opaque Action Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionReference
	 * @generated
	 */
	public Adapter createOpaqueActionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionQuery <em>Opaque Action Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionQuery
	 * @generated
	 */
	public Adapter createOpaqueActionQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentProvider <em>Variable Assignment Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentProvider
	 * @generated
	 */
	public Adapter createVariableAssignmentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentReference <em>Variable Assignment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentReference
	 * @generated
	 */
	public Adapter createVariableAssignmentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentQuery <em>Variable Assignment Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentQuery
	 * @generated
	 */
	public Adapter createVariableAssignmentQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeProvider <em>Merge Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeProvider
	 * @generated
	 */
	public Adapter createMergeNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeReference <em>Merge Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeReference
	 * @generated
	 */
	public Adapter createMergeNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeQuery <em>Merge Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeQuery
	 * @generated
	 */
	public Adapter createMergeNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableProvider <em>Variable Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableProvider
	 * @generated
	 */
	public Adapter createVariableProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableReference
	 * @generated
	 */
	public Adapter createVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableQuery <em>Variable Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableQuery
	 * @generated
	 */
	public Adapter createVariableQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityProvider <em>Activity Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityProvider
	 * @generated
	 */
	public Adapter createActivityProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityReference <em>Activity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityReference
	 * @generated
	 */
	public Adapter createActivityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityQuery <em>Activity Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityQuery
	 * @generated
	 */
	public Adapter createActivityQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeProvider <em>Fork Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeProvider
	 * @generated
	 */
	public Adapter createForkNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeReference <em>Fork Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeReference
	 * @generated
	 */
	public Adapter createForkNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeQuery <em>Fork Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeQuery
	 * @generated
	 */
	public Adapter createForkNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeProvider <em>Flow Final Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeProvider
	 * @generated
	 */
	public Adapter createFlowFinalNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeReference <em>Flow Final Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeReference
	 * @generated
	 */
	public Adapter createFlowFinalNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeQuery <em>Flow Final Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeQuery
	 * @generated
	 */
	public Adapter createFlowFinalNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeProvider <em>Initial Node Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeProvider
	 * @generated
	 */
	public Adapter createInitialNodeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeReference <em>Initial Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeReference
	 * @generated
	 */
	public Adapter createInitialNodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeQuery <em>Initial Node Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeQuery
	 * @generated
	 */
	public Adapter createInitialNodeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentProvider <em>Boolean Variable Assignment Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentProvider
	 * @generated
	 */
	public Adapter createBooleanVariableAssignmentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentReference <em>Boolean Variable Assignment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentReference
	 * @generated
	 */
	public Adapter createBooleanVariableAssignmentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentQuery <em>Boolean Variable Assignment Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentQuery
	 * @generated
	 */
	public Adapter createBooleanVariableAssignmentQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentProvider <em>Integer Variable Assignment Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentProvider
	 * @generated
	 */
	public Adapter createIntegerVariableAssignmentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentReference <em>Integer Variable Assignment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentReference
	 * @generated
	 */
	public Adapter createIntegerVariableAssignmentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentQuery <em>Integer Variable Assignment Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentQuery
	 * @generated
	 */
	public Adapter createIntegerVariableAssignmentQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementProvider <em>Element Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementProvider
	 * @generated
	 */
	public Adapter createElementProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementReference
	 * @generated
	 */
	public Adapter createElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.event.commons.model.scenario.ElementQuery <em>Element Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.event.commons.model.scenario.ElementQuery
	 * @generated
	 */
	public Adapter createElementQueryAdapter() {
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

} //XActivityDiagramProviderAdapterFactory
