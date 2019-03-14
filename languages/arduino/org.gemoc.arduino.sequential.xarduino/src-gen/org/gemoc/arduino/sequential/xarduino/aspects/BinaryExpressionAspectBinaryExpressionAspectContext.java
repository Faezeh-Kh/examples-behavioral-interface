package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression;

@SuppressWarnings("all")
public class BinaryExpressionAspectBinaryExpressionAspectContext {
  public final static BinaryExpressionAspectBinaryExpressionAspectContext INSTANCE = new BinaryExpressionAspectBinaryExpressionAspectContext();
  
  public static BinaryExpressionAspectBinaryExpressionAspectProperties getSelf(final BinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryExpression, BinaryExpressionAspectBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression, org.gemoc.arduino.sequential.xarduino.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties>();
  
  public Map<BinaryExpression, BinaryExpressionAspectBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
