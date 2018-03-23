package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.PseudostateKind;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence;

@Aspect(className = Pseudostate.class)
@SuppressWarnings("all")
public class PseudostateAspect extends VertexAspect {
  @OverrideAspectMethod
  protected static void enter(final Pseudostate _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect._privk3_enter(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  protected static boolean isEnterable(final Pseudostate _self, final Transition enteringTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect._privk3_isEnterable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate)_self,enteringTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.isEnterable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,enteringTransition);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  protected static boolean isExitable(final Pseudostate _self, final Transition exitingTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect._privk3_isExitable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate)_self,exitingTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.isExitable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,exitingTransition);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static void super_enter(final Pseudostate _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_enter(_self_, _self,enteringTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_enter(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    PseudostateKind _kind = _self.getKind();
    if (_kind != null) {
      switch (_kind) {
        case INITIAL:
          Region _container = _self.getContainer();
          RegionAspect.currentVertex(_container, _self);
          int _size = _self.getOutgoingTransitions().size();
          boolean _equals = (_size == 1);
          if (_equals) {
            TransitionAspect.fire(IterableExtensions.<Transition>head(_self.getOutgoingTransitions()), eventOccurrence);
          }
          break;
        case FORK:
          PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
          final Consumer<Transition> _function = (Transition it) -> {
            TransitionAspect.fire(it, eventOccurrence);
          };
          _self.getOutgoingTransitions().forEach(_function);
          break;
        case JOIN:
          PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
          TransitionAspect.fire(IterableExtensions.<Transition>head(_self.getOutgoingTransitions()), eventOccurrence);
          break;
        case TERMINATE:
          PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
          StateMachineAspect.terminate(RegionAspect.getContainingStateMachine(_self.getContainer()));
          VertexAspect.exit(_self, null, null, null);
          break;
        default:
          PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
          break;
      }
    } else {
      PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
    }
  }
  
  private static boolean super_isEnterable(final Pseudostate _self, final Transition enteringTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isEnterable(_self_, _self,enteringTransition);
  }
  
  protected static boolean _privk3_isEnterable(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self, final Transition enteringTransition) {
    PseudostateKind _kind = _self.getKind();
    if (_kind != null) {
      switch (_kind) {
        case JOIN:
          final Function1<Transition, Boolean> _function = (Transition it) -> {
            return Boolean.valueOf((!Objects.equal(it, enteringTransition)));
          };
          final Function1<Transition, Boolean> _function_1 = (Transition it) -> {
            return Boolean.valueOf(TransitionAspect.traversed(it));
          };
          return IterableExtensions.<Transition>forall(IterableExtensions.<Transition>filter(_self.getIncomingTransitions(), _function), _function_1);
        default:
          return PseudostateAspect.super_isEnterable(_self, enteringTransition);
      }
    } else {
      return PseudostateAspect.super_isEnterable(_self, enteringTransition);
    }
  }
  
  private static boolean super_isExitable(final Pseudostate _self, final Transition exitingTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isExitable(_self_, _self,exitingTransition);
  }
  
  protected static boolean _privk3_isExitable(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self, final Transition exitingTransition) {
    PseudostateKind _kind = _self.getKind();
    if (_kind != null) {
      switch (_kind) {
        case FORK:
          final Function1<Transition, Boolean> _function = (Transition it) -> {
            return Boolean.valueOf((!Objects.equal(it, exitingTransition)));
          };
          final Function1<Transition, Boolean> _function_1 = (Transition it) -> {
            return Boolean.valueOf(TransitionAspect.traversed(it));
          };
          return IterableExtensions.<Transition>forall(IterableExtensions.<Transition>filter(_self.getOutgoingTransitions(), _function), _function_1);
        default:
          return PseudostateAspect.super_isExitable(_self, exitingTransition);
      }
    } else {
      return PseudostateAspect.super_isExitable(_self, exitingTransition);
    }
  }
}
