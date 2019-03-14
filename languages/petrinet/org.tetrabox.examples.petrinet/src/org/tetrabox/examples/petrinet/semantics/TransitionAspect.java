package org.tetrabox.examples.petrinet.semantics;

import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.executionframework.engine.annotations.EventHandler;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.petrinet.model.petrinet.Edge;
import org.tetrabox.examples.petrinet.model.petrinet.InhibitorEdge;
import org.tetrabox.examples.petrinet.model.petrinet.InputEdge;
import org.tetrabox.examples.petrinet.model.petrinet.OutputEdge;
import org.tetrabox.examples.petrinet.model.petrinet.Place;
import org.tetrabox.examples.petrinet.model.petrinet.ReadEdge;
import org.tetrabox.examples.petrinet.model.petrinet.Transition;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  @EventHandler
  public static void fire(final Transition _self) {
    final TransitionAspectTransitionAspectProperties _self_ = TransitionAspectTransitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fire()
    if (_self instanceof org.tetrabox.examples.petrinet.model.petrinet.Transition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			TransitionAspect._privk3_fire(_self_, (org.tetrabox.examples.petrinet.model.petrinet.Transition)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Transition", "fire");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static boolean canFire(final Transition _self) {
    final TransitionAspectTransitionAspectProperties _self_ = TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean canFire()
    if (_self instanceof org.tetrabox.examples.petrinet.model.petrinet.Transition){
    	result = TransitionAspect._privk3_canFire(_self_, (org.tetrabox.examples.petrinet.model.petrinet.Transition)_self);
    };
    return (boolean)result;
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    boolean _canFire = TransitionAspect.canFire(_self);
    if (_canFire) {
      final EList<Edge> edges = _self.getEdges();
      final Consumer<InputEdge> _function = (InputEdge e) -> {
        final Place p = e.getPlace();
        int _tokens = p.getTokens();
        int _minus = (_tokens - 1);
        p.setTokens(_minus);
      };
      Iterables.<InputEdge>filter(edges, InputEdge.class).forEach(_function);
      final Consumer<OutputEdge> _function_1 = (OutputEdge e) -> {
        final Place p = e.getPlace();
        int _tokens = p.getTokens();
        int _plus = (_tokens + 1);
        p.setTokens(_plus);
      };
      Iterables.<OutputEdge>filter(edges, OutputEdge.class).forEach(_function_1);
      System.out.println(_self.getName() + "fired!");
    }
  }
  
  protected static boolean _privk3_canFire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    final EList<Edge> edges = _self.getEdges();
    final Function1<InputEdge, Boolean> _function = (InputEdge e) -> {
      int _tokens = e.getPlace().getTokens();
      return Boolean.valueOf((_tokens > 0));
    };
    final boolean inputOk = IterableExtensions.<InputEdge>forall(Iterables.<InputEdge>filter(edges, InputEdge.class), _function);
    final Function1<InhibitorEdge, Boolean> _function_1 = (InhibitorEdge e) -> {
      int _tokens = e.getPlace().getTokens();
      return Boolean.valueOf((_tokens == 0));
    };
    final boolean inhibitorOk = IterableExtensions.<InhibitorEdge>forall(Iterables.<InhibitorEdge>filter(edges, InhibitorEdge.class), _function_1);
    final Function1<ReadEdge, Boolean> _function_2 = (ReadEdge e) -> {
      int _tokens = e.getPlace().getTokens();
      return Boolean.valueOf((_tokens > 0));
    };
    final boolean readOk = IterableExtensions.<ReadEdge>forall(Iterables.<ReadEdge>filter(edges, ReadEdge.class), _function_2);
    return ((inputOk && inhibitorOk) && readOk);
  }
}
