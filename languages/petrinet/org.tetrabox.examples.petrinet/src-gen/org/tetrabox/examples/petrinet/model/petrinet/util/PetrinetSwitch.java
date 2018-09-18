/**
 */
package org.tetrabox.examples.petrinet.model.petrinet.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tetrabox.examples.petrinet.model.petrinet.*;

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
 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage
 * @generated
 */
public class PetrinetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetrinetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetSwitch() {
		if (modelPackage == null) {
			modelPackage = PetrinetPackage.eINSTANCE;
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
		case PetrinetPackage.PETRI_NET: {
			PetriNet petriNet = (PetriNet) theEObject;
			T result = casePetriNet(petriNet);
			if (result == null)
				result = caseNamedElement(petriNet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PetrinetPackage.PLACE: {
			Place place = (Place) theEObject;
			T result = casePlace(place);
			if (result == null)
				result = caseNamedElement(place);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PetrinetPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = caseNamedElement(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PetrinetPackage.EDGE: {
			Edge edge = (Edge) theEObject;
			T result = caseEdge(edge);
			if (result == null)
				result = caseNamedElement(edge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PetrinetPackage.INPUT_EDGE: {
			InputEdge inputEdge = (InputEdge) theEObject;
			T result = caseInputEdge(inputEdge);
			if (result == null)
				result = caseEdge(inputEdge);
			if (result == null)
				result = caseNamedElement(inputEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PetrinetPackage.OUTPUT_EDGE: {
			OutputEdge outputEdge = (OutputEdge) theEObject;
			T result = caseOutputEdge(outputEdge);
			if (result == null)
				result = caseEdge(outputEdge);
			if (result == null)
				result = caseNamedElement(outputEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PetrinetPackage.INHIBITOR_EDGE: {
			InhibitorEdge inhibitorEdge = (InhibitorEdge) theEObject;
			T result = caseInhibitorEdge(inhibitorEdge);
			if (result == null)
				result = caseEdge(inhibitorEdge);
			if (result == null)
				result = caseNamedElement(inhibitorEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PetrinetPackage.READ_EDGE: {
			ReadEdge readEdge = (ReadEdge) theEObject;
			T result = caseReadEdge(readEdge);
			if (result == null)
				result = caseEdge(readEdge);
			if (result == null)
				result = caseNamedElement(readEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PetrinetPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetriNet(PetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
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
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputEdge(InputEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputEdge(OutputEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inhibitor Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inhibitor Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInhibitorEdge(InhibitorEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadEdge(ReadEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //PetrinetSwitch
