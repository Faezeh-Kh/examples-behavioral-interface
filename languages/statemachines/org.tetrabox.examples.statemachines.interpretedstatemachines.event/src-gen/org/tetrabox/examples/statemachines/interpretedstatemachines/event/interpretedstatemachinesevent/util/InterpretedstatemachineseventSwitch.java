/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.executionframework.event.model.event.Event;

import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage
 * @generated
 */
public class InterpretedstatemachineseventSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterpretedstatemachineseventPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretedstatemachineseventSwitch() {
		if (modelPackage == null) {
			modelPackage = InterpretedstatemachineseventPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InterpretedstatemachineseventPackage.INTERPRETED_STATE_MACHINES_DSL_EVENT: {
				InterpretedStateMachinesDSLEvent interpretedStateMachinesDSLEvent = (InterpretedStateMachinesDSLEvent)theEObject;
				T result = caseInterpretedStateMachinesDSLEvent(interpretedStateMachinesDSLEvent);
				if (result == null) result = caseEvent(interpretedStateMachinesDSLEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT: {
				StateMachineEvent stateMachineEvent = (StateMachineEvent)theEObject;
				T result = caseStateMachineEvent(stateMachineEvent);
				if (result == null) result = caseInterpretedStateMachinesDSLEvent(stateMachineEvent);
				if (result == null) result = caseEvent(stateMachineEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT: {
				StateMachineEventOccurrenceReceivedEvent stateMachineEventOccurrenceReceivedEvent = (StateMachineEventOccurrenceReceivedEvent)theEObject;
				T result = caseStateMachineEventOccurrenceReceivedEvent(stateMachineEventOccurrenceReceivedEvent);
				if (result == null) result = caseStateMachineEvent(stateMachineEventOccurrenceReceivedEvent);
				if (result == null) result = caseInterpretedStateMachinesDSLEvent(stateMachineEventOccurrenceReceivedEvent);
				if (result == null) result = caseEvent(stateMachineEventOccurrenceReceivedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterpretedstatemachineseventPackage.STATE_MACHINE_RUN_EVENT: {
				StateMachineRunEvent stateMachineRunEvent = (StateMachineRunEvent)theEObject;
				T result = caseStateMachineRunEvent(stateMachineRunEvent);
				if (result == null) result = caseStateMachineEvent(stateMachineRunEvent);
				if (result == null) result = caseInterpretedStateMachinesDSLEvent(stateMachineRunEvent);
				if (result == null) result = caseEvent(stateMachineRunEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpreted State Machines DSL Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpreted State Machines DSL Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterpretedStateMachinesDSLEvent(InterpretedStateMachinesDSLEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineEvent(StateMachineEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine Event Occurrence Received Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine Event Occurrence Received Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineEventOccurrenceReceivedEvent(StateMachineEventOccurrenceReceivedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine Run Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine Run Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineRunEvent(StateMachineRunEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InterpretedstatemachineseventSwitch
