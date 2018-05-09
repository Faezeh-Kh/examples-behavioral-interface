package org.tetrabox.examples.statemachines.test

import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.gemoc.executionframework.event.model.event.EventPackage
import org.eclipse.gemoc.executionframework.event.testsuite.TestSuite
import org.eclipse.gemoc.executionframework.event.testsuite.TestsuiteFactory
import org.eclipse.gemoc.executionframework.event.testsuite.TestsuitePackage
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StylesheetsPackage
import org.eclipse.uml2.types.TypesPackage
import org.eclipse.uml2.uml.Behavior
import org.eclipse.uml2.uml.CallEvent
import org.eclipse.uml2.uml.Event
import org.eclipse.uml2.uml.FinalState
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.ParameterDirectionKind
import org.eclipse.uml2.uml.Pseudostate
import org.eclipse.uml2.uml.Region
import org.eclipse.uml2.uml.Signal
import org.eclipse.uml2.uml.SignalEvent
import org.eclipse.uml2.uml.State
import org.eclipse.uml2.uml.StateMachine
import org.eclipse.uml2.uml.Transition
import org.eclipse.uml2.uml.Trigger
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.Vertex
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventFactory
import org.tetrabox.examples.statemachines.interpretedstatemachines.event.interpretedstatemachinesevent.InterpretedstatemachineseventPackage
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttribute
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventType
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.PseudostateKind
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.TransitionKind
import org.eclipse.uml2.uml.Parameter

class ModelTransformation {
	
	private val factory = StatemachinesFactory::eINSTANCE
	private val testSuiteFactory = TestsuiteFactory::eINSTANCE
	private val eventFactory = InterpretedstatemachineseventFactory::eINSTANCE
	
	private val regionTraceability = new HashMap<Region, org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region>
	private val vertexTraceability = new HashMap<Vertex, org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex>
	private val eventTraceability = new HashMap<Event, EventType>
	private val signalTraceability = new HashMap<Signal, org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal>
	private val operationTraceability = new HashMap<Operation, org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation>
	
	private var CustomSystem system = null
	
