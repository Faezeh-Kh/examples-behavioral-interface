/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementQueryImpl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.AcceptEventActionQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Event Action Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AcceptEventActionQueryImpl extends ElementQueryImpl<AcceptEventAction, StateProperty<AcceptEventAction>> implements AcceptEventActionQuery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramProviderPackage.Literals.ACCEPT_EVENT_ACTION_QUERY;
	}

} //AcceptEventActionQueryImpl
