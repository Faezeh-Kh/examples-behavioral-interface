/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorButton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator Button Container Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorButtonContainerProperty()
 * @model
 * @generated
 */
public interface ElevatorButtonContainerProperty extends ElevatorButtonProperty<ElevatorButton>, ContainerReferenceProperty<ElevatorProperty<Elevator>, ElevatorButton> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ElevatorButtonContainerProperty
