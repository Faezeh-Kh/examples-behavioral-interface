package org.tetrabox.example;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.tetrabox.example.xelevator.elevator.ElevatorPackage.eNS_URI,
    	org.tetrabox.example.xelevator.elevator.ElevatorPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xElevator = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.tetrabox.example.XElevator", "", "http://org.tetrabox.example.xelevator/elevator/", "org.tetrabox.example.XElevatorMT"
    );
    xElevator.addAdapter("org.tetrabox.example.XElevatorMT", org.tetrabox.example.xelevator.adapters.xelevatormt.XElevatorAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.tetrabox.example.XElevator",
    	xElevator
    );
    MelangeRegistry.ModelTypeDescriptor xElevatorMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.tetrabox.example.XElevatorMT", "", "http://org.tetrabox.example.xelevatormt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.tetrabox.example.XElevatorMT",
    	xElevatorMT
    );
  }
}
