/**
 */
package elevator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see elevator.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = elevator.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floor</em>'.
	 * @generated
	 */
	Floor createFloor();

	/**
	 * Returns a new object of class '<em>Elevator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevator</em>'.
	 * @generated
	 */
	Elevator createElevator();

	/**
	 * Returns a new object of class '<em>Elevator Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevator Button</em>'.
	 * @generated
	 */
	ElevatorButton createElevatorButton();

	/**
	 * Returns a new object of class '<em>Up Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Up Button</em>'.
	 * @generated
	 */
	UpButton createUpButton();

	/**
	 * Returns a new object of class '<em>Down Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Down Button</em>'.
	 * @generated
	 */
	DownButton createDownButton();

	/**
	 * Returns a new object of class '<em>Elevator System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevator System</em>'.
	 * @generated
	 */
	ElevatorSystem createElevatorSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
