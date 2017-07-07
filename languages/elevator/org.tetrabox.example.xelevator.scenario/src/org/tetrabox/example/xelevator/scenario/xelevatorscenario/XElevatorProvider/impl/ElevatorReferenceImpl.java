/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementReferenceImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.Elevator;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ElevatorReference;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ElevatorReferenceImpl extends ElementReferenceImpl<Elevator> implements ElevatorReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorProviderPackage.Literals.ELEVATOR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setElement(Elevator newElement) {
		super.setElement(newElement);
	}

} //ElevatorReferenceImpl
