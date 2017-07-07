package org.tetrabox.example;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.tetrabox.example.xelevatormt.elevator.ElevatorFactory;

@SuppressWarnings("all")
public interface XElevatorMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ElevatorFactory getElevatorFactory();
  
  public abstract void save(final String uri) throws IOException;
}
