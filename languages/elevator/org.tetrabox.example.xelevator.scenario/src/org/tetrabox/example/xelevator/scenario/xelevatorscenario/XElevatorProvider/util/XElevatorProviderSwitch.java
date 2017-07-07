/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.util;

import fr.inria.diverse.event.commons.model.property.StateProperty;

import fr.inria.diverse.event.commons.model.scenario.ElementProvider;
import fr.inria.diverse.event.commons.model.scenario.ElementQuery;
import fr.inria.diverse.event.commons.model.scenario.ElementReference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.*;

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
 * @see org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorProvider.XElevatorProviderPackage
 * @generated
 */
public class XElevatorProviderSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XElevatorProviderPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorProviderSwitch() {
		if (modelPackage == null) {
			modelPackage = XElevatorProviderPackage.eINSTANCE;
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
			case XElevatorProviderPackage.BUTTON_PROVIDER: {
				ButtonProvider buttonProvider = (ButtonProvider)theEObject;
				T1 result = caseButtonProvider(buttonProvider);
				if (result == null) result = caseElementProvider(buttonProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorProviderPackage.BUTTON_REFERENCE: {
				ButtonReference buttonReference = (ButtonReference)theEObject;
				T1 result = caseButtonReference(buttonReference);
				if (result == null) result = caseElementReference(buttonReference);
				if (result == null) result = caseButtonProvider(buttonReference);
				if (result == null) result = caseElementProvider(buttonReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorProviderPackage.BUTTON_QUERY: {
				ButtonQuery buttonQuery = (ButtonQuery)theEObject;
				T1 result = caseButtonQuery(buttonQuery);
				if (result == null) result = caseElementQuery(buttonQuery);
				if (result == null) result = caseButtonProvider(buttonQuery);
				if (result == null) result = caseElementProvider(buttonQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorProviderPackage.ELEVATOR_PROVIDER: {
				ElevatorProvider elevatorProvider = (ElevatorProvider)theEObject;
				T1 result = caseElevatorProvider(elevatorProvider);
				if (result == null) result = caseElementProvider(elevatorProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorProviderPackage.ELEVATOR_REFERENCE: {
				ElevatorReference elevatorReference = (ElevatorReference)theEObject;
				T1 result = caseElevatorReference(elevatorReference);
				if (result == null) result = caseElementReference(elevatorReference);
				if (result == null) result = caseElevatorProvider(elevatorReference);
				if (result == null) result = caseElementProvider(elevatorReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XElevatorProviderPackage.ELEVATOR_QUERY: {
				ElevatorQuery elevatorQuery = (ElevatorQuery)theEObject;
				T1 result = caseElevatorQuery(elevatorQuery);
				if (result == null) result = caseElementQuery(elevatorQuery);
				if (result == null) result = caseElevatorProvider(elevatorQuery);
				if (result == null) result = caseElementProvider(elevatorQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonProvider(ButtonProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonReference(ButtonReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonQuery(ButtonQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorProvider(ElevatorProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorReference(ElevatorReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElevatorQuery(ElevatorQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseElementProvider(ElementProvider<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseElementReference(ElementReference<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T, P extends StateProperty<T>> T1 caseElementQuery(ElementQuery<T, P> object) {
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

} //XElevatorProviderSwitch
