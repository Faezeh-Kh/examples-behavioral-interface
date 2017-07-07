/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.util;

import fr.inria.diverse.event.commons.model.property.AbstractProperty;
import fr.inria.diverse.event.commons.model.property.BinaryProperty;
import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;
import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;
import fr.inria.diverse.event.commons.model.property.IntegerAttributeProperty;
import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;
import fr.inria.diverse.event.commons.model.property.NegationTemporalProperty;
import fr.inria.diverse.event.commons.model.property.NextProperty;
import fr.inria.diverse.event.commons.model.property.Property;
import fr.inria.diverse.event.commons.model.property.ReleaseProperty;
import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;
import fr.inria.diverse.event.commons.model.property.StateProperty;
import fr.inria.diverse.event.commons.model.property.StepProperty;
import fr.inria.diverse.event.commons.model.property.TemporalProperty;
import fr.inria.diverse.event.commons.model.property.UnaryProperty;
import fr.inria.diverse.event.commons.model.property.UntilProperty;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tetrabox.example.xelevator.elevator.Button;
import org.tetrabox.example.xelevator.elevator.DownButton;
import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorButton;
import org.tetrabox.example.xelevator.elevator.ElevatorSystem;
import org.tetrabox.example.xelevator.elevator.Floor;
import org.tetrabox.example.xelevator.elevator.FloorButton;
import org.tetrabox.example.xelevator.elevator.UpButton;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage
 * @generated
 */
