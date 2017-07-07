/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.util;

import fr.inria.diverse.event.commons.model.property.Property;

import fr.inria.diverse.event.commons.model.scenario.Event;
import fr.inria.diverse.event.commons.model.scenario.EventOccurrence;
import fr.inria.diverse.event.commons.model.scenario.Scenario;
import fr.inria.diverse.event.commons.model.scenario.ScenarioElement;
import fr.inria.diverse.event.commons.model.scenario.ScenarioFSM;
import fr.inria.diverse.event.commons.model.scenario.ScenarioFSMState;
import fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.*;

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
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.XElevatorScenarioPackage
 * @generated
 */
public class XElevatorScenarioSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XElevatorScenarioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioSwitch() {
		if (modelPackage == null) {
			modelPackage = XElevatorScenarioPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO: {
				XElevatorScenario xElevatorScenario = (XElevatorScenario)theEObject;
				T1 result = caseXElevatorScenario(xElevatorScenario);
				if (result == null) result = caseScenario(xElevatorScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO_ELEMENT: {
				XElevatorScenarioElement xElevatorScenarioElement = (XElevatorScenarioElement)theEObject;
				T1 result = caseXElevatorScenarioElement(xElevatorScenarioElement);
				if (result == null) result = caseScenarioElement(xElevatorScenarioElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorScenarioPackage.XELEVATOR_EVENT_OCCURRENCE: {
				XElevatorEventOccurrence xElevatorEventOccurrence = (XElevatorEventOccurrence)theEObject;
				T1 result = caseXElevatorEventOccurrence(xElevatorEventOccurrence);
				if (result == null) result = caseEventOccurrence(xElevatorEventOccurrence);
				if (result == null) result = caseXElevatorScenarioElement(xElevatorEventOccurrence);
				if (result == null) result = caseScenarioElement(xElevatorEventOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM: {
				XElevatorScenarioFSM xElevatorScenarioFSM = (XElevatorScenarioFSM)theEObject;
				T1 result = caseXElevatorScenarioFSM(xElevatorScenarioFSM);
				if (result == null) result = caseScenarioFSM(xElevatorScenarioFSM);
				if (result == null) result = caseXElevatorScenarioElement(xElevatorScenarioFSM);
				if (result == null) result = caseScenarioElement(xElevatorScenarioFSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM_STATE: {
				XElevatorScenarioFSMState xElevatorScenarioFSMState = (XElevatorScenarioFSMState)theEObject;
				T1 result = caseXElevatorScenarioFSMState(xElevatorScenarioFSMState);
				if (result == null) result = caseScenarioFSMState(xElevatorScenarioFSMState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM_TRANSITION: {
				XElevatorScenarioFSMTransition xElevatorScenarioFSMTransition = (XElevatorScenarioFSMTransition)theEObject;
				T1 result = caseXElevatorScenarioFSMTransition(xElevatorScenarioFSMTransition);
				if (result == null) result = caseScenarioFSMTransition(xElevatorScenarioFSMTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorScenario(XElevatorScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorScenarioElement(XElevatorScenarioElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Event Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Event Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorEventOccurrence(XElevatorEventOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorScenarioFSM(XElevatorScenarioFSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorScenarioFSMState(XElevatorScenarioFSMState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorScenarioFSMTransition(XElevatorScenarioFSMTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ScenarioElement<?>> T1 caseScenario(Scenario<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends Property> T1 caseScenarioElement(ScenarioElement<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E extends Event<?>, P extends Property> T1 caseEventOccurrence(EventOccurrence<E, P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends Property, E extends Event<?>, S extends ScenarioFSMState<E, T>, T extends ScenarioFSMTransition<P, S>> T1 caseScenarioFSM(ScenarioFSM<P, E, S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E extends Event<?>, T extends ScenarioFSMTransition<?, ?>> T1 caseScenarioFSMState(ScenarioFSMState<E, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends Property, S extends ScenarioFSMState<?, ?>> T1 caseScenarioFSMTransition(ScenarioFSMTransition<P, S> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //XElevatorScenarioSwitch
