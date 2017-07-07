/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.xelevator.elevator.Button;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.ButtonPressProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Press Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ButtonPressPropertyImpl extends XElevatorStepPropertyImpl<Button> implements ButtonPressProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonPressPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.BUTTON_PRESS_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		java.util.Iterator<EOperation> it = org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.BUTTON.getEOperations().iterator();
		EOperation result = null;
		while (it.hasNext() && result == null) {
			EOperation op = it.next();
			if (op.getName().equals("press")) {
				result = op;
			}
		}
		return result;
		
	}

} //ButtonPressPropertyImpl
