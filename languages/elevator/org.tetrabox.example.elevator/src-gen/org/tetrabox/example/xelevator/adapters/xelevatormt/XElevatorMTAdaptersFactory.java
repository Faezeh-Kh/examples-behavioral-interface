package org.tetrabox.example.xelevator.adapters.xelevatormt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ButtonAdapter;
import org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.DownButtonAdapter;
import org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorAdapter;
import org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorButtonAdapter;
import org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorSystemAdapter;
import org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorAdapter;
import org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorButtonAdapter;
import org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.UpButtonAdapter;
import org.tetrabox.example.xelevator.elevator.Button;
import org.tetrabox.example.xelevator.elevator.DownButton;
import org.tetrabox.example.xelevator.elevator.Elevator;
import org.tetrabox.example.xelevator.elevator.ElevatorButton;
import org.tetrabox.example.xelevator.elevator.ElevatorSystem;
import org.tetrabox.example.xelevator.elevator.Floor;
import org.tetrabox.example.xelevator.elevator.FloorButton;
import org.tetrabox.example.xelevator.elevator.UpButton;

@SuppressWarnings("all")
public class XElevatorMTAdaptersFactory implements AdaptersFactory {
  private static XElevatorMTAdaptersFactory instance;
  
  public static XElevatorMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XElevatorMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.tetrabox.example.xelevator.elevator.Floor){
    	return createFloorAdapter((org.tetrabox.example.xelevator.elevator.Floor) o, res);
    }
    if (o instanceof org.tetrabox.example.xelevator.elevator.Elevator){
    	return createElevatorAdapter((org.tetrabox.example.xelevator.elevator.Elevator) o, res);
    }
    if (o instanceof org.tetrabox.example.xelevator.elevator.ElevatorButton){
    	return createElevatorButtonAdapter((org.tetrabox.example.xelevator.elevator.ElevatorButton) o, res);
    }
    if (o instanceof org.tetrabox.example.xelevator.elevator.UpButton){
    	return createUpButtonAdapter((org.tetrabox.example.xelevator.elevator.UpButton) o, res);
    }
    if (o instanceof org.tetrabox.example.xelevator.elevator.DownButton){
    	return createDownButtonAdapter((org.tetrabox.example.xelevator.elevator.DownButton) o, res);
    }
    if (o instanceof org.tetrabox.example.xelevator.elevator.ElevatorSystem){
    	return createElevatorSystemAdapter((org.tetrabox.example.xelevator.elevator.ElevatorSystem) o, res);
    }
    
    return null;
  }
  
  public FloorAdapter createFloorAdapter(final Floor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorAdapter) adapter;
    }
  }
  
  public ButtonAdapter createButtonAdapter(final Button adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ButtonAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ButtonAdapter) adapter;
    }
  }
  
  public ElevatorAdapter createElevatorAdapter(final Elevator adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorAdapter) adapter;
    }
  }
  
  public ElevatorButtonAdapter createElevatorButtonAdapter(final ElevatorButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorButtonAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorButtonAdapter) adapter;
    }
  }
  
  public FloorButtonAdapter createFloorButtonAdapter(final FloorButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorButtonAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.FloorButtonAdapter) adapter;
    }
  }
  
  public UpButtonAdapter createUpButtonAdapter(final UpButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.UpButtonAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.UpButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.UpButtonAdapter) adapter;
    }
  }
  
  public DownButtonAdapter createDownButtonAdapter(final DownButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.DownButtonAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.DownButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.DownButtonAdapter) adapter;
    }
  }
  
  public ElevatorSystemAdapter createElevatorSystemAdapter(final ElevatorSystem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorSystemAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorSystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.xelevator.adapters.xelevatormt.elevator.ElevatorSystemAdapter) adapter;
    }
  }
}
