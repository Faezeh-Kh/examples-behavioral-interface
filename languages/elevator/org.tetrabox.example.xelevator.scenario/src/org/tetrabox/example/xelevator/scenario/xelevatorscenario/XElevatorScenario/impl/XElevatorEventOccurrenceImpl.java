/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.EventOccurrenceImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEvent;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProperty.XElevatorProperty;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorEventOccurrence;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XElevator Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XElevatorEventOccurrenceImpl extends EventOccurrenceImpl<XElevatorEvent<?>, XElevatorProperty> implements XElevatorEventOccurrence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XElevatorEventOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XElevatorScenarioPackage.Literals.XELEVATOR_EVENT_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetEvent(XElevatorEvent<?> newEvent, NotificationChain msgs) {
		return super.basicSetEvent(newEvent, msgs);
	}

} //XElevatorEventOccurrenceImpl
