package org.tetrabox.examples.statemachines;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.tetrabox.examples.statemachines.InterpretedStateMachinesMT;
import org.tetrabox.examples.statemachines.StateMachinesMT;

@SuppressWarnings("all")
public class InterpretedStateMachines implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static InterpretedStateMachines load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    InterpretedStateMachines mm = new InterpretedStateMachines();
    mm.setResource(res);
    return mm ;
  }
  
  public StateMachinesMT toStateMachinesMT() {
    org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.InterpretedStateMachinesAdapter adaptee = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.InterpretedStateMachinesAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public InterpretedStateMachinesMT toInterpretedStateMachinesMT() {
    org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesAdapter adaptee = new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
