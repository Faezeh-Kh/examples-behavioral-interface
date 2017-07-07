/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.Button;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ButtonPropertyImpl<T extends Button> extends XElevatorStatePropertyImpl<T> implements ButtonProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.BUTTON_PROPERTY;
	}

} //ButtonPropertyImpl
