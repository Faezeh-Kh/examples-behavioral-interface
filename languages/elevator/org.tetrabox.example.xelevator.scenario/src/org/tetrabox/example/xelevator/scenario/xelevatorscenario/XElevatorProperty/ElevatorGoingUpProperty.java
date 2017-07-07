/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.Elevator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator Going Up Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorGoingUpProperty()
 * @model
 * @generated
 */
public interface ElevatorGoingUpProperty extends ElevatorProperty<Elevator>, BooleanAttributeProperty<Elevator> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.ELEVATOR__GOING_UP;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ElevatorGoingUpProperty
