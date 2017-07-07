/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent;

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
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventFactory
 * @model kind="package"
 * @generated
 */
public interface XElevatorEventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XElevatorEvent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.xelevator/scenario/XElevatorEvent/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XElevatorEvent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XElevatorEventPackage eINSTANCE = org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventImpl <em>XElevator Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventPackageImpl#getXElevatorEvent()
	 * @generated
	 */
	int XELEVATOR_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_EVENT__TARGET_PROVIDER = ScenarioPackage.EVENT__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>XElevator Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_EVENT_FEATURE_COUNT = ScenarioPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.ButtonPressEventImpl <em>Button Press Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.ButtonPressEventImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventPackageImpl#getButtonPressEvent()
	 * @generated
	 */
	int BUTTON_PRESS_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESS_EVENT__TARGET_PROVIDER = XELEVATOR_EVENT__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Button Press Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESS_EVENT_FEATURE_COUNT = XELEVATOR_EVENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEvent <em>XElevator Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Event</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEvent
	 * @generated
	 */
	EClass getXElevatorEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.ButtonPressEvent <em>Button Press Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Press Event</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.ButtonPressEvent
	 * @generated
	 */
	EClass getButtonPressEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XElevatorEventFactory getXElevatorEventFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventImpl <em>XElevator Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventPackageImpl#getXElevatorEvent()
		 * @generated
		 */
		EClass XELEVATOR_EVENT = eINSTANCE.getXElevatorEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.ButtonPressEventImpl <em>Button Press Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.ButtonPressEventImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl.XElevatorEventPackageImpl#getButtonPressEvent()
		 * @generated
		 */
		EClass BUTTON_PRESS_EVENT = eINSTANCE.getButtonPressEvent();

	}

} //XElevatorEventPackage
