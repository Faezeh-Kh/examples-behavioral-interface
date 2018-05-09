package org.tetrabox.examples.statemachines;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import statemachines.StatemachinesFactory;

@SuppressWarnings("all")
public interface StateMachinesMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract StatemachinesFactory getStatemachinesFactory();
  
  public abstract void save(final String uri) throws IOException;
}
