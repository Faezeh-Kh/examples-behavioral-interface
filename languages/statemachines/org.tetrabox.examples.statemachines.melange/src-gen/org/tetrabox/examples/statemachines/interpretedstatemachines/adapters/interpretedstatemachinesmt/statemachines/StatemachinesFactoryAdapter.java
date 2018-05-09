package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;

@SuppressWarnings("all")
public class StatemachinesFactoryAdapter extends EFactoryImpl implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesFactory {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  
  private StatemachinesFactory statemachinesAdaptee = org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory.eINSTANCE;
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CustomSystem createCustomSystem() {
    return adaptersFactory.createCustomSystemAdapter(statemachinesAdaptee.createCustomSystem(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Signal createSignal() {
    return adaptersFactory.createSignalAdapter(statemachinesAdaptee.createSignal(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Operation createOperation() {
    return adaptersFactory.createOperationAdapter(statemachinesAdaptee.createOperation(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.SignalEventType createSignalEventType() {
    return adaptersFactory.createSignalEventTypeAdapter(statemachinesAdaptee.createSignalEventType(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CallEventType createCallEventType() {
    return adaptersFactory.createCallEventTypeAdapter(statemachinesAdaptee.createCallEventType(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanAttribute createBooleanAttribute() {
    return adaptersFactory.createBooleanAttributeAdapter(statemachinesAdaptee.createBooleanAttribute(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerAttribute createIntegerAttribute() {
    return adaptersFactory.createIntegerAttributeAdapter(statemachinesAdaptee.createIntegerAttribute(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanConstraint createBooleanConstraint() {
    return adaptersFactory.createBooleanConstraintAdapter(statemachinesAdaptee.createBooleanConstraint(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerConstraint createIntegerConstraint() {
    return adaptersFactory.createIntegerConstraintAdapter(statemachinesAdaptee.createIntegerConstraint(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StateMachine createStateMachine() {
    return adaptersFactory.createStateMachineAdapter(statemachinesAdaptee.createStateMachine(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region createRegion() {
    return adaptersFactory.createRegionAdapter(statemachinesAdaptee.createRegion(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex createVertex() {
    return adaptersFactory.createVertexAdapter(statemachinesAdaptee.createVertex(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Pseudostate createPseudostate() {
    return adaptersFactory.createPseudostateAdapter(statemachinesAdaptee.createPseudostate(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.State createState() {
    return adaptersFactory.createStateAdapter(statemachinesAdaptee.createState(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.FinalState createFinalState() {
    return adaptersFactory.createFinalStateAdapter(statemachinesAdaptee.createFinalState(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(statemachinesAdaptee.createTransition(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Trigger createTrigger() {
    return adaptersFactory.createTriggerAdapter(statemachinesAdaptee.createTrigger(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior createBehavior() {
    return adaptersFactory.createBehaviorAdapter(statemachinesAdaptee.createBehavior(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.OperationBehavior createOperationBehavior() {
    return adaptersFactory.createOperationBehaviorAdapter(statemachinesAdaptee.createOperationBehavior(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.AttributeValue createAttributeValue() {
    return adaptersFactory.createAttributeValueAdapter(statemachinesAdaptee.createAttributeValue(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.BooleanAttributeValue createBooleanAttributeValue() {
    return adaptersFactory.createBooleanAttributeValueAdapter(statemachinesAdaptee.createBooleanAttributeValue(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.IntegerAttributeValue createIntegerAttributeValue() {
    return adaptersFactory.createIntegerAttributeValueAdapter(statemachinesAdaptee.createIntegerAttributeValue(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.EventOccurrence createEventOccurrence() {
    return adaptersFactory.createEventOccurrenceAdapter(statemachinesAdaptee.createEventOccurrence(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CompletionEventOccurrence createCompletionEventOccurrence() {
    return adaptersFactory.createCompletionEventOccurrenceAdapter(statemachinesAdaptee.createCompletionEventOccurrence(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.SignalEventOccurrence createSignalEventOccurrence() {
    return adaptersFactory.createSignalEventOccurrenceAdapter(statemachinesAdaptee.createSignalEventOccurrence(), null);
  }
  
  @Override
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CallEventOccurrence createCallEventOccurrence() {
    return adaptersFactory.createCallEventOccurrenceAdapter(statemachinesAdaptee.createCallEventOccurrence(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getStatemachinesPackage();
  }
  
  public org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage getStatemachinesPackage() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE;
  }
}
