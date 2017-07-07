/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import fr.inria.diverse.event.commons.model.property.impl.StatePropertyImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorStateProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XElevator State Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class XElevatorStatePropertyImpl<T> extends StatePropertyImpl<T> implements XElevatorStateProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorStatePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.XELEVATOR_STATE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setTarget(T newTarget) {
		super.setTarget(newTarget);
	}

} //XElevatorStatePropertyImpl
