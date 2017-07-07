/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.util;

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

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.*;

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
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage
 * @generated
 */
public class XActivityDiagramScenarioSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XActivityDiagramScenarioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramScenarioSwitch() {
		if (modelPackage == null) {
			modelPackage = XActivityDiagramScenarioPackage.eINSTANCE;
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
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO: {
				XActivityDiagramScenario xActivityDiagramScenario = (XActivityDiagramScenario)theEObject;
				T1 result = caseXActivityDiagramScenario(xActivityDiagramScenario);
				if (result == null) result = caseScenario(xActivityDiagramScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_ELEMENT: {
				XActivityDiagramScenarioElement xActivityDiagramScenarioElement = (XActivityDiagramScenarioElement)theEObject;
				T1 result = caseXActivityDiagramScenarioElement(xActivityDiagramScenarioElement);
				if (result == null) result = caseScenarioElement(xActivityDiagramScenarioElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_EVENT_OCCURRENCE: {
				XActivityDiagramEventOccurrence xActivityDiagramEventOccurrence = (XActivityDiagramEventOccurrence)theEObject;
				T1 result = caseXActivityDiagramEventOccurrence(xActivityDiagramEventOccurrence);
				if (result == null) result = caseEventOccurrence(xActivityDiagramEventOccurrence);
				if (result == null) result = caseXActivityDiagramScenarioElement(xActivityDiagramEventOccurrence);
				if (result == null) result = caseScenarioElement(xActivityDiagramEventOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM: {
				XActivityDiagramScenarioFSM xActivityDiagramScenarioFSM = (XActivityDiagramScenarioFSM)theEObject;
				T1 result = caseXActivityDiagramScenarioFSM(xActivityDiagramScenarioFSM);
				if (result == null) result = caseScenarioFSM(xActivityDiagramScenarioFSM);
				if (result == null) result = caseXActivityDiagramScenarioElement(xActivityDiagramScenarioFSM);
				if (result == null) result = caseScenarioElement(xActivityDiagramScenarioFSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE: {
				XActivityDiagramScenarioFSMState xActivityDiagramScenarioFSMState = (XActivityDiagramScenarioFSMState)theEObject;
				T1 result = caseXActivityDiagramScenarioFSMState(xActivityDiagramScenarioFSMState);
				if (result == null) result = caseScenarioFSMState(xActivityDiagramScenarioFSMState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION: {
				XActivityDiagramScenarioFSMTransition xActivityDiagramScenarioFSMTransition = (XActivityDiagramScenarioFSMTransition)theEObject;
				T1 result = caseXActivityDiagramScenarioFSMTransition(xActivityDiagramScenarioFSMTransition);
				if (result == null) result = caseScenarioFSMTransition(xActivityDiagramScenarioFSMTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramScenario(XActivityDiagramScenario object) {
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
	public T1 caseXActivityDiagramScenarioElement(XActivityDiagramScenarioElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XActivity Diagram Event Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XActivity Diagram Event Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXActivityDiagramEventOccurrence(XActivityDiagramEventOccurrence object) {
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
	public T1 caseXActivityDiagramScenarioFSM(XActivityDiagramScenarioFSM object) {
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
	public T1 caseXActivityDiagramScenarioFSMState(XActivityDiagramScenarioFSMState object) {
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
	public T1 caseXActivityDiagramScenarioFSMTransition(XActivityDiagramScenarioFSMTransition object) {
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

} //XActivityDiagramScenarioSwitch
