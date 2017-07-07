package org.gemoc.activitydiagram.sequential.xactivitydiagram.eventmanager;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import fr.inria.diverse.event.commons.interpreter.event.AbstractEventManager;
import fr.inria.diverse.event.commons.model.EventInstance;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.AcceptEventActionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.XActivityDiagramEventFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.scenario.xactivitydiagramscenario.XActivityDiagramEvent.AcceptEventActionAcceptEvent;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.AcceptEventAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Event;

public class XActivityDiagramEventManager extends AbstractEventManager {

	@Override
	public boolean canSendEvent(Object input) {
		if (input instanceof EventInstance) {
			final EventInstance event = (EventInstance) input;
			if (event.getOriginalEvent() instanceof AcceptEventActionAcceptEvent) {
				return canSendAcceptEventActionAcceptEvent(event);
			}
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		final Set<EClass> eventClasses = new HashSet<>();
		eventClasses.add(XActivityDiagramEventPackage.eINSTANCE.getAcceptEventActionAcceptEvent());
		return eventClasses;
	}
	
	@Override
	protected void dispatchEvent(EventInstance event) {
		if (event.getOriginalEvent() instanceof AcceptEventActionAcceptEvent) {
			handleAcceptEventActionAcceptEvent(event);
		}
	}
	
	private void handleAcceptEventActionAcceptEvent(EventInstance _event) {
		final AcceptEventAction target = (AcceptEventAction) _event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
		final Event event = (Event) _event.getParameters().get(_event.getOriginalEvent().eClass().getEStructuralFeatures().get(0));
		if (AcceptEventActionAspect.canAccept((AcceptEventAction) target, (Event) event)) {
			AcceptEventActionAspect.accept((AcceptEventAction) target, (Event) event);
		}
	}
	
	private boolean canSendAcceptEventActionAcceptEvent(EventInstance _event) {
		final AcceptEventAction target = (AcceptEventAction) _event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
		final Event event = (Event) _event.getParameters().get(_event.getOriginalEvent().eClass().getEStructuralFeatures().get(0));
		return AcceptEventActionAspect.canAccept((AcceptEventAction) target, (Event) event);
	}
	
	@Override
	protected EventInstance rebuildEvent(Object result, Object caller, String className, String methodName) {
		return null;
	}
}
