/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementQueryImpl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.JoinNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JoinNodeQueryImpl extends ElementQueryImpl<JoinNode, StateProperty<JoinNode>> implements JoinNodeQuery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramProviderPackage.Literals.JOIN_NODE_QUERY;
	}

} //JoinNodeQueryImpl
