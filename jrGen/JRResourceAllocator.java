/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRResourceAllocator
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

	public Cap_ext_ op_release_javadotlangdotObjectTovoid;
	public Cap_ext_ JRget_op_release_javadotlangdotObjectTovoid() {
		return op_release_javadotlangdotObjectTovoid;
	}
	public void JRset_op_release_javadotlangdotObjectTovoid(Cap_ext_ op_release_javadotlangdotObjectTovoid) {
		this.op_release_javadotlangdotObjectTovoid = op_release_javadotlangdotObjectTovoid;
	}

	public Cap_ext_ op_allocate_voidTojavadotlangdotObject;
	public Cap_ext_ JRget_op_allocate_voidTojavadotlangdotObject() {
		return op_allocate_voidTojavadotlangdotObject;
	}
	public void JRset_op_allocate_voidTojavadotlangdotObject(Cap_ext_ op_allocate_voidTojavadotlangdotObject) {
		this.op_allocate_voidTojavadotlangdotObject = op_allocate_voidTojavadotlangdotObject;
	}

	public JRResourceAllocator(JRResourceAllocator copy)
	{
	this.op_server_voidTovoid = copy.op_server_voidTovoid;
	this.op_release_javadotlangdotObjectTovoid = copy.op_release_javadotlangdotObjectTovoid;
	this.op_allocate_voidTojavadotlangdotObject = copy.op_allocate_voidTojavadotlangdotObject;

	}
	public JRResourceAllocator(Object ... opSig)
	{
	this.op_server_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_release_javadotlangdotObjectTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_allocate_voidTojavadotlangdotObject = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRResourceAllocator(boolean dummy)	{
	    super(dummy);
	this.op_server_voidTovoid = Cap_ext_.noop;
	this.op_release_javadotlangdotObjectTovoid = Cap_ext_.noop;
	this.op_allocate_voidTojavadotlangdotObject = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRResourceAllocator(true);
	}
    }