public class XElevatorPropertySwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XElevatorPropertyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorPropertySwitch() {
		if (modelPackage == null) {
			modelPackage = XElevatorPropertyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XElevatorPropertyPackage.ELEVATOR_OPEN_DOOR_UP_PROPERTY: {
				ElevatorOpenDoorUpProperty elevatorOpenDoorUpProperty = (ElevatorOpenDoorUpProperty)theEObject;
				T1 result = caseElevatorOpenDoorUpProperty(elevatorOpenDoorUpProperty);
				if (result == null) result = caseXElevatorStepProperty(elevatorOpenDoorUpProperty);
				if (result == null) result = caseStepProperty(elevatorOpenDoorUpProperty);
				if (result == null) result = caseXElevatorProperty(elevatorOpenDoorUpProperty);
				if (result == null) result = caseProperty(elevatorOpenDoorUpProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorOpenDoorUpProperty);
				if (result == null) result = caseAbstractProperty(elevatorOpenDoorUpProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_CLOSE_DOOR_PROPERTY: {
				ElevatorCloseDoorProperty elevatorCloseDoorProperty = (ElevatorCloseDoorProperty)theEObject;
				T1 result = caseElevatorCloseDoorProperty(elevatorCloseDoorProperty);
				if (result == null) result = caseXElevatorStepProperty(elevatorCloseDoorProperty);
				if (result == null) result = caseStepProperty(elevatorCloseDoorProperty);
				if (result == null) result = caseXElevatorProperty(elevatorCloseDoorProperty);
				if (result == null) result = caseProperty(elevatorCloseDoorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorCloseDoorProperty);
				if (result == null) result = caseAbstractProperty(elevatorCloseDoorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_MOVE_UP_PROPERTY: {
				ElevatorMoveUpProperty elevatorMoveUpProperty = (ElevatorMoveUpProperty)theEObject;
				T1 result = caseElevatorMoveUpProperty(elevatorMoveUpProperty);
				if (result == null) result = caseXElevatorStepProperty(elevatorMoveUpProperty);
				if (result == null) result = caseStepProperty(elevatorMoveUpProperty);
				if (result == null) result = caseXElevatorProperty(elevatorMoveUpProperty);
				if (result == null) result = caseProperty(elevatorMoveUpProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorMoveUpProperty);
				if (result == null) result = caseAbstractProperty(elevatorMoveUpProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_CHANGE_TO_UP_PROPERTY: {
				ElevatorChangeToUpProperty elevatorChangeToUpProperty = (ElevatorChangeToUpProperty)theEObject;
				T1 result = caseElevatorChangeToUpProperty(elevatorChangeToUpProperty);
				if (result == null) result = caseXElevatorStepProperty(elevatorChangeToUpProperty);
				if (result == null) result = caseStepProperty(elevatorChangeToUpProperty);
				if (result == null) result = caseXElevatorProperty(elevatorChangeToUpProperty);
				if (result == null) result = caseProperty(elevatorChangeToUpProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorChangeToUpProperty);
				if (result == null) result = caseAbstractProperty(elevatorChangeToUpProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_OPEN_DOOR_DOWN_PROPERTY: {
				ElevatorOpenDoorDownProperty elevatorOpenDoorDownProperty = (ElevatorOpenDoorDownProperty)theEObject;
				T1 result = caseElevatorOpenDoorDownProperty(elevatorOpenDoorDownProperty);
				if (result == null) result = caseXElevatorStepProperty(elevatorOpenDoorDownProperty);
				if (result == null) result = caseStepProperty(elevatorOpenDoorDownProperty);
				if (result == null) result = caseXElevatorProperty(elevatorOpenDoorDownProperty);
				if (result == null) result = caseProperty(elevatorOpenDoorDownProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorOpenDoorDownProperty);
				if (result == null) result = caseAbstractProperty(elevatorOpenDoorDownProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_MOVE_DOWN_PROPERTY: {
				ElevatorMoveDownProperty elevatorMoveDownProperty = (ElevatorMoveDownProperty)theEObject;
				T1 result = caseElevatorMoveDownProperty(elevatorMoveDownProperty);
				if (result == null) result = caseXElevatorStepProperty(elevatorMoveDownProperty);
				if (result == null) result = caseStepProperty(elevatorMoveDownProperty);
				if (result == null) result = caseXElevatorProperty(elevatorMoveDownProperty);
				if (result == null) result = caseProperty(elevatorMoveDownProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorMoveDownProperty);
				if (result == null) result = caseAbstractProperty(elevatorMoveDownProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_CHANGE_TO_DOWN_PROPERTY: {
				ElevatorChangeToDownProperty elevatorChangeToDownProperty = (ElevatorChangeToDownProperty)theEObject;
				T1 result = caseElevatorChangeToDownProperty(elevatorChangeToDownProperty);
				if (result == null) result = caseXElevatorStepProperty(elevatorChangeToDownProperty);
				if (result == null) result = caseStepProperty(elevatorChangeToDownProperty);
				if (result == null) result = caseXElevatorProperty(elevatorChangeToDownProperty);
				if (result == null) result = caseProperty(elevatorChangeToDownProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorChangeToDownProperty);
				if (result == null) result = caseAbstractProperty(elevatorChangeToDownProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BUTTON_PRESS_PROPERTY: {
				ButtonPressProperty buttonPressProperty = (ButtonPressProperty)theEObject;
				T1 result = caseButtonPressProperty(buttonPressProperty);
				if (result == null) result = caseXElevatorStepProperty(buttonPressProperty);
				if (result == null) result = caseStepProperty(buttonPressProperty);
				if (result == null) result = caseXElevatorProperty(buttonPressProperty);
				if (result == null) result = caseProperty(buttonPressProperty);
				if (result == null) result = caseXElevatorAbstractProperty(buttonPressProperty);
				if (result == null) result = caseAbstractProperty(buttonPressProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_ABSTRACT_PROPERTY: {
				XElevatorAbstractProperty xElevatorAbstractProperty = (XElevatorAbstractProperty)theEObject;
				T1 result = caseXElevatorAbstractProperty(xElevatorAbstractProperty);
				if (result == null) result = caseAbstractProperty(xElevatorAbstractProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_TEMPORAL_PROPERTY: {
				XElevatorTemporalProperty xElevatorTemporalProperty = (XElevatorTemporalProperty)theEObject;
				T1 result = caseXElevatorTemporalProperty(xElevatorTemporalProperty);
				if (result == null) result = caseTemporalProperty(xElevatorTemporalProperty);
				if (result == null) result = caseXElevatorAbstractProperty(xElevatorTemporalProperty);
				if (result == null) result = caseAbstractProperty(xElevatorTemporalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_PROPERTY: {
				XElevatorProperty xElevatorProperty = (XElevatorProperty)theEObject;
				T1 result = caseXElevatorProperty(xElevatorProperty);
				if (result == null) result = caseProperty(xElevatorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(xElevatorProperty);
				if (result == null) result = caseAbstractProperty(xElevatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_STATE_PROPERTY: {
				XElevatorStateProperty<?> xElevatorStateProperty = (XElevatorStateProperty<?>)theEObject;
				T1 result = caseXElevatorStateProperty(xElevatorStateProperty);
				if (result == null) result = caseStateProperty(xElevatorStateProperty);
				if (result == null) result = caseXElevatorProperty(xElevatorStateProperty);
				if (result == null) result = caseProperty(xElevatorStateProperty);
				if (result == null) result = caseXElevatorAbstractProperty(xElevatorStateProperty);
				if (result == null) result = caseAbstractProperty(xElevatorStateProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_STEP_PROPERTY: {
				XElevatorStepProperty<?> xElevatorStepProperty = (XElevatorStepProperty<?>)theEObject;
				T1 result = caseXElevatorStepProperty(xElevatorStepProperty);
				if (result == null) result = caseStepProperty(xElevatorStepProperty);
				if (result == null) result = caseXElevatorProperty(xElevatorStepProperty);
				if (result == null) result = caseProperty(xElevatorStepProperty);
				if (result == null) result = caseXElevatorAbstractProperty(xElevatorStepProperty);
				if (result == null) result = caseAbstractProperty(xElevatorStepProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_PROPERTY: {
				FloorProperty<?> floorProperty = (FloorProperty<?>)theEObject;
				T1 result = caseFloorProperty(floorProperty);
				if (result == null) result = caseXElevatorStateProperty(floorProperty);
				if (result == null) result = caseStateProperty(floorProperty);
				if (result == null) result = caseXElevatorProperty(floorProperty);
				if (result == null) result = caseProperty(floorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorProperty);
				if (result == null) result = caseAbstractProperty(floorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UNARY_FLOOR_PROPERTY: {
				UnaryFloorProperty unaryFloorProperty = (UnaryFloorProperty)theEObject;
				T1 result = caseUnaryFloorProperty(unaryFloorProperty);
				if (result == null) result = caseFloorProperty(unaryFloorProperty);
				if (result == null) result = caseUnaryProperty(unaryFloorProperty);
				if (result == null) result = caseXElevatorStateProperty(unaryFloorProperty);
				if (result == null) result = caseStateProperty(unaryFloorProperty);
				if (result == null) result = caseXElevatorProperty(unaryFloorProperty);
				if (result == null) result = caseProperty(unaryFloorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(unaryFloorProperty);
				if (result == null) result = caseAbstractProperty(unaryFloorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BINARY_FLOOR_PROPERTY: {
				BinaryFloorProperty binaryFloorProperty = (BinaryFloorProperty)theEObject;
				T1 result = caseBinaryFloorProperty(binaryFloorProperty);
				if (result == null) result = caseFloorProperty(binaryFloorProperty);
				if (result == null) result = caseBinaryProperty(binaryFloorProperty);
				if (result == null) result = caseXElevatorStateProperty(binaryFloorProperty);
				if (result == null) result = caseStateProperty(binaryFloorProperty);
				if (result == null) result = caseXElevatorProperty(binaryFloorProperty);
				if (result == null) result = caseProperty(binaryFloorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(binaryFloorProperty);
				if (result == null) result = caseAbstractProperty(binaryFloorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_NEXT_PROPERTY: {
				FloorNextProperty floorNextProperty = (FloorNextProperty)theEObject;
				T1 result = caseFloorNextProperty(floorNextProperty);
				if (result == null) result = caseFloorProperty(floorNextProperty);
				if (result == null) result = caseSingleReferenceProperty(floorNextProperty);
				if (result == null) result = caseXElevatorStateProperty(floorNextProperty);
				if (result == null) result = caseStateProperty(floorNextProperty);
				if (result == null) result = caseXElevatorProperty(floorNextProperty);
				if (result == null) result = caseProperty(floorNextProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorNextProperty);
				if (result == null) result = caseAbstractProperty(floorNextProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_NR_PROPERTY: {
				FloorNrProperty floorNrProperty = (FloorNrProperty)theEObject;
				T1 result = caseFloorNrProperty(floorNrProperty);
				if (result == null) result = caseFloorProperty(floorNrProperty);
				if (result == null) result = caseIntegerAttributeProperty(floorNrProperty);
				if (result == null) result = caseXElevatorStateProperty(floorNrProperty);
				if (result == null) result = caseStateProperty(floorNrProperty);
				if (result == null) result = caseXElevatorProperty(floorNrProperty);
				if (result == null) result = caseProperty(floorNrProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorNrProperty);
				if (result == null) result = caseAbstractProperty(floorNrProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BUTTON_CONTAINER_PROPERTY: {
				ButtonContainerProperty buttonContainerProperty = (ButtonContainerProperty)theEObject;
				T1 result = caseButtonContainerProperty(buttonContainerProperty);
				if (result == null) result = caseButtonProperty(buttonContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(buttonContainerProperty);
				if (result == null) result = caseXElevatorStateProperty(buttonContainerProperty);
				if (result == null) result = caseStateProperty(buttonContainerProperty);
				if (result == null) result = caseXElevatorProperty(buttonContainerProperty);
				if (result == null) result = caseProperty(buttonContainerProperty);
				if (result == null) result = caseXElevatorAbstractProperty(buttonContainerProperty);
				if (result == null) result = caseAbstractProperty(buttonContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BUTTON_PROPERTY: {
				ButtonProperty<?> buttonProperty = (ButtonProperty<?>)theEObject;
				T1 result = caseButtonProperty(buttonProperty);
				if (result == null) result = caseXElevatorStateProperty(buttonProperty);
				if (result == null) result = caseStateProperty(buttonProperty);
				if (result == null) result = caseXElevatorProperty(buttonProperty);
				if (result == null) result = caseProperty(buttonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(buttonProperty);
				if (result == null) result = caseAbstractProperty(buttonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UNARY_BUTTON_PROPERTY: {
				UnaryButtonProperty unaryButtonProperty = (UnaryButtonProperty)theEObject;
				T1 result = caseUnaryButtonProperty(unaryButtonProperty);
				if (result == null) result = caseButtonProperty(unaryButtonProperty);
				if (result == null) result = caseUnaryProperty(unaryButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(unaryButtonProperty);
				if (result == null) result = caseStateProperty(unaryButtonProperty);
				if (result == null) result = caseXElevatorProperty(unaryButtonProperty);
				if (result == null) result = caseProperty(unaryButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(unaryButtonProperty);
				if (result == null) result = caseAbstractProperty(unaryButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BINARY_BUTTON_PROPERTY: {
				BinaryButtonProperty binaryButtonProperty = (BinaryButtonProperty)theEObject;
				T1 result = caseBinaryButtonProperty(binaryButtonProperty);
				if (result == null) result = caseButtonProperty(binaryButtonProperty);
				if (result == null) result = caseBinaryProperty(binaryButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(binaryButtonProperty);
				if (result == null) result = caseStateProperty(binaryButtonProperty);
				if (result == null) result = caseXElevatorProperty(binaryButtonProperty);
				if (result == null) result = caseProperty(binaryButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(binaryButtonProperty);
				if (result == null) result = caseAbstractProperty(binaryButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BUTTON_REQUESTED_FLOOR_PROPERTY: {
				ButtonRequestedFloorProperty buttonRequestedFloorProperty = (ButtonRequestedFloorProperty)theEObject;
				T1 result = caseButtonRequestedFloorProperty(buttonRequestedFloorProperty);
				if (result == null) result = caseButtonProperty(buttonRequestedFloorProperty);
				if (result == null) result = caseSingleReferenceProperty(buttonRequestedFloorProperty);
				if (result == null) result = caseXElevatorStateProperty(buttonRequestedFloorProperty);
				if (result == null) result = caseStateProperty(buttonRequestedFloorProperty);
				if (result == null) result = caseXElevatorProperty(buttonRequestedFloorProperty);
				if (result == null) result = caseProperty(buttonRequestedFloorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(buttonRequestedFloorProperty);
				if (result == null) result = caseAbstractProperty(buttonRequestedFloorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BUTTON_PRESSED_PROPERTY: {
				ButtonPressedProperty buttonPressedProperty = (ButtonPressedProperty)theEObject;
				T1 result = caseButtonPressedProperty(buttonPressedProperty);
				if (result == null) result = caseButtonProperty(buttonPressedProperty);
				if (result == null) result = caseBooleanAttributeProperty(buttonPressedProperty);
				if (result == null) result = caseXElevatorStateProperty(buttonPressedProperty);
				if (result == null) result = caseStateProperty(buttonPressedProperty);
				if (result == null) result = caseXElevatorProperty(buttonPressedProperty);
				if (result == null) result = caseProperty(buttonPressedProperty);
				if (result == null) result = caseXElevatorAbstractProperty(buttonPressedProperty);
				if (result == null) result = caseAbstractProperty(buttonPressedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_FLOOR_BUTTONS_PROPERTY: {
				FloorFloorButtonsProperty floorFloorButtonsProperty = (FloorFloorButtonsProperty)theEObject;
				T1 result = caseFloorFloorButtonsProperty(floorFloorButtonsProperty);
				if (result == null) result = caseFloorProperty(floorFloorButtonsProperty);
				if (result == null) result = caseManyReferenceProperty(floorFloorButtonsProperty);
				if (result == null) result = caseXElevatorStateProperty(floorFloorButtonsProperty);
				if (result == null) result = caseStateProperty(floorFloorButtonsProperty);
				if (result == null) result = caseXElevatorProperty(floorFloorButtonsProperty);
				if (result == null) result = caseProperty(floorFloorButtonsProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorFloorButtonsProperty);
				if (result == null) result = caseAbstractProperty(floorFloorButtonsProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_PREVIOUS_PROPERTY: {
				FloorPreviousProperty floorPreviousProperty = (FloorPreviousProperty)theEObject;
				T1 result = caseFloorPreviousProperty(floorPreviousProperty);
				if (result == null) result = caseFloorProperty(floorPreviousProperty);
				if (result == null) result = caseSingleReferenceProperty(floorPreviousProperty);
				if (result == null) result = caseXElevatorStateProperty(floorPreviousProperty);
				if (result == null) result = caseStateProperty(floorPreviousProperty);
				if (result == null) result = caseXElevatorProperty(floorPreviousProperty);
				if (result == null) result = caseProperty(floorPreviousProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorPreviousProperty);
				if (result == null) result = caseAbstractProperty(floorPreviousProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_PROPERTY: {
				ElevatorProperty<?> elevatorProperty = (ElevatorProperty<?>)theEObject;
				T1 result = caseElevatorProperty(elevatorProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorProperty);
				if (result == null) result = caseStateProperty(elevatorProperty);
				if (result == null) result = caseXElevatorProperty(elevatorProperty);
				if (result == null) result = caseProperty(elevatorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorProperty);
				if (result == null) result = caseAbstractProperty(elevatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UNARY_ELEVATOR_PROPERTY: {
				UnaryElevatorProperty unaryElevatorProperty = (UnaryElevatorProperty)theEObject;
				T1 result = caseUnaryElevatorProperty(unaryElevatorProperty);
				if (result == null) result = caseElevatorProperty(unaryElevatorProperty);
				if (result == null) result = caseUnaryProperty(unaryElevatorProperty);
				if (result == null) result = caseXElevatorStateProperty(unaryElevatorProperty);
				if (result == null) result = caseStateProperty(unaryElevatorProperty);
				if (result == null) result = caseXElevatorProperty(unaryElevatorProperty);
				if (result == null) result = caseProperty(unaryElevatorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(unaryElevatorProperty);
				if (result == null) result = caseAbstractProperty(unaryElevatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BINARY_ELEVATOR_PROPERTY: {
				BinaryElevatorProperty binaryElevatorProperty = (BinaryElevatorProperty)theEObject;
				T1 result = caseBinaryElevatorProperty(binaryElevatorProperty);
				if (result == null) result = caseElevatorProperty(binaryElevatorProperty);
				if (result == null) result = caseBinaryProperty(binaryElevatorProperty);
				if (result == null) result = caseXElevatorStateProperty(binaryElevatorProperty);
				if (result == null) result = caseStateProperty(binaryElevatorProperty);
				if (result == null) result = caseXElevatorProperty(binaryElevatorProperty);
				if (result == null) result = caseProperty(binaryElevatorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(binaryElevatorProperty);
				if (result == null) result = caseAbstractProperty(binaryElevatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_BUTTON_CONTAINER_PROPERTY: {
				ElevatorButtonContainerProperty elevatorButtonContainerProperty = (ElevatorButtonContainerProperty)theEObject;
				T1 result = caseElevatorButtonContainerProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseElevatorButtonProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseButtonProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseStateProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseXElevatorProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorButtonContainerProperty);
				if (result == null) result = caseAbstractProperty(elevatorButtonContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_BUTTON_PROPERTY: {
				ElevatorButtonProperty<?> elevatorButtonProperty = (ElevatorButtonProperty<?>)theEObject;
				T1 result = caseElevatorButtonProperty(elevatorButtonProperty);
				if (result == null) result = caseButtonProperty(elevatorButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorButtonProperty);
				if (result == null) result = caseStateProperty(elevatorButtonProperty);
				if (result == null) result = caseXElevatorProperty(elevatorButtonProperty);
				if (result == null) result = caseProperty(elevatorButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorButtonProperty);
				if (result == null) result = caseAbstractProperty(elevatorButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UNARY_ELEVATOR_BUTTON_PROPERTY: {
				UnaryElevatorButtonProperty unaryElevatorButtonProperty = (UnaryElevatorButtonProperty)theEObject;
				T1 result = caseUnaryElevatorButtonProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseElevatorButtonProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseUnaryProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseButtonProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseStateProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseXElevatorProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(unaryElevatorButtonProperty);
				if (result == null) result = caseAbstractProperty(unaryElevatorButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BINARY_ELEVATOR_BUTTON_PROPERTY: {
				BinaryElevatorButtonProperty binaryElevatorButtonProperty = (BinaryElevatorButtonProperty)theEObject;
				T1 result = caseBinaryElevatorButtonProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseElevatorButtonProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseBinaryProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseButtonProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseStateProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseXElevatorProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(binaryElevatorButtonProperty);
				if (result == null) result = caseAbstractProperty(binaryElevatorButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_BUTTON_REQUESTED_FLOOR_PROPERTY: {
				ElevatorButtonRequestedFloorProperty elevatorButtonRequestedFloorProperty = (ElevatorButtonRequestedFloorProperty)theEObject;
				T1 result = caseElevatorButtonRequestedFloorProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseElevatorButtonProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseSingleReferenceProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseButtonProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseStateProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = caseAbstractProperty(elevatorButtonRequestedFloorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_BUTTON_PRESSED_PROPERTY: {
				ElevatorButtonPressedProperty elevatorButtonPressedProperty = (ElevatorButtonPressedProperty)theEObject;
				T1 result = caseElevatorButtonPressedProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseElevatorButtonProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseBooleanAttributeProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseButtonProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseStateProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseXElevatorProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorButtonPressedProperty);
				if (result == null) result = caseAbstractProperty(elevatorButtonPressedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_ELEVATOR_BUTTONS_PROPERTY: {
				ElevatorElevatorButtonsProperty elevatorElevatorButtonsProperty = (ElevatorElevatorButtonsProperty)theEObject;
				T1 result = caseElevatorElevatorButtonsProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = caseElevatorProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = caseManyReferenceProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = caseStateProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = caseXElevatorProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = caseProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = caseAbstractProperty(elevatorElevatorButtonsProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_DOORS_OPEN_PROPERTY: {
				ElevatorDoorsOpenProperty elevatorDoorsOpenProperty = (ElevatorDoorsOpenProperty)theEObject;
				T1 result = caseElevatorDoorsOpenProperty(elevatorDoorsOpenProperty);
				if (result == null) result = caseElevatorProperty(elevatorDoorsOpenProperty);
				if (result == null) result = caseBooleanAttributeProperty(elevatorDoorsOpenProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorDoorsOpenProperty);
				if (result == null) result = caseStateProperty(elevatorDoorsOpenProperty);
				if (result == null) result = caseXElevatorProperty(elevatorDoorsOpenProperty);
				if (result == null) result = caseProperty(elevatorDoorsOpenProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorDoorsOpenProperty);
				if (result == null) result = caseAbstractProperty(elevatorDoorsOpenProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_GOING_UP_PROPERTY: {
				ElevatorGoingUpProperty elevatorGoingUpProperty = (ElevatorGoingUpProperty)theEObject;
				T1 result = caseElevatorGoingUpProperty(elevatorGoingUpProperty);
				if (result == null) result = caseElevatorProperty(elevatorGoingUpProperty);
				if (result == null) result = caseBooleanAttributeProperty(elevatorGoingUpProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorGoingUpProperty);
				if (result == null) result = caseStateProperty(elevatorGoingUpProperty);
				if (result == null) result = caseXElevatorProperty(elevatorGoingUpProperty);
				if (result == null) result = caseProperty(elevatorGoingUpProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorGoingUpProperty);
				if (result == null) result = caseAbstractProperty(elevatorGoingUpProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_CURRENT_FLOOR_PROPERTY: {
				ElevatorCurrentFloorProperty elevatorCurrentFloorProperty = (ElevatorCurrentFloorProperty)theEObject;
				T1 result = caseElevatorCurrentFloorProperty(elevatorCurrentFloorProperty);
				if (result == null) result = caseElevatorProperty(elevatorCurrentFloorProperty);
				if (result == null) result = caseSingleReferenceProperty(elevatorCurrentFloorProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorCurrentFloorProperty);
				if (result == null) result = caseStateProperty(elevatorCurrentFloorProperty);
				if (result == null) result = caseXElevatorProperty(elevatorCurrentFloorProperty);
				if (result == null) result = caseProperty(elevatorCurrentFloorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorCurrentFloorProperty);
				if (result == null) result = caseAbstractProperty(elevatorCurrentFloorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_BUTTON_PROPERTY: {
				FloorButtonProperty<?> floorButtonProperty = (FloorButtonProperty<?>)theEObject;
				T1 result = caseFloorButtonProperty(floorButtonProperty);
				if (result == null) result = caseButtonProperty(floorButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(floorButtonProperty);
				if (result == null) result = caseStateProperty(floorButtonProperty);
				if (result == null) result = caseXElevatorProperty(floorButtonProperty);
				if (result == null) result = caseProperty(floorButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorButtonProperty);
				if (result == null) result = caseAbstractProperty(floorButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UNARY_FLOOR_BUTTON_PROPERTY: {
				UnaryFloorButtonProperty unaryFloorButtonProperty = (UnaryFloorButtonProperty)theEObject;
				T1 result = caseUnaryFloorButtonProperty(unaryFloorButtonProperty);
				if (result == null) result = caseFloorButtonProperty(unaryFloorButtonProperty);
				if (result == null) result = caseUnaryProperty(unaryFloorButtonProperty);
				if (result == null) result = caseButtonProperty(unaryFloorButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(unaryFloorButtonProperty);
				if (result == null) result = caseStateProperty(unaryFloorButtonProperty);
				if (result == null) result = caseXElevatorProperty(unaryFloorButtonProperty);
				if (result == null) result = caseProperty(unaryFloorButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(unaryFloorButtonProperty);
				if (result == null) result = caseAbstractProperty(unaryFloorButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BINARY_FLOOR_BUTTON_PROPERTY: {
				BinaryFloorButtonProperty binaryFloorButtonProperty = (BinaryFloorButtonProperty)theEObject;
				T1 result = caseBinaryFloorButtonProperty(binaryFloorButtonProperty);
				if (result == null) result = caseFloorButtonProperty(binaryFloorButtonProperty);
				if (result == null) result = caseBinaryProperty(binaryFloorButtonProperty);
				if (result == null) result = caseButtonProperty(binaryFloorButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(binaryFloorButtonProperty);
				if (result == null) result = caseStateProperty(binaryFloorButtonProperty);
				if (result == null) result = caseXElevatorProperty(binaryFloorButtonProperty);
				if (result == null) result = caseProperty(binaryFloorButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(binaryFloorButtonProperty);
				if (result == null) result = caseAbstractProperty(binaryFloorButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_BUTTON_REQUESTED_FLOOR_PROPERTY: {
				FloorButtonRequestedFloorProperty floorButtonRequestedFloorProperty = (FloorButtonRequestedFloorProperty)theEObject;
				T1 result = caseFloorButtonRequestedFloorProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseFloorButtonProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseSingleReferenceProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseButtonProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorStateProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseStateProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = caseAbstractProperty(floorButtonRequestedFloorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_BUTTON_PRESSED_PROPERTY: {
				FloorButtonPressedProperty floorButtonPressedProperty = (FloorButtonPressedProperty)theEObject;
				T1 result = caseFloorButtonPressedProperty(floorButtonPressedProperty);
				if (result == null) result = caseFloorButtonProperty(floorButtonPressedProperty);
				if (result == null) result = caseBooleanAttributeProperty(floorButtonPressedProperty);
				if (result == null) result = caseButtonProperty(floorButtonPressedProperty);
				if (result == null) result = caseXElevatorStateProperty(floorButtonPressedProperty);
				if (result == null) result = caseStateProperty(floorButtonPressedProperty);
				if (result == null) result = caseXElevatorProperty(floorButtonPressedProperty);
				if (result == null) result = caseProperty(floorButtonPressedProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorButtonPressedProperty);
				if (result == null) result = caseAbstractProperty(floorButtonPressedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UP_BUTTON_PROPERTY: {
				UpButtonProperty<?> upButtonProperty = (UpButtonProperty<?>)theEObject;
				T1 result = caseUpButtonProperty(upButtonProperty);
				if (result == null) result = caseFloorButtonProperty(upButtonProperty);
				if (result == null) result = caseButtonProperty(upButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(upButtonProperty);
				if (result == null) result = caseStateProperty(upButtonProperty);
				if (result == null) result = caseXElevatorProperty(upButtonProperty);
				if (result == null) result = caseProperty(upButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(upButtonProperty);
				if (result == null) result = caseAbstractProperty(upButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UNARY_UP_BUTTON_PROPERTY: {
				UnaryUpButtonProperty unaryUpButtonProperty = (UnaryUpButtonProperty)theEObject;
				T1 result = caseUnaryUpButtonProperty(unaryUpButtonProperty);
				if (result == null) result = caseUpButtonProperty(unaryUpButtonProperty);
				if (result == null) result = caseUnaryProperty(unaryUpButtonProperty);
				if (result == null) result = caseFloorButtonProperty(unaryUpButtonProperty);
				if (result == null) result = caseButtonProperty(unaryUpButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(unaryUpButtonProperty);
				if (result == null) result = caseStateProperty(unaryUpButtonProperty);
				if (result == null) result = caseXElevatorProperty(unaryUpButtonProperty);
				if (result == null) result = caseProperty(unaryUpButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(unaryUpButtonProperty);
				if (result == null) result = caseAbstractProperty(unaryUpButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BINARY_UP_BUTTON_PROPERTY: {
				BinaryUpButtonProperty binaryUpButtonProperty = (BinaryUpButtonProperty)theEObject;
				T1 result = caseBinaryUpButtonProperty(binaryUpButtonProperty);
				if (result == null) result = caseUpButtonProperty(binaryUpButtonProperty);
				if (result == null) result = caseBinaryProperty(binaryUpButtonProperty);
				if (result == null) result = caseFloorButtonProperty(binaryUpButtonProperty);
				if (result == null) result = caseButtonProperty(binaryUpButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(binaryUpButtonProperty);
				if (result == null) result = caseStateProperty(binaryUpButtonProperty);
				if (result == null) result = caseXElevatorProperty(binaryUpButtonProperty);
				if (result == null) result = caseProperty(binaryUpButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(binaryUpButtonProperty);
				if (result == null) result = caseAbstractProperty(binaryUpButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UP_BUTTON_REQUESTED_FLOOR_PROPERTY: {
				UpButtonRequestedFloorProperty upButtonRequestedFloorProperty = (UpButtonRequestedFloorProperty)theEObject;
				T1 result = caseUpButtonRequestedFloorProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseUpButtonProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseSingleReferenceProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseFloorButtonProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseButtonProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorStateProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseStateProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(upButtonRequestedFloorProperty);
				if (result == null) result = caseAbstractProperty(upButtonRequestedFloorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UP_BUTTON_PRESSED_PROPERTY: {
				UpButtonPressedProperty upButtonPressedProperty = (UpButtonPressedProperty)theEObject;
				T1 result = caseUpButtonPressedProperty(upButtonPressedProperty);
				if (result == null) result = caseUpButtonProperty(upButtonPressedProperty);
				if (result == null) result = caseBooleanAttributeProperty(upButtonPressedProperty);
				if (result == null) result = caseFloorButtonProperty(upButtonPressedProperty);
				if (result == null) result = caseButtonProperty(upButtonPressedProperty);
				if (result == null) result = caseXElevatorStateProperty(upButtonPressedProperty);
				if (result == null) result = caseStateProperty(upButtonPressedProperty);
				if (result == null) result = caseXElevatorProperty(upButtonPressedProperty);
				if (result == null) result = caseProperty(upButtonPressedProperty);
				if (result == null) result = caseXElevatorAbstractProperty(upButtonPressedProperty);
				if (result == null) result = caseAbstractProperty(upButtonPressedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.DOWN_BUTTON_PROPERTY: {
				DownButtonProperty<?> downButtonProperty = (DownButtonProperty<?>)theEObject;
				T1 result = caseDownButtonProperty(downButtonProperty);
				if (result == null) result = caseFloorButtonProperty(downButtonProperty);
				if (result == null) result = caseButtonProperty(downButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(downButtonProperty);
				if (result == null) result = caseStateProperty(downButtonProperty);
				if (result == null) result = caseXElevatorProperty(downButtonProperty);
				if (result == null) result = caseProperty(downButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(downButtonProperty);
				if (result == null) result = caseAbstractProperty(downButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UNARY_DOWN_BUTTON_PROPERTY: {
				UnaryDownButtonProperty unaryDownButtonProperty = (UnaryDownButtonProperty)theEObject;
				T1 result = caseUnaryDownButtonProperty(unaryDownButtonProperty);
				if (result == null) result = caseDownButtonProperty(unaryDownButtonProperty);
				if (result == null) result = caseUnaryProperty(unaryDownButtonProperty);
				if (result == null) result = caseFloorButtonProperty(unaryDownButtonProperty);
				if (result == null) result = caseButtonProperty(unaryDownButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(unaryDownButtonProperty);
				if (result == null) result = caseStateProperty(unaryDownButtonProperty);
				if (result == null) result = caseXElevatorProperty(unaryDownButtonProperty);
				if (result == null) result = caseProperty(unaryDownButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(unaryDownButtonProperty);
				if (result == null) result = caseAbstractProperty(unaryDownButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BINARY_DOWN_BUTTON_PROPERTY: {
				BinaryDownButtonProperty binaryDownButtonProperty = (BinaryDownButtonProperty)theEObject;
				T1 result = caseBinaryDownButtonProperty(binaryDownButtonProperty);
				if (result == null) result = caseDownButtonProperty(binaryDownButtonProperty);
				if (result == null) result = caseBinaryProperty(binaryDownButtonProperty);
				if (result == null) result = caseFloorButtonProperty(binaryDownButtonProperty);
				if (result == null) result = caseButtonProperty(binaryDownButtonProperty);
				if (result == null) result = caseXElevatorStateProperty(binaryDownButtonProperty);
				if (result == null) result = caseStateProperty(binaryDownButtonProperty);
				if (result == null) result = caseXElevatorProperty(binaryDownButtonProperty);
				if (result == null) result = caseProperty(binaryDownButtonProperty);
				if (result == null) result = caseXElevatorAbstractProperty(binaryDownButtonProperty);
				if (result == null) result = caseAbstractProperty(binaryDownButtonProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.DOWN_BUTTON_REQUESTED_FLOOR_PROPERTY: {
				DownButtonRequestedFloorProperty downButtonRequestedFloorProperty = (DownButtonRequestedFloorProperty)theEObject;
				T1 result = caseDownButtonRequestedFloorProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseDownButtonProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseSingleReferenceProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseFloorButtonProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseButtonProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorStateProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseStateProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseXElevatorAbstractProperty(downButtonRequestedFloorProperty);
				if (result == null) result = caseAbstractProperty(downButtonRequestedFloorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.DOWN_BUTTON_PRESSED_PROPERTY: {
				DownButtonPressedProperty downButtonPressedProperty = (DownButtonPressedProperty)theEObject;
				T1 result = caseDownButtonPressedProperty(downButtonPressedProperty);
				if (result == null) result = caseDownButtonProperty(downButtonPressedProperty);
				if (result == null) result = caseBooleanAttributeProperty(downButtonPressedProperty);
				if (result == null) result = caseFloorButtonProperty(downButtonPressedProperty);
				if (result == null) result = caseButtonProperty(downButtonPressedProperty);
				if (result == null) result = caseXElevatorStateProperty(downButtonPressedProperty);
				if (result == null) result = caseStateProperty(downButtonPressedProperty);
				if (result == null) result = caseXElevatorProperty(downButtonPressedProperty);
				if (result == null) result = caseProperty(downButtonPressedProperty);
				if (result == null) result = caseXElevatorAbstractProperty(downButtonPressedProperty);
				if (result == null) result = caseAbstractProperty(downButtonPressedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_SYSTEM_PROPERTY: {
				ElevatorSystemProperty<?> elevatorSystemProperty = (ElevatorSystemProperty<?>)theEObject;
				T1 result = caseElevatorSystemProperty(elevatorSystemProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorSystemProperty);
				if (result == null) result = caseStateProperty(elevatorSystemProperty);
				if (result == null) result = caseXElevatorProperty(elevatorSystemProperty);
				if (result == null) result = caseProperty(elevatorSystemProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorSystemProperty);
				if (result == null) result = caseAbstractProperty(elevatorSystemProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.UNARY_ELEVATOR_SYSTEM_PROPERTY: {
				UnaryElevatorSystemProperty unaryElevatorSystemProperty = (UnaryElevatorSystemProperty)theEObject;
				T1 result = caseUnaryElevatorSystemProperty(unaryElevatorSystemProperty);
				if (result == null) result = caseElevatorSystemProperty(unaryElevatorSystemProperty);
				if (result == null) result = caseUnaryProperty(unaryElevatorSystemProperty);
				if (result == null) result = caseXElevatorStateProperty(unaryElevatorSystemProperty);
				if (result == null) result = caseStateProperty(unaryElevatorSystemProperty);
				if (result == null) result = caseXElevatorProperty(unaryElevatorSystemProperty);
				if (result == null) result = caseProperty(unaryElevatorSystemProperty);
				if (result == null) result = caseXElevatorAbstractProperty(unaryElevatorSystemProperty);
				if (result == null) result = caseAbstractProperty(unaryElevatorSystemProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.BINARY_ELEVATOR_SYSTEM_PROPERTY: {
				BinaryElevatorSystemProperty binaryElevatorSystemProperty = (BinaryElevatorSystemProperty)theEObject;
				T1 result = caseBinaryElevatorSystemProperty(binaryElevatorSystemProperty);
				if (result == null) result = caseElevatorSystemProperty(binaryElevatorSystemProperty);
				if (result == null) result = caseBinaryProperty(binaryElevatorSystemProperty);
				if (result == null) result = caseXElevatorStateProperty(binaryElevatorSystemProperty);
				if (result == null) result = caseStateProperty(binaryElevatorSystemProperty);
				if (result == null) result = caseXElevatorProperty(binaryElevatorSystemProperty);
				if (result == null) result = caseProperty(binaryElevatorSystemProperty);
				if (result == null) result = caseXElevatorAbstractProperty(binaryElevatorSystemProperty);
				if (result == null) result = caseAbstractProperty(binaryElevatorSystemProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_CONTAINER_PROPERTY: {
				ElevatorContainerProperty elevatorContainerProperty = (ElevatorContainerProperty)theEObject;
				T1 result = caseElevatorContainerProperty(elevatorContainerProperty);
				if (result == null) result = caseElevatorProperty(elevatorContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(elevatorContainerProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorContainerProperty);
				if (result == null) result = caseStateProperty(elevatorContainerProperty);
				if (result == null) result = caseXElevatorProperty(elevatorContainerProperty);
				if (result == null) result = caseProperty(elevatorContainerProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorContainerProperty);
				if (result == null) result = caseAbstractProperty(elevatorContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_SYSTEM_ELEVATORS_PROPERTY: {
				ElevatorSystemElevatorsProperty elevatorSystemElevatorsProperty = (ElevatorSystemElevatorsProperty)theEObject;
				T1 result = caseElevatorSystemElevatorsProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = caseElevatorSystemProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = caseManyReferenceProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = caseStateProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = caseXElevatorProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = caseProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = caseAbstractProperty(elevatorSystemElevatorsProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.FLOOR_CONTAINER_PROPERTY: {
				FloorContainerProperty floorContainerProperty = (FloorContainerProperty)theEObject;
				T1 result = caseFloorContainerProperty(floorContainerProperty);
				if (result == null) result = caseFloorProperty(floorContainerProperty);
				if (result == null) result = caseContainerReferenceProperty(floorContainerProperty);
				if (result == null) result = caseXElevatorStateProperty(floorContainerProperty);
				if (result == null) result = caseStateProperty(floorContainerProperty);
				if (result == null) result = caseXElevatorProperty(floorContainerProperty);
				if (result == null) result = caseProperty(floorContainerProperty);
				if (result == null) result = caseXElevatorAbstractProperty(floorContainerProperty);
				if (result == null) result = caseAbstractProperty(floorContainerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.ELEVATOR_SYSTEM_FLOORS_PROPERTY: {
				ElevatorSystemFloorsProperty elevatorSystemFloorsProperty = (ElevatorSystemFloorsProperty)theEObject;
				T1 result = caseElevatorSystemFloorsProperty(elevatorSystemFloorsProperty);
				if (result == null) result = caseElevatorSystemProperty(elevatorSystemFloorsProperty);
				if (result == null) result = caseManyReferenceProperty(elevatorSystemFloorsProperty);
				if (result == null) result = caseXElevatorStateProperty(elevatorSystemFloorsProperty);
				if (result == null) result = caseStateProperty(elevatorSystemFloorsProperty);
				if (result == null) result = caseXElevatorProperty(elevatorSystemFloorsProperty);
				if (result == null) result = caseProperty(elevatorSystemFloorsProperty);
				if (result == null) result = caseXElevatorAbstractProperty(elevatorSystemFloorsProperty);
				if (result == null) result = caseAbstractProperty(elevatorSystemFloorsProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_NEXT_PROPERTY: {
				XElevatorNextProperty xElevatorNextProperty = (XElevatorNextProperty)theEObject;
				T1 result = caseXElevatorNextProperty(xElevatorNextProperty);
				if (result == null) result = caseNextProperty(xElevatorNextProperty);
				if (result == null) result = caseXElevatorTemporalProperty(xElevatorNextProperty);
				if (result == null) result = caseTemporalProperty(xElevatorNextProperty);
				if (result == null) result = caseXElevatorAbstractProperty(xElevatorNextProperty);
				if (result == null) result = caseAbstractProperty(xElevatorNextProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_UNTIL_PROPERTY: {
				XElevatorUntilProperty xElevatorUntilProperty = (XElevatorUntilProperty)theEObject;
				T1 result = caseXElevatorUntilProperty(xElevatorUntilProperty);
				if (result == null) result = caseUntilProperty(xElevatorUntilProperty);
				if (result == null) result = caseXElevatorTemporalProperty(xElevatorUntilProperty);
				if (result == null) result = caseTemporalProperty(xElevatorUntilProperty);
				if (result == null) result = caseXElevatorAbstractProperty(xElevatorUntilProperty);
				if (result == null) result = caseAbstractProperty(xElevatorUntilProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_RELEASE_PROPERTY: {
				XElevatorReleaseProperty xElevatorReleaseProperty = (XElevatorReleaseProperty)theEObject;
				T1 result = caseXElevatorReleaseProperty(xElevatorReleaseProperty);
				if (result == null) result = caseReleaseProperty(xElevatorReleaseProperty);
				if (result == null) result = caseXElevatorTemporalProperty(xElevatorReleaseProperty);
				if (result == null) result = caseTemporalProperty(xElevatorReleaseProperty);
				if (result == null) result = caseXElevatorAbstractProperty(xElevatorReleaseProperty);
				if (result == null) result = caseAbstractProperty(xElevatorReleaseProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorPropertyPackage.XELEVATOR_NEGATION_TEMPORAL_PROPERTY: {
				XElevatorNegationTemporalProperty xElevatorNegationTemporalProperty = (XElevatorNegationTemporalProperty)theEObject;
				T1 result = caseXElevatorNegationTemporalProperty(xElevatorNegationTemporalProperty);
				if (result == null) result = caseNegationTemporalProperty(xElevatorNegationTemporalProperty);
				if (result == null) result = caseXElevatorTemporalProperty(xElevatorNegationTemporalProperty);
				if (result == null) result = caseTemporalProperty(xElevatorNegationTemporalProperty);
				if (result == null) result = caseXElevatorAbstractProperty(xElevatorNegationTemporalProperty);
				if (result == null) result = caseAbstractProperty(xElevatorNegationTemporalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Open Door Up Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Open Door Up Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorOpenDoorUpProperty(ElevatorOpenDoorUpProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Close Door Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Close Door Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorCloseDoorProperty(ElevatorCloseDoorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Move Up Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Move Up Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorMoveUpProperty(ElevatorMoveUpProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Change To Up Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Change To Up Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorChangeToUpProperty(ElevatorChangeToUpProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Open Door Down Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Open Door Down Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorOpenDoorDownProperty(ElevatorOpenDoorDownProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Move Down Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Move Down Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorMoveDownProperty(ElevatorMoveDownProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Change To Down Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Change To Down Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorChangeToDownProperty(ElevatorChangeToDownProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Press Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Press Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonPressProperty(ButtonPressProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorAbstractProperty(XElevatorAbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorTemporalProperty(XElevatorTemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorProperty(XElevatorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator State Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator State Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseXElevatorStateProperty(XElevatorStateProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Step Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Step Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseXElevatorStepProperty(XElevatorStepProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Floor> T1 caseFloorProperty(FloorProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryFloorProperty(UnaryFloorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryFloorProperty(BinaryFloorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Next Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Next Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloorNextProperty(FloorNextProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Nr Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Nr Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloorNrProperty(FloorNrProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonContainerProperty(ButtonContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Button> T1 caseButtonProperty(ButtonProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryButtonProperty(UnaryButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryButtonProperty(BinaryButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Requested Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Requested Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonRequestedFloorProperty(ButtonRequestedFloorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Pressed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Pressed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonPressedProperty(ButtonPressedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Floor Buttons Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Floor Buttons Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloorFloorButtonsProperty(FloorFloorButtonsProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Previous Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Previous Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloorPreviousProperty(FloorPreviousProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Elevator> T1 caseElevatorProperty(ElevatorProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Elevator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Elevator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryElevatorProperty(UnaryElevatorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Elevator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Elevator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryElevatorProperty(BinaryElevatorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Button Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Button Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorButtonContainerProperty(ElevatorButtonContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ElevatorButton> T1 caseElevatorButtonProperty(ElevatorButtonProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Elevator Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Elevator Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryElevatorButtonProperty(UnaryElevatorButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Elevator Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Elevator Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryElevatorButtonProperty(BinaryElevatorButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Button Requested Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Button Requested Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorButtonRequestedFloorProperty(ElevatorButtonRequestedFloorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Button Pressed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Button Pressed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorButtonPressedProperty(ElevatorButtonPressedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Elevator Buttons Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Elevator Buttons Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorElevatorButtonsProperty(ElevatorElevatorButtonsProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Doors Open Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Doors Open Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorDoorsOpenProperty(ElevatorDoorsOpenProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Going Up Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Going Up Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorGoingUpProperty(ElevatorGoingUpProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Current Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Current Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorCurrentFloorProperty(ElevatorCurrentFloorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends FloorButton> T1 caseFloorButtonProperty(FloorButtonProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Floor Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Floor Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryFloorButtonProperty(UnaryFloorButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Floor Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Floor Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryFloorButtonProperty(BinaryFloorButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Button Requested Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Button Requested Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloorButtonRequestedFloorProperty(FloorButtonRequestedFloorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Button Pressed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Button Pressed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloorButtonPressedProperty(FloorButtonPressedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Up Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Up Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends UpButton> T1 caseUpButtonProperty(UpButtonProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Up Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Up Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryUpButtonProperty(UnaryUpButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Up Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Up Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryUpButtonProperty(BinaryUpButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Up Button Requested Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Up Button Requested Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUpButtonRequestedFloorProperty(UpButtonRequestedFloorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Up Button Pressed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Up Button Pressed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUpButtonPressedProperty(UpButtonPressedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Down Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Down Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends DownButton> T1 caseDownButtonProperty(DownButtonProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Down Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Down Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryDownButtonProperty(UnaryDownButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Down Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Down Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryDownButtonProperty(BinaryDownButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Down Button Requested Floor Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Down Button Requested Floor Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDownButtonRequestedFloorProperty(DownButtonRequestedFloorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Down Button Pressed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Down Button Pressed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDownButtonPressedProperty(DownButtonPressedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator System Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator System Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ElevatorSystem> T1 caseElevatorSystemProperty(ElevatorSystemProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Elevator System Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Elevator System Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryElevatorSystemProperty(UnaryElevatorSystemProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Elevator System Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Elevator System Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryElevatorSystemProperty(BinaryElevatorSystemProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorContainerProperty(ElevatorContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator System Elevators Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator System Elevators Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorSystemElevatorsProperty(ElevatorSystemElevatorsProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Container Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Container Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloorContainerProperty(FloorContainerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator System Floors Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator System Floors Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorSystemFloorsProperty(ElevatorSystemFloorsProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Next Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Next Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorNextProperty(XElevatorNextProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Until Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorUntilProperty(XElevatorUntilProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Release Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Release Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorReleaseProperty(XElevatorReleaseProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Negation Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Negation Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorNegationTemporalProperty(XElevatorNegationTemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractProperty(AbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseStepProperty(StepProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTemporalProperty(TemporalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseStateProperty(StateProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseUnaryProperty(UnaryProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseBinaryProperty(BinaryProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseSingleReferenceProperty(SingleReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseIntegerAttributeProperty(IntegerAttributeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseContainerReferenceProperty(ContainerReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseBooleanAttributeProperty(BooleanAttributeProperty<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends StateProperty<?>, T> T1 caseManyReferenceProperty(ManyReferenceProperty<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseNextProperty(NextProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseUntilProperty(UntilProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends AbstractProperty> T1 caseReleaseProperty(ReleaseProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation Temporal Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation Temporal Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends TemporalProperty> T1 caseNegationTemporalProperty(NegationTemporalProperty<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //XElevatorPropertySwitch
