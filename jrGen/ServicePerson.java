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
            // Begin Expr2
            JR.nap(Pub.DELAY_CONTAINER);
            Ingredient beerTap = ((Ingredient)((Ingredient) (new Cap_ext_(this.getServingArea().getBeerTapAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Ingredient")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Begin Expr2
            JR.nap(Pub.DELAY_INGREDIENT);
            // Begin Expr2
            glass.fill(type);
            this.getServingArea().getBeerTapAllocator().JRget_op_release_javadotlangdotObjectTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {beerTap});
            // Return
            return (glass);
            // End Return

        } else if (type == Pub.Drink.CAPPUCCINO) {
            Cup cup = ((Cup)((Cup) (new Cap_ext_(this.getCupboard().getCupAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Cup")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Begin Expr2
            JR.nap(Pub.DELAY_CONTAINER);
            Ingredient coffee = ((Ingredient)((Ingredient) (new Cap_ext_(this.getCupboard().getCoffeeAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Ingredient")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Begin Expr2
            JR.nap(Pub.DELAY_INGREDIENT);
            this.getCupboard().getCoffeeAllocator().JRget_op_release_javadotlangdotObjectTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {coffee});
            Ingredient milk = ((Ingredient)((Ingredient) (new Cap_ext_(this.getCupboard().getMilkAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Ingredient")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Begin Expr2
            JR.nap(Pub.DELAY_INGREDIENT);
            this.getCupboard().getMilkAllocator().JRget_op_release_javadotlangdotObjectTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {milk});
            // Begin Expr2
            JR.nap(Pub.DELAY_MIX);
            // Begin Expr2
            cup.fill(type);
            // Return
            return (cup);
            // End Return

        } else {
            Cup cup = ((Cup)((Cup) (new Cap_ext_(this.getCupboard().getCupAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Cup")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Begin Expr2
            JR.nap(Pub.DELAY_CONTAINER);
            Ingredient coco = ((Ingredient)((Ingredient) (new Cap_ext_(this.getCupboard().getChocolateAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Ingredient")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Begin Expr2
            JR.nap(Pub.DELAY_INGREDIENT);
            this.getCupboard().getChocolateAllocator().JRget_op_release_javadotlangdotObjectTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {coco});
            Ingredient milk = ((Ingredient)((Ingredient) (new Cap_ext_(this.getCupboard().getMilkAllocator().JRget_op_allocate_voidTojavadotlangdotObject(), "Ingredient")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)));
            // Begin Expr2
            JR.nap(Pub.DELAY_INGREDIENT);
            this.getCupboard().getMilkAllocator().JRget_op_release_javadotlangdotObjectTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {milk});
            // Begin Expr2
            JR.nap(Pub.DELAY_MIX);
            // Begin Expr2
            cup.fill(type);
            // Return
            return (cup);
            // End Return

        }
    }
    
    protected Cupboard getCupboard() {
        // Return
        return (this.getServingArea().getCupboard());
        // End Return

    }
    
    protected abstract ServingArea getServingArea();
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
