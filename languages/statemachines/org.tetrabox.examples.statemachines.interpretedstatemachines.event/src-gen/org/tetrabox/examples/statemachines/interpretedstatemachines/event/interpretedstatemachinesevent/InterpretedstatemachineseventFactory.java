/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage
 * @generated
 */
public interface InterpretedstatemachineseventFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterpretedstatemachineseventFactory eINSTANCE = org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl.InterpretedstatemachineseventFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State Machine Event Occurrence Received Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine Event Occurrence Received Event</em>'.
	 * @generated
	 */
	StateMachineEventOccurrenceReceivedEvent createStateMachineEventOccurrenceReceivedEvent();

	/**
	 * Returns a new object of class '<em>State Machine Run Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine Run Event</em>'.
	 * @generated
	 */
	StateMachineRunEvent createStateMachineRunEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterpretedstatemachineseventPackage getInterpretedstatemachineseventPackage();

} //InterpretedstatemachineseventFactory
