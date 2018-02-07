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

} // State
