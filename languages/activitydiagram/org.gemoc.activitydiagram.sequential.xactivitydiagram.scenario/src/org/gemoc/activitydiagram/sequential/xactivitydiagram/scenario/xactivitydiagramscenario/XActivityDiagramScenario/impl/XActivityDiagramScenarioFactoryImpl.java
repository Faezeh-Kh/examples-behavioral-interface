/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramScenarioFactoryImpl extends EFactoryImpl implements XActivityDiagramScenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XActivityDiagramScenarioFactory init() {
		try {
			XActivityDiagramScenarioFactory theXActivityDiagramScenarioFactory = (XActivityDiagramScenarioFactory)EPackage.Registry.INSTANCE.getEFactory(XActivityDiagramScenarioPackage.eNS_URI);
			if (theXActivityDiagramScenarioFactory != null) {
				return theXActivityDiagramScenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XActivityDiagramScenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramScenarioFactoryImpl() {
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
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO: return createXActivityDiagramScenario();
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_EVENT_OCCURRENCE: return createXActivityDiagramEventOccurrence();
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM: return createXActivityDiagramScenarioFSM();
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM_STATE: return createXActivityDiagramScenarioFSMState();
			case XActivityDiagramScenarioPackage.XACTIVITY_DIAGRAM_SCENARIO_FSM_TRANSITION: return createXActivityDiagramScenarioFSMTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramScenario createXActivityDiagramScenario() {
		XActivityDiagramScenarioImpl xActivityDiagramScenario = new XActivityDiagramScenarioImpl();
		return xActivityDiagramScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramEventOccurrence createXActivityDiagramEventOccurrence() {
		XActivityDiagramEventOccurrenceImpl xActivityDiagramEventOccurrence = new XActivityDiagramEventOccurrenceImpl();
		return xActivityDiagramEventOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramScenarioFSM createXActivityDiagramScenarioFSM() {
		XActivityDiagramScenarioFSMImpl xActivityDiagramScenarioFSM = new XActivityDiagramScenarioFSMImpl();
		return xActivityDiagramScenarioFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramScenarioFSMState createXActivityDiagramScenarioFSMState() {
		XActivityDiagramScenarioFSMStateImpl xActivityDiagramScenarioFSMState = new XActivityDiagramScenarioFSMStateImpl();
		return xActivityDiagramScenarioFSMState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramScenarioFSMTransition createXActivityDiagramScenarioFSMTransition() {
		XActivityDiagramScenarioFSMTransitionImpl xActivityDiagramScenarioFSMTransition = new XActivityDiagramScenarioFSMTransitionImpl();
		return xActivityDiagramScenarioFSMTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramScenarioPackage getXActivityDiagramScenarioPackage() {
		return (XActivityDiagramScenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XActivityDiagramScenarioPackage getPackage() {
		return XActivityDiagramScenarioPackage.eINSTANCE;
	}

} //XActivityDiagramScenarioFactoryImpl
