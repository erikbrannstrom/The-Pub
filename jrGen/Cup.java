/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public class Cup extends Container {
    { JRinit(); }
    
    public Cup() {
        // Begin Expr2
        super();
        JRprocess();
    }
    
    public int getSize() {
        // Return
        return (2);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRCup jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	super.JRinit();
    	jrresref = new JRCup(super.jrresref);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
