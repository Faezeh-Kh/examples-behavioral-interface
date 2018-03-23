package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.almostuml;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.CompletionEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.FinalState;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Pseudostate;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.State;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.Vertex;

@SuppressWarnings("all")
public class AlmostumlFactoryAdapter extends EFactoryImpl implements AlmostumlFactory {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  
  private org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlFactory almostumlAdaptee = org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlFactory.eINSTANCE;
  
  @Override
  public StateMachine createStateMachine() {
    return adaptersFactory.createStateMachineAdapter(almostumlAdaptee.createStateMachine(), null);
  }
  
  @Override
  public Region createRegion() {
    return adaptersFactory.createRegionAdapter(almostumlAdaptee.createRegion(), null);
  }
  
  @Override
  public Vertex createVertex() {
    return adaptersFactory.createVertexAdapter(almostumlAdaptee.createVertex(), null);
  }
  
  @Override
  public Pseudostate createPseudostate() {
    return adaptersFactory.createPseudostateAdapter(almostumlAdaptee.createPseudostate(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(almostumlAdaptee.createState(), null);
  }
  
  @Override
  public FinalState createFinalState() {
    return adaptersFactory.createFinalStateAdapter(almostumlAdaptee.createFinalState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(almostumlAdaptee.createTransition(), null);
  }
  
  @Override
  public Trigger createTrigger() {
    return adaptersFactory.createTriggerAdapter(almostumlAdaptee.createTrigger(), null);
  }
  
  @Override
  public CompletionEvent createCompletionEvent() {
    return adaptersFactory.createCompletionEventAdapter(almostumlAdaptee.createCompletionEvent(), null);
  }
  
  @Override
  public Behavior createBehavior() {
    return adaptersFactory.createBehaviorAdapter(almostumlAdaptee.createBehavior(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getAlmostumlPackage();
  }
  
  public AlmostumlPackage getAlmostumlPackage() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage.eINSTANCE;
  }
}
