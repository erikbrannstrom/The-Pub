/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Pub extends java.lang.Object {
    { JRinit(); }
    public static final int SIMULATION_SPEED = 1;
    public static final int NUM_CUPS = 15;
    public static final int NUM_GLASSES = 20;
    public static final int NUM_TABLES = 15;
    public static final int DELAY_CONTAINER = 5 * Pub.SIMULATION_SPEED;
    public static final int DELAY_INGREDIENT = 12 * Pub.SIMULATION_SPEED;
    public static final int DELAY_MIX = 30 * Pub.SIMULATION_SPEED;
    public static final int TABLE_SIZE = 10;
    public static final int ASSISTANT_BREAK = 15 * 60 * Pub.SIMULATION_SPEED;
    public static final int ASSISTANT_HANDLE_CONTAINER = 1 * Pub.SIMULATION_SPEED;
    public static final int ASSISTANT_CLEAN_CONTAINER = 10 * Pub.SIMULATION_SPEED;
    public static final int ASSISTANT_WALK_BETWEEN_TABLES = 10 * Pub.SIMULATION_SPEED;
    public static final int CUSTOMER_MIN_TIME_UNTIL_NEW_ARRIVAL = 5 * 60 * Pub.SIMULATION_SPEED;
    public static final int CUSTOMER_MAX_TIME_UNTIL_NEW_ARRIVAL = 50 * 60 * Pub.SIMULATION_SPEED;
    public static final MyTime TIME_OPEN = new MyTime(4, 0, 0);
    public static final MyTime TIME_LAST_CALL = new MyTime(3, 50, 0);
    
    public static enum Drink {
        /*public static final*/ BEER /* = new Drink() */,
        /*public static final*/ CAPPUCCINO /* = new Drink() */,
        /*public static final*/ CHOCOLATE /* = new Drink() */;
        
        private Drink() {
        }
    }
    private Assistant assistant;
    private Barmaid barmaid;
    private static Clock clock;
    private Landlord landlord;
    private ServingArea servingArea;
    private Statistics statistics;
    private List tables;
    
    public static void main(String[] args) {
        // Begin Expr2
        new Pub();
    }
    
    public Pub() {
        // Begin Expr2
        super();
        // Begin Expr2
        System.out.println("Pub: Opened");
        // Begin Expr2
        this.tables = new Vector();
        JRLoop14: for (int i = 0; i < Pub.NUM_TABLES; i++) {
            // Begin Expr2
            tables.add(new Table(Pub.TABLE_SIZE));
        }
        // Begin Expr2
        this.servingArea = new ServingArea();
        // Begin Expr2
        this.assistant = new Assistant(this.servingArea, this.tables);
        // Begin Expr2
        this.barmaid = new Barmaid(this.servingArea);
        // Begin Expr2
        this.landlord = new Landlord(this);
        // Begin Expr2
        this.statistics = new Statistics();
        JRprocess();
    }
    public Op_ext.JRProxyOp JRget_op_run_voidTovoid()
    {
        return op_run_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_run_voidTovoid;
    class ProcOp_voidTovoid_implrun extends ProcOp_ext_impl
    {
        Pub thisarg;
        public ProcOp_voidTovoid_implrun(Pub thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.runvoidTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    thisarg.runvoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    
    public void runvoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_run_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void runvoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                Random random = new Random();
                JRLoop15: while (this.landlord.isServing()) {
                    Customer c = new Customer(new Cap_ext_(this.servingArea.JRget_op_order_Cap_ContainerTovoidXPubdotDrinkTovoid(), "void")// operation void(cap void(Container),Pub.Drink)
                    , new Cap_ext_(this.landlord.JRget_op_customerLeft_CustomerTovoid(), "void")// operation void(Customer)
                    , new Cap_ext_(this.statistics.JRget_op_waitingTime_MyTimeTovoid(), "void")// operation void(MyTime)
                    , ((Table)this.tables.get(random.nextInt(Pub.NUM_TABLES))));
                    // Begin Expr2
                    this.landlord.addCustomer(c);
                    // Begin Expr2
                    JR.nap(Pub.CUSTOMER_MIN_TIME_UNTIL_NEW_ARRIVAL + random.nextInt(Pub.CUSTOMER_MAX_TIME_UNTIL_NEW_ARRIVAL));
                }
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    
    
    public Assistant getAssistant() {
        // Return
        return (this.assistant);
        // End Return

    }
    
    public Barmaid getBarmaid() {
        // Return
        return (this.barmaid);
        // End Return

    }
    
    public static Clock getClock() {
        if (clock == null) {
            // Begin Expr2
            clock = new Clock(Pub.SIMULATION_SPEED, Pub.TIME_OPEN);
        }
        // Return
        return (clock);
        // End Return

    }
    
    public ServingArea getServingArea() {
        // Return
        return (this.servingArea);
        // End Return

    }
    
    public Statistics getStatistics() {
        // Return
        return (this.statistics);
        // End Return

    }
    
    public List getTables() {
        // Return
        return (this.tables);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRPub jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_run_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implrun(this));
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRPub(op_run_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    	try {
    		op_run_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	} catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    }
}
