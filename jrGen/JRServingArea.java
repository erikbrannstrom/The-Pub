/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRServingArea
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_order_Cap_ContainerTovoidXPubdotDrinkTovoid;
	public Cap_ext_ JRget_op_order_Cap_ContainerTovoidXPubdotDrinkTovoid() {
		return op_order_Cap_ContainerTovoidXPubdotDrinkTovoid;
	}
	public void JRset_op_order_Cap_ContainerTovoidXPubdotDrinkTovoid(Cap_ext_ op_order_Cap_ContainerTovoidXPubdotDrinkTovoid) {
		this.op_order_Cap_ContainerTovoidXPubdotDrinkTovoid = op_order_Cap_ContainerTovoidXPubdotDrinkTovoid;
	}

	public JRServingArea(JRServingArea copy)
	{
	this.op_order_Cap_ContainerTovoidXPubdotDrinkTovoid = copy.op_order_Cap_ContainerTovoidXPubdotDrinkTovoid;

	}
	public JRServingArea(Object ... opSig)
	{
	this.op_order_Cap_ContainerTovoidXPubdotDrinkTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);

	}
	public JRServingArea(boolean dummy)	{
	    super(dummy);
	this.op_order_Cap_ContainerTovoidXPubdotDrinkTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRServingArea(true);
	}
    }
