/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.FloorButton;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor Button Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FloorButtonPropertyImpl<T extends FloorButton> extends ButtonPropertyImpl<T> implements FloorButtonProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorButtonPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.FLOOR_BUTTON_PROPERTY;
	}

} //FloorButtonPropertyImpl
