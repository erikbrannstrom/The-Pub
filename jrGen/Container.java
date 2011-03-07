/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public abstract class Container extends java.lang.Object {
    { JRinit(); }
    
    public Container() {
        // Begin Expr2
        super();
        JRprocess();
    }
    private Pub.Drink type;
    
    public void fill(Pub.Drink type) {
        // Begin Expr2
        this.type = type;
    }
    
    public Pub.Drink getType() {
        // Return
        return (this.type);
        // End Return

    }
    
    public abstract int getSize();
    protected boolean JRcalled = false;
    protected JRContainer jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRContainer();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
