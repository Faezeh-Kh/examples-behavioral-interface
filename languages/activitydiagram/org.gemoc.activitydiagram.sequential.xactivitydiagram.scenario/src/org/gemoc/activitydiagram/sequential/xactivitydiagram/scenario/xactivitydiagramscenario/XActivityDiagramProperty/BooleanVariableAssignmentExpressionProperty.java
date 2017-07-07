/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Assignment Expression Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getBooleanVariableAssignmentExpressionProperty()
 * @model
 * @generated
 */
public interface BooleanVariableAssignmentExpressionProperty extends BooleanVariableAssignmentProperty<BooleanVariableAssignment>, SingleReferenceProperty<BooleanExpressionProperty<BooleanExpression>, BooleanVariableAssignment> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.BOOLEAN_VARIABLE_ASSIGNMENT__EXPRESSION;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // BooleanVariableAssignmentExpressionProperty
