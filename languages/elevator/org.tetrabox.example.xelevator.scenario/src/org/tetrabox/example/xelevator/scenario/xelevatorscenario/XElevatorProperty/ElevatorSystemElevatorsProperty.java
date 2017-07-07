/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator System Elevators Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorSystemElevatorsProperty()
 * @model
 * @generated
 */
public interface ElevatorSystemElevatorsProperty extends ElevatorSystemProperty<ElevatorSystem>, ManyReferenceProperty<ElevatorProperty<Elevator>, ElevatorSystem> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.ELEVATOR_SYSTEM__ELEVATORS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ElevatorSystemElevatorsProperty
