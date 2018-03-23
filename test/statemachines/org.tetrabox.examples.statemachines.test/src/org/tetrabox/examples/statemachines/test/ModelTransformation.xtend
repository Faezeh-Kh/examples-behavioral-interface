package org.tetrabox.examples.statemachines.test

import java.util.Collections
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StylesheetsPackage
import org.eclipse.uml2.uml.Event
import org.eclipse.uml2.uml.FinalState
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Pseudostate
import org.eclipse.uml2.uml.Region
import org.eclipse.uml2.uml.State
import org.eclipse.uml2.uml.StateMachine
import org.eclipse.uml2.uml.Transition
import org.eclipse.uml2.uml.Trigger
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.Vertex
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlFactory
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.PseudostateKind
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.TransitionKind
import org.eclipse.uml2.uml.Behavior
import org.eclipse.uml2.uml.CallEvent
import org.eclipse.gemoc.executionframework.event.testsuite.TestsuiteFactory
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventFactory

class ModelTransformation {
	
	private val factory = AlmostumlFactory::eINSTANCE
	private val testSuiteFactory = TestsuiteFactory::eINSTANCE
	private val eventFactory = InterpretedstatemachineseventFactory::eINSTANCE
	private val systemFactory = StatemachinesFactory::eINSTANCE
	
	private val regionTraceability = new HashMap<Region, org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region>
	private val vertexTraceability = new HashMap<Vertex, org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex>
	private val eventTraceability = new HashMap<Event, org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Event>
	
	private var CustomSystem system = null
	
	def CustomSystem apply(StateMachine stateMachine, Resource resource) {
		regionTraceability.clear
		vertexTraceability.clear
		eventTraceability.clear
		system = systemFactory.createCustomSystem
		val newStateMachine = factory.createStateMachine
		system.statemachine = newStateMachine
		newStateMachine.name = stateMachine.name
		newStateMachine.regions.addAll(stateMachine.regions.map[transformRegion])
		stateMachine.eAllContents.filter(Transition).forEach[transformTransition]
		resource.contents.add(system)
		return system
	}
	
