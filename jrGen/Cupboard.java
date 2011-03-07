/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Cupboard extends java.lang.Object {
    { JRinit(); }
    private ResourceAllocator chocolate;
    private ResourceAllocator coffee;
    private ResourceAllocator milk;
    private ResourceAllocator cups;
    private ResourceAllocator glasses;
    
    public Cupboard() {
        // Begin Expr2
        super();
        // Begin Expr2
        this.chocolate = new ResourceAllocator(new Ingredient());
        // Begin Expr2
        this.coffee = new ResourceAllocator(new Ingredient());
        // Begin Expr2
        this.milk = new ResourceAllocator(new Ingredient());
        List cups = new ArrayList();
        JRLoop7: for (int i = 0; i < Pub.NUM_CUPS; i++) {
            // Begin Expr2
            cups.add(new Cup());
        }
        // Begin Expr2
        this.cups = new ResourceAllocator(cups);
        List glasses = new ArrayList();
        JRLoop8: for (int i = 0; i < Pub.NUM_GLASSES; i++) {
            // Begin Expr2
            glasses.add(new Glass());
        }
        // Begin Expr2
        this.glasses = new ResourceAllocator(glasses);
        JRprocess();
    }
    
    public ResourceAllocator getChocolateAllocator() {
        // Return
        return (this.chocolate);
        // End Return

    }
    
    public ResourceAllocator getCoffeeAllocator() {
        // Return
        return (this.coffee);
        // End Return

    }
    
    public ResourceAllocator getMilkAllocator() {
        // Return
        return (this.milk);
        // End Return

    }
    
    public ResourceAllocator getGlassAllocator() {
        // Return
        return (this.glasses);
        // End Return

    }
    
    public ResourceAllocator getCupAllocator() {
        // Return
        return (this.cups);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRCupboard jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRCupboard();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
