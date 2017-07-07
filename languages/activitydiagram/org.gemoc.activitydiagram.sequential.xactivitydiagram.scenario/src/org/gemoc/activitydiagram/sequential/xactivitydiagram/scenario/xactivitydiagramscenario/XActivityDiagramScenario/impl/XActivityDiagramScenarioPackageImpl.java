/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl;

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

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl.XActivityDiagramProviderPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramEventOccurrence;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenario;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioElement;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSM;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMState;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMTransition;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramScenarioPackageImpl extends EPackageImpl implements XActivityDiagramScenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramScenarioElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramEventOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramScenarioFSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramScenarioFSMStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramScenarioFSMTransitionEClass = null;

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
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XActivityDiagramScenarioPackageImpl() {
		super(eNS_URI, XActivityDiagramScenarioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XActivityDiagramScenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XActivityDiagramScenarioPackage init() {
		if (isInited) return (XActivityDiagramScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI);

		// Obtain or create and register package
		XActivityDiagramScenarioPackageImpl theXActivityDiagramScenarioPackage = (XActivityDiagramScenarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XActivityDiagramScenarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XActivityDiagramScenarioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XActivityDiagramArbiterPackageImpl theXActivityDiagramArbiterPackage = (XActivityDiagramArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI) instanceof XActivityDiagramArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI) : XActivityDiagramArbiterPackage.eINSTANCE);
		XActivityDiagramEventPackageImpl theXActivityDiagramEventPackage = (XActivityDiagramEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI) instanceof XActivityDiagramEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI) : XActivityDiagramEventPackage.eINSTANCE);
		XActivityDiagramPropertyPackageImpl theXActivityDiagramPropertyPackage = (XActivityDiagramPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI) instanceof XActivityDiagramPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI) : XActivityDiagramPropertyPackage.eINSTANCE);
		XActivityDiagramProviderPackageImpl theXActivityDiagramProviderPackage = (XActivityDiagramProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI) instanceof XActivityDiagramProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI) : XActivityDiagramProviderPackage.eINSTANCE);

		// Load packages
		theXActivityDiagramPropertyPackage.loadPackage();

		// Create package meta-data objects
		theXActivityDiagramScenarioPackage.createPackageContents();
		theXActivityDiagramArbiterPackage.createPackageContents();
		theXActivityDiagramEventPackage.createPackageContents();
		theXActivityDiagramProviderPackage.createPackageContents();

		// Initialize created meta-data
		theXActivityDiagramScenarioPackage.initializePackageContents();
		theXActivityDiagramArbiterPackage.initializePackageContents();
		theXActivityDiagramEventPackage.initializePackageContents();
		theXActivityDiagramProviderPackage.initializePackageContents();

		// Fix loaded packages
		theXActivityDiagramPropertyPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXActivityDiagramScenarioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XActivityDiagramScenarioPackage.eNS_URI, theXActivityDiagramScenarioPackage);
		return theXActivityDiagramScenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramScenario() {
		return xActivityDiagramScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramScenarioElement() {
		return xActivityDiagramScenarioElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramEventOccurrence() {
		return xActivityDiagramEventOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramScenarioFSM() {
		return xActivityDiagramScenarioFSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramScenarioFSMState() {
		return xActivityDiagramScenarioFSMStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramScenarioFSMTransition() {
		return xActivityDiagramScenarioFSMTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramScenarioFactory getXActivityDiagramScenarioFactory() {
		return (XActivityDiagramScenarioFactory)getEFactoryInstance();
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
		xActivityDiagramScenarioEClass = createEClass(XACTIVITY_DIAGRAM_SCENARIO);

		xActivityDiagramScenarioElementEClass = createEClass(XACTIVITY_DIAGRAM_SCENARIO_ELEMENT);

		xActivityDiagramEventOccurrenceEClass = createEClass(XACTIVITY_DIAGRAM_EVENT_OCCURRENCE);

		xActivityDiagramScenarioFSMEClass = createEClass(XACTIVITY_DIAGRAM_SCENARIO_FSM);

		xActivityDiagramScenarioFSMStateEClass = createEClass(XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE);

		xActivityDiagramScenarioFSMTransitionEClass = createEClass(XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION);
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
		XActivityDiagramPropertyPackage theXActivityDiagramPropertyPackage = (XActivityDiagramPropertyPackage)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI);
		XActivityDiagramEventPackage theXActivityDiagramEventPackage = (XActivityDiagramEventPackage)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getScenario());
		EGenericType g2 = createEGenericType(this.getXActivityDiagramScenarioElement());
		g1.getETypeArguments().add(g2);
		xActivityDiagramScenarioEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioElement());
		g2 = createEGenericType(theXActivityDiagramPropertyPackage.getXActivityDiagramProperty());
		g1.getETypeArguments().add(g2);
		xActivityDiagramScenarioElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getEventOccurrence());
		g2 = createEGenericType(theXActivityDiagramEventPackage.getXActivityDiagramEvent());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theXActivityDiagramPropertyPackage.getXActivityDiagramProperty());
		g1.getETypeArguments().add(g2);
		xActivityDiagramEventOccurrenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXActivityDiagramScenarioElement());
		xActivityDiagramEventOccurrenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSM());
		g2 = createEGenericType(theXActivityDiagramPropertyPackage.getXActivityDiagramProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theXActivityDiagramEventPackage.getXActivityDiagramEvent());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getXActivityDiagramScenarioFSMState());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXActivityDiagramScenarioFSMTransition());
		g1.getETypeArguments().add(g2);
		xActivityDiagramScenarioFSMEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXActivityDiagramScenarioElement());
		xActivityDiagramScenarioFSMEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSMState());
		g2 = createEGenericType(theXActivityDiagramEventPackage.getXActivityDiagramEvent());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getXActivityDiagramScenarioFSMTransition());
		g1.getETypeArguments().add(g2);
		xActivityDiagramScenarioFSMStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSMTransition());
		g2 = createEGenericType(theXActivityDiagramPropertyPackage.getXActivityDiagramProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXActivityDiagramScenarioFSMState());
		g1.getETypeArguments().add(g2);
		xActivityDiagramScenarioFSMTransitionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xActivityDiagramScenarioEClass, XActivityDiagramScenario.class, "XActivityDiagramScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xActivityDiagramScenarioElementEClass, XActivityDiagramScenarioElement.class, "XActivityDiagramScenarioElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xActivityDiagramEventOccurrenceEClass, XActivityDiagramEventOccurrence.class, "XActivityDiagramEventOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xActivityDiagramScenarioFSMEClass, XActivityDiagramScenarioFSM.class, "XActivityDiagramScenarioFSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xActivityDiagramScenarioFSMStateEClass, XActivityDiagramScenarioFSMState.class, "XActivityDiagramScenarioFSMState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xActivityDiagramScenarioFSMTransitionEClass, XActivityDiagramScenarioFSMTransition.class, "XActivityDiagramScenarioFSMTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XActivityDiagramScenarioPackageImpl
