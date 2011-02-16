/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRClock
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_ticker_voidTovoid;
	public Cap_ext_ JRget_op_ticker_voidTovoid() {
		return op_ticker_voidTovoid;
	}
	public void JRset_op_ticker_voidTovoid(Cap_ext_ op_ticker_voidTovoid) {
		this.op_ticker_voidTovoid = op_ticker_voidTovoid;
	}

	public Cap_ext_ op_loop_voidTovoid;
	public Cap_ext_ JRget_op_loop_voidTovoid() {
		return op_loop_voidTovoid;
	}
	public void JRset_op_loop_voidTovoid(Cap_ext_ op_loop_voidTovoid) {
		this.op_loop_voidTovoid = op_loop_voidTovoid;
	}

	public Cap_ext_ op_stopTicker_voidTovoid;
	public Cap_ext_ JRget_op_stopTicker_voidTovoid() {
		return op_stopTicker_voidTovoid;
	}
	public void JRset_op_stopTicker_voidTovoid(Cap_ext_ op_stopTicker_voidTovoid) {
		this.op_stopTicker_voidTovoid = op_stopTicker_voidTovoid;
	}

	public Cap_ext_ op_tick_voidTovoid;
	public Cap_ext_ JRget_op_tick_voidTovoid() {
		return op_tick_voidTovoid;
	}
	public void JRset_op_tick_voidTovoid(Cap_ext_ op_tick_voidTovoid) {
		this.op_tick_voidTovoid = op_tick_voidTovoid;
	}

	public Cap_ext_ op_shutdown_voidTovoid;
	public Cap_ext_ JRget_op_shutdown_voidTovoid() {
		return op_shutdown_voidTovoid;
	}
	public void JRset_op_shutdown_voidTovoid(Cap_ext_ op_shutdown_voidTovoid) {
		this.op_shutdown_voidTovoid = op_shutdown_voidTovoid;
	}

	public Cap_ext_ op_setAlarmEndTime_Cap_voidTovoidTovoid;
	public Cap_ext_ JRget_op_setAlarmEndTime_Cap_voidTovoidTovoid() {
		return op_setAlarmEndTime_Cap_voidTovoidTovoid;
	}
	public void JRset_op_setAlarmEndTime_Cap_voidTovoidTovoid(Cap_ext_ op_setAlarmEndTime_Cap_voidTovoidTovoid) {
		this.op_setAlarmEndTime_Cap_voidTovoidTovoid = op_setAlarmEndTime_Cap_voidTovoidTovoid;
	}

	public Cap_ext_ op_setAlarm_Cap_voidTovoidXMyTimeTovoid;
	public Cap_ext_ JRget_op_setAlarm_Cap_voidTovoidXMyTimeTovoid() {
		return op_setAlarm_Cap_voidTovoidXMyTimeTovoid;
	}
	public void JRset_op_setAlarm_Cap_voidTovoidXMyTimeTovoid(Cap_ext_ op_setAlarm_Cap_voidTovoidXMyTimeTovoid) {
		this.op_setAlarm_Cap_voidTovoidXMyTimeTovoid = op_setAlarm_Cap_voidTovoidXMyTimeTovoid;
	}

	public Cap_ext_ op_getTime_voidToMyTime;
	public Cap_ext_ JRget_op_getTime_voidToMyTime() {
		return op_getTime_voidToMyTime;
	}
	public void JRset_op_getTime_voidToMyTime(Cap_ext_ op_getTime_voidToMyTime) {
		this.op_getTime_voidToMyTime = op_getTime_voidToMyTime;
	}

	public JRClock(JRClock copy)
	{
	this.op_ticker_voidTovoid = copy.op_ticker_voidTovoid;
	this.op_loop_voidTovoid = copy.op_loop_voidTovoid;
	this.op_stopTicker_voidTovoid = copy.op_stopTicker_voidTovoid;
	this.op_tick_voidTovoid = copy.op_tick_voidTovoid;
	this.op_shutdown_voidTovoid = copy.op_shutdown_voidTovoid;
	this.op_setAlarmEndTime_Cap_voidTovoidTovoid = copy.op_setAlarmEndTime_Cap_voidTovoidTovoid;
	this.op_setAlarm_Cap_voidTovoidXMyTimeTovoid = copy.op_setAlarm_Cap_voidTovoidXMyTimeTovoid;
	this.op_getTime_voidToMyTime = copy.op_getTime_voidToMyTime;

	}
	public JRClock(Object ... opSig)
	{
	this.op_ticker_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_loop_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_stopTicker_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_tick_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_shutdown_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_setAlarmEndTime_Cap_voidTovoidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_setAlarm_Cap_voidTovoidXMyTimeTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);
	this.op_getTime_voidToMyTime = new Cap_ext_((Op_ext_.JRProxyOp)opSig[7]);

	}
	public JRClock(boolean dummy)	{
	    super(dummy);
	this.op_ticker_voidTovoid = Cap_ext_.noop;
	this.op_loop_voidTovoid = Cap_ext_.noop;
	this.op_stopTicker_voidTovoid = Cap_ext_.noop;
	this.op_tick_voidTovoid = Cap_ext_.noop;
	this.op_shutdown_voidTovoid = Cap_ext_.noop;
	this.op_setAlarmEndTime_Cap_voidTovoidTovoid = Cap_ext_.noop;
	this.op_setAlarm_Cap_voidTovoidXMyTimeTovoid = Cap_ext_.noop;
	this.op_getTime_voidToMyTime = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRClock(true);
	}
    }
