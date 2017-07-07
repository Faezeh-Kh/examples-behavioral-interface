/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario;

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
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface XActivityDiagramScenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XActivityDiagramScenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.activitydiagram.sequential.xactivitydiagram/scenario/XActivityDiagramScenario/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XActivityDiagramScenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XActivityDiagramScenarioPackage eINSTANCE = org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioImpl <em>XActivity Diagram Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenario()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO__ELEMENTS = ScenarioPackage.SCENARIO__ELEMENTS;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FEATURE_COUNT = ScenarioPackage.SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioElementImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenarioElement()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Next Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_ELEMENT__NEXT_ELEMENTS = ScenarioPackage.SCENARIO_ELEMENT__NEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_ELEMENT__GUARD = ScenarioPackage.SCENARIO_ELEMENT__GUARD;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_ELEMENT_FEATURE_COUNT = ScenarioPackage.SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramEventOccurrenceImpl <em>XActivity Diagram Event Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramEventOccurrenceImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramEventOccurrence()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_EVENT_OCCURRENCE = 2;

	/**
	 * The feature id for the '<em><b>Next Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_EVENT_OCCURRENCE__NEXT_ELEMENTS = ScenarioPackage.EVENT_OCCURRENCE__NEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_EVENT_OCCURRENCE__GUARD = ScenarioPackage.EVENT_OCCURRENCE__GUARD;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_EVENT_OCCURRENCE__EVENT = ScenarioPackage.EVENT_OCCURRENCE__EVENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_EVENT_OCCURRENCE__TIME = ScenarioPackage.EVENT_OCCURRENCE__TIME;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Event Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_EVENT_OCCURRENCE_FEATURE_COUNT = ScenarioPackage.EVENT_OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenarioFSM()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM = 3;

	/**
	 * The feature id for the '<em><b>Next Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM__NEXT_ELEMENTS = ScenarioPackage.SCENARIO_FSM__NEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM__GUARD = ScenarioPackage.SCENARIO_FSM__GUARD;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM__STATES = ScenarioPackage.SCENARIO_FSM__STATES;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM__INITIAL_STATE = ScenarioPackage.SCENARIO_FSM__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Accepting States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM__ACCEPTING_STATES = ScenarioPackage.SCENARIO_FSM__ACCEPTING_STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM__TRANSITIONS = ScenarioPackage.SCENARIO_FSM__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM__NAME = ScenarioPackage.SCENARIO_FSM__NAME;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_FEATURE_COUNT = ScenarioPackage.SCENARIO_FSM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMStateImpl <em>FSM State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMStateImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenarioFSMState()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE__EVENT = ScenarioPackage.SCENARIO_FSM_STATE__EVENT;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE__OUTGOING_TRANSITIONS = ScenarioPackage.SCENARIO_FSM_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE__INCOMING_TRANSITIONS = ScenarioPackage.SCENARIO_FSM_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE__NAME = ScenarioPackage.SCENARIO_FSM_STATE__NAME;

	/**
	 * The number of structural features of the '<em>FSM State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE_FEATURE_COUNT = ScenarioPackage.SCENARIO_FSM_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMTransitionImpl <em>FSM Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMTransitionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenarioFSMTransition()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION__GUARD = ScenarioPackage.SCENARIO_FSM_TRANSITION__GUARD;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION__SOURCE = ScenarioPackage.SCENARIO_FSM_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION__TARGET = ScenarioPackage.SCENARIO_FSM_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION__NAME = ScenarioPackage.SCENARIO_FSM_TRANSITION__NAME;

	/**
	 * The number of structural features of the '<em>FSM Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION_FEATURE_COUNT = ScenarioPackage.SCENARIO_FSM_TRANSITION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenario <em>XActivity Diagram Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Scenario</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenario
	 * @generated
	 */
	EClass getXActivityDiagramScenario();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioElement
	 * @generated
	 */
	EClass getXActivityDiagramScenarioElement();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramEventOccurrence <em>XActivity Diagram Event Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Event Occurrence</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramEventOccurrence
	 * @generated
	 */
	EClass getXActivityDiagramEventOccurrence();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSM
	 * @generated
	 */
	EClass getXActivityDiagramScenarioFSM();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMState <em>FSM State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM State</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMState
	 * @generated
	 */
	EClass getXActivityDiagramScenarioFSMState();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMTransition <em>FSM Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Transition</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioFSMTransition
	 * @generated
	 */
	EClass getXActivityDiagramScenarioFSMTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XActivityDiagramScenarioFactory getXActivityDiagramScenarioFactory();

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
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioImpl <em>XActivity Diagram Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenario()
		 * @generated
		 */
		EClass XACTIVITY_DIAGRAM_SCENARIO = eINSTANCE.getXActivityDiagramScenario();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioElementImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenarioElement()
		 * @generated
		 */
		EClass XACTIVITY_DIAGRAM_SCENARIO_ELEMENT = eINSTANCE.getXActivityDiagramScenarioElement();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramEventOccurrenceImpl <em>XActivity Diagram Event Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramEventOccurrenceImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramEventOccurrence()
		 * @generated
		 */
		EClass XACTIVITY_DIAGRAM_EVENT_OCCURRENCE = eINSTANCE.getXActivityDiagramEventOccurrence();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenarioFSM()
		 * @generated
		 */
		EClass XACTIVITY_DIAGRAM_SCENARIO_FSM = eINSTANCE.getXActivityDiagramScenarioFSM();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMStateImpl <em>FSM State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMStateImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenarioFSMState()
		 * @generated
		 */
		EClass XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE = eINSTANCE.getXActivityDiagramScenarioFSMState();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMTransitionImpl <em>FSM Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioFSMTransitionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl#getXActivityDiagramScenarioFSMTransition()
		 * @generated
		 */
		EClass XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION = eINSTANCE.getXActivityDiagramScenarioFSMTransition();

	}

} //XActivityDiagramScenarioPackage
