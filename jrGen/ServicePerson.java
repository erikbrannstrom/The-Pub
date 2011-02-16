/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public abstract class ServicePerson extends java.lang.Object {
    { JRinit(); }
    
    public ServicePerson() {
        // Begin Expr2
        super();
        JRprocess();
    }
    
    protected Container makeDrink(Pub.Drink type) {
        if (type == Pub.Drink.BEER) {
            Glass glass = ((Glass)((Glass) (new Cap_ext_(this.getCupboard().getGlassAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Glass")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Return
            return (glass);
            // End Return

        } else if (type == Pub.Drink.CAPPUCCINO) {
            Cup cup = ((Cup)((Cup) (new Cap_ext_(this.getCupboard().getCupAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Cup")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Return
            return (cup);
            // End Return

        } else {
            Cup cup = ((Cup)((Cup) (new Cap_ext_(this.getCupboard().getCupAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Cup")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Return
            return (cup);
            // End Return

        }
    }
    
    protected abstract Cupboard getCupboard();
    protected boolean JRcalled = false;
    protected JRServicePerson jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRServicePerson();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
