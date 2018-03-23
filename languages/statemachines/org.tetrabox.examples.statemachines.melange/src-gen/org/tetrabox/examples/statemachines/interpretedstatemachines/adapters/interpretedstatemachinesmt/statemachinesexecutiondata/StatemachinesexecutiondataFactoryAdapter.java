package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachinesexecutiondata;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.StatemachinesexecutiondataFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.StatemachinesexecutiondataPackage;

@SuppressWarnings("all")
public class StatemachinesexecutiondataFactoryAdapter extends EFactoryImpl implements StatemachinesexecutiondataFactory {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
  
  private org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.StatemachinesexecutiondataFactory statemachinesexecutiondataAdaptee = org.tetrabox.examples.statemachines.interpretedstatemachines.statemachinesexecutiondata.StatemachinesexecutiondataFactory.eINSTANCE;
  
  @Override
  public EventOccurrence createEventOccurrence() {
    return adaptersFactory.createEventOccurrenceAdapter(statemachinesexecutiondataAdaptee.createEventOccurrence(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getStatemachinesexecutiondataPackage();
  }
  
  public StatemachinesexecutiondataPackage getStatemachinesexecutiondataPackage() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.StatemachinesexecutiondataPackage.eINSTANCE;
  }
}
