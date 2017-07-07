/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementReferenceImpl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.DecisionNodeReference;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DecisionNodeReferenceImpl extends ElementReferenceImpl<DecisionNode> implements DecisionNodeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramProviderPackage.Literals.DECISION_NODE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setElement(DecisionNode newElement) {
		super.setElement(newElement);
	}

} //DecisionNodeReferenceImpl
