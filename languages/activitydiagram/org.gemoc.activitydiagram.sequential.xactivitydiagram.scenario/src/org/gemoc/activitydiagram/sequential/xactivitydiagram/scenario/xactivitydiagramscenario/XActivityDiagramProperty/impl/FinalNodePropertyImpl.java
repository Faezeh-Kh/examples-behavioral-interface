/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeProperty;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Node Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FinalNodePropertyImpl<T extends FinalNode> extends ControlNodePropertyImpl<T> implements FinalNodeProperty<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalNodePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramPropertyPackage.eINSTANCE.getFinalNodeProperty();
	}

} //FinalNodePropertyImpl
