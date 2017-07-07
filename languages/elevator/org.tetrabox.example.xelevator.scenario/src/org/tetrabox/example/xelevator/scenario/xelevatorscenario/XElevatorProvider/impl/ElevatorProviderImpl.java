/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementProviderImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.Elevator;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorProvider;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ElevatorProviderImpl extends ElementProviderImpl<Elevator> implements ElevatorProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorProviderPackage.Literals.ELEVATOR_PROVIDER;
	}

} //ElevatorProviderImpl
