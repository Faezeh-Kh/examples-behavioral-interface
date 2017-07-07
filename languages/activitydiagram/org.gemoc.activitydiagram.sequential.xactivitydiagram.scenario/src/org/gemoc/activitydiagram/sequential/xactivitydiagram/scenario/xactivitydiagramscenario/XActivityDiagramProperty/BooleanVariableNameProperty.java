/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.StringAttributeProperty;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Name Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#getBooleanVariableNameProperty()
 * @model
 * @generated
 */
public interface BooleanVariableNameProperty extends BooleanVariableProperty<BooleanVariable>, StringAttributeProperty<BooleanVariable> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.Literals.VARIABLE__NAME;'"
	 * @generated
	 */
	EStructuralFeature getFeature();

} // BooleanVariableNameProperty
