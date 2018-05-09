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
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.EventOccurrenceAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.OperationBehaviorAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventType;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.PseudostateKind;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect extends VertexAspect {
  @OverrideAspectMethod
  protected static void enter(final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_enter(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  protected static void exit(final State _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_exit(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.exit((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void enterRegions(final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_enterRegions(_self_, _self,enteringTransition,eventOccurrence);;
  }
  
  private static void tryExecuteEntry(final State _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_tryExecuteEntry(_self_, _self,eventOccurrence);;
  }
  
  private static void tryExecuteDoActivity(final State _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_tryExecuteDoActivity(_self_, _self,eventOccurrence);;
  }
  
  private static void tryExecuteExit(final State _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_tryExecuteExit(_self_, _self,eventOccurrence);;
  }
  
  @OverrideAspectMethod
  protected static void terminate(final State _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_terminate(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.terminate((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  protected static boolean isEnterable(final State _self, final Transition enteringTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_isEnterable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,enteringTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.isEnterable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,enteringTransition);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  protected static boolean isExitable(final State _self, final Transition exitingTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_isExitable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,exitingTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.isExitable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,exitingTransition);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  protected static boolean contains(final State _self, final Vertex vertex) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_contains(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,vertex);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.contains((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,vertex);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean canDefer(final State _self, final EventOccurrence eventOccurrence) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_canDefer(_self_, _self,eventOccurrence);;
    return (boolean)result;
  }
  
  protected static List<Vertex> getActiveVertice(final State _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getActiveVertice(_self_, _self);;
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex>)result;
  }
  
  protected static boolean hasCompleted(final State _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_hasCompleted(_self_, _self);;
    return (boolean)result;
  }
  
  protected static void complete(final State _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_complete(_self_, _self);;
  }
  
  public static boolean isEntryCompleted(final State _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isEntryCompleted(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void isEntryCompleted(final State _self, final boolean isEntryCompleted) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_isEntryCompleted(_self_, _self, isEntryCompleted);
	;
}
  
  public static boolean isDoActivityCompleted(final State _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isDoActivityCompleted(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void isDoActivityCompleted(final State _self, final boolean isDoActivityCompleted) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_isDoActivityCompleted(_self_, _self, isDoActivityCompleted);
	;
}
  
  public static boolean isExitCompleted(final State _self) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isExitCompleted(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void isExitCompleted(final State _self, final boolean isExitCompleted) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_isExitCompleted(_self_, _self, isExitCompleted);
	;
}
  
  protected static List<EventOccurrence> deferredEvents(final State _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_deferredEvents(_self_, _self);;
    return (java.util.List<org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence>)result;
  }
  
  protected static void deferredEvents(final State _self, final List<EventOccurrence> deferredEvents) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_deferredEvents(_self_, _self,deferredEvents);;
  }
  
  private static void super_enter(final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_enter(_self_, _self,enteringTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_enter(final StateAspectStateAspectProperties _self_, final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    boolean _isActive = VertexAspect.isActive(_self);
    boolean _not = (!_isActive);
    if (_not) {
      StateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
      Behavior _entry = _self.getEntry();
      boolean _tripleEquals = (_entry == null);
      StateAspect.isEntryCompleted(_self, _tripleEquals);
      Behavior _doActivity = _self.getDoActivity();
      boolean _tripleEquals_1 = (_doActivity == null);
      StateAspect.isDoActivityCompleted(_self, _tripleEquals_1);
      Behavior _exit = _self.getExit();
      boolean _tripleEquals_2 = (_exit == null);
      StateAspect.isExitCompleted(_self, _tripleEquals_2);
      boolean _hasCompleted = StateAspect.hasCompleted(_self);
      if (_hasCompleted) {
        StateAspect.complete(_self);
      } else {
        StateAspect.tryExecuteEntry(_self, eventOccurrence);
        StateAspect.tryExecuteDoActivity(_self, eventOccurrence);
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
    StateAspect.tryExecuteExit(_self, eventOccurrence);
    StateAspect.super_exit(_self, exitingTransition, eventOccurrence, leastCommonAncestor);
    StateMachineAspect.deferredEvents(RegionAspect.getContainingStateMachine(_self.getContainer())).addAll(StateAspect.deferredEvents(_self));
  }
  
  protected static void _privk3_enterRegions(final StateAspectStateAspectProperties _self_, final State _self, final Transition enteringTransition, final EventOccurrence eventOccurrence) {
    final ArrayList<Vertex> targetedVertice = new ArrayList<Vertex>();
    final Vertex source = enteringTransition.getSource();
    final Vertex target = enteringTransition.getTarget();
    if (((source instanceof Pseudostate) && Objects.equal(((Pseudostate) source).getKind(), PseudostateKind.FORK))) {
      final Function1<Transition, Vertex> _function = (Transition t) -> {
        return t.getTarget();
      };
      targetedVertice.addAll(ListExtensions.<Transition, Vertex>map(source.getOutgoingTransitions(), _function));
    } else {
      targetedVertice.add(enteringTransition.getTarget());
    }
    if (((target instanceof Pseudostate) && Objects.equal(((Pseudostate) target).getKind(), PseudostateKind.ENTRYPOINT))) {
      final Function1<Transition, Vertex> _function_1 = (Transition t) -> {
        return t.getTarget();
      };
      targetedVertice.addAll(ListExtensions.<Transition, Vertex>map(target.getOutgoingTransitions(), _function_1));
    }
    final Function1<Region, Boolean> _function_2 = (Region r) -> {
      EList<Vertex> _vertice = r.getVertice();
      final ArrayList<Vertex> vertice = new ArrayList<Vertex>(_vertice);
      vertice.retainAll(targetedVertice);
      return Boolean.valueOf(vertice.isEmpty());
    };
    final Consumer<Region> _function_3 = (Region it) -> {
      RegionAspect.enter(it, enteringTransition, eventOccurrence);
    };
    IterableExtensions.<Region>filter(_self.getRegions(), _function_2).forEach(_function_3);
  }
  
  protected static void _privk3_tryExecuteEntry(final StateAspectStateAspectProperties _self_, final State _self, final EventOccurrence eventOccurrence) {
    boolean _isEntryCompleted = StateAspect.isEntryCompleted(_self);
    boolean _not = (!_isEntryCompleted);
    if (_not) {
      Behavior _entry = _self.getEntry();
      if ((_entry instanceof OperationBehavior)) {
        Behavior _entry_1 = _self.getEntry();
        OperationBehaviorAspect.execute(((OperationBehavior) _entry_1), ((CallEventOccurrence) eventOccurrence));
      }
      String _name = _self.getName();
      String _plus = (_name + "(");
      String _name_1 = _self.getEntry().getName();
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
      StateAspect.isEntryCompleted(_self, true);
      boolean _hasCompleted = StateAspect.hasCompleted(_self);
      if (_hasCompleted) {
        StateAspect.complete(_self);
      }
    }
  }
  
  protected static void _privk3_tryExecuteDoActivity(final StateAspectStateAspectProperties _self_, final State _self, final EventOccurrence eventOccurrence) {
    boolean _isDoActivityCompleted = StateAspect.isDoActivityCompleted(_self);
    boolean _not = (!_isDoActivityCompleted);
    if (_not) {
      Behavior _doActivity = _self.getDoActivity();
      if ((_doActivity instanceof OperationBehavior)) {
        Behavior _doActivity_1 = _self.getDoActivity();
        OperationBehaviorAspect.execute(((OperationBehavior) _doActivity_1), ((CallEventOccurrence) eventOccurrence));
      }
      String _name = _self.getName();
      String _plus = (_name + "(");
      String _name_1 = _self.getDoActivity().getName();
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
      StateAspect.isDoActivityCompleted(_self, true);
      boolean _hasCompleted = StateAspect.hasCompleted(_self);
      if (_hasCompleted) {
        StateAspect.complete(_self);
      }
    }
  }
  
  protected static void _privk3_tryExecuteExit(final StateAspectStateAspectProperties _self_, final State _self, final EventOccurrence eventOccurrence) {
    boolean _isExitCompleted = StateAspect.isExitCompleted(_self);
    boolean _not = (!_isExitCompleted);
    if (_not) {
      Behavior _exit = _self.getExit();
      if ((_exit instanceof OperationBehavior)) {
        Behavior _exit_1 = _self.getExit();
        OperationBehaviorAspect.execute(((OperationBehavior) _exit_1), ((CallEventOccurrence) eventOccurrence));
      }
      String _name = _self.getName();
      String _plus = (_name + "(");
      String _name_1 = _self.getExit().getName();
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
      StateAspect.isExitCompleted(_self, true);
    }
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
    boolean _isActive = VertexAspect.isActive(_self);
    return (!_isActive);
  }
  
  private static boolean super_isExitable(final State _self, final Transition exitingTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isExitable(_self_, _self,exitingTransition);
  }
  
  protected static boolean _privk3_isExitable(final StateAspectStateAspectProperties _self_, final State _self, final Transition exitingTransition) {
    return VertexAspect.isActive(_self);
  }
  
  private static boolean super_contains(final State _self, final Vertex vertex) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_contains(_self_, _self,vertex);
  }
  
  protected static boolean _privk3_contains(final StateAspectStateAspectProperties _self_, final State _self, final Vertex vertex) {
    if ((Objects.equal(_self, vertex) || Objects.equal(_self, vertex.eContainer()))) {
      return true;
    }
    final Function1<Region, Boolean> _function = (Region it) -> {
      return Boolean.valueOf(RegionAspect.contains(it, vertex));
    };
    return IterableExtensions.<Region>exists(_self.getRegions(), _function);
  }
  
  protected static boolean _privk3_canDefer(final StateAspectStateAspectProperties _self_, final State _self, final EventOccurrence eventOccurrence) {
    if ((eventOccurrence instanceof SignalEventOccurrence)) {
      final Function1<Trigger, Boolean> _function = (Trigger t) -> {
        boolean _xblockexpression = false;
        {
          final EventType type = t.getEventType();
          _xblockexpression = ((type instanceof SignalEventType) && 
            Objects.equal(((SignalEventOccurrence)eventOccurrence).getSignal(), ((SignalEventType) type).getSignal()));
        }
        return Boolean.valueOf(_xblockexpression);
      };
      return IterableExtensions.<Trigger>exists(_self.getDeferrableTriggers(), _function);
    } else {
      if ((eventOccurrence instanceof CallEventOccurrence)) {
        final Function1<Trigger, Boolean> _function_1 = (Trigger t) -> {
          boolean _xblockexpression = false;
          {
            final EventType type = t.getEventType();
            _xblockexpression = ((type instanceof CallEventType) && 
              Objects.equal(((CallEventOccurrence)eventOccurrence).getOperation(), ((CallEventType) type).getOperation()));
          }
          return Boolean.valueOf(_xblockexpression);
        };
        return IterableExtensions.<Trigger>exists(_self.getDeferrableTriggers(), _function_1);
      }
    }
    return false;
  }
  
  protected static List<Vertex> _privk3_getActiveVertice(final StateAspectStateAspectProperties _self_, final State _self) {
    final Function1<Region, Iterable<Vertex>> _function = (Region it) -> {
      return RegionAspect.getActiveVertice(it);
    };
    return IterableExtensions.<Vertex>toList(Iterables.<Vertex>concat(ListExtensions.<Region, Iterable<Vertex>>map(_self.getRegions(), _function)));
  }
  
  protected static boolean _privk3_hasCompleted(final StateAspectStateAspectProperties _self_, final State _self) {
    return ((StateAspect.isEntryCompleted(_self) && StateAspect.isDoActivityCompleted(_self)) && IterableExtensions.<Region>forall(_self.getRegions(), ((Function1<Region, Boolean>) (Region it) -> {
      return Boolean.valueOf(RegionAspect.completed(it));
    })));
  }
  
  protected static void _privk3_complete(final StateAspectStateAspectProperties _self_, final State _self) {
    CompletionEventOccurrence _createCompletionEventOccurrence = StatemachinesFactory.eINSTANCE.createCompletionEventOccurrence();
    final Procedure1<CompletionEventOccurrence> _function = (CompletionEventOccurrence it) -> {
      it.setState(_self);
    };
    final CompletionEventOccurrence event = ObjectExtensions.<CompletionEventOccurrence>operator_doubleArrow(_createCompletionEventOccurrence, _function);
    StateMachineAspect.completionEvents(RegionAspect.getContainingStateMachine(_self.getContainer())).add(event);
  }
  
  protected static boolean _privk3_isEntryCompleted(final StateAspectStateAspectProperties _self_, final State _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsEntryCompleted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isEntryCompleted;
  }
  
  protected static void _privk3_isEntryCompleted(final StateAspectStateAspectProperties _self_, final State _self, final boolean isEntryCompleted) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsEntryCompleted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isEntryCompleted);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isEntryCompleted = isEntryCompleted;
    }
  }
  
  protected static boolean _privk3_isDoActivityCompleted(final StateAspectStateAspectProperties _self_, final State _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsDoActivityCompleted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isDoActivityCompleted;
  }
  
  protected static void _privk3_isDoActivityCompleted(final StateAspectStateAspectProperties _self_, final State _self, final boolean isDoActivityCompleted) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsDoActivityCompleted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isDoActivityCompleted);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isDoActivityCompleted = isDoActivityCompleted;
    }
  }
  
  protected static boolean _privk3_isExitCompleted(final StateAspectStateAspectProperties _self_, final State _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsExitCompleted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isExitCompleted;
  }
  
  protected static void _privk3_isExitCompleted(final StateAspectStateAspectProperties _self_, final State _self, final boolean isExitCompleted) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsExitCompleted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isExitCompleted);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isExitCompleted = isExitCompleted;
    }
  }
  
  protected static List<EventOccurrence> _privk3_deferredEvents(final StateAspectStateAspectProperties _self_, final State _self) {
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
  
  protected static void _privk3_deferredEvents(final StateAspectStateAspectProperties _self_, final State _self, final List<EventOccurrence> deferredEvents) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDeferredEvents")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, deferredEvents);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.deferredEvents = deferredEvents;
    }
  }
}
