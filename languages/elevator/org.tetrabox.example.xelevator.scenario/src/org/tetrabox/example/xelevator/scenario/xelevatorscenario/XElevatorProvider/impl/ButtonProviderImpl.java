/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementProviderImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.Button;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonProvider;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ButtonProviderImpl extends ElementProviderImpl<Button> implements ButtonProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorProviderPackage.Literals.BUTTON_PROVIDER;
	}

} //ButtonProviderImpl
