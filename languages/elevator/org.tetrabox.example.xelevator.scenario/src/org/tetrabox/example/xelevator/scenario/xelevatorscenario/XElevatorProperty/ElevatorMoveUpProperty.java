/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty;

import org.eclipse.emf.ecore.EOperation;

import org.tetrabox.example.xelevator.elevator.Elevator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevator Move Up Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage#getElevatorMoveUpProperty()
 * @model
 * @generated
 */
public interface ElevatorMoveUpProperty extends XElevatorStepProperty<Elevator> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Iterator<EOperation> it = org.tetrabox.example.xelevator.elevator.ElevatorPackage.Literals.ELEVATOR.getEOperations().iterator();\nEOperation result = null;\nwhile (it.hasNext() && result == null) {\n\tEOperation op = it.next();\n\tif (op.getName().equals(\"moveUp\")) {\n\t\tresult = op;\n\t}\n}\nreturn result;\n'"
	 * @generated
	 */
	EOperation getOperation();

} // ElevatorMoveUpProperty
