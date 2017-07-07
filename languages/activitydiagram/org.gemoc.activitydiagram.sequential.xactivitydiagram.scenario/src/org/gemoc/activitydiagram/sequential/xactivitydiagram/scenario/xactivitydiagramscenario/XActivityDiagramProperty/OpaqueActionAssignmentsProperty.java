/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action Assignments Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getOpaqueActionAssignmentsProperty()
 * @model
 * @generated
 */
public interface OpaqueActionAssignmentsProperty extends OpaqueActionProperty<OpaqueAction>, ManyReferenceProperty<VariableAssignmentProperty<VariableAssignment>, OpaqueAction> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.OPAQUE_ACTION__ASSIGNMENTS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // OpaqueActionAssignmentsProperty
