/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorButton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator Elevator Buttons Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorElevatorButtonsProperty()
 * @model
 * @generated
 */
public interface ElevatorElevatorButtonsProperty extends ElevatorProperty<Elevator>, ManyReferenceProperty<ElevatorButtonProperty<ElevatorButton>, Elevator> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.ELEVATOR__ELEVATOR_BUTTONS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ElevatorElevatorButtonsProperty
