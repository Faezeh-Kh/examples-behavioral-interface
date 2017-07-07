/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.ElevatorSystem;
import org.tetrabox.example.xelevator.elevator.Floor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator System Floors Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorSystemFloorsProperty()
 * @model
 * @generated
 */
public interface ElevatorSystemFloorsProperty extends ElevatorSystemProperty<ElevatorSystem>, ManyReferenceProperty<FloorProperty<Floor>, ElevatorSystem> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.ELEVATOR_SYSTEM__FLOORS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ElevatorSystemFloorsProperty
