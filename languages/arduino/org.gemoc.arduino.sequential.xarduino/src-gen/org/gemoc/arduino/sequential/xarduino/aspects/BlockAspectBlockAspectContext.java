package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.BlockAspectBlockAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Block;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public final static BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();
  
  public static BlockAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.BlockAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Block, BlockAspectBlockAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Block, org.gemoc.arduino.sequential.xarduino.aspects.BlockAspectBlockAspectProperties>();
  
  public Map<Block, BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
