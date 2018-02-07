package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import statemachines.CustomEvent;
import statemachines.CustomSystem;
import statemachines.StatemachinesFactory;
import statemachines.StatemachinesPackage;

@SuppressWarnings("all")
public class StatemachinesFactoryAdapter extends EFactoryImpl implements StatemachinesFactory {
  private StateMachinesMTAdaptersFactory adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  
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
  public EPackage getEPackage() {
    return getStatemachinesPackage();
  }
  
  public StatemachinesPackage getStatemachinesPackage() {
    return statemachines.StatemachinesPackage.eINSTANCE;
  }
}
