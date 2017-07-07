/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.impl.XActivityDiagramArbiterPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityFinalNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.BooleanVariableAssignmentReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.EventReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FinalNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.FlowFinalNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ForkNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.InitialNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.IntegerVariableAssignmentReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.OpaqueActionReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableAssignmentReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableProvider;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.VariableReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramProviderPackageImpl extends EPackageImpl implements XActivityDiagramProviderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableAssignmentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableAssignmentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableAssignmentQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableAssignmentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableAssignmentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableAssignmentQueryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XActivityDiagramProviderPackageImpl() {
		super(eNS_URI, XActivityDiagramProviderFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XActivityDiagramProviderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XActivityDiagramProviderPackage init() {
		if (isInited) return (XActivityDiagramProviderPackage)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI);

		// Obtain or create and register package
		XActivityDiagramProviderPackageImpl theXActivityDiagramProviderPackage = (XActivityDiagramProviderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XActivityDiagramProviderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XActivityDiagramProviderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XActivityDiagramArbiterPackageImpl theXActivityDiagramArbiterPackage = (XActivityDiagramArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI) instanceof XActivityDiagramArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI) : XActivityDiagramArbiterPackage.eINSTANCE);
		XActivityDiagramEventPackageImpl theXActivityDiagramEventPackage = (XActivityDiagramEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI) instanceof XActivityDiagramEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI) : XActivityDiagramEventPackage.eINSTANCE);
		XActivityDiagramPropertyPackageImpl theXActivityDiagramPropertyPackage = (XActivityDiagramPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI) instanceof XActivityDiagramPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI) : XActivityDiagramPropertyPackage.eINSTANCE);
		XActivityDiagramScenarioPackageImpl theXActivityDiagramScenarioPackage = (XActivityDiagramScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI) instanceof XActivityDiagramScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI) : XActivityDiagramScenarioPackage.eINSTANCE);

		// Load packages
		theXActivityDiagramPropertyPackage.loadPackage();

		// Create package meta-data objects
		theXActivityDiagramProviderPackage.createPackageContents();
		theXActivityDiagramArbiterPackage.createPackageContents();
		theXActivityDiagramEventPackage.createPackageContents();
		theXActivityDiagramScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXActivityDiagramProviderPackage.initializePackageContents();
		theXActivityDiagramArbiterPackage.initializePackageContents();
		theXActivityDiagramEventPackage.initializePackageContents();
		theXActivityDiagramScenarioPackage.initializePackageContents();

		// Fix loaded packages
		theXActivityDiagramPropertyPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXActivityDiagramProviderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XActivityDiagramProviderPackage.eNS_URI, theXActivityDiagramProviderPackage);
		return theXActivityDiagramProviderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionProvider() {
		return acceptEventActionProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionReference() {
		return acceptEventActionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionQuery() {
		return acceptEventActionQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventProvider() {
		return eventProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventReference() {
		return eventReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventQuery() {
		return eventQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeProvider() {
		return joinNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeReference() {
		return joinNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeQuery() {
		return joinNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeProvider() {
		return finalNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeReference() {
		return finalNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeQuery() {
		return finalNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeProvider() {
		return decisionNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeReference() {
		return decisionNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeQuery() {
		return decisionNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeProvider() {
		return activityFinalNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeReference() {
		return activityFinalNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeQuery() {
		return activityFinalNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeProvider() {
		return activityNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeReference() {
		return activityNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeQuery() {
		return activityNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionProvider() {
		return opaqueActionProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionReference() {
		return opaqueActionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionQuery() {
		return opaqueActionQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignmentProvider() {
		return variableAssignmentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignmentReference() {
		return variableAssignmentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignmentQuery() {
		return variableAssignmentQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeProvider() {
		return mergeNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeReference() {
		return mergeNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeQuery() {
		return mergeNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableProvider() {
		return variableProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableReference() {
		return variableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableQuery() {
		return variableQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityProvider() {
		return activityProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityReference() {
		return activityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityQuery() {
		return activityQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeProvider() {
		return forkNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeReference() {
		return forkNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeQuery() {
		return forkNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeProvider() {
		return flowFinalNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeReference() {
		return flowFinalNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeQuery() {
		return flowFinalNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeProvider() {
		return initialNodeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeReference() {
		return initialNodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeQuery() {
		return initialNodeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableAssignmentProvider() {
		return booleanVariableAssignmentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableAssignmentReference() {
		return booleanVariableAssignmentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableAssignmentQuery() {
		return booleanVariableAssignmentQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableAssignmentProvider() {
		return integerVariableAssignmentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableAssignmentReference() {
		return integerVariableAssignmentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableAssignmentQuery() {
		return integerVariableAssignmentQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramProviderFactory getXActivityDiagramProviderFactory() {
		return (XActivityDiagramProviderFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		acceptEventActionProviderEClass = createEClass(ACCEPT_EVENT_ACTION_PROVIDER);

		acceptEventActionReferenceEClass = createEClass(ACCEPT_EVENT_ACTION_REFERENCE);

		acceptEventActionQueryEClass = createEClass(ACCEPT_EVENT_ACTION_QUERY);

		eventProviderEClass = createEClass(EVENT_PROVIDER);

		eventReferenceEClass = createEClass(EVENT_REFERENCE);

		eventQueryEClass = createEClass(EVENT_QUERY);

		joinNodeProviderEClass = createEClass(JOIN_NODE_PROVIDER);

		joinNodeReferenceEClass = createEClass(JOIN_NODE_REFERENCE);

		joinNodeQueryEClass = createEClass(JOIN_NODE_QUERY);

		finalNodeProviderEClass = createEClass(FINAL_NODE_PROVIDER);

		finalNodeReferenceEClass = createEClass(FINAL_NODE_REFERENCE);

		finalNodeQueryEClass = createEClass(FINAL_NODE_QUERY);

		decisionNodeProviderEClass = createEClass(DECISION_NODE_PROVIDER);

		decisionNodeReferenceEClass = createEClass(DECISION_NODE_REFERENCE);

		decisionNodeQueryEClass = createEClass(DECISION_NODE_QUERY);

		activityFinalNodeProviderEClass = createEClass(ACTIVITY_FINAL_NODE_PROVIDER);

		activityFinalNodeReferenceEClass = createEClass(ACTIVITY_FINAL_NODE_REFERENCE);

		activityFinalNodeQueryEClass = createEClass(ACTIVITY_FINAL_NODE_QUERY);

		activityNodeProviderEClass = createEClass(ACTIVITY_NODE_PROVIDER);

		activityNodeReferenceEClass = createEClass(ACTIVITY_NODE_REFERENCE);

		activityNodeQueryEClass = createEClass(ACTIVITY_NODE_QUERY);

		opaqueActionProviderEClass = createEClass(OPAQUE_ACTION_PROVIDER);

		opaqueActionReferenceEClass = createEClass(OPAQUE_ACTION_REFERENCE);

		opaqueActionQueryEClass = createEClass(OPAQUE_ACTION_QUERY);

		variableAssignmentProviderEClass = createEClass(VARIABLE_ASSIGNMENT_PROVIDER);

		variableAssignmentReferenceEClass = createEClass(VARIABLE_ASSIGNMENT_REFERENCE);

		variableAssignmentQueryEClass = createEClass(VARIABLE_ASSIGNMENT_QUERY);

		mergeNodeProviderEClass = createEClass(MERGE_NODE_PROVIDER);

		mergeNodeReferenceEClass = createEClass(MERGE_NODE_REFERENCE);

		mergeNodeQueryEClass = createEClass(MERGE_NODE_QUERY);

		variableProviderEClass = createEClass(VARIABLE_PROVIDER);

		variableReferenceEClass = createEClass(VARIABLE_REFERENCE);

		variableQueryEClass = createEClass(VARIABLE_QUERY);

		activityProviderEClass = createEClass(ACTIVITY_PROVIDER);

		activityReferenceEClass = createEClass(ACTIVITY_REFERENCE);

		activityQueryEClass = createEClass(ACTIVITY_QUERY);

		forkNodeProviderEClass = createEClass(FORK_NODE_PROVIDER);

		forkNodeReferenceEClass = createEClass(FORK_NODE_REFERENCE);

		forkNodeQueryEClass = createEClass(FORK_NODE_QUERY);

		flowFinalNodeProviderEClass = createEClass(FLOW_FINAL_NODE_PROVIDER);

		flowFinalNodeReferenceEClass = createEClass(FLOW_FINAL_NODE_REFERENCE);

		flowFinalNodeQueryEClass = createEClass(FLOW_FINAL_NODE_QUERY);

		initialNodeProviderEClass = createEClass(INITIAL_NODE_PROVIDER);

		initialNodeReferenceEClass = createEClass(INITIAL_NODE_REFERENCE);

		initialNodeQueryEClass = createEClass(INITIAL_NODE_QUERY);

		booleanVariableAssignmentProviderEClass = createEClass(BOOLEAN_VARIABLE_ASSIGNMENT_PROVIDER);

		booleanVariableAssignmentReferenceEClass = createEClass(BOOLEAN_VARIABLE_ASSIGNMENT_REFERENCE);

		booleanVariableAssignmentQueryEClass = createEClass(BOOLEAN_VARIABLE_ASSIGNMENT_QUERY);

		integerVariableAssignmentProviderEClass = createEClass(INTEGER_VARIABLE_ASSIGNMENT_PROVIDER);

		integerVariableAssignmentReferenceEClass = createEClass(INTEGER_VARIABLE_ASSIGNMENT_REFERENCE);

		integerVariableAssignmentQueryEClass = createEClass(INTEGER_VARIABLE_ASSIGNMENT_QUERY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ScenarioPackage theScenarioPackage = (ScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);
		PropertyPackage thePropertyPackage = (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getElementProvider());
		EGenericType g2 = createEGenericType(theActivitydiagramPackage.getAcceptEventAction());
		g1.getETypeArguments().add(g2);
		acceptEventActionProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getAcceptEventAction());
		g1.getETypeArguments().add(g2);
		acceptEventActionReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAcceptEventActionProvider());
		acceptEventActionReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getAcceptEventAction());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theActivitydiagramPackage.getAcceptEventAction());
		g2.getETypeArguments().add(g3);
		acceptEventActionQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAcceptEventActionProvider());
		acceptEventActionQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getEvent());
		g1.getETypeArguments().add(g2);
		eventProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getEvent());
		g1.getETypeArguments().add(g2);
		eventReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEventProvider());
		eventReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getEvent());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getEvent());
		g2.getETypeArguments().add(g3);
		eventQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEventProvider());
		eventQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getJoinNode());
		g1.getETypeArguments().add(g2);
		joinNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getJoinNode());
		g1.getETypeArguments().add(g2);
		joinNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getJoinNodeProvider());
		joinNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getJoinNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getJoinNode());
		g2.getETypeArguments().add(g3);
		joinNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getJoinNodeProvider());
		joinNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getFinalNode());
		g1.getETypeArguments().add(g2);
		finalNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getFinalNode());
		g1.getETypeArguments().add(g2);
		finalNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFinalNodeProvider());
		finalNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getFinalNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getFinalNode());
		g2.getETypeArguments().add(g3);
		finalNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFinalNodeProvider());
		finalNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getDecisionNode());
		g1.getETypeArguments().add(g2);
		decisionNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getDecisionNode());
		g1.getETypeArguments().add(g2);
		decisionNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDecisionNodeProvider());
		decisionNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getDecisionNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getDecisionNode());
		g2.getETypeArguments().add(g3);
		decisionNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDecisionNodeProvider());
		decisionNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getActivityFinalNode());
		g1.getETypeArguments().add(g2);
		activityFinalNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getActivityFinalNode());
		g1.getETypeArguments().add(g2);
		activityFinalNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivityFinalNodeProvider());
		activityFinalNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getActivityFinalNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getActivityFinalNode());
		g2.getETypeArguments().add(g3);
		activityFinalNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivityFinalNodeProvider());
		activityFinalNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getActivityNode());
		g1.getETypeArguments().add(g2);
		activityNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getActivityNode());
		g1.getETypeArguments().add(g2);
		activityNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivityNodeProvider());
		activityNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getActivityNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getActivityNode());
		g2.getETypeArguments().add(g3);
		activityNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivityNodeProvider());
		activityNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getOpaqueAction());
		g1.getETypeArguments().add(g2);
		opaqueActionProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getOpaqueAction());
		g1.getETypeArguments().add(g2);
		opaqueActionReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOpaqueActionProvider());
		opaqueActionReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getOpaqueAction());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getOpaqueAction());
		g2.getETypeArguments().add(g3);
		opaqueActionQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOpaqueActionProvider());
		opaqueActionQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getVariableAssignment());
		g1.getETypeArguments().add(g2);
		variableAssignmentProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getVariableAssignment());
		g1.getETypeArguments().add(g2);
		variableAssignmentReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVariableAssignmentProvider());
		variableAssignmentReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getVariableAssignment());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getVariableAssignment());
		g2.getETypeArguments().add(g3);
		variableAssignmentQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVariableAssignmentProvider());
		variableAssignmentQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getMergeNode());
		g1.getETypeArguments().add(g2);
		mergeNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getMergeNode());
		g1.getETypeArguments().add(g2);
		mergeNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMergeNodeProvider());
		mergeNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getMergeNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getMergeNode());
		g2.getETypeArguments().add(g3);
		mergeNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMergeNodeProvider());
		mergeNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getVariable());
		g1.getETypeArguments().add(g2);
		variableProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getVariable());
		g1.getETypeArguments().add(g2);
		variableReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVariableProvider());
		variableReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getVariable());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getVariable());
		g2.getETypeArguments().add(g3);
		variableQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVariableProvider());
		variableQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getActivity());
		g1.getETypeArguments().add(g2);
		activityProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getActivity());
		g1.getETypeArguments().add(g2);
		activityReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivityProvider());
		activityReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getActivity());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getActivity());
		g2.getETypeArguments().add(g3);
		activityQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivityProvider());
		activityQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getForkNode());
		g1.getETypeArguments().add(g2);
		forkNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getForkNode());
		g1.getETypeArguments().add(g2);
		forkNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getForkNodeProvider());
		forkNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getForkNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getForkNode());
		g2.getETypeArguments().add(g3);
		forkNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getForkNodeProvider());
		forkNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getFlowFinalNode());
		g1.getETypeArguments().add(g2);
		flowFinalNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getFlowFinalNode());
		g1.getETypeArguments().add(g2);
		flowFinalNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowFinalNodeProvider());
		flowFinalNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getFlowFinalNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getFlowFinalNode());
		g2.getETypeArguments().add(g3);
		flowFinalNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFlowFinalNodeProvider());
		flowFinalNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getInitialNode());
		g1.getETypeArguments().add(g2);
		initialNodeProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getInitialNode());
		g1.getETypeArguments().add(g2);
		initialNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getInitialNodeProvider());
		initialNodeReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getInitialNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getInitialNode());
		g2.getETypeArguments().add(g3);
		initialNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getInitialNodeProvider());
		initialNodeQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getBooleanVariableAssignment());
		g1.getETypeArguments().add(g2);
		booleanVariableAssignmentProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getBooleanVariableAssignment());
		g1.getETypeArguments().add(g2);
		booleanVariableAssignmentReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanVariableAssignmentProvider());
		booleanVariableAssignmentReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getBooleanVariableAssignment());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getBooleanVariableAssignment());
		g2.getETypeArguments().add(g3);
		booleanVariableAssignmentQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanVariableAssignmentProvider());
		booleanVariableAssignmentQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theActivitydiagramPackage.getIntegerVariableAssignment());
		g1.getETypeArguments().add(g2);
		integerVariableAssignmentProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theActivitydiagramPackage.getIntegerVariableAssignment());
		g1.getETypeArguments().add(g2);
		integerVariableAssignmentReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIntegerVariableAssignmentProvider());
		integerVariableAssignmentReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theActivitydiagramPackage.getIntegerVariableAssignment());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theActivitydiagramPackage.getIntegerVariableAssignment());
		g2.getETypeArguments().add(g3);
		integerVariableAssignmentQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIntegerVariableAssignmentProvider());
		integerVariableAssignmentQueryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(acceptEventActionProviderEClass, AcceptEventActionProvider.class, "AcceptEventActionProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptEventActionReferenceEClass, AcceptEventActionReference.class, "AcceptEventActionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptEventActionQueryEClass, AcceptEventActionQuery.class, "AcceptEventActionQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventProviderEClass, EventProvider.class, "EventProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventReferenceEClass, EventReference.class, "EventReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventQueryEClass, EventQuery.class, "EventQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeProviderEClass, JoinNodeProvider.class, "JoinNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeReferenceEClass, JoinNodeReference.class, "JoinNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeQueryEClass, JoinNodeQuery.class, "JoinNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeProviderEClass, FinalNodeProvider.class, "FinalNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeReferenceEClass, FinalNodeReference.class, "FinalNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeQueryEClass, FinalNodeQuery.class, "FinalNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeProviderEClass, DecisionNodeProvider.class, "DecisionNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeReferenceEClass, DecisionNodeReference.class, "DecisionNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeQueryEClass, DecisionNodeQuery.class, "DecisionNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityFinalNodeProviderEClass, ActivityFinalNodeProvider.class, "ActivityFinalNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityFinalNodeReferenceEClass, ActivityFinalNodeReference.class, "ActivityFinalNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityFinalNodeQueryEClass, ActivityFinalNodeQuery.class, "ActivityFinalNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityNodeProviderEClass, ActivityNodeProvider.class, "ActivityNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityNodeReferenceEClass, ActivityNodeReference.class, "ActivityNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityNodeQueryEClass, ActivityNodeQuery.class, "ActivityNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueActionProviderEClass, OpaqueActionProvider.class, "OpaqueActionProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueActionReferenceEClass, OpaqueActionReference.class, "OpaqueActionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueActionQueryEClass, OpaqueActionQuery.class, "OpaqueActionQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableAssignmentProviderEClass, VariableAssignmentProvider.class, "VariableAssignmentProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableAssignmentReferenceEClass, VariableAssignmentReference.class, "VariableAssignmentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableAssignmentQueryEClass, VariableAssignmentQuery.class, "VariableAssignmentQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNodeProviderEClass, MergeNodeProvider.class, "MergeNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNodeReferenceEClass, MergeNodeReference.class, "MergeNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNodeQueryEClass, MergeNodeQuery.class, "MergeNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableProviderEClass, VariableProvider.class, "VariableProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableQueryEClass, VariableQuery.class, "VariableQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityProviderEClass, ActivityProvider.class, "ActivityProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityReferenceEClass, ActivityReference.class, "ActivityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityQueryEClass, ActivityQuery.class, "ActivityQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeProviderEClass, ForkNodeProvider.class, "ForkNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeReferenceEClass, ForkNodeReference.class, "ForkNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeQueryEClass, ForkNodeQuery.class, "ForkNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowFinalNodeProviderEClass, FlowFinalNodeProvider.class, "FlowFinalNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowFinalNodeReferenceEClass, FlowFinalNodeReference.class, "FlowFinalNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowFinalNodeQueryEClass, FlowFinalNodeQuery.class, "FlowFinalNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialNodeProviderEClass, InitialNodeProvider.class, "InitialNodeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialNodeReferenceEClass, InitialNodeReference.class, "InitialNodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialNodeQueryEClass, InitialNodeQuery.class, "InitialNodeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariableAssignmentProviderEClass, BooleanVariableAssignmentProvider.class, "BooleanVariableAssignmentProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariableAssignmentReferenceEClass, BooleanVariableAssignmentReference.class, "BooleanVariableAssignmentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariableAssignmentQueryEClass, BooleanVariableAssignmentQuery.class, "BooleanVariableAssignmentQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerVariableAssignmentProviderEClass, IntegerVariableAssignmentProvider.class, "IntegerVariableAssignmentProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerVariableAssignmentReferenceEClass, IntegerVariableAssignmentReference.class, "IntegerVariableAssignmentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerVariableAssignmentQueryEClass, IntegerVariableAssignmentQuery.class, "IntegerVariableAssignmentQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XActivityDiagramProviderPackageImpl
