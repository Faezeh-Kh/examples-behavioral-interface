package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.SetLed;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Expression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Led;

@SuppressWarnings("all")
public class SetLedAdapter extends EObjectAdapter<SetLed> implements org.gemoc.arduino.sequential.xarduinomt.arduino.SetLed {
  private XArduinoMTAdaptersFactory adaptersFactory;
  
  public SetLedAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getValue() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final Expression o) {
    if (o != null)
    	adaptee.setValue(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public Led getLed() {
    return (Led) adaptersFactory.createAdapter(adaptee.getLed(), eResource);
  }
  
  @Override
  public void setLed(final Led o) {
    if (o != null)
    	adaptee.setLed(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LedAdapter) o).getAdaptee());
    else adaptee.setLed(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.sequential.xarduino.aspects.SetLedAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getSetLed();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SET_LED__VALUE:
    		return getValue();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SET_LED__LED:
    		return getLed();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SET_LED__VALUE:
    		return getValue() != null;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SET_LED__LED:
    		return getLed() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SET_LED__VALUE:
    		setValue(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Expression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.SET_LED__LED:
    		setLed(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Led)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
