package org.tetrabox.examples.statemachines;

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
    	statemachines.StatemachinesPackage.eNS_URI,
    	statemachines.StatemachinesPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage.eNS_URI,
    	org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor stateMachines = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.tetrabox.examples.statemachines.StateMachines", "", "statemachines", "org.tetrabox.examples.statemachines.StateMachinesMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.tetrabox.examples.statemachines.StateMachines",
    	stateMachines
    );
    MelangeRegistry.LanguageDescriptor interpretedStateMachines = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.tetrabox.examples.statemachines.InterpretedStateMachines", "", "http://org.tetrabox.examples.statemachines.interpretedstatemachines/statemachines/", "org.tetrabox.examples.statemachines.InterpretedStateMachinesMT"
    );
    interpretedStateMachines.addAdapter("org.tetrabox.examples.statemachines.StateMachinesMT", org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.InterpretedStateMachinesAdapter.class);
    interpretedStateMachines.addAdapter("org.tetrabox.examples.statemachines.InterpretedStateMachinesMT", org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.tetrabox.examples.statemachines.InterpretedStateMachines",
    	interpretedStateMachines
    );
    MelangeRegistry.ModelTypeDescriptor stateMachinesMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.tetrabox.examples.statemachines.StateMachinesMT", "", "http://org.tetrabox.examples.statemachines.statemachinesmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.tetrabox.examples.statemachines.StateMachinesMT",
    	stateMachinesMT
    );
    MelangeRegistry.ModelTypeDescriptor interpretedStateMachinesMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.tetrabox.examples.statemachines.InterpretedStateMachinesMT", "", "http://org.tetrabox.examples.statemachines.interpretedstatemachinesmt/"
    );
    interpretedStateMachinesMT.addSuperType("org.tetrabox.examples.statemachines.StateMachinesMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.tetrabox.examples.statemachines.InterpretedStateMachinesMT",
    	interpretedStateMachinesMT
    );
  }
}
