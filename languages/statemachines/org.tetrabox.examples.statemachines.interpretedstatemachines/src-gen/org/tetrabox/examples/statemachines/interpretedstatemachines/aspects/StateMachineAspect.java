package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.executionframework.engine.annotations.EventHandler;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Event;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.StatemachinesexecutiondataFactory;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Step
  @EventHandler
  public static void run(final StateMachine _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_run(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "StateMachine", "run");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  @EventHandler
  public static void eventOccurrenceReceived(final StateMachine _self, final CustomEvent eventType) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_eventOccurrenceReceived(_self_, _self, eventType);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "StateMachine", "eventOccurrenceReceived");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void dispatchCompletionEvents(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_dispatchCompletionEvents(_self_, _self);;
  }
  
  @Step
  public static void terminate(final StateMachine _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_terminate(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "StateMachine", "terminate");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static List<CompletionEvent> completionEvents(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_completionEvents(_self_, _self);;
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent>)result;
  }
  
  protected static List<Vertex> activeVertice(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_activeVertice(_self_, _self);;
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex>)result;
  }
  
  protected static void _privk3_run(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    final Consumer<Region> _function = (Region it) -> {
      RegionAspect.enter(it, null, null);
    };
    _self.getRegions().forEach(_function);
    StateMachineAspect.dispatchCompletionEvents(_self);
  }
  
  protected static void _privk3_eventOccurrenceReceived(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final CustomEvent eventType) {
    final Function1<Region, Iterable<Vertex>> _function = (Region it) -> {
      return RegionAspect.getActiveVertice(it);
    };
    final Function1<Vertex, EList<Transition>> _function_1 = (Vertex it) -> {
      return it.getOutgoingTransitions();
    };
    final Function1<Transition, Boolean> _function_2 = (Transition t) -> {
      final Function1<Trigger, Boolean> _function_3 = (Trigger it) -> {
        Event _event = it.getEvent();
        return Boolean.valueOf(Objects.equal(_event, eventType));
      };
      return Boolean.valueOf(IterableExtensions.<Trigger>exists(t.getTriggers(), _function_3));
    };
    final Transition transition = IterableExtensions.<Transition>head(IterableExtensions.<Transition>filter(Iterables.<Transition>concat(IterableExtensions.<Vertex, EList<Transition>>map(Iterables.<Vertex>concat(ListExtensions.<Region, Iterable<Vertex>>map(_self.getRegions(), _function)), _function_1)), _function_2));
    if ((transition != null)) {
      final EventOccurrence eventOccurrence = StatemachinesexecutiondataFactory.eINSTANCE.createEventOccurrence();
      eventOccurrence.setEvent(eventType);
      TransitionAspect.fire(transition, eventOccurrence);
    }
    StateMachineAspect.dispatchCompletionEvents(_self);
  }
  
  protected static void _privk3_dispatchCompletionEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    while ((!StateMachineAspect.completionEvents(_self).isEmpty())) {
      {
        final CompletionEvent event = StateMachineAspect.completionEvents(_self).remove(0);
        final Function1<Transition, Boolean> _function = (Transition it) -> {
          return Boolean.valueOf(((it.getTriggers() == null) || it.getTriggers().isEmpty()));
        };
        final Transition transition = IterableExtensions.<Transition>head(IterableExtensions.<Transition>filter(event.getState().getOutgoingTransitions(), _function));
        if ((transition != null)) {
          TransitionAspect.fire(transition, null);
        }
      }
    }
  }
  
  protected static void _privk3_terminate(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    final Consumer<Region> _function = (Region it) -> {
      RegionAspect.terminate(it);
    };
    _self.getRegions().forEach(_function);
    Thread.currentThread().destroy();
  }
  
  protected static List<CompletionEvent> _privk3_completionEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCompletionEvents") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.completionEvents;
  }
  
  protected static List<Vertex> _privk3_activeVertice(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getActiveVertice") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.activeVertice;
  }
}
