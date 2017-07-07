/**
 */
package elevator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link elevator.Floor#getNext <em>Next</em>}</li>
 *   <li>{@link elevator.Floor#getNr <em>Nr</em>}</li>
 *   <li>{@link elevator.Floor#getFloorButtons <em>Floor Buttons</em>}</li>
 *   <li>{@link elevator.Floor#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see elevator.ModelPackage#getFloor()
 * @model
 * @generated
 */
public interface Floor extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link elevator.Floor#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Floor)
	 * @see elevator.ModelPackage#getFloor_Next()
	 * @see elevator.Floor#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Floor getNext();

	/**
	 * Sets the value of the '{@link elevator.Floor#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Floor value);

	/**
	 * Returns the value of the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr</em>' attribute.
	 * @see elevator.ModelPackage#getFloor_Nr()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='int i = 0;\nFloor previous = this.previous;\nwhile (previous != null) {\n\tprevious = previous.getPrevious();\n\ti++;\n}\nreturn i; '"
	 * @generated
	 */
	int getNr();

	/**
	 * Returns the value of the '<em><b>Floor Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link elevator.Button}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor Buttons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor Buttons</em>' containment reference list.
	 * @see elevator.ModelPackage#getFloor_FloorButtons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Button> getFloorButtons();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link elevator.Floor#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Floor)
	 * @see elevator.ModelPackage#getFloor_Previous()
	 * @see elevator.Floor#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Floor getPrevious();

	/**
	 * Sets the value of the '{@link elevator.Floor#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Floor value);

} // Floor
