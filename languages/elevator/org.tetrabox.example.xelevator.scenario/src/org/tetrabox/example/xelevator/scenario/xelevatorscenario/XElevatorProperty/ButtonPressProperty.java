/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.xelevator.elevator.Button;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Press Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getButtonPressProperty()
 * @model
 * @generated
 */
public interface ButtonPressProperty extends XElevatorStepProperty<Button> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Iterator<EOperation> it = org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.BUTTON.getEOperations().iterator();\nEOperation result = null;\nwhile (it.hasNext() && result == null) {\n\tEOperation op = it.next();\n\tif (op.getName().equals(\"press\")) {\n\t\tresult = op;\n\t}\n}\nreturn result;\n'"
	 * @generated
	 */
	EOperation getOperation();

} // ButtonPressProperty
