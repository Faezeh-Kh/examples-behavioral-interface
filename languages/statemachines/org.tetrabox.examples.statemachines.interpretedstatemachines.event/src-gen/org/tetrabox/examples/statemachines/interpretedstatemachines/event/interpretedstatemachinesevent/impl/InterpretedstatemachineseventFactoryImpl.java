/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterpretedstatemachineseventFactoryImpl extends EFactoryImpl implements InterpretedstatemachineseventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterpretedstatemachineseventFactory init() {
		try {
			InterpretedstatemachineseventFactory theInterpretedstatemachineseventFactory = (InterpretedstatemachineseventFactory)EPackage.Registry.INSTANCE.getEFactory(InterpretedstatemachineseventPackage.eNS_URI);
			if (theInterpretedstatemachineseventFactory != null) {
				return theInterpretedstatemachineseventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterpretedstatemachineseventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretedstatemachineseventFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InterpretedstatemachineseventPackage.STATE_MACHINE_EVENT_OCCURRENCE_RECEIVED_EVENT: return createStateMachineEventOccurrenceReceivedEvent();
			case InterpretedstatemachineseventPackage.STATE_MACHINE_RUN_EVENT: return createStateMachineRunEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineEventOccurrenceReceivedEvent createStateMachineEventOccurrenceReceivedEvent() {
		StateMachineEventOccurrenceReceivedEventImpl stateMachineEventOccurrenceReceivedEvent = new StateMachineEventOccurrenceReceivedEventImpl();
		return stateMachineEventOccurrenceReceivedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineRunEvent createStateMachineRunEvent() {
		StateMachineRunEventImpl stateMachineRunEvent = new StateMachineRunEventImpl();
		return stateMachineRunEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretedstatemachineseventPackage getInterpretedstatemachineseventPackage() {
		return (InterpretedstatemachineseventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterpretedstatemachineseventPackage getPackage() {
		return InterpretedstatemachineseventPackage.eINSTANCE;
	}

} //InterpretedstatemachineseventFactoryImpl
