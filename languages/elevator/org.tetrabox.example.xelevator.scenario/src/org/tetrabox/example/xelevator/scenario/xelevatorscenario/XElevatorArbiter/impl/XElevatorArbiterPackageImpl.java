/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.xelevator.elevator.ElevatorPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiter;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterFactory;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterState;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterTransition;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl.XElevatorProviderPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorArbiterPackageImpl extends EPackageImpl implements XElevatorArbiterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorArbiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorArbiterStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorArbiterTransitionEClass = null;

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
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XElevatorArbiterPackageImpl() {
		super(eNS_URI, XElevatorArbiterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XElevatorArbiterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XElevatorArbiterPackage init() {
		if (isInited) return (XElevatorArbiterPackage)EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI);

		// Obtain or create and register package
		XElevatorArbiterPackageImpl theXElevatorArbiterPackage = (XElevatorArbiterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XElevatorArbiterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XElevatorArbiterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ElevatorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XElevatorEventPackageImpl theXElevatorEventPackage = (XElevatorEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI) instanceof XElevatorEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI) : XElevatorEventPackage.eINSTANCE);
		XElevatorPropertyPackageImpl theXElevatorPropertyPackage = (XElevatorPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI) instanceof XElevatorPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI) : XElevatorPropertyPackage.eINSTANCE);
		XElevatorProviderPackageImpl theXElevatorProviderPackage = (XElevatorProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI) instanceof XElevatorProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI) : XElevatorProviderPackage.eINSTANCE);
		XElevatorScenarioPackageImpl theXElevatorScenarioPackage = (XElevatorScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI) instanceof XElevatorScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI) : XElevatorScenarioPackage.eINSTANCE);

		// Create package meta-data objects
		theXElevatorArbiterPackage.createPackageContents();
		theXElevatorEventPackage.createPackageContents();
		theXElevatorPropertyPackage.createPackageContents();
		theXElevatorProviderPackage.createPackageContents();
		theXElevatorScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXElevatorArbiterPackage.initializePackageContents();
		theXElevatorEventPackage.initializePackageContents();
		theXElevatorPropertyPackage.initializePackageContents();
		theXElevatorProviderPackage.initializePackageContents();
		theXElevatorScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXElevatorArbiterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XElevatorArbiterPackage.eNS_URI, theXElevatorArbiterPackage);
		return theXElevatorArbiterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorArbiter() {
		return xElevatorArbiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorArbiterState() {
		return xElevatorArbiterStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorArbiterTransition() {
		return xElevatorArbiterTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorArbiterFactory getXElevatorArbiterFactory() {
		return (XElevatorArbiterFactory)getEFactoryInstance();
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
		xElevatorArbiterEClass = createEClass(XELEVATOR_ARBITER);

		xElevatorArbiterStateEClass = createEClass(XELEVATOR_ARBITER_STATE);

		xElevatorArbiterTransitionEClass = createEClass(XELEVATOR_ARBITER_TRANSITION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getArbiter());
		EGenericType g2 = createEGenericType(theXElevatorPropertyPackage.getXElevatorProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXElevatorArbiterState());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXElevatorArbiterTransition());
		g1.getETypeArguments().add(g2);
		xElevatorArbiterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getArbiterState());
		g2 = createEGenericType(theXElevatorPropertyPackage.getXElevatorProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXElevatorArbiterTransition());
		g1.getETypeArguments().add(g2);
		xElevatorArbiterStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getArbiterTransition());
		g2 = createEGenericType(theXElevatorPropertyPackage.getXElevatorProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXElevatorArbiterState());
		g1.getETypeArguments().add(g2);
		xElevatorArbiterTransitionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xElevatorArbiterEClass, XElevatorArbiter.class, "XElevatorArbiter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorArbiterStateEClass, XElevatorArbiterState.class, "XElevatorArbiterState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xElevatorArbiterTransitionEClass, XElevatorArbiterTransition.class, "XElevatorArbiterTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XElevatorArbiterPackageImpl
