/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.BooleanAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Node Running Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getControlNodeRunningProperty()
 * @model
 * @generated
 */
public interface ControlNodeRunningProperty extends ControlNodeProperty<ControlNode>, BooleanAttributeProperty<ControlNode> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY_NODE__RUNNING;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ControlNodeRunningProperty
