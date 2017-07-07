package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignmentAspect {
  @Step
  public static void execute(final VariableAssignment _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAssignmentAspect.execute(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspect.execute(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect._privk3_execute(
						_self_,
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "VariableAssignment", "execute");
		} else {
			fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_execute(final VariableAssignmentAspectVariableAssignmentAspectProperties _self_, final VariableAssignment _self) {
  }
}
