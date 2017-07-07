/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.ElevatorButton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator Button Pressed Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorButtonPressedProperty()
 * @model
 * @generated
 */
public interface ElevatorButtonPressedProperty extends ElevatorButtonProperty<ElevatorButton>, BooleanAttributeProperty<ElevatorButton> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.BUTTON__PRESSED;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ElevatorButtonPressedProperty
