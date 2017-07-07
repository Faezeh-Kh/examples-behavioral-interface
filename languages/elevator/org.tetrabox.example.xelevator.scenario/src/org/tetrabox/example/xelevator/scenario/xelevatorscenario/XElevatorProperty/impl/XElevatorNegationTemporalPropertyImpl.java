/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.impl;

import fr.inria.diverse.event.commons.model.property.impl.NegationTemporalPropertyImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorNegationTemporalProperty;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorPropertyPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorTemporalProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XElevator Negation Temporal Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorNegationTemporalPropertyImpl extends NegationTemporalPropertyImpl<XElevatorTemporalProperty> implements XElevatorNegationTemporalProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorNegationTemporalPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorPropertyPackage.Literals.XELEVATOR_NEGATION_TEMPORAL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetFormula(XElevatorTemporalProperty newFormula, NotificationChain msgs) {
		return super.basicSetFormula(newFormula, msgs);
	}

} //XElevatorNegationTemporalPropertyImpl
