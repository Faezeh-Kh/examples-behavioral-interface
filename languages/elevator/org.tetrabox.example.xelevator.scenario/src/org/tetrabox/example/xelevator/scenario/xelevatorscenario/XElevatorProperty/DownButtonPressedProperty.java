/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.DownButton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Down Button Pressed Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getDownButtonPressedProperty()
 * @model
 * @generated
 */
public interface DownButtonPressedProperty extends DownButtonProperty<DownButton>, BooleanAttributeProperty<DownButton> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.BUTTON__PRESSED;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // DownButtonPressedProperty
