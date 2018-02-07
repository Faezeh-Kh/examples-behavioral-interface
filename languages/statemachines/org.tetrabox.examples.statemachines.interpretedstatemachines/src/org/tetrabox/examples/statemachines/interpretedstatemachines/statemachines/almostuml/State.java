/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml;

import org.eclipse.emf.common.util.EList;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage#getState_Regions()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exit(Transition exitingTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterRegions(Transition enteringTransition, EventOccurrence eventOccurrence);

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
	EList<Vertex> getActiveVertice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasCompleted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void complete();

} // State
