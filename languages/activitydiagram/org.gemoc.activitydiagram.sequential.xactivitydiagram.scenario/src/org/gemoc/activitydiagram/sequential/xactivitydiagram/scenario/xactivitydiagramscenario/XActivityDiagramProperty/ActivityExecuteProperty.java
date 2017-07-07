/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import org.eclipse.emf.ecore.EOperation;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Execute Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getActivityExecuteProperty()
 * @model
 * @generated
 */
public interface ActivityExecuteProperty extends XActivityDiagramStepProperty<Activity> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Iterator<EOperation> it = org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY.getEOperations().iterator();\nEOperation result = null;\nwhile (it.hasNext() && result == null) {\n\tEOperation op = it.next();\n\tif (op.getName().equals(\"execute\")) {\n\t\tresult = op;\n\t}\n}\nreturn result;\n'"
	 * @generated
	 */
	EOperation getOperation();

} // ActivityExecuteProperty
