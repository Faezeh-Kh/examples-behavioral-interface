/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Binary Expression Operand1 Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getIntegerBinaryExpressionOperand1Property()
 * @model
 * @generated
 */
public interface IntegerBinaryExpressionOperand1Property extends IntegerBinaryExpressionProperty<IntegerBinaryExpression>, SingleReferenceProperty<IntegerExpressionProperty<IntegerExpression>, IntegerBinaryExpression> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.INTEGER_BINARY_EXPRESSION__OPERAND1;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // IntegerBinaryExpressionOperand1Property
