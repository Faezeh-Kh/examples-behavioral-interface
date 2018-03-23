package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.executionframework.engine.annotations.EventHandler;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Event;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
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
  
  private static List<Transition> selectTransitions(final StateMachine _self, final CustomEvent eventType) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_selectTransitions(_self_, _self,eventType);;
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition>)result;
  }
  
  private static List<Transition> _selectTransitions(final StateMachine _self, final List<Vertex> vertice, final CustomEvent eventType) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect._privk3__selectTransitions(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine)_self,vertice,eventType);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect._privk3__selectTransitions(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine)_self,vertice,eventType);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition>)result;
  }
  
  private static List<Transition> _selectTransitions(final StateMachine _self, final Vertex vertex, final CustomEvent eventType) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect._privk3__selectTransitions(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine)_self,vertex,eventType);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect._privk3__selectTransitions(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine)_self,vertex,eventType);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition>)result;
  }
  
  private static void dispatchEventOccurrence(final StateMachine _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_dispatchEventOccurrence(_self_, _self,eventOccurrence);;
  }
  
  private static void dispatchCompletionEvents(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_dispatchCompletionEvents(_self_, _self);;
  }
  
  private static void dispatchDeferredEvents(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_dispatchDeferredEvents(_self_, _self);;
  }
  
  private static State getDeferringState(final StateMachine _self, final CustomEvent eventType) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getDeferringState(_self_, _self,eventType);;
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)result;
  }
  
  private static State _getDeferringState(final StateMachine _self, final CustomEvent eventType, final State state) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3__getDeferringState(_self_, _self,eventType,state);;
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)result;
  }
  
  @Step
  protected static void terminate(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_terminate(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self, new Object[] {_self}, command, "StateMachine", "terminate");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static List<CompletionEvent> completionEvents(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_completionEvents(_self_, _self);;
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent>)result;
  }
  
  protected static List<EventOccurrence> deferredEvents(final StateMachine _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_deferredEvents(_self_, _self);;
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence>)result;
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
    final EventOccurrence eventOccurrence = StatemachinesexecutiondataFactory.eINSTANCE.createEventOccurrence();
    eventOccurrence.setEvent(eventType);
    StateMachineAspect.dispatchEventOccurrence(_self, eventOccurrence);
  }
  
  protected static List<Transition> _privk3_selectTransitions(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final CustomEvent eventType) {
    final Function1<Region, List<Transition>> _function = (Region r) -> {
      return StateMachineAspect._selectTransitions(_self, r.getVertice(), eventType);
    };
    return IterableExtensions.<Transition>toList(Iterables.<Transition>concat(ListExtensions.<Region, List<Transition>>map(_self.getRegions(), _function)));
  }
  
  protected static List<Transition> _privk3__selectTransitions(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final List<Vertex> vertice, final CustomEvent eventType) {
    final Function1<Vertex, Boolean> _function = (Vertex v) -> {
      return Boolean.valueOf(StateMachineAspect.activeVertice(_self).contains(v));
    };
    final Function1<Vertex, List<Transition>> _function_1 = (Vertex v) -> {
      return StateMachineAspect._selectTransitions(_self, v, eventType);
    };
    return IterableExtensions.<Transition>toList(Iterables.<Transition>concat(IterableExtensions.<Vertex, List<Transition>>map(IterableExtensions.<Vertex>filter(vertice, _function), _function_1)));
  }
  
  protected static List<Transition> _privk3__selectTransitions(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Vertex vertex, final CustomEvent eventType) {
    final ArrayList<Transition> transitions = new ArrayList<Transition>();
    if ((vertex instanceof State)) {
      EList<Region> _regions = ((State)vertex).getRegions();
      boolean _tripleNotEquals = (_regions != null);
      if (_tripleNotEquals) {
        final Function1<Region, List<Transition>> _function = (Region r) -> {
          return StateMachineAspect._selectTransitions(_self, r.getVertice(), eventType);
        };
        Iterables.<Transition>addAll(transitions, Iterables.<Transition>concat(ListExtensions.<Region, List<Transition>>map(((State)vertex).getRegions(), _function)));
      }
    }
    boolean _isEmpty = transitions.isEmpty();
    if (_isEmpty) {
      final Function1<Transition, Boolean> _function_1 = (Transition t) -> {
        final Function1<Trigger, Boolean> _function_2 = (Trigger it) -> {
          Event _event = it.getEvent();
          return Boolean.valueOf(Objects.equal(_event, eventType));
        };
        return Boolean.valueOf(IterableExtensions.<Trigger>exists(t.getTriggers(), _function_2));
      };
      Iterables.<Transition>addAll(transitions, IterableExtensions.<Transition>filter(vertex.getOutgoingTransitions(), _function_1));
      int _size = transitions.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        final Transition electedTransition = IterableExtensions.<Transition>head(transitions);
        transitions.clear();
        transitions.add(electedTransition);
      }
    }
    return transitions;
  }
  
  protected static void _privk3_dispatchEventOccurrence(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EventOccurrence eventOccurrence) {
    final CustomEvent eventType = eventOccurrence.getEvent();
    final State deferringState = StateMachineAspect.getDeferringState(_self, eventType);
    if ((deferringState == null)) {
      final Consumer<Transition> _function = (Transition t) -> {
        TransitionAspect.fire(t, eventOccurrence);
      };
      StateMachineAspect.selectTransitions(_self, eventType).forEach(_function);
      StateMachineAspect.dispatchCompletionEvents(_self);
      StateMachineAspect.dispatchDeferredEvents(_self);
    } else {
      StateAspect.deferredEvents(deferringState).add(eventOccurrence);
    }
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
  
  protected static void _privk3_dispatchDeferredEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    List<EventOccurrence> _deferredEvents = StateMachineAspect.deferredEvents(_self);
    final ArrayList<EventOccurrence> toDispatch = new ArrayList<EventOccurrence>(_deferredEvents);
    StateMachineAspect.deferredEvents(_self).clear();
    final Consumer<EventOccurrence> _function = (EventOccurrence eventOccurrence) -> {
      StateMachineAspect.dispatchEventOccurrence(_self, eventOccurrence);
    };
    toDispatch.forEach(_function);
  }
  
  protected static State _privk3_getDeferringState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final CustomEvent eventType) {
    final Function1<Region, EList<Vertex>> _function = (Region it) -> {
      return it.getVertice();
    };
    final Function1<State, Boolean> _function_1 = (State s) -> {
      return Boolean.valueOf(StateMachineAspect.activeVertice(_self).contains(s));
    };
    final Function1<State, State> _function_2 = (State s) -> {
      return StateMachineAspect._getDeferringState(_self, eventType, s);
    };
    return IterableExtensions.<State>head(IterableExtensions.<State>filterNull(IterableExtensions.<State, State>map(IterableExtensions.<State>filter(Iterables.<State>filter(Iterables.<Vertex>concat(ListExtensions.<Region, EList<Vertex>>map(_self.getRegions(), _function)), State.class), _function_1), _function_2)));
  }
  
  protected static State _privk3__getDeferringState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final CustomEvent eventType, final State state) {
    final Function1<Region, EList<Vertex>> _function = (Region it) -> {
      return it.getVertice();
    };
    final Function1<State, Boolean> _function_1 = (State s) -> {
      return Boolean.valueOf(StateMachineAspect.activeVertice(_self).contains(s));
    };
    final Function1<State, State> _function_2 = (State s) -> {
      return StateMachineAspect._getDeferringState(_self, eventType, s);
    };
    State deferred = IterableExtensions.<State>head(IterableExtensions.<State>filterNull(IterableExtensions.<State, State>map(IterableExtensions.<State>filter(Iterables.<State>filter(Iterables.<Vertex>concat(ListExtensions.<Region, EList<Vertex>>map(state.getRegions(), _function)), State.class), _function_1), _function_2)));
    if (((deferred == null) && StateAspect.canDefer(state, eventType))) {
      boolean _isEmpty = StateMachineAspect._selectTransitions(_self, state, eventType).isEmpty();
      if (_isEmpty) {
        deferred = state;
      }
    }
    return deferred;
  }
  
  protected static void _privk3_terminate(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    final Consumer<Region> _function = (Region it) -> {
      RegionAspect.terminate(it);
    };
    _self.getRegions().forEach(_function);
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
  
  protected static List<EventOccurrence> _privk3_deferredEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDeferredEvents") &&
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
    return _self_.deferredEvents;
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
