package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Expression;

@SuppressWarnings("all")
public class ModuleSetAdapter extends EObjectAdapter<ModuleSet> implements org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleSet {
  private XArduinoMTAdaptersFactory adaptersFactory;
  
  public ModuleSetAdapter() {
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
  public void execute() {
    org.gemoc.arduino.sequential.xarduino.aspects.ModuleSetAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getModuleSet();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_SET__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_SET__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_SET__VALUE:
    		setValue(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
