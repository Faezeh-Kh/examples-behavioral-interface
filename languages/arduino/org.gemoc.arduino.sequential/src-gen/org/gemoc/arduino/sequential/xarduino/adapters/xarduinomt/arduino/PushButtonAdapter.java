package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.PushButton;

@SuppressWarnings("all")
public class PushButtonAdapter extends EObjectAdapter<PushButton> implements org.gemoc.arduino.sequential.xarduinomt.arduino.PushButton {
  private XArduinoMTAdaptersFactory adaptersFactory;
  
  public PushButtonAdapter() {
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
  public void press() {
    org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspect.press(adaptee);
  }
  
  @Override
  public void release() {
    org.gemoc.arduino.sequential.xarduino.aspects.PushButtonAspect.release(adaptee);
  }
  
  @Override
  public Integer getLevel() {
    return org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspect.level(adaptee);
  }
  
  @Override
  public void setLevel(final Integer level) {
    org.gemoc.arduino.sequential.xarduino.aspects.ModuleAspect.level(adaptee, level
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static Integer LEVEL_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getPushButton();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PUSH_BUTTON__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PUSH_BUTTON__LEVEL:
    		return getLevel();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PUSH_BUTTON__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PUSH_BUTTON__LEVEL:
    		return getLevel() != LEVEL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PUSH_BUTTON__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PUSH_BUTTON__LEVEL:
    		setLevel(
    		(java.lang.Integer)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
