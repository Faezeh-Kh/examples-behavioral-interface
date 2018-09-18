/**
 */
package org.tetrabox.examples.petrinet.model.petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.Place#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getPlace_Tokens()
	 * @model
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.petrinet.model.petrinet.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link org.tetrabox.examples.petrinet.model.petrinet.Edge}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.petrinet.model.petrinet.Edge#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getPlace_Edges()
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Edge#getPlace
	 * @model opposite="place"
	 * @generated
	 */
	EList<Edge> getEdges();

} // Place
