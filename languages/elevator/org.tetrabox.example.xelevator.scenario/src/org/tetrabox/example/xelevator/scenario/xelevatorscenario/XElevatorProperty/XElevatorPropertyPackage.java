/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;

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
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyFactory
 * @model kind="package"
 * @generated
 */
public interface XElevatorPropertyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XElevatorProperty";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.xelevator/scenario/XElevatorProperty/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XElevatorProperty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XElevatorPropertyPackage eINSTANCE = org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorStepPropertyImpl <em>XElevator Step Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorStepPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorStepProperty()
	 * @generated
	 */
	int XELEVATOR_STEP_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_STEP_PROPERTY__STEPPING = PropertyPackage.STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER = PropertyPackage.STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>XElevator Step Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_STEP_PROPERTY_FEATURE_COUNT = PropertyPackage.STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorOpenDoorUpPropertyImpl <em>Elevator Open Door Up Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorOpenDoorUpPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorOpenDoorUpProperty()
	 * @generated
	 */
	int ELEVATOR_OPEN_DOOR_UP_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPEN_DOOR_UP_PROPERTY__STEPPING = XELEVATOR_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPEN_DOOR_UP_PROPERTY__TARGET_PROVIDER = XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Elevator Open Door Up Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPEN_DOOR_UP_PROPERTY_FEATURE_COUNT = XELEVATOR_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorCloseDoorPropertyImpl <em>Elevator Close Door Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorCloseDoorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorCloseDoorProperty()
	 * @generated
	 */
	int ELEVATOR_CLOSE_DOOR_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CLOSE_DOOR_PROPERTY__STEPPING = XELEVATOR_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CLOSE_DOOR_PROPERTY__TARGET_PROVIDER = XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Elevator Close Door Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CLOSE_DOOR_PROPERTY_FEATURE_COUNT = XELEVATOR_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorMoveUpPropertyImpl <em>Elevator Move Up Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorMoveUpPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorMoveUpProperty()
	 * @generated
	 */
	int ELEVATOR_MOVE_UP_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_MOVE_UP_PROPERTY__STEPPING = XELEVATOR_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_MOVE_UP_PROPERTY__TARGET_PROVIDER = XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Elevator Move Up Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_MOVE_UP_PROPERTY_FEATURE_COUNT = XELEVATOR_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorChangeToUpPropertyImpl <em>Elevator Change To Up Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorChangeToUpPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorChangeToUpProperty()
	 * @generated
	 */
	int ELEVATOR_CHANGE_TO_UP_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CHANGE_TO_UP_PROPERTY__STEPPING = XELEVATOR_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CHANGE_TO_UP_PROPERTY__TARGET_PROVIDER = XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Elevator Change To Up Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CHANGE_TO_UP_PROPERTY_FEATURE_COUNT = XELEVATOR_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorOpenDoorDownPropertyImpl <em>Elevator Open Door Down Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorOpenDoorDownPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorOpenDoorDownProperty()
	 * @generated
	 */
	int ELEVATOR_OPEN_DOOR_DOWN_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPEN_DOOR_DOWN_PROPERTY__STEPPING = XELEVATOR_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPEN_DOOR_DOWN_PROPERTY__TARGET_PROVIDER = XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Elevator Open Door Down Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPEN_DOOR_DOWN_PROPERTY_FEATURE_COUNT = XELEVATOR_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorMoveDownPropertyImpl <em>Elevator Move Down Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorMoveDownPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorMoveDownProperty()
	 * @generated
	 */
	int ELEVATOR_MOVE_DOWN_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_MOVE_DOWN_PROPERTY__STEPPING = XELEVATOR_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_MOVE_DOWN_PROPERTY__TARGET_PROVIDER = XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Elevator Move Down Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_MOVE_DOWN_PROPERTY_FEATURE_COUNT = XELEVATOR_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorChangeToDownPropertyImpl <em>Elevator Change To Down Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorChangeToDownPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorChangeToDownProperty()
	 * @generated
	 */
	int ELEVATOR_CHANGE_TO_DOWN_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CHANGE_TO_DOWN_PROPERTY__STEPPING = XELEVATOR_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CHANGE_TO_DOWN_PROPERTY__TARGET_PROVIDER = XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Elevator Change To Down Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CHANGE_TO_DOWN_PROPERTY_FEATURE_COUNT = XELEVATOR_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPressPropertyImpl <em>Button Press Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPressPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonPressProperty()
	 * @generated
	 */
	int BUTTON_PRESS_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESS_PROPERTY__STEPPING = XELEVATOR_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESS_PROPERTY__TARGET_PROVIDER = XELEVATOR_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Button Press Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESS_PROPERTY_FEATURE_COUNT = XELEVATOR_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorAbstractPropertyImpl <em>XElevator Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorAbstractPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorAbstractProperty()
	 * @generated
	 */
	int XELEVATOR_ABSTRACT_PROPERTY = 8;

	/**
	 * The number of structural features of the '<em>XElevator Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_ABSTRACT_PROPERTY_FEATURE_COUNT = PropertyPackage.ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorTemporalPropertyImpl <em>XElevator Temporal Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorTemporalPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorTemporalProperty()
	 * @generated
	 */
	int XELEVATOR_TEMPORAL_PROPERTY = 9;

	/**
	 * The number of structural features of the '<em>XElevator Temporal Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_TEMPORAL_PROPERTY_FEATURE_COUNT = PropertyPackage.TEMPORAL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyImpl <em>XElevator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorProperty()
	 * @generated
	 */
	int XELEVATOR_PROPERTY = 10;

	/**
	 * The number of structural features of the '<em>XElevator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_PROPERTY_FEATURE_COUNT = PropertyPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorStatePropertyImpl <em>XElevator State Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorStatePropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorStateProperty()
	 * @generated
	 */
	int XELEVATOR_STATE_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_STATE_PROPERTY__TARGET = PropertyPackage.STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>XElevator State Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_STATE_PROPERTY_FEATURE_COUNT = PropertyPackage.STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorPropertyImpl <em>Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorProperty()
	 * @generated
	 */
	int FLOOR_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_PROPERTY__TARGET = XELEVATOR_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_PROPERTY_FEATURE_COUNT = XELEVATOR_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryFloorPropertyImpl <em>Unary Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryFloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryFloorProperty()
	 * @generated
	 */
	int UNARY_FLOOR_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOOR_PROPERTY__TARGET = FLOOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOOR_PROPERTY__OPERATOR = FLOOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOOR_PROPERTY__PROPERTY = FLOOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOOR_PROPERTY_FEATURE_COUNT = FLOOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryFloorPropertyImpl <em>Binary Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryFloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryFloorProperty()
	 * @generated
	 */
	int BINARY_FLOOR_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_PROPERTY__TARGET = FLOOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_PROPERTY__OPERATOR = FLOOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_PROPERTY__LEFT = FLOOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_PROPERTY__RIGHT = FLOOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_PROPERTY_FEATURE_COUNT = FLOOR_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorNextPropertyImpl <em>Floor Next Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorNextPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorNextProperty()
	 * @generated
	 */
	int FLOOR_NEXT_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_NEXT_PROPERTY__TARGET = FLOOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_NEXT_PROPERTY__PROPERTY = FLOOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floor Next Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_NEXT_PROPERTY_FEATURE_COUNT = FLOOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorNrPropertyImpl <em>Floor Nr Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorNrPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorNrProperty()
	 * @generated
	 */
	int FLOOR_NR_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_NR_PROPERTY__TARGET = FLOOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_NR_PROPERTY__VALUE = FLOOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_NR_PROPERTY__OPERATOR = FLOOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floor Nr Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_NR_PROPERTY_FEATURE_COUNT = FLOOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPropertyImpl <em>Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonProperty()
	 * @generated
	 */
	int BUTTON_PROPERTY = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PROPERTY__TARGET = XELEVATOR_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PROPERTY_FEATURE_COUNT = XELEVATOR_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonContainerPropertyImpl <em>Button Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonContainerPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonContainerProperty()
	 * @generated
	 */
	int BUTTON_CONTAINER_PROPERTY = 18;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CONTAINER_PROPERTY__TARGET = BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CONTAINER_PROPERTY__PROPERTY = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CONTAINER_PROPERTY_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryButtonPropertyImpl <em>Unary Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryButtonProperty()
	 * @generated
	 */
	int UNARY_BUTTON_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BUTTON_PROPERTY__TARGET = BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BUTTON_PROPERTY__OPERATOR = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BUTTON_PROPERTY__PROPERTY = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BUTTON_PROPERTY_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryButtonPropertyImpl <em>Binary Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryButtonProperty()
	 * @generated
	 */
	int BINARY_BUTTON_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BUTTON_PROPERTY__TARGET = BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BUTTON_PROPERTY__OPERATOR = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BUTTON_PROPERTY__LEFT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BUTTON_PROPERTY__RIGHT = BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BUTTON_PROPERTY_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonRequestedFloorPropertyImpl <em>Button Requested Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonRequestedFloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonRequestedFloorProperty()
	 * @generated
	 */
	int BUTTON_REQUESTED_FLOOR_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_REQUESTED_FLOOR_PROPERTY__TARGET = BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_REQUESTED_FLOOR_PROPERTY__PROPERTY = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Requested Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_REQUESTED_FLOOR_PROPERTY_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPressedPropertyImpl <em>Button Pressed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPressedPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonPressedProperty()
	 * @generated
	 */
	int BUTTON_PRESSED_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESSED_PROPERTY__TARGET = BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESSED_PROPERTY__VALUE = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESSED_PROPERTY__OPERATOR = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button Pressed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PRESSED_PROPERTY_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorFloorButtonsPropertyImpl <em>Floor Floor Buttons Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorFloorButtonsPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorFloorButtonsProperty()
	 * @generated
	 */
	int FLOOR_FLOOR_BUTTONS_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FLOOR_BUTTONS_PROPERTY__TARGET = FLOOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FLOOR_BUTTONS_PROPERTY__PROPERTY = FLOOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FLOOR_BUTTONS_PROPERTY__QUANTIFIER = FLOOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floor Floor Buttons Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FLOOR_BUTTONS_PROPERTY_FEATURE_COUNT = FLOOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorPreviousPropertyImpl <em>Floor Previous Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorPreviousPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorPreviousProperty()
	 * @generated
	 */
	int FLOOR_PREVIOUS_PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_PREVIOUS_PROPERTY__TARGET = FLOOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_PREVIOUS_PROPERTY__PROPERTY = FLOOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floor Previous Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_PREVIOUS_PROPERTY_FEATURE_COUNT = FLOOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorPropertyImpl <em>Elevator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorProperty()
	 * @generated
	 */
	int ELEVATOR_PROPERTY = 26;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_PROPERTY__TARGET = XELEVATOR_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Elevator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_PROPERTY_FEATURE_COUNT = XELEVATOR_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorPropertyImpl <em>Unary Elevator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryElevatorProperty()
	 * @generated
	 */
	int UNARY_ELEVATOR_PROPERTY = 27;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_PROPERTY__TARGET = ELEVATOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_PROPERTY__OPERATOR = ELEVATOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_PROPERTY__PROPERTY = ELEVATOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Elevator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_PROPERTY_FEATURE_COUNT = ELEVATOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorPropertyImpl <em>Binary Elevator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryElevatorProperty()
	 * @generated
	 */
	int BINARY_ELEVATOR_PROPERTY = 28;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_PROPERTY__TARGET = ELEVATOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_PROPERTY__OPERATOR = ELEVATOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_PROPERTY__LEFT = ELEVATOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_PROPERTY__RIGHT = ELEVATOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Elevator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_PROPERTY_FEATURE_COUNT = ELEVATOR_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonPropertyImpl <em>Elevator Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorButtonProperty()
	 * @generated
	 */
	int ELEVATOR_BUTTON_PROPERTY = 30;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_PROPERTY__TARGET = BUTTON_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Elevator Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonContainerPropertyImpl <em>Elevator Button Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonContainerPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorButtonContainerProperty()
	 * @generated
	 */
	int ELEVATOR_BUTTON_CONTAINER_PROPERTY = 29;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_CONTAINER_PROPERTY__TARGET = ELEVATOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_CONTAINER_PROPERTY__PROPERTY = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elevator Button Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_CONTAINER_PROPERTY_FEATURE_COUNT = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorButtonPropertyImpl <em>Unary Elevator Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryElevatorButtonProperty()
	 * @generated
	 */
	int UNARY_ELEVATOR_BUTTON_PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_BUTTON_PROPERTY__TARGET = ELEVATOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_BUTTON_PROPERTY__OPERATOR = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_BUTTON_PROPERTY__PROPERTY = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Elevator Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorButtonPropertyImpl <em>Binary Elevator Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryElevatorButtonProperty()
	 * @generated
	 */
	int BINARY_ELEVATOR_BUTTON_PROPERTY = 32;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_BUTTON_PROPERTY__TARGET = ELEVATOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_BUTTON_PROPERTY__OPERATOR = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_BUTTON_PROPERTY__LEFT = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_BUTTON_PROPERTY__RIGHT = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Elevator Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonRequestedFloorPropertyImpl <em>Elevator Button Requested Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonRequestedFloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorButtonRequestedFloorProperty()
	 * @generated
	 */
	int ELEVATOR_BUTTON_REQUESTED_FLOOR_PROPERTY = 33;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_REQUESTED_FLOOR_PROPERTY__TARGET = ELEVATOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_REQUESTED_FLOOR_PROPERTY__PROPERTY = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elevator Button Requested Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_REQUESTED_FLOOR_PROPERTY_FEATURE_COUNT = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonPressedPropertyImpl <em>Elevator Button Pressed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonPressedPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorButtonPressedProperty()
	 * @generated
	 */
	int ELEVATOR_BUTTON_PRESSED_PROPERTY = 34;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_PRESSED_PROPERTY__TARGET = ELEVATOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_PRESSED_PROPERTY__VALUE = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_PRESSED_PROPERTY__OPERATOR = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elevator Button Pressed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_BUTTON_PRESSED_PROPERTY_FEATURE_COUNT = ELEVATOR_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorElevatorButtonsPropertyImpl <em>Elevator Elevator Buttons Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorElevatorButtonsPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorElevatorButtonsProperty()
	 * @generated
	 */
	int ELEVATOR_ELEVATOR_BUTTONS_PROPERTY = 35;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_ELEVATOR_BUTTONS_PROPERTY__TARGET = ELEVATOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_ELEVATOR_BUTTONS_PROPERTY__PROPERTY = ELEVATOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_ELEVATOR_BUTTONS_PROPERTY__QUANTIFIER = ELEVATOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elevator Elevator Buttons Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_ELEVATOR_BUTTONS_PROPERTY_FEATURE_COUNT = ELEVATOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorDoorsOpenPropertyImpl <em>Elevator Doors Open Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorDoorsOpenPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorDoorsOpenProperty()
	 * @generated
	 */
	int ELEVATOR_DOORS_OPEN_PROPERTY = 36;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_DOORS_OPEN_PROPERTY__TARGET = ELEVATOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_DOORS_OPEN_PROPERTY__VALUE = ELEVATOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_DOORS_OPEN_PROPERTY__OPERATOR = ELEVATOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elevator Doors Open Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_DOORS_OPEN_PROPERTY_FEATURE_COUNT = ELEVATOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorGoingUpPropertyImpl <em>Elevator Going Up Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorGoingUpPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorGoingUpProperty()
	 * @generated
	 */
	int ELEVATOR_GOING_UP_PROPERTY = 37;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_GOING_UP_PROPERTY__TARGET = ELEVATOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_GOING_UP_PROPERTY__VALUE = ELEVATOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_GOING_UP_PROPERTY__OPERATOR = ELEVATOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elevator Going Up Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_GOING_UP_PROPERTY_FEATURE_COUNT = ELEVATOR_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorCurrentFloorPropertyImpl <em>Elevator Current Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorCurrentFloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorCurrentFloorProperty()
	 * @generated
	 */
	int ELEVATOR_CURRENT_FLOOR_PROPERTY = 38;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CURRENT_FLOOR_PROPERTY__TARGET = ELEVATOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CURRENT_FLOOR_PROPERTY__PROPERTY = ELEVATOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elevator Current Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CURRENT_FLOOR_PROPERTY_FEATURE_COUNT = ELEVATOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonPropertyImpl <em>Floor Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorButtonProperty()
	 * @generated
	 */
	int FLOOR_BUTTON_PROPERTY = 39;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_PROPERTY__TARGET = BUTTON_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Floor Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_PROPERTY_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryFloorButtonPropertyImpl <em>Unary Floor Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryFloorButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryFloorButtonProperty()
	 * @generated
	 */
	int UNARY_FLOOR_BUTTON_PROPERTY = 40;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOOR_BUTTON_PROPERTY__TARGET = FLOOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOOR_BUTTON_PROPERTY__OPERATOR = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOOR_BUTTON_PROPERTY__PROPERTY = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Floor Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOOR_BUTTON_PROPERTY_FEATURE_COUNT = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryFloorButtonPropertyImpl <em>Binary Floor Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryFloorButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryFloorButtonProperty()
	 * @generated
	 */
	int BINARY_FLOOR_BUTTON_PROPERTY = 41;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_BUTTON_PROPERTY__TARGET = FLOOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_BUTTON_PROPERTY__OPERATOR = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_BUTTON_PROPERTY__LEFT = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_BUTTON_PROPERTY__RIGHT = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Floor Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOOR_BUTTON_PROPERTY_FEATURE_COUNT = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonRequestedFloorPropertyImpl <em>Floor Button Requested Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonRequestedFloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorButtonRequestedFloorProperty()
	 * @generated
	 */
	int FLOOR_BUTTON_REQUESTED_FLOOR_PROPERTY = 42;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_REQUESTED_FLOOR_PROPERTY__TARGET = FLOOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_REQUESTED_FLOOR_PROPERTY__PROPERTY = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floor Button Requested Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_REQUESTED_FLOOR_PROPERTY_FEATURE_COUNT = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonPressedPropertyImpl <em>Floor Button Pressed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonPressedPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorButtonPressedProperty()
	 * @generated
	 */
	int FLOOR_BUTTON_PRESSED_PROPERTY = 43;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_PRESSED_PROPERTY__TARGET = FLOOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_PRESSED_PROPERTY__VALUE = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_PRESSED_PROPERTY__OPERATOR = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floor Button Pressed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_BUTTON_PRESSED_PROPERTY_FEATURE_COUNT = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonPropertyImpl <em>Up Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUpButtonProperty()
	 * @generated
	 */
	int UP_BUTTON_PROPERTY = 44;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_PROPERTY__TARGET = FLOOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Up Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_PROPERTY_FEATURE_COUNT = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryUpButtonPropertyImpl <em>Unary Up Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryUpButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryUpButtonProperty()
	 * @generated
	 */
	int UNARY_UP_BUTTON_PROPERTY = 45;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_UP_BUTTON_PROPERTY__TARGET = UP_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_UP_BUTTON_PROPERTY__OPERATOR = UP_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_UP_BUTTON_PROPERTY__PROPERTY = UP_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Up Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_UP_BUTTON_PROPERTY_FEATURE_COUNT = UP_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryUpButtonPropertyImpl <em>Binary Up Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryUpButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryUpButtonProperty()
	 * @generated
	 */
	int BINARY_UP_BUTTON_PROPERTY = 46;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_UP_BUTTON_PROPERTY__TARGET = UP_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_UP_BUTTON_PROPERTY__OPERATOR = UP_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_UP_BUTTON_PROPERTY__LEFT = UP_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_UP_BUTTON_PROPERTY__RIGHT = UP_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Up Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_UP_BUTTON_PROPERTY_FEATURE_COUNT = UP_BUTTON_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonRequestedFloorPropertyImpl <em>Up Button Requested Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonRequestedFloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUpButtonRequestedFloorProperty()
	 * @generated
	 */
	int UP_BUTTON_REQUESTED_FLOOR_PROPERTY = 47;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_REQUESTED_FLOOR_PROPERTY__TARGET = UP_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_REQUESTED_FLOOR_PROPERTY__PROPERTY = UP_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Up Button Requested Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_REQUESTED_FLOOR_PROPERTY_FEATURE_COUNT = UP_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonPressedPropertyImpl <em>Up Button Pressed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonPressedPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUpButtonPressedProperty()
	 * @generated
	 */
	int UP_BUTTON_PRESSED_PROPERTY = 48;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_PRESSED_PROPERTY__TARGET = UP_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_PRESSED_PROPERTY__VALUE = UP_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_PRESSED_PROPERTY__OPERATOR = UP_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Up Button Pressed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_BUTTON_PRESSED_PROPERTY_FEATURE_COUNT = UP_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonPropertyImpl <em>Down Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getDownButtonProperty()
	 * @generated
	 */
	int DOWN_BUTTON_PROPERTY = 49;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_PROPERTY__TARGET = FLOOR_BUTTON_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Down Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_PROPERTY_FEATURE_COUNT = FLOOR_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryDownButtonPropertyImpl <em>Unary Down Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryDownButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryDownButtonProperty()
	 * @generated
	 */
	int UNARY_DOWN_BUTTON_PROPERTY = 50;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DOWN_BUTTON_PROPERTY__TARGET = DOWN_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DOWN_BUTTON_PROPERTY__OPERATOR = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DOWN_BUTTON_PROPERTY__PROPERTY = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Down Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DOWN_BUTTON_PROPERTY_FEATURE_COUNT = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryDownButtonPropertyImpl <em>Binary Down Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryDownButtonPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryDownButtonProperty()
	 * @generated
	 */
	int BINARY_DOWN_BUTTON_PROPERTY = 51;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DOWN_BUTTON_PROPERTY__TARGET = DOWN_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DOWN_BUTTON_PROPERTY__OPERATOR = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DOWN_BUTTON_PROPERTY__LEFT = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DOWN_BUTTON_PROPERTY__RIGHT = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Down Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DOWN_BUTTON_PROPERTY_FEATURE_COUNT = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonRequestedFloorPropertyImpl <em>Down Button Requested Floor Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonRequestedFloorPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getDownButtonRequestedFloorProperty()
	 * @generated
	 */
	int DOWN_BUTTON_REQUESTED_FLOOR_PROPERTY = 52;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_REQUESTED_FLOOR_PROPERTY__TARGET = DOWN_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_REQUESTED_FLOOR_PROPERTY__PROPERTY = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Down Button Requested Floor Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_REQUESTED_FLOOR_PROPERTY_FEATURE_COUNT = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonPressedPropertyImpl <em>Down Button Pressed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonPressedPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getDownButtonPressedProperty()
	 * @generated
	 */
	int DOWN_BUTTON_PRESSED_PROPERTY = 53;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_PRESSED_PROPERTY__TARGET = DOWN_BUTTON_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_PRESSED_PROPERTY__VALUE = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_PRESSED_PROPERTY__OPERATOR = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Down Button Pressed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_BUTTON_PRESSED_PROPERTY_FEATURE_COUNT = DOWN_BUTTON_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemPropertyImpl <em>Elevator System Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorSystemProperty()
	 * @generated
	 */
	int ELEVATOR_SYSTEM_PROPERTY = 54;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_PROPERTY__TARGET = XELEVATOR_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Elevator System Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT = XELEVATOR_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorSystemPropertyImpl <em>Unary Elevator System Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorSystemPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryElevatorSystemProperty()
	 * @generated
	 */
	int UNARY_ELEVATOR_SYSTEM_PROPERTY = 55;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_SYSTEM_PROPERTY__TARGET = ELEVATOR_SYSTEM_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_SYSTEM_PROPERTY__OPERATOR = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_SYSTEM_PROPERTY__PROPERTY = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Elevator System Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorSystemPropertyImpl <em>Binary Elevator System Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorSystemPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryElevatorSystemProperty()
	 * @generated
	 */
	int BINARY_ELEVATOR_SYSTEM_PROPERTY = 56;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_SYSTEM_PROPERTY__TARGET = ELEVATOR_SYSTEM_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_SYSTEM_PROPERTY__OPERATOR = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_SYSTEM_PROPERTY__LEFT = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_SYSTEM_PROPERTY__RIGHT = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Elevator System Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorContainerPropertyImpl <em>Elevator Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorContainerPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorContainerProperty()
	 * @generated
	 */
	int ELEVATOR_CONTAINER_PROPERTY = 57;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CONTAINER_PROPERTY__TARGET = ELEVATOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CONTAINER_PROPERTY__PROPERTY = ELEVATOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elevator Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_CONTAINER_PROPERTY_FEATURE_COUNT = ELEVATOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemElevatorsPropertyImpl <em>Elevator System Elevators Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemElevatorsPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorSystemElevatorsProperty()
	 * @generated
	 */
	int ELEVATOR_SYSTEM_ELEVATORS_PROPERTY = 58;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_ELEVATORS_PROPERTY__TARGET = ELEVATOR_SYSTEM_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_ELEVATORS_PROPERTY__PROPERTY = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_ELEVATORS_PROPERTY__QUANTIFIER = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elevator System Elevators Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_ELEVATORS_PROPERTY_FEATURE_COUNT = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorContainerPropertyImpl <em>Floor Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorContainerPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorContainerProperty()
	 * @generated
	 */
	int FLOOR_CONTAINER_PROPERTY = 59;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_CONTAINER_PROPERTY__TARGET = FLOOR_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_CONTAINER_PROPERTY__PROPERTY = FLOOR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floor Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_CONTAINER_PROPERTY_FEATURE_COUNT = FLOOR_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemFloorsPropertyImpl <em>Elevator System Floors Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemFloorsPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorSystemFloorsProperty()
	 * @generated
	 */
	int ELEVATOR_SYSTEM_FLOORS_PROPERTY = 60;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_FLOORS_PROPERTY__TARGET = ELEVATOR_SYSTEM_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_FLOORS_PROPERTY__PROPERTY = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_FLOORS_PROPERTY__QUANTIFIER = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elevator System Floors Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_SYSTEM_FLOORS_PROPERTY_FEATURE_COUNT = ELEVATOR_SYSTEM_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorNextPropertyImpl <em>XElevator Next Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorNextPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorNextProperty()
	 * @generated
	 */
	int XELEVATOR_NEXT_PROPERTY = 61;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_NEXT_PROPERTY__FORMULA = PropertyPackage.NEXT_PROPERTY__FORMULA;

	/**
	 * The number of structural features of the '<em>XElevator Next Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_NEXT_PROPERTY_FEATURE_COUNT = PropertyPackage.NEXT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorUntilPropertyImpl <em>XElevator Until Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorUntilPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorUntilProperty()
	 * @generated
	 */
	int XELEVATOR_UNTIL_PROPERTY = 62;

	/**
	 * The feature id for the '<em><b>Left Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_UNTIL_PROPERTY__LEFT_FORMULA = PropertyPackage.UNTIL_PROPERTY__LEFT_FORMULA;

	/**
	 * The feature id for the '<em><b>Right Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_UNTIL_PROPERTY__RIGHT_FORMULA = PropertyPackage.UNTIL_PROPERTY__RIGHT_FORMULA;

	/**
	 * The number of structural features of the '<em>XElevator Until Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_UNTIL_PROPERTY_FEATURE_COUNT = PropertyPackage.UNTIL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorReleasePropertyImpl <em>XElevator Release Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorReleasePropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorReleaseProperty()
	 * @generated
	 */
	int XELEVATOR_RELEASE_PROPERTY = 63;

	/**
	 * The feature id for the '<em><b>Left Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_RELEASE_PROPERTY__LEFT_FORMULA = PropertyPackage.RELEASE_PROPERTY__LEFT_FORMULA;

	/**
	 * The feature id for the '<em><b>Right Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_RELEASE_PROPERTY__RIGHT_FORMULA = PropertyPackage.RELEASE_PROPERTY__RIGHT_FORMULA;

	/**
	 * The number of structural features of the '<em>XElevator Release Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_RELEASE_PROPERTY_FEATURE_COUNT = PropertyPackage.RELEASE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorNegationTemporalPropertyImpl <em>XElevator Negation Temporal Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorNegationTemporalPropertyImpl
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorNegationTemporalProperty()
	 * @generated
	 */
	int XELEVATOR_NEGATION_TEMPORAL_PROPERTY = 64;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_NEGATION_TEMPORAL_PROPERTY__FORMULA = PropertyPackage.NEGATION_TEMPORAL_PROPERTY__FORMULA;

	/**
	 * The number of structural features of the '<em>XElevator Negation Temporal Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XELEVATOR_NEGATION_TEMPORAL_PROPERTY_FEATURE_COUNT = PropertyPackage.NEGATION_TEMPORAL_PROPERTY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorUpProperty <em>Elevator Open Door Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Open Door Up Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorUpProperty
	 * @generated
	 */
	EClass getElevatorOpenDoorUpProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCloseDoorProperty <em>Elevator Close Door Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Close Door Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCloseDoorProperty
	 * @generated
	 */
	EClass getElevatorCloseDoorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveUpProperty <em>Elevator Move Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Move Up Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveUpProperty
	 * @generated
	 */
	EClass getElevatorMoveUpProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToUpProperty <em>Elevator Change To Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Change To Up Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToUpProperty
	 * @generated
	 */
	EClass getElevatorChangeToUpProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorDownProperty <em>Elevator Open Door Down Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Open Door Down Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorDownProperty
	 * @generated
	 */
	EClass getElevatorOpenDoorDownProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveDownProperty <em>Elevator Move Down Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Move Down Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveDownProperty
	 * @generated
	 */
	EClass getElevatorMoveDownProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToDownProperty <em>Elevator Change To Down Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Change To Down Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorChangeToDownProperty
	 * @generated
	 */
	EClass getElevatorChangeToDownProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressProperty <em>Button Press Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Press Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressProperty
	 * @generated
	 */
	EClass getButtonPressProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorAbstractProperty <em>XElevator Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Abstract Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorAbstractProperty
	 * @generated
	 */
	EClass getXElevatorAbstractProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorTemporalProperty <em>XElevator Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Temporal Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorTemporalProperty
	 * @generated
	 */
	EClass getXElevatorTemporalProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty <em>XElevator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty
	 * @generated
	 */
	EClass getXElevatorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStateProperty <em>XElevator State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator State Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStateProperty
	 * @generated
	 */
	EClass getXElevatorStateProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStepProperty <em>XElevator Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Step Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStepProperty
	 * @generated
	 */
	EClass getXElevatorStepProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorProperty <em>Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorProperty
	 * @generated
	 */
	EClass getFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorProperty <em>Unary Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorProperty
	 * @generated
	 */
	EClass getUnaryFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorProperty <em>Binary Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorProperty
	 * @generated
	 */
	EClass getBinaryFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNextProperty <em>Floor Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Next Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNextProperty
	 * @generated
	 */
	EClass getFloorNextProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNrProperty <em>Floor Nr Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Nr Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorNrProperty
	 * @generated
	 */
	EClass getFloorNrProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonContainerProperty <em>Button Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Container Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonContainerProperty
	 * @generated
	 */
	EClass getButtonContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonProperty <em>Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonProperty
	 * @generated
	 */
	EClass getButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryButtonProperty <em>Unary Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryButtonProperty
	 * @generated
	 */
	EClass getUnaryButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryButtonProperty <em>Binary Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryButtonProperty
	 * @generated
	 */
	EClass getBinaryButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonRequestedFloorProperty <em>Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Requested Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonRequestedFloorProperty
	 * @generated
	 */
	EClass getButtonRequestedFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressedProperty <em>Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Pressed Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressedProperty
	 * @generated
	 */
	EClass getButtonPressedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorFloorButtonsProperty <em>Floor Floor Buttons Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Floor Buttons Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorFloorButtonsProperty
	 * @generated
	 */
	EClass getFloorFloorButtonsProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorPreviousProperty <em>Floor Previous Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Previous Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorPreviousProperty
	 * @generated
	 */
	EClass getFloorPreviousProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorProperty <em>Elevator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorProperty
	 * @generated
	 */
	EClass getElevatorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorProperty <em>Unary Elevator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Elevator Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorProperty
	 * @generated
	 */
	EClass getUnaryElevatorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorProperty <em>Binary Elevator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Elevator Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorProperty
	 * @generated
	 */
	EClass getBinaryElevatorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonContainerProperty <em>Elevator Button Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Button Container Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonContainerProperty
	 * @generated
	 */
	EClass getElevatorButtonContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonProperty <em>Elevator Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonProperty
	 * @generated
	 */
	EClass getElevatorButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorButtonProperty <em>Unary Elevator Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Elevator Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorButtonProperty
	 * @generated
	 */
	EClass getUnaryElevatorButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorButtonProperty <em>Binary Elevator Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Elevator Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorButtonProperty
	 * @generated
	 */
	EClass getBinaryElevatorButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonRequestedFloorProperty <em>Elevator Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Button Requested Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonRequestedFloorProperty
	 * @generated
	 */
	EClass getElevatorButtonRequestedFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonPressedProperty <em>Elevator Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Button Pressed Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorButtonPressedProperty
	 * @generated
	 */
	EClass getElevatorButtonPressedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorElevatorButtonsProperty <em>Elevator Elevator Buttons Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Elevator Buttons Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorElevatorButtonsProperty
	 * @generated
	 */
	EClass getElevatorElevatorButtonsProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorDoorsOpenProperty <em>Elevator Doors Open Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Doors Open Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorDoorsOpenProperty
	 * @generated
	 */
	EClass getElevatorDoorsOpenProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorGoingUpProperty <em>Elevator Going Up Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Going Up Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorGoingUpProperty
	 * @generated
	 */
	EClass getElevatorGoingUpProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCurrentFloorProperty <em>Elevator Current Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Current Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorCurrentFloorProperty
	 * @generated
	 */
	EClass getElevatorCurrentFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonProperty <em>Floor Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonProperty
	 * @generated
	 */
	EClass getFloorButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorButtonProperty <em>Unary Floor Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Floor Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryFloorButtonProperty
	 * @generated
	 */
	EClass getUnaryFloorButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorButtonProperty <em>Binary Floor Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Floor Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryFloorButtonProperty
	 * @generated
	 */
	EClass getBinaryFloorButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonRequestedFloorProperty <em>Floor Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Button Requested Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonRequestedFloorProperty
	 * @generated
	 */
	EClass getFloorButtonRequestedFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonPressedProperty <em>Floor Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Button Pressed Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonPressedProperty
	 * @generated
	 */
	EClass getFloorButtonPressedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonProperty <em>Up Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Up Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonProperty
	 * @generated
	 */
	EClass getUpButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryUpButtonProperty <em>Unary Up Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Up Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryUpButtonProperty
	 * @generated
	 */
	EClass getUnaryUpButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryUpButtonProperty <em>Binary Up Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Up Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryUpButtonProperty
	 * @generated
	 */
	EClass getBinaryUpButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonRequestedFloorProperty <em>Up Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Up Button Requested Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonRequestedFloorProperty
	 * @generated
	 */
	EClass getUpButtonRequestedFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonPressedProperty <em>Up Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Up Button Pressed Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonPressedProperty
	 * @generated
	 */
	EClass getUpButtonPressedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonProperty <em>Down Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Down Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonProperty
	 * @generated
	 */
	EClass getDownButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryDownButtonProperty <em>Unary Down Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Down Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryDownButtonProperty
	 * @generated
	 */
	EClass getUnaryDownButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryDownButtonProperty <em>Binary Down Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Down Button Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryDownButtonProperty
	 * @generated
	 */
	EClass getBinaryDownButtonProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonRequestedFloorProperty <em>Down Button Requested Floor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Down Button Requested Floor Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonRequestedFloorProperty
	 * @generated
	 */
	EClass getDownButtonRequestedFloorProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonPressedProperty <em>Down Button Pressed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Down Button Pressed Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonPressedProperty
	 * @generated
	 */
	EClass getDownButtonPressedProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemProperty <em>Elevator System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator System Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemProperty
	 * @generated
	 */
	EClass getElevatorSystemProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorSystemProperty <em>Unary Elevator System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Elevator System Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UnaryElevatorSystemProperty
	 * @generated
	 */
	EClass getUnaryElevatorSystemProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorSystemProperty <em>Binary Elevator System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Elevator System Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.BinaryElevatorSystemProperty
	 * @generated
	 */
	EClass getBinaryElevatorSystemProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorContainerProperty <em>Elevator Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator Container Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorContainerProperty
	 * @generated
	 */
	EClass getElevatorContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemElevatorsProperty <em>Elevator System Elevators Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator System Elevators Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemElevatorsProperty
	 * @generated
	 */
	EClass getElevatorSystemElevatorsProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorContainerProperty <em>Floor Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Container Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorContainerProperty
	 * @generated
	 */
	EClass getFloorContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemFloorsProperty <em>Elevator System Floors Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator System Floors Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorSystemFloorsProperty
	 * @generated
	 */
	EClass getElevatorSystemFloorsProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNextProperty <em>XElevator Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Next Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNextProperty
	 * @generated
	 */
	EClass getXElevatorNextProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorUntilProperty <em>XElevator Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Until Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorUntilProperty
	 * @generated
	 */
	EClass getXElevatorUntilProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorReleaseProperty <em>XElevator Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Release Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorReleaseProperty
	 * @generated
	 */
	EClass getXElevatorReleaseProperty();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNegationTemporalProperty <em>XElevator Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XElevator Negation Temporal Property</em>'.
	 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNegationTemporalProperty
	 * @generated
	 */
	EClass getXElevatorNegationTemporalProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XElevatorPropertyFactory getXElevatorPropertyFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorOpenDoorUpPropertyImpl <em>Elevator Open Door Up Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorOpenDoorUpPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorOpenDoorUpProperty()
		 * @generated
		 */
		EClass ELEVATOR_OPEN_DOOR_UP_PROPERTY = eINSTANCE.getElevatorOpenDoorUpProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorCloseDoorPropertyImpl <em>Elevator Close Door Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorCloseDoorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorCloseDoorProperty()
		 * @generated
		 */
		EClass ELEVATOR_CLOSE_DOOR_PROPERTY = eINSTANCE.getElevatorCloseDoorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorMoveUpPropertyImpl <em>Elevator Move Up Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorMoveUpPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorMoveUpProperty()
		 * @generated
		 */
		EClass ELEVATOR_MOVE_UP_PROPERTY = eINSTANCE.getElevatorMoveUpProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorChangeToUpPropertyImpl <em>Elevator Change To Up Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorChangeToUpPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorChangeToUpProperty()
		 * @generated
		 */
		EClass ELEVATOR_CHANGE_TO_UP_PROPERTY = eINSTANCE.getElevatorChangeToUpProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorOpenDoorDownPropertyImpl <em>Elevator Open Door Down Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorOpenDoorDownPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorOpenDoorDownProperty()
		 * @generated
		 */
		EClass ELEVATOR_OPEN_DOOR_DOWN_PROPERTY = eINSTANCE.getElevatorOpenDoorDownProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorMoveDownPropertyImpl <em>Elevator Move Down Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorMoveDownPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorMoveDownProperty()
		 * @generated
		 */
		EClass ELEVATOR_MOVE_DOWN_PROPERTY = eINSTANCE.getElevatorMoveDownProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorChangeToDownPropertyImpl <em>Elevator Change To Down Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorChangeToDownPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorChangeToDownProperty()
		 * @generated
		 */
		EClass ELEVATOR_CHANGE_TO_DOWN_PROPERTY = eINSTANCE.getElevatorChangeToDownProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPressPropertyImpl <em>Button Press Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPressPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonPressProperty()
		 * @generated
		 */
		EClass BUTTON_PRESS_PROPERTY = eINSTANCE.getButtonPressProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorAbstractPropertyImpl <em>XElevator Abstract Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorAbstractPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorAbstractProperty()
		 * @generated
		 */
		EClass XELEVATOR_ABSTRACT_PROPERTY = eINSTANCE.getXElevatorAbstractProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorTemporalPropertyImpl <em>XElevator Temporal Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorTemporalPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorTemporalProperty()
		 * @generated
		 */
		EClass XELEVATOR_TEMPORAL_PROPERTY = eINSTANCE.getXElevatorTemporalProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyImpl <em>XElevator Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorProperty()
		 * @generated
		 */
		EClass XELEVATOR_PROPERTY = eINSTANCE.getXElevatorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorStatePropertyImpl <em>XElevator State Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorStatePropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorStateProperty()
		 * @generated
		 */
		EClass XELEVATOR_STATE_PROPERTY = eINSTANCE.getXElevatorStateProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorStepPropertyImpl <em>XElevator Step Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorStepPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorStepProperty()
		 * @generated
		 */
		EClass XELEVATOR_STEP_PROPERTY = eINSTANCE.getXElevatorStepProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorPropertyImpl <em>Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorProperty()
		 * @generated
		 */
		EClass FLOOR_PROPERTY = eINSTANCE.getFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryFloorPropertyImpl <em>Unary Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryFloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryFloorProperty()
		 * @generated
		 */
		EClass UNARY_FLOOR_PROPERTY = eINSTANCE.getUnaryFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryFloorPropertyImpl <em>Binary Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryFloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryFloorProperty()
		 * @generated
		 */
		EClass BINARY_FLOOR_PROPERTY = eINSTANCE.getBinaryFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorNextPropertyImpl <em>Floor Next Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorNextPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorNextProperty()
		 * @generated
		 */
		EClass FLOOR_NEXT_PROPERTY = eINSTANCE.getFloorNextProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorNrPropertyImpl <em>Floor Nr Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorNrPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorNrProperty()
		 * @generated
		 */
		EClass FLOOR_NR_PROPERTY = eINSTANCE.getFloorNrProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonContainerPropertyImpl <em>Button Container Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonContainerPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonContainerProperty()
		 * @generated
		 */
		EClass BUTTON_CONTAINER_PROPERTY = eINSTANCE.getButtonContainerProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPropertyImpl <em>Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonProperty()
		 * @generated
		 */
		EClass BUTTON_PROPERTY = eINSTANCE.getButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryButtonPropertyImpl <em>Unary Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryButtonProperty()
		 * @generated
		 */
		EClass UNARY_BUTTON_PROPERTY = eINSTANCE.getUnaryButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryButtonPropertyImpl <em>Binary Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryButtonProperty()
		 * @generated
		 */
		EClass BINARY_BUTTON_PROPERTY = eINSTANCE.getBinaryButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonRequestedFloorPropertyImpl <em>Button Requested Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonRequestedFloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonRequestedFloorProperty()
		 * @generated
		 */
		EClass BUTTON_REQUESTED_FLOOR_PROPERTY = eINSTANCE.getButtonRequestedFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPressedPropertyImpl <em>Button Pressed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ButtonPressedPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getButtonPressedProperty()
		 * @generated
		 */
		EClass BUTTON_PRESSED_PROPERTY = eINSTANCE.getButtonPressedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorFloorButtonsPropertyImpl <em>Floor Floor Buttons Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorFloorButtonsPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorFloorButtonsProperty()
		 * @generated
		 */
		EClass FLOOR_FLOOR_BUTTONS_PROPERTY = eINSTANCE.getFloorFloorButtonsProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorPreviousPropertyImpl <em>Floor Previous Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorPreviousPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorPreviousProperty()
		 * @generated
		 */
		EClass FLOOR_PREVIOUS_PROPERTY = eINSTANCE.getFloorPreviousProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorPropertyImpl <em>Elevator Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorProperty()
		 * @generated
		 */
		EClass ELEVATOR_PROPERTY = eINSTANCE.getElevatorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorPropertyImpl <em>Unary Elevator Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryElevatorProperty()
		 * @generated
		 */
		EClass UNARY_ELEVATOR_PROPERTY = eINSTANCE.getUnaryElevatorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorPropertyImpl <em>Binary Elevator Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryElevatorProperty()
		 * @generated
		 */
		EClass BINARY_ELEVATOR_PROPERTY = eINSTANCE.getBinaryElevatorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonContainerPropertyImpl <em>Elevator Button Container Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonContainerPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorButtonContainerProperty()
		 * @generated
		 */
		EClass ELEVATOR_BUTTON_CONTAINER_PROPERTY = eINSTANCE.getElevatorButtonContainerProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonPropertyImpl <em>Elevator Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorButtonProperty()
		 * @generated
		 */
		EClass ELEVATOR_BUTTON_PROPERTY = eINSTANCE.getElevatorButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorButtonPropertyImpl <em>Unary Elevator Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryElevatorButtonProperty()
		 * @generated
		 */
		EClass UNARY_ELEVATOR_BUTTON_PROPERTY = eINSTANCE.getUnaryElevatorButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorButtonPropertyImpl <em>Binary Elevator Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryElevatorButtonProperty()
		 * @generated
		 */
		EClass BINARY_ELEVATOR_BUTTON_PROPERTY = eINSTANCE.getBinaryElevatorButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonRequestedFloorPropertyImpl <em>Elevator Button Requested Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonRequestedFloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorButtonRequestedFloorProperty()
		 * @generated
		 */
		EClass ELEVATOR_BUTTON_REQUESTED_FLOOR_PROPERTY = eINSTANCE.getElevatorButtonRequestedFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonPressedPropertyImpl <em>Elevator Button Pressed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorButtonPressedPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorButtonPressedProperty()
		 * @generated
		 */
		EClass ELEVATOR_BUTTON_PRESSED_PROPERTY = eINSTANCE.getElevatorButtonPressedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorElevatorButtonsPropertyImpl <em>Elevator Elevator Buttons Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorElevatorButtonsPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorElevatorButtonsProperty()
		 * @generated
		 */
		EClass ELEVATOR_ELEVATOR_BUTTONS_PROPERTY = eINSTANCE.getElevatorElevatorButtonsProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorDoorsOpenPropertyImpl <em>Elevator Doors Open Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorDoorsOpenPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorDoorsOpenProperty()
		 * @generated
		 */
		EClass ELEVATOR_DOORS_OPEN_PROPERTY = eINSTANCE.getElevatorDoorsOpenProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorGoingUpPropertyImpl <em>Elevator Going Up Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorGoingUpPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorGoingUpProperty()
		 * @generated
		 */
		EClass ELEVATOR_GOING_UP_PROPERTY = eINSTANCE.getElevatorGoingUpProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorCurrentFloorPropertyImpl <em>Elevator Current Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorCurrentFloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorCurrentFloorProperty()
		 * @generated
		 */
		EClass ELEVATOR_CURRENT_FLOOR_PROPERTY = eINSTANCE.getElevatorCurrentFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonPropertyImpl <em>Floor Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorButtonProperty()
		 * @generated
		 */
		EClass FLOOR_BUTTON_PROPERTY = eINSTANCE.getFloorButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryFloorButtonPropertyImpl <em>Unary Floor Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryFloorButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryFloorButtonProperty()
		 * @generated
		 */
		EClass UNARY_FLOOR_BUTTON_PROPERTY = eINSTANCE.getUnaryFloorButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryFloorButtonPropertyImpl <em>Binary Floor Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryFloorButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryFloorButtonProperty()
		 * @generated
		 */
		EClass BINARY_FLOOR_BUTTON_PROPERTY = eINSTANCE.getBinaryFloorButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonRequestedFloorPropertyImpl <em>Floor Button Requested Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonRequestedFloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorButtonRequestedFloorProperty()
		 * @generated
		 */
		EClass FLOOR_BUTTON_REQUESTED_FLOOR_PROPERTY = eINSTANCE.getFloorButtonRequestedFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonPressedPropertyImpl <em>Floor Button Pressed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorButtonPressedPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorButtonPressedProperty()
		 * @generated
		 */
		EClass FLOOR_BUTTON_PRESSED_PROPERTY = eINSTANCE.getFloorButtonPressedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonPropertyImpl <em>Up Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUpButtonProperty()
		 * @generated
		 */
		EClass UP_BUTTON_PROPERTY = eINSTANCE.getUpButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryUpButtonPropertyImpl <em>Unary Up Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryUpButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryUpButtonProperty()
		 * @generated
		 */
		EClass UNARY_UP_BUTTON_PROPERTY = eINSTANCE.getUnaryUpButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryUpButtonPropertyImpl <em>Binary Up Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryUpButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryUpButtonProperty()
		 * @generated
		 */
		EClass BINARY_UP_BUTTON_PROPERTY = eINSTANCE.getBinaryUpButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonRequestedFloorPropertyImpl <em>Up Button Requested Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonRequestedFloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUpButtonRequestedFloorProperty()
		 * @generated
		 */
		EClass UP_BUTTON_REQUESTED_FLOOR_PROPERTY = eINSTANCE.getUpButtonRequestedFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonPressedPropertyImpl <em>Up Button Pressed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UpButtonPressedPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUpButtonPressedProperty()
		 * @generated
		 */
		EClass UP_BUTTON_PRESSED_PROPERTY = eINSTANCE.getUpButtonPressedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonPropertyImpl <em>Down Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getDownButtonProperty()
		 * @generated
		 */
		EClass DOWN_BUTTON_PROPERTY = eINSTANCE.getDownButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryDownButtonPropertyImpl <em>Unary Down Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryDownButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryDownButtonProperty()
		 * @generated
		 */
		EClass UNARY_DOWN_BUTTON_PROPERTY = eINSTANCE.getUnaryDownButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryDownButtonPropertyImpl <em>Binary Down Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryDownButtonPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryDownButtonProperty()
		 * @generated
		 */
		EClass BINARY_DOWN_BUTTON_PROPERTY = eINSTANCE.getBinaryDownButtonProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonRequestedFloorPropertyImpl <em>Down Button Requested Floor Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonRequestedFloorPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getDownButtonRequestedFloorProperty()
		 * @generated
		 */
		EClass DOWN_BUTTON_REQUESTED_FLOOR_PROPERTY = eINSTANCE.getDownButtonRequestedFloorProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonPressedPropertyImpl <em>Down Button Pressed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.DownButtonPressedPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getDownButtonPressedProperty()
		 * @generated
		 */
		EClass DOWN_BUTTON_PRESSED_PROPERTY = eINSTANCE.getDownButtonPressedProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemPropertyImpl <em>Elevator System Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorSystemProperty()
		 * @generated
		 */
		EClass ELEVATOR_SYSTEM_PROPERTY = eINSTANCE.getElevatorSystemProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorSystemPropertyImpl <em>Unary Elevator System Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.UnaryElevatorSystemPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getUnaryElevatorSystemProperty()
		 * @generated
		 */
		EClass UNARY_ELEVATOR_SYSTEM_PROPERTY = eINSTANCE.getUnaryElevatorSystemProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorSystemPropertyImpl <em>Binary Elevator System Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.BinaryElevatorSystemPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getBinaryElevatorSystemProperty()
		 * @generated
		 */
		EClass BINARY_ELEVATOR_SYSTEM_PROPERTY = eINSTANCE.getBinaryElevatorSystemProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorContainerPropertyImpl <em>Elevator Container Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorContainerPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorContainerProperty()
		 * @generated
		 */
		EClass ELEVATOR_CONTAINER_PROPERTY = eINSTANCE.getElevatorContainerProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemElevatorsPropertyImpl <em>Elevator System Elevators Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemElevatorsPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorSystemElevatorsProperty()
		 * @generated
		 */
		EClass ELEVATOR_SYSTEM_ELEVATORS_PROPERTY = eINSTANCE.getElevatorSystemElevatorsProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorContainerPropertyImpl <em>Floor Container Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.FloorContainerPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getFloorContainerProperty()
		 * @generated
		 */
		EClass FLOOR_CONTAINER_PROPERTY = eINSTANCE.getFloorContainerProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemFloorsPropertyImpl <em>Elevator System Floors Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.ElevatorSystemFloorsPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getElevatorSystemFloorsProperty()
		 * @generated
		 */
		EClass ELEVATOR_SYSTEM_FLOORS_PROPERTY = eINSTANCE.getElevatorSystemFloorsProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorNextPropertyImpl <em>XElevator Next Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorNextPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorNextProperty()
		 * @generated
		 */
		EClass XELEVATOR_NEXT_PROPERTY = eINSTANCE.getXElevatorNextProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorUntilPropertyImpl <em>XElevator Until Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorUntilPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorUntilProperty()
		 * @generated
		 */
		EClass XELEVATOR_UNTIL_PROPERTY = eINSTANCE.getXElevatorUntilProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorReleasePropertyImpl <em>XElevator Release Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorReleasePropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorReleaseProperty()
		 * @generated
		 */
		EClass XELEVATOR_RELEASE_PROPERTY = eINSTANCE.getXElevatorReleaseProperty();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorNegationTemporalPropertyImpl <em>XElevator Negation Temporal Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorNegationTemporalPropertyImpl
		 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl.XElevatorPropertyPackageImpl#getXElevatorNegationTemporalProperty()
		 * @generated
		 */
		EClass XELEVATOR_NEGATION_TEMPORAL_PROPERTY = eINSTANCE.getXElevatorNegationTemporalProperty();

	}

} //XElevatorPropertyPackage
