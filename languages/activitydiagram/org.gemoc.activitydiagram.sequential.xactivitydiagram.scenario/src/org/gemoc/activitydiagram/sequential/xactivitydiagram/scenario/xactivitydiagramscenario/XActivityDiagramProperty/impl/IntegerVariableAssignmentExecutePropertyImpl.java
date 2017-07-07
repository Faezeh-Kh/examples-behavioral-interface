/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExecuteProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Variable Assignment Execute Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntegerVariableAssignmentExecutePropertyImpl extends XActivityDiagramStepPropertyImpl<IntegerVariableAssignment> implements IntegerVariableAssignmentExecuteProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerVariableAssignmentExecutePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getIntegerVariableAssignmentExecuteProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		java.util.Iterator<EOperation> it = org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.INTEGER_VARIABLE_ASSIGNMENT.getEOperations().iterator();
		EOperation result = null;
		while (it.hasNext() && result == null) {
			EOperation op = it.next();
			if (op.getName().equals("execute")) {
				result = op;
			}
		}
		return result;
		
	}

} //IntegerVariableAssignmentExecutePropertyImpl
