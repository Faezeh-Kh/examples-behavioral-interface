/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenario;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioElement;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XElevator Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorScenarioImpl extends ScenarioImpl<XElevatorScenarioElement> implements XElevatorScenario {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorScenarioPackage.Literals.XELEVATOR_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XElevatorScenarioElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<XElevatorScenarioElement>(XElevatorScenarioElement.class, this, XElevatorScenarioPackage.XELEVATOR_SCENARIO__ELEMENTS);
		}
		return elements;
	}

} //XElevatorScenarioImpl
