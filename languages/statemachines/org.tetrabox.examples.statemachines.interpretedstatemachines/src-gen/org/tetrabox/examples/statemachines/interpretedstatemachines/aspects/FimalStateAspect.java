package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EObject;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FimalStateAspect extends StateAspect {
  @OverrideAspectMethod
  protected static void enter(final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectContext.getSelf(_self);
     if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspect._privk3_enter(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    					org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_enter(final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_enter(_self_, _self,enteringTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_enter(final FimalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    Region _container = _self.getContainer();
    RegionAspect.currentVertex(_container, null);
    Region _container_1 = _self.getContainer();
    RegionAspect.completed(_container_1, true);
    final State parentState = _self.getContainer().getState();
    if (((parentState != null) && StateAspect.hasCompleted(parentState))) {
      StateAspect.complete(parentState);
    }
    EObject _eContainer = _self.getContainer().eContainer();
    if ((_eContainer instanceof StateMachine)) {
      EObject _eContainer_1 = _self.getContainer().eContainer();
      StateMachineAspect.terminate(((StateMachine) _eContainer_1));
    }
  }
}
