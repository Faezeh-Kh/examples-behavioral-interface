/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty;

import fr.inria.diverse.event.commons.model.property.PropertyPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyFactory
 * @model kind="package"
 * @generated
 */
public interface XActivityDiagramPropertyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "XActivityDiagramProperty";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.activitydiagram.sequential.xactivitydiagram/scenario/XActivityDiagramProperty/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "XActivityDiagramProperty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XActivityDiagramPropertyPackage eINSTANCE = org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramStepPropertyImpl <em>XActivity Diagram Step Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramStepPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramStepProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_STEP_PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING = PropertyPackage.STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER = PropertyPackage.STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Step Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT = PropertyPackage.STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeExecutePropertyImpl <em>Join Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getJoinNodeExecuteProperty()
	 * @generated
	 */
	int JOIN_NODE_EXECUTE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Join Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeExecutePropertyImpl <em>Final Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFinalNodeExecuteProperty()
	 * @generated
	 */
	int FINAL_NODE_EXECUTE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Final Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeExecutePropertyImpl <em>Decision Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getDecisionNodeExecuteProperty()
	 * @generated
	 */
	int DECISION_NODE_EXECUTE_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Decision Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeExecutePropertyImpl <em>Activity Final Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityFinalNodeExecuteProperty()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_EXECUTE_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Activity Final Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeTerminatePropertyImpl <em>Activity Node Terminate Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeTerminatePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeTerminateProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_TERMINATE_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_TERMINATE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_TERMINATE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Activity Node Terminate Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_TERMINATE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionExecutePropertyImpl <em>Opaque Action Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionExecuteProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_EXECUTE_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Opaque Action Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeAddTokenPropertyImpl <em>Activity Node Add Token Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeAddTokenPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeAddTokenProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_ADD_TOKEN_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ADD_TOKEN_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ADD_TOKEN_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Activity Node Add Token Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ADD_TOKEN_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableAssignmentExecutePropertyImpl <em>Variable Assignment Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableAssignmentExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getVariableAssignmentExecuteProperty()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Variable Assignment Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeExecutePropertyImpl <em>Merge Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getMergeNodeExecuteProperty()
	 * @generated
	 */
	int MERGE_NODE_EXECUTE_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Merge Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableInitPropertyImpl <em>Variable Init Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableInitPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getVariableInitProperty()
	 * @generated
	 */
	int VARIABLE_INIT_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Variable Init Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityExecutePropertyImpl <em>Activity Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityExecuteProperty()
	 * @generated
	 */
	int ACTIVITY_EXECUTE_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Activity Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeExecutePropertyImpl <em>Fork Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getForkNodeExecuteProperty()
	 * @generated
	 */
	int FORK_NODE_EXECUTE_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Fork Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionExecutePropertyImpl <em>Accept Event Action Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionExecuteProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_EXECUTE_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Accept Event Action Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeExecutePropertyImpl <em>Flow Final Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFlowFinalNodeExecuteProperty()
	 * @generated
	 */
	int FLOW_FINAL_NODE_EXECUTE_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Flow Final Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeExecutePropertyImpl <em>Initial Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getInitialNodeExecuteProperty()
	 * @generated
	 */
	int INITIAL_NODE_EXECUTE_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Initial Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableAssignmentExecutePropertyImpl <em>Boolean Variable Assignment Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableAssignmentExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanVariableAssignmentExecuteProperty()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Boolean Variable Assignment Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeRemoveTokenPropertyImpl <em>Activity Node Remove Token Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeRemoveTokenPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeRemoveTokenProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_REMOVE_TOKEN_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_REMOVE_TOKEN_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_REMOVE_TOKEN_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Activity Node Remove Token Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_REMOVE_TOKEN_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableAssignmentExecutePropertyImpl <em>Integer Variable Assignment Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableAssignmentExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerVariableAssignmentExecuteProperty()
	 * @generated
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Integer Variable Assignment Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionAcceptPropertyImpl <em>Accept Event Action Accept Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionAcceptPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionAcceptProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_ACCEPT_PROPERTY = 18;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACCEPT_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACCEPT_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Accept Event Action Accept Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACCEPT_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeExecutePropertyImpl <em>Activity Node Execute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeExecutePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeExecuteProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_EXECUTE_PROPERTY = 19;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTE_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTE_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Activity Node Execute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTE_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionWaitForEventPropertyImpl <em>Accept Event Action Wait For Event Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionWaitForEventPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionWaitForEventProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_WAIT_FOR_EVENT_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_WAIT_FOR_EVENT_PROPERTY__STEPPING = XACTIVITY_DIAGRAM_STEP_PROPERTY__STEPPING;

	/**
	 * The feature id for the '<em><b>Target Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_WAIT_FOR_EVENT_PROPERTY__TARGET_PROVIDER = XACTIVITY_DIAGRAM_STEP_PROPERTY__TARGET_PROVIDER;

	/**
	 * The number of structural features of the '<em>Accept Event Action Wait For Event Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_WAIT_FOR_EVENT_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STEP_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramAbstractPropertyImpl <em>XActivity Diagram Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramAbstractPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramAbstractProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_ABSTRACT_PROPERTY = 21;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_ABSTRACT_PROPERTY_FEATURE_COUNT = PropertyPackage.ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramTemporalPropertyImpl <em>XActivity Diagram Temporal Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramTemporalPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramTemporalProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_TEMPORAL_PROPERTY = 22;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Temporal Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_TEMPORAL_PROPERTY_FEATURE_COUNT = PropertyPackage.TEMPORAL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyImpl <em>XActivity Diagram Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_PROPERTY = 23;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_PROPERTY_FEATURE_COUNT = PropertyPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramStatePropertyImpl <em>XActivity Diagram State Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramStatePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramStateProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_STATE_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_STATE_PROPERTY__TARGET = PropertyPackage.STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>XActivity Diagram State Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_STATE_PROPERTY_FEATURE_COUNT = PropertyPackage.STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.NamedElementPropertyImpl <em>Named Element Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.NamedElementPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getNamedElementProperty()
	 * @generated
	 */
	int NAMED_ELEMENT_PROPERTY = 26;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_PROPERTY__TARGET = XACTIVITY_DIAGRAM_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Named Element Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryNamedElementPropertyImpl <em>Unary Named Element Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryNamedElementPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryNamedElementProperty()
	 * @generated
	 */
	int UNARY_NAMED_ELEMENT_PROPERTY = 27;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NAMED_ELEMENT_PROPERTY__TARGET = NAMED_ELEMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NAMED_ELEMENT_PROPERTY__OPERATOR = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NAMED_ELEMENT_PROPERTY__PROPERTY = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Named Element Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NAMED_ELEMENT_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryNamedElementPropertyImpl <em>Binary Named Element Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryNamedElementPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryNamedElementProperty()
	 * @generated
	 */
	int BINARY_NAMED_ELEMENT_PROPERTY = 28;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NAMED_ELEMENT_PROPERTY__TARGET = NAMED_ELEMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NAMED_ELEMENT_PROPERTY__OPERATOR = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NAMED_ELEMENT_PROPERTY__LEFT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NAMED_ELEMENT_PROPERTY__RIGHT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Named Element Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NAMED_ELEMENT_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.NamedElementNamePropertyImpl <em>Named Element Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.NamedElementNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getNamedElementNameProperty()
	 * @generated
	 */
	int NAMED_ELEMENT_NAME_PROPERTY = 29;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_PROPERTY__TARGET = NAMED_ELEMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_PROPERTY__VALUE = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_PROPERTY__OPERATOR = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityPropertyImpl <em>Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityProperty()
	 * @generated
	 */
	int ACTIVITY_PROPERTY = 30;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PROPERTY__TARGET = NAMED_ELEMENT_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActivityPropertyImpl <em>Unary Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryActivityProperty()
	 * @generated
	 */
	int UNARY_ACTIVITY_PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_PROPERTY__TARGET = ACTIVITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_PROPERTY__OPERATOR = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_PROPERTY__PROPERTY = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_PROPERTY_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActivityPropertyImpl <em>Binary Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryActivityProperty()
	 * @generated
	 */
	int BINARY_ACTIVITY_PROPERTY = 32;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_PROPERTY__TARGET = ACTIVITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_PROPERTY__OPERATOR = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_PROPERTY__LEFT = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_PROPERTY__RIGHT = ACTIVITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_PROPERTY_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNamePropertyImpl <em>Activity Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNameProperty()
	 * @generated
	 */
	int ACTIVITY_NAME_PROPERTY = 33;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NAME_PROPERTY__TARGET = ACTIVITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NAME_PROPERTY__VALUE = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NAME_PROPERTY__OPERATOR = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NAME_PROPERTY_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.EventPropertyImpl <em>Event Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.EventPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getEventProperty()
	 * @generated
	 */
	int EVENT_PROPERTY = 35;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROPERTY__TARGET = NAMED_ELEMENT_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Event Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.EventActivityContainerPropertyImpl <em>Event Activity Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.EventActivityContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getEventActivityContainerProperty()
	 * @generated
	 */
	int EVENT_ACTIVITY_CONTAINER_PROPERTY = 34;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTIVITY_CONTAINER_PROPERTY__TARGET = EVENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTIVITY_CONTAINER_PROPERTY__PROPERTY = EVENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Activity Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTIVITY_CONTAINER_PROPERTY_FEATURE_COUNT = EVENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryEventPropertyImpl <em>Unary Event Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryEventPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryEventProperty()
	 * @generated
	 */
	int UNARY_EVENT_PROPERTY = 36;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PROPERTY__TARGET = EVENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PROPERTY__OPERATOR = EVENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PROPERTY__PROPERTY = EVENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Event Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PROPERTY_FEATURE_COUNT = EVENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryEventPropertyImpl <em>Binary Event Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryEventPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryEventProperty()
	 * @generated
	 */
	int BINARY_EVENT_PROPERTY = 37;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PROPERTY__TARGET = EVENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PROPERTY__OPERATOR = EVENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PROPERTY__LEFT = EVENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PROPERTY__RIGHT = EVENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Event Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PROPERTY_FEATURE_COUNT = EVENT_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.EventNamePropertyImpl <em>Event Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.EventNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getEventNameProperty()
	 * @generated
	 */
	int EVENT_NAME_PROPERTY = 38;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_NAME_PROPERTY__TARGET = EVENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_NAME_PROPERTY__VALUE = EVENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_NAME_PROPERTY__OPERATOR = EVENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_NAME_PROPERTY_FEATURE_COUNT = EVENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEventsPropertyImpl <em>Activity Events Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEventsPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityEventsProperty()
	 * @generated
	 */
	int ACTIVITY_EVENTS_PROPERTY = 39;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EVENTS_PROPERTY__TARGET = ACTIVITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EVENTS_PROPERTY__PROPERTY = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EVENTS_PROPERTY__QUANTIFIER = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Events Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EVENTS_PROPERTY_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodesPropertyImpl <em>Activity Nodes Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodesPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodesProperty()
	 * @generated
	 */
	int ACTIVITY_NODES_PROPERTY = 40;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_PROPERTY__TARGET = ACTIVITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_PROPERTY__PROPERTY = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_PROPERTY__QUANTIFIER = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Nodes Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_PROPERTY_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodePropertyImpl <em>Activity Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_PROPERTY = 41;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_PROPERTY__TARGET = NAMED_ELEMENT_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Activity Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActivityNodePropertyImpl <em>Unary Activity Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActivityNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryActivityNodeProperty()
	 * @generated
	 */
	int UNARY_ACTIVITY_NODE_PROPERTY = 42;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_NODE_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_NODE_PROPERTY__OPERATOR = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_NODE_PROPERTY__PROPERTY = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Activity Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_NODE_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActivityNodePropertyImpl <em>Binary Activity Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActivityNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryActivityNodeProperty()
	 * @generated
	 */
	int BINARY_ACTIVITY_NODE_PROPERTY = 43;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_NODE_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_NODE_PROPERTY__OPERATOR = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_NODE_PROPERTY__LEFT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_NODE_PROPERTY__RIGHT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Activity Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_NODE_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeNamePropertyImpl <em>Activity Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeNameProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_NAME_PROPERTY = 44;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_NAME_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_NAME_PROPERTY__VALUE = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_NAME_PROPERTY__OPERATOR = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_NAME_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeActivityPropertyImpl <em>Activity Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeActivityProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVITY_PROPERTY = 45;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVITY_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVITY_PROPERTY__PROPERTY = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeRunningPropertyImpl <em>Activity Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeRunningProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_RUNNING_PROPERTY = 46;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_PROPERTY__VALUE = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_PROPERTY__OPERATOR = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenPropertyImpl <em>Control Token Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_PROPERTY = 48;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_PROPERTY__TARGET = XACTIVITY_DIAGRAM_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Control Token Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenActivityNodeContainerPropertyImpl <em>Control Token Activity Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenActivityNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenActivityNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_ACTIVITY_NODE_CONTAINER_PROPERTY = 47;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Activity Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryControlTokenPropertyImpl <em>Unary Control Token Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryControlTokenPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryControlTokenProperty()
	 * @generated
	 */
	int UNARY_CONTROL_TOKEN_PROPERTY = 49;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_TOKEN_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_TOKEN_PROPERTY__OPERATOR = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_TOKEN_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Control Token Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_TOKEN_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlTokenPropertyImpl <em>Binary Control Token Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlTokenPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryControlTokenProperty()
	 * @generated
	 */
	int BINARY_CONTROL_TOKEN_PROPERTY = 50;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_TOKEN_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_TOKEN_PROPERTY__OPERATOR = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_TOKEN_PROPERTY__LEFT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_TOKEN_PROPERTY__RIGHT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Control Token Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_TOKEN_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeHeldTokensPropertyImpl <em>Activity Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityNodeHeldTokensProperty()
	 * @generated
	 */
	int ACTIVITY_NODE_HELD_TOKENS_PROPERTY = 51;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_PROPERTY__PROPERTY = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgePropertyImpl <em>Activity Edge Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityEdgeProperty()
	 * @generated
	 */
	int ACTIVITY_EDGE_PROPERTY = 53;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_PROPERTY__TARGET = NAMED_ELEMENT_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Activity Edge Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeActivityContainerPropertyImpl <em>Activity Edge Activity Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeActivityContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityEdgeActivityContainerProperty()
	 * @generated
	 */
	int ACTIVITY_EDGE_ACTIVITY_CONTAINER_PROPERTY = 52;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ACTIVITY_CONTAINER_PROPERTY__TARGET = ACTIVITY_EDGE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ACTIVITY_CONTAINER_PROPERTY__PROPERTY = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge Activity Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ACTIVITY_CONTAINER_PROPERTY_FEATURE_COUNT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActivityEdgePropertyImpl <em>Unary Activity Edge Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActivityEdgePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryActivityEdgeProperty()
	 * @generated
	 */
	int UNARY_ACTIVITY_EDGE_PROPERTY = 54;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_EDGE_PROPERTY__TARGET = ACTIVITY_EDGE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_EDGE_PROPERTY__OPERATOR = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_EDGE_PROPERTY__PROPERTY = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Activity Edge Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActivityEdgePropertyImpl <em>Binary Activity Edge Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActivityEdgePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryActivityEdgeProperty()
	 * @generated
	 */
	int BINARY_ACTIVITY_EDGE_PROPERTY = 55;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_EDGE_PROPERTY__TARGET = ACTIVITY_EDGE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_EDGE_PROPERTY__OPERATOR = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_EDGE_PROPERTY__LEFT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_EDGE_PROPERTY__RIGHT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Activity Edge Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeNamePropertyImpl <em>Activity Edge Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityEdgeNameProperty()
	 * @generated
	 */
	int ACTIVITY_EDGE_NAME_PROPERTY = 56;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_NAME_PROPERTY__TARGET = ACTIVITY_EDGE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_NAME_PROPERTY__VALUE = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_NAME_PROPERTY__OPERATOR = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Edge Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_NAME_PROPERTY_FEATURE_COUNT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeSourcePropertyImpl <em>Activity Edge Source Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeSourcePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityEdgeSourceProperty()
	 * @generated
	 */
	int ACTIVITY_EDGE_SOURCE_PROPERTY = 57;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_SOURCE_PROPERTY__TARGET = ACTIVITY_EDGE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_SOURCE_PROPERTY__PROPERTY = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge Source Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_SOURCE_PROPERTY_FEATURE_COUNT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeTargetPropertyImpl <em>Activity Edge Target Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeTargetPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityEdgeTargetProperty()
	 * @generated
	 */
	int ACTIVITY_EDGE_TARGET_PROPERTY = 58;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TARGET_PROPERTY__TARGET = ACTIVITY_EDGE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TARGET_PROPERTY__PROPERTY = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge Target Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TARGET_PROPERTY_FEATURE_COUNT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenActivityEdgeContainerPropertyImpl <em>Control Token Activity Edge Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenActivityEdgeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenActivityEdgeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_ACTIVITY_EDGE_CONTAINER_PROPERTY = 59;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_EDGE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_EDGE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Activity Edge Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_EDGE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeOfferedTokensPropertyImpl <em>Activity Edge Offered Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgeOfferedTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityEdgeOfferedTokensProperty()
	 * @generated
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_PROPERTY = 60;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_PROPERTY__TARGET = ACTIVITY_EDGE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_PROPERTY__PROPERTY = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_PROPERTY__QUANTIFIER = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Edge Offered Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_PROPERTY_FEATURE_COUNT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgesPropertyImpl <em>Activity Edges Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityEdgesPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityEdgesProperty()
	 * @generated
	 */
	int ACTIVITY_EDGES_PROPERTY = 61;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_PROPERTY__TARGET = ACTIVITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_PROPERTY__PROPERTY = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_PROPERTY__QUANTIFIER = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Edges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_PROPERTY_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ExpressionPropertyImpl <em>Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getExpressionProperty()
	 * @generated
	 */
	int EXPRESSION_PROPERTY = 64;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PROPERTY__TARGET = XACTIVITY_DIAGRAM_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariablePropertyImpl <em>Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getVariableProperty()
	 * @generated
	 */
	int VARIABLE_PROPERTY = 63;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PROPERTY__TARGET = EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PROPERTY_FEATURE_COUNT = EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableActivityContainerPropertyImpl <em>Variable Activity Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableActivityContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getVariableActivityContainerProperty()
	 * @generated
	 */
	int VARIABLE_ACTIVITY_CONTAINER_PROPERTY = 62;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTIVITY_CONTAINER_PROPERTY__TARGET = VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTIVITY_CONTAINER_PROPERTY__PROPERTY = VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Activity Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTIVITY_CONTAINER_PROPERTY_FEATURE_COUNT = VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryExpressionPropertyImpl <em>Unary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryExpressionProperty()
	 * @generated
	 */
	int UNARY_EXPRESSION_PROPERTY = 65;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_PROPERTY__TARGET = EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_PROPERTY__OPERATOR = EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_PROPERTY__PROPERTY = EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT = EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryExpressionPropertyImpl <em>Binary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryExpressionProperty()
	 * @generated
	 */
	int BINARY_EXPRESSION_PROPERTY = 66;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_PROPERTY__TARGET = EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_PROPERTY__OPERATOR = EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_PROPERTY__LEFT = EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_PROPERTY__RIGHT = EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT = EXPRESSION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryVariablePropertyImpl <em>Unary Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryVariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryVariableProperty()
	 * @generated
	 */
	int UNARY_VARIABLE_PROPERTY = 67;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VARIABLE_PROPERTY__TARGET = VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VARIABLE_PROPERTY__OPERATOR = VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VARIABLE_PROPERTY__PROPERTY = VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VARIABLE_PROPERTY_FEATURE_COUNT = VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryVariablePropertyImpl <em>Binary Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryVariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryVariableProperty()
	 * @generated
	 */
	int BINARY_VARIABLE_PROPERTY = 68;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_PROPERTY__TARGET = VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_PROPERTY__OPERATOR = VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_PROPERTY__LEFT = VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_PROPERTY__RIGHT = VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_PROPERTY_FEATURE_COUNT = VARIABLE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableNamePropertyImpl <em>Variable Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getVariableNameProperty()
	 * @generated
	 */
	int VARIABLE_NAME_PROPERTY = 69;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_PROPERTY__TARGET = VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_PROPERTY__VALUE = VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_PROPERTY__OPERATOR = VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_PROPERTY_FEATURE_COUNT = VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityLocalsPropertyImpl <em>Activity Locals Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityLocalsPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityLocalsProperty()
	 * @generated
	 */
	int ACTIVITY_LOCALS_PROPERTY = 70;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_PROPERTY__TARGET = ACTIVITY_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_PROPERTY__PROPERTY = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_PROPERTY__QUANTIFIER = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Locals Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_PROPERTY_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowPropertyImpl <em>Control Flow Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlFlowProperty()
	 * @generated
	 */
	int CONTROL_FLOW_PROPERTY = 71;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_PROPERTY__TARGET = ACTIVITY_EDGE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Control Flow Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_PROPERTY_FEATURE_COUNT = ACTIVITY_EDGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryControlFlowPropertyImpl <em>Unary Control Flow Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryControlFlowPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryControlFlowProperty()
	 * @generated
	 */
	int UNARY_CONTROL_FLOW_PROPERTY = 72;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_FLOW_PROPERTY__TARGET = CONTROL_FLOW_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_FLOW_PROPERTY__OPERATOR = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_FLOW_PROPERTY__PROPERTY = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Control Flow Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_FLOW_PROPERTY_FEATURE_COUNT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlFlowPropertyImpl <em>Binary Control Flow Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlFlowPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryControlFlowProperty()
	 * @generated
	 */
	int BINARY_CONTROL_FLOW_PROPERTY = 73;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_FLOW_PROPERTY__TARGET = CONTROL_FLOW_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_FLOW_PROPERTY__OPERATOR = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_FLOW_PROPERTY__LEFT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_FLOW_PROPERTY__RIGHT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Control Flow Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_FLOW_PROPERTY_FEATURE_COUNT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowNamePropertyImpl <em>Control Flow Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlFlowNameProperty()
	 * @generated
	 */
	int CONTROL_FLOW_NAME_PROPERTY = 74;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NAME_PROPERTY__TARGET = CONTROL_FLOW_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NAME_PROPERTY__VALUE = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NAME_PROPERTY__OPERATOR = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Flow Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_NAME_PROPERTY_FEATURE_COUNT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowSourcePropertyImpl <em>Control Flow Source Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowSourcePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlFlowSourceProperty()
	 * @generated
	 */
	int CONTROL_FLOW_SOURCE_PROPERTY = 75;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE_PROPERTY__TARGET = CONTROL_FLOW_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE_PROPERTY__PROPERTY = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow Source Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_SOURCE_PROPERTY_FEATURE_COUNT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowTargetPropertyImpl <em>Control Flow Target Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowTargetPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlFlowTargetProperty()
	 * @generated
	 */
	int CONTROL_FLOW_TARGET_PROPERTY = 76;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TARGET_PROPERTY__TARGET = CONTROL_FLOW_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TARGET_PROPERTY__PROPERTY = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow Target Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TARGET_PROPERTY_FEATURE_COUNT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenControlFlowContainerPropertyImpl <em>Control Token Control Flow Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenControlFlowContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenControlFlowContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_CONTROL_FLOW_CONTAINER_PROPERTY = 77;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_CONTROL_FLOW_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_CONTROL_FLOW_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Control Flow Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_CONTROL_FLOW_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowOfferedTokensPropertyImpl <em>Control Flow Offered Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowOfferedTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlFlowOfferedTokensProperty()
	 * @generated
	 */
	int CONTROL_FLOW_OFFERED_TOKENS_PROPERTY = 78;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OFFERED_TOKENS_PROPERTY__TARGET = CONTROL_FLOW_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OFFERED_TOKENS_PROPERTY__PROPERTY = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OFFERED_TOKENS_PROPERTY__QUANTIFIER = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Flow Offered Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OFFERED_TOKENS_PROPERTY_FEATURE_COUNT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowGuardPropertyImpl <em>Control Flow Guard Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlFlowGuardPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlFlowGuardProperty()
	 * @generated
	 */
	int CONTROL_FLOW_GUARD_PROPERTY = 79;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GUARD_PROPERTY__TARGET = CONTROL_FLOW_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GUARD_PROPERTY__PROPERTY = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow Guard Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GUARD_PROPERTY_FEATURE_COUNT = CONTROL_FLOW_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariablePropertyImpl <em>Boolean Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanVariableProperty()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_PROPERTY = 80;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_PROPERTY__TARGET = VARIABLE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Boolean Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT = VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanExpressionPropertyImpl <em>Boolean Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanExpressionProperty()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_PROPERTY = 81;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_PROPERTY__TARGET = EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Boolean Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT = EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanExpressionPropertyImpl <em>Unary Boolean Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryBooleanExpressionProperty()
	 * @generated
	 */
	int UNARY_BOOLEAN_EXPRESSION_PROPERTY = 82;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION_PROPERTY__TARGET = BOOLEAN_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION_PROPERTY__OPERATOR = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION_PROPERTY__PROPERTY = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Boolean Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanExpressionPropertyImpl <em>Binary Boolean Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryBooleanExpressionProperty()
	 * @generated
	 */
	int BINARY_BOOLEAN_EXPRESSION_PROPERTY = 83;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION_PROPERTY__TARGET = BOOLEAN_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION_PROPERTY__OPERATOR = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION_PROPERTY__LEFT = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION_PROPERTY__RIGHT = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Boolean Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanVariablePropertyImpl <em>Unary Boolean Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanVariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryBooleanVariableProperty()
	 * @generated
	 */
	int UNARY_BOOLEAN_VARIABLE_PROPERTY = 84;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VARIABLE_PROPERTY__TARGET = BOOLEAN_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VARIABLE_PROPERTY__OPERATOR = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VARIABLE_PROPERTY__PROPERTY = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Boolean Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanVariablePropertyImpl <em>Binary Boolean Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanVariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryBooleanVariableProperty()
	 * @generated
	 */
	int BINARY_BOOLEAN_VARIABLE_PROPERTY = 85;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_PROPERTY__TARGET = BOOLEAN_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_PROPERTY__OPERATOR = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_PROPERTY__LEFT = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_PROPERTY__RIGHT = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Boolean Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableNamePropertyImpl <em>Boolean Variable Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanVariableNameProperty()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_NAME_PROPERTY = 86;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_NAME_PROPERTY__TARGET = BOOLEAN_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_NAME_PROPERTY__VALUE = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_NAME_PROPERTY__OPERATOR = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Variable Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_NAME_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableInitialValuePropertyImpl <em>Boolean Variable Initial Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableInitialValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanVariableInitialValueProperty()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_INITIAL_VALUE_PROPERTY = 87;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_INITIAL_VALUE_PROPERTY__TARGET = BOOLEAN_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_INITIAL_VALUE_PROPERTY__VALUE = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_INITIAL_VALUE_PROPERTY__OPERATOR = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Variable Initial Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_INITIAL_VALUE_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableCurrentValuePropertyImpl <em>Boolean Variable Current Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableCurrentValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanVariableCurrentValueProperty()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_PROPERTY = 88;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_PROPERTY__TARGET = BOOLEAN_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_PROPERTY__VALUE = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_PROPERTY__OPERATOR = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Variable Current Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionPropertyImpl <em>Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActionProperty()
	 * @generated
	 */
	int ACTION_PROPERTY = 89;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActionPropertyImpl <em>Unary Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryActionProperty()
	 * @generated
	 */
	int UNARY_ACTION_PROPERTY = 90;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTION_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTION_PROPERTY__OPERATOR = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTION_PROPERTY__PROPERTY = ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTION_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActionPropertyImpl <em>Binary Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryActionProperty()
	 * @generated
	 */
	int BINARY_ACTION_PROPERTY = 91;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTION_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTION_PROPERTY__OPERATOR = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTION_PROPERTY__LEFT = ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTION_PROPERTY__RIGHT = ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTION_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionNamePropertyImpl <em>Action Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActionNameProperty()
	 * @generated
	 */
	int ACTION_NAME_PROPERTY = 92;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NAME_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NAME_PROPERTY__VALUE = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NAME_PROPERTY__OPERATOR = ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NAME_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionActivityPropertyImpl <em>Action Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActionActivityProperty()
	 * @generated
	 */
	int ACTION_ACTIVITY_PROPERTY = 93;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVITY_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVITY_PROPERTY__PROPERTY = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ACTIVITY_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionRunningPropertyImpl <em>Action Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActionRunningProperty()
	 * @generated
	 */
	int ACTION_RUNNING_PROPERTY = 94;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNNING_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNNING_PROPERTY__VALUE = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNNING_PROPERTY__OPERATOR = ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNNING_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenActionContainerPropertyImpl <em>Control Token Action Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenActionContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenActionContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_ACTION_CONTAINER_PROPERTY = 95;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTION_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTION_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Action Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTION_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionHeldTokensPropertyImpl <em>Action Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActionHeldTokensProperty()
	 * @generated
	 */
	int ACTION_HELD_TOKENS_PROPERTY = 96;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_HELD_TOKENS_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_HELD_TOKENS_PROPERTY__PROPERTY = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_HELD_TOKENS_PROPERTY__QUANTIFIER = ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_HELD_TOKENS_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionIncomingPropertyImpl <em>Action Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActionIncomingProperty()
	 * @generated
	 */
	int ACTION_INCOMING_PROPERTY = 97;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INCOMING_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INCOMING_PROPERTY__PROPERTY = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INCOMING_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionOutgoingPropertyImpl <em>Action Outgoing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActionOutgoingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActionOutgoingProperty()
	 * @generated
	 */
	int ACTION_OUTGOING_PROPERTY = 98;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OUTGOING_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OUTGOING_PROPERTY__PROPERTY = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Outgoing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OUTGOING_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionPropertyImpl <em>Opaque Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_PROPERTY = 99;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_PROPERTY__TARGET = ACTION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Opaque Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_PROPERTY_FEATURE_COUNT = ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryOpaqueActionPropertyImpl <em>Unary Opaque Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryOpaqueActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryOpaqueActionProperty()
	 * @generated
	 */
	int UNARY_OPAQUE_ACTION_PROPERTY = 100;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPAQUE_ACTION_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPAQUE_ACTION_PROPERTY__OPERATOR = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPAQUE_ACTION_PROPERTY__PROPERTY = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Opaque Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPAQUE_ACTION_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryOpaqueActionPropertyImpl <em>Binary Opaque Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryOpaqueActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryOpaqueActionProperty()
	 * @generated
	 */
	int BINARY_OPAQUE_ACTION_PROPERTY = 101;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPAQUE_ACTION_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPAQUE_ACTION_PROPERTY__OPERATOR = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPAQUE_ACTION_PROPERTY__LEFT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPAQUE_ACTION_PROPERTY__RIGHT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Opaque Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPAQUE_ACTION_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionNamePropertyImpl <em>Opaque Action Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionNameProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_NAME_PROPERTY = 102;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_NAME_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_NAME_PROPERTY__VALUE = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_NAME_PROPERTY__OPERATOR = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Action Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_NAME_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionActivityPropertyImpl <em>Opaque Action Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionActivityProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_ACTIVITY_PROPERTY = 103;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVITY_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVITY_PROPERTY__PROPERTY = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Action Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ACTIVITY_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionRunningPropertyImpl <em>Opaque Action Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionRunningProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_RUNNING_PROPERTY = 104;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_RUNNING_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_RUNNING_PROPERTY__VALUE = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_RUNNING_PROPERTY__OPERATOR = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Action Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_RUNNING_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenOpaqueActionContainerPropertyImpl <em>Control Token Opaque Action Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenOpaqueActionContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenOpaqueActionContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_OPAQUE_ACTION_CONTAINER_PROPERTY = 105;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_OPAQUE_ACTION_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Opaque Action Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_OPAQUE_ACTION_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionHeldTokensPropertyImpl <em>Opaque Action Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionHeldTokensProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_HELD_TOKENS_PROPERTY = 106;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_HELD_TOKENS_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_HELD_TOKENS_PROPERTY__PROPERTY = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_HELD_TOKENS_PROPERTY__QUANTIFIER = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Action Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_HELD_TOKENS_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionIncomingPropertyImpl <em>Opaque Action Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionIncomingProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_INCOMING_PROPERTY = 107;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_INCOMING_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_INCOMING_PROPERTY__PROPERTY = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Action Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_INCOMING_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionOutgoingPropertyImpl <em>Opaque Action Outgoing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionOutgoingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionOutgoingProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_OUTGOING_PROPERTY = 108;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_OUTGOING_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_OUTGOING_PROPERTY__PROPERTY = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Action Outgoing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_OUTGOING_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableAssignmentPropertyImpl <em>Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getVariableAssignmentProperty()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT_PROPERTY = 110;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_PROPERTY__TARGET = XACTIVITY_DIAGRAM_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableAssignmentOpaqueActionContainerPropertyImpl <em>Variable Assignment Opaque Action Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.VariableAssignmentOpaqueActionContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getVariableAssignmentOpaqueActionContainerProperty()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY = 109;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__TARGET = VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY__PROPERTY = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Assignment Opaque Action Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPAQUE_ACTION_CONTAINER_PROPERTY_FEATURE_COUNT = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryVariableAssignmentPropertyImpl <em>Unary Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryVariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryVariableAssignmentProperty()
	 * @generated
	 */
	int UNARY_VARIABLE_ASSIGNMENT_PROPERTY = 111;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VARIABLE_ASSIGNMENT_PROPERTY__TARGET = VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VARIABLE_ASSIGNMENT_PROPERTY__OPERATOR = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VARIABLE_ASSIGNMENT_PROPERTY__PROPERTY = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryVariableAssignmentPropertyImpl <em>Binary Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryVariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryVariableAssignmentProperty()
	 * @generated
	 */
	int BINARY_VARIABLE_ASSIGNMENT_PROPERTY = 112;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_ASSIGNMENT_PROPERTY__TARGET = VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_ASSIGNMENT_PROPERTY__OPERATOR = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_ASSIGNMENT_PROPERTY__LEFT = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_ASSIGNMENT_PROPERTY__RIGHT = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionAssignmentsPropertyImpl <em>Opaque Action Assignments Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OpaqueActionAssignmentsPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOpaqueActionAssignmentsProperty()
	 * @generated
	 */
	int OPAQUE_ACTION_ASSIGNMENTS_PROPERTY = 113;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASSIGNMENTS_PROPERTY__TARGET = OPAQUE_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASSIGNMENTS_PROPERTY__PROPERTY = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASSIGNMENTS_PROPERTY__QUANTIFIER = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Action Assignments Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASSIGNMENTS_PROPERTY_FEATURE_COUNT = OPAQUE_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionPropertyImpl <em>Accept Event Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_PROPERTY = 114;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Accept Event Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryAcceptEventActionPropertyImpl <em>Unary Accept Event Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryAcceptEventActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryAcceptEventActionProperty()
	 * @generated
	 */
	int UNARY_ACCEPT_EVENT_ACTION_PROPERTY = 115;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACCEPT_EVENT_ACTION_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACCEPT_EVENT_ACTION_PROPERTY__OPERATOR = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACCEPT_EVENT_ACTION_PROPERTY__PROPERTY = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Accept Event Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryAcceptEventActionPropertyImpl <em>Binary Accept Event Action Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryAcceptEventActionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryAcceptEventActionProperty()
	 * @generated
	 */
	int BINARY_ACCEPT_EVENT_ACTION_PROPERTY = 116;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACCEPT_EVENT_ACTION_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACCEPT_EVENT_ACTION_PROPERTY__OPERATOR = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACCEPT_EVENT_ACTION_PROPERTY__LEFT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACCEPT_EVENT_ACTION_PROPERTY__RIGHT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Accept Event Action Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionNamePropertyImpl <em>Accept Event Action Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionNameProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_NAME_PROPERTY = 117;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_NAME_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_NAME_PROPERTY__VALUE = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_NAME_PROPERTY__OPERATOR = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accept Event Action Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_NAME_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionActivityPropertyImpl <em>Accept Event Action Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionActivityProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_ACTIVITY_PROPERTY = 118;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACTIVITY_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACTIVITY_PROPERTY__PROPERTY = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Event Action Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_ACTIVITY_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionRunningPropertyImpl <em>Accept Event Action Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionRunningProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_RUNNING_PROPERTY = 119;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_RUNNING_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_RUNNING_PROPERTY__VALUE = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_RUNNING_PROPERTY__OPERATOR = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accept Event Action Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_RUNNING_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenAcceptEventActionContainerPropertyImpl <em>Control Token Accept Event Action Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenAcceptEventActionContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenAcceptEventActionContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_ACCEPT_EVENT_ACTION_CONTAINER_PROPERTY = 120;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACCEPT_EVENT_ACTION_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACCEPT_EVENT_ACTION_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Accept Event Action Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACCEPT_EVENT_ACTION_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionHeldTokensPropertyImpl <em>Accept Event Action Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionHeldTokensProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_HELD_TOKENS_PROPERTY = 121;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_HELD_TOKENS_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_HELD_TOKENS_PROPERTY__PROPERTY = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_HELD_TOKENS_PROPERTY__QUANTIFIER = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accept Event Action Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_HELD_TOKENS_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionEventTypePropertyImpl <em>Accept Event Action Event Type Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionEventTypePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionEventTypeProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_EVENT_TYPE_PROPERTY = 122;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_EVENT_TYPE_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_EVENT_TYPE_PROPERTY__PROPERTY = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Event Action Event Type Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_EVENT_TYPE_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionIncomingPropertyImpl <em>Accept Event Action Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionIncomingProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_INCOMING_PROPERTY = 123;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_INCOMING_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_INCOMING_PROPERTY__PROPERTY = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Event Action Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_INCOMING_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionOutgoingPropertyImpl <em>Accept Event Action Outgoing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.AcceptEventActionOutgoingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getAcceptEventActionOutgoingProperty()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION_OUTGOING_PROPERTY = 124;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_OUTGOING_PROPERTY__TARGET = ACCEPT_EVENT_ACTION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_OUTGOING_PROPERTY__PROPERTY = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Event Action Outgoing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_OUTGOING_PROPERTY_FEATURE_COUNT = ACCEPT_EVENT_ACTION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodePropertyImpl <em>Control Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlNodeProperty()
	 * @generated
	 */
	int CONTROL_NODE_PROPERTY = 125;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_PROPERTY__TARGET = ACTIVITY_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Control Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_PROPERTY_FEATURE_COUNT = ACTIVITY_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryControlNodePropertyImpl <em>Unary Control Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryControlNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryControlNodeProperty()
	 * @generated
	 */
	int UNARY_CONTROL_NODE_PROPERTY = 126;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_NODE_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_NODE_PROPERTY__OPERATOR = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_NODE_PROPERTY__PROPERTY = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Control Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONTROL_NODE_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlNodePropertyImpl <em>Binary Control Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryControlNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryControlNodeProperty()
	 * @generated
	 */
	int BINARY_CONTROL_NODE_PROPERTY = 127;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_NODE_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_NODE_PROPERTY__OPERATOR = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_NODE_PROPERTY__LEFT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_NODE_PROPERTY__RIGHT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Control Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTROL_NODE_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodeNamePropertyImpl <em>Control Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlNodeNameProperty()
	 * @generated
	 */
	int CONTROL_NODE_NAME_PROPERTY = 128;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_NAME_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_NAME_PROPERTY__VALUE = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_NAME_PROPERTY__OPERATOR = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_NAME_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodeActivityPropertyImpl <em>Control Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlNodeActivityProperty()
	 * @generated
	 */
	int CONTROL_NODE_ACTIVITY_PROPERTY = 129;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVITY_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVITY_PROPERTY__PROPERTY = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodeRunningPropertyImpl <em>Control Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlNodeRunningProperty()
	 * @generated
	 */
	int CONTROL_NODE_RUNNING_PROPERTY = 130;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_RUNNING_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_RUNNING_PROPERTY__VALUE = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_RUNNING_PROPERTY__OPERATOR = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_RUNNING_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenControlNodeContainerPropertyImpl <em>Control Token Control Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenControlNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenControlNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_CONTROL_NODE_CONTAINER_PROPERTY = 131;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_CONTROL_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_CONTROL_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Control Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_CONTROL_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodeHeldTokensPropertyImpl <em>Control Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlNodeHeldTokensProperty()
	 * @generated
	 */
	int CONTROL_NODE_HELD_TOKENS_PROPERTY = 132;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_HELD_TOKENS_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_HELD_TOKENS_PROPERTY__PROPERTY = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodePropertyImpl <em>Initial Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getInitialNodeProperty()
	 * @generated
	 */
	int INITIAL_NODE_PROPERTY = 133;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Initial Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryInitialNodePropertyImpl <em>Unary Initial Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryInitialNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryInitialNodeProperty()
	 * @generated
	 */
	int UNARY_INITIAL_NODE_PROPERTY = 134;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INITIAL_NODE_PROPERTY__TARGET = INITIAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INITIAL_NODE_PROPERTY__OPERATOR = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INITIAL_NODE_PROPERTY__PROPERTY = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Initial Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INITIAL_NODE_PROPERTY_FEATURE_COUNT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryInitialNodePropertyImpl <em>Binary Initial Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryInitialNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryInitialNodeProperty()
	 * @generated
	 */
	int BINARY_INITIAL_NODE_PROPERTY = 135;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INITIAL_NODE_PROPERTY__TARGET = INITIAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INITIAL_NODE_PROPERTY__OPERATOR = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INITIAL_NODE_PROPERTY__LEFT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INITIAL_NODE_PROPERTY__RIGHT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Initial Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INITIAL_NODE_PROPERTY_FEATURE_COUNT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeNamePropertyImpl <em>Initial Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getInitialNodeNameProperty()
	 * @generated
	 */
	int INITIAL_NODE_NAME_PROPERTY = 136;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_NAME_PROPERTY__TARGET = INITIAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_NAME_PROPERTY__VALUE = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_NAME_PROPERTY__OPERATOR = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initial Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_NAME_PROPERTY_FEATURE_COUNT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeActivityPropertyImpl <em>Initial Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getInitialNodeActivityProperty()
	 * @generated
	 */
	int INITIAL_NODE_ACTIVITY_PROPERTY = 137;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVITY_PROPERTY__TARGET = INITIAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVITY_PROPERTY__PROPERTY = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeRunningPropertyImpl <em>Initial Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getInitialNodeRunningProperty()
	 * @generated
	 */
	int INITIAL_NODE_RUNNING_PROPERTY = 138;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_RUNNING_PROPERTY__TARGET = INITIAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_RUNNING_PROPERTY__VALUE = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_RUNNING_PROPERTY__OPERATOR = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initial Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_RUNNING_PROPERTY_FEATURE_COUNT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenInitialNodeContainerPropertyImpl <em>Control Token Initial Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenInitialNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenInitialNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_INITIAL_NODE_CONTAINER_PROPERTY = 139;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_INITIAL_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_INITIAL_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Initial Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_INITIAL_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeHeldTokensPropertyImpl <em>Initial Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getInitialNodeHeldTokensProperty()
	 * @generated
	 */
	int INITIAL_NODE_HELD_TOKENS_PROPERTY = 140;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_HELD_TOKENS_PROPERTY__TARGET = INITIAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initial Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeOutgoingPropertyImpl <em>Initial Node Outgoing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.InitialNodeOutgoingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getInitialNodeOutgoingProperty()
	 * @generated
	 */
	int INITIAL_NODE_OUTGOING_PROPERTY = 141;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OUTGOING_PROPERTY__TARGET = INITIAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OUTGOING_PROPERTY__PROPERTY = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Node Outgoing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OUTGOING_PROPERTY_FEATURE_COUNT = INITIAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodePropertyImpl <em>Decision Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getDecisionNodeProperty()
	 * @generated
	 */
	int DECISION_NODE_PROPERTY = 142;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Decision Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryDecisionNodePropertyImpl <em>Unary Decision Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryDecisionNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryDecisionNodeProperty()
	 * @generated
	 */
	int UNARY_DECISION_NODE_PROPERTY = 143;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DECISION_NODE_PROPERTY__TARGET = DECISION_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DECISION_NODE_PROPERTY__OPERATOR = DECISION_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DECISION_NODE_PROPERTY__PROPERTY = DECISION_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Decision Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DECISION_NODE_PROPERTY_FEATURE_COUNT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryDecisionNodePropertyImpl <em>Binary Decision Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryDecisionNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryDecisionNodeProperty()
	 * @generated
	 */
	int BINARY_DECISION_NODE_PROPERTY = 144;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DECISION_NODE_PROPERTY__TARGET = DECISION_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DECISION_NODE_PROPERTY__OPERATOR = DECISION_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DECISION_NODE_PROPERTY__LEFT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DECISION_NODE_PROPERTY__RIGHT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Decision Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DECISION_NODE_PROPERTY_FEATURE_COUNT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeNamePropertyImpl <em>Decision Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getDecisionNodeNameProperty()
	 * @generated
	 */
	int DECISION_NODE_NAME_PROPERTY = 145;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_NAME_PROPERTY__TARGET = DECISION_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_NAME_PROPERTY__VALUE = DECISION_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_NAME_PROPERTY__OPERATOR = DECISION_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_NAME_PROPERTY_FEATURE_COUNT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeActivityPropertyImpl <em>Decision Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getDecisionNodeActivityProperty()
	 * @generated
	 */
	int DECISION_NODE_ACTIVITY_PROPERTY = 146;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVITY_PROPERTY__TARGET = DECISION_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVITY_PROPERTY__PROPERTY = DECISION_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeRunningPropertyImpl <em>Decision Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getDecisionNodeRunningProperty()
	 * @generated
	 */
	int DECISION_NODE_RUNNING_PROPERTY = 147;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_RUNNING_PROPERTY__TARGET = DECISION_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_RUNNING_PROPERTY__VALUE = DECISION_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_RUNNING_PROPERTY__OPERATOR = DECISION_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_RUNNING_PROPERTY_FEATURE_COUNT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenDecisionNodeContainerPropertyImpl <em>Control Token Decision Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenDecisionNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenDecisionNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_DECISION_NODE_CONTAINER_PROPERTY = 148;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_DECISION_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_DECISION_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Decision Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_DECISION_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeHeldTokensPropertyImpl <em>Decision Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getDecisionNodeHeldTokensProperty()
	 * @generated
	 */
	int DECISION_NODE_HELD_TOKENS_PROPERTY = 149;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_HELD_TOKENS_PROPERTY__TARGET = DECISION_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_HELD_TOKENS_PROPERTY__PROPERTY = DECISION_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = DECISION_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeIncomingPropertyImpl <em>Decision Node Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getDecisionNodeIncomingProperty()
	 * @generated
	 */
	int DECISION_NODE_INCOMING_PROPERTY = 150;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_INCOMING_PROPERTY__TARGET = DECISION_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_INCOMING_PROPERTY__PROPERTY = DECISION_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision Node Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_INCOMING_PROPERTY_FEATURE_COUNT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeOutgoingPropertyImpl <em>Decision Node Outgoing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.DecisionNodeOutgoingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getDecisionNodeOutgoingProperty()
	 * @generated
	 */
	int DECISION_NODE_OUTGOING_PROPERTY = 151;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_OUTGOING_PROPERTY__TARGET = DECISION_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_OUTGOING_PROPERTY__PROPERTY = DECISION_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_OUTGOING_PROPERTY__QUANTIFIER = DECISION_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node Outgoing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_OUTGOING_PROPERTY_FEATURE_COUNT = DECISION_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodePropertyImpl <em>Merge Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getMergeNodeProperty()
	 * @generated
	 */
	int MERGE_NODE_PROPERTY = 152;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Merge Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryMergeNodePropertyImpl <em>Unary Merge Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryMergeNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryMergeNodeProperty()
	 * @generated
	 */
	int UNARY_MERGE_NODE_PROPERTY = 153;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MERGE_NODE_PROPERTY__TARGET = MERGE_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MERGE_NODE_PROPERTY__OPERATOR = MERGE_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MERGE_NODE_PROPERTY__PROPERTY = MERGE_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Merge Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MERGE_NODE_PROPERTY_FEATURE_COUNT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryMergeNodePropertyImpl <em>Binary Merge Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryMergeNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryMergeNodeProperty()
	 * @generated
	 */
	int BINARY_MERGE_NODE_PROPERTY = 154;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MERGE_NODE_PROPERTY__TARGET = MERGE_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MERGE_NODE_PROPERTY__OPERATOR = MERGE_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MERGE_NODE_PROPERTY__LEFT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MERGE_NODE_PROPERTY__RIGHT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Merge Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MERGE_NODE_PROPERTY_FEATURE_COUNT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeNamePropertyImpl <em>Merge Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getMergeNodeNameProperty()
	 * @generated
	 */
	int MERGE_NODE_NAME_PROPERTY = 155;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_NAME_PROPERTY__TARGET = MERGE_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_NAME_PROPERTY__VALUE = MERGE_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_NAME_PROPERTY__OPERATOR = MERGE_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_NAME_PROPERTY_FEATURE_COUNT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeActivityPropertyImpl <em>Merge Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getMergeNodeActivityProperty()
	 * @generated
	 */
	int MERGE_NODE_ACTIVITY_PROPERTY = 156;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVITY_PROPERTY__TARGET = MERGE_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVITY_PROPERTY__PROPERTY = MERGE_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeRunningPropertyImpl <em>Merge Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getMergeNodeRunningProperty()
	 * @generated
	 */
	int MERGE_NODE_RUNNING_PROPERTY = 157;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_RUNNING_PROPERTY__TARGET = MERGE_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_RUNNING_PROPERTY__VALUE = MERGE_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_RUNNING_PROPERTY__OPERATOR = MERGE_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_RUNNING_PROPERTY_FEATURE_COUNT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenMergeNodeContainerPropertyImpl <em>Control Token Merge Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenMergeNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenMergeNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_MERGE_NODE_CONTAINER_PROPERTY = 158;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_MERGE_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_MERGE_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Merge Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_MERGE_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeHeldTokensPropertyImpl <em>Merge Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getMergeNodeHeldTokensProperty()
	 * @generated
	 */
	int MERGE_NODE_HELD_TOKENS_PROPERTY = 159;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_HELD_TOKENS_PROPERTY__TARGET = MERGE_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_HELD_TOKENS_PROPERTY__PROPERTY = MERGE_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = MERGE_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeIncomingPropertyImpl <em>Merge Node Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getMergeNodeIncomingProperty()
	 * @generated
	 */
	int MERGE_NODE_INCOMING_PROPERTY = 160;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_INCOMING_PROPERTY__TARGET = MERGE_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_INCOMING_PROPERTY__PROPERTY = MERGE_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_INCOMING_PROPERTY__QUANTIFIER = MERGE_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Node Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_INCOMING_PROPERTY_FEATURE_COUNT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeOutgoingPropertyImpl <em>Merge Node Outgoing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.MergeNodeOutgoingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getMergeNodeOutgoingProperty()
	 * @generated
	 */
	int MERGE_NODE_OUTGOING_PROPERTY = 161;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OUTGOING_PROPERTY__TARGET = MERGE_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OUTGOING_PROPERTY__PROPERTY = MERGE_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge Node Outgoing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OUTGOING_PROPERTY_FEATURE_COUNT = MERGE_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodePropertyImpl <em>Fork Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getForkNodeProperty()
	 * @generated
	 */
	int FORK_NODE_PROPERTY = 162;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Fork Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryForkNodePropertyImpl <em>Unary Fork Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryForkNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryForkNodeProperty()
	 * @generated
	 */
	int UNARY_FORK_NODE_PROPERTY = 163;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORK_NODE_PROPERTY__TARGET = FORK_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORK_NODE_PROPERTY__OPERATOR = FORK_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORK_NODE_PROPERTY__PROPERTY = FORK_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Fork Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORK_NODE_PROPERTY_FEATURE_COUNT = FORK_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryForkNodePropertyImpl <em>Binary Fork Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryForkNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryForkNodeProperty()
	 * @generated
	 */
	int BINARY_FORK_NODE_PROPERTY = 164;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORK_NODE_PROPERTY__TARGET = FORK_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORK_NODE_PROPERTY__OPERATOR = FORK_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORK_NODE_PROPERTY__LEFT = FORK_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORK_NODE_PROPERTY__RIGHT = FORK_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Fork Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORK_NODE_PROPERTY_FEATURE_COUNT = FORK_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeNamePropertyImpl <em>Fork Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getForkNodeNameProperty()
	 * @generated
	 */
	int FORK_NODE_NAME_PROPERTY = 165;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_NAME_PROPERTY__TARGET = FORK_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_NAME_PROPERTY__VALUE = FORK_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_NAME_PROPERTY__OPERATOR = FORK_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_NAME_PROPERTY_FEATURE_COUNT = FORK_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeActivityPropertyImpl <em>Fork Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getForkNodeActivityProperty()
	 * @generated
	 */
	int FORK_NODE_ACTIVITY_PROPERTY = 166;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVITY_PROPERTY__TARGET = FORK_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVITY_PROPERTY__PROPERTY = FORK_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fork Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = FORK_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeRunningPropertyImpl <em>Fork Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getForkNodeRunningProperty()
	 * @generated
	 */
	int FORK_NODE_RUNNING_PROPERTY = 167;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_RUNNING_PROPERTY__TARGET = FORK_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_RUNNING_PROPERTY__VALUE = FORK_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_RUNNING_PROPERTY__OPERATOR = FORK_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_RUNNING_PROPERTY_FEATURE_COUNT = FORK_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenForkNodeContainerPropertyImpl <em>Control Token Fork Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenForkNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenForkNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_FORK_NODE_CONTAINER_PROPERTY = 168;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FORK_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FORK_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Fork Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FORK_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeHeldTokensPropertyImpl <em>Fork Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getForkNodeHeldTokensProperty()
	 * @generated
	 */
	int FORK_NODE_HELD_TOKENS_PROPERTY = 169;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_HELD_TOKENS_PROPERTY__TARGET = FORK_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_HELD_TOKENS_PROPERTY__PROPERTY = FORK_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = FORK_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = FORK_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeIncomingPropertyImpl <em>Fork Node Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getForkNodeIncomingProperty()
	 * @generated
	 */
	int FORK_NODE_INCOMING_PROPERTY = 170;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_INCOMING_PROPERTY__TARGET = FORK_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_INCOMING_PROPERTY__PROPERTY = FORK_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fork Node Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_INCOMING_PROPERTY_FEATURE_COUNT = FORK_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeOutgoingPropertyImpl <em>Fork Node Outgoing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ForkNodeOutgoingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getForkNodeOutgoingProperty()
	 * @generated
	 */
	int FORK_NODE_OUTGOING_PROPERTY = 171;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OUTGOING_PROPERTY__TARGET = FORK_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OUTGOING_PROPERTY__PROPERTY = FORK_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OUTGOING_PROPERTY__QUANTIFIER = FORK_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Node Outgoing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OUTGOING_PROPERTY_FEATURE_COUNT = FORK_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodePropertyImpl <em>Join Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getJoinNodeProperty()
	 * @generated
	 */
	int JOIN_NODE_PROPERTY = 172;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Join Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryJoinNodePropertyImpl <em>Unary Join Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryJoinNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryJoinNodeProperty()
	 * @generated
	 */
	int UNARY_JOIN_NODE_PROPERTY = 173;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_JOIN_NODE_PROPERTY__TARGET = JOIN_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_JOIN_NODE_PROPERTY__OPERATOR = JOIN_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_JOIN_NODE_PROPERTY__PROPERTY = JOIN_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Join Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_JOIN_NODE_PROPERTY_FEATURE_COUNT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryJoinNodePropertyImpl <em>Binary Join Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryJoinNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryJoinNodeProperty()
	 * @generated
	 */
	int BINARY_JOIN_NODE_PROPERTY = 174;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_JOIN_NODE_PROPERTY__TARGET = JOIN_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_JOIN_NODE_PROPERTY__OPERATOR = JOIN_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_JOIN_NODE_PROPERTY__LEFT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_JOIN_NODE_PROPERTY__RIGHT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Join Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_JOIN_NODE_PROPERTY_FEATURE_COUNT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeNamePropertyImpl <em>Join Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getJoinNodeNameProperty()
	 * @generated
	 */
	int JOIN_NODE_NAME_PROPERTY = 175;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_NAME_PROPERTY__TARGET = JOIN_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_NAME_PROPERTY__VALUE = JOIN_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_NAME_PROPERTY__OPERATOR = JOIN_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_NAME_PROPERTY_FEATURE_COUNT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeActivityPropertyImpl <em>Join Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getJoinNodeActivityProperty()
	 * @generated
	 */
	int JOIN_NODE_ACTIVITY_PROPERTY = 176;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVITY_PROPERTY__TARGET = JOIN_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVITY_PROPERTY__PROPERTY = JOIN_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeRunningPropertyImpl <em>Join Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getJoinNodeRunningProperty()
	 * @generated
	 */
	int JOIN_NODE_RUNNING_PROPERTY = 177;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_RUNNING_PROPERTY__TARGET = JOIN_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_RUNNING_PROPERTY__VALUE = JOIN_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_RUNNING_PROPERTY__OPERATOR = JOIN_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_RUNNING_PROPERTY_FEATURE_COUNT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenJoinNodeContainerPropertyImpl <em>Control Token Join Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenJoinNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenJoinNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_JOIN_NODE_CONTAINER_PROPERTY = 178;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_JOIN_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_JOIN_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Join Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_JOIN_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeHeldTokensPropertyImpl <em>Join Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getJoinNodeHeldTokensProperty()
	 * @generated
	 */
	int JOIN_NODE_HELD_TOKENS_PROPERTY = 179;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_HELD_TOKENS_PROPERTY__TARGET = JOIN_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_HELD_TOKENS_PROPERTY__PROPERTY = JOIN_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = JOIN_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeIncomingPropertyImpl <em>Join Node Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getJoinNodeIncomingProperty()
	 * @generated
	 */
	int JOIN_NODE_INCOMING_PROPERTY = 180;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_INCOMING_PROPERTY__TARGET = JOIN_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_INCOMING_PROPERTY__PROPERTY = JOIN_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_INCOMING_PROPERTY__QUANTIFIER = JOIN_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_INCOMING_PROPERTY_FEATURE_COUNT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeOutgoingPropertyImpl <em>Join Node Outgoing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.JoinNodeOutgoingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getJoinNodeOutgoingProperty()
	 * @generated
	 */
	int JOIN_NODE_OUTGOING_PROPERTY = 181;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_OUTGOING_PROPERTY__TARGET = JOIN_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_OUTGOING_PROPERTY__PROPERTY = JOIN_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join Node Outgoing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_OUTGOING_PROPERTY_FEATURE_COUNT = JOIN_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodePropertyImpl <em>Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFinalNodeProperty()
	 * @generated
	 */
	int FINAL_NODE_PROPERTY = 182;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_PROPERTY__TARGET = CONTROL_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_PROPERTY_FEATURE_COUNT = CONTROL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryFinalNodePropertyImpl <em>Unary Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryFinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryFinalNodeProperty()
	 * @generated
	 */
	int UNARY_FINAL_NODE_PROPERTY = 183;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FINAL_NODE_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FINAL_NODE_PROPERTY__OPERATOR = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FINAL_NODE_PROPERTY__PROPERTY = FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FINAL_NODE_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryFinalNodePropertyImpl <em>Binary Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryFinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryFinalNodeProperty()
	 * @generated
	 */
	int BINARY_FINAL_NODE_PROPERTY = 184;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FINAL_NODE_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FINAL_NODE_PROPERTY__OPERATOR = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FINAL_NODE_PROPERTY__LEFT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FINAL_NODE_PROPERTY__RIGHT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FINAL_NODE_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeNamePropertyImpl <em>Final Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFinalNodeNameProperty()
	 * @generated
	 */
	int FINAL_NODE_NAME_PROPERTY = 185;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_NAME_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_NAME_PROPERTY__VALUE = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_NAME_PROPERTY__OPERATOR = FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_NAME_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeActivityPropertyImpl <em>Final Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFinalNodeActivityProperty()
	 * @generated
	 */
	int FINAL_NODE_ACTIVITY_PROPERTY = 186;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ACTIVITY_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ACTIVITY_PROPERTY__PROPERTY = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeRunningPropertyImpl <em>Final Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFinalNodeRunningProperty()
	 * @generated
	 */
	int FINAL_NODE_RUNNING_PROPERTY = 187;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_RUNNING_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_RUNNING_PROPERTY__VALUE = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_RUNNING_PROPERTY__OPERATOR = FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_RUNNING_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenFinalNodeContainerPropertyImpl <em>Control Token Final Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenFinalNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenFinalNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_FINAL_NODE_CONTAINER_PROPERTY = 188;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FINAL_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FINAL_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Final Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FINAL_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeHeldTokensPropertyImpl <em>Final Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFinalNodeHeldTokensProperty()
	 * @generated
	 */
	int FINAL_NODE_HELD_TOKENS_PROPERTY = 189;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_HELD_TOKENS_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeIncomingPropertyImpl <em>Final Node Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FinalNodeIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFinalNodeIncomingProperty()
	 * @generated
	 */
	int FINAL_NODE_INCOMING_PROPERTY = 190;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_INCOMING_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_INCOMING_PROPERTY__PROPERTY = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final Node Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_INCOMING_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodePropertyImpl <em>Activity Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityFinalNodeProperty()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_PROPERTY = 191;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Activity Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActivityFinalNodePropertyImpl <em>Unary Activity Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryActivityFinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryActivityFinalNodeProperty()
	 * @generated
	 */
	int UNARY_ACTIVITY_FINAL_NODE_PROPERTY = 192;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_FINAL_NODE_PROPERTY__TARGET = ACTIVITY_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_FINAL_NODE_PROPERTY__OPERATOR = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_FINAL_NODE_PROPERTY__PROPERTY = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Activity Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActivityFinalNodePropertyImpl <em>Binary Activity Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryActivityFinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryActivityFinalNodeProperty()
	 * @generated
	 */
	int BINARY_ACTIVITY_FINAL_NODE_PROPERTY = 193;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_FINAL_NODE_PROPERTY__TARGET = ACTIVITY_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_FINAL_NODE_PROPERTY__OPERATOR = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_FINAL_NODE_PROPERTY__LEFT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_FINAL_NODE_PROPERTY__RIGHT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Activity Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeNamePropertyImpl <em>Activity Final Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityFinalNodeNameProperty()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_NAME_PROPERTY = 194;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_NAME_PROPERTY__TARGET = ACTIVITY_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_NAME_PROPERTY__VALUE = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_NAME_PROPERTY__OPERATOR = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Final Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_NAME_PROPERTY_FEATURE_COUNT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeActivityPropertyImpl <em>Activity Final Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityFinalNodeActivityProperty()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_ACTIVITY_PROPERTY = 195;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVITY_PROPERTY__TARGET = ACTIVITY_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVITY_PROPERTY__PROPERTY = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Final Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeRunningPropertyImpl <em>Activity Final Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityFinalNodeRunningProperty()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_RUNNING_PROPERTY = 196;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_RUNNING_PROPERTY__TARGET = ACTIVITY_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_RUNNING_PROPERTY__VALUE = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_RUNNING_PROPERTY__OPERATOR = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Final Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_RUNNING_PROPERTY_FEATURE_COUNT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenActivityFinalNodeContainerPropertyImpl <em>Control Token Activity Final Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenActivityFinalNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenActivityFinalNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_ACTIVITY_FINAL_NODE_CONTAINER_PROPERTY = 197;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_FINAL_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_FINAL_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Activity Final Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_ACTIVITY_FINAL_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeHeldTokensPropertyImpl <em>Activity Final Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityFinalNodeHeldTokensProperty()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_HELD_TOKENS_PROPERTY = 198;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_HELD_TOKENS_PROPERTY__TARGET = ACTIVITY_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Final Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeIncomingPropertyImpl <em>Activity Final Node Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ActivityFinalNodeIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getActivityFinalNodeIncomingProperty()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_INCOMING_PROPERTY = 199;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_INCOMING_PROPERTY__TARGET = ACTIVITY_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_INCOMING_PROPERTY__PROPERTY = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Final Node Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_INCOMING_PROPERTY_FEATURE_COUNT = ACTIVITY_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodePropertyImpl <em>Flow Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFlowFinalNodeProperty()
	 * @generated
	 */
	int FLOW_FINAL_NODE_PROPERTY = 200;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_PROPERTY__TARGET = FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Flow Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT = FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryFlowFinalNodePropertyImpl <em>Unary Flow Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryFlowFinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryFlowFinalNodeProperty()
	 * @generated
	 */
	int UNARY_FLOW_FINAL_NODE_PROPERTY = 201;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOW_FINAL_NODE_PROPERTY__TARGET = FLOW_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOW_FINAL_NODE_PROPERTY__OPERATOR = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOW_FINAL_NODE_PROPERTY__PROPERTY = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Flow Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryFlowFinalNodePropertyImpl <em>Binary Flow Final Node Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryFlowFinalNodePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryFlowFinalNodeProperty()
	 * @generated
	 */
	int BINARY_FLOW_FINAL_NODE_PROPERTY = 202;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOW_FINAL_NODE_PROPERTY__TARGET = FLOW_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOW_FINAL_NODE_PROPERTY__OPERATOR = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOW_FINAL_NODE_PROPERTY__LEFT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOW_FINAL_NODE_PROPERTY__RIGHT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Flow Final Node Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeNamePropertyImpl <em>Flow Final Node Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFlowFinalNodeNameProperty()
	 * @generated
	 */
	int FLOW_FINAL_NODE_NAME_PROPERTY = 203;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_NAME_PROPERTY__TARGET = FLOW_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_NAME_PROPERTY__VALUE = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_NAME_PROPERTY__OPERATOR = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Final Node Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_NAME_PROPERTY_FEATURE_COUNT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeActivityPropertyImpl <em>Flow Final Node Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeActivityPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFlowFinalNodeActivityProperty()
	 * @generated
	 */
	int FLOW_FINAL_NODE_ACTIVITY_PROPERTY = 204;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_ACTIVITY_PROPERTY__TARGET = FLOW_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_ACTIVITY_PROPERTY__PROPERTY = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Final Node Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_ACTIVITY_PROPERTY_FEATURE_COUNT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeRunningPropertyImpl <em>Flow Final Node Running Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeRunningPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFlowFinalNodeRunningProperty()
	 * @generated
	 */
	int FLOW_FINAL_NODE_RUNNING_PROPERTY = 205;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_RUNNING_PROPERTY__TARGET = FLOW_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_RUNNING_PROPERTY__VALUE = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_RUNNING_PROPERTY__OPERATOR = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Final Node Running Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_RUNNING_PROPERTY_FEATURE_COUNT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenFlowFinalNodeContainerPropertyImpl <em>Control Token Flow Final Node Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ControlTokenFlowFinalNodeContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getControlTokenFlowFinalNodeContainerProperty()
	 * @generated
	 */
	int CONTROL_TOKEN_FLOW_FINAL_NODE_CONTAINER_PROPERTY = 206;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FLOW_FINAL_NODE_CONTAINER_PROPERTY__TARGET = CONTROL_TOKEN_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FLOW_FINAL_NODE_CONTAINER_PROPERTY__PROPERTY = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Token Flow Final Node Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FLOW_FINAL_NODE_CONTAINER_PROPERTY_FEATURE_COUNT = CONTROL_TOKEN_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeHeldTokensPropertyImpl <em>Flow Final Node Held Tokens Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeHeldTokensPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFlowFinalNodeHeldTokensProperty()
	 * @generated
	 */
	int FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY = 207;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__TARGET = FLOW_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__PROPERTY = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY__QUANTIFIER = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Final Node Held Tokens Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_HELD_TOKENS_PROPERTY_FEATURE_COUNT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeIncomingPropertyImpl <em>Flow Final Node Incoming Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.FlowFinalNodeIncomingPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getFlowFinalNodeIncomingProperty()
	 * @generated
	 */
	int FLOW_FINAL_NODE_INCOMING_PROPERTY = 208;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_INCOMING_PROPERTY__TARGET = FLOW_FINAL_NODE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_INCOMING_PROPERTY__PROPERTY = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Final Node Incoming Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_INCOMING_PROPERTY_FEATURE_COUNT = FLOW_FINAL_NODE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ValuePropertyImpl <em>Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.ValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getValueProperty()
	 * @generated
	 */
	int VALUE_PROPERTY = 209;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY__TARGET = EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY_FEATURE_COUNT = EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryValuePropertyImpl <em>Unary Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryValueProperty()
	 * @generated
	 */
	int UNARY_VALUE_PROPERTY = 210;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VALUE_PROPERTY__TARGET = VALUE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VALUE_PROPERTY__OPERATOR = VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VALUE_PROPERTY__PROPERTY = VALUE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_VALUE_PROPERTY_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryValuePropertyImpl <em>Binary Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryValueProperty()
	 * @generated
	 */
	int BINARY_VALUE_PROPERTY = 211;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE_PROPERTY__TARGET = VALUE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE_PROPERTY__OPERATOR = VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE_PROPERTY__LEFT = VALUE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE_PROPERTY__RIGHT = VALUE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_VALUE_PROPERTY_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerExpressionPropertyImpl <em>Integer Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerExpressionProperty()
	 * @generated
	 */
	int INTEGER_EXPRESSION_PROPERTY = 212;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_PROPERTY__TARGET = EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Integer Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT = EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerExpressionPropertyImpl <em>Unary Integer Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryIntegerExpressionProperty()
	 * @generated
	 */
	int UNARY_INTEGER_EXPRESSION_PROPERTY = 213;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION_PROPERTY__TARGET = INTEGER_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION_PROPERTY__OPERATOR = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION_PROPERTY__PROPERTY = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Integer Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerExpressionPropertyImpl <em>Binary Integer Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryIntegerExpressionProperty()
	 * @generated
	 */
	int BINARY_INTEGER_EXPRESSION_PROPERTY = 214;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION_PROPERTY__TARGET = INTEGER_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION_PROPERTY__OPERATOR = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION_PROPERTY__LEFT = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION_PROPERTY__RIGHT = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Integer Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariablePropertyImpl <em>Integer Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerVariableProperty()
	 * @generated
	 */
	int INTEGER_VARIABLE_PROPERTY = 215;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_PROPERTY__TARGET = VARIABLE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Integer Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT = VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerVariablePropertyImpl <em>Unary Integer Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerVariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryIntegerVariableProperty()
	 * @generated
	 */
	int UNARY_INTEGER_VARIABLE_PROPERTY = 216;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VARIABLE_PROPERTY__TARGET = INTEGER_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VARIABLE_PROPERTY__OPERATOR = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VARIABLE_PROPERTY__PROPERTY = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Integer Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerVariablePropertyImpl <em>Binary Integer Variable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerVariablePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryIntegerVariableProperty()
	 * @generated
	 */
	int BINARY_INTEGER_VARIABLE_PROPERTY = 217;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_PROPERTY__TARGET = INTEGER_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_PROPERTY__OPERATOR = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_PROPERTY__LEFT = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_PROPERTY__RIGHT = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Integer Variable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableNamePropertyImpl <em>Integer Variable Name Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableNamePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerVariableNameProperty()
	 * @generated
	 */
	int INTEGER_VARIABLE_NAME_PROPERTY = 218;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_NAME_PROPERTY__TARGET = INTEGER_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_NAME_PROPERTY__VALUE = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_NAME_PROPERTY__OPERATOR = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Variable Name Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_NAME_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableInitialValuePropertyImpl <em>Integer Variable Initial Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableInitialValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerVariableInitialValueProperty()
	 * @generated
	 */
	int INTEGER_VARIABLE_INITIAL_VALUE_PROPERTY = 219;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_INITIAL_VALUE_PROPERTY__TARGET = INTEGER_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_INITIAL_VALUE_PROPERTY__VALUE = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_INITIAL_VALUE_PROPERTY__OPERATOR = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Variable Initial Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_INITIAL_VALUE_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableCurrentValuePropertyImpl <em>Integer Variable Current Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableCurrentValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerVariableCurrentValueProperty()
	 * @generated
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_PROPERTY = 220;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_PROPERTY__TARGET = INTEGER_VARIABLE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_PROPERTY__VALUE = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_PROPERTY__OPERATOR = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Variable Current Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanValuePropertyImpl <em>Boolean Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanValueProperty()
	 * @generated
	 */
	int BOOLEAN_VALUE_PROPERTY = 221;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_PROPERTY__TARGET = VALUE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Boolean Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanValuePropertyImpl <em>Unary Boolean Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryBooleanValueProperty()
	 * @generated
	 */
	int UNARY_BOOLEAN_VALUE_PROPERTY = 222;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VALUE_PROPERTY__TARGET = BOOLEAN_VALUE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VALUE_PROPERTY__OPERATOR = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VALUE_PROPERTY__PROPERTY = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Boolean Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanValuePropertyImpl <em>Binary Boolean Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryBooleanValueProperty()
	 * @generated
	 */
	int BINARY_BOOLEAN_VALUE_PROPERTY = 223;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VALUE_PROPERTY__TARGET = BOOLEAN_VALUE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VALUE_PROPERTY__OPERATOR = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VALUE_PROPERTY__LEFT = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VALUE_PROPERTY__RIGHT = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Boolean Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanValueValuePropertyImpl <em>Boolean Value Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanValueValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanValueValueProperty()
	 * @generated
	 */
	int BOOLEAN_VALUE_VALUE_PROPERTY = 224;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_PROPERTY__TARGET = BOOLEAN_VALUE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_PROPERTY__VALUE = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_PROPERTY__OPERATOR = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Value Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_PROPERTY_FEATURE_COUNT = BOOLEAN_VALUE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerValuePropertyImpl <em>Integer Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerValueProperty()
	 * @generated
	 */
	int INTEGER_VALUE_PROPERTY = 225;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_PROPERTY__TARGET = VALUE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Integer Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_PROPERTY_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerValuePropertyImpl <em>Unary Integer Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryIntegerValueProperty()
	 * @generated
	 */
	int UNARY_INTEGER_VALUE_PROPERTY = 226;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VALUE_PROPERTY__TARGET = INTEGER_VALUE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VALUE_PROPERTY__OPERATOR = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VALUE_PROPERTY__PROPERTY = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Integer Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VALUE_PROPERTY_FEATURE_COUNT = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerValuePropertyImpl <em>Binary Integer Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryIntegerValueProperty()
	 * @generated
	 */
	int BINARY_INTEGER_VALUE_PROPERTY = 227;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VALUE_PROPERTY__TARGET = INTEGER_VALUE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VALUE_PROPERTY__OPERATOR = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VALUE_PROPERTY__LEFT = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VALUE_PROPERTY__RIGHT = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Integer Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VALUE_PROPERTY_FEATURE_COUNT = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerValueValuePropertyImpl <em>Integer Value Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerValueValuePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerValueValueProperty()
	 * @generated
	 */
	int INTEGER_VALUE_VALUE_PROPERTY = 228;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_PROPERTY__TARGET = INTEGER_VALUE_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_PROPERTY__VALUE = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_PROPERTY__OPERATOR = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Value Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_PROPERTY_FEATURE_COUNT = INTEGER_VALUE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionPropertyImpl <em>Integer Binary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerBinaryExpressionProperty()
	 * @generated
	 */
	int INTEGER_BINARY_EXPRESSION_PROPERTY = 229;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_PROPERTY__TARGET = EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Integer Binary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT = EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerBinaryExpressionPropertyImpl <em>Unary Integer Binary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerBinaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryIntegerBinaryExpressionProperty()
	 * @generated
	 */
	int UNARY_INTEGER_BINARY_EXPRESSION_PROPERTY = 230;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_BINARY_EXPRESSION_PROPERTY__TARGET = INTEGER_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_BINARY_EXPRESSION_PROPERTY__OPERATOR = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_BINARY_EXPRESSION_PROPERTY__PROPERTY = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Integer Binary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerBinaryExpressionPropertyImpl <em>Binary Integer Binary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerBinaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryIntegerBinaryExpressionProperty()
	 * @generated
	 */
	int BINARY_INTEGER_BINARY_EXPRESSION_PROPERTY = 231;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_BINARY_EXPRESSION_PROPERTY__TARGET = INTEGER_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_BINARY_EXPRESSION_PROPERTY__OPERATOR = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_BINARY_EXPRESSION_PROPERTY__LEFT = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_BINARY_EXPRESSION_PROPERTY__RIGHT = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Integer Binary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionOperand1PropertyImpl <em>Integer Binary Expression Operand1 Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionOperand1PropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerBinaryExpressionOperand1Property()
	 * @generated
	 */
	int INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY = 232;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__TARGET = INTEGER_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Binary Expression Operand1 Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_OPERAND1_PROPERTY_FEATURE_COUNT = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionOperand2PropertyImpl <em>Integer Binary Expression Operand2 Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionOperand2PropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerBinaryExpressionOperand2Property()
	 * @generated
	 */
	int INTEGER_BINARY_EXPRESSION_OPERAND2_PROPERTY = 233;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_OPERAND2_PROPERTY__TARGET = INTEGER_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_OPERAND2_PROPERTY__PROPERTY = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Binary Expression Operand2 Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_OPERAND2_PROPERTY_FEATURE_COUNT = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionOperatorPropertyImpl <em>Integer Binary Expression Operator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerBinaryExpressionOperatorPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerBinaryExpressionOperatorProperty()
	 * @generated
	 */
	int INTEGER_BINARY_EXPRESSION_OPERATOR_PROPERTY = 234;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_OPERATOR_PROPERTY__TARGET = INTEGER_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Integer Binary Expression Operator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BINARY_EXPRESSION_OPERATOR_PROPERTY_FEATURE_COUNT = INTEGER_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerComparisonExpressionPropertyImpl <em>Integer Comparison Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerComparisonExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerComparisonExpressionProperty()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_PROPERTY = 235;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_PROPERTY__TARGET = BOOLEAN_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerComparisonExpressionPropertyImpl <em>Unary Integer Comparison Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerComparisonExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryIntegerComparisonExpressionProperty()
	 * @generated
	 */
	int UNARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY = 236;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY__TARGET = INTEGER_COMPARISON_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY__OPERATOR = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY__PROPERTY = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Integer Comparison Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerComparisonExpressionPropertyImpl <em>Binary Integer Comparison Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerComparisonExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryIntegerComparisonExpressionProperty()
	 * @generated
	 */
	int BINARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY = 237;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY__TARGET = INTEGER_COMPARISON_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY__OPERATOR = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY__LEFT = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY__RIGHT = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Integer Comparison Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerComparisonExpressionOperatorPropertyImpl <em>Integer Comparison Expression Operator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerComparisonExpressionOperatorPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerComparisonExpressionOperatorProperty()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_PROPERTY = 238;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_PROPERTY__TARGET = INTEGER_COMPARISON_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression Operator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_PROPERTY_FEATURE_COUNT = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerComparisonExpressionOperand1PropertyImpl <em>Integer Comparison Expression Operand1 Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerComparisonExpressionOperand1PropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerComparisonExpressionOperand1Property()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERAND1_PROPERTY = 239;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERAND1_PROPERTY__TARGET = INTEGER_COMPARISON_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERAND1_PROPERTY__PROPERTY = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression Operand1 Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERAND1_PROPERTY_FEATURE_COUNT = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerComparisonExpressionOperand2PropertyImpl <em>Integer Comparison Expression Operand2 Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerComparisonExpressionOperand2PropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerComparisonExpressionOperand2Property()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERAND2_PROPERTY = 240;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERAND2_PROPERTY__TARGET = INTEGER_COMPARISON_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERAND2_PROPERTY__PROPERTY = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression Operand2 Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERAND2_PROPERTY_FEATURE_COUNT = INTEGER_COMPARISON_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanUnaryExpressionPropertyImpl <em>Boolean Unary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanUnaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanUnaryExpressionProperty()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION_PROPERTY = 241;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_PROPERTY__TARGET = BOOLEAN_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanUnaryExpressionPropertyImpl <em>Unary Boolean Unary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanUnaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryBooleanUnaryExpressionProperty()
	 * @generated
	 */
	int UNARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY = 242;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY__TARGET = BOOLEAN_UNARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY__OPERATOR = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY__PROPERTY = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Boolean Unary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanUnaryExpressionPropertyImpl <em>Binary Boolean Unary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanUnaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryBooleanUnaryExpressionProperty()
	 * @generated
	 */
	int BINARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY = 243;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY__TARGET = BOOLEAN_UNARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY__OPERATOR = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY__LEFT = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY__RIGHT = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Boolean Unary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanUnaryExpressionOperandPropertyImpl <em>Boolean Unary Expression Operand Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanUnaryExpressionOperandPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanUnaryExpressionOperandProperty()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_PROPERTY = 244;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_PROPERTY__TARGET = BOOLEAN_UNARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_PROPERTY__PROPERTY = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression Operand Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_PROPERTY_FEATURE_COUNT = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanUnaryExpressionOperatorPropertyImpl <em>Boolean Unary Expression Operator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanUnaryExpressionOperatorPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanUnaryExpressionOperatorProperty()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_PROPERTY = 245;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_PROPERTY__TARGET = BOOLEAN_UNARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression Operator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_PROPERTY_FEATURE_COUNT = BOOLEAN_UNARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanBinaryExpressionPropertyImpl <em>Boolean Binary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanBinaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanBinaryExpressionProperty()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_PROPERTY = 246;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_PROPERTY__TARGET = BOOLEAN_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanBinaryExpressionPropertyImpl <em>Unary Boolean Binary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanBinaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryBooleanBinaryExpressionProperty()
	 * @generated
	 */
	int UNARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY = 247;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY__TARGET = BOOLEAN_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY__OPERATOR = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY__PROPERTY = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Boolean Binary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanBinaryExpressionPropertyImpl <em>Binary Boolean Binary Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanBinaryExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryBooleanBinaryExpressionProperty()
	 * @generated
	 */
	int BINARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY = 248;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY__TARGET = BOOLEAN_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY__OPERATOR = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY__LEFT = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY__RIGHT = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Boolean Binary Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanBinaryExpressionOperand1PropertyImpl <em>Boolean Binary Expression Operand1 Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanBinaryExpressionOperand1PropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanBinaryExpressionOperand1Property()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_PROPERTY = 249;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_PROPERTY__TARGET = BOOLEAN_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_PROPERTY__PROPERTY = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression Operand1 Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_PROPERTY_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanBinaryExpressionOperand2PropertyImpl <em>Boolean Binary Expression Operand2 Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanBinaryExpressionOperand2PropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanBinaryExpressionOperand2Property()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_PROPERTY = 250;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_PROPERTY__TARGET = BOOLEAN_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_PROPERTY__PROPERTY = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression Operand2 Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_PROPERTY_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanBinaryExpressionOperatorPropertyImpl <em>Boolean Binary Expression Operator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanBinaryExpressionOperatorPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanBinaryExpressionOperatorProperty()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_PROPERTY = 251;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_PROPERTY__TARGET = BOOLEAN_BINARY_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression Operator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_PROPERTY_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableAssignmentPropertyImpl <em>Boolean Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanVariableAssignmentProperty()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY = 252;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__TARGET = VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Boolean Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanVariableAssignmentPropertyImpl <em>Unary Boolean Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryBooleanVariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryBooleanVariableAssignmentProperty()
	 * @generated
	 */
	int UNARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY = 253;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__TARGET = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__OPERATOR = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__PROPERTY = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Boolean Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanVariableAssignmentPropertyImpl <em>Binary Boolean Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryBooleanVariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryBooleanVariableAssignmentProperty()
	 * @generated
	 */
	int BINARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY = 254;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__TARGET = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__OPERATOR = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__LEFT = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__RIGHT = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Boolean Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableAssignmentAssigneePropertyImpl <em>Boolean Variable Assignment Assignee Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableAssignmentAssigneePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanVariableAssignmentAssigneeProperty()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY = 255;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY__TARGET = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY__PROPERTY = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Assignment Assignee Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanExpressionBooleanVariableAssignmentContainerPropertyImpl <em>Boolean Expression Boolean Variable Assignment Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanExpressionBooleanVariableAssignmentContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanExpressionBooleanVariableAssignmentContainerProperty()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_BOOLEAN_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY = 256;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_BOOLEAN_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY__TARGET = BOOLEAN_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_BOOLEAN_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY__PROPERTY = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression Boolean Variable Assignment Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_BOOLEAN_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY_FEATURE_COUNT = BOOLEAN_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableAssignmentExpressionPropertyImpl <em>Boolean Variable Assignment Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BooleanVariableAssignmentExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBooleanVariableAssignmentExpressionProperty()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY = 257;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY__TARGET = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY__PROPERTY = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Assignment Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY_FEATURE_COUNT = BOOLEAN_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableAssignmentPropertyImpl <em>Integer Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerVariableAssignmentProperty()
	 * @generated
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_PROPERTY = 258;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__TARGET = VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Integer Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerVariableAssignmentPropertyImpl <em>Unary Integer Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryIntegerVariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryIntegerVariableAssignmentProperty()
	 * @generated
	 */
	int UNARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY = 259;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__TARGET = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__OPERATOR = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__PROPERTY = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Integer Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerVariableAssignmentPropertyImpl <em>Binary Integer Variable Assignment Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryIntegerVariableAssignmentPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryIntegerVariableAssignmentProperty()
	 * @generated
	 */
	int BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY = 260;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__TARGET = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__OPERATOR = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__LEFT = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__RIGHT = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Integer Variable Assignment Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableAssignmentAssigneePropertyImpl <em>Integer Variable Assignment Assignee Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableAssignmentAssigneePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerVariableAssignmentAssigneeProperty()
	 * @generated
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY = 261;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY__TARGET = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY__PROPERTY = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Assignment Assignee Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_ASSIGNEE_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerExpressionIntegerVariableAssignmentContainerPropertyImpl <em>Integer Expression Integer Variable Assignment Container Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerExpressionIntegerVariableAssignmentContainerPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerExpressionIntegerVariableAssignmentContainerProperty()
	 * @generated
	 */
	int INTEGER_EXPRESSION_INTEGER_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY = 262;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_INTEGER_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY__TARGET = INTEGER_EXPRESSION_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_INTEGER_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY__PROPERTY = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Expression Integer Variable Assignment Container Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_INTEGER_VARIABLE_ASSIGNMENT_CONTAINER_PROPERTY_FEATURE_COUNT = INTEGER_EXPRESSION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableAssignmentExpressionPropertyImpl <em>Integer Variable Assignment Expression Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.IntegerVariableAssignmentExpressionPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getIntegerVariableAssignmentExpressionProperty()
	 * @generated
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY = 263;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY__TARGET = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY__PROPERTY = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Assignment Expression Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASSIGNMENT_EXPRESSION_PROPERTY_FEATURE_COUNT = INTEGER_VARIABLE_ASSIGNMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OfferPropertyImpl <em>Offer Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.OfferPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getOfferProperty()
	 * @generated
	 */
	int OFFER_PROPERTY = 264;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PROPERTY__TARGET = XACTIVITY_DIAGRAM_STATE_PROPERTY__TARGET;

	/**
	 * The number of structural features of the '<em>Offer Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_PROPERTY_FEATURE_COUNT = XACTIVITY_DIAGRAM_STATE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryOfferPropertyImpl <em>Unary Offer Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.UnaryOfferPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getUnaryOfferProperty()
	 * @generated
	 */
	int UNARY_OFFER_PROPERTY = 265;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OFFER_PROPERTY__TARGET = OFFER_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OFFER_PROPERTY__OPERATOR = OFFER_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OFFER_PROPERTY__PROPERTY = OFFER_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Offer Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OFFER_PROPERTY_FEATURE_COUNT = OFFER_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryOfferPropertyImpl <em>Binary Offer Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.BinaryOfferPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getBinaryOfferProperty()
	 * @generated
	 */
	int BINARY_OFFER_PROPERTY = 266;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OFFER_PROPERTY__TARGET = OFFER_PROPERTY__TARGET;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OFFER_PROPERTY__OPERATOR = OFFER_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OFFER_PROPERTY__LEFT = OFFER_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OFFER_PROPERTY__RIGHT = OFFER_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Offer Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OFFER_PROPERTY_FEATURE_COUNT = OFFER_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramNextPropertyImpl <em>XActivity Diagram Next Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramNextPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramNextProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_NEXT_PROPERTY = 267;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_NEXT_PROPERTY__FORMULA = PropertyPackage.NEXT_PROPERTY__FORMULA;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Next Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_NEXT_PROPERTY_FEATURE_COUNT = PropertyPackage.NEXT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramUntilPropertyImpl <em>XActivity Diagram Until Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramUntilPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramUntilProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_UNTIL_PROPERTY = 268;

	/**
	 * The feature id for the '<em><b>Left Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_UNTIL_PROPERTY__LEFT_FORMULA = PropertyPackage.UNTIL_PROPERTY__LEFT_FORMULA;

	/**
	 * The feature id for the '<em><b>Right Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_UNTIL_PROPERTY__RIGHT_FORMULA = PropertyPackage.UNTIL_PROPERTY__RIGHT_FORMULA;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Until Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_UNTIL_PROPERTY_FEATURE_COUNT = PropertyPackage.UNTIL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramReleasePropertyImpl <em>XActivity Diagram Release Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramReleasePropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramReleaseProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_RELEASE_PROPERTY = 269;

	/**
	 * The feature id for the '<em><b>Left Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_RELEASE_PROPERTY__LEFT_FORMULA = PropertyPackage.RELEASE_PROPERTY__LEFT_FORMULA;

	/**
	 * The feature id for the '<em><b>Right Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_RELEASE_PROPERTY__RIGHT_FORMULA = PropertyPackage.RELEASE_PROPERTY__RIGHT_FORMULA;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Release Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_RELEASE_PROPERTY_FEATURE_COUNT = PropertyPackage.RELEASE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramNegationTemporalPropertyImpl <em>XActivity Diagram Negation Temporal Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramNegationTemporalPropertyImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl.XActivityDiagramPropertyPackageImpl#getXActivityDiagramNegationTemporalProperty()
	 * @generated
	 */
	int XACTIVITY_DIAGRAM_NEGATION_TEMPORAL_PROPERTY = 270;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_NEGATION_TEMPORAL_PROPERTY__FORMULA = PropertyPackage.NEGATION_TEMPORAL_PROPERTY__FORMULA;

	/**
	 * The number of structural features of the '<em>XActivity Diagram Negation Temporal Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACTIVITY_DIAGRAM_NEGATION_TEMPORAL_PROPERTY_FEATURE_COUNT = PropertyPackage.NEGATION_TEMPORAL_PROPERTY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeExecuteProperty <em>Join Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeExecuteProperty
	 * @generated
	 */
	EClass getJoinNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeExecuteProperty <em>Final Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeExecuteProperty
	 * @generated
	 */
	EClass getFinalNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeExecuteProperty <em>Decision Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeExecuteProperty
	 * @generated
	 */
	EClass getDecisionNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeExecuteProperty <em>Activity Final Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeExecuteProperty
	 * @generated
	 */
	EClass getActivityFinalNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeTerminateProperty <em>Activity Node Terminate Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Terminate Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeTerminateProperty
	 * @generated
	 */
	EClass getActivityNodeTerminateProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionExecuteProperty <em>Opaque Action Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionExecuteProperty
	 * @generated
	 */
	EClass getOpaqueActionExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeAddTokenProperty <em>Activity Node Add Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Add Token Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeAddTokenProperty
	 * @generated
	 */
	EClass getActivityNodeAddTokenProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentExecuteProperty <em>Variable Assignment Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentExecuteProperty
	 * @generated
	 */
	EClass getVariableAssignmentExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeExecuteProperty <em>Merge Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeExecuteProperty
	 * @generated
	 */
	EClass getMergeNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableInitProperty <em>Variable Init Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Init Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableInitProperty
	 * @generated
	 */
	EClass getVariableInitProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityExecuteProperty <em>Activity Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityExecuteProperty
	 * @generated
	 */
	EClass getActivityExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeExecuteProperty <em>Fork Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeExecuteProperty
	 * @generated
	 */
	EClass getForkNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionExecuteProperty <em>Accept Event Action Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionExecuteProperty
	 * @generated
	 */
	EClass getAcceptEventActionExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeExecuteProperty <em>Flow Final Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeExecuteProperty
	 * @generated
	 */
	EClass getFlowFinalNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeExecuteProperty <em>Initial Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeExecuteProperty
	 * @generated
	 */
	EClass getInitialNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentExecuteProperty <em>Boolean Variable Assignment Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Assignment Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentExecuteProperty
	 * @generated
	 */
	EClass getBooleanVariableAssignmentExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeRemoveTokenProperty <em>Activity Node Remove Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Remove Token Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeRemoveTokenProperty
	 * @generated
	 */
	EClass getActivityNodeRemoveTokenProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExecuteProperty <em>Integer Variable Assignment Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Assignment Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExecuteProperty
	 * @generated
	 */
	EClass getIntegerVariableAssignmentExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionAcceptProperty <em>Accept Event Action Accept Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Accept Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionAcceptProperty
	 * @generated
	 */
	EClass getAcceptEventActionAcceptProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeExecuteProperty <em>Activity Node Execute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Execute Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeExecuteProperty
	 * @generated
	 */
	EClass getActivityNodeExecuteProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionWaitForEventProperty <em>Accept Event Action Wait For Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Wait For Event Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionWaitForEventProperty
	 * @generated
	 */
	EClass getAcceptEventActionWaitForEventProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramAbstractProperty <em>XActivity Diagram Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Abstract Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramAbstractProperty
	 * @generated
	 */
	EClass getXActivityDiagramAbstractProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramTemporalProperty <em>XActivity Diagram Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Temporal Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramTemporalProperty
	 * @generated
	 */
	EClass getXActivityDiagramTemporalProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty <em>XActivity Diagram Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramProperty
	 * @generated
	 */
	EClass getXActivityDiagramProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramStateProperty <em>XActivity Diagram State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram State Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramStateProperty
	 * @generated
	 */
	EClass getXActivityDiagramStateProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramStepProperty <em>XActivity Diagram Step Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Step Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramStepProperty
	 * @generated
	 */
	EClass getXActivityDiagramStepProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.NamedElementProperty <em>Named Element Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.NamedElementProperty
	 * @generated
	 */
	EClass getNamedElementProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryNamedElementProperty <em>Unary Named Element Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Named Element Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryNamedElementProperty
	 * @generated
	 */
	EClass getUnaryNamedElementProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryNamedElementProperty <em>Binary Named Element Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Named Element Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryNamedElementProperty
	 * @generated
	 */
	EClass getBinaryNamedElementProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.NamedElementNameProperty <em>Named Element Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.NamedElementNameProperty
	 * @generated
	 */
	EClass getNamedElementNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityProperty <em>Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityProperty
	 * @generated
	 */
	EClass getActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityProperty <em>Unary Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityProperty
	 * @generated
	 */
	EClass getUnaryActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityProperty <em>Binary Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityProperty
	 * @generated
	 */
	EClass getBinaryActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNameProperty <em>Activity Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNameProperty
	 * @generated
	 */
	EClass getActivityNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventActivityContainerProperty <em>Event Activity Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Activity Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventActivityContainerProperty
	 * @generated
	 */
	EClass getEventActivityContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventProperty <em>Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventProperty
	 * @generated
	 */
	EClass getEventProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryEventProperty <em>Unary Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Event Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryEventProperty
	 * @generated
	 */
	EClass getUnaryEventProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryEventProperty <em>Binary Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Event Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryEventProperty
	 * @generated
	 */
	EClass getBinaryEventProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventNameProperty <em>Event Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.EventNameProperty
	 * @generated
	 */
	EClass getEventNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEventsProperty <em>Activity Events Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Events Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEventsProperty
	 * @generated
	 */
	EClass getActivityEventsProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodesProperty <em>Activity Nodes Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Nodes Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodesProperty
	 * @generated
	 */
	EClass getActivityNodesProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeProperty <em>Activity Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeProperty
	 * @generated
	 */
	EClass getActivityNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityNodeProperty <em>Unary Activity Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Activity Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityNodeProperty
	 * @generated
	 */
	EClass getUnaryActivityNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityNodeProperty <em>Binary Activity Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Activity Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityNodeProperty
	 * @generated
	 */
	EClass getBinaryActivityNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeNameProperty <em>Activity Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeNameProperty
	 * @generated
	 */
	EClass getActivityNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeActivityProperty <em>Activity Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeActivityProperty
	 * @generated
	 */
	EClass getActivityNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeRunningProperty <em>Activity Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeRunningProperty
	 * @generated
	 */
	EClass getActivityNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityNodeContainerProperty <em>Control Token Activity Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Activity Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenActivityNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenProperty <em>Control Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenProperty
	 * @generated
	 */
	EClass getControlTokenProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlTokenProperty <em>Unary Control Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Control Token Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlTokenProperty
	 * @generated
	 */
	EClass getUnaryControlTokenProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlTokenProperty <em>Binary Control Token Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Control Token Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlTokenProperty
	 * @generated
	 */
	EClass getBinaryControlTokenProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeHeldTokensProperty <em>Activity Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityNodeHeldTokensProperty
	 * @generated
	 */
	EClass getActivityNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeActivityContainerProperty <em>Activity Edge Activity Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Activity Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeActivityContainerProperty
	 * @generated
	 */
	EClass getActivityEdgeActivityContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeProperty <em>Activity Edge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeProperty
	 * @generated
	 */
	EClass getActivityEdgeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityEdgeProperty <em>Unary Activity Edge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Activity Edge Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityEdgeProperty
	 * @generated
	 */
	EClass getUnaryActivityEdgeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityEdgeProperty <em>Binary Activity Edge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Activity Edge Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityEdgeProperty
	 * @generated
	 */
	EClass getBinaryActivityEdgeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeNameProperty <em>Activity Edge Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeNameProperty
	 * @generated
	 */
	EClass getActivityEdgeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeSourceProperty <em>Activity Edge Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Source Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeSourceProperty
	 * @generated
	 */
	EClass getActivityEdgeSourceProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeTargetProperty <em>Activity Edge Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Target Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeTargetProperty
	 * @generated
	 */
	EClass getActivityEdgeTargetProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityEdgeContainerProperty <em>Control Token Activity Edge Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Activity Edge Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityEdgeContainerProperty
	 * @generated
	 */
	EClass getControlTokenActivityEdgeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeOfferedTokensProperty <em>Activity Edge Offered Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Offered Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgeOfferedTokensProperty
	 * @generated
	 */
	EClass getActivityEdgeOfferedTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgesProperty <em>Activity Edges Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edges Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityEdgesProperty
	 * @generated
	 */
	EClass getActivityEdgesProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableActivityContainerProperty <em>Variable Activity Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Activity Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableActivityContainerProperty
	 * @generated
	 */
	EClass getVariableActivityContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableProperty <em>Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableProperty
	 * @generated
	 */
	EClass getVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ExpressionProperty <em>Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ExpressionProperty
	 * @generated
	 */
	EClass getExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryExpressionProperty <em>Unary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryExpressionProperty
	 * @generated
	 */
	EClass getUnaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryExpressionProperty <em>Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryExpressionProperty
	 * @generated
	 */
	EClass getBinaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryVariableProperty <em>Unary Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryVariableProperty
	 * @generated
	 */
	EClass getUnaryVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryVariableProperty <em>Binary Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryVariableProperty
	 * @generated
	 */
	EClass getBinaryVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableNameProperty <em>Variable Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableNameProperty
	 * @generated
	 */
	EClass getVariableNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityLocalsProperty <em>Activity Locals Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Locals Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityLocalsProperty
	 * @generated
	 */
	EClass getActivityLocalsProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowProperty <em>Control Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowProperty
	 * @generated
	 */
	EClass getControlFlowProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlFlowProperty <em>Unary Control Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Control Flow Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlFlowProperty
	 * @generated
	 */
	EClass getUnaryControlFlowProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlFlowProperty <em>Binary Control Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Control Flow Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlFlowProperty
	 * @generated
	 */
	EClass getBinaryControlFlowProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowNameProperty <em>Control Flow Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowNameProperty
	 * @generated
	 */
	EClass getControlFlowNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowSourceProperty <em>Control Flow Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Source Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowSourceProperty
	 * @generated
	 */
	EClass getControlFlowSourceProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowTargetProperty <em>Control Flow Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Target Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowTargetProperty
	 * @generated
	 */
	EClass getControlFlowTargetProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenControlFlowContainerProperty <em>Control Token Control Flow Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Control Flow Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenControlFlowContainerProperty
	 * @generated
	 */
	EClass getControlTokenControlFlowContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowOfferedTokensProperty <em>Control Flow Offered Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Offered Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowOfferedTokensProperty
	 * @generated
	 */
	EClass getControlFlowOfferedTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowGuardProperty <em>Control Flow Guard Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Guard Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlFlowGuardProperty
	 * @generated
	 */
	EClass getControlFlowGuardProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableProperty <em>Boolean Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableProperty
	 * @generated
	 */
	EClass getBooleanVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanExpressionProperty <em>Boolean Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanExpressionProperty
	 * @generated
	 */
	EClass getBooleanExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanExpressionProperty <em>Unary Boolean Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Boolean Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanExpressionProperty
	 * @generated
	 */
	EClass getUnaryBooleanExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanExpressionProperty <em>Binary Boolean Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanExpressionProperty
	 * @generated
	 */
	EClass getBinaryBooleanExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanVariableProperty <em>Unary Boolean Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Boolean Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanVariableProperty
	 * @generated
	 */
	EClass getUnaryBooleanVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanVariableProperty <em>Binary Boolean Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanVariableProperty
	 * @generated
	 */
	EClass getBinaryBooleanVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableNameProperty <em>Boolean Variable Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableNameProperty
	 * @generated
	 */
	EClass getBooleanVariableNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableInitialValueProperty <em>Boolean Variable Initial Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Initial Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableInitialValueProperty
	 * @generated
	 */
	EClass getBooleanVariableInitialValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableCurrentValueProperty <em>Boolean Variable Current Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Current Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableCurrentValueProperty
	 * @generated
	 */
	EClass getBooleanVariableCurrentValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionProperty <em>Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionProperty
	 * @generated
	 */
	EClass getActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActionProperty <em>Unary Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActionProperty
	 * @generated
	 */
	EClass getUnaryActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActionProperty <em>Binary Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActionProperty
	 * @generated
	 */
	EClass getBinaryActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionNameProperty <em>Action Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionNameProperty
	 * @generated
	 */
	EClass getActionNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionActivityProperty <em>Action Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionActivityProperty
	 * @generated
	 */
	EClass getActionActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionRunningProperty <em>Action Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionRunningProperty
	 * @generated
	 */
	EClass getActionRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActionContainerProperty <em>Control Token Action Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Action Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActionContainerProperty
	 * @generated
	 */
	EClass getControlTokenActionContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionHeldTokensProperty <em>Action Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionHeldTokensProperty
	 * @generated
	 */
	EClass getActionHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionIncomingProperty <em>Action Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionIncomingProperty
	 * @generated
	 */
	EClass getActionIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionOutgoingProperty <em>Action Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Outgoing Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActionOutgoingProperty
	 * @generated
	 */
	EClass getActionOutgoingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionProperty <em>Opaque Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionProperty
	 * @generated
	 */
	EClass getOpaqueActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryOpaqueActionProperty <em>Unary Opaque Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Opaque Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryOpaqueActionProperty
	 * @generated
	 */
	EClass getUnaryOpaqueActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryOpaqueActionProperty <em>Binary Opaque Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Opaque Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryOpaqueActionProperty
	 * @generated
	 */
	EClass getBinaryOpaqueActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionNameProperty <em>Opaque Action Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionNameProperty
	 * @generated
	 */
	EClass getOpaqueActionNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionActivityProperty <em>Opaque Action Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionActivityProperty
	 * @generated
	 */
	EClass getOpaqueActionActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionRunningProperty <em>Opaque Action Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionRunningProperty
	 * @generated
	 */
	EClass getOpaqueActionRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenOpaqueActionContainerProperty <em>Control Token Opaque Action Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Opaque Action Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenOpaqueActionContainerProperty
	 * @generated
	 */
	EClass getControlTokenOpaqueActionContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionHeldTokensProperty <em>Opaque Action Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionHeldTokensProperty
	 * @generated
	 */
	EClass getOpaqueActionHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionIncomingProperty <em>Opaque Action Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionIncomingProperty
	 * @generated
	 */
	EClass getOpaqueActionIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionOutgoingProperty <em>Opaque Action Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Outgoing Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionOutgoingProperty
	 * @generated
	 */
	EClass getOpaqueActionOutgoingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentOpaqueActionContainerProperty <em>Variable Assignment Opaque Action Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment Opaque Action Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentOpaqueActionContainerProperty
	 * @generated
	 */
	EClass getVariableAssignmentOpaqueActionContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentProperty <em>Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.VariableAssignmentProperty
	 * @generated
	 */
	EClass getVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryVariableAssignmentProperty <em>Unary Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryVariableAssignmentProperty
	 * @generated
	 */
	EClass getUnaryVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryVariableAssignmentProperty <em>Binary Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryVariableAssignmentProperty
	 * @generated
	 */
	EClass getBinaryVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionAssignmentsProperty <em>Opaque Action Assignments Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Assignments Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OpaqueActionAssignmentsProperty
	 * @generated
	 */
	EClass getOpaqueActionAssignmentsProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionProperty <em>Accept Event Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionProperty
	 * @generated
	 */
	EClass getAcceptEventActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryAcceptEventActionProperty <em>Unary Accept Event Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Accept Event Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryAcceptEventActionProperty
	 * @generated
	 */
	EClass getUnaryAcceptEventActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryAcceptEventActionProperty <em>Binary Accept Event Action Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Accept Event Action Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryAcceptEventActionProperty
	 * @generated
	 */
	EClass getBinaryAcceptEventActionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionNameProperty <em>Accept Event Action Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionNameProperty
	 * @generated
	 */
	EClass getAcceptEventActionNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionActivityProperty <em>Accept Event Action Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionActivityProperty
	 * @generated
	 */
	EClass getAcceptEventActionActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionRunningProperty <em>Accept Event Action Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionRunningProperty
	 * @generated
	 */
	EClass getAcceptEventActionRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenAcceptEventActionContainerProperty <em>Control Token Accept Event Action Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Accept Event Action Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenAcceptEventActionContainerProperty
	 * @generated
	 */
	EClass getControlTokenAcceptEventActionContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionHeldTokensProperty <em>Accept Event Action Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionHeldTokensProperty
	 * @generated
	 */
	EClass getAcceptEventActionHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionEventTypeProperty <em>Accept Event Action Event Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Event Type Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionEventTypeProperty
	 * @generated
	 */
	EClass getAcceptEventActionEventTypeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionIncomingProperty <em>Accept Event Action Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionIncomingProperty
	 * @generated
	 */
	EClass getAcceptEventActionIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionOutgoingProperty <em>Accept Event Action Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action Outgoing Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.AcceptEventActionOutgoingProperty
	 * @generated
	 */
	EClass getAcceptEventActionOutgoingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeProperty <em>Control Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeProperty
	 * @generated
	 */
	EClass getControlNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlNodeProperty <em>Unary Control Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Control Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryControlNodeProperty
	 * @generated
	 */
	EClass getUnaryControlNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlNodeProperty <em>Binary Control Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Control Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryControlNodeProperty
	 * @generated
	 */
	EClass getBinaryControlNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeNameProperty <em>Control Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeNameProperty
	 * @generated
	 */
	EClass getControlNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeActivityProperty <em>Control Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeActivityProperty
	 * @generated
	 */
	EClass getControlNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeRunningProperty <em>Control Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeRunningProperty
	 * @generated
	 */
	EClass getControlNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenControlNodeContainerProperty <em>Control Token Control Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Control Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenControlNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenControlNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeHeldTokensProperty <em>Control Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlNodeHeldTokensProperty
	 * @generated
	 */
	EClass getControlNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeProperty <em>Initial Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeProperty
	 * @generated
	 */
	EClass getInitialNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryInitialNodeProperty <em>Unary Initial Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Initial Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryInitialNodeProperty
	 * @generated
	 */
	EClass getUnaryInitialNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryInitialNodeProperty <em>Binary Initial Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Initial Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryInitialNodeProperty
	 * @generated
	 */
	EClass getBinaryInitialNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeNameProperty <em>Initial Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeNameProperty
	 * @generated
	 */
	EClass getInitialNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeActivityProperty <em>Initial Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeActivityProperty
	 * @generated
	 */
	EClass getInitialNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeRunningProperty <em>Initial Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeRunningProperty
	 * @generated
	 */
	EClass getInitialNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenInitialNodeContainerProperty <em>Control Token Initial Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Initial Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenInitialNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenInitialNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeHeldTokensProperty <em>Initial Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeHeldTokensProperty
	 * @generated
	 */
	EClass getInitialNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeOutgoingProperty <em>Initial Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Outgoing Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.InitialNodeOutgoingProperty
	 * @generated
	 */
	EClass getInitialNodeOutgoingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeProperty <em>Decision Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeProperty
	 * @generated
	 */
	EClass getDecisionNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryDecisionNodeProperty <em>Unary Decision Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Decision Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryDecisionNodeProperty
	 * @generated
	 */
	EClass getUnaryDecisionNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryDecisionNodeProperty <em>Binary Decision Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Decision Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryDecisionNodeProperty
	 * @generated
	 */
	EClass getBinaryDecisionNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeNameProperty <em>Decision Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeNameProperty
	 * @generated
	 */
	EClass getDecisionNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeActivityProperty <em>Decision Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeActivityProperty
	 * @generated
	 */
	EClass getDecisionNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeRunningProperty <em>Decision Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeRunningProperty
	 * @generated
	 */
	EClass getDecisionNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenDecisionNodeContainerProperty <em>Control Token Decision Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Decision Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenDecisionNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenDecisionNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeHeldTokensProperty <em>Decision Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeHeldTokensProperty
	 * @generated
	 */
	EClass getDecisionNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeIncomingProperty <em>Decision Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeIncomingProperty
	 * @generated
	 */
	EClass getDecisionNodeIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeOutgoingProperty <em>Decision Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Outgoing Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.DecisionNodeOutgoingProperty
	 * @generated
	 */
	EClass getDecisionNodeOutgoingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeProperty <em>Merge Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeProperty
	 * @generated
	 */
	EClass getMergeNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryMergeNodeProperty <em>Unary Merge Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Merge Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryMergeNodeProperty
	 * @generated
	 */
	EClass getUnaryMergeNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryMergeNodeProperty <em>Binary Merge Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Merge Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryMergeNodeProperty
	 * @generated
	 */
	EClass getBinaryMergeNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeNameProperty <em>Merge Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeNameProperty
	 * @generated
	 */
	EClass getMergeNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeActivityProperty <em>Merge Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeActivityProperty
	 * @generated
	 */
	EClass getMergeNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeRunningProperty <em>Merge Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeRunningProperty
	 * @generated
	 */
	EClass getMergeNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenMergeNodeContainerProperty <em>Control Token Merge Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Merge Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenMergeNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenMergeNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeHeldTokensProperty <em>Merge Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeHeldTokensProperty
	 * @generated
	 */
	EClass getMergeNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeIncomingProperty <em>Merge Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeIncomingProperty
	 * @generated
	 */
	EClass getMergeNodeIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeOutgoingProperty <em>Merge Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Outgoing Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.MergeNodeOutgoingProperty
	 * @generated
	 */
	EClass getMergeNodeOutgoingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeProperty <em>Fork Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeProperty
	 * @generated
	 */
	EClass getForkNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryForkNodeProperty <em>Unary Fork Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Fork Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryForkNodeProperty
	 * @generated
	 */
	EClass getUnaryForkNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryForkNodeProperty <em>Binary Fork Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Fork Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryForkNodeProperty
	 * @generated
	 */
	EClass getBinaryForkNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeNameProperty <em>Fork Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeNameProperty
	 * @generated
	 */
	EClass getForkNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeActivityProperty <em>Fork Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeActivityProperty
	 * @generated
	 */
	EClass getForkNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeRunningProperty <em>Fork Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeRunningProperty
	 * @generated
	 */
	EClass getForkNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenForkNodeContainerProperty <em>Control Token Fork Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Fork Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenForkNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenForkNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeHeldTokensProperty <em>Fork Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeHeldTokensProperty
	 * @generated
	 */
	EClass getForkNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeIncomingProperty <em>Fork Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeIncomingProperty
	 * @generated
	 */
	EClass getForkNodeIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeOutgoingProperty <em>Fork Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Outgoing Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ForkNodeOutgoingProperty
	 * @generated
	 */
	EClass getForkNodeOutgoingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeProperty <em>Join Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeProperty
	 * @generated
	 */
	EClass getJoinNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryJoinNodeProperty <em>Unary Join Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Join Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryJoinNodeProperty
	 * @generated
	 */
	EClass getUnaryJoinNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryJoinNodeProperty <em>Binary Join Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Join Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryJoinNodeProperty
	 * @generated
	 */
	EClass getBinaryJoinNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeNameProperty <em>Join Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeNameProperty
	 * @generated
	 */
	EClass getJoinNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeActivityProperty <em>Join Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeActivityProperty
	 * @generated
	 */
	EClass getJoinNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeRunningProperty <em>Join Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeRunningProperty
	 * @generated
	 */
	EClass getJoinNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenJoinNodeContainerProperty <em>Control Token Join Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Join Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenJoinNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenJoinNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeHeldTokensProperty <em>Join Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeHeldTokensProperty
	 * @generated
	 */
	EClass getJoinNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeIncomingProperty <em>Join Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeIncomingProperty
	 * @generated
	 */
	EClass getJoinNodeIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeOutgoingProperty <em>Join Node Outgoing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Outgoing Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.JoinNodeOutgoingProperty
	 * @generated
	 */
	EClass getJoinNodeOutgoingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeProperty <em>Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeProperty
	 * @generated
	 */
	EClass getFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryFinalNodeProperty <em>Unary Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryFinalNodeProperty
	 * @generated
	 */
	EClass getUnaryFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryFinalNodeProperty <em>Binary Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryFinalNodeProperty
	 * @generated
	 */
	EClass getBinaryFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeNameProperty <em>Final Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeNameProperty
	 * @generated
	 */
	EClass getFinalNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeActivityProperty <em>Final Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeActivityProperty
	 * @generated
	 */
	EClass getFinalNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeRunningProperty <em>Final Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeRunningProperty
	 * @generated
	 */
	EClass getFinalNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenFinalNodeContainerProperty <em>Control Token Final Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Final Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenFinalNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenFinalNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeHeldTokensProperty <em>Final Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeHeldTokensProperty
	 * @generated
	 */
	EClass getFinalNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeIncomingProperty <em>Final Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FinalNodeIncomingProperty
	 * @generated
	 */
	EClass getFinalNodeIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeProperty <em>Activity Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeProperty
	 * @generated
	 */
	EClass getActivityFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityFinalNodeProperty <em>Unary Activity Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Activity Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryActivityFinalNodeProperty
	 * @generated
	 */
	EClass getUnaryActivityFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityFinalNodeProperty <em>Binary Activity Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Activity Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryActivityFinalNodeProperty
	 * @generated
	 */
	EClass getBinaryActivityFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeNameProperty <em>Activity Final Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeNameProperty
	 * @generated
	 */
	EClass getActivityFinalNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeActivityProperty <em>Activity Final Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeActivityProperty
	 * @generated
	 */
	EClass getActivityFinalNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeRunningProperty <em>Activity Final Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeRunningProperty
	 * @generated
	 */
	EClass getActivityFinalNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityFinalNodeContainerProperty <em>Control Token Activity Final Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Activity Final Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenActivityFinalNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenActivityFinalNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeHeldTokensProperty <em>Activity Final Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeHeldTokensProperty
	 * @generated
	 */
	EClass getActivityFinalNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeIncomingProperty <em>Activity Final Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ActivityFinalNodeIncomingProperty
	 * @generated
	 */
	EClass getActivityFinalNodeIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeProperty <em>Flow Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeProperty
	 * @generated
	 */
	EClass getFlowFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryFlowFinalNodeProperty <em>Unary Flow Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Flow Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryFlowFinalNodeProperty
	 * @generated
	 */
	EClass getUnaryFlowFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryFlowFinalNodeProperty <em>Binary Flow Final Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Flow Final Node Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryFlowFinalNodeProperty
	 * @generated
	 */
	EClass getBinaryFlowFinalNodeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeNameProperty <em>Flow Final Node Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeNameProperty
	 * @generated
	 */
	EClass getFlowFinalNodeNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeActivityProperty <em>Flow Final Node Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node Activity Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeActivityProperty
	 * @generated
	 */
	EClass getFlowFinalNodeActivityProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeRunningProperty <em>Flow Final Node Running Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node Running Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeRunningProperty
	 * @generated
	 */
	EClass getFlowFinalNodeRunningProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenFlowFinalNodeContainerProperty <em>Control Token Flow Final Node Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Flow Final Node Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ControlTokenFlowFinalNodeContainerProperty
	 * @generated
	 */
	EClass getControlTokenFlowFinalNodeContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeHeldTokensProperty <em>Flow Final Node Held Tokens Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node Held Tokens Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeHeldTokensProperty
	 * @generated
	 */
	EClass getFlowFinalNodeHeldTokensProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeIncomingProperty <em>Flow Final Node Incoming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node Incoming Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.FlowFinalNodeIncomingProperty
	 * @generated
	 */
	EClass getFlowFinalNodeIncomingProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ValueProperty <em>Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.ValueProperty
	 * @generated
	 */
	EClass getValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryValueProperty <em>Unary Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryValueProperty
	 * @generated
	 */
	EClass getUnaryValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryValueProperty <em>Binary Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryValueProperty
	 * @generated
	 */
	EClass getBinaryValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionProperty <em>Integer Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionProperty
	 * @generated
	 */
	EClass getIntegerExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerExpressionProperty <em>Unary Integer Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Integer Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerExpressionProperty
	 * @generated
	 */
	EClass getUnaryIntegerExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerExpressionProperty <em>Binary Integer Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerExpressionProperty
	 * @generated
	 */
	EClass getBinaryIntegerExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableProperty <em>Integer Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableProperty
	 * @generated
	 */
	EClass getIntegerVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerVariableProperty <em>Unary Integer Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Integer Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerVariableProperty
	 * @generated
	 */
	EClass getUnaryIntegerVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableProperty <em>Binary Integer Variable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer Variable Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableProperty
	 * @generated
	 */
	EClass getBinaryIntegerVariableProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableNameProperty <em>Integer Variable Name Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Name Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableNameProperty
	 * @generated
	 */
	EClass getIntegerVariableNameProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableInitialValueProperty <em>Integer Variable Initial Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Initial Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableInitialValueProperty
	 * @generated
	 */
	EClass getIntegerVariableInitialValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableCurrentValueProperty <em>Integer Variable Current Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Current Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableCurrentValueProperty
	 * @generated
	 */
	EClass getIntegerVariableCurrentValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanValueProperty <em>Boolean Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanValueProperty
	 * @generated
	 */
	EClass getBooleanValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanValueProperty <em>Unary Boolean Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Boolean Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanValueProperty
	 * @generated
	 */
	EClass getUnaryBooleanValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanValueProperty <em>Binary Boolean Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanValueProperty
	 * @generated
	 */
	EClass getBinaryBooleanValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanValueValueProperty <em>Boolean Value Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanValueValueProperty
	 * @generated
	 */
	EClass getBooleanValueValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerValueProperty <em>Integer Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerValueProperty
	 * @generated
	 */
	EClass getIntegerValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerValueProperty <em>Unary Integer Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Integer Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerValueProperty
	 * @generated
	 */
	EClass getUnaryIntegerValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerValueProperty <em>Binary Integer Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerValueProperty
	 * @generated
	 */
	EClass getBinaryIntegerValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerValueValueProperty <em>Integer Value Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Value Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerValueValueProperty
	 * @generated
	 */
	EClass getIntegerValueValueProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionProperty <em>Integer Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Binary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionProperty
	 * @generated
	 */
	EClass getIntegerBinaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerBinaryExpressionProperty <em>Unary Integer Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Integer Binary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerBinaryExpressionProperty
	 * @generated
	 */
	EClass getUnaryIntegerBinaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerBinaryExpressionProperty <em>Binary Integer Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer Binary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerBinaryExpressionProperty
	 * @generated
	 */
	EClass getBinaryIntegerBinaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand1Property <em>Integer Binary Expression Operand1 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Binary Expression Operand1 Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand1Property
	 * @generated
	 */
	EClass getIntegerBinaryExpressionOperand1Property();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand2Property <em>Integer Binary Expression Operand2 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Binary Expression Operand2 Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperand2Property
	 * @generated
	 */
	EClass getIntegerBinaryExpressionOperand2Property();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperatorProperty <em>Integer Binary Expression Operator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Binary Expression Operator Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerBinaryExpressionOperatorProperty
	 * @generated
	 */
	EClass getIntegerBinaryExpressionOperatorProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionProperty <em>Integer Comparison Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionProperty
	 * @generated
	 */
	EClass getIntegerComparisonExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerComparisonExpressionProperty <em>Unary Integer Comparison Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Integer Comparison Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerComparisonExpressionProperty
	 * @generated
	 */
	EClass getUnaryIntegerComparisonExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerComparisonExpressionProperty <em>Binary Integer Comparison Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer Comparison Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerComparisonExpressionProperty
	 * @generated
	 */
	EClass getBinaryIntegerComparisonExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperatorProperty <em>Integer Comparison Expression Operator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression Operator Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperatorProperty
	 * @generated
	 */
	EClass getIntegerComparisonExpressionOperatorProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperand1Property <em>Integer Comparison Expression Operand1 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression Operand1 Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperand1Property
	 * @generated
	 */
	EClass getIntegerComparisonExpressionOperand1Property();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperand2Property <em>Integer Comparison Expression Operand2 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression Operand2 Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerComparisonExpressionOperand2Property
	 * @generated
	 */
	EClass getIntegerComparisonExpressionOperand2Property();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionProperty <em>Boolean Unary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionProperty
	 * @generated
	 */
	EClass getBooleanUnaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanUnaryExpressionProperty <em>Unary Boolean Unary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Boolean Unary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanUnaryExpressionProperty
	 * @generated
	 */
	EClass getUnaryBooleanUnaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanUnaryExpressionProperty <em>Binary Boolean Unary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Unary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanUnaryExpressionProperty
	 * @generated
	 */
	EClass getBinaryBooleanUnaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionOperandProperty <em>Boolean Unary Expression Operand Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression Operand Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionOperandProperty
	 * @generated
	 */
	EClass getBooleanUnaryExpressionOperandProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionOperatorProperty <em>Boolean Unary Expression Operator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression Operator Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanUnaryExpressionOperatorProperty
	 * @generated
	 */
	EClass getBooleanUnaryExpressionOperatorProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionProperty <em>Boolean Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionProperty
	 * @generated
	 */
	EClass getBooleanBinaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanBinaryExpressionProperty <em>Unary Boolean Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Boolean Binary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanBinaryExpressionProperty
	 * @generated
	 */
	EClass getUnaryBooleanBinaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanBinaryExpressionProperty <em>Binary Boolean Binary Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Binary Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanBinaryExpressionProperty
	 * @generated
	 */
	EClass getBinaryBooleanBinaryExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperand1Property <em>Boolean Binary Expression Operand1 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression Operand1 Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperand1Property
	 * @generated
	 */
	EClass getBooleanBinaryExpressionOperand1Property();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperand2Property <em>Boolean Binary Expression Operand2 Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression Operand2 Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperand2Property
	 * @generated
	 */
	EClass getBooleanBinaryExpressionOperand2Property();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperatorProperty <em>Boolean Binary Expression Operator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression Operator Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanBinaryExpressionOperatorProperty
	 * @generated
	 */
	EClass getBooleanBinaryExpressionOperatorProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentProperty <em>Boolean Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentProperty
	 * @generated
	 */
	EClass getBooleanVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanVariableAssignmentProperty <em>Unary Boolean Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Boolean Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryBooleanVariableAssignmentProperty
	 * @generated
	 */
	EClass getUnaryBooleanVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanVariableAssignmentProperty <em>Binary Boolean Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryBooleanVariableAssignmentProperty
	 * @generated
	 */
	EClass getBinaryBooleanVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentAssigneeProperty <em>Boolean Variable Assignment Assignee Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Assignment Assignee Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentAssigneeProperty
	 * @generated
	 */
	EClass getBooleanVariableAssignmentAssigneeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanExpressionBooleanVariableAssignmentContainerProperty <em>Boolean Expression Boolean Variable Assignment Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Boolean Variable Assignment Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanExpressionBooleanVariableAssignmentContainerProperty
	 * @generated
	 */
	EClass getBooleanExpressionBooleanVariableAssignmentContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentExpressionProperty <em>Boolean Variable Assignment Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Assignment Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BooleanVariableAssignmentExpressionProperty
	 * @generated
	 */
	EClass getBooleanVariableAssignmentExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentProperty <em>Integer Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentProperty
	 * @generated
	 */
	EClass getIntegerVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerVariableAssignmentProperty <em>Unary Integer Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Integer Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryIntegerVariableAssignmentProperty
	 * @generated
	 */
	EClass getUnaryIntegerVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableAssignmentProperty <em>Binary Integer Variable Assignment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer Variable Assignment Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryIntegerVariableAssignmentProperty
	 * @generated
	 */
	EClass getBinaryIntegerVariableAssignmentProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentAssigneeProperty <em>Integer Variable Assignment Assignee Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Assignment Assignee Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentAssigneeProperty
	 * @generated
	 */
	EClass getIntegerVariableAssignmentAssigneeProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionIntegerVariableAssignmentContainerProperty <em>Integer Expression Integer Variable Assignment Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression Integer Variable Assignment Container Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerExpressionIntegerVariableAssignmentContainerProperty
	 * @generated
	 */
	EClass getIntegerExpressionIntegerVariableAssignmentContainerProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExpressionProperty <em>Integer Variable Assignment Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Assignment Expression Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.IntegerVariableAssignmentExpressionProperty
	 * @generated
	 */
	EClass getIntegerVariableAssignmentExpressionProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OfferProperty <em>Offer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.OfferProperty
	 * @generated
	 */
	EClass getOfferProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryOfferProperty <em>Unary Offer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Offer Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.UnaryOfferProperty
	 * @generated
	 */
	EClass getUnaryOfferProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryOfferProperty <em>Binary Offer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Offer Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.BinaryOfferProperty
	 * @generated
	 */
	EClass getBinaryOfferProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramNextProperty <em>XActivity Diagram Next Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Next Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramNextProperty
	 * @generated
	 */
	EClass getXActivityDiagramNextProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramUntilProperty <em>XActivity Diagram Until Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Until Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramUntilProperty
	 * @generated
	 */
	EClass getXActivityDiagramUntilProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramReleaseProperty <em>XActivity Diagram Release Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Release Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramReleaseProperty
	 * @generated
	 */
	EClass getXActivityDiagramReleaseProperty();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramNegationTemporalProperty <em>XActivity Diagram Negation Temporal Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XActivity Diagram Negation Temporal Property</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramNegationTemporalProperty
	 * @generated
	 */
	EClass getXActivityDiagramNegationTemporalProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XActivityDiagramPropertyFactory getXActivityDiagramPropertyFactory();

} //XActivityDiagramPropertyPackage
