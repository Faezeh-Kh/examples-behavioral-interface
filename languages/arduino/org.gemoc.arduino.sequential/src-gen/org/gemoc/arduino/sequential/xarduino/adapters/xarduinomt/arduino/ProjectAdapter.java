package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.Project;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Board;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements org.gemoc.arduino.sequential.xarduinomt.arduino.Project {
  private XArduinoMTAdaptersFactory adaptersFactory;
  
  public ProjectAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public Board getBoard() {
    return (Board) adaptersFactory.createAdapter(adaptee.getBoard(), eResource);
  }
  
  @Override
  public void setBoard(final Board o) {
    if (o != null)
    	adaptee.setBoard(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter) o).getAdaptee());
    else adaptee.setBoard(null);
  }
  
  @Override
  public Sketch getSketch() {
    return (Sketch) adaptersFactory.createAdapter(adaptee.getSketch(), eResource);
  }
  
  @Override
  public void setSketch(final Sketch o) {
    if (o != null)
    	adaptee.setSketch(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter) o).getAdaptee());
    else adaptee.setSketch(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getProject();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__BOARD:
    		return getBoard();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		return getSketch();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__BOARD:
    		return getBoard() != null;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		return getSketch() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__BOARD:
    		setBoard(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Board)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		setSketch(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
