/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRPub
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_run_voidTovoid;
	public Cap_ext_ JRget_op_run_voidTovoid() {
		return op_run_voidTovoid;
	}
	public void JRset_op_run_voidTovoid(Cap_ext_ op_run_voidTovoid) {
		this.op_run_voidTovoid = op_run_voidTovoid;
	}

	public JRPub(JRPub copy)
	{
	this.op_run_voidTovoid = copy.op_run_voidTovoid;

	}
	public JRPub(Object ... opSig)
	{
	this.op_run_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);

	}
	public JRPub(boolean dummy)	{
	    super(dummy);
	this.op_run_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRPub(true);
	}
    }
