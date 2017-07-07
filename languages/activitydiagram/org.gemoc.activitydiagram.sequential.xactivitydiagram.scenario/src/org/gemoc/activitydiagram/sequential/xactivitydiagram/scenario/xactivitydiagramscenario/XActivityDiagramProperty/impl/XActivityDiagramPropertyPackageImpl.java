/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.XActivityDiagramArbiterPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramArbiter.impl.XActivityDiagramArbiterPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.impl.XActivityDiagramEventPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.XActivityDiagramProviderPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProvider.impl.XActivityDiagramProviderPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.XActivityDiagramScenarioPackage;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramScenario.impl.XActivityDiagramScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XActivityDiagramPropertyPackageImpl extends EPackageImpl implements XActivityDiagramPropertyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "XActivityDiagramProperty.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeTerminatePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeAddTokenPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableInitPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableAssignmentExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeRemoveTokenPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableAssignmentExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionAcceptPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeExecutePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionWaitForEventPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramAbstractPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramTemporalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramStatePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramStepPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryNamedElementPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryNamedElementPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventActivityContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryEventPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEventPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEventsPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryActivityNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryActivityNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenActivityNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryControlTokenPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryControlTokenPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeActivityContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryActivityEdgePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryActivityEdgePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeSourcePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeTargetPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenActivityEdgeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeOfferedTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActivityContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryVariablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryVariablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityLocalsPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryControlFlowPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryControlFlowPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowSourcePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowTargetPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenControlFlowContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowOfferedTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowGuardPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBooleanExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBooleanVariablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanVariablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableInitialValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableCurrentValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryActionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryActionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenActionContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionOutgoingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOpaqueActionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOpaqueActionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenOpaqueActionContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionOutgoingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentOpaqueActionContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryVariableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryVariableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionAssignmentsPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryAcceptEventActionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryAcceptEventActionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenAcceptEventActionContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEventTypePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionOutgoingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryControlNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryControlNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenControlNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryInitialNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryInitialNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenInitialNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeOutgoingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryDecisionNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDecisionNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenDecisionNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeOutgoingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryMergeNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryMergeNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenMergeNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeOutgoingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryForkNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryForkNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenForkNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeOutgoingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryJoinNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryJoinNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenJoinNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeOutgoingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryFinalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFinalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenFinalNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryActivityFinalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryActivityFinalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenActivityFinalNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryFlowFinalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFlowFinalNodePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeActivityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeRunningPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenFlowFinalNodeContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeHeldTokensPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeIncomingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryIntegerExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIntegerExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryIntegerVariablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIntegerVariablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableNamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableInitialValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableCurrentValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBooleanValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryIntegerValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIntegerValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerBinaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryIntegerBinaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIntegerBinaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerBinaryExpressionOperand1PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerBinaryExpressionOperand2PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerBinaryExpressionOperatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryIntegerComparisonExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIntegerComparisonExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpressionOperatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpressionOperand1PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpressionOperand2PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBooleanUnaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanUnaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpressionOperandPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpressionOperatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBooleanBinaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanBinaryExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpressionOperand1PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpressionOperand2PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpressionOperatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBooleanVariableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanVariableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableAssignmentAssigneePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionBooleanVariableAssignmentContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableAssignmentExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryIntegerVariableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIntegerVariableAssignmentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableAssignmentAssigneePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionIntegerVariableAssignmentContainerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableAssignmentExpressionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOfferPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOfferPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramNextPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramUntilPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramReleasePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xActivityDiagramNegationTemporalPropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty.XActivityDiagramPropertyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XActivityDiagramPropertyPackageImpl() {
		super(eNS_URI, XActivityDiagramPropertyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XActivityDiagramPropertyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static XActivityDiagramPropertyPackage init() {
		if (isInited) return (XActivityDiagramPropertyPackage)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI);

		// Obtain or create and register package
		XActivityDiagramPropertyPackageImpl theXActivityDiagramPropertyPackage = (XActivityDiagramPropertyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XActivityDiagramPropertyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XActivityDiagramPropertyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XActivityDiagramArbiterPackageImpl theXActivityDiagramArbiterPackage = (XActivityDiagramArbiterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI) instanceof XActivityDiagramArbiterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramArbiterPackage.eNS_URI) : XActivityDiagramArbiterPackage.eINSTANCE);
		XActivityDiagramEventPackageImpl theXActivityDiagramEventPackage = (XActivityDiagramEventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI) instanceof XActivityDiagramEventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramEventPackage.eNS_URI) : XActivityDiagramEventPackage.eINSTANCE);
		XActivityDiagramProviderPackageImpl theXActivityDiagramProviderPackage = (XActivityDiagramProviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI) instanceof XActivityDiagramProviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramProviderPackage.eNS_URI) : XActivityDiagramProviderPackage.eINSTANCE);
		XActivityDiagramScenarioPackageImpl theXActivityDiagramScenarioPackage = (XActivityDiagramScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI) instanceof XActivityDiagramScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramScenarioPackage.eNS_URI) : XActivityDiagramScenarioPackage.eINSTANCE);

		// Load packages
		theXActivityDiagramPropertyPackage.loadPackage();

		// Create package meta-data objects
		theXActivityDiagramArbiterPackage.createPackageContents();
		theXActivityDiagramEventPackage.createPackageContents();
		theXActivityDiagramProviderPackage.createPackageContents();
		theXActivityDiagramScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theXActivityDiagramArbiterPackage.initializePackageContents();
		theXActivityDiagramEventPackage.initializePackageContents();
		theXActivityDiagramProviderPackage.initializePackageContents();
		theXActivityDiagramScenarioPackage.initializePackageContents();

		// Fix loaded packages
		theXActivityDiagramPropertyPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXActivityDiagramPropertyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XActivityDiagramPropertyPackage.eNS_URI, theXActivityDiagramPropertyPackage);
		return theXActivityDiagramPropertyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeExecuteProperty() {
		if (joinNodeExecutePropertyEClass == null) {
			joinNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(0);
		}
		return joinNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeExecuteProperty() {
		if (finalNodeExecutePropertyEClass == null) {
			finalNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(1);
		}
		return finalNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeExecuteProperty() {
		if (decisionNodeExecutePropertyEClass == null) {
			decisionNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(2);
		}
		return decisionNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeExecuteProperty() {
		if (activityFinalNodeExecutePropertyEClass == null) {
			activityFinalNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(3);
		}
		return activityFinalNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeTerminateProperty() {
		if (activityNodeTerminatePropertyEClass == null) {
			activityNodeTerminatePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(4);
		}
		return activityNodeTerminatePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionExecuteProperty() {
		if (opaqueActionExecutePropertyEClass == null) {
			opaqueActionExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(5);
		}
		return opaqueActionExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeAddTokenProperty() {
		if (activityNodeAddTokenPropertyEClass == null) {
			activityNodeAddTokenPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(6);
		}
		return activityNodeAddTokenPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignmentExecuteProperty() {
		if (variableAssignmentExecutePropertyEClass == null) {
			variableAssignmentExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(7);
		}
		return variableAssignmentExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeExecuteProperty() {
		if (mergeNodeExecutePropertyEClass == null) {
			mergeNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(8);
		}
		return mergeNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableInitProperty() {
		if (variableInitPropertyEClass == null) {
			variableInitPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(9);
		}
		return variableInitPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExecuteProperty() {
		if (activityExecutePropertyEClass == null) {
			activityExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(10);
		}
		return activityExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeExecuteProperty() {
		if (forkNodeExecutePropertyEClass == null) {
			forkNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(11);
		}
		return forkNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionExecuteProperty() {
		if (acceptEventActionExecutePropertyEClass == null) {
			acceptEventActionExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(12);
		}
		return acceptEventActionExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeExecuteProperty() {
		if (flowFinalNodeExecutePropertyEClass == null) {
			flowFinalNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(13);
		}
		return flowFinalNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeExecuteProperty() {
		if (initialNodeExecutePropertyEClass == null) {
			initialNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(14);
		}
		return initialNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableAssignmentExecuteProperty() {
		if (booleanVariableAssignmentExecutePropertyEClass == null) {
			booleanVariableAssignmentExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(15);
		}
		return booleanVariableAssignmentExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeRemoveTokenProperty() {
		if (activityNodeRemoveTokenPropertyEClass == null) {
			activityNodeRemoveTokenPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(16);
		}
		return activityNodeRemoveTokenPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableAssignmentExecuteProperty() {
		if (integerVariableAssignmentExecutePropertyEClass == null) {
			integerVariableAssignmentExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(17);
		}
		return integerVariableAssignmentExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionAcceptProperty() {
		if (acceptEventActionAcceptPropertyEClass == null) {
			acceptEventActionAcceptPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(18);
		}
		return acceptEventActionAcceptPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeExecuteProperty() {
		if (activityNodeExecutePropertyEClass == null) {
			activityNodeExecutePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(19);
		}
		return activityNodeExecutePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionWaitForEventProperty() {
		if (acceptEventActionWaitForEventPropertyEClass == null) {
			acceptEventActionWaitForEventPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(20);
		}
		return acceptEventActionWaitForEventPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramAbstractProperty() {
		if (xActivityDiagramAbstractPropertyEClass == null) {
			xActivityDiagramAbstractPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(21);
		}
		return xActivityDiagramAbstractPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramTemporalProperty() {
		if (xActivityDiagramTemporalPropertyEClass == null) {
			xActivityDiagramTemporalPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(22);
		}
		return xActivityDiagramTemporalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramProperty() {
		if (xActivityDiagramPropertyEClass == null) {
			xActivityDiagramPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(23);
		}
		return xActivityDiagramPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramStateProperty() {
		if (xActivityDiagramStatePropertyEClass == null) {
			xActivityDiagramStatePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(24);
		}
		return xActivityDiagramStatePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramStepProperty() {
		if (xActivityDiagramStepPropertyEClass == null) {
			xActivityDiagramStepPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(25);
		}
		return xActivityDiagramStepPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElementProperty() {
		if (namedElementPropertyEClass == null) {
			namedElementPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(26);
		}
		return namedElementPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryNamedElementProperty() {
		if (unaryNamedElementPropertyEClass == null) {
			unaryNamedElementPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(27);
		}
		return unaryNamedElementPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryNamedElementProperty() {
		if (binaryNamedElementPropertyEClass == null) {
			binaryNamedElementPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(28);
		}
		return binaryNamedElementPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElementNameProperty() {
		if (namedElementNamePropertyEClass == null) {
			namedElementNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(29);
		}
		return namedElementNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityProperty() {
		if (activityPropertyEClass == null) {
			activityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(30);
		}
		return activityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryActivityProperty() {
		if (unaryActivityPropertyEClass == null) {
			unaryActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(31);
		}
		return unaryActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryActivityProperty() {
		if (binaryActivityPropertyEClass == null) {
			binaryActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(32);
		}
		return binaryActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNameProperty() {
		if (activityNamePropertyEClass == null) {
			activityNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(33);
		}
		return activityNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventActivityContainerProperty() {
		if (eventActivityContainerPropertyEClass == null) {
			eventActivityContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(34);
		}
		return eventActivityContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventProperty() {
		if (eventPropertyEClass == null) {
			eventPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(35);
		}
		return eventPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryEventProperty() {
		if (unaryEventPropertyEClass == null) {
			unaryEventPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(36);
		}
		return unaryEventPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryEventProperty() {
		if (binaryEventPropertyEClass == null) {
			binaryEventPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(37);
		}
		return binaryEventPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventNameProperty() {
		if (eventNamePropertyEClass == null) {
			eventNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(38);
		}
		return eventNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEventsProperty() {
		if (activityEventsPropertyEClass == null) {
			activityEventsPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(39);
		}
		return activityEventsPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodesProperty() {
		if (activityNodesPropertyEClass == null) {
			activityNodesPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(40);
		}
		return activityNodesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeProperty() {
		if (activityNodePropertyEClass == null) {
			activityNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(41);
		}
		return activityNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryActivityNodeProperty() {
		if (unaryActivityNodePropertyEClass == null) {
			unaryActivityNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(42);
		}
		return unaryActivityNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryActivityNodeProperty() {
		if (binaryActivityNodePropertyEClass == null) {
			binaryActivityNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(43);
		}
		return binaryActivityNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeNameProperty() {
		if (activityNodeNamePropertyEClass == null) {
			activityNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(44);
		}
		return activityNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeActivityProperty() {
		if (activityNodeActivityPropertyEClass == null) {
			activityNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(45);
		}
		return activityNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeRunningProperty() {
		if (activityNodeRunningPropertyEClass == null) {
			activityNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(46);
		}
		return activityNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenActivityNodeContainerProperty() {
		if (controlTokenActivityNodeContainerPropertyEClass == null) {
			controlTokenActivityNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(47);
		}
		return controlTokenActivityNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenProperty() {
		if (controlTokenPropertyEClass == null) {
			controlTokenPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(48);
		}
		return controlTokenPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryControlTokenProperty() {
		if (unaryControlTokenPropertyEClass == null) {
			unaryControlTokenPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(49);
		}
		return unaryControlTokenPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryControlTokenProperty() {
		if (binaryControlTokenPropertyEClass == null) {
			binaryControlTokenPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(50);
		}
		return binaryControlTokenPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeHeldTokensProperty() {
		if (activityNodeHeldTokensPropertyEClass == null) {
			activityNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(51);
		}
		return activityNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeActivityContainerProperty() {
		if (activityEdgeActivityContainerPropertyEClass == null) {
			activityEdgeActivityContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(52);
		}
		return activityEdgeActivityContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeProperty() {
		if (activityEdgePropertyEClass == null) {
			activityEdgePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(53);
		}
		return activityEdgePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryActivityEdgeProperty() {
		if (unaryActivityEdgePropertyEClass == null) {
			unaryActivityEdgePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(54);
		}
		return unaryActivityEdgePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryActivityEdgeProperty() {
		if (binaryActivityEdgePropertyEClass == null) {
			binaryActivityEdgePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(55);
		}
		return binaryActivityEdgePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeNameProperty() {
		if (activityEdgeNamePropertyEClass == null) {
			activityEdgeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(56);
		}
		return activityEdgeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeSourceProperty() {
		if (activityEdgeSourcePropertyEClass == null) {
			activityEdgeSourcePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(57);
		}
		return activityEdgeSourcePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeTargetProperty() {
		if (activityEdgeTargetPropertyEClass == null) {
			activityEdgeTargetPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(58);
		}
		return activityEdgeTargetPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenActivityEdgeContainerProperty() {
		if (controlTokenActivityEdgeContainerPropertyEClass == null) {
			controlTokenActivityEdgeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(59);
		}
		return controlTokenActivityEdgeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeOfferedTokensProperty() {
		if (activityEdgeOfferedTokensPropertyEClass == null) {
			activityEdgeOfferedTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(60);
		}
		return activityEdgeOfferedTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgesProperty() {
		if (activityEdgesPropertyEClass == null) {
			activityEdgesPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(61);
		}
		return activityEdgesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableActivityContainerProperty() {
		if (variableActivityContainerPropertyEClass == null) {
			variableActivityContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(62);
		}
		return variableActivityContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableProperty() {
		if (variablePropertyEClass == null) {
			variablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(63);
		}
		return variablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionProperty() {
		if (expressionPropertyEClass == null) {
			expressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(64);
		}
		return expressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpressionProperty() {
		if (unaryExpressionPropertyEClass == null) {
			unaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(65);
		}
		return unaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpressionProperty() {
		if (binaryExpressionPropertyEClass == null) {
			binaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(66);
		}
		return binaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryVariableProperty() {
		if (unaryVariablePropertyEClass == null) {
			unaryVariablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(67);
		}
		return unaryVariablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryVariableProperty() {
		if (binaryVariablePropertyEClass == null) {
			binaryVariablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(68);
		}
		return binaryVariablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableNameProperty() {
		if (variableNamePropertyEClass == null) {
			variableNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(69);
		}
		return variableNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityLocalsProperty() {
		if (activityLocalsPropertyEClass == null) {
			activityLocalsPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(70);
		}
		return activityLocalsPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowProperty() {
		if (controlFlowPropertyEClass == null) {
			controlFlowPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(71);
		}
		return controlFlowPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryControlFlowProperty() {
		if (unaryControlFlowPropertyEClass == null) {
			unaryControlFlowPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(72);
		}
		return unaryControlFlowPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryControlFlowProperty() {
		if (binaryControlFlowPropertyEClass == null) {
			binaryControlFlowPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(73);
		}
		return binaryControlFlowPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowNameProperty() {
		if (controlFlowNamePropertyEClass == null) {
			controlFlowNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(74);
		}
		return controlFlowNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowSourceProperty() {
		if (controlFlowSourcePropertyEClass == null) {
			controlFlowSourcePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(75);
		}
		return controlFlowSourcePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowTargetProperty() {
		if (controlFlowTargetPropertyEClass == null) {
			controlFlowTargetPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(76);
		}
		return controlFlowTargetPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenControlFlowContainerProperty() {
		if (controlTokenControlFlowContainerPropertyEClass == null) {
			controlTokenControlFlowContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(77);
		}
		return controlTokenControlFlowContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowOfferedTokensProperty() {
		if (controlFlowOfferedTokensPropertyEClass == null) {
			controlFlowOfferedTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(78);
		}
		return controlFlowOfferedTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowGuardProperty() {
		if (controlFlowGuardPropertyEClass == null) {
			controlFlowGuardPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(79);
		}
		return controlFlowGuardPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableProperty() {
		if (booleanVariablePropertyEClass == null) {
			booleanVariablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(80);
		}
		return booleanVariablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpressionProperty() {
		if (booleanExpressionPropertyEClass == null) {
			booleanExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(81);
		}
		return booleanExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBooleanExpressionProperty() {
		if (unaryBooleanExpressionPropertyEClass == null) {
			unaryBooleanExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(82);
		}
		return unaryBooleanExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanExpressionProperty() {
		if (binaryBooleanExpressionPropertyEClass == null) {
			binaryBooleanExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(83);
		}
		return binaryBooleanExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBooleanVariableProperty() {
		if (unaryBooleanVariablePropertyEClass == null) {
			unaryBooleanVariablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(84);
		}
		return unaryBooleanVariablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanVariableProperty() {
		if (binaryBooleanVariablePropertyEClass == null) {
			binaryBooleanVariablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(85);
		}
		return binaryBooleanVariablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableNameProperty() {
		if (booleanVariableNamePropertyEClass == null) {
			booleanVariableNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(86);
		}
		return booleanVariableNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableInitialValueProperty() {
		if (booleanVariableInitialValuePropertyEClass == null) {
			booleanVariableInitialValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(87);
		}
		return booleanVariableInitialValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableCurrentValueProperty() {
		if (booleanVariableCurrentValuePropertyEClass == null) {
			booleanVariableCurrentValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(88);
		}
		return booleanVariableCurrentValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionProperty() {
		if (actionPropertyEClass == null) {
			actionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(89);
		}
		return actionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryActionProperty() {
		if (unaryActionPropertyEClass == null) {
			unaryActionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(90);
		}
		return unaryActionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryActionProperty() {
		if (binaryActionPropertyEClass == null) {
			binaryActionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(91);
		}
		return binaryActionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionNameProperty() {
		if (actionNamePropertyEClass == null) {
			actionNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(92);
		}
		return actionNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionActivityProperty() {
		if (actionActivityPropertyEClass == null) {
			actionActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(93);
		}
		return actionActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRunningProperty() {
		if (actionRunningPropertyEClass == null) {
			actionRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(94);
		}
		return actionRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenActionContainerProperty() {
		if (controlTokenActionContainerPropertyEClass == null) {
			controlTokenActionContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(95);
		}
		return controlTokenActionContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionHeldTokensProperty() {
		if (actionHeldTokensPropertyEClass == null) {
			actionHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(96);
		}
		return actionHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionIncomingProperty() {
		if (actionIncomingPropertyEClass == null) {
			actionIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(97);
		}
		return actionIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionOutgoingProperty() {
		if (actionOutgoingPropertyEClass == null) {
			actionOutgoingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(98);
		}
		return actionOutgoingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionProperty() {
		if (opaqueActionPropertyEClass == null) {
			opaqueActionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(99);
		}
		return opaqueActionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOpaqueActionProperty() {
		if (unaryOpaqueActionPropertyEClass == null) {
			unaryOpaqueActionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(100);
		}
		return unaryOpaqueActionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOpaqueActionProperty() {
		if (binaryOpaqueActionPropertyEClass == null) {
			binaryOpaqueActionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(101);
		}
		return binaryOpaqueActionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionNameProperty() {
		if (opaqueActionNamePropertyEClass == null) {
			opaqueActionNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(102);
		}
		return opaqueActionNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionActivityProperty() {
		if (opaqueActionActivityPropertyEClass == null) {
			opaqueActionActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(103);
		}
		return opaqueActionActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionRunningProperty() {
		if (opaqueActionRunningPropertyEClass == null) {
			opaqueActionRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(104);
		}
		return opaqueActionRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenOpaqueActionContainerProperty() {
		if (controlTokenOpaqueActionContainerPropertyEClass == null) {
			controlTokenOpaqueActionContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(105);
		}
		return controlTokenOpaqueActionContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionHeldTokensProperty() {
		if (opaqueActionHeldTokensPropertyEClass == null) {
			opaqueActionHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(106);
		}
		return opaqueActionHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionIncomingProperty() {
		if (opaqueActionIncomingPropertyEClass == null) {
			opaqueActionIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(107);
		}
		return opaqueActionIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionOutgoingProperty() {
		if (opaqueActionOutgoingPropertyEClass == null) {
			opaqueActionOutgoingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(108);
		}
		return opaqueActionOutgoingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignmentOpaqueActionContainerProperty() {
		if (variableAssignmentOpaqueActionContainerPropertyEClass == null) {
			variableAssignmentOpaqueActionContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(109);
		}
		return variableAssignmentOpaqueActionContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignmentProperty() {
		if (variableAssignmentPropertyEClass == null) {
			variableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(110);
		}
		return variableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryVariableAssignmentProperty() {
		if (unaryVariableAssignmentPropertyEClass == null) {
			unaryVariableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(111);
		}
		return unaryVariableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryVariableAssignmentProperty() {
		if (binaryVariableAssignmentPropertyEClass == null) {
			binaryVariableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(112);
		}
		return binaryVariableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueActionAssignmentsProperty() {
		if (opaqueActionAssignmentsPropertyEClass == null) {
			opaqueActionAssignmentsPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(113);
		}
		return opaqueActionAssignmentsPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionProperty() {
		if (acceptEventActionPropertyEClass == null) {
			acceptEventActionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(114);
		}
		return acceptEventActionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryAcceptEventActionProperty() {
		if (unaryAcceptEventActionPropertyEClass == null) {
			unaryAcceptEventActionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(115);
		}
		return unaryAcceptEventActionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryAcceptEventActionProperty() {
		if (binaryAcceptEventActionPropertyEClass == null) {
			binaryAcceptEventActionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(116);
		}
		return binaryAcceptEventActionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionNameProperty() {
		if (acceptEventActionNamePropertyEClass == null) {
			acceptEventActionNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(117);
		}
		return acceptEventActionNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionActivityProperty() {
		if (acceptEventActionActivityPropertyEClass == null) {
			acceptEventActionActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(118);
		}
		return acceptEventActionActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionRunningProperty() {
		if (acceptEventActionRunningPropertyEClass == null) {
			acceptEventActionRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(119);
		}
		return acceptEventActionRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenAcceptEventActionContainerProperty() {
		if (controlTokenAcceptEventActionContainerPropertyEClass == null) {
			controlTokenAcceptEventActionContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(120);
		}
		return controlTokenAcceptEventActionContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionHeldTokensProperty() {
		if (acceptEventActionHeldTokensPropertyEClass == null) {
			acceptEventActionHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(121);
		}
		return acceptEventActionHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionEventTypeProperty() {
		if (acceptEventActionEventTypePropertyEClass == null) {
			acceptEventActionEventTypePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(122);
		}
		return acceptEventActionEventTypePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionIncomingProperty() {
		if (acceptEventActionIncomingPropertyEClass == null) {
			acceptEventActionIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(123);
		}
		return acceptEventActionIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventActionOutgoingProperty() {
		if (acceptEventActionOutgoingPropertyEClass == null) {
			acceptEventActionOutgoingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(124);
		}
		return acceptEventActionOutgoingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNodeProperty() {
		if (controlNodePropertyEClass == null) {
			controlNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(125);
		}
		return controlNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryControlNodeProperty() {
		if (unaryControlNodePropertyEClass == null) {
			unaryControlNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(126);
		}
		return unaryControlNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryControlNodeProperty() {
		if (binaryControlNodePropertyEClass == null) {
			binaryControlNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(127);
		}
		return binaryControlNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNodeNameProperty() {
		if (controlNodeNamePropertyEClass == null) {
			controlNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(128);
		}
		return controlNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNodeActivityProperty() {
		if (controlNodeActivityPropertyEClass == null) {
			controlNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(129);
		}
		return controlNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNodeRunningProperty() {
		if (controlNodeRunningPropertyEClass == null) {
			controlNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(130);
		}
		return controlNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenControlNodeContainerProperty() {
		if (controlTokenControlNodeContainerPropertyEClass == null) {
			controlTokenControlNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(131);
		}
		return controlTokenControlNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNodeHeldTokensProperty() {
		if (controlNodeHeldTokensPropertyEClass == null) {
			controlNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(132);
		}
		return controlNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeProperty() {
		if (initialNodePropertyEClass == null) {
			initialNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(133);
		}
		return initialNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryInitialNodeProperty() {
		if (unaryInitialNodePropertyEClass == null) {
			unaryInitialNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(134);
		}
		return unaryInitialNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryInitialNodeProperty() {
		if (binaryInitialNodePropertyEClass == null) {
			binaryInitialNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(135);
		}
		return binaryInitialNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeNameProperty() {
		if (initialNodeNamePropertyEClass == null) {
			initialNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(136);
		}
		return initialNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeActivityProperty() {
		if (initialNodeActivityPropertyEClass == null) {
			initialNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(137);
		}
		return initialNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeRunningProperty() {
		if (initialNodeRunningPropertyEClass == null) {
			initialNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(138);
		}
		return initialNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenInitialNodeContainerProperty() {
		if (controlTokenInitialNodeContainerPropertyEClass == null) {
			controlTokenInitialNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(139);
		}
		return controlTokenInitialNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeHeldTokensProperty() {
		if (initialNodeHeldTokensPropertyEClass == null) {
			initialNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(140);
		}
		return initialNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNodeOutgoingProperty() {
		if (initialNodeOutgoingPropertyEClass == null) {
			initialNodeOutgoingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(141);
		}
		return initialNodeOutgoingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeProperty() {
		if (decisionNodePropertyEClass == null) {
			decisionNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(142);
		}
		return decisionNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryDecisionNodeProperty() {
		if (unaryDecisionNodePropertyEClass == null) {
			unaryDecisionNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(143);
		}
		return unaryDecisionNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryDecisionNodeProperty() {
		if (binaryDecisionNodePropertyEClass == null) {
			binaryDecisionNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(144);
		}
		return binaryDecisionNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeNameProperty() {
		if (decisionNodeNamePropertyEClass == null) {
			decisionNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(145);
		}
		return decisionNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeActivityProperty() {
		if (decisionNodeActivityPropertyEClass == null) {
			decisionNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(146);
		}
		return decisionNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeRunningProperty() {
		if (decisionNodeRunningPropertyEClass == null) {
			decisionNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(147);
		}
		return decisionNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenDecisionNodeContainerProperty() {
		if (controlTokenDecisionNodeContainerPropertyEClass == null) {
			controlTokenDecisionNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(148);
		}
		return controlTokenDecisionNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeHeldTokensProperty() {
		if (decisionNodeHeldTokensPropertyEClass == null) {
			decisionNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(149);
		}
		return decisionNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeIncomingProperty() {
		if (decisionNodeIncomingPropertyEClass == null) {
			decisionNodeIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(150);
		}
		return decisionNodeIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNodeOutgoingProperty() {
		if (decisionNodeOutgoingPropertyEClass == null) {
			decisionNodeOutgoingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(151);
		}
		return decisionNodeOutgoingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeProperty() {
		if (mergeNodePropertyEClass == null) {
			mergeNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(152);
		}
		return mergeNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryMergeNodeProperty() {
		if (unaryMergeNodePropertyEClass == null) {
			unaryMergeNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(153);
		}
		return unaryMergeNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryMergeNodeProperty() {
		if (binaryMergeNodePropertyEClass == null) {
			binaryMergeNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(154);
		}
		return binaryMergeNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeNameProperty() {
		if (mergeNodeNamePropertyEClass == null) {
			mergeNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(155);
		}
		return mergeNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeActivityProperty() {
		if (mergeNodeActivityPropertyEClass == null) {
			mergeNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(156);
		}
		return mergeNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeRunningProperty() {
		if (mergeNodeRunningPropertyEClass == null) {
			mergeNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(157);
		}
		return mergeNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenMergeNodeContainerProperty() {
		if (controlTokenMergeNodeContainerPropertyEClass == null) {
			controlTokenMergeNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(158);
		}
		return controlTokenMergeNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeHeldTokensProperty() {
		if (mergeNodeHeldTokensPropertyEClass == null) {
			mergeNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(159);
		}
		return mergeNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeIncomingProperty() {
		if (mergeNodeIncomingPropertyEClass == null) {
			mergeNodeIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(160);
		}
		return mergeNodeIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNodeOutgoingProperty() {
		if (mergeNodeOutgoingPropertyEClass == null) {
			mergeNodeOutgoingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(161);
		}
		return mergeNodeOutgoingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeProperty() {
		if (forkNodePropertyEClass == null) {
			forkNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(162);
		}
		return forkNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryForkNodeProperty() {
		if (unaryForkNodePropertyEClass == null) {
			unaryForkNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(163);
		}
		return unaryForkNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryForkNodeProperty() {
		if (binaryForkNodePropertyEClass == null) {
			binaryForkNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(164);
		}
		return binaryForkNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeNameProperty() {
		if (forkNodeNamePropertyEClass == null) {
			forkNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(165);
		}
		return forkNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeActivityProperty() {
		if (forkNodeActivityPropertyEClass == null) {
			forkNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(166);
		}
		return forkNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeRunningProperty() {
		if (forkNodeRunningPropertyEClass == null) {
			forkNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(167);
		}
		return forkNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenForkNodeContainerProperty() {
		if (controlTokenForkNodeContainerPropertyEClass == null) {
			controlTokenForkNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(168);
		}
		return controlTokenForkNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeHeldTokensProperty() {
		if (forkNodeHeldTokensPropertyEClass == null) {
			forkNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(169);
		}
		return forkNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeIncomingProperty() {
		if (forkNodeIncomingPropertyEClass == null) {
			forkNodeIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(170);
		}
		return forkNodeIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeOutgoingProperty() {
		if (forkNodeOutgoingPropertyEClass == null) {
			forkNodeOutgoingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(171);
		}
		return forkNodeOutgoingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeProperty() {
		if (joinNodePropertyEClass == null) {
			joinNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(172);
		}
		return joinNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryJoinNodeProperty() {
		if (unaryJoinNodePropertyEClass == null) {
			unaryJoinNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(173);
		}
		return unaryJoinNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryJoinNodeProperty() {
		if (binaryJoinNodePropertyEClass == null) {
			binaryJoinNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(174);
		}
		return binaryJoinNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeNameProperty() {
		if (joinNodeNamePropertyEClass == null) {
			joinNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(175);
		}
		return joinNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeActivityProperty() {
		if (joinNodeActivityPropertyEClass == null) {
			joinNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(176);
		}
		return joinNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeRunningProperty() {
		if (joinNodeRunningPropertyEClass == null) {
			joinNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(177);
		}
		return joinNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenJoinNodeContainerProperty() {
		if (controlTokenJoinNodeContainerPropertyEClass == null) {
			controlTokenJoinNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(178);
		}
		return controlTokenJoinNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeHeldTokensProperty() {
		if (joinNodeHeldTokensPropertyEClass == null) {
			joinNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(179);
		}
		return joinNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeIncomingProperty() {
		if (joinNodeIncomingPropertyEClass == null) {
			joinNodeIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(180);
		}
		return joinNodeIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeOutgoingProperty() {
		if (joinNodeOutgoingPropertyEClass == null) {
			joinNodeOutgoingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(181);
		}
		return joinNodeOutgoingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeProperty() {
		if (finalNodePropertyEClass == null) {
			finalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(182);
		}
		return finalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryFinalNodeProperty() {
		if (unaryFinalNodePropertyEClass == null) {
			unaryFinalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(183);
		}
		return unaryFinalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFinalNodeProperty() {
		if (binaryFinalNodePropertyEClass == null) {
			binaryFinalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(184);
		}
		return binaryFinalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeNameProperty() {
		if (finalNodeNamePropertyEClass == null) {
			finalNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(185);
		}
		return finalNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeActivityProperty() {
		if (finalNodeActivityPropertyEClass == null) {
			finalNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(186);
		}
		return finalNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeRunningProperty() {
		if (finalNodeRunningPropertyEClass == null) {
			finalNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(187);
		}
		return finalNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenFinalNodeContainerProperty() {
		if (controlTokenFinalNodeContainerPropertyEClass == null) {
			controlTokenFinalNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(188);
		}
		return controlTokenFinalNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeHeldTokensProperty() {
		if (finalNodeHeldTokensPropertyEClass == null) {
			finalNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(189);
		}
		return finalNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeIncomingProperty() {
		if (finalNodeIncomingPropertyEClass == null) {
			finalNodeIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(190);
		}
		return finalNodeIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeProperty() {
		if (activityFinalNodePropertyEClass == null) {
			activityFinalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(191);
		}
		return activityFinalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryActivityFinalNodeProperty() {
		if (unaryActivityFinalNodePropertyEClass == null) {
			unaryActivityFinalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(192);
		}
		return unaryActivityFinalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryActivityFinalNodeProperty() {
		if (binaryActivityFinalNodePropertyEClass == null) {
			binaryActivityFinalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(193);
		}
		return binaryActivityFinalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeNameProperty() {
		if (activityFinalNodeNamePropertyEClass == null) {
			activityFinalNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(194);
		}
		return activityFinalNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeActivityProperty() {
		if (activityFinalNodeActivityPropertyEClass == null) {
			activityFinalNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(195);
		}
		return activityFinalNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeRunningProperty() {
		if (activityFinalNodeRunningPropertyEClass == null) {
			activityFinalNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(196);
		}
		return activityFinalNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenActivityFinalNodeContainerProperty() {
		if (controlTokenActivityFinalNodeContainerPropertyEClass == null) {
			controlTokenActivityFinalNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(197);
		}
		return controlTokenActivityFinalNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeHeldTokensProperty() {
		if (activityFinalNodeHeldTokensPropertyEClass == null) {
			activityFinalNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(198);
		}
		return activityFinalNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNodeIncomingProperty() {
		if (activityFinalNodeIncomingPropertyEClass == null) {
			activityFinalNodeIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(199);
		}
		return activityFinalNodeIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeProperty() {
		if (flowFinalNodePropertyEClass == null) {
			flowFinalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(200);
		}
		return flowFinalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryFlowFinalNodeProperty() {
		if (unaryFlowFinalNodePropertyEClass == null) {
			unaryFlowFinalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(201);
		}
		return unaryFlowFinalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFlowFinalNodeProperty() {
		if (binaryFlowFinalNodePropertyEClass == null) {
			binaryFlowFinalNodePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(202);
		}
		return binaryFlowFinalNodePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeNameProperty() {
		if (flowFinalNodeNamePropertyEClass == null) {
			flowFinalNodeNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(203);
		}
		return flowFinalNodeNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeActivityProperty() {
		if (flowFinalNodeActivityPropertyEClass == null) {
			flowFinalNodeActivityPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(204);
		}
		return flowFinalNodeActivityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeRunningProperty() {
		if (flowFinalNodeRunningPropertyEClass == null) {
			flowFinalNodeRunningPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(205);
		}
		return flowFinalNodeRunningPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlTokenFlowFinalNodeContainerProperty() {
		if (controlTokenFlowFinalNodeContainerPropertyEClass == null) {
			controlTokenFlowFinalNodeContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(206);
		}
		return controlTokenFlowFinalNodeContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeHeldTokensProperty() {
		if (flowFinalNodeHeldTokensPropertyEClass == null) {
			flowFinalNodeHeldTokensPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(207);
		}
		return flowFinalNodeHeldTokensPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNodeIncomingProperty() {
		if (flowFinalNodeIncomingPropertyEClass == null) {
			flowFinalNodeIncomingPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(208);
		}
		return flowFinalNodeIncomingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueProperty() {
		if (valuePropertyEClass == null) {
			valuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(209);
		}
		return valuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryValueProperty() {
		if (unaryValuePropertyEClass == null) {
			unaryValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(210);
		}
		return unaryValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryValueProperty() {
		if (binaryValuePropertyEClass == null) {
			binaryValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(211);
		}
		return binaryValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpressionProperty() {
		if (integerExpressionPropertyEClass == null) {
			integerExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(212);
		}
		return integerExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryIntegerExpressionProperty() {
		if (unaryIntegerExpressionPropertyEClass == null) {
			unaryIntegerExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(213);
		}
		return unaryIntegerExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIntegerExpressionProperty() {
		if (binaryIntegerExpressionPropertyEClass == null) {
			binaryIntegerExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(214);
		}
		return binaryIntegerExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableProperty() {
		if (integerVariablePropertyEClass == null) {
			integerVariablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(215);
		}
		return integerVariablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryIntegerVariableProperty() {
		if (unaryIntegerVariablePropertyEClass == null) {
			unaryIntegerVariablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(216);
		}
		return unaryIntegerVariablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIntegerVariableProperty() {
		if (binaryIntegerVariablePropertyEClass == null) {
			binaryIntegerVariablePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(217);
		}
		return binaryIntegerVariablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableNameProperty() {
		if (integerVariableNamePropertyEClass == null) {
			integerVariableNamePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(218);
		}
		return integerVariableNamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableInitialValueProperty() {
		if (integerVariableInitialValuePropertyEClass == null) {
			integerVariableInitialValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(219);
		}
		return integerVariableInitialValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableCurrentValueProperty() {
		if (integerVariableCurrentValuePropertyEClass == null) {
			integerVariableCurrentValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(220);
		}
		return integerVariableCurrentValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueProperty() {
		if (booleanValuePropertyEClass == null) {
			booleanValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(221);
		}
		return booleanValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBooleanValueProperty() {
		if (unaryBooleanValuePropertyEClass == null) {
			unaryBooleanValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(222);
		}
		return unaryBooleanValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanValueProperty() {
		if (binaryBooleanValuePropertyEClass == null) {
			binaryBooleanValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(223);
		}
		return binaryBooleanValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueValueProperty() {
		if (booleanValueValuePropertyEClass == null) {
			booleanValueValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(224);
		}
		return booleanValueValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueProperty() {
		if (integerValuePropertyEClass == null) {
			integerValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(225);
		}
		return integerValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryIntegerValueProperty() {
		if (unaryIntegerValuePropertyEClass == null) {
			unaryIntegerValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(226);
		}
		return unaryIntegerValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIntegerValueProperty() {
		if (binaryIntegerValuePropertyEClass == null) {
			binaryIntegerValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(227);
		}
		return binaryIntegerValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueValueProperty() {
		if (integerValueValuePropertyEClass == null) {
			integerValueValuePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(228);
		}
		return integerValueValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerBinaryExpressionProperty() {
		if (integerBinaryExpressionPropertyEClass == null) {
			integerBinaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(229);
		}
		return integerBinaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryIntegerBinaryExpressionProperty() {
		if (unaryIntegerBinaryExpressionPropertyEClass == null) {
			unaryIntegerBinaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(230);
		}
		return unaryIntegerBinaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIntegerBinaryExpressionProperty() {
		if (binaryIntegerBinaryExpressionPropertyEClass == null) {
			binaryIntegerBinaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(231);
		}
		return binaryIntegerBinaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerBinaryExpressionOperand1Property() {
		if (integerBinaryExpressionOperand1PropertyEClass == null) {
			integerBinaryExpressionOperand1PropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(232);
		}
		return integerBinaryExpressionOperand1PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerBinaryExpressionOperand2Property() {
		if (integerBinaryExpressionOperand2PropertyEClass == null) {
			integerBinaryExpressionOperand2PropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(233);
		}
		return integerBinaryExpressionOperand2PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerBinaryExpressionOperatorProperty() {
		if (integerBinaryExpressionOperatorPropertyEClass == null) {
			integerBinaryExpressionOperatorPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(234);
		}
		return integerBinaryExpressionOperatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpressionProperty() {
		if (integerComparisonExpressionPropertyEClass == null) {
			integerComparisonExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(235);
		}
		return integerComparisonExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryIntegerComparisonExpressionProperty() {
		if (unaryIntegerComparisonExpressionPropertyEClass == null) {
			unaryIntegerComparisonExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(236);
		}
		return unaryIntegerComparisonExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIntegerComparisonExpressionProperty() {
		if (binaryIntegerComparisonExpressionPropertyEClass == null) {
			binaryIntegerComparisonExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(237);
		}
		return binaryIntegerComparisonExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpressionOperatorProperty() {
		if (integerComparisonExpressionOperatorPropertyEClass == null) {
			integerComparisonExpressionOperatorPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(238);
		}
		return integerComparisonExpressionOperatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpressionOperand1Property() {
		if (integerComparisonExpressionOperand1PropertyEClass == null) {
			integerComparisonExpressionOperand1PropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(239);
		}
		return integerComparisonExpressionOperand1PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpressionOperand2Property() {
		if (integerComparisonExpressionOperand2PropertyEClass == null) {
			integerComparisonExpressionOperand2PropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(240);
		}
		return integerComparisonExpressionOperand2PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpressionProperty() {
		if (booleanUnaryExpressionPropertyEClass == null) {
			booleanUnaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(241);
		}
		return booleanUnaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBooleanUnaryExpressionProperty() {
		if (unaryBooleanUnaryExpressionPropertyEClass == null) {
			unaryBooleanUnaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(242);
		}
		return unaryBooleanUnaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanUnaryExpressionProperty() {
		if (binaryBooleanUnaryExpressionPropertyEClass == null) {
			binaryBooleanUnaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(243);
		}
		return binaryBooleanUnaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpressionOperandProperty() {
		if (booleanUnaryExpressionOperandPropertyEClass == null) {
			booleanUnaryExpressionOperandPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(244);
		}
		return booleanUnaryExpressionOperandPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpressionOperatorProperty() {
		if (booleanUnaryExpressionOperatorPropertyEClass == null) {
			booleanUnaryExpressionOperatorPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(245);
		}
		return booleanUnaryExpressionOperatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpressionProperty() {
		if (booleanBinaryExpressionPropertyEClass == null) {
			booleanBinaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(246);
		}
		return booleanBinaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBooleanBinaryExpressionProperty() {
		if (unaryBooleanBinaryExpressionPropertyEClass == null) {
			unaryBooleanBinaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(247);
		}
		return unaryBooleanBinaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanBinaryExpressionProperty() {
		if (binaryBooleanBinaryExpressionPropertyEClass == null) {
			binaryBooleanBinaryExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(248);
		}
		return binaryBooleanBinaryExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpressionOperand1Property() {
		if (booleanBinaryExpressionOperand1PropertyEClass == null) {
			booleanBinaryExpressionOperand1PropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(249);
		}
		return booleanBinaryExpressionOperand1PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpressionOperand2Property() {
		if (booleanBinaryExpressionOperand2PropertyEClass == null) {
			booleanBinaryExpressionOperand2PropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(250);
		}
		return booleanBinaryExpressionOperand2PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpressionOperatorProperty() {
		if (booleanBinaryExpressionOperatorPropertyEClass == null) {
			booleanBinaryExpressionOperatorPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(251);
		}
		return booleanBinaryExpressionOperatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableAssignmentProperty() {
		if (booleanVariableAssignmentPropertyEClass == null) {
			booleanVariableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(252);
		}
		return booleanVariableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBooleanVariableAssignmentProperty() {
		if (unaryBooleanVariableAssignmentPropertyEClass == null) {
			unaryBooleanVariableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(253);
		}
		return unaryBooleanVariableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanVariableAssignmentProperty() {
		if (binaryBooleanVariableAssignmentPropertyEClass == null) {
			binaryBooleanVariableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(254);
		}
		return binaryBooleanVariableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableAssignmentAssigneeProperty() {
		if (booleanVariableAssignmentAssigneePropertyEClass == null) {
			booleanVariableAssignmentAssigneePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(255);
		}
		return booleanVariableAssignmentAssigneePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpressionBooleanVariableAssignmentContainerProperty() {
		if (booleanExpressionBooleanVariableAssignmentContainerPropertyEClass == null) {
			booleanExpressionBooleanVariableAssignmentContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(256);
		}
		return booleanExpressionBooleanVariableAssignmentContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableAssignmentExpressionProperty() {
		if (booleanVariableAssignmentExpressionPropertyEClass == null) {
			booleanVariableAssignmentExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(257);
		}
		return booleanVariableAssignmentExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableAssignmentProperty() {
		if (integerVariableAssignmentPropertyEClass == null) {
			integerVariableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(258);
		}
		return integerVariableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryIntegerVariableAssignmentProperty() {
		if (unaryIntegerVariableAssignmentPropertyEClass == null) {
			unaryIntegerVariableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(259);
		}
		return unaryIntegerVariableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIntegerVariableAssignmentProperty() {
		if (binaryIntegerVariableAssignmentPropertyEClass == null) {
			binaryIntegerVariableAssignmentPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(260);
		}
		return binaryIntegerVariableAssignmentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableAssignmentAssigneeProperty() {
		if (integerVariableAssignmentAssigneePropertyEClass == null) {
			integerVariableAssignmentAssigneePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(261);
		}
		return integerVariableAssignmentAssigneePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpressionIntegerVariableAssignmentContainerProperty() {
		if (integerExpressionIntegerVariableAssignmentContainerPropertyEClass == null) {
			integerExpressionIntegerVariableAssignmentContainerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(262);
		}
		return integerExpressionIntegerVariableAssignmentContainerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableAssignmentExpressionProperty() {
		if (integerVariableAssignmentExpressionPropertyEClass == null) {
			integerVariableAssignmentExpressionPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(263);
		}
		return integerVariableAssignmentExpressionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfferProperty() {
		if (offerPropertyEClass == null) {
			offerPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(264);
		}
		return offerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOfferProperty() {
		if (unaryOfferPropertyEClass == null) {
			unaryOfferPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(265);
		}
		return unaryOfferPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOfferProperty() {
		if (binaryOfferPropertyEClass == null) {
			binaryOfferPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(266);
		}
		return binaryOfferPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramNextProperty() {
		if (xActivityDiagramNextPropertyEClass == null) {
			xActivityDiagramNextPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(267);
		}
		return xActivityDiagramNextPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramUntilProperty() {
		if (xActivityDiagramUntilPropertyEClass == null) {
			xActivityDiagramUntilPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(268);
		}
		return xActivityDiagramUntilPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramReleaseProperty() {
		if (xActivityDiagramReleasePropertyEClass == null) {
			xActivityDiagramReleasePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(269);
		}
		return xActivityDiagramReleasePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXActivityDiagramNegationTemporalProperty() {
		if (xActivityDiagramNegationTemporalPropertyEClass == null) {
			xActivityDiagramNegationTemporalPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XActivityDiagramPropertyPackage.eNS_URI).getEClassifiers().get(270);
		}
		return xActivityDiagramNegationTemporalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XActivityDiagramPropertyFactory getXActivityDiagramPropertyFactory() {
		return (XActivityDiagramPropertyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramProperty." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //XActivityDiagramPropertyPackageImpl
