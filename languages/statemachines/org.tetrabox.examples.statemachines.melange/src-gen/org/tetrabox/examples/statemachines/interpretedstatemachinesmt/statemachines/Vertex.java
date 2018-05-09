/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex#getContainer <em>Container</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region#getVertice <em>Vertice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getVertex_Container()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region#getVertice
	 * @model opposite="vertice" transient="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getVertex_OutgoingTransitions()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getVertex_IncomingTransitions()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // Vertex
