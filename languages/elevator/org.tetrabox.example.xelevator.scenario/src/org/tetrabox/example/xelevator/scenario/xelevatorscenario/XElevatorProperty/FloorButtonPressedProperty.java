/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.FloorButton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor Button Pressed Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getFloorButtonPressedProperty()
 * @model
 * @generated
 */
public interface FloorButtonPressedProperty extends FloorButtonProperty<FloorButton>, BooleanAttributeProperty<FloorButton> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.BUTTON__PRESSED;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // FloorButtonPressedProperty
