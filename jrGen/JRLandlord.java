/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRLandlord
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

	public Cap_ext_ op_customerLeft_CustomerTovoid;
	public Cap_ext_ JRget_op_customerLeft_CustomerTovoid() {
		return op_customerLeft_CustomerTovoid;
	}
	public void JRset_op_customerLeft_CustomerTovoid(Cap_ext_ op_customerLeft_CustomerTovoid) {
		this.op_customerLeft_CustomerTovoid = op_customerLeft_CustomerTovoid;
	}

	public Cap_ext_ op_lastCall_voidTovoid;
	public Cap_ext_ JRget_op_lastCall_voidTovoid() {
		return op_lastCall_voidTovoid;
	}
	public void JRset_op_lastCall_voidTovoid(Cap_ext_ op_lastCall_voidTovoid) {
		this.op_lastCall_voidTovoid = op_lastCall_voidTovoid;
	}

	public Cap_ext_ op_closingTime_voidTovoid;
	public Cap_ext_ JRget_op_closingTime_voidTovoid() {
		return op_closingTime_voidTovoid;
	}
	public void JRset_op_closingTime_voidTovoid(Cap_ext_ op_closingTime_voidTovoid) {
		this.op_closingTime_voidTovoid = op_closingTime_voidTovoid;
	}

	public JRLandlord(JRLandlord copy)
	{
	    super(copy);
	this.op_run_voidTovoid = copy.op_run_voidTovoid;
	this.op_customerLeft_CustomerTovoid = copy.op_customerLeft_CustomerTovoid;
	this.op_lastCall_voidTovoid = copy.op_lastCall_voidTovoid;
	this.op_closingTime_voidTovoid = copy.op_closingTime_voidTovoid;

	}
	public JRLandlord(JRServicePerson superresref, Object ... opSig)
	{
	    super(superresref);
	this.op_run_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_customerLeft_CustomerTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_lastCall_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_closingTime_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRLandlord(boolean dummy)	{
	    super(dummy);
	this.op_run_voidTovoid = Cap_ext_.noop;
	this.op_customerLeft_CustomerTovoid = Cap_ext_.noop;
	this.op_lastCall_voidTovoid = Cap_ext_.noop;
	this.op_closingTime_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRLandlord(true);
	}
    }
