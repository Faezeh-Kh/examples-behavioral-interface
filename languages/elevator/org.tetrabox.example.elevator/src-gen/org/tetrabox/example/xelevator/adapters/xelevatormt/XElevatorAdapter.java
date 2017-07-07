package org.tetrabox.example.xelevator.adapters.xelevatormt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.tetrabox.example.XElevatorMT;
import org.tetrabox.example.xelevatormt.elevator.ElevatorFactory;

@SuppressWarnings("all")
public class XElevatorAdapter extends ResourceAdapter implements XElevatorMT {
  public XElevatorAdapter() {
    super(org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ElevatorFactory getElevatorFactory() {
    return new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getElevatorFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
