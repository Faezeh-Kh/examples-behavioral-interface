package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import statemachines.Behavior;
import statemachines.BooleanAttribute;
import statemachines.BooleanAttributeValue;
import statemachines.BooleanConstraint;
import statemachines.CallEventOccurrence;
import statemachines.CallEventType;
import statemachines.CompletionEventOccurrence;
import statemachines.CustomSystem;
import statemachines.FinalState;
import statemachines.IntegerAttribute;
import statemachines.IntegerAttributeValue;
import statemachines.IntegerConstraint;
import statemachines.Operation;
import statemachines.OperationBehavior;
import statemachines.Pseudostate;
import statemachines.Region;
import statemachines.Signal;
import statemachines.SignalEventOccurrence;
import statemachines.SignalEventType;
import statemachines.State;
import statemachines.StateMachine;
import statemachines.StatemachinesFactory;
import statemachines.StatemachinesPackage;
import statemachines.Transition;
import statemachines.Trigger;

@SuppressWarnings("all")
public class StatemachinesFactoryAdapter extends EFactoryImpl implements StatemachinesFactory {
  private StateMachinesMTAdaptersFactory adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  
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
  public BooleanConstraint createBooleanConstraint() {
    return adaptersFactory.createBooleanConstraintAdapter(statemachinesAdaptee.createBooleanConstraint(), null);
  }
  
  @Override
  public IntegerConstraint createIntegerConstraint() {
    return adaptersFactory.createIntegerConstraintAdapter(statemachinesAdaptee.createIntegerConstraint(), null);
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
    return statemachines.StatemachinesPackage.eINSTANCE;
  }
}
