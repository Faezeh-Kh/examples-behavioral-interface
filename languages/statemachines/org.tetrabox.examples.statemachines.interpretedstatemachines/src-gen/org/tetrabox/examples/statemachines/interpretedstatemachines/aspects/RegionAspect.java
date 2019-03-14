package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.PseudostateKind;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex;

@Aspect(className = Region.class)
@SuppressWarnings("all")
public class RegionAspect {
  protected static void enter(final Region _self, final Transition enteringTransition, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enter(Transition,EventOccurrence)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect._privk3_enter(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)_self,enteringTransition,eventOccurrence);
    };
  }
  
  protected static void exit(final Region _self, final Transition exitingTransition, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exit(Transition,EventOccurrence)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect._privk3_exit(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)_self,exitingTransition,eventOccurrence);
    };
  }
  
  protected static void terminate(final Region _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void terminate()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect._privk3_terminate(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)_self);
    };
  }
  
  protected static StateMachine getContainingStateMachine(final Region _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# StateMachine getContainingStateMachine()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect._privk3_getContainingStateMachine(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)_self);
    };
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine)result;
  }
  
  protected static Iterable<Vertex> getActiveVertice(final Region _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Iterable<Vertex> getActiveVertice()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect._privk3_getActiveVertice(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)_self);
    };
    return (java.lang.Iterable<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex>)result;
  }
  
  protected static boolean contains(final Region _self, final Vertex vertex) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean contains(Vertex)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect._privk3_contains(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)_self,vertex);
    };
    return (boolean)result;
  }
  
  protected static boolean completed(final Region _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean completed()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect._privk3_completed(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)_self);
    };
    return (boolean)result;
  }
  
  protected static void completed(final Region _self, final boolean completed) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void completed(boolean)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect._privk3_completed(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)_self,completed);
    };
  }
  
  public static Vertex currentVertex(final Region _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentVertex(_self_, _self);
	;
	return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex) result;
}
  
  public static void currentVertex(final Region _self, final Vertex currentVertex) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspectRegionAspectContext
			.getSelf(_self);
	_privk3_currentVertex(_self_, _self, currentVertex);
	;
}
  
  protected static void _privk3_enter(final RegionAspectRegionAspectProperties _self_, final Region _self, final Transition enteringTransition, final EventOccurrence eventOccurrence) {
    if (((enteringTransition == null) || (!RegionAspect.contains(_self, enteringTransition.getTarget())))) {
      final Function1<Pseudostate, Boolean> _function = (Pseudostate it) -> {
        PseudostateKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, PseudostateKind.INITIAL));
      };
      final Pseudostate initialState = IterableExtensions.<Pseudostate>findFirst(Iterables.<Pseudostate>filter(_self.getVertice(), Pseudostate.class), _function);
      if ((initialState != null)) {
        VertexAspect.enter(initialState, enteringTransition, eventOccurrence, null);
      } else {
        RegionAspect.completed(_self, true);
        if (((_self.getState() != null) && StateAspect.hasCompleted(_self.getState()))) {
          StateAspect.complete(_self.getState());
        }
      }
    }
  }
  
  protected static void _privk3_exit(final RegionAspectRegionAspectProperties _self_, final Region _self, final Transition exitingTransition, final EventOccurrence eventOccurrence) {
    final Function1<Vertex, Boolean> _function = (Vertex v) -> {
      return Boolean.valueOf(VertexAspect.isExitable(v, exitingTransition));
    };
    final Consumer<Vertex> _function_1 = (Vertex it) -> {
      VertexAspect.exit(it, exitingTransition, eventOccurrence, null);
    };
    IterableExtensions.<Vertex>filter(_self.getVertice(), _function).forEach(_function_1);
  }
  
  protected static void _privk3_terminate(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    final Consumer<Vertex> _function = (Vertex it) -> {
      VertexAspect.terminate(it);
    };
    _self.getVertice().forEach(_function);
  }
  
  protected static StateMachine _privk3_getContainingStateMachine(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    State _state = _self.getState();
    boolean _tripleNotEquals = (_state != null);
    if (_tripleNotEquals) {
      return RegionAspect.getContainingStateMachine(_self.getState().getContainer());
    }
    return _self.getStateMachine();
  }
  
  protected static Iterable<Vertex> _privk3_getActiveVertice(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    List<Vertex> _activeVertice = StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self));
    final ArrayList<Vertex> result = new ArrayList<Vertex>(_activeVertice);
    result.retainAll(_self.getVertice());
    final Function1<State, List<Vertex>> _function = (State it) -> {
      return StateAspect.getActiveVertice(it);
    };
    Iterables.<Vertex>addAll(result, Iterables.<Vertex>concat(IterableExtensions.<State, List<Vertex>>map(Iterables.<State>filter(_self.getVertice(), State.class), _function)));
    return result;
  }
  
  protected static boolean _privk3_contains(final RegionAspectRegionAspectProperties _self_, final Region _self, final Vertex vertex) {
    final Function1<Vertex, Boolean> _function = (Vertex it) -> {
      return Boolean.valueOf(VertexAspect.contains(it, vertex));
    };
    return IterableExtensions.<Vertex>exists(_self.getVertice(), _function);
  }
  
  protected static boolean _privk3_completed(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isCompleted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.completed;
  }
  
  protected static void _privk3_completed(final RegionAspectRegionAspectProperties _self_, final Region _self, final boolean completed) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCompleted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, completed);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.completed = completed;
    }
  }
  
  protected static Vertex _privk3_currentVertex(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentVertex") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentVertex;
  }
  
  protected static void _privk3_currentVertex(final RegionAspectRegionAspectProperties _self_, final Region _self, final Vertex currentVertex) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentVertex")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentVertex);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentVertex = currentVertex;
    }
  }
}
