package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence;

@Aspect(className = Vertex.class)
@SuppressWarnings("all")
public class VertexAspect {
  protected static void enter(final Vertex _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_enter(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void exit(final Vertex _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.exit((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_exit(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void terminate(final Vertex _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.terminate((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_terminate(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static boolean isActive(final Vertex _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isActive(_self_, _self);;
    return (boolean)result;
  }
  
  protected static boolean isEnterable(final Vertex _self, final Transition enteringTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isEnterable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self,enteringTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.isEnterable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate)_self,enteringTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isEnterable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,enteringTransition);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean isExitable(final Vertex _self, final Transition exitingTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isExitable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self,exitingTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.isExitable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate)_self,exitingTransition);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isExitable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,exitingTransition);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean contains(final Vertex _self, final Vertex vertex) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.contains((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State)_self,vertex);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex){
    					result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_contains(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex)_self,vertex);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static void _privk3_enter(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    if ((((leastCommonAncestor != null) && (_self.getContainer() != null)) && (!Objects.equal(_self.getContainer(), leastCommonAncestor)))) {
      State containingState = _self.getContainer().getState();
      if ((containingState != null)) {
        StateAspect.enter(containingState, enteringTransition, eventOccurrence, leastCommonAncestor);
      }
    }
    Region _container = _self.getContainer();
    RegionAspect.currentVertex(_container, _self);
    StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self.getContainer())).add(_self);
  }
  
  protected static void _privk3_exit(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    Region _container = _self.getContainer();
    RegionAspect.currentVertex(_container, null);
    StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self.getContainer())).remove(_self);
    if ((((leastCommonAncestor != null) && (_self.getContainer() != null)) && (!Objects.equal(leastCommonAncestor, _self.getContainer())))) {
      State containingState = _self.getContainer().getState();
      if ((containingState != null)) {
        StateAspect.exit(containingState, exitingTransition, eventOccurrence, leastCommonAncestor);
      }
    }
  }
  
  protected static void _privk3_terminate(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return;
  }
  
  protected static boolean _privk3_isActive(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self.getContainer())).contains(_self);
  }
  
  protected static boolean _privk3_isEnterable(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition enteringTransition) {
    return true;
  }
  
  protected static boolean _privk3_isExitable(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition exitingTransition) {
    return true;
  }
  
  protected static boolean _privk3_contains(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Vertex vertex) {
    return false;
  }
}
