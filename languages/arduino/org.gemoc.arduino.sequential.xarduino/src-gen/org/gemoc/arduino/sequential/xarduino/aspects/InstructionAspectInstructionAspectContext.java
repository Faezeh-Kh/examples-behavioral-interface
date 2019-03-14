package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;

@SuppressWarnings("all")
public class InstructionAspectInstructionAspectContext {
  public final static InstructionAspectInstructionAspectContext INSTANCE = new InstructionAspectInstructionAspectContext();
  
  public static InstructionAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, InstructionAspectInstructionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Instruction, org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspectInstructionAspectProperties>();
  
  public Map<Instruction, InstructionAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
