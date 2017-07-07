/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementQueryImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.Button;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonQuery;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ButtonQueryImpl extends ElementQueryImpl<Button, StateProperty<Button>> implements ButtonQuery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorProviderPackage.Literals.BUTTON_QUERY;
	}

} //ButtonQueryImpl
