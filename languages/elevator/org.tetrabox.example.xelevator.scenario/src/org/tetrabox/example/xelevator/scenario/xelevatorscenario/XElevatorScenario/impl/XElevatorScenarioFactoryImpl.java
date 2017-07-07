/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorScenario.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorScenarioFactoryImpl extends EFactoryImpl implements XElevatorScenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XElevatorScenarioFactory init() {
		try {
			XElevatorScenarioFactory theXElevatorScenarioFactory = (XElevatorScenarioFactory)EPackage.Registry.INSTANCE.getEFactory(XElevatorScenarioPackage.eNS_URI);
			if (theXElevatorScenarioFactory != null) {
				return theXElevatorScenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XElevatorScenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioFactoryImpl() {
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
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO: return createXElevatorScenario();
			case XElevatorScenarioPackage.XELEVATOR_EVENT_OCCURRENCE: return createXElevatorEventOccurrence();
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM: return createXElevatorScenarioFSM();
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM_STATE: return createXElevatorScenarioFSMState();
			case XElevatorScenarioPackage.XELEVATOR_SCENARIO_FSM_TRANSITION: return createXElevatorScenarioFSMTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenario createXElevatorScenario() {
		XElevatorScenarioImpl xElevatorScenario = new XElevatorScenarioImpl();
		return xElevatorScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorEventOccurrence createXElevatorEventOccurrence() {
		XElevatorEventOccurrenceImpl xElevatorEventOccurrence = new XElevatorEventOccurrenceImpl();
		return xElevatorEventOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioFSM createXElevatorScenarioFSM() {
		XElevatorScenarioFSMImpl xElevatorScenarioFSM = new XElevatorScenarioFSMImpl();
		return xElevatorScenarioFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioFSMState createXElevatorScenarioFSMState() {
		XElevatorScenarioFSMStateImpl xElevatorScenarioFSMState = new XElevatorScenarioFSMStateImpl();
		return xElevatorScenarioFSMState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioFSMTransition createXElevatorScenarioFSMTransition() {
		XElevatorScenarioFSMTransitionImpl xElevatorScenarioFSMTransition = new XElevatorScenarioFSMTransitionImpl();
		return xElevatorScenarioFSMTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorScenarioPackage getXElevatorScenarioPackage() {
		return (XElevatorScenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XElevatorScenarioPackage getPackage() {
		return XElevatorScenarioPackage.eINSTANCE;
	}

} //XElevatorScenarioFactoryImpl
