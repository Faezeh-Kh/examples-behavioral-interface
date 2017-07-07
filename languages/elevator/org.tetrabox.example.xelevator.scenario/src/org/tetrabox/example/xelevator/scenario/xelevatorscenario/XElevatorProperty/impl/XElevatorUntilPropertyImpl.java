/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import fr.inria.diverse.event.commons.model.property.impl.UntilPropertyImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorAbstractProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorUntilProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XElevator Until Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorUntilPropertyImpl extends UntilPropertyImpl<XElevatorAbstractProperty> implements XElevatorUntilProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorUntilPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.XELEVATOR_UNTIL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLeftFormula(XElevatorAbstractProperty newLeftFormula, NotificationChain msgs) {
		return super.basicSetLeftFormula(newLeftFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRightFormula(XElevatorAbstractProperty newRightFormula, NotificationChain msgs) {
		return super.basicSetRightFormula(newRightFormula, msgs);
	}

} //XElevatorUntilPropertyImpl
