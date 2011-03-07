/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRCustomer
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

	public Cap_ext_ op_getOrder_ContainerTovoid;
	public Cap_ext_ JRget_op_getOrder_ContainerTovoid() {
		return op_getOrder_ContainerTovoid;
	}
	public void JRset_op_getOrder_ContainerTovoid(Cap_ext_ op_getOrder_ContainerTovoid) {
		this.op_getOrder_ContainerTovoid = op_getOrder_ContainerTovoid;
	}

	public Cap_ext_ op_leave_voidTovoid;
	public Cap_ext_ JRget_op_leave_voidTovoid() {
		return op_leave_voidTovoid;
	}
	public void JRset_op_leave_voidTovoid(Cap_ext_ op_leave_voidTovoid) {
		this.op_leave_voidTovoid = op_leave_voidTovoid;
	}

	public Cap_ext_ op_leftDrink_voidTovoid;
	public Cap_ext_ JRget_op_leftDrink_voidTovoid() {
		return op_leftDrink_voidTovoid;
	}
	public void JRset_op_leftDrink_voidTovoid(Cap_ext_ op_leftDrink_voidTovoid) {
		this.op_leftDrink_voidTovoid = op_leftDrink_voidTovoid;
	}

	public Cap_ext_ op_finishedDrink_voidTovoid;
	public Cap_ext_ JRget_op_finishedDrink_voidTovoid() {
		return op_finishedDrink_voidTovoid;
	}
	public void JRset_op_finishedDrink_voidTovoid(Cap_ext_ op_finishedDrink_voidTovoid) {
		this.op_finishedDrink_voidTovoid = op_finishedDrink_voidTovoid;
	}

	public Cap_ext_ op_lastCall_voidTovoid;
	public Cap_ext_ JRget_op_lastCall_voidTovoid() {
		return op_lastCall_voidTovoid;
	}
	public void JRset_op_lastCall_voidTovoid(Cap_ext_ op_lastCall_voidTovoid) {
		this.op_lastCall_voidTovoid = op_lastCall_voidTovoid;
	}

	public JRCustomer(JRCustomer copy)
	{
	this.op_run_voidTovoid = copy.op_run_voidTovoid;
	this.op_getOrder_ContainerTovoid = copy.op_getOrder_ContainerTovoid;
	this.op_leave_voidTovoid = copy.op_leave_voidTovoid;
	this.op_leftDrink_voidTovoid = copy.op_leftDrink_voidTovoid;
	this.op_finishedDrink_voidTovoid = copy.op_finishedDrink_voidTovoid;
	this.op_lastCall_voidTovoid = copy.op_lastCall_voidTovoid;

	}
	public JRCustomer(Object ... opSig)
	{
	this.op_run_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_getOrder_ContainerTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_leave_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_leftDrink_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_finishedDrink_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_lastCall_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);

	}
	public JRCustomer(boolean dummy)	{
	    super(dummy);
	this.op_run_voidTovoid = Cap_ext_.noop;
	this.op_getOrder_ContainerTovoid = Cap_ext_.noop;
	this.op_leave_voidTovoid = Cap_ext_.noop;
	this.op_leftDrink_voidTovoid = Cap_ext_.noop;
	this.op_finishedDrink_voidTovoid = Cap_ext_.noop;
	this.op_lastCall_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRCustomer(true);
	}
    }
