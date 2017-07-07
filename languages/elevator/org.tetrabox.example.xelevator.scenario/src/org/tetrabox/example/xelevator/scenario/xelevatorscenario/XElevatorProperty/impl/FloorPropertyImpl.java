/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.Floor;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.FloorProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FloorPropertyImpl<T extends Floor> extends XElevatorStatePropertyImpl<T> implements FloorProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.FLOOR_PROPERTY;
	}

} //FloorPropertyImpl
