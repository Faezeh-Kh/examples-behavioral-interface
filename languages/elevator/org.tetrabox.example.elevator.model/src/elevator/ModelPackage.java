/**
 */
package elevator;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see elevator.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
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
	String eNS_URI = "http://org.tetrabox.example.elevator/model";

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
	ModelPackage eINSTANCE = elevator.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link elevator.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elevator.impl.FloorImpl
	 * @see elevator.impl.ModelPackageImpl#getFloor()
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
	 * The number of operations of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link elevator.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elevator.impl.ButtonImpl
	 * @see elevator.impl.ModelPackageImpl#getButton()
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
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link elevator.impl.ElevatorImpl <em>Elevator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elevator.impl.ElevatorImpl
	 * @see elevator.impl.ModelPackageImpl#getElevator()
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
	 * The number of structural features of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link elevator.impl.ElevatorButtonImpl <em>Elevator Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elevator.impl.ElevatorButtonImpl
	 * @see elevator.impl.ModelPackageImpl#getElevatorButton()
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
	 * The number of structural features of the '<em>Elevator Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elevator Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link elevator.impl.FloorButtonImpl <em>Floor Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elevator.impl.FloorButtonImpl
	 * @see elevator.impl.ModelPackageImpl#getFloorButton()
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
	 * The number of structural features of the '<em>Floor Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Floor Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link elevator.impl.UpButtonImpl <em>Up Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elevator.impl.UpButtonImpl
	 * @see elevator.impl.ModelPackageImpl#getUpButton()
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
	 * The number of structural features of the '<em>Up Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_FEATURE_COUNT = FLOOR_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Up Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_OPERATION_COUNT = FLOOR_BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link elevator.impl.DownButtonImpl <em>Down Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elevator.impl.DownButtonImpl
	 * @see elevator.impl.ModelPackageImpl#getDownButton()
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
	 * The number of structural features of the '<em>Down Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_FEATURE_COUNT = FLOOR_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Down Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_OPERATION_COUNT = FLOOR_BUTTON_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link elevator.impl.ElevatorSystemImpl <em>Elevator System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see elevator.impl.ElevatorSystemImpl
	 * @see elevator.impl.ModelPackageImpl#getElevatorSystem()
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
	 * The number of structural features of the '<em>Elevator System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Elevator System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link elevator.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see elevator.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for the reference '{@link elevator.Floor#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see elevator.Floor#getNext()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Next();

	/**
	 * Returns the meta object for the attribute '{@link elevator.Floor#getNr <em>Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr</em>'.
	 * @see elevator.Floor#getNr()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_Nr();

	/**
	 * Returns the meta object for the containment reference list '{@link elevator.Floor#getFloorButtons <em>Floor Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floor Buttons</em>'.
	 * @see elevator.Floor#getFloorButtons()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_FloorButtons();

	/**
	 * Returns the meta object for the reference '{@link elevator.Floor#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see elevator.Floor#getPrevious()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Previous();

	/**
	 * Returns the meta object for class '{@link elevator.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see elevator.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the reference '{@link elevator.Button#getRequestedFloor <em>Requested Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requested Floor</em>'.
	 * @see elevator.Button#getRequestedFloor()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_RequestedFloor();

	/**
	 * Returns the meta object for class '{@link elevator.Elevator <em>Elevator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator</em>'.
	 * @see elevator.Elevator
	 * @generated
	 */
	EClass getElevator();

	/**
	 * Returns the meta object for the containment reference list '{@link elevator.Elevator#getElevatorButtons <em>Elevator Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elevator Buttons</em>'.
	 * @see elevator.Elevator#getElevatorButtons()
	 * @see #getElevator()
	 * @generated
	 */
	EReference getElevator_ElevatorButtons();

	/**
	 * Returns the meta object for class '{@link elevator.ElevatorButton <em>Elevator Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Button</em>'.
	 * @see elevator.ElevatorButton
	 * @generated
	 */
	EClass getElevatorButton();

	/**
	 * Returns the meta object for class '{@link elevator.FloorButton <em>Floor Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Button</em>'.
	 * @see elevator.FloorButton
	 * @generated
	 */
	EClass getFloorButton();

	/**
	 * Returns the meta object for class '{@link elevator.UpButton <em>Up Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Up Button</em>'.
	 * @see elevator.UpButton
	 * @generated
	 */
	EClass getUpButton();

	/**
	 * Returns the meta object for class '{@link elevator.DownButton <em>Down Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Down Button</em>'.
	 * @see elevator.DownButton
	 * @generated
	 */
	EClass getDownButton();

	/**
	 * Returns the meta object for class '{@link elevator.ElevatorSystem <em>Elevator System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator System</em>'.
	 * @see elevator.ElevatorSystem
	 * @generated
	 */
	EClass getElevatorSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link elevator.ElevatorSystem#getElevators <em>Elevators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elevators</em>'.
	 * @see elevator.ElevatorSystem#getElevators()
	 * @see #getElevatorSystem()
	 * @generated
	 */
	EReference getElevatorSystem_Elevators();

	/**
	 * Returns the meta object for the containment reference list '{@link elevator.ElevatorSystem#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floors</em>'.
	 * @see elevator.ElevatorSystem#getFloors()
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
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link elevator.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elevator.impl.FloorImpl
		 * @see elevator.impl.ModelPackageImpl#getFloor()
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
		 * The meta object literal for the '{@link elevator.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elevator.impl.ButtonImpl
		 * @see elevator.impl.ModelPackageImpl#getButton()
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
		 * The meta object literal for the '{@link elevator.impl.ElevatorImpl <em>Elevator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elevator.impl.ElevatorImpl
		 * @see elevator.impl.ModelPackageImpl#getElevator()
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
		 * The meta object literal for the '{@link elevator.impl.ElevatorButtonImpl <em>Elevator Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elevator.impl.ElevatorButtonImpl
		 * @see elevator.impl.ModelPackageImpl#getElevatorButton()
		 * @generated
		 */
		EClass ELEVATOR_BUTTON = eINSTANCE.getElevatorButton();

		/**
		 * The meta object literal for the '{@link elevator.impl.FloorButtonImpl <em>Floor Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elevator.impl.FloorButtonImpl
		 * @see elevator.impl.ModelPackageImpl#getFloorButton()
		 * @generated
		 */
		EClass FLOOR_BUTTON = eINSTANCE.getFloorButton();

		/**
		 * The meta object literal for the '{@link elevator.impl.UpButtonImpl <em>Up Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elevator.impl.UpButtonImpl
		 * @see elevator.impl.ModelPackageImpl#getUpButton()
		 * @generated
		 */
		EClass UP_BUTTON = eINSTANCE.getUpButton();

		/**
		 * The meta object literal for the '{@link elevator.impl.DownButtonImpl <em>Down Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elevator.impl.DownButtonImpl
		 * @see elevator.impl.ModelPackageImpl#getDownButton()
		 * @generated
		 */
		EClass DOWN_BUTTON = eINSTANCE.getDownButton();

		/**
		 * The meta object literal for the '{@link elevator.impl.ElevatorSystemImpl <em>Elevator System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see elevator.impl.ElevatorSystemImpl
		 * @see elevator.impl.ModelPackageImpl#getElevatorSystem()
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

} //ModelPackage
