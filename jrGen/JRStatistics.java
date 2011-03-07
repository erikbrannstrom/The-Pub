/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRStatistics
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

	public Cap_ext_ op_waitingTime_MyTimeTovoid;
	public Cap_ext_ JRget_op_waitingTime_MyTimeTovoid() {
		return op_waitingTime_MyTimeTovoid;
	}
	public void JRset_op_waitingTime_MyTimeTovoid(Cap_ext_ op_waitingTime_MyTimeTovoid) {
		this.op_waitingTime_MyTimeTovoid = op_waitingTime_MyTimeTovoid;
	}

	public JRStatistics(JRStatistics copy)
	{
	this.op_run_voidTovoid = copy.op_run_voidTovoid;
	this.op_waitingTime_MyTimeTovoid = copy.op_waitingTime_MyTimeTovoid;

	}
	public JRStatistics(Object ... opSig)
	{
	this.op_run_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_waitingTime_MyTimeTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRStatistics(boolean dummy)	{
	    super(dummy);
	this.op_run_voidTovoid = Cap_ext_.noop;
	this.op_waitingTime_MyTimeTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRStatistics(true);
	}
    }
