/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.ElevatorButton;
import org.tetrabox.example.xelevator.elevator.Floor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator Button Requested Floor Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorButtonRequestedFloorProperty()
 * @model
 * @generated
 */
public interface ElevatorButtonRequestedFloorProperty extends ElevatorButtonProperty<ElevatorButton>, SingleReferenceProperty<FloorProperty<Floor>, ElevatorButton> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.BUTTON__REQUESTED_FLOOR;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ElevatorButtonRequestedFloorProperty
