/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Assignment Assignee Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getBooleanVariableAssignmentAssigneeProperty()
 * @model
 * @generated
 */
public interface BooleanVariableAssignmentAssigneeProperty extends BooleanVariableAssignmentProperty<BooleanVariableAssignment>, SingleReferenceProperty<BooleanVariableProperty<BooleanVariable>, BooleanVariableAssignment> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.BOOLEAN_VARIABLE_ASSIGNMENT__ASSIGNEE;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // BooleanVariableAssignmentAssigneeProperty
