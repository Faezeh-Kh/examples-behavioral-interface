/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.xelevator.elevator.Elevator;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ElevatorOpenDoorDownProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elevator Open Door Down Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ElevatorOpenDoorDownPropertyImpl extends XElevatorStepPropertyImpl<Elevator> implements ElevatorOpenDoorDownProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevatorOpenDoorDownPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.ELEVATOR_OPEN_DOOR_DOWN_PROPERTY;
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
			if (op.getName().equals("openDoorDown")) {
				result = op;
			}
		}
		return result;
		
	}

} //ElevatorOpenDoorDownPropertyImpl
