package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanConstraint;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CallEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CallEventType;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CompletionEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CustomSystem;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.FinalState;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerConstraint;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.OperationBehavior;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Signal;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.SignalEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.SignalEventType;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.State;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StringAttribute;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StringAttributeValue;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StringConstraint;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex;

@SuppressWarnings("all")
public class StatemachinesFactoryAdapter extends EFactoryImpl implements StatemachinesFactory {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  
  private org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory statemachinesAdaptee = org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory.eINSTANCE;
  
  @Override
  public CustomSystem createCustomSystem() {
    return adaptersFactory.createCustomSystemAdapter(statemachinesAdaptee.createCustomSystem(), null);
  }
  
  @Override
  public Signal createSignal() {
    return adaptersFactory.createSignalAdapter(statemachinesAdaptee.createSignal(), null);
  }
  
  @Override
  public Operation createOperation() {
    return adaptersFactory.createOperationAdapter(statemachinesAdaptee.createOperation(), null);
  }
  
  @Override
  public SignalEventType createSignalEventType() {
    return adaptersFactory.createSignalEventTypeAdapter(statemachinesAdaptee.createSignalEventType(), null);
  }
  
  @Override
  public CallEventType createCallEventType() {
    return adaptersFactory.createCallEventTypeAdapter(statemachinesAdaptee.createCallEventType(), null);
  }
  
  @Override
  public BooleanAttribute createBooleanAttribute() {
    return adaptersFactory.createBooleanAttributeAdapter(statemachinesAdaptee.createBooleanAttribute(), null);
  }
  
  @Override
  public IntegerAttribute createIntegerAttribute() {
    return adaptersFactory.createIntegerAttributeAdapter(statemachinesAdaptee.createIntegerAttribute(), null);
  }
  
  @Override
  public StringAttribute createStringAttribute() {
    return adaptersFactory.createStringAttributeAdapter(statemachinesAdaptee.createStringAttribute(), null);
  }
  
  @Override
  public BooleanConstraint createBooleanConstraint() {
    return adaptersFactory.createBooleanConstraintAdapter(statemachinesAdaptee.createBooleanConstraint(), null);
  }
  
  @Override
  public IntegerConstraint createIntegerConstraint() {
    return adaptersFactory.createIntegerConstraintAdapter(statemachinesAdaptee.createIntegerConstraint(), null);
  }
  
  @Override
  public StringConstraint createStringConstraint() {
    return adaptersFactory.createStringConstraintAdapter(statemachinesAdaptee.createStringConstraint(), null);
  }
  
  @Override
  public StateMachine createStateMachine() {
    return adaptersFactory.createStateMachineAdapter(statemachinesAdaptee.createStateMachine(), null);
  }
  
  @Override
  public Region createRegion() {
    return adaptersFactory.createRegionAdapter(statemachinesAdaptee.createRegion(), null);
  }
  
  @Override
  public Vertex createVertex() {
    return adaptersFactory.createVertexAdapter(statemachinesAdaptee.createVertex(), null);
  }
  
  @Override
  public Pseudostate createPseudostate() {
    return adaptersFactory.createPseudostateAdapter(statemachinesAdaptee.createPseudostate(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(statemachinesAdaptee.createState(), null);
  }
  
  @Override
  public FinalState createFinalState() {
    return adaptersFactory.createFinalStateAdapter(statemachinesAdaptee.createFinalState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(statemachinesAdaptee.createTransition(), null);
  }
  
  @Override
  public Trigger createTrigger() {
    return adaptersFactory.createTriggerAdapter(statemachinesAdaptee.createTrigger(), null);
  }
  
  @Override
  public Behavior createBehavior() {
    return adaptersFactory.createBehaviorAdapter(statemachinesAdaptee.createBehavior(), null);
  }
  
  @Override
  public OperationBehavior createOperationBehavior() {
    return adaptersFactory.createOperationBehaviorAdapter(statemachinesAdaptee.createOperationBehavior(), null);
  }
  
  @Override
  public BooleanAttributeValue createBooleanAttributeValue() {
    return adaptersFactory.createBooleanAttributeValueAdapter(statemachinesAdaptee.createBooleanAttributeValue(), null);
  }
  
  @Override
  public IntegerAttributeValue createIntegerAttributeValue() {
    return adaptersFactory.createIntegerAttributeValueAdapter(statemachinesAdaptee.createIntegerAttributeValue(), null);
  }
  
  @Override
  public StringAttributeValue createStringAttributeValue() {
    return adaptersFactory.createStringAttributeValueAdapter(statemachinesAdaptee.createStringAttributeValue(), null);
  }
  
  @Override
  public EventOccurrence createEventOccurrence() {
    return adaptersFactory.createEventOccurrenceAdapter(statemachinesAdaptee.createEventOccurrence(), null);
  }
  
  @Override
  public CompletionEventOccurrence createCompletionEventOccurrence() {
    return adaptersFactory.createCompletionEventOccurrenceAdapter(statemachinesAdaptee.createCompletionEventOccurrence(), null);
  }
  
  @Override
  public SignalEventOccurrence createSignalEventOccurrence() {
    return adaptersFactory.createSignalEventOccurrenceAdapter(statemachinesAdaptee.createSignalEventOccurrence(), null);
  }
  
  @Override
  public CallEventOccurrence createCallEventOccurrence() {
    return adaptersFactory.createCallEventOccurrenceAdapter(statemachinesAdaptee.createCallEventOccurrence(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getStatemachinesPackage();
  }
  
  public StatemachinesPackage getStatemachinesPackage() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE;
  }
}
