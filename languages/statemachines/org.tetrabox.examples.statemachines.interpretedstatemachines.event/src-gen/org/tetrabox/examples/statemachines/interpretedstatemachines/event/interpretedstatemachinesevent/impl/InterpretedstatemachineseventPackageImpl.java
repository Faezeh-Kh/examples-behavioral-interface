/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.executionframework.event.model.event.EventPackage;

import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedStateMachinesDSLEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineRunEvent;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.StatemachinesexecutiondataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterpretedstatemachineseventPackageImpl extends EPackageImpl implements InterpretedstatemachineseventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpretedStateMachinesDSLEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEventOccurrenceReceivedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineRunEventEClass = null;

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
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterpretedstatemachineseventPackageImpl() {
		super(eNS_URI, InterpretedstatemachineseventFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterpretedstatemachineseventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterpretedstatemachineseventPackage init() {
		if (isInited) return (InterpretedstatemachineseventPackage)EPackage.Registry.INSTANCE.getEPackage(InterpretedstatemachineseventPackage.eNS_URI);

		// Obtain or create and register package
		InterpretedstatemachineseventPackageImpl theInterpretedstatemachineseventPackage = (InterpretedstatemachineseventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterpretedstatemachineseventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterpretedstatemachineseventPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EventPackage.eINSTANCE.eClass();
		StatemachinesPackage.eINSTANCE.eClass();
		StatemachinesexecutiondataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInterpretedstatemachineseventPackage.createPackageContents();

		// Initialize created meta-data
		theInterpretedstatemachineseventPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterpretedstatemachineseventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterpretedstatemachineseventPackage.eNS_URI, theInterpretedstatemachineseventPackage);
		return theInterpretedstatemachineseventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpretedStateMachinesDSLEvent() {
		return interpretedStateMachinesDSLEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineEvent() {
		return stateMachineEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachineEvent_StateMachine() {
		return (EReference)stateMachineEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineEventOccurrenceReceivedEvent() {
		return stateMachineEventOccurrenceReceivedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachineEventOccurrenceReceivedEvent_EventType() {
		return (EReference)stateMachineEventOccurrenceReceivedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineRunEvent() {
		return stateMachineRunEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretedstatemachineseventFactory getInterpretedstatemachineseventFactory() {
		return (InterpretedstatemachineseventFactory)getEFactoryInstance();
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
		interpretedStateMachinesDSLEventEClass = createEClass(INTERPRETED_STATE_MACHINES_DSL_EVENT);

		stateMachineEventEClass = createEClass(STATE_MACHINE_EVENT);
		createEReference(stateMachineEventEClass, STATE_MACHINE_EVENT__STATE_MACHINE);

		stateMachineEventOccurrenceReceivedEventEClass = createEClass(STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT);
		createEReference(stateMachineEventOccurrenceReceivedEventEClass, STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT_TYPE);

		stateMachineRunEventEClass = createEClass(STATE_MACHINE_RUN_EVENT);
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
		EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
		AlmostumlPackage theAlmostumlPackage = (AlmostumlPackage)EPackage.Registry.INSTANCE.getEPackage(AlmostumlPackage.eNS_URI);
		StatemachinesPackage theStatemachinesPackage = (StatemachinesPackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interpretedStateMachinesDSLEventEClass.getESuperTypes().add(theEventPackage.getEvent());
		stateMachineEventEClass.getESuperTypes().add(this.getInterpretedStateMachinesDSLEvent());
		stateMachineEventOccurrenceReceivedEventEClass.getESuperTypes().add(this.getStateMachineEvent());
		stateMachineRunEventEClass.getESuperTypes().add(this.getStateMachineEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(interpretedStateMachinesDSLEventEClass, InterpretedStateMachinesDSLEvent.class, "InterpretedStateMachinesDSLEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateMachineEventEClass, StateMachineEvent.class, "StateMachineEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachineEvent_StateMachine(), theAlmostumlPackage.getStateMachine(), null, "stateMachine", null, 1, 1, StateMachineEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEventOccurrenceReceivedEventEClass, StateMachineEventOccurrenceReceivedEvent.class, "StateMachineEventOccurrenceReceivedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachineEventOccurrenceReceivedEvent_EventType(), theStatemachinesPackage.getCustomEvent(), null, "eventType", null, 0, 1, StateMachineEventOccurrenceReceivedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineRunEventEClass, StateMachineRunEvent.class, "StateMachineRunEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InterpretedstatemachineseventPackageImpl
