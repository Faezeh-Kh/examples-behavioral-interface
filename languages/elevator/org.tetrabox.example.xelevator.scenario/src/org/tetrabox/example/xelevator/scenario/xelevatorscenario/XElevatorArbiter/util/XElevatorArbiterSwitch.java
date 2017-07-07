/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.util;

import fr.inria.diverse.event.commons.model.property.Property;

import fr.inria.diverse.event.commons.model.scenario.Arbiter;
import fr.inria.diverse.event.commons.model.scenario.ArbiterState;
import fr.inria.diverse.event.commons.model.scenario.ArbiterTransition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.*;

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
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorArbiter.XElevatorArbiterPackage
 * @generated
 */
public class XElevatorArbiterSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XElevatorArbiterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorArbiterSwitch() {
		if (modelPackage == null) {
			modelPackage = XElevatorArbiterPackage.eINSTANCE;
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
			case XElevatorArbiterPackage.XELEVATOR_ARBITER: {
				XElevatorArbiter xElevatorArbiter = (XElevatorArbiter)theEObject;
				T1 result = caseXElevatorArbiter(xElevatorArbiter);
				if (result == null) result = caseArbiter(xElevatorArbiter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorArbiterPackage.XELEVATOR_ARBITER_STATE: {
				XElevatorArbiterState xElevatorArbiterState = (XElevatorArbiterState)theEObject;
				T1 result = caseXElevatorArbiterState(xElevatorArbiterState);
				if (result == null) result = caseArbiterState(xElevatorArbiterState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorArbiterPackage.XELEVATOR_ARBITER_TRANSITION: {
				XElevatorArbiterTransition xElevatorArbiterTransition = (XElevatorArbiterTransition)theEObject;
				T1 result = caseXElevatorArbiterTransition(xElevatorArbiterTransition);
				if (result == null) result = caseArbiterTransition(xElevatorArbiterTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XElevator Arbiter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XElevator Arbiter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorArbiter(XElevatorArbiter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorArbiterState(XElevatorArbiterState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXElevatorArbiterTransition(XElevatorArbiterTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbiter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbiter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends Property, S extends ArbiterState<P, T>, T extends ArbiterTransition<P, S>> T1 caseArbiter(Arbiter<P, S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbiter State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbiter State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends Property, T extends ArbiterTransition<P, ?>> T1 caseArbiterState(ArbiterState<P, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbiter Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbiter Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P extends Property, S extends ArbiterState<P, ?>> T1 caseArbiterTransition(ArbiterTransition<P, S> object) {
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

} //XElevatorArbiterSwitch
