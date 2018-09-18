/**
 */
package org.tetrabox.examples.petrinet.model.petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.PetriNet#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.petrinet.model.petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getPetriNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.petrinet.model.petrinet.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getPetriNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.petrinet.model.petrinet.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getPetriNet_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // PetriNet
