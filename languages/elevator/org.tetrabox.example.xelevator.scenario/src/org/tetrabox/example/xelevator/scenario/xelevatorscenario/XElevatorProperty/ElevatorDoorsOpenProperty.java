/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.Elevator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator Doors Open Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorDoorsOpenProperty()
 * @model
 * @generated
 */
public interface ElevatorDoorsOpenProperty extends ElevatorProperty<Elevator>, BooleanAttributeProperty<Elevator> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.ELEVATOR__DOORS_OPEN;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ElevatorDoorsOpenProperty
