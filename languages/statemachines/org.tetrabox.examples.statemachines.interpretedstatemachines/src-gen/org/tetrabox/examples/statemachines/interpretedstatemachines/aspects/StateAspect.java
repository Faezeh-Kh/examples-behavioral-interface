package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.PseudostateKind;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect extends VertexAspect {
  @OverrideAspectMethod
  public static void enter(final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState) {
		org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspect.enter(
				(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState) _self,
				enteringTransition, eventOccurrence, leastCommonAncestor);
	} else if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) {
		org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_enter(_self_,
				(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) _self,
				enteringTransition, eventOccurrence, leastCommonAncestor);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @OverrideAspectMethod
  public static void exit(final State _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_exit(_self_, _self, exitingTransition, eventOccurrence, leastCommonAncestor);
	;
}
  
  public static void enterRegions(final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_enterRegions(_self_, _self, enteringTransition, eventOccurrence);
	;
}
  
  @OverrideAspectMethod
  public static void terminate(final State _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_terminate(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  protected static boolean isEnterable(final State _self, final Transition enteringTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_isEnterable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self,enteringTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.isEnterable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,enteringTransition);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  protected static boolean isExitable(final State _self, final Transition exitingTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_isExitable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self,exitingTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.isExitable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,exitingTransition);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static boolean isActive(final State _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isActive(_self_, _self);;
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  protected static boolean contains(final State _self, final Vertex vertex) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_contains(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self,vertex);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.contains((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,vertex);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  public static List<Vertex> getActiveVertice(final State _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getActiveVertice(_self_, _self);
	;
	return (java.util.List) result;
}
  
  public static boolean hasCompleted(final State _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasCompleted(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void complete(final State _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_complete(_self_, _self);
	;
}
  
  private static void super_enter(final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_enter(_self_, _self,enteringTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_enter(final StateAspectStateAspectProperties _self_, final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    boolean _isActive = StateAspect.isActive(_self);
    boolean _not = (!_isActive);
    if (_not) {
      StateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
      boolean _hasCompleted = StateAspect.hasCompleted(_self);
      if (_hasCompleted) {
        StateAspect.complete(_self);
      } else {
        StateAspect.enterRegions(_self, enteringTransition, eventOccurrence);
      }
    }
  }
  
  private static void super_exit(final State _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_exit(_self_, _self,exitingTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_exit(final StateAspectStateAspectProperties _self_, final State _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final Consumer<Region> _function = (Region r) -> {
      RegionAspect.exit(r, exitingTransition, eventOccurrence);
    };
    _self.getRegions().forEach(_function);
    StateAspect.super_exit(_self, exitingTransition, eventOccurrence, leastCommonAncestor);
  }
  
  protected static void _privk3_enterRegions(final StateAspectStateAspectProperties _self_, final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence) {
    final ArrayList<Vertex> targetedVertice = new ArrayList<Vertex>();
    final Vertex source = enteringTransition.getSource();
    if (((source instanceof Pseudostate) && Objects.equal(((Pseudostate) source).getKind(), PseudostateKind.FORK))) {
      final Function1<Transition, Vertex> _function = (Transition it) -> {
        return it.getTarget();
      };
      targetedVertice.addAll(ListExtensions.<Transition, Vertex>map(source.getOutgoingTransitions(), _function));
    } else {
      targetedVertice.add(enteringTransition.getTarget());
    }
    final Function1<Region, Boolean> _function_1 = (Region r) -> {
      EList<Vertex> _vertice = r.getVertice();
      final ArrayList<Vertex> vertice = new ArrayList<Vertex>(_vertice);
      vertice.retainAll(targetedVertice);
      return Boolean.valueOf(vertice.isEmpty());
    };
    final Consumer<Region> _function_2 = (Region it) -> {
      RegionAspect.enter(it, enteringTransition, eventOccurrence);
    };
    IterableExtensions.<Region>filter(_self.getRegions(), _function_1).forEach(_function_2);
  }
  
  private static void super_terminate(final State _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_terminate(_self_, _self);
  }
  
  protected static void _privk3_terminate(final StateAspectStateAspectProperties _self_, final State _self) {
    final Consumer<Region> _function = (Region it) -> {
      RegionAspect.terminate(it);
    };
    _self.getRegions().forEach(_function);
  }
  
  private static boolean super_isEnterable(final State _self, final Transition enteringTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isEnterable(_self_, _self,enteringTransition);
  }
  
  protected static boolean _privk3_isEnterable(final StateAspectStateAspectProperties _self_, final State _self, final Transition enteringTransition) {
    boolean _isActive = StateAspect.isActive(_self);
    return (!_isActive);
  }
  
  private static boolean super_isExitable(final State _self, final Transition exitingTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isExitable(_self_, _self,exitingTransition);
  }
  
  protected static boolean _privk3_isExitable(final StateAspectStateAspectProperties _self_, final State _self, final Transition exitingTransition) {
    return StateAspect.isActive(_self);
  }
  
  protected static boolean _privk3_isActive(final StateAspectStateAspectProperties _self_, final State _self) {
    return StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self.getContainer())).contains(_self);
  }
  
  private static boolean super_contains(final State _self, final Vertex vertex) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_contains(_self_, _self,vertex);
  }
  
  protected static boolean _privk3_contains(final StateAspectStateAspectProperties _self_, final State _self, final Vertex vertex) {
    boolean _equals = Objects.equal(_self, vertex);
    if (_equals) {
      return true;
    } else {
      final Function1<Region, Boolean> _function = (Region it) -> {
        return Boolean.valueOf(RegionAspect.contains(it, vertex));
      };
      return IterableExtensions.<Region>exists(_self.getRegions(), _function);
    }
  }
  
  protected static List<Vertex> _privk3_getActiveVertice(final StateAspectStateAspectProperties _self_, final State _self) {
    final Function1<Region, Iterable<Vertex>> _function = (Region it) -> {
      return RegionAspect.getActiveVertice(it);
    };
    return IterableExtensions.<Vertex>toList(Iterables.<Vertex>concat(ListExtensions.<Region, Iterable<Vertex>>map(_self.getRegions(), _function)));
  }
  
  protected static boolean _privk3_hasCompleted(final StateAspectStateAspectProperties _self_, final State _self) {
    final Function1<Region, Boolean> _function = (Region it) -> {
      return Boolean.valueOf(RegionAspect.completed(it));
    };
    return IterableExtensions.<Region>forall(_self.getRegions(), _function);
  }
  
  protected static void _privk3_complete(final StateAspectStateAspectProperties _self_, final State _self) {
    CompletionEvent _createCompletionEvent = AlmostumlFactory.eINSTANCE.createCompletionEvent();
    final Procedure1<CompletionEvent> _function = (CompletionEvent it) -> {
      it.setState(_self);
    };
    final CompletionEvent event = ObjectExtensions.<CompletionEvent>operator_doubleArrow(_createCompletionEvent, _function);
    StateMachineAspect.completionEvents(RegionAspect.getContainingStateMachine(_self.getContainer())).add(0, event);
  }
}
