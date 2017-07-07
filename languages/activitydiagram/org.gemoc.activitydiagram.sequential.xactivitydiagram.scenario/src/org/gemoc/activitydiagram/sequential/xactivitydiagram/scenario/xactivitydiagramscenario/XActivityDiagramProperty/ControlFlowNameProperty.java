/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.StringAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Name Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getControlFlowNameProperty()
 * @model
 * @generated
 */
public interface ControlFlowNameProperty extends ControlFlowProperty<ControlFlow>, StringAttributeProperty<ControlFlow> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.NAMED_ELEMENT__NAME;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ControlFlowNameProperty
