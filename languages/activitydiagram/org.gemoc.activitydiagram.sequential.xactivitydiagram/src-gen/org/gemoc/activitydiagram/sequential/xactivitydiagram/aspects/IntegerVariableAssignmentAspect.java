package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect;

@Aspect(className = IntegerVariableAssignment.class)
@SuppressWarnings("all")
public class IntegerVariableAssignmentAspect extends VariableAssignmentAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final IntegerVariableAssignment _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "IntegerVariableAssignment", "execute");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final IntegerVariableAssignment _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties _self_, final IntegerVariableAssignment _self) {
    IntegerVariable _assignee = _self.getAssignee();
    IntegerExpression _expression = _self.getExpression();
    int _evaluate = IntegerExpressionAspect.evaluate(_expression);
    IntegerVariableAspect.currentValue(_assignee, _evaluate);
  }
}
