/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRBarmaid
      extends JRServicePerson
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

	public Cap_ext_ op_leave_voidTovoid;
	public Cap_ext_ JRget_op_leave_voidTovoid() {
		return op_leave_voidTovoid;
	}
	public void JRset_op_leave_voidTovoid(Cap_ext_ op_leave_voidTovoid) {
		this.op_leave_voidTovoid = op_leave_voidTovoid;
	}

	public JRBarmaid(JRBarmaid copy)
	{
	    super(copy);
	this.op_run_voidTovoid = copy.op_run_voidTovoid;
	this.op_leave_voidTovoid = copy.op_leave_voidTovoid;

	}
	public JRBarmaid(JRServicePerson superresref, Object ... opSig)
	{
	    super(superresref);
	this.op_run_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_leave_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRBarmaid(boolean dummy)	{
	    super(dummy);
	this.op_run_voidTovoid = Cap_ext_.noop;
	this.op_leave_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRBarmaid(true);
	}
    }
