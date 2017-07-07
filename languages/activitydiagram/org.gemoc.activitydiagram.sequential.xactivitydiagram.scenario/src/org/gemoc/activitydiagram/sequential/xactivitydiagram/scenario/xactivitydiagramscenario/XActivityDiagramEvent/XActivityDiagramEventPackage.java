/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent;

import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventFactory
 * @model kind="package"
 * @generated
 */
public interface XActivityDiagramEventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XActivityDiagramEvent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.activitydiagram.sequential.xactivitydiagram/scenario/XActivityDiagramEvent/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XActivityDiagramEvent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XActivityDiagramEventPackage eINSTANCE = org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventImpl <em>XActivity Diagram Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventPackageImpl#getXActivityDiagramEvent()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_EVENT__TARGET_PROVIDER = ScenarioPackage.EVENT__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_EVENT_FEATURE_COUNT = ScenarioPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.AcceptEventActionAcceptEventImpl <em>Accept Event Action Accept Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.AcceptEventActionAcceptEventImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventPackageImpl#getAcceptEventActionAcceptEvent()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_ACCEPT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACCEPT_EVENT__TARGET_PROVIDER = XACTIVITY_DIAGRAM_EVENT__TARGET_PROVIDER;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER = XACTIVITY_DIAGRAM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Event Action Accept Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACCEPT_EVENT_FEATURE_COUNT = XACTIVITY_DIAGRAM_EVENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEvent <em>XActivity Diagram Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Event</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEvent
	 * @generated
	 */
	EClass getXActivityDiagramEvent();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent <em>Accept Event Action Accept Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Accept Event</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent
	 * @generated
	 */
	EClass getAcceptEventActionAcceptEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent#getEventProvider <em>Event Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Provider</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent#getEventProvider()
	 * @see #getAcceptEventActionAcceptEvent()
	 * @generated
	 */
	EReference getAcceptEventActionAcceptEvent_EventProvider();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XActivityDiagramEventFactory getXActivityDiagramEventFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventImpl <em>XActivity Diagram Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventPackageImpl#getXActivityDiagramEvent()
		 * @generated
		 */
		EClass XACTIVITY_DIAGRAM_EVENT = eINSTANCE.getXActivityDiagramEvent();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.AcceptEventActionAcceptEventImpl <em>Accept Event Action Accept Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.AcceptEventActionAcceptEventImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventPackageImpl#getAcceptEventActionAcceptEvent()
		 * @generated
		 */
		EClass ACCEPT_EVENT_ACTION_ACCEPT_EVENT = eINSTANCE.getAcceptEventActionAcceptEvent();

		/**
		 * The meta object literal for the '<em><b>Event Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_EVENT_ACTION_ACCEPT_EVENT__EVENT_PROVIDER = eINSTANCE.getAcceptEventActionAcceptEvent_EventProvider();

	}

} //XActivityDiagramEventPackage
