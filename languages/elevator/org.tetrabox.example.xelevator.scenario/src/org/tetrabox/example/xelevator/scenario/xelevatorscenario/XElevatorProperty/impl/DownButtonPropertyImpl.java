/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.DownButton;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.DownButtonProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Down Button Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DownButtonPropertyImpl<T extends DownButton> extends FloorButtonPropertyImpl<T> implements DownButtonProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DownButtonPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.DOWN_BUTTON_PROPERTY;
	}

} //DownButtonPropertyImpl
