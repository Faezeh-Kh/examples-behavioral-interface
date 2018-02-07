/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region#getVertice <em>Vertice</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertice</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertice</em>' containment reference list.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage#getRegion_Vertice()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Vertex> getVertice();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage#getRegion_Transitions()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage#getRegion_StateMachine()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage#getRegion_State()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enter(Transition enteringTransition, EventOccurrence eventOccurrence);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exit(Transition exitingTransition, EventOccurrence eventOccurrence);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void terminate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	StateMachine getContainingStateMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Iterable"
	 * @generated
	 */
	Iterable getActiveVertice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean contains(Vertex vertex);

} // Region
