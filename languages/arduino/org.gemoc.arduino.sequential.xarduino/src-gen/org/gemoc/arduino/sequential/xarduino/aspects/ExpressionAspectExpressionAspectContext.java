package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspectExpressionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Expression;

@SuppressWarnings("all")
public class ExpressionAspectExpressionAspectContext {
  public final static ExpressionAspectExpressionAspectContext INSTANCE = new ExpressionAspectExpressionAspectContext();
  
  public static ExpressionAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, ExpressionAspectExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Expression, org.gemoc.arduino.sequential.xarduino.aspects.ExpressionAspectExpressionAspectProperties>();
  
  public Map<Expression, ExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
