/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.ManyReferenceProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Locals Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getActivityLocalsProperty()
 * @model
 * @generated
 */
public interface ActivityLocalsProperty extends ActivityProperty<Activity>, ManyReferenceProperty<VariableProperty<Variable>, Activity> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.ACTIVITY__LOCALS;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // ActivityLocalsProperty
