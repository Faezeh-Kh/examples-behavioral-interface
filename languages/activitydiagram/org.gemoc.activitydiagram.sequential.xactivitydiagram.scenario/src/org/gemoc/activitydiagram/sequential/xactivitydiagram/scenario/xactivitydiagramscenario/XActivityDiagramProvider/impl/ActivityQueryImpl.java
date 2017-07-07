/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementQueryImpl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.ActivityQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActivityQueryImpl extends ElementQueryImpl<Activity, StateProperty<Activity>> implements ActivityQuery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramProviderPackage.Literals.ACTIVITY_QUERY;
	}

} //ActivityQueryImpl
