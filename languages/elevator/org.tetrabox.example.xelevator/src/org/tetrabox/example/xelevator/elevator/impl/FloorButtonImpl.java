/**
 */
package org.tetrabox.example.xelevator.elevator.impl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.ElevatorPackage;
import org.tetrabox.example.xelevator.elevator.FloorButton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FloorButtonImpl extends ButtonImpl implements FloorButton {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElevatorPackage.Literals.FLOOR_BUTTON;
	}

} //FloorButtonImpl
