/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines;

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
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getContainer <em>Container</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getKind <em>Kind</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getTransition_Source()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getTransition_Target()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getTransition_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getTransition_Container()
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.TransitionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.TransitionKind
	 * @see #setKind(TransitionKind)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getTransition_Kind()
	 * @model
	 * @generated
	 */
	TransitionKind getKind();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.TransitionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionKind value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(Behavior)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getTransition_Effect()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getEffect();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Behavior value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Constraint)
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage#getTransition_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Constraint<?, ?> getConstraint();

	/**
	 * Sets the value of the '{@link org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint<?, ?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire(EventOccurrence eventOccurrence);

} // Transition
