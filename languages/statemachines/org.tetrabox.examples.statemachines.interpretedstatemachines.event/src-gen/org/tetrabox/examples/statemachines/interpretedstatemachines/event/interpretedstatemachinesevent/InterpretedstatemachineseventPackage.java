/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gemoc.executionframework.event.model.event.EventPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventFactory
 * @model kind="package"
 * @generated
 */
public interface InterpretedstatemachineseventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interpretedstatemachinesevent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.examples.statemachines.interpretedstatemachines/statemachines/event/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interpretedstatemachinesevent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterpretedstatemachineseventPackage eINSTANCE = org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedStateMachinesDSLEventImpl <em>Interpreted State Machines DSL Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedStateMachinesDSLEventImpl
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl#getInterpretedStateMachinesDSLEvent()
	 * @generated
	 */
	int INTERPRETED_STATE_MACHINES_DSL_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Interpreted State Machines DSL Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETED_STATE_MACHINES_DSL_EVENT_FEATURE_COUNT = EventPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventImpl <em>State Machine Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventImpl
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl#getStateMachineEvent()
	 * @generated
	 */
	int STATE_MACHINE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_EVENT__STATE_MACHINE = INTERPRETED_STATE_MACHINES_DSL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_EVENT_FEATURE_COUNT = INTERPRETED_STATE_MACHINES_DSL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventOccurrenceReceivedEventImpl <em>State Machine Event Occurrence Received Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventOccurrenceReceivedEventImpl
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl#getStateMachineEventOccurrenceReceivedEvent()
	 * @generated
	 */
	int STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT = 2;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__STATE_MACHINE = STATE_MACHINE_EVENT__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT = STATE_MACHINE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine Event Occurrence Received Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT_FEATURE_COUNT = STATE_MACHINE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineRunEventImpl <em>State Machine Run Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineRunEventImpl
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl#getStateMachineRunEvent()
	 * @generated
	 */
	int STATE_MACHINE_RUN_EVENT = 3;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_RUN_EVENT__STATE_MACHINE = STATE_MACHINE_EVENT__STATE_MACHINE;

	/**
	 * The number of structural features of the '<em>State Machine Run Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_RUN_EVENT_FEATURE_COUNT = STATE_MACHINE_EVENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedStateMachinesDSLEvent <em>Interpreted State Machines DSL Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpreted State Machines DSL Event</em>'.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedStateMachinesDSLEvent
	 * @generated
	 */
	EClass getInterpretedStateMachinesDSLEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEvent <em>State Machine Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Event</em>'.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEvent
	 * @generated
	 */
	EClass getStateMachineEvent();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEvent#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Machine</em>'.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEvent#getStateMachine()
	 * @see #getStateMachineEvent()
	 * @generated
	 */
	EReference getStateMachineEvent_StateMachine();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent <em>State Machine Event Occurrence Received Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Event Occurrence Received Event</em>'.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent
	 * @generated
	 */
	EClass getStateMachineEventOccurrenceReceivedEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineEventOccurrenceReceivedEvent#getEvent()
	 * @see #getStateMachineEventOccurrenceReceivedEvent()
	 * @generated
	 */
	EReference getStateMachineEventOccurrenceReceivedEvent_Event();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineRunEvent <em>State Machine Run Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Run Event</em>'.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.StateMachineRunEvent
	 * @generated
	 */
	EClass getStateMachineRunEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterpretedstatemachineseventFactory getInterpretedstatemachineseventFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedStateMachinesDSLEventImpl <em>Interpreted State Machines DSL Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedStateMachinesDSLEventImpl
		 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl#getInterpretedStateMachinesDSLEvent()
		 * @generated
		 */
		EClass INTERPRETED_STATE_MACHINES_DSL_EVENT = eINSTANCE.getInterpretedStateMachinesDSLEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventImpl <em>State Machine Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventImpl
		 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl#getStateMachineEvent()
		 * @generated
		 */
		EClass STATE_MACHINE_EVENT = eINSTANCE.getStateMachineEvent();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_EVENT__STATE_MACHINE = eINSTANCE.getStateMachineEvent_StateMachine();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventOccurrenceReceivedEventImpl <em>State Machine Event Occurrence Received Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineEventOccurrenceReceivedEventImpl
		 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl#getStateMachineEventOccurrenceReceivedEvent()
		 * @generated
		 */
		EClass STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT = eINSTANCE.getStateMachineEventOccurrenceReceivedEvent();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT__EVENT = eINSTANCE.getStateMachineEventOccurrenceReceivedEvent_Event();

		/**
		 * The meta object literal for the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineRunEventImpl <em>State Machine Run Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.StateMachineRunEventImpl
		 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventPackageImpl#getStateMachineRunEvent()
		 * @generated
		 */
		EClass STATE_MACHINE_RUN_EVENT = eINSTANCE.getStateMachineRunEvent();

	}

} //InterpretedstatemachineseventPackage
