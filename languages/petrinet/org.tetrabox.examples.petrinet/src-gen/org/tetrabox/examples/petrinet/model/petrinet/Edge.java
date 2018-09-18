/**
 */
package org.tetrabox.examples.petrinet.model.petrinet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.Edge#getPlace <em>Place</em>}</li>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.Edge#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.petrinet.model.petrinet.Place#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getEdge_Place()
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Place#getEdges
	 * @model opposite="edges"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.petrinet.model.petrinet.Edge#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.petrinet.model.petrinet.Transition#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getEdge_Transition()
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Transition#getEdges
	 * @model opposite="edges"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.petrinet.model.petrinet.Edge#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // Edge
