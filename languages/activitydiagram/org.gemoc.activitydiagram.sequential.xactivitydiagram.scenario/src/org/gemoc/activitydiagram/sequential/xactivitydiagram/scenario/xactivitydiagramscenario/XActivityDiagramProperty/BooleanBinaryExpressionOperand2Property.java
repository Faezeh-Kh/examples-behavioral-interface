/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Binary Expression Operand2 Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getBooleanBinaryExpressionOperand2Property()
 * @model
 * @generated
 */
public interface BooleanBinaryExpressionOperand2Property extends BooleanBinaryExpressionProperty<BooleanBinaryExpression>, SingleReferenceProperty<BooleanExpressionProperty<BooleanExpression>, BooleanBinaryExpression> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND2;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // BooleanBinaryExpressionOperand2Property
