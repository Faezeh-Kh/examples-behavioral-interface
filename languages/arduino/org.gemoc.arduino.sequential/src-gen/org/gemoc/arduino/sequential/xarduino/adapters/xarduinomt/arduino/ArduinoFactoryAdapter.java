package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoFactory;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.xarduinomt.arduino.BinaryExpression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Block;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Board;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Constant;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Delay;
import org.gemoc.arduino.sequential.xarduinomt.arduino.If;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Led;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleGet;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Project;
import org.gemoc.arduino.sequential.xarduinomt.arduino.PushButton;
import org.gemoc.arduino.sequential.xarduinomt.arduino.SetLed;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch;
import org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.WaitFor;
import org.gemoc.arduino.sequential.xarduinomt.arduino.While;

@SuppressWarnings("all")
public class ArduinoFactoryAdapter extends EFactoryImpl implements ArduinoFactory {
  private XArduinoMTAdaptersFactory adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  
  private org.gemoc.arduino.sequential.xarduino.arduino.ArduinoFactory arduinoAdaptee = org.gemoc.arduino.sequential.xarduino.arduino.ArduinoFactory.eINSTANCE;
  
  @Override
  public Project createProject() {
    return adaptersFactory.createProjectAdapter(arduinoAdaptee.createProject(), null);
  }
  
  @Override
  public Board createBoard() {
    return adaptersFactory.createBoardAdapter(arduinoAdaptee.createBoard(), null);
  }
  
  @Override
  public Led createLed() {
    return adaptersFactory.createLedAdapter(arduinoAdaptee.createLed(), null);
  }
  
  @Override
  public PushButton createPushButton() {
    return adaptersFactory.createPushButtonAdapter(arduinoAdaptee.createPushButton(), null);
  }
  
  @Override
  public Sketch createSketch() {
    return adaptersFactory.createSketchAdapter(arduinoAdaptee.createSketch(), null);
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(arduinoAdaptee.createBlock(), null);
  }
  
  @Override
  public If createIf() {
    return adaptersFactory.createIfAdapter(arduinoAdaptee.createIf(), null);
  }
  
  @Override
  public While createWhile() {
    return adaptersFactory.createWhileAdapter(arduinoAdaptee.createWhile(), null);
  }
  
  @Override
  public SetLed createSetLed() {
    return adaptersFactory.createSetLedAdapter(arduinoAdaptee.createSetLed(), null);
  }
  
  @Override
  public Delay createDelay() {
    return adaptersFactory.createDelayAdapter(arduinoAdaptee.createDelay(), null);
  }
  
  @Override
  public WaitFor createWaitFor() {
    return adaptersFactory.createWaitForAdapter(arduinoAdaptee.createWaitFor(), null);
  }
  
  @Override
  public Constant createConstant() {
    return adaptersFactory.createConstantAdapter(arduinoAdaptee.createConstant(), null);
  }
  
  @Override
  public UnaryExpression createUnaryExpression() {
    return adaptersFactory.createUnaryExpressionAdapter(arduinoAdaptee.createUnaryExpression(), null);
  }
  
  @Override
  public BinaryExpression createBinaryExpression() {
    return adaptersFactory.createBinaryExpressionAdapter(arduinoAdaptee.createBinaryExpression(), null);
  }
  
  @Override
  public ModuleGet createModuleGet() {
    return adaptersFactory.createModuleGetAdapter(arduinoAdaptee.createModuleGet(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getArduinoPackage();
  }
  
  public ArduinoPackage getArduinoPackage() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE;
  }
}