	def boolean canTransform(StateMachine stateMachine) {
		!stateMachine.eAllContents.exists[o|
			(o instanceof Pseudostate && (
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.DEEP_HISTORY_LITERAL ||
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.CHOICE_LITERAL ||
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.ENTRY_POINT_LITERAL ||
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.EXIT_POINT_LITERAL ||
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.JUNCTION_LITERAL ||
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.SHALLOW_HISTORY_LITERAL
			)) ||
			(o instanceof Trigger && (o as Trigger).event instanceof CallEvent) ||
			(o instanceof Transition && (o as Transition).guard !== null)
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region transformRegion(Region region) {
		val result = factory.createRegion => [
			name = region.name
			vertice.addAll(region.subvertices.map[transformVertex])
		]
		regionTraceability.put(region, result)
		return result
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex transformVertex(Vertex vertex) {
		val result = 
		if (vertex instanceof Pseudostate) {
			vertex.transformPseudostate
		} else if (vertex instanceof FinalState) {
			vertex.transformFinalState
		} else if (vertex instanceof State) {
			vertex.transformState
		}
		if (result !== null) {
			vertexTraceability.put(vertex, result)
		}
		return result
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate transformPseudostate(Pseudostate pseudostate) {
		factory.createPseudostate => [
			kind = switch (pseudostate.kind) {
				case INITIAL_LITERAL: {
					PseudostateKind.INITIAL
				}
				case TERMINATE_LITERAL: {
					PseudostateKind.TERMINATE
				}
				case FORK_LITERAL: {
					PseudostateKind.FORK
				}
				case JOIN_LITERAL: {
					PseudostateKind.JOIN
				}
				default: {
				}
			}
			name = pseudostate.name
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState transformFinalState(FinalState finalState) {
		factory.createFinalState => [
			name = finalState.name
			regions.addAll(finalState.regions.map[transformRegion])
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State transformState(State state) {
		factory.createState => [
			name = state.name
			entry = state.entry.transformBehavior
			doActivity = state.doActivity.transformBehavior
			exit = state.exit.transformBehavior
			deferrableTriggers.addAll(state.deferrableTriggers.map[transformTrigger])
			regions.addAll(state.regions.map[transformRegion])
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition transformTransition(Transition transition) {
		factory.createTransition => [
			name = transition.name
			kind = switch (transition.kind) {
				case EXTERNAL_LITERAL: {
					TransitionKind.EXTERNAL
				}
				case INTERNAL_LITERAL: {
					TransitionKind.INTERNAL
				}
				case LOCAL_LITERAL: {
					TransitionKind.LOCAL
				}
			}
			container = regionTraceability.get(transition.container)
			source = vertexTraceability.get(transition.source)
			target = vertexTraceability.get(transition.target)
			effect = transition.effect.transformBehavior
			triggers.addAll(transition.triggers.map[transformTrigger])
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Trigger transformTrigger(Trigger trigger) {
		factory.createTrigger => [
			name = trigger.name
			event = eventTraceability.computeIfAbsent(trigger.event, [
				val newEvent = systemFactory.createCustomEvent => [
					name = trigger.event.name
				]
				system.events.add(newEvent)
				return newEvent
			])
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Behavior transformBehavior(Behavior behavior) {
		if (behavior !== null) {
			factory.createBehavior => [
				name = behavior.name
			]
		} else {
			null
		}
		
	}
	
	def static URI getPapyrusTestSuiteURI() {
		URI::createFileURI("/home/dorian/Downloads/gemoc-studio-event-emitter-2/workspace/papyrus-test-suite/PSSM_TestSuite.uml")
	}
	
	def static URI getStateMachineURI(StateMachine stateMachine) {
		URI::createFileURI('''/home/dorian/git/examples-behavioral-interface/test/org.tetrabox.examples.statemachines.test/models/«stateMachine.name».xmi''')
	}
	
	def static URI getTestSuiteURI() {
		URI::createFileURI('''/home/dorian/git/examples-behavioral-interface/test/org.tetrabox.examples.statemachines.test/models/StateMachineTestSuite.xmi''')
	}
	
	def static void main(String[] args) {
		val transformation = new ModelTransformation
		val uri = papyrusTestSuiteURI
		val inputResSet = new ResourceSetImpl
		val outputResSet = new ResourceSetImpl
		inputResSet.packageRegistry.put(UMLPackage::eNS_URI, UMLPackage::eINSTANCE)
		inputResSet.packageRegistry.put(StylesheetsPackage::eNS_URI, StylesheetsPackage::eINSTANCE)
		inputResSet.resourceFactoryRegistry.extensionToFactoryMap.put("uml", new XMIResourceFactoryImpl)
		outputResSet.resourceFactoryRegistry.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		val model = inputResSet.getResource(uri, true).contents.head as Model
		val testSuite = transformation.testSuiteFactory.createTestSuite
		val toTransform = model.eAllContents.filter(StateMachine).toList
		var i = 1
		for (sm : toTransform) {
			if (transformation.canTransform(sm)) {
				val res = outputResSet.createResource(sm.stateMachineURI)
				val system = transformation.apply(sm, res)
				res.save(Collections.emptyMap)
				val testCase = transformation.testSuiteFactory.createTestCase => [
					model = system
					name = res.URI.trimFileExtension.lastSegment
					scenario += transformation.eventFactory.createStateMachineRunEvent => [
						stateMachine = system.statemachine
					]
					system.events.forEach[e|
						scenario += transformation.eventFactory.createStateMachineEventOccurrenceReceivedEvent => [
							stateMachine = system.statemachine
							eventType = e
						]
					]
				]
				testSuite.testCases += testCase
				i++
			}
		}
		val testSuiteRessource = outputResSet.createResource(testSuiteURI)
		testSuiteRessource.contents += testSuite
		testSuiteRessource.save(Collections.emptyMap)
	}
}