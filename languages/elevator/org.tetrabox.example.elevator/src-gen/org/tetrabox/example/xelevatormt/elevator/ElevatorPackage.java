/**
 */
package org.tetrabox.example.xelevatormt.elevator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorFactory
 * @model kind="package"
 * @generated
 */
public interface ElevatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elevator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.xelevatormt/elevator/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elevator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElevatorPackage eINSTANCE = org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.FloorImpl
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NR = 1;

	/**
	 * The feature id for the '<em><b>Floor Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__FLOOR_BUTTONS = 2;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__PREVIOUS = 3;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ButtonImpl
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 1;

	/**
	 * The feature id for the '<em><b>Requested Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__REQUESTED_FLOOR = 0;

	/**
	 * The feature id for the '<em><b>Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PRESSED = 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.ElevatorImpl <em>Elevator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorImpl
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getElevator()
	 * @generated
	 */
	int ELEVATOR = 2;

	/**
	 * The feature id for the '<em><b>Elevator Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__ELEVATOR_BUTTONS = 0;

	/**
	 * The feature id for the '<em><b>Doors Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__DOORS_OPEN = 1;

	/**
	 * The feature id for the '<em><b>Going Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__GOING_UP = 2;

	/**
	 * The feature id for the '<em><b>Current Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__CURRENT_FLOOR = 3;

	/**
	 * The number of structural features of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.ElevatorButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorButtonImpl
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getElevatorButton()
	 * @generated
	 */
	int ELEVATOR_BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Requested Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON__REQUESTED_FLOOR = BUTTON__REQUESTED_FLOOR;

	/**
	 * The feature id for the '<em><b>Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON__PRESSED = BUTTON__PRESSED;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.FloorButtonImpl <em>Floor Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.FloorButtonImpl
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getFloorButton()
	 * @generated
	 */
	int FLOOR_BUTTON = 4;

	/**
	 * The feature id for the '<em><b>Requested Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON__REQUESTED_FLOOR = BUTTON__REQUESTED_FLOOR;

	/**
	 * The feature id for the '<em><b>Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON__PRESSED = BUTTON__PRESSED;

	/**
	 * The number of structural features of the '<em>Floor Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.UpButtonImpl <em>Up Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.UpButtonImpl
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getUpButton()
	 * @generated
	 */
	int UP_BUTTON = 5;

	/**
	 * The feature id for the '<em><b>Requested Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON__REQUESTED_FLOOR = FLOOR_BUTTON__REQUESTED_FLOOR;

	/**
	 * The feature id for the '<em><b>Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON__PRESSED = FLOOR_BUTTON__PRESSED;

	/**
	 * The number of structural features of the '<em>Up Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_FEATURE_COUNT = FLOOR_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.DownButtonImpl <em>Down Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.DownButtonImpl
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getDownButton()
	 * @generated
	 */
	int DOWN_BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Requested Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON__REQUESTED_FLOOR = FLOOR_BUTTON__REQUESTED_FLOOR;

	/**
	 * The feature id for the '<em><b>Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON__PRESSED = FLOOR_BUTTON__PRESSED;

	/**
	 * The number of structural features of the '<em>Down Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_FEATURE_COUNT = FLOOR_BUTTON_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.ElevatorSystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorSystemImpl
	 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getElevatorSystem()
	 * @generated
	 */
	int ELEVATOR_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Elevators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM__ELEVATORS = 0;

	/**
	 * The feature id for the '<em><b>Floors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM__FLOORS = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevatormt.elevator.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.xelevatormt.elevator.Floor#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Floor#getNext()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Next();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.xelevatormt.elevator.Floor#getNr <em>Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Floor#getNr()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_Nr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.xelevatormt.elevator.Floor#getFloorButtons <em>Floor Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floor Buttons</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Floor#getFloorButtons()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_FloorButtons();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.xelevatormt.elevator.Floor#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Floor#getPrevious()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Previous();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevatormt.elevator.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.xelevatormt.elevator.Button#getRequestedFloor <em>Requested Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requested Floor</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Button#getRequestedFloor()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_RequestedFloor();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.xelevatormt.elevator.Button#isPressed <em>Pressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressed</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Button#isPressed()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Pressed();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevatormt.elevator.Elevator <em>Elevator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Elevator
	 * @generated
	 */
	EClass getElevator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.xelevatormt.elevator.Elevator#getElevatorButtons <em>Elevator Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elevator Buttons</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Elevator#getElevatorButtons()
	 * @see #getElevator()
	 * @generated
	 */
	EReference getElevator_ElevatorButtons();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.xelevatormt.elevator.Elevator#isDoorsOpen <em>Doors Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doors Open</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Elevator#isDoorsOpen()
	 * @see #getElevator()
	 * @generated
	 */
	EAttribute getElevator_DoorsOpen();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.xelevatormt.elevator.Elevator#isGoingUp <em>Going Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Going Up</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Elevator#isGoingUp()
	 * @see #getElevator()
	 * @generated
	 */
	EAttribute getElevator_GoingUp();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.xelevatormt.elevator.Elevator#getCurrentFloor <em>Current Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Floor</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.Elevator#getCurrentFloor()
	 * @see #getElevator()
	 * @generated
	 */
	EReference getElevator_CurrentFloor();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevatormt.elevator.ElevatorButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorButton
	 * @generated
	 */
	EClass getElevatorButton();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevatormt.elevator.FloorButton <em>Floor Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Button</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.FloorButton
	 * @generated
	 */
	EClass getFloorButton();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevatormt.elevator.UpButton <em>Up Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Up Button</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.UpButton
	 * @generated
	 */
	EClass getUpButton();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevatormt.elevator.DownButton <em>Down Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Down Button</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.DownButton
	 * @generated
	 */
	EClass getDownButton();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevatormt.elevator.ElevatorSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorSystem
	 * @generated
	 */
	EClass getElevatorSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.xelevatormt.elevator.ElevatorSystem#getElevators <em>Elevators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elevators</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorSystem#getElevators()
	 * @see #getElevatorSystem()
	 * @generated
	 */
	EReference getElevatorSystem_Elevators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.xelevatormt.elevator.ElevatorSystem#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floors</em>'.
	 * @see org.tetrabox.example.xelevatormt.elevator.ElevatorSystem#getFloors()
	 * @see #getElevatorSystem()
	 * @generated
	 */
	EReference getElevatorSystem_Floors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElevatorFactory getElevatorFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.FloorImpl
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__NEXT = eINSTANCE.getFloor_Next();

		/**
		 * The meta object literal for the '<em><b>Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__NR = eINSTANCE.getFloor_Nr();

		/**
		 * The meta object literal for the '<em><b>Floor Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__FLOOR_BUTTONS = eINSTANCE.getFloor_FloorButtons();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__PREVIOUS = eINSTANCE.getFloor_Previous();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ButtonImpl
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Requested Floor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__REQUESTED_FLOOR = eINSTANCE.getButton_RequestedFloor();

		/**
		 * The meta object literal for the '<em><b>Pressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__PRESSED = eINSTANCE.getButton_Pressed();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.ElevatorImpl <em>Elevator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorImpl
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getElevator()
		 * @generated
		 */
		EClass ELEVATOR = eINSTANCE.getElevator();

		/**
		 * The meta object literal for the '<em><b>Elevator Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEVATOR__ELEVATOR_BUTTONS = eINSTANCE.getElevator_ElevatorButtons();

		/**
		 * The meta object literal for the '<em><b>Doors Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEVATOR__DOORS_OPEN = eINSTANCE.getElevator_DoorsOpen();

		/**
		 * The meta object literal for the '<em><b>Going Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEVATOR__GOING_UP = eINSTANCE.getElevator_GoingUp();

		/**
		 * The meta object literal for the '<em><b>Current Floor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEVATOR__CURRENT_FLOOR = eINSTANCE.getElevator_CurrentFloor();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.ElevatorButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorButtonImpl
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getElevatorButton()
		 * @generated
		 */
		EClass ELEVATOR_BUTTON = eINSTANCE.getElevatorButton();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.FloorButtonImpl <em>Floor Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.FloorButtonImpl
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getFloorButton()
		 * @generated
		 */
		EClass FLOOR_BUTTON = eINSTANCE.getFloorButton();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.UpButtonImpl <em>Up Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.UpButtonImpl
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getUpButton()
		 * @generated
		 */
		EClass UP_BUTTON = eINSTANCE.getUpButton();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.DownButtonImpl <em>Down Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.DownButtonImpl
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getDownButton()
		 * @generated
		 */
		EClass DOWN_BUTTON = eINSTANCE.getDownButton();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevatormt.elevator.impl.ElevatorSystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorSystemImpl
		 * @see org.tetrabox.example.xelevatormt.elevator.impl.ElevatorPackageImpl#getElevatorSystem()
		 * @generated
		 */
		EClass ELEVATOR_SYSTEM = eINSTANCE.getElevatorSystem();

		/**
		 * The meta object literal for the '<em><b>Elevators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEVATOR_SYSTEM__ELEVATORS = eINSTANCE.getElevatorSystem_Elevators();

		/**
		 * The meta object literal for the '<em><b>Floors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEVATOR_SYSTEM__FLOORS = eINSTANCE.getElevatorSystem_Floors();

	}

} //ElevatorPackage
