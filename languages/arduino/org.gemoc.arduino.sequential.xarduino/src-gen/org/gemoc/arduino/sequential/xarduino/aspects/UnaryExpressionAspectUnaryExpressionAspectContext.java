package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.UnaryExpressionAspectUnaryExpressionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression;

@SuppressWarnings("all")
public class UnaryExpressionAspectUnaryExpressionAspectContext {
  public final static UnaryExpressionAspectUnaryExpressionAspectContext INSTANCE = new UnaryExpressionAspectUnaryExpressionAspectContext();
  
  public static UnaryExpressionAspectUnaryExpressionAspectProperties getSelf(final UnaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.UnaryExpressionAspectUnaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<UnaryExpression, UnaryExpressionAspectUnaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression, org.gemoc.arduino.sequential.xarduino.aspects.UnaryExpressionAspectUnaryExpressionAspectProperties>();
  
  public Map<UnaryExpression, UnaryExpressionAspectUnaryExpressionAspectProperties> getMap() {
    return map;
  }
}
