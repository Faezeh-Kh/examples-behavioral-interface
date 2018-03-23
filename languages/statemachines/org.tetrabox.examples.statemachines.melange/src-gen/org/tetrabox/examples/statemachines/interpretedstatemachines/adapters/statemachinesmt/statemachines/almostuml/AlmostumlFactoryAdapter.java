package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.almostuml;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import statemachines.almostuml.AlmostumlFactory;
import statemachines.almostuml.AlmostumlPackage;
import statemachines.almostuml.Behavior;
import statemachines.almostuml.CompletionEvent;
import statemachines.almostuml.FinalState;
import statemachines.almostuml.Pseudostate;
import statemachines.almostuml.Region;
import statemachines.almostuml.State;
import statemachines.almostuml.StateMachine;
import statemachines.almostuml.Transition;
import statemachines.almostuml.Trigger;

@SuppressWarnings("all")
public class AlmostumlFactoryAdapter extends EFactoryImpl implements AlmostumlFactory {
  private StateMachinesMTAdaptersFactory adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  
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
    return statemachines.almostuml.AlmostumlPackage.eINSTANCE;
  }
}
