package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.CustomEventAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.CustomSystemAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.CompletionEventAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.EventAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.FinalStateAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.NamedElementAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.PseudostateAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.RegionAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateMachineAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.TransitionAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.TriggerAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.VertexAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Event;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.NamedElement;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Vertex;

@SuppressWarnings("all")
public class StateMachinesMTAdaptersFactory implements AdaptersFactory {
  private static StateMachinesMTAdaptersFactory instance;
  
  public static StateMachinesMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public StateMachinesMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine){
    	return createStateMachineAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.StateMachine) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region){
    	return createRegionAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Region) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State){
    	return createStateAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.State) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition){
    	return createTransitionAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Transition) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Trigger){
    	return createTriggerAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Trigger) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent){
    	return createCompletionEventAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.CompletionEvent) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState){
    	return createFinalStateAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.FinalState) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate){
    	return createPseudostateAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.Pseudostate) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem){
    	return createCustomSystemAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent){
    	return createCustomEventAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent) o, res);
    }
    
    return null;
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.NamedElementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.NamedElementAdapter) adapter;
    }
  }
  
  public StateMachineAdapter createStateMachineAdapter(final StateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateMachineAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateMachineAdapter) adapter;
    }
  }
  
  public RegionAdapter createRegionAdapter(final Region adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.RegionAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.RegionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.RegionAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.StateAdapter) adapter;
    }
  }
  
  public VertexAdapter createVertexAdapter(final Vertex adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.VertexAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.VertexAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.VertexAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.TransitionAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.TransitionAdapter) adapter;
    }
  }
  
  public TriggerAdapter createTriggerAdapter(final Trigger adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.TriggerAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.TriggerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.TriggerAdapter) adapter;
    }
  }
  
  public EventAdapter createEventAdapter(final Event adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.EventAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.EventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.EventAdapter) adapter;
    }
  }
  
  public CompletionEventAdapter createCompletionEventAdapter(final CompletionEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.CompletionEventAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.CompletionEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.CompletionEventAdapter) adapter;
    }
  }
  
  public FinalStateAdapter createFinalStateAdapter(final FinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.FinalStateAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.FinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.FinalStateAdapter) adapter;
    }
  }
  
  public PseudostateAdapter createPseudostateAdapter(final Pseudostate adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.PseudostateAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.PseudostateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml.PseudostateAdapter) adapter;
    }
  }
  
  public CustomSystemAdapter createCustomSystemAdapter(final CustomSystem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.CustomSystemAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.CustomSystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.CustomSystemAdapter) adapter;
    }
  }
  
  public CustomEventAdapter createCustomEventAdapter(final CustomEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.CustomEventAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.CustomEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.CustomEventAdapter) adapter;
    }
  }
}
