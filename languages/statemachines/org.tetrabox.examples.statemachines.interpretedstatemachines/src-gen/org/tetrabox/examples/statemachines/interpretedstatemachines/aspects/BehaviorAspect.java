package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspectBehaviorAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.NamedElement;

@Aspect(className = Behavior.class)
@SuppressWarnings("all")
public class BehaviorAspect {
  @Step
  protected static void execute(final Behavior _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspectBehaviorAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspectBehaviorAspectContext.getSelf(_self);
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspect#void execute(EventOccurrence) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior){
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspect.execute((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior)_self,eventOccurrence);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspect#void execute(EventOccurrence) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspect
    // #DispatchPointCut_before# void execute(EventOccurrence)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.BehaviorAspect._privk3_execute(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior)_self,eventOccurrence);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {eventOccurrence}, command, "Behavior", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_execute(final BehaviorAspectBehaviorAspectProperties _self_, final Behavior _self, final EventOccurrence eventOccurrence) {
    EObject _eContainer = _self.eContainer();
    String _name = ((NamedElement) _eContainer).getName();
    String _plus = (_name + 
      "(");
    String _name_1 = _self.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + ")");
    String _xifexpression = null;
    if ((eventOccurrence != null)) {
      _xifexpression = EventOccurrenceAspect.getParameters(eventOccurrence);
    } else {
      _xifexpression = "";
    }
    String _plus_3 = (_plus_2 + _xifexpression);
    InputOutput.<String>println(_plus_3);
  }
}
