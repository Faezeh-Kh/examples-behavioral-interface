package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryExpressionAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ConstantAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ControlAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DelayAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IfAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InputModuleAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InstructionAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LedAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleGetAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleSetAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.NamedElementAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.OutputModuleAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ProjectAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PushButtonAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SetLedAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryExpressionAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WaitForAdapter;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WhileAdapter;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.Block;
import org.gemoc.arduino.sequential.xarduino.arduino.Board;
import org.gemoc.arduino.sequential.xarduino.arduino.Constant;
import org.gemoc.arduino.sequential.xarduino.arduino.Control;
import org.gemoc.arduino.sequential.xarduino.arduino.Delay;
import org.gemoc.arduino.sequential.xarduino.arduino.Expression;
import org.gemoc.arduino.sequential.xarduino.arduino.If;
import org.gemoc.arduino.sequential.xarduino.arduino.InputModule;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;
import org.gemoc.arduino.sequential.xarduino.arduino.Led;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleSet;
import org.gemoc.arduino.sequential.xarduino.arduino.NamedElement;
import org.gemoc.arduino.sequential.xarduino.arduino.OutputModule;
import org.gemoc.arduino.sequential.xarduino.arduino.Project;
import org.gemoc.arduino.sequential.xarduino.arduino.PushButton;
import org.gemoc.arduino.sequential.xarduino.arduino.SetLed;
import org.gemoc.arduino.sequential.xarduino.arduino.Sketch;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.WaitFor;
import org.gemoc.arduino.sequential.xarduino.arduino.While;

@SuppressWarnings("all")
public class XArduinoMTAdaptersFactory implements AdaptersFactory {
  private static XArduinoMTAdaptersFactory instance;
  
  public static XArduinoMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XArduinoMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Project){
    	return createProjectAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Project) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Board){
    	return createBoardAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Board) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Led){
    	return createLedAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Led) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.PushButton){
    	return createPushButtonAdapter((org.gemoc.arduino.sequential.xarduino.arduino.PushButton) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Sketch){
    	return createSketchAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Sketch) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Block){
    	return createBlockAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Block) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.If){
    	return createIfAdapter((org.gemoc.arduino.sequential.xarduino.arduino.If) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.While){
    	return createWhileAdapter((org.gemoc.arduino.sequential.xarduino.arduino.While) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.SetLed){
    	return createSetLedAdapter((org.gemoc.arduino.sequential.xarduino.arduino.SetLed) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Delay){
    	return createDelayAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Delay) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.WaitFor){
    	return createWaitForAdapter((org.gemoc.arduino.sequential.xarduino.arduino.WaitFor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Constant){
    	return createConstantAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Constant) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression){
    	return createUnaryExpressionAdapter((org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression){
    	return createBinaryExpressionAdapter((org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet){
    	return createModuleGetAdapter((org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet) o, res);
    }
    
    return null;
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.NamedElementAdapter) adapter;
    }
  }
  
  public ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ProjectAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ProjectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ProjectAdapter) adapter;
    }
  }
  
  public BoardAdapter createBoardAdapter(final Board adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter) adapter;
    }
  }
  
  public ModuleAdapter createModuleAdapter(final org.gemoc.arduino.sequential.xarduino.arduino.Module adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter) adapter;
    }
  }
  
  public OutputModuleAdapter createOutputModuleAdapter(final OutputModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.OutputModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.OutputModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.OutputModuleAdapter) adapter;
    }
  }
  
  public LedAdapter createLedAdapter(final Led adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LedAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LedAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LedAdapter) adapter;
    }
  }
  
  public InputModuleAdapter createInputModuleAdapter(final InputModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InputModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InputModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InputModuleAdapter) adapter;
    }
  }
  
  public PushButtonAdapter createPushButtonAdapter(final PushButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PushButtonAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PushButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PushButtonAdapter) adapter;
    }
  }
  
  public SketchAdapter createSketchAdapter(final Sketch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter) adapter;
    }
  }
  
  public InstructionAdapter createInstructionAdapter(final Instruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InstructionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InstructionAdapter) adapter;
    }
  }
  
  public ControlAdapter createControlAdapter(final Control adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ControlAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ControlAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ControlAdapter) adapter;
    }
  }
  
  public IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IfAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IfAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IfAdapter) adapter;
    }
  }
  
  public WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WhileAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WhileAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WhileAdapter) adapter;
    }
  }
  
  public ModuleSetAdapter createModuleSetAdapter(final ModuleSet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleSetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleSetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleSetAdapter) adapter;
    }
  }
  
  public SetLedAdapter createSetLedAdapter(final SetLed adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SetLedAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SetLedAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SetLedAdapter) adapter;
    }
  }
  
  public DelayAdapter createDelayAdapter(final Delay adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DelayAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DelayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DelayAdapter) adapter;
    }
  }
  
  public WaitForAdapter createWaitForAdapter(final WaitFor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WaitForAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WaitForAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WaitForAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter) adapter;
    }
  }
  
  public ConstantAdapter createConstantAdapter(final Constant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ConstantAdapter) adapter;
    }
  }
  
  public UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryExpressionAdapter) adapter;
    }
  }
  
  public BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryExpressionAdapter) adapter;
    }
  }
  
  public ModuleGetAdapter createModuleGetAdapter(final ModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleGetAdapter) adapter;
    }
  }
}
