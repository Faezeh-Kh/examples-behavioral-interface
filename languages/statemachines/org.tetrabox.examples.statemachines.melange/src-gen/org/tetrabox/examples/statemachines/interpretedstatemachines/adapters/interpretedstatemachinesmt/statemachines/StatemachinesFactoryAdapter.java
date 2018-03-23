package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.CustomSystem;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage;

@SuppressWarnings("all")
public class StatemachinesFactoryAdapter extends EFactoryImpl implements StatemachinesFactory {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  
  private org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory statemachinesAdaptee = org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory.eINSTANCE;
  
  @Override
  public CustomSystem createCustomSystem() {
    return adaptersFactory.createCustomSystemAdapter(statemachinesAdaptee.createCustomSystem(), null);
  }
  
  @Override
  public CustomEvent createCustomEvent() {
    return adaptersFactory.createCustomEventAdapter(statemachinesAdaptee.createCustomEvent(), null);
  }
  
  @Override
  public EventOccurrence createEventOccurrence() {
    return adaptersFactory.createEventOccurrenceAdapter(statemachinesAdaptee.createEventOccurrence(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getStatemachinesPackage();
  }
  
  public StatemachinesPackage getStatemachinesPackage() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE;
  }
}
