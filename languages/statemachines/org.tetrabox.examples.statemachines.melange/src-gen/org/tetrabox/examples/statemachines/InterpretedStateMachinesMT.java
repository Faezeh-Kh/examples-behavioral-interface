package org.tetrabox.examples.statemachines;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachinesexecutiondata.StatemachinesexecutiondataFactory;

@SuppressWarnings("all")
public interface InterpretedStateMachinesMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract StatemachinesexecutiondataFactory getStatemachinesexecutiondataFactory();
  
  public abstract StatemachinesFactory getStatemachinesFactory();
  
  public abstract AlmostumlFactory getAlmostumlFactory();
  
  public abstract void save(final String uri) throws IOException;
}
