/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.SingleReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Unary Expression Operand Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getBooleanUnaryExpressionOperandProperty()
 * @model
 * @generated
 */
public interface BooleanUnaryExpressionOperandProperty extends BooleanUnaryExpressionProperty<BooleanUnaryExpression>, SingleReferenceProperty<BooleanExpressionProperty<BooleanExpression>, BooleanUnaryExpression> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.BOOLEAN_UNARY_EXPRESSION__OPERAND;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // BooleanUnaryExpressionOperandProperty
