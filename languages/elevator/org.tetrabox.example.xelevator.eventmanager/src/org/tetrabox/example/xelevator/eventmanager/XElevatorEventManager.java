package org.tetrabox.example.xelevator.eventmanager;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import fr.inria.diverse.event.commons.interpreter.event.AbstractEventManager;
import fr.inria.diverse.event.commons.model.EventInstance;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;
import org.tetrabox.example.xelevator.aspects.ButtonAspect;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventPackage;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.XElevatorEventFactory;
import org.tetrabox.example.xelevator.scenario.xelevatorscenario.XElevatorEvent.ButtonPressEvent;
import org.tetrabox.example.xelevator.elevator.Button;

public class XElevatorEventManager extends AbstractEventManager {

	@Override
	public boolean canSendEvent(Object input) {
		if (input instanceof EventInstance) {
			final EventInstance event = (EventInstance) input;
			if (event.getOriginalEvent() instanceof ButtonPressEvent) {
				return canSendButtonPressEvent(event);
			}
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		final Set<EClass> eventClasses = new HashSet<>();
		eventClasses.add(XElevatorEventPackage.eINSTANCE.getButtonPressEvent());
		return eventClasses;
	}
	
	@Override
	protected void dispatchEvent(EventInstance event) {
		if (event.getOriginalEvent() instanceof ButtonPressEvent) {
			handleButtonPressEvent(event);
		}
	}
	
	private void handleButtonPressEvent(EventInstance event) {
		final Button target = (Button) event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
		if (ButtonAspect.notPressed((Button) target)) {
			ButtonAspect.press((Button) target);
		}
	}
	
	private boolean canSendButtonPressEvent(EventInstance event) {
		final Button target = (Button) event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
		return ButtonAspect.notPressed((Button) target);
	}
	
	@Override
	protected EventInstance rebuildEvent(Object result, Object caller, String className, String methodName) {
		return null;
	}
}
