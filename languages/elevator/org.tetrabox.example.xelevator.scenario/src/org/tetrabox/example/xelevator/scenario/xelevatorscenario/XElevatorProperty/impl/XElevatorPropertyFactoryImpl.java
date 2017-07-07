/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorPropertyFactoryImpl extends EFactoryImpl implements XElevatorPropertyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XElevatorPropertyFactory init() {
		try {
			XElevatorPropertyFactory theXElevatorPropertyFactory = (XElevatorPropertyFactory)EPackage.Registry.INSTANCE.getEFactory(XElevatorPropertyPackage.eNS_URI);
			if (theXElevatorPropertyFactory != null) {
				return theXElevatorPropertyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XElevatorPropertyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorPropertyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XElevatorPropertyPackage.ELEVATOR_OPEN_DOOR_UP_PROPERTY: return createElevatorOpenDoorUpProperty();
			case XElevatorPropertyPackage.ELEVATOR_CLOSE_DOOR_PROPERTY: return createElevatorCloseDoorProperty();
			case XElevatorPropertyPackage.ELEVATOR_MOVE_UP_PROPERTY: return createElevatorMoveUpProperty();
			case XElevatorPropertyPackage.ELEVATOR_CHANGE_TO_UP_PROPERTY: return createElevatorChangeToUpProperty();
			case XElevatorPropertyPackage.ELEVATOR_OPEN_DOOR_DOWN_PROPERTY: return createElevatorOpenDoorDownProperty();
			case XElevatorPropertyPackage.ELEVATOR_MOVE_DOWN_PROPERTY: return createElevatorMoveDownProperty();
			case XElevatorPropertyPackage.ELEVATOR_CHANGE_TO_DOWN_PROPERTY: return createElevatorChangeToDownProperty();
			case XElevatorPropertyPackage.BUTTON_PRESS_PROPERTY: return createButtonPressProperty();
			case XElevatorPropertyPackage.UNARY_FLOOR_PROPERTY: return createUnaryFloorProperty();
			case XElevatorPropertyPackage.BINARY_FLOOR_PROPERTY: return createBinaryFloorProperty();
			case XElevatorPropertyPackage.FLOOR_NEXT_PROPERTY: return createFloorNextProperty();
			case XElevatorPropertyPackage.FLOOR_NR_PROPERTY: return createFloorNrProperty();
			case XElevatorPropertyPackage.BUTTON_CONTAINER_PROPERTY: return createButtonContainerProperty();
			case XElevatorPropertyPackage.UNARY_BUTTON_PROPERTY: return createUnaryButtonProperty();
			case XElevatorPropertyPackage.BINARY_BUTTON_PROPERTY: return createBinaryButtonProperty();
			case XElevatorPropertyPackage.BUTTON_REQUESTED_FLOOR_PROPERTY: return createButtonRequestedFloorProperty();
			case XElevatorPropertyPackage.BUTTON_PRESSED_PROPERTY: return createButtonPressedProperty();
			case XElevatorPropertyPackage.FLOOR_FLOOR_BUTTONS_PROPERTY: return createFloorFloorButtonsProperty();
			case XElevatorPropertyPackage.FLOOR_PREVIOUS_PROPERTY: return createFloorPreviousProperty();
			case XElevatorPropertyPackage.UNARY_ELEVATOR_PROPERTY: return createUnaryElevatorProperty();
			case XElevatorPropertyPackage.BINARY_ELEVATOR_PROPERTY: return createBinaryElevatorProperty();
			case XElevatorPropertyPackage.ELEVATOR_BUTTON_CONTAINER_PROPERTY: return createElevatorButtonContainerProperty();
			case XElevatorPropertyPackage.UNARY_ELEVATOR_BUTTON_PROPERTY: return createUnaryElevatorButtonProperty();
			case XElevatorPropertyPackage.BINARY_ELEVATOR_BUTTON_PROPERTY: return createBinaryElevatorButtonProperty();
			case XElevatorPropertyPackage.ELEVATOR_BUTTON_REQUESTED_FLOOR_PROPERTY: return createElevatorButtonRequestedFloorProperty();
			case XElevatorPropertyPackage.ELEVATOR_BUTTON_PRESSED_PROPERTY: return createElevatorButtonPressedProperty();
			case XElevatorPropertyPackage.ELEVATOR_ELEVATOR_BUTTONS_PROPERTY: return createElevatorElevatorButtonsProperty();
			case XElevatorPropertyPackage.ELEVATOR_DOORS_OPEN_PROPERTY: return createElevatorDoorsOpenProperty();
			case XElevatorPropertyPackage.ELEVATOR_GOING_UP_PROPERTY: return createElevatorGoingUpProperty();
			case XElevatorPropertyPackage.ELEVATOR_CURRENT_FLOOR_PROPERTY: return createElevatorCurrentFloorProperty();
			case XElevatorPropertyPackage.UNARY_FLOOR_BUTTON_PROPERTY: return createUnaryFloorButtonProperty();
			case XElevatorPropertyPackage.BINARY_FLOOR_BUTTON_PROPERTY: return createBinaryFloorButtonProperty();
			case XElevatorPropertyPackage.FLOOR_BUTTON_REQUESTED_FLOOR_PROPERTY: return createFloorButtonRequestedFloorProperty();
			case XElevatorPropertyPackage.FLOOR_BUTTON_PRESSED_PROPERTY: return createFloorButtonPressedProperty();
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY: return createUnaryUpButtonProperty();
			case XElevatorPropertyPackage.BINARY_UP_BUTTON_PROPERTY: return createBinaryUpButtonProperty();
			case XElevatorPropertyPackage.UP_BUTTON_REQUESTED_FLOOR_PROPERTY: return createUpButtonRequestedFloorProperty();
			case XElevatorPropertyPackage.UP_BUTTON_PRESSED_PROPERTY: return createUpButtonPressedProperty();
			case XElevatorPropertyPackage.UNARY_DOWN_BUTTON_PROPERTY: return createUnaryDownButtonProperty();
			case XElevatorPropertyPackage.BINARY_DOWN_BUTTON_PROPERTY: return createBinaryDownButtonProperty();
			case XElevatorPropertyPackage.DOWN_BUTTON_REQUESTED_FLOOR_PROPERTY: return createDownButtonRequestedFloorProperty();
			case XElevatorPropertyPackage.DOWN_BUTTON_PRESSED_PROPERTY: return createDownButtonPressedProperty();
			case XElevatorPropertyPackage.UNARY_ELEVATOR_SYSTEM_PROPERTY: return createUnaryElevatorSystemProperty();
			case XElevatorPropertyPackage.BINARY_ELEVATOR_SYSTEM_PROPERTY: return createBinaryElevatorSystemProperty();
			case XElevatorPropertyPackage.ELEVATOR_CONTAINER_PROPERTY: return createElevatorContainerProperty();
			case XElevatorPropertyPackage.ELEVATOR_SYSTEM_ELEVATORS_PROPERTY: return createElevatorSystemElevatorsProperty();
			case XElevatorPropertyPackage.FLOOR_CONTAINER_PROPERTY: return createFloorContainerProperty();
			case XElevatorPropertyPackage.ELEVATOR_SYSTEM_FLOORS_PROPERTY: return createElevatorSystemFloorsProperty();
			case XElevatorPropertyPackage.XELEVATOR_NEXT_PROPERTY: return createXElevatorNextProperty();
			case XElevatorPropertyPackage.XELEVATOR_UNTIL_PROPERTY: return createXElevatorUntilProperty();
			case XElevatorPropertyPackage.XELEVATOR_RELEASE_PROPERTY: return createXElevatorReleaseProperty();
			case XElevatorPropertyPackage.XELEVATOR_NEGATION_TEMPORAL_PROPERTY: return createXElevatorNegationTemporalProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorOpenDoorUpProperty createElevatorOpenDoorUpProperty() {
		ElevatorOpenDoorUpPropertyImpl elevatorOpenDoorUpProperty = new ElevatorOpenDoorUpPropertyImpl();
		return elevatorOpenDoorUpProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorCloseDoorProperty createElevatorCloseDoorProperty() {
		ElevatorCloseDoorPropertyImpl elevatorCloseDoorProperty = new ElevatorCloseDoorPropertyImpl();
		return elevatorCloseDoorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorMoveUpProperty createElevatorMoveUpProperty() {
		ElevatorMoveUpPropertyImpl elevatorMoveUpProperty = new ElevatorMoveUpPropertyImpl();
		return elevatorMoveUpProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorChangeToUpProperty createElevatorChangeToUpProperty() {
		ElevatorChangeToUpPropertyImpl elevatorChangeToUpProperty = new ElevatorChangeToUpPropertyImpl();
		return elevatorChangeToUpProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorOpenDoorDownProperty createElevatorOpenDoorDownProperty() {
		ElevatorOpenDoorDownPropertyImpl elevatorOpenDoorDownProperty = new ElevatorOpenDoorDownPropertyImpl();
		return elevatorOpenDoorDownProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorMoveDownProperty createElevatorMoveDownProperty() {
		ElevatorMoveDownPropertyImpl elevatorMoveDownProperty = new ElevatorMoveDownPropertyImpl();
		return elevatorMoveDownProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorChangeToDownProperty createElevatorChangeToDownProperty() {
		ElevatorChangeToDownPropertyImpl elevatorChangeToDownProperty = new ElevatorChangeToDownPropertyImpl();
		return elevatorChangeToDownProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonPressProperty createButtonPressProperty() {
		ButtonPressPropertyImpl buttonPressProperty = new ButtonPressPropertyImpl();
		return buttonPressProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryFloorProperty createUnaryFloorProperty() {
		UnaryFloorPropertyImpl unaryFloorProperty = new UnaryFloorPropertyImpl();
		return unaryFloorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFloorProperty createBinaryFloorProperty() {
		BinaryFloorPropertyImpl binaryFloorProperty = new BinaryFloorPropertyImpl();
		return binaryFloorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorNextProperty createFloorNextProperty() {
		FloorNextPropertyImpl floorNextProperty = new FloorNextPropertyImpl();
		return floorNextProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorNrProperty createFloorNrProperty() {
		FloorNrPropertyImpl floorNrProperty = new FloorNrPropertyImpl();
		return floorNrProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonContainerProperty createButtonContainerProperty() {
		ButtonContainerPropertyImpl buttonContainerProperty = new ButtonContainerPropertyImpl();
		return buttonContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryButtonProperty createUnaryButtonProperty() {
		UnaryButtonPropertyImpl unaryButtonProperty = new UnaryButtonPropertyImpl();
		return unaryButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryButtonProperty createBinaryButtonProperty() {
		BinaryButtonPropertyImpl binaryButtonProperty = new BinaryButtonPropertyImpl();
		return binaryButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonRequestedFloorProperty createButtonRequestedFloorProperty() {
		ButtonRequestedFloorPropertyImpl buttonRequestedFloorProperty = new ButtonRequestedFloorPropertyImpl();
		return buttonRequestedFloorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonPressedProperty createButtonPressedProperty() {
		ButtonPressedPropertyImpl buttonPressedProperty = new ButtonPressedPropertyImpl();
		return buttonPressedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorFloorButtonsProperty createFloorFloorButtonsProperty() {
		FloorFloorButtonsPropertyImpl floorFloorButtonsProperty = new FloorFloorButtonsPropertyImpl();
		return floorFloorButtonsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorPreviousProperty createFloorPreviousProperty() {
		FloorPreviousPropertyImpl floorPreviousProperty = new FloorPreviousPropertyImpl();
		return floorPreviousProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryElevatorProperty createUnaryElevatorProperty() {
		UnaryElevatorPropertyImpl unaryElevatorProperty = new UnaryElevatorPropertyImpl();
		return unaryElevatorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryElevatorProperty createBinaryElevatorProperty() {
		BinaryElevatorPropertyImpl binaryElevatorProperty = new BinaryElevatorPropertyImpl();
		return binaryElevatorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorButtonContainerProperty createElevatorButtonContainerProperty() {
		ElevatorButtonContainerPropertyImpl elevatorButtonContainerProperty = new ElevatorButtonContainerPropertyImpl();
		return elevatorButtonContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryElevatorButtonProperty createUnaryElevatorButtonProperty() {
		UnaryElevatorButtonPropertyImpl unaryElevatorButtonProperty = new UnaryElevatorButtonPropertyImpl();
		return unaryElevatorButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryElevatorButtonProperty createBinaryElevatorButtonProperty() {
		BinaryElevatorButtonPropertyImpl binaryElevatorButtonProperty = new BinaryElevatorButtonPropertyImpl();
		return binaryElevatorButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorButtonRequestedFloorProperty createElevatorButtonRequestedFloorProperty() {
		ElevatorButtonRequestedFloorPropertyImpl elevatorButtonRequestedFloorProperty = new ElevatorButtonRequestedFloorPropertyImpl();
		return elevatorButtonRequestedFloorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorButtonPressedProperty createElevatorButtonPressedProperty() {
		ElevatorButtonPressedPropertyImpl elevatorButtonPressedProperty = new ElevatorButtonPressedPropertyImpl();
		return elevatorButtonPressedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorElevatorButtonsProperty createElevatorElevatorButtonsProperty() {
		ElevatorElevatorButtonsPropertyImpl elevatorElevatorButtonsProperty = new ElevatorElevatorButtonsPropertyImpl();
		return elevatorElevatorButtonsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorDoorsOpenProperty createElevatorDoorsOpenProperty() {
		ElevatorDoorsOpenPropertyImpl elevatorDoorsOpenProperty = new ElevatorDoorsOpenPropertyImpl();
		return elevatorDoorsOpenProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorGoingUpProperty createElevatorGoingUpProperty() {
		ElevatorGoingUpPropertyImpl elevatorGoingUpProperty = new ElevatorGoingUpPropertyImpl();
		return elevatorGoingUpProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorCurrentFloorProperty createElevatorCurrentFloorProperty() {
		ElevatorCurrentFloorPropertyImpl elevatorCurrentFloorProperty = new ElevatorCurrentFloorPropertyImpl();
		return elevatorCurrentFloorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryFloorButtonProperty createUnaryFloorButtonProperty() {
		UnaryFloorButtonPropertyImpl unaryFloorButtonProperty = new UnaryFloorButtonPropertyImpl();
		return unaryFloorButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFloorButtonProperty createBinaryFloorButtonProperty() {
		BinaryFloorButtonPropertyImpl binaryFloorButtonProperty = new BinaryFloorButtonPropertyImpl();
		return binaryFloorButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorButtonRequestedFloorProperty createFloorButtonRequestedFloorProperty() {
		FloorButtonRequestedFloorPropertyImpl floorButtonRequestedFloorProperty = new FloorButtonRequestedFloorPropertyImpl();
		return floorButtonRequestedFloorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorButtonPressedProperty createFloorButtonPressedProperty() {
		FloorButtonPressedPropertyImpl floorButtonPressedProperty = new FloorButtonPressedPropertyImpl();
		return floorButtonPressedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryUpButtonProperty createUnaryUpButtonProperty() {
		UnaryUpButtonPropertyImpl unaryUpButtonProperty = new UnaryUpButtonPropertyImpl();
		return unaryUpButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryUpButtonProperty createBinaryUpButtonProperty() {
		BinaryUpButtonPropertyImpl binaryUpButtonProperty = new BinaryUpButtonPropertyImpl();
		return binaryUpButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpButtonRequestedFloorProperty createUpButtonRequestedFloorProperty() {
		UpButtonRequestedFloorPropertyImpl upButtonRequestedFloorProperty = new UpButtonRequestedFloorPropertyImpl();
		return upButtonRequestedFloorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpButtonPressedProperty createUpButtonPressedProperty() {
		UpButtonPressedPropertyImpl upButtonPressedProperty = new UpButtonPressedPropertyImpl();
		return upButtonPressedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryDownButtonProperty createUnaryDownButtonProperty() {
		UnaryDownButtonPropertyImpl unaryDownButtonProperty = new UnaryDownButtonPropertyImpl();
		return unaryDownButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDownButtonProperty createBinaryDownButtonProperty() {
		BinaryDownButtonPropertyImpl binaryDownButtonProperty = new BinaryDownButtonPropertyImpl();
		return binaryDownButtonProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DownButtonRequestedFloorProperty createDownButtonRequestedFloorProperty() {
		DownButtonRequestedFloorPropertyImpl downButtonRequestedFloorProperty = new DownButtonRequestedFloorPropertyImpl();
		return downButtonRequestedFloorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DownButtonPressedProperty createDownButtonPressedProperty() {
		DownButtonPressedPropertyImpl downButtonPressedProperty = new DownButtonPressedPropertyImpl();
		return downButtonPressedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryElevatorSystemProperty createUnaryElevatorSystemProperty() {
		UnaryElevatorSystemPropertyImpl unaryElevatorSystemProperty = new UnaryElevatorSystemPropertyImpl();
		return unaryElevatorSystemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryElevatorSystemProperty createBinaryElevatorSystemProperty() {
		BinaryElevatorSystemPropertyImpl binaryElevatorSystemProperty = new BinaryElevatorSystemPropertyImpl();
		return binaryElevatorSystemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorContainerProperty createElevatorContainerProperty() {
		ElevatorContainerPropertyImpl elevatorContainerProperty = new ElevatorContainerPropertyImpl();
		return elevatorContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorSystemElevatorsProperty createElevatorSystemElevatorsProperty() {
		ElevatorSystemElevatorsPropertyImpl elevatorSystemElevatorsProperty = new ElevatorSystemElevatorsPropertyImpl();
		return elevatorSystemElevatorsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorContainerProperty createFloorContainerProperty() {
		FloorContainerPropertyImpl floorContainerProperty = new FloorContainerPropertyImpl();
		return floorContainerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorSystemFloorsProperty createElevatorSystemFloorsProperty() {
		ElevatorSystemFloorsPropertyImpl elevatorSystemFloorsProperty = new ElevatorSystemFloorsPropertyImpl();
		return elevatorSystemFloorsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorNextProperty createXElevatorNextProperty() {
		XElevatorNextPropertyImpl xElevatorNextProperty = new XElevatorNextPropertyImpl();
		return xElevatorNextProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorUntilProperty createXElevatorUntilProperty() {
		XElevatorUntilPropertyImpl xElevatorUntilProperty = new XElevatorUntilPropertyImpl();
		return xElevatorUntilProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorReleaseProperty createXElevatorReleaseProperty() {
		XElevatorReleasePropertyImpl xElevatorReleaseProperty = new XElevatorReleasePropertyImpl();
		return xElevatorReleaseProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorNegationTemporalProperty createXElevatorNegationTemporalProperty() {
		XElevatorNegationTemporalPropertyImpl xElevatorNegationTemporalProperty = new XElevatorNegationTemporalPropertyImpl();
		return xElevatorNegationTemporalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorPropertyPackage getXElevatorPropertyPackage() {
		return (XElevatorPropertyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XElevatorPropertyPackage getPackage() {
		return XElevatorPropertyPackage.eINSTANCE;
	}

} //XElevatorPropertyFactoryImpl
