/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.xelevator.elevator.ElevatorPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.impl.XElevatorArbiterPackageImpl;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.ButtonPressEvent;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEvent;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventFactory;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventPackage;

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
public class XElevatorEventPackageImpl extends EPackageImpl implements XElevatorEventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xElevatorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonPressEventEClass = null;

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
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XElevatorEventPackageImpl() {
		super(eNS_URI, XElevatorEventFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XElevatorEventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XElevatorEventPackage init() {
		if (isInited) return (XElevatorEventPackage)EPackage.Registry.INSTANCE.getEPackage(XElevatorEventPackage.eNS_URI);

		// Obtain or create and register package
		XElevatorEventPackageImpl theXElevatorEventPackage = (XElevatorEventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XElevatorEventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XElevatorEventPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ElevatorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XElevatorArbiterPackageImpl theXElevatorArbiterPackage = (XElevatorArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI) instanceof XElevatorArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorArbiterPackage.eNS_URI) : XElevatorArbiterPackage.eINSTANCE);
		XElevatorPropertyPackageImpl theXElevatorPropertyPackage = (XElevatorPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI) instanceof XElevatorPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorPropertyPackage.eNS_URI) : XElevatorPropertyPackage.eINSTANCE);
		XElevatorProviderPackageImpl theXElevatorProviderPackage = (XElevatorProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI) instanceof XElevatorProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorProviderPackage.eNS_URI) : XElevatorProviderPackage.eINSTANCE);
		XElevatorScenarioPackageImpl theXElevatorScenarioPackage = (XElevatorScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI) instanceof XElevatorScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XElevatorScenarioPackage.eNS_URI) : XElevatorScenarioPackage.eINSTANCE);

		// Create package meta-data objects
		theXElevatorEventPackage.createPackageContents();
		theXElevatorArbiterPackage.createPackageContents();
		theXElevatorPropertyPackage.createPackageContents();
		theXElevatorProviderPackage.createPackageContents();
		theXElevatorScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXElevatorEventPackage.initializePackageContents();
		theXElevatorArbiterPackage.initializePackageContents();
		theXElevatorPropertyPackage.initializePackageContents();
		theXElevatorProviderPackage.initializePackageContents();
		theXElevatorScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXElevatorEventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XElevatorEventPackage.eNS_URI, theXElevatorEventPackage);
		return theXElevatorEventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXElevatorEvent() {
		return xElevatorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonPressEvent() {
		return buttonPressEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorEventFactory getXElevatorEventFactory() {
		return (XElevatorEventFactory)getEFactoryInstance();
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
		xElevatorEventEClass = createEClass(XELEVATOR_EVENT);

		buttonPressEventEClass = createEClass(BUTTON_PRESS_EVENT);
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

		// Create type parameters
		ETypeParameter xElevatorEventEClass_T = addETypeParameter(xElevatorEventEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getEvent());
		EGenericType g2 = createEGenericType(xElevatorEventEClass_T);
		g1.getETypeArguments().add(g2);
		xElevatorEventEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXElevatorEvent());
		g2 = createEGenericType(theElevatorPackage.getButton());
		g1.getETypeArguments().add(g2);
		buttonPressEventEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xElevatorEventEClass, XElevatorEvent.class, "XElevatorEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonPressEventEClass, ButtonPressEvent.class, "ButtonPressEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XElevatorEventPackageImpl