	def CustomSystem apply(StateMachine stateMachine, Resource resource) {
		regionTraceability.clear
		vertexTraceability.clear
		eventTraceability.clear
		signalTraceability.clear
		operationTraceability.clear
		system = factory.createCustomSystem
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
			o instanceof Pseudostate && (
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.DEEP_HISTORY_LITERAL ||
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.CHOICE_LITERAL ||
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.JUNCTION_LITERAL ||
				(o as Pseudostate).kind == org.eclipse.uml2.uml.PseudostateKind.SHALLOW_HISTORY_LITERAL)
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region transformRegion(Region region) {
		val result = factory.createRegion => [
			name = region.name
			vertice.addAll(region.subvertices.map[transformVertex])
		]
		regionTraceability.put(region, result)
		return result
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex transformVertex(Vertex vertex) {
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
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate transformPseudostate(Pseudostate pseudostate) {
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
				case ENTRY_POINT_LITERAL: {
					PseudostateKind.ENTRYPOINT
				}
				case EXIT_POINT_LITERAL: {
					PseudostateKind.EXITPOINT
				}
				default: {
				}
			}
			name = pseudostate.name
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState transformFinalState(FinalState finalState) {
		factory.createFinalState => [
			name = finalState.name
			regions.addAll(finalState.regions.map[transformRegion])
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State transformState(State state) {
		factory.createState => [
			name = state.name
			entry = state.entry.transformBehavior
			doActivity = state.doActivity.transformBehavior
			exit = state.exit.transformBehavior
			deferrableTriggers.addAll(state.deferrableTriggers.map[transformTrigger])
			regions.addAll(state.regions.map[transformRegion])
			connectionPoint.addAll(state.connectionPoints.map[transformVertex as org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate])
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition transformTransition(Transition transition) {
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
			transition.guard
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Trigger transformTrigger(Trigger trigger) {
		val event = trigger.event
		factory.createTrigger => [
			name = trigger.name
			if (event instanceof SignalEvent) {
				eventType = event.transformSignalEvent
			} else if (event instanceof CallEvent) {
				eventType = event.transformCallEvent
			} else {
				println(event)
			}
		]
	}
	
	def SignalEventType transformSignalEvent(SignalEvent signalEvent) {
		factory.createSignalEventType => [
			signal = signalTraceability.computeIfAbsent(signalEvent.signal, [s|s.transformSignal])
		]
	}
	
	def CallEventType transformCallEvent(CallEvent callEvent) {
		factory.createCallEventType => [
			operation = operationTraceability.computeIfAbsent(callEvent.operation, [o|o.transformOperation])
		]
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal transformSignal(Signal signal) {
		val result = factory.createSignal => [
			name = signal.name
			attributes.addAll(signal.ownedAttributes.map[a|
				val s = a.type.toString
				if (s.contains("eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Boolean")) {
					factory.createBooleanAttribute => [
						name = a.name
					]
				} else if (s.contains("eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer")) {
					factory.createIntegerAttribute => [
						name = a.name
					]
				}
			])
		]
		system.signals.add(result)
		return result
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation transformOperation(Operation operation) {
		val result = factory.createOperation => [
			name = operation.name
			val parameters = operation.ownedParameters
			if (parameters !== null && !parameters.empty) {
				inParameters.addAll(parameters.filter[p|p.direction == ParameterDirectionKind.IN_LITERAL]
						.map[p|p.transformParameter].filterNull)
				outParameters.addAll(parameters.filter[p|p.direction == ParameterDirectionKind.OUT_LITERAL]
						.map[p|p.transformParameter].filterNull)
				^return = parameters.findFirst[p|p.direction == ParameterDirectionKind.RETURN_LITERAL].transformParameter
			}
			
		]
		system.operations.add(result)
		return result
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute transformParameter(Parameter parameter) {
		if (parameter !== null) {
			val s = parameter.type.toString
			if (s.contains("eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Boolean")) {
				factory.createBooleanAttribute => [
					name = parameter.name
				]
			} else if (s.contains("eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer")) {
				factory.createIntegerAttribute => [
					name = parameter.name
				]
			}
		} else {
			null
		}
	}
	
	def org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior transformBehavior(Behavior behavior) {
		if (behavior !== null) {
			factory.createBehavior => [
				name = behavior.name
			]
		} else {
			null
		}
	}
	
	def Package getPackage(EObject object) {
		if (!(object instanceof Package)) {
			var container = object.eContainer
			while (!(container instanceof Package)) {
				container = container.eContainer
			}
			return container as Package
		}
		return object as Package
	}
	
	def static URI getPapyrusTestSuiteURI() {
		URI::createFileURI("/home/dorian/Downloads/gemoc-studio-event-emitter-2/workspace/papyrus-test-suite/PSSM_TestSuite.uml")
	}
	
	def static URI getStateMachineURI(StateMachine stateMachine) {
		URI::createFileURI('''/home/dorian/git/examples-behavioral-interface/test/statemachines/org.tetrabox.examples.statemachines.test/models/«stateMachine.name».xmi''')
	}
	
	def static URI getTestSuiteURI() {
		URI::createFileURI('''/home/dorian/git/examples-behavioral-interface/test/statemachines/org.tetrabox.examples.statemachines.test/models/StateMachineTestSuite.xmi''')
	}
	
	def static URI getActualTestSuiteURI() {
		URI::createFileURI('''/home/dorian/git/examples-behavioral-interface/test/statemachines/org.tetrabox.examples.statemachines.test/models/ActualStateMachineTestSuite.xmi''')
	}
	
	def static void parsePreviousTestSuite(Map<String, String> expectedTraces, Map<String, List<org.eclipse.gemoc.executionframework.event.model.event.Event>> events) {
		val rs = new ResourceSetImpl
		val p1 = TestsuitePackage.eINSTANCE
		val p2 = EventPackage.eINSTANCE
		val p3 = InterpretedstatemachineseventPackage.eINSTANCE
		rs.getPackageRegistry().put(p1.getNsURI(), p1);
		rs.getPackageRegistry().put(p2.getNsURI(), p2);
		rs.getPackageRegistry().put(p3.getNsURI(), p3);
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		val res = rs.getResource(actualTestSuiteURI, true)
		val ts = res.contents.head as TestSuite
		ts.testCases.forEach[c|
			expectedTraces.put(c.name, c.expectedTrace)
			events.put(c.name, new ArrayList(c.scenario.toArray))
		]
	}
	
	def static void main(String[] args) {
//		val traces = new HashMap<String, String>
//		val events = new HashMap<String, List<org.eclipse.gemoc.executionframework.event.model.event.Event>>
//		ModelTransformation.parsePreviousTestSuite(traces, events)
		val transformation = new ModelTransformation
		val uri = papyrusTestSuiteURI
		val inputResSet = new ResourceSetImpl
		val outputResSet = new ResourceSetImpl
		inputResSet.packageRegistry.put(UMLPackage::eNS_URI, UMLPackage::eINSTANCE)
		inputResSet.packageRegistry.put(TypesPackage::eNS_URI, TypesPackage::eINSTANCE)
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
				println("saved!")
				val testCase = transformation.testSuiteFactory.createTestCase => [
					model = system
					name = res.URI.trimFileExtension.lastSegment
//					expectedTrace = traces.get(name)
//					if (events.get(name) !== null) {
//						events.get(name).forEach[evt|
//							if (evt instanceof StateMachineRunEvent) {
//								scenario += transformation.eventFactory.createStateMachineRunEvent => [
//									stateMachine = system.statemachine
//								]
//							} else if (evt instanceof StateMachineEventOccurrenceReceivedEvent) {
//								scenario += transformation.eventFactory.createStateMachineEventOccurrenceReceivedEvent => [
//									stateMachine = system.statemachine
//									event = transformation.systemFactory.createSignalEventOccurrence => [
//										eventType = evt.event.eventType
//									]
//								]
//							}
//						]
//					} else {
					scenario += transformation.eventFactory.createStateMachineRunEvent => [
						stateMachine = system.statemachine
					]
					system.signals.forEach[s|
						scenario += transformation.eventFactory.createStateMachineEventOccurrenceReceivedEvent => [
							stateMachine = system.statemachine
							event = transformation.factory.createSignalEventOccurrence => [
								signal = s
								attributeValues.addAll(s.attributes.map[a|
									if (a instanceof BooleanAttribute) {
										transformation.factory.createBooleanAttributeValue => [
											attribute = a
										]
									} else if (a instanceof IntegerAttribute) {
										transformation.factory.createIntegerAttributeValue => [
											attribute = a
										]
									}
								])
							]
						]
					]
					system.operations.forEach[o|
						scenario += transformation.eventFactory.createStateMachineEventOccurrenceReceivedEvent => [
							stateMachine = system.statemachine
							event = transformation.factory.createCallEventOccurrence => [
								operation = o
								inParameterValues.addAll(o.inParameters.map[p|
									if (p instanceof BooleanAttribute) {
										transformation.factory.createBooleanAttributeValue => [
											attribute = p
										]
									} else if (p instanceof IntegerAttribute) {
										transformation.factory.createIntegerAttributeValue => [
											attribute = p
										]
									}
								])
								outParameterValues.addAll(o.outParameters.map[p|
									if (p instanceof BooleanAttribute) {
										transformation.factory.createBooleanAttributeValue => [
											attribute = p
										]
									} else if (p instanceof IntegerAttribute) {
										transformation.factory.createIntegerAttributeValue => [
											attribute = p
										]
									}
								])
								val r = o.^return
								returnValue = if (r instanceof BooleanAttribute) {
										transformation.factory.createBooleanAttributeValue => [
											attribute = r
										]
									} else if (r instanceof IntegerAttribute) {
										transformation.factory.createIntegerAttributeValue => [
											attribute = r
										]
									}
							]
						]
					]
//					}
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