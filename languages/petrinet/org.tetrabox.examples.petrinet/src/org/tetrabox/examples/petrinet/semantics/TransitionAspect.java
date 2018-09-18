package org.tetrabox.examples.petrinet.semantics;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.examples.petrinet.model.petrinet.Edge;
import org.tetrabox.examples.petrinet.model.petrinet.InhibitorEdge;
import org.tetrabox.examples.petrinet.model.petrinet.InputEdge;
import org.tetrabox.examples.petrinet.model.petrinet.OutputEdge;
import org.tetrabox.examples.petrinet.model.petrinet.Place;
import org.tetrabox.examples.petrinet.model.petrinet.ReadEdge;
import org.tetrabox.examples.petrinet.model.petrinet.Transition;

import com.google.common.collect.Iterables;

import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager;
import fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand;
import fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry;

public class TransitionAspect {

	@Step
	public static void fire(final Transition _self) {
		final StepCommand command = new StepCommand() {
			@Override
			public void execute() {
				final EList<Edge> edges = _self.getEdges();
				final Consumer<InputEdge> _function = (InputEdge e) -> {
					Place _place = e.getPlace();
					int _tokens = e.getPlace().getTokens();
					int _minus = (_tokens - 1);
					_place.setTokens(_minus);
				};
				Iterables.<InputEdge>filter(edges, InputEdge.class).forEach(_function);
				final Consumer<OutputEdge> _function_1 = (OutputEdge e) -> {
					Place _place = e.getPlace();
					int _tokens = e.getPlace().getTokens();
					int _plus = (_tokens + 1);
					_place.setTokens(_plus);
				};
				Iterables.<OutputEdge>filter(edges, OutputEdge.class).forEach(_function_1);
			}
		};
		final IStepManager stepManager =  StepManagerRegistry.getInstance().findStepManager(_self);
		if (stepManager != null) {
			stepManager.executeStep(_self, command, "Transition", "fire");
		} else {
			command.execute();
		}

	}

	public static boolean canFire(final Transition _self) {
		final EList<Edge> edges = _self.getEdges();
		final Function1<InputEdge, Boolean> _function = (InputEdge e) -> {
			int _tokens = e.getPlace().getTokens();
			return Boolean.valueOf((_tokens > 0));
		};
		final boolean inputOk = IterableExtensions
				.<InputEdge>forall(Iterables.<InputEdge>filter(edges, InputEdge.class), _function);
		final Function1<InhibitorEdge, Boolean> _function_1 = (InhibitorEdge e) -> {
			int _tokens = e.getPlace().getTokens();
			return Boolean.valueOf((_tokens == 0));
		};
		final boolean inhibitorOk = IterableExtensions
				.<InhibitorEdge>forall(Iterables.<InhibitorEdge>filter(edges, InhibitorEdge.class), _function_1);
		final Function1<ReadEdge, Boolean> _function_2 = (ReadEdge e) -> {
			int _tokens = e.getPlace().getTokens();
			return Boolean.valueOf((_tokens > 0));
		};
		final boolean readOk = IterableExtensions.<ReadEdge>forall(Iterables.<ReadEdge>filter(edges, ReadEdge.class),
				_function_2);
		return ((inputOk && inhibitorOk) && readOk);
	}
}
