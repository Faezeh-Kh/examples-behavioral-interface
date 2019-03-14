package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.gemoc.arduino.sequential.xarduino.aspects.BlockAspectBlockAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.InstructionAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.Block;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect {
  public static void execute(final Block _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.BlockAspectBlockAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.BlockAspectBlockAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  protected static void _privk3_execute(final BlockAspectBlockAspectProperties _self_, final Block _self) {
    final Consumer<Instruction> _function = (Instruction i) -> {
      InstructionAspect.execute(i);
    };
    _self.getInstructions().forEach(_function);
  }
}
