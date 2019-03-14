/**
 */
package org.gemoc.arduino.sequential.xarduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Project#getBoard <em>Board</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Project#getSketch <em>Sketch</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getProject_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Project#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sketch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketch</em>' containment reference.
	 * @see #setSketch(Sketch)
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getProject_Sketch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sketch getSketch();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Project#getSketch <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sketch</em>' containment reference.
	 * @see #getSketch()
	 * @generated
	 */
	void setSketch(Sketch value);

} // Project
