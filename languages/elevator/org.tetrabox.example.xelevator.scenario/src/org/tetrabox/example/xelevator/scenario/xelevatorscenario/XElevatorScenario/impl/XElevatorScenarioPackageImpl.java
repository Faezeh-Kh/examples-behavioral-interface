/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.xelevator.elevator.ElevatorPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.impl.XElevatorArbiterPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorEventOccurrence;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenario;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioElement;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSM;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMState;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFactory;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorScenarioPackageImpl extends EPackageImpl implements XElevatorScenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorScenarioElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorEventOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorScenarioFSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorScenarioFSMStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorScenarioFSMTransitionEClass = null;

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
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XElevatorScenarioPackageImpl() {
		super(eNS_URI, XElevatorScenarioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XElevatorScenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XElevatorScenarioPackage init() {
		if (isInited) return (XElevatorScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI);

		// Obtain or create and register package
		XElevatorScenarioPackageImpl theXElevatorScenarioPackage = (XElevatorScenarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XElevatorScenarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XElevatorScenarioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ElevatorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XElevatorArbiterPackageImpl theXElevatorArbiterPackage = (XElevatorArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI) instanceof XElevatorArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI) : XElevatorArbiterPackage.eINSTANCE);
		XElevatorEventPackageImpl theXElevatorEventPackage = (XElevatorEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI) instanceof XElevatorEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI) : XElevatorEventPackage.eINSTANCE);
		XElevatorPropertyPackageImpl theXElevatorPropertyPackage = (XElevatorPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI) instanceof XElevatorPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI) : XElevatorPropertyPackage.eINSTANCE);
		XElevatorProviderPackageImpl theXElevatorProviderPackage = (XElevatorProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI) instanceof XElevatorProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI) : XElevatorProviderPackage.eINSTANCE);

		// Create package meta-data objects
		theXElevatorScenarioPackage.createPackageContents();
		theXElevatorArbiterPackage.createPackageContents();
		theXElevatorEventPackage.createPackageContents();
		theXElevatorPropertyPackage.createPackageContents();
		theXElevatorProviderPackage.createPackageContents();

		// Initialize created meta-data
		theXElevatorScenarioPackage.initializePackageContents();
		theXElevatorArbiterPackage.initializePackageContents();
		theXElevatorEventPackage.initializePackageContents();
		theXElevatorPropertyPackage.initializePackageContents();
		theXElevatorProviderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXElevatorScenarioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XElevatorScenarioPackage.eNS_URI, theXElevatorScenarioPackage);
		return theXElevatorScenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorScenario() {
		return xElevatorScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorScenarioElement() {
		return xElevatorScenarioElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorEventOccurrence() {
		return xElevatorEventOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorScenarioFSM() {
		return xElevatorScenarioFSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorScenarioFSMState() {
		return xElevatorScenarioFSMStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorScenarioFSMTransition() {
		return xElevatorScenarioFSMTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioFactory getXElevatorScenarioFactory() {
		return (XElevatorScenarioFactory)getEFactoryInstance();
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
		xElevatorScenarioEClass = createEClass(XELEVATOR_SCENARIO);

		xElevatorScenarioElementEClass = createEClass(XELEVATOR_SCENARIO_ELEMENT);

		xElevatorEventOccurrenceEClass = createEClass(XELEVATOR_EVENT_OCCURRENCE);

		xElevatorScenarioFSMEClass = createEClass(XELEVATOR_SCENARIO_FSM);

		xElevatorScenarioFSMStateEClass = createEClass(XELEVATOR_SCENARIO_FSM_STATE);

		xElevatorScenarioFSMTransitionEClass = createEClass(XELEVATOR_SCENARIO_FSM_TRANSITION);
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
		XElevatorPropertyPackage theXElevatorPropertyPackage = (XElevatorPropertyPackage)EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI);
		XElevatorEventPackage theXElevatorEventPackage = (XElevatorEventPackage)EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getScenario());
		EGenericType g2 = createEGenericType(this.getXElevatorScenarioElement());
		g1.getETypeArguments().add(g2);
		xElevatorScenarioEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioElement());
		g2 = createEGenericType(theXElevatorPropertyPackage.getXElevatorProperty());
		g1.getETypeArguments().add(g2);
		xElevatorScenarioElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getEventOccurrence());
		g2 = createEGenericType(theXElevatorEventPackage.getXElevatorEvent());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theXElevatorPropertyPackage.getXElevatorProperty());
		g1.getETypeArguments().add(g2);
		xElevatorEventOccurrenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorScenarioElement());
		xElevatorEventOccurrenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSM());
		g2 = createEGenericType(theXElevatorPropertyPackage.getXElevatorProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theXElevatorEventPackage.getXElevatorEvent());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getXElevatorScenarioFSMState());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXElevatorScenarioFSMTransition());
		g1.getETypeArguments().add(g2);
		xElevatorScenarioFSMEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorScenarioElement());
		xElevatorScenarioFSMEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSMState());
		g2 = createEGenericType(theXElevatorEventPackage.getXElevatorEvent());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getXElevatorScenarioFSMTransition());
		g1.getETypeArguments().add(g2);
		xElevatorScenarioFSMStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getScenarioFSMTransition());
		g2 = createEGenericType(theXElevatorPropertyPackage.getXElevatorProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXElevatorScenarioFSMState());
		g1.getETypeArguments().add(g2);
		xElevatorScenarioFSMTransitionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xElevatorScenarioEClass, XElevatorScenario.class, "XElevatorScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorScenarioElementEClass, XElevatorScenarioElement.class, "XElevatorScenarioElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorEventOccurrenceEClass, XElevatorEventOccurrence.class, "XElevatorEventOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorScenarioFSMEClass, XElevatorScenarioFSM.class, "XElevatorScenarioFSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorScenarioFSMStateEClass, XElevatorScenarioFSMState.class, "XElevatorScenarioFSMState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorScenarioFSMTransitionEClass, XElevatorScenarioFSMTransition.class, "XElevatorScenarioFSMTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XElevatorScenarioPackageImpl
