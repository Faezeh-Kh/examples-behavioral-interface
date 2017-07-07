/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ElementReferenceImpl;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.elevator.Button;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.ButtonReference;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ButtonReferenceImpl extends ElementReferenceImpl<Button> implements ButtonReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorProviderPackage.Literals.BUTTON_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setElement(Button newElement) {
		super.setElement(newElement);
	}

} //ButtonReferenceImpl
