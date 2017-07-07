/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import fr.inria.diverse.event.commons.model.property.impl.ReleasePropertyImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorAbstractProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorReleaseProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XElevator Release Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorReleasePropertyImpl extends ReleasePropertyImpl<XElevatorAbstractProperty> implements XElevatorReleaseProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorReleasePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.XELEVATOR_RELEASE_PROPERTY;
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

} //XElevatorReleasePropertyImpl
