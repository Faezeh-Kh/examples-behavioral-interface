/**
 */
package activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.AcceptEventAction#getEventType <em>Event Type</em>}</li>
 *   <li>{@link activitydiagram.AcceptEventAction#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link activitydiagram.AcceptEventAction#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see activitydiagram.ActivitydiagramPackage#getAcceptEventAction()
 * @model
 * @generated
 */
public interface AcceptEventAction extends ActivityNode {

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' reference.
	 * @see #setEventType(Event)
	 * @see activitydiagram.ActivitydiagramPackage#getAcceptEventAction_EventType()
	 * @model required="true"
	 * @generated
	 */
	Event getEventType();

	/**
	 * Sets the value of the '{@link activitydiagram.AcceptEventAction#getEventType <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(Event value);

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
	 * @see activitydiagram.ActivitydiagramPackage#getAcceptEventAction_Incoming()
	 * @model
	 * @generated
	 */
	ActivityEdge getIncoming();

	/**
	 * Sets the value of the '{@link activitydiagram.AcceptEventAction#getIncoming <em>Incoming</em>}' reference.
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
	 * @see activitydiagram.ActivitydiagramPackage#getAcceptEventAction_Outgoing()
	 * @model required="true"
	 * @generated
	 */
	ActivityEdge getOutgoing();

	/**
	 * Sets the value of the '{@link activitydiagram.AcceptEventAction#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(ActivityEdge value);
} // AcceptEventAction
