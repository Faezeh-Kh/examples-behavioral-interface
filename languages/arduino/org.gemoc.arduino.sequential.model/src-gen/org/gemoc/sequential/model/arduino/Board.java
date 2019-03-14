/**
 */
package org.gemoc.sequential.model.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sequential.model.arduino.Board#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sequential.model.arduino.ArduinoPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.sequential.model.arduino.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.gemoc.sequential.model.arduino.ArduinoPackage#getBoard_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.gemoc.sequential.model.arduino.Module> getModules();

} // Board
