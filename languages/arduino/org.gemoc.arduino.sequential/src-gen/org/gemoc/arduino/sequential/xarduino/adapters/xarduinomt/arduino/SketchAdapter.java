package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.Sketch;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Block;

@SuppressWarnings("all")
public class SketchAdapter extends EObjectAdapter<Sketch> implements org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch {
  private XArduinoMTAdaptersFactory adaptersFactory;
  
  public SketchAdapter() {
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
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.sequential.xarduino.aspects.SketchAspect.execute(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getSketch();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		setBlock(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
