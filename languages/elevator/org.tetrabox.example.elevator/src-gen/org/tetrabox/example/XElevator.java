package org.tetrabox.example;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.tetrabox.example.XElevatorMT;

@SuppressWarnings("all")
public class XElevator implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XElevator load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XElevator mm = new XElevator();
    mm.setResource(res);
    return mm ;
  }
  
  public XElevatorMT toXElevatorMT() {
    org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorAdapter adaptee = new org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
