BehavioralInterface InterpretedStateMachinesSignature
	accepted event run:
		parameters = [state_machine: org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine]
	accepted event signal_received:
		parameters = [state_machine: org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine, signal_occurrence: org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence]
	exposed event signal_sent:
		parameters = [signal_occurrence: org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence]
