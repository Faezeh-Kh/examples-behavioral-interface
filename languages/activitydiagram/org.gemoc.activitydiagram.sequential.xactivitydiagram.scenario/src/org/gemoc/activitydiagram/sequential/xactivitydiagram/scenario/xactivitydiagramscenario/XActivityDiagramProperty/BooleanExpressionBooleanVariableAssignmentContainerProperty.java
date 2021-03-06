/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression Boolean Variable Assignment Container Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getBooleanExpressionBooleanVariableAssignmentContainerProperty()
 * @model
 * @generated
 */
public interface BooleanExpressionBooleanVariableAssignmentContainerProperty extends BooleanExpressionProperty<BooleanExpression>, ContainerReferenceProperty<BooleanVariableAssignmentProperty<BooleanVariableAssignment>, BooleanExpression> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // BooleanExpressionBooleanVariableAssignmentContainerProperty
