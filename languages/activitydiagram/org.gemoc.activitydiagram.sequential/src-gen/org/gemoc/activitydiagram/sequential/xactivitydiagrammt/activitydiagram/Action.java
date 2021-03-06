/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Action#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Action#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(ActivityEdge)
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getAction_Incoming()
	 * @model required="true"
	 * @generated
	 */
	ActivityEdge getIncoming();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Action#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(ActivityEdge)
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getAction_Outgoing()
	 * @model required="true"
	 * @generated
	 */
	ActivityEdge getOutgoing();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Action#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(ActivityEdge value);

} // Action
