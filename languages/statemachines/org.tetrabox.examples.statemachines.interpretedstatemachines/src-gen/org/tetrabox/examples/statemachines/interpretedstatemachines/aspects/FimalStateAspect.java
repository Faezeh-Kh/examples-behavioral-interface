package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.EventOccurrence;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FimalStateAspect extends StateAspect {
  @OverrideAspectMethod
  public static void enter(final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
	final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FimalStateAspectFinalStateAspectContext
			.getSelf(_self);
	_privk3_enter(_self_, _self, enteringTransition, eventOccurrence, leastCommonAncestor);
	;
}
  
  private static void super_enter(final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspectStateAspectContext.getSelf(_self);
     org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect._privk3_enter(_self_, _self,enteringTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_enter(final FimalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    Region _container = _self.getContainer();
    RegionAspect.completed(_container, true);
    final State parentState = _self.getContainer().getState();
    if (((parentState != null) && StateAspect.hasCompleted(parentState))) {
      StateAspect.complete(parentState);
    }
  }
}
