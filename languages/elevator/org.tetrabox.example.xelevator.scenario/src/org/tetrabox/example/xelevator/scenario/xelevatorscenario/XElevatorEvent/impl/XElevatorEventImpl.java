/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.EventImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEvent;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XElevator Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class XElevatorEventImpl<T> extends EventImpl<T> implements XElevatorEvent<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorEventPackage.Literals.XELEVATOR_EVENT;
	}

} //XElevatorEventImpl
