/**
 */
package elevator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link elevator.Button#getRequestedFloor <em>Requested Floor</em>}</li>
 * </ul>
 *
 * @see elevator.ModelPackage#getButton()
 * @model abstract="true"
 * @generated
 */
public interface Button extends EObject {
	/**
	 * Returns the value of the '<em><b>Requested Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Floor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Floor</em>' reference.
	 * @see #setRequestedFloor(Floor)
	 * @see elevator.ModelPackage#getButton_RequestedFloor()
	 * @model
	 * @generated
	 */
	Floor getRequestedFloor();

	/**
	 * Sets the value of the '{@link elevator.Button#getRequestedFloor <em>Requested Floor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Floor</em>' reference.
	 * @see #getRequestedFloor()
	 * @generated
	 */
	void setRequestedFloor(Floor value);

} // Button
