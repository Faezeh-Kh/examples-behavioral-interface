/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementQueryImpl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.MergeNodeQuery;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Node Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MergeNodeQueryImpl extends ElementQueryImpl<MergeNode, StateProperty<MergeNode>> implements MergeNodeQuery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeNodeQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramProviderPackage.Literals.MERGE_NODE_QUERY;
	}

} //MergeNodeQueryImpl
