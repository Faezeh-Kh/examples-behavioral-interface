/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiter;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterState;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterTransition;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl.XActivityDiagramProviderPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramArbiterPackageImpl extends EPackageImpl implements XActivityDiagramArbiterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramArbiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramArbiterStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramArbiterTransitionEClass = null;

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
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XActivityDiagramArbiterPackageImpl() {
		super(eNS_URI, XActivityDiagramArbiterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XActivityDiagramArbiterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XActivityDiagramArbiterPackage init() {
		if (isInited) return (XActivityDiagramArbiterPackage)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI);

		// Obtain or create and register package
		XActivityDiagramArbiterPackageImpl theXActivityDiagramArbiterPackage = (XActivityDiagramArbiterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XActivityDiagramArbiterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XActivityDiagramArbiterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XActivityDiagramEventPackageImpl theXActivityDiagramEventPackage = (XActivityDiagramEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI) instanceof XActivityDiagramEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI) : XActivityDiagramEventPackage.eINSTANCE);
		XActivityDiagramPropertyPackageImpl theXActivityDiagramPropertyPackage = (XActivityDiagramPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI) instanceof XActivityDiagramPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI) : XActivityDiagramPropertyPackage.eINSTANCE);
		XActivityDiagramProviderPackageImpl theXActivityDiagramProviderPackage = (XActivityDiagramProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI) instanceof XActivityDiagramProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI) : XActivityDiagramProviderPackage.eINSTANCE);
		XActivityDiagramScenarioPackageImpl theXActivityDiagramScenarioPackage = (XActivityDiagramScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI) instanceof XActivityDiagramScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI) : XActivityDiagramScenarioPackage.eINSTANCE);

		// Load packages
		theXActivityDiagramPropertyPackage.loadPackage();

		// Create package meta-data objects
		theXActivityDiagramArbiterPackage.createPackageContents();
		theXActivityDiagramEventPackage.createPackageContents();
		theXActivityDiagramProviderPackage.createPackageContents();
		theXActivityDiagramScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXActivityDiagramArbiterPackage.initializePackageContents();
		theXActivityDiagramEventPackage.initializePackageContents();
		theXActivityDiagramProviderPackage.initializePackageContents();
		theXActivityDiagramScenarioPackage.initializePackageContents();

		// Fix loaded packages
		theXActivityDiagramPropertyPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXActivityDiagramArbiterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XActivityDiagramArbiterPackage.eNS_URI, theXActivityDiagramArbiterPackage);
		return theXActivityDiagramArbiterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramArbiter() {
		return xActivityDiagramArbiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramArbiterState() {
		return xActivityDiagramArbiterStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramArbiterTransition() {
		return xActivityDiagramArbiterTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramArbiterFactory getXActivityDiagramArbiterFactory() {
		return (XActivityDiagramArbiterFactory)getEFactoryInstance();
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
		xActivityDiagramArbiterEClass = createEClass(XACTIVITY_DIAGRAM_ARBITER);

		xActivityDiagramArbiterStateEClass = createEClass(XACTIVITY_DIAGRAM_ARBITER_STATE);

		xActivityDiagramArbiterTransitionEClass = createEClass(XACTIVITY_DIAGRAM_ARBITER_TRANSITION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getArbiter());
		EGenericType g2 = createEGenericType(theXActivityDiagramPropertyPackage.getXActivityDiagramProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXActivityDiagramArbiterState());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXActivityDiagramArbiterTransition());
		g1.getETypeArguments().add(g2);
		xActivityDiagramArbiterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getArbiterState());
		g2 = createEGenericType(theXActivityDiagramPropertyPackage.getXActivityDiagramProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXActivityDiagramArbiterTransition());
		g1.getETypeArguments().add(g2);
		xActivityDiagramArbiterStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theScenarioPackage.getArbiterTransition());
		g2 = createEGenericType(theXActivityDiagramPropertyPackage.getXActivityDiagramProperty());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getXActivityDiagramArbiterState());
		g1.getETypeArguments().add(g2);
		xActivityDiagramArbiterTransitionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xActivityDiagramArbiterEClass, XActivityDiagramArbiter.class, "XActivityDiagramArbiter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xActivityDiagramArbiterStateEClass, XActivityDiagramArbiterState.class, "XActivityDiagramArbiterState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xActivityDiagramArbiterTransitionEClass, XActivityDiagramArbiterTransition.class, "XActivityDiagramArbiterTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XActivityDiagramArbiterPackageImpl
