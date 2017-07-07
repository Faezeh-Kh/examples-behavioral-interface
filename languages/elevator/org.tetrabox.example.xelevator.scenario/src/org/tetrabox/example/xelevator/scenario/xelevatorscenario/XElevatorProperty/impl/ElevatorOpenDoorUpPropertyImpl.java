/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.xelevator.elevator.Elevator;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorUpProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator Open Door Up Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ElevatorOpenDoorUpPropertyImpl extends XElevatorStepPropertyImpl<Elevator> implements ElevatorOpenDoorUpProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorOpenDoorUpPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.ELEVATOR_OPEN_DOOR_UP_PROPERTY;
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
			if (op.getName().equals("openDoorUp")) {
				result = op;
			}
		}
		return result;
		
	}

} //ElevatorOpenDoorUpPropertyImpl
