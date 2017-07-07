/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.xelevator.elevator.Elevator;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorMoveUpProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator Move Up Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ElevatorMoveUpPropertyImpl extends XElevatorStepPropertyImpl<Elevator> implements ElevatorMoveUpProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorMoveUpPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.ELEVATOR_MOVE_UP_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		java.util.Iterator<EOperation> it = org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.ELEVATOR.getEOperations().iterator();
		EOperation result = null;
		while (it.hasNext() && result == null) {
			EOperation op = it.next();
			if (op.getName().equals("moveUp")) {
				result = op;
			}
		}
		return result;
		
	}

} //ElevatorMoveUpPropertyImpl
