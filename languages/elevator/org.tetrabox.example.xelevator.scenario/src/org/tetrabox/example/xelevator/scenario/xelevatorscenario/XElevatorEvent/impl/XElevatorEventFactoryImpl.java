/**
 */
package org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XElevatorEventFactoryImpl extends EFactoryImpl implements XElevatorEventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XElevatorEventFactory init() {
		try {
			XElevatorEventFactory theXElevatorEventFactory = (XElevatorEventFactory)EPackage.Registry.INSTANCE.getEFactory(XElevatorEventPackage.eNS_URI);
			if (theXElevatorEventFactory != null) {
				return theXElevatorEventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XElevatorEventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorEventFactoryImpl() {
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
			case XElevatorEventPackage.BUTTON_PRESS_EVENT: return createButtonPressEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonPressEvent createButtonPressEvent() {
		ButtonPressEventImpl buttonPressEvent = new ButtonPressEventImpl();
		return buttonPressEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XElevatorEventPackage getXElevatorEventPackage() {
		return (XElevatorEventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XElevatorEventPackage getPackage() {
		return XElevatorEventPackage.eINSTANCE;
	}

} //XElevatorEventFactoryImpl
