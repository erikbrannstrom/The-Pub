/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRTable
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_server_voidTovoid;
	public Cap_ext_ JRget_op_server_voidTovoid() {
		return op_server_voidTovoid;
	}
	public void JRset_op_server_voidTovoid(Cap_ext_ op_server_voidTovoid) {
		this.op_server_voidTovoid = op_server_voidTovoid;
	}

	public Cap_ext_ op_clean_voidTojavadotutildotList;
	public Cap_ext_ JRget_op_clean_voidTojavadotutildotList() {
		return op_clean_voidTojavadotutildotList;
	}
	public void JRset_op_clean_voidTojavadotutildotList(Cap_ext_ op_clean_voidTojavadotutildotList) {
		this.op_clean_voidTojavadotutildotList = op_clean_voidTojavadotutildotList;
	}

	public Cap_ext_ op_putDown_Cap_voidTovoidXContainerToboolean;
	public Cap_ext_ JRget_op_putDown_Cap_voidTovoidXContainerToboolean() {
		return op_putDown_Cap_voidTovoidXContainerToboolean;
	}
	public void JRset_op_putDown_Cap_voidTovoidXContainerToboolean(Cap_ext_ op_putDown_Cap_voidTovoidXContainerToboolean) {
		this.op_putDown_Cap_voidTovoidXContainerToboolean = op_putDown_Cap_voidTovoidXContainerToboolean;
	}

	public JRTable(JRTable copy)
	{
	this.op_server_voidTovoid = copy.op_server_voidTovoid;
	this.op_clean_voidTojavadotutildotList = copy.op_clean_voidTojavadotutildotList;
	this.op_putDown_Cap_voidTovoidXContainerToboolean = copy.op_putDown_Cap_voidTovoidXContainerToboolean;

	}
	public JRTable(Object ... opSig)
	{
	this.op_server_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_clean_voidTojavadotutildotList = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_putDown_Cap_voidTovoidXContainerToboolean = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRTable(boolean dummy)	{
	    super(dummy);
	this.op_server_voidTovoid = Cap_ext_.noop;
	this.op_clean_voidTojavadotutildotList = Cap_ext_.noop;
	this.op_putDown_Cap_voidTovoidXContainerToboolean = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRTable(true);
	}
    }
