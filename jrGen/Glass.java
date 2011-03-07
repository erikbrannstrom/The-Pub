/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public class Glass extends Container {
    { JRinit(); }
    
    public Glass() {
        // Begin Expr2
        super();
        JRprocess();
    }
    
    public int getSize() {
        // Return
        return (1);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRGlass jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	super.JRinit();
    	jrresref = new JRGlass(super.jrresref);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
