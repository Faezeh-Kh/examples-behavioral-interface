package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeValueAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BehaviorAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeValueAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanConstraintAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CallEventOccurrenceAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CallEventTypeAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CompletionEventOccurrenceAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.ConstraintAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CustomSystemAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.EventOccurrenceAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.EventTypeAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.FinalStateAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeValueAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerConstraintAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.NamedElementAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationBehaviorAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.PseudostateAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.RegionAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalEventOccurrenceAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalEventTypeAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateMachineAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.TransitionAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.TriggerAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.VertexAdapter;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Attribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanConstraint;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Constraint;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventType;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerConstraint;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.NamedElement;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex;

@SuppressWarnings("all")
public class InterpretedStateMachinesMTAdaptersFactory implements AdaptersFactory {
  private static InterpretedStateMachinesMTAdaptersFactory instance;
  
  public static InterpretedStateMachinesMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public InterpretedStateMachinesMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem){
    	return createCustomSystemAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal){
    	return createSignalAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation){
    	return createOperationAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType){
    	return createSignalEventTypeAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType){
    	return createCallEventTypeAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttribute){
    	return createBooleanAttributeAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttribute) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute){
    	return createIntegerAttributeAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanConstraint){
    	return createBooleanConstraintAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanConstraint) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerConstraint){
    	return createIntegerConstraintAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerConstraint) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine){
    	return createStateMachineAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region){
    	return createRegionAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate){
    	return createPseudostateAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState){
    	return createFinalStateAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    	return createStateAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	return createVertexAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition){
    	return createTransitionAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Trigger){
    	return createTriggerAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Trigger) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior){
    	return createOperationBehaviorAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior){
    	return createBehaviorAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue){
    	return createBooleanAttributeValueAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue){
    	return createIntegerAttributeValueAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue){
    	return createAttributeValueAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.AttributeValue) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence){
    	return createCallEventOccurrenceAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence){
    	return createEventOccurrenceAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence){
    	return createCompletionEventOccurrenceAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence) o, res);
    }
    if (o instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence){
    	return createSignalEventOccurrenceAdapter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence) o, res);
    }
    
    return null;
  }
  
  public CustomSystemAdapter createCustomSystemAdapter(final CustomSystem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CustomSystemAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CustomSystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CustomSystemAdapter) adapter;
    }
  }
  
  public SignalAdapter createSignalAdapter(final Signal adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalAdapter) adapter;
    }
  }
  
  public OperationAdapter createOperationAdapter(final Operation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationAdapter) adapter;
    }
  }
  
  public EventTypeAdapter createEventTypeAdapter(final EventType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.EventTypeAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.EventTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.EventTypeAdapter) adapter;
    }
  }
  
  public SignalEventTypeAdapter createSignalEventTypeAdapter(final SignalEventType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalEventTypeAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalEventTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalEventTypeAdapter) adapter;
    }
  }
  
  public CallEventTypeAdapter createCallEventTypeAdapter(final CallEventType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CallEventTypeAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CallEventTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CallEventTypeAdapter) adapter;
    }
  }
  
  public AttributeAdapter createAttributeAdapter(final Attribute adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeAdapter) adapter;
    }
  }
  
  public BooleanAttributeAdapter createBooleanAttributeAdapter(final BooleanAttribute adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeAdapter) adapter;
    }
  }
  
  public IntegerAttributeAdapter createIntegerAttributeAdapter(final IntegerAttribute adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeAdapter) adapter;
    }
  }
  
  public ConstraintAdapter createConstraintAdapter(final Constraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.ConstraintAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.ConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.ConstraintAdapter) adapter;
    }
  }
  
  public BooleanConstraintAdapter createBooleanConstraintAdapter(final BooleanConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanConstraintAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanConstraintAdapter) adapter;
    }
  }
  
  public IntegerConstraintAdapter createIntegerConstraintAdapter(final IntegerConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerConstraintAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerConstraintAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.NamedElementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.NamedElementAdapter) adapter;
    }
  }
  
  public StateMachineAdapter createStateMachineAdapter(final StateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateMachineAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateMachineAdapter) adapter;
    }
  }
  
  public RegionAdapter createRegionAdapter(final Region adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.RegionAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.RegionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.RegionAdapter) adapter;
    }
  }
  
  public VertexAdapter createVertexAdapter(final Vertex adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.VertexAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.VertexAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.VertexAdapter) adapter;
    }
  }
  
  public PseudostateAdapter createPseudostateAdapter(final Pseudostate adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.PseudostateAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.PseudostateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.PseudostateAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StateAdapter) adapter;
    }
  }
  
  public FinalStateAdapter createFinalStateAdapter(final FinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.FinalStateAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.FinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.FinalStateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.TransitionAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.TransitionAdapter) adapter;
    }
  }
  
  public TriggerAdapter createTriggerAdapter(final Trigger adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.TriggerAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.TriggerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.TriggerAdapter) adapter;
    }
  }
  
  public BehaviorAdapter createBehaviorAdapter(final Behavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BehaviorAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BehaviorAdapter) adapter;
    }
  }
  
  public OperationBehaviorAdapter createOperationBehaviorAdapter(final OperationBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationBehaviorAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.OperationBehaviorAdapter) adapter;
    }
  }
  
  public AttributeValueAdapter createAttributeValueAdapter(final AttributeValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.AttributeValueAdapter) adapter;
    }
  }
  
  public BooleanAttributeValueAdapter createBooleanAttributeValueAdapter(final BooleanAttributeValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BooleanAttributeValueAdapter) adapter;
    }
  }
  
  public IntegerAttributeValueAdapter createIntegerAttributeValueAdapter(final IntegerAttributeValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.IntegerAttributeValueAdapter) adapter;
    }
  }
  
  public EventOccurrenceAdapter createEventOccurrenceAdapter(final EventOccurrence adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.EventOccurrenceAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.EventOccurrenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.EventOccurrenceAdapter) adapter;
    }
  }
  
  public CompletionEventOccurrenceAdapter createCompletionEventOccurrenceAdapter(final CompletionEventOccurrence adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CompletionEventOccurrenceAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CompletionEventOccurrenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CompletionEventOccurrenceAdapter) adapter;
    }
  }
  
  public SignalEventOccurrenceAdapter createSignalEventOccurrenceAdapter(final SignalEventOccurrence adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalEventOccurrenceAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalEventOccurrenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.SignalEventOccurrenceAdapter) adapter;
    }
  }
  
  public CallEventOccurrenceAdapter createCallEventOccurrenceAdapter(final CallEventOccurrence adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CallEventOccurrenceAdapter) adapter;
    else {
    	adapter = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CallEventOccurrenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.CallEventOccurrenceAdapter) adapter;
    }
  }
}
