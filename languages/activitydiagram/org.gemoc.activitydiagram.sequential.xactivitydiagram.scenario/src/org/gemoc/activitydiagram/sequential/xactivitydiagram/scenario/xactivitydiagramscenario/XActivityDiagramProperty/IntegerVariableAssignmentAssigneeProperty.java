/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable Assignment Assignee Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getIntegerVariableAssignmentAssigneeProperty()
 * @model
 * @generated
 */
public interface IntegerVariableAssignmentAssigneeProperty extends IntegerVariableAssignmentProperty<IntegerVariableAssignment>, SingleReferenceProperty<IntegerVariableProperty<IntegerVariable>, IntegerVariableAssignment> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.INTEGER_VARIABLE_ASSIGNMENT__ASSIGNEE;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // IntegerVariableAssignmentAssigneeProperty
