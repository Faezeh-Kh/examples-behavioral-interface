/**
 */
package statemachines.almostuml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.almostuml.State#getRegions <em>Regions</em>}</li>
 *   <li>{@link statemachines.almostuml.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link statemachines.almostuml.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link statemachines.almostuml.State#getExit <em>Exit</em>}</li>
 *   <li>{@link statemachines.almostuml.State#getDeferrableTriggers <em>Deferrable Triggers</em>}</li>
 * </ul>
 *
 * @see statemachines.almostuml.AlmostumlPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.almostuml.Region}.
	 * It is bidirectional and its opposite is '{@link statemachines.almostuml.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see statemachines.almostuml.AlmostumlPackage#getState_Regions()
	 * @see statemachines.almostuml.Region#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Behavior)
	 * @see statemachines.almostuml.AlmostumlPackage#getState_Entry()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getEntry();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Behavior value);

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Behavior)
	 * @see statemachines.almostuml.AlmostumlPackage#getState_DoActivity()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getDoActivity();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Behavior value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Behavior)
	 * @see statemachines.almostuml.AlmostumlPackage#getState_Exit()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getExit();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Behavior value);

	/**
	 * Returns the value of the '<em><b>Deferrable Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.almostuml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Triggers</em>' containment reference list.
	 * @see statemachines.almostuml.AlmostumlPackage#getState_DeferrableTriggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getDeferrableTriggers();

} // State
