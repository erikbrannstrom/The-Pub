/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public class ServingArea extends java.lang.Object {
    { JRinit(); }
    private ResourceAllocator beerTap;
    private Cupboard cupboard;
    public Op_ext.JRProxyOp JRget_op_order_Cap_ContainerTovoidXPubdotDrinkTovoid()
    {
        return op_order_Cap_ContainerTovoidXPubdotDrinkTovoid;
    }
    
    public Op_ext.JRProxyOp op_order_Cap_ContainerTovoidXPubdotDrinkTovoid;
    
    
    public ServingArea() {
        // Begin Expr2
        super();
        // Begin Expr2
        this.beerTap = new ResourceAllocator(new Ingredient());
        // Begin Expr2
        this.cupboard = new Cupboard();
        JRprocess();
    }
    
    public ResourceAllocator getBeerTapAllocator() {
        // Return
        return (this.beerTap);
        // End Return

    }
    
    public Cupboard getCupboard() {
        // Return
        return (this.cupboard);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRServingArea jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_order_Cap_ContainerTovoidXPubdotDrinkTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRServingArea(op_order_Cap_ContainerTovoidXPubdotDrinkTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
