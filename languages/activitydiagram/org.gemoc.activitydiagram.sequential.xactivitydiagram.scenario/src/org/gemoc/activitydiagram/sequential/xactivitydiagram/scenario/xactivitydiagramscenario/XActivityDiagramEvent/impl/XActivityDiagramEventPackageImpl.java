/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.impl.XActivityDiagramArbiterPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEvent;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage;

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
public class XActivityDiagramEventPackageImpl extends EPackageImpl implements XActivityDiagramEventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionAcceptEventEClass = null;

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
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XActivityDiagramEventPackageImpl() {
		super(eNS_URI, XActivityDiagramEventFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XActivityDiagramEventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XActivityDiagramEventPackage init() {
		if (isInited) return (XActivityDiagramEventPackage)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI);

		// Obtain or create and register package
		XActivityDiagramEventPackageImpl theXActivityDiagramEventPackage = (XActivityDiagramEventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XActivityDiagramEventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XActivityDiagramEventPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XActivityDiagramArbiterPackageImpl theXActivityDiagramArbiterPackage = (XActivityDiagramArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI) instanceof XActivityDiagramArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI) : XActivityDiagramArbiterPackage.eINSTANCE);
		XActivityDiagramPropertyPackageImpl theXActivityDiagramPropertyPackage = (XActivityDiagramPropertyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI) instanceof XActivityDiagramPropertyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI) : XActivityDiagramPropertyPackage.eINSTANCE);
		XActivityDiagramProviderPackageImpl theXActivityDiagramProviderPackage = (XActivityDiagramProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI) instanceof XActivityDiagramProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI) : XActivityDiagramProviderPackage.eINSTANCE);
		XActivityDiagramScenarioPackageImpl theXActivityDiagramScenarioPackage = (XActivityDiagramScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI) instanceof XActivityDiagramScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI) : XActivityDiagramScenarioPackage.eINSTANCE);

		// Load packages
		theXActivityDiagramPropertyPackage.loadPackage();

		// Create package meta-data objects
		theXActivityDiagramEventPackage.createPackageContents();
		theXActivityDiagramArbiterPackage.createPackageContents();
		theXActivityDiagramProviderPackage.createPackageContents();
		theXActivityDiagramScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXActivityDiagramEventPackage.initializePackageContents();
		theXActivityDiagramArbiterPackage.initializePackageContents();
		theXActivityDiagramProviderPackage.initializePackageContents();
		theXActivityDiagramScenarioPackage.initializePackageContents();

		// Fix loaded packages
		theXActivityDiagramPropertyPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXActivityDiagramEventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XActivityDiagramEventPackage.eNS_URI, theXActivityDiagramEventPackage);
		return theXActivityDiagramEventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramEvent() {
		return xActivityDiagramEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionAcceptEvent() {
		return acceptEventActionAcceptEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventActionAcceptEvent_EventProvider() {
		return (EReference)acceptEventActionAcceptEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramEventFactory getXActivityDiagramEventFactory() {
		return (XActivityDiagramEventFactory)getEFactoryInstance();
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
		xActivityDiagramEventEClass = createEClass(XACTIVITY_DIAGRAM_EVENT);

		acceptEventActionAcceptEventEClass = createEClass(ACCEPT_EVENT_ACTION_ACCEPT_EVENT);
		createEReference(acceptEventActionAcceptEventEClass, ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER);
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
		XActivityDiagramProviderPackage theXActivityDiagramProviderPackage = (XActivityDiagramProviderPackage)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI);

		// Create type parameters
		ETypeParameter xActivityDiagramEventEClass_T = addETypeParameter(xActivityDiagramEventEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theScenarioPackage.getEvent());
		EGenericType g2 = createEGenericType(xActivityDiagramEventEClass_T);
		g1.getETypeArguments().add(g2);
		xActivityDiagramEventEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXActivityDiagramEvent());
		g2 = createEGenericType(theActivitydiagramPackage.getAcceptEventAction());
		g1.getETypeArguments().add(g2);
		acceptEventActionAcceptEventEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(xActivityDiagramEventEClass, XActivityDiagramEvent.class, "XActivityDiagramEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptEventActionAcceptEventEClass, AcceptEventActionAcceptEvent.class, "AcceptEventActionAcceptEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptEventActionAcceptEvent_EventProvider(), theXActivityDiagramProviderPackage.getEventProvider(), null, "eventProvider", null, 1, 1, AcceptEventActionAcceptEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XActivityDiagramEventPackageImpl
