/**
 */
package statemachines.almostuml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.almostuml.Region#getVertice <em>Vertice</em>}</li>
 *   <li>{@link statemachines.almostuml.Region#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link statemachines.almostuml.Region#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link statemachines.almostuml.Region#getState <em>State</em>}</li>
 * </ul>
 *
 * @see statemachines.almostuml.AlmostumlPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Vertice</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.almostuml.Vertex}.
	 * It is bidirectional and its opposite is '{@link statemachines.almostuml.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertice</em>' containment reference list.
	 * @see statemachines.almostuml.AlmostumlPackage#getRegion_Vertice()
	 * @see statemachines.almostuml.Vertex#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Vertex> getVertice();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.almostuml.Transition}.
	 * It is bidirectional and its opposite is '{@link statemachines.almostuml.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see statemachines.almostuml.AlmostumlPackage#getRegion_Transitions()
	 * @see statemachines.almostuml.Transition#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link statemachines.almostuml.StateMachine#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see statemachines.almostuml.AlmostumlPackage#getRegion_StateMachine()
	 * @see statemachines.almostuml.StateMachine#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.Region#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link statemachines.almostuml.State#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see statemachines.almostuml.AlmostumlPackage#getRegion_State()
	 * @see statemachines.almostuml.State#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.Region#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Region
