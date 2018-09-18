/**
 */
package org.tetrabox.examples.petrinet.model.petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.petrinet.model.petrinet.Transition#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link org.tetrabox.examples.petrinet.model.petrinet.Edge}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.petrinet.model.petrinet.Edge#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage#getTransition_Edges()
	 * @see org.tetrabox.examples.petrinet.model.petrinet.Edge#getTransition
	 * @model opposite="transition"
	 * @generated
	 */
	EList<Edge> getEdges();

} // Transition
