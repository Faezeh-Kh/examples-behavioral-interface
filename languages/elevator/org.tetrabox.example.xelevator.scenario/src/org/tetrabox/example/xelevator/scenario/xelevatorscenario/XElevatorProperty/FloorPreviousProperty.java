/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.Floor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor Previous Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getFloorPreviousProperty()
 * @model
 * @generated
 */
public interface FloorPreviousProperty extends FloorProperty<Floor>, SingleReferenceProperty<FloorProperty<Floor>, Floor> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.FLOOR__PREVIOUS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // FloorPreviousProperty
