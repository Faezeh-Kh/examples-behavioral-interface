/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenario;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioElement;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XActivity Diagram Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XActivityDiagramScenarioImpl extends ScenarioImpl<XActivityDiagramScenarioElement> implements XActivityDiagramScenario {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XActivityDiagramScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XActivityDiagramScenarioPackage.Literals.XACTIVITY_DIAGRAM_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XActivityDiagramScenarioElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<XActivityDiagramScenarioElement>(XActivityDiagramScenarioElement.class, this, XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO__ELEMENTS);
		}
		return elements;
	}

} //XActivityDiagramScenarioImpl
