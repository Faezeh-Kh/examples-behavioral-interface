/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface XElevatorScenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XElevatorScenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.xelevator/scenario/XElevatorScenario/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XElevatorScenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XElevatorScenarioPackage eINSTANCE = org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioImpl <em>XElevator Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenario()
	 * @generated
	 */
	int XELEVATOR_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO__ELEMENTS = ScenarioPackage.SCENARIO__ELEMENTS;

	/**
	 * The number of structural features of the '<em>XElevator Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FEATURE_COUNT = ScenarioPackage.SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioElementImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenarioElement()
	 * @generated
	 */
	int XELEVATOR_SCENARIO_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Next Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_ELEMENT__NEXT_ELEMENTS = ScenarioPackage.SCENARIO_ELEMENT__NEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_ELEMENT__GUARD = ScenarioPackage.SCENARIO_ELEMENT__GUARD;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_ELEMENT_FEATURE_COUNT = ScenarioPackage.SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorEventOccurrenceImpl <em>XElevator Event Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorEventOccurrenceImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorEventOccurrence()
	 * @generated
	 */
	int XELEVATOR_EVENT_OCCURRENCE = 2;

	/**
	 * The feature id for the '<em><b>Next Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_EVENT_OCCURRENCE__NEXT_ELEMENTS = ScenarioPackage.EVENT_OCCURRENCE__NEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_EVENT_OCCURRENCE__GUARD = ScenarioPackage.EVENT_OCCURRENCE__GUARD;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_EVENT_OCCURRENCE__EVENT = ScenarioPackage.EVENT_OCCURRENCE__EVENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_EVENT_OCCURRENCE__TIME = ScenarioPackage.EVENT_OCCURRENCE__TIME;

	/**
	 * The number of structural features of the '<em>XElevator Event Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_EVENT_OCCURRENCE_FEATURE_COUNT = ScenarioPackage.EVENT_OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenarioFSM()
	 * @generated
	 */
	int XELEVATOR_SCENARIO_FSM = 3;

	/**
	 * The feature id for the '<em><b>Next Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM__NEXT_ELEMENTS = ScenarioPackage.SCENARIO_FSM__NEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM__GUARD = ScenarioPackage.SCENARIO_FSM__GUARD;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM__STATES = ScenarioPackage.SCENARIO_FSM__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM__INITIAL_STATE = ScenarioPackage.SCENARIO_FSM__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Accepting States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM__ACCEPTING_STATES = ScenarioPackage.SCENARIO_FSM__ACCEPTING_STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM__TRANSITIONS = ScenarioPackage.SCENARIO_FSM__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM__NAME = ScenarioPackage.SCENARIO_FSM__NAME;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_FEATURE_COUNT = ScenarioPackage.SCENARIO_FSM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMStateImpl <em>FSM State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMStateImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenarioFSMState()
	 * @generated
	 */
	int XELEVATOR_SCENARIO_FSM_STATE = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_STATE__EVENT = ScenarioPackage.SCENARIO_FSM_STATE__EVENT;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_STATE__OUTGOING_TRANSITIONS = ScenarioPackage.SCENARIO_FSM_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_STATE__INCOMING_TRANSITIONS = ScenarioPackage.SCENARIO_FSM_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_STATE__NAME = ScenarioPackage.SCENARIO_FSM_STATE__NAME;

	/**
	 * The number of structural features of the '<em>FSM State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_STATE_FEATURE_COUNT = ScenarioPackage.SCENARIO_FSM_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMTransitionImpl <em>FSM Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMTransitionImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenarioFSMTransition()
	 * @generated
	 */
	int XELEVATOR_SCENARIO_FSM_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_TRANSITION__GUARD = ScenarioPackage.SCENARIO_FSM_TRANSITION__GUARD;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_TRANSITION__SOURCE = ScenarioPackage.SCENARIO_FSM_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_TRANSITION__TARGET = ScenarioPackage.SCENARIO_FSM_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_TRANSITION__NAME = ScenarioPackage.SCENARIO_FSM_TRANSITION__NAME;

	/**
	 * The number of structural features of the '<em>FSM Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_SCENARIO_FSM_TRANSITION_FEATURE_COUNT = ScenarioPackage.SCENARIO_FSM_TRANSITION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenario <em>XElevator Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Scenario</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenario
	 * @generated
	 */
	EClass getXElevatorScenario();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioElement
	 * @generated
	 */
	EClass getXElevatorScenarioElement();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorEventOccurrence <em>XElevator Event Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Event Occurrence</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorEventOccurrence
	 * @generated
	 */
	EClass getXElevatorEventOccurrence();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSM
	 * @generated
	 */
	EClass getXElevatorScenarioFSM();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMState <em>FSM State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM State</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMState
	 * @generated
	 */
	EClass getXElevatorScenarioFSMState();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition <em>FSM Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Transition</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioFSMTransition
	 * @generated
	 */
	EClass getXElevatorScenarioFSMTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XElevatorScenarioFactory getXElevatorScenarioFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioImpl <em>XElevator Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenario()
		 * @generated
		 */
		EClass XELEVATOR_SCENARIO = eINSTANCE.getXElevatorScenario();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioElementImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenarioElement()
		 * @generated
		 */
		EClass XELEVATOR_SCENARIO_ELEMENT = eINSTANCE.getXElevatorScenarioElement();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorEventOccurrenceImpl <em>XElevator Event Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorEventOccurrenceImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorEventOccurrence()
		 * @generated
		 */
		EClass XELEVATOR_EVENT_OCCURRENCE = eINSTANCE.getXElevatorEventOccurrence();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenarioFSM()
		 * @generated
		 */
		EClass XELEVATOR_SCENARIO_FSM = eINSTANCE.getXElevatorScenarioFSM();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMStateImpl <em>FSM State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMStateImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenarioFSMState()
		 * @generated
		 */
		EClass XELEVATOR_SCENARIO_FSM_STATE = eINSTANCE.getXElevatorScenarioFSMState();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMTransitionImpl <em>FSM Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioFSMTransitionImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl.XElevatorScenarioPackageImpl#getXElevatorScenarioFSMTransition()
		 * @generated
		 */
		EClass XELEVATOR_SCENARIO_FSM_TRANSITION = eINSTANCE.getXElevatorScenarioFSMTransition();

	}

} //XElevatorScenarioPackage
