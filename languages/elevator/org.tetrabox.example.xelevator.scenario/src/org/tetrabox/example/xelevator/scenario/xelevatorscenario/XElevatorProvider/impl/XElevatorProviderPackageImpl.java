/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;

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

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonProvider;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonQuery;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonReference;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorProvider;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorQuery;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorReference;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderFactory;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorProviderPackageImpl extends EPackageImpl implements XElevatorProviderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elevatorQueryEClass = null;

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
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XElevatorProviderPackageImpl() {
		super(eNS_URI, XElevatorProviderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XElevatorProviderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XElevatorProviderPackage init() {
		if (isInited) return (XElevatorProviderPackage)EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI);

		// Obtain or create and register package
		XElevatorProviderPackageImpl theXElevatorProviderPackage = (XElevatorProviderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XElevatorProviderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XElevatorProviderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ElevatorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XElevatorArbiterPackageImpl theXElevatorArbiterPackage = (XElevatorArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI) instanceof XElevatorArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI) : XElevatorArbiterPackage.eINSTANCE);
		XElevatorEventPackageImpl theXElevatorEventPackage = (XElevatorEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI) instanceof XElevatorEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI) : XElevatorEventPackage.eINSTANCE);
		XElevatorPropertyPackageImpl theXElevatorPropertyPackage = (XElevatorPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI) instanceof XElevatorPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI) : XElevatorPropertyPackage.eINSTANCE);
		XElevatorScenarioPackageImpl theXElevatorScenarioPackage = (XElevatorScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI) instanceof XElevatorScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI) : XElevatorScenarioPackage.eINSTANCE);

		// Create package meta-data objects
		theXElevatorProviderPackage.createPackageContents();
		theXElevatorArbiterPackage.createPackageContents();
		theXElevatorEventPackage.createPackageContents();
		theXElevatorPropertyPackage.createPackageContents();
		theXElevatorScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXElevatorProviderPackage.initializePackageContents();
		theXElevatorArbiterPackage.initializePackageContents();
		theXElevatorEventPackage.initializePackageContents();
		theXElevatorPropertyPackage.initializePackageContents();
		theXElevatorScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXElevatorProviderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XElevatorProviderPackage.eNS_URI, theXElevatorProviderPackage);
		return theXElevatorProviderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonProvider() {
		return buttonProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonReference() {
		return buttonReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonQuery() {
		return buttonQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorProvider() {
		return elevatorProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorReference() {
		return elevatorReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElevatorQuery() {
		return elevatorQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorProviderFactory getXElevatorProviderFactory() {
		return (XElevatorProviderFactory)getEFactoryInstance();
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
		buttonProviderEClass = createEClass(BUTTON_PROVIDER);

		buttonReferenceEClass = createEClass(BUTTON_REFERENCE);

		buttonQueryEClass = createEClass(BUTTON_QUERY);

		elevatorProviderEClass = createEClass(ELEVATOR_PROVIDER);

		elevatorReferenceEClass = createEClass(ELEVATOR_REFERENCE);

		elevatorQueryEClass = createEClass(ELEVATOR_QUERY);
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
		ElevatorPackage theElevatorPackage = (ElevatorPackage)EPackage.Registry.INSTANCE.getEPackage(ElevatorPackage.eNS_URI);
		PropertyPackage thePropertyPackage = (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getElementProvider());
		EGenericType g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProvider());
		buttonReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theElevatorPackage.getButton());
		g2.getETypeArguments().add(g3);
		buttonQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getButtonProvider());
		buttonQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementProvider());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorProviderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementReference());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		elevatorReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProvider());
		elevatorReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getElementQuery());
		g2 = createEGenericType(theElevatorPackage.getElevator());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePropertyPackage.getStateProperty());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theElevatorPackage.getElevator());
		g2.getETypeArguments().add(g3);
		elevatorQueryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getElevatorProvider());
		elevatorQueryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(buttonProviderEClass, ButtonProvider.class, "ButtonProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonReferenceEClass, ButtonReference.class, "ButtonReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonQueryEClass, ButtonQuery.class, "ButtonQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elevatorProviderEClass, ElevatorProvider.class, "ElevatorProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elevatorReferenceEClass, ElevatorReference.class, "ElevatorReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elevatorQueryEClass, ElevatorQuery.class, "ElevatorQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XElevatorProviderPackageImpl
