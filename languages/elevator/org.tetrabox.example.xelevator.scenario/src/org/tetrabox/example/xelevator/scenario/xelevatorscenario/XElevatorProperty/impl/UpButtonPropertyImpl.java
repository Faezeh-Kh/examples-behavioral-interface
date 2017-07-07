/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.UpButton;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.UpButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Up Button Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class UpButtonPropertyImpl<T extends UpButton> extends FloorButtonPropertyImpl<T> implements UpButtonProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpButtonPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.UP_BUTTON_PROPERTY;
	}

} //UpButtonPropertyImpl
