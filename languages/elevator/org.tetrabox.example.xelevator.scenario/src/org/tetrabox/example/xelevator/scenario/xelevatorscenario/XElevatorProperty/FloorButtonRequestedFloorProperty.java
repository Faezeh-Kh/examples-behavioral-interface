/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.Floor;
import org.tetrabox.example.xelevator.elevator.FloorButton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor Button Requested Floor Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getFloorButtonRequestedFloorProperty()
 * @model
 * @generated
 */
public interface FloorButtonRequestedFloorProperty extends FloorButtonProperty<FloorButton>, SingleReferenceProperty<FloorProperty<Floor>, FloorButton> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.BUTTON__REQUESTED_FLOOR;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // FloorButtonRequestedFloorProperty
