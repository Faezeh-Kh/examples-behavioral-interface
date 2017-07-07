/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ContainerReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Expression Integer Variable Assignment Container Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getIntegerExpressionIntegerVariableAssignmentContainerProperty()
 * @model
 * @generated
 */
public interface IntegerExpressionIntegerVariableAssignmentContainerProperty extends IntegerExpressionProperty<IntegerExpression>, ContainerReferenceProperty<IntegerVariableAssignmentProperty<IntegerVariableAssignment>, IntegerExpression> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // IntegerExpressionIntegerVariableAssignmentContainerProperty
