/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public class Barmaid extends ServicePerson {
    { JRinit(); }
    private boolean running;
    private ServingArea servingArea;
    public Op_ext.JRProxyOp JRget_op_leave_voidTovoid()
    {
        return op_leave_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_leave_voidTovoid;
    
    
    public Barmaid(ServingArea servingArea) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.running = true;
        // Begin Expr2
        this.servingArea = servingArea;
        JRprocess();
    }
    public Op_ext.JRProxyOp JRget_op_run_voidTovoid()
    {
        return op_run_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_run_voidTovoid;
    class ProcOp_voidTovoid_implrun extends ProcOp_ext_impl
    {
        Barmaid thisarg;
        public ProcOp_voidTovoid_implrun(Barmaid thisIn) throws RemoteException
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
                InStatObj JRInstmt1 = new InStatObj(2, false);
                JRLoop3: while (this.running) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt1.armArray[0] = new QuantRec(new Cap_ext_(op_leave_voidTovoid, "void"), 0, 0);
                        JRInstmt1.armArray[1] = new QuantRec(new Cap_ext_(this.servingArea.op_order_Cap_ContainerTovoidXPubdotDrinkTovoid, "void"), 1, 1);
                        JRInstmt1.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt1.serviced = false;
                        _label_JRInstmt1: do
                        {
                            Invocation JRfinalInvoc1 = null;
                            // find THE invocation and service it
                            JRInstmt1.gatherAndSortTimes();
                            for (JRInstmt1.i = 0;
                                (JRInstmt1.i < JRInstmt1.N) && !JRInstmt1.serviced;
                                 JRInstmt1.i++)
                            {
                                JRInstmt1.byStrt = true;
                                JRInstmt1.releaseIter();
                                // if the op is empty
                                if (JRInstmt1.timesArray[JRInstmt1.i].time < 0) continue;
                                switch (JRInstmt1.timesArray[JRInstmt1.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt1.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec1 = (QuantRec)JRInstmt1.armArray[JRInstmt1.timesArray[JRInstmt1.i].armArrayIndex];
                                        Recv_ext JRrrecv1 = null, JRtmprecv1;
                                        for (JRInstmt1.iter = JRInstmt1.armArray[JRInstmt1.timesArray[JRInstmt1.i].armArrayIndex].theCap.elements();
                                             JRInstmt1.iter.hasNext();)
                                        {
                                            JRtmprecv1 = (Recv_ext)JRInstmt1.iter.next();
                                            JRInstmt1.JRinit.setInvoc(JRInstmt1.j++);
                                            JRtmprecv1.setInvocation(JRInstmt1.JRinit);
                                            // extract values
                                            JRrrecv1 = JRtmprecv1;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv1 != null)
                                        {
                                            JRInstmt1.j = (int)JRrrecv1.getInvoc();
                                            JRInstmt1.serviced = true;
                                            JRInstmt1.iter.remove(JRInstmt1.j);
                                            JRInstmt1.releaseIter();
                                            JRInstmt1.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        this.running = false;
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv1.retOp != null && JRrrecv1.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv1.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv1.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv1.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv1.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv1.retOp != null) && (JRrrecv1.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv1.handler != null)
                                                            JRrrecv1.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv1.fretOp.send(jrvm.getTimestamp(), JRrrecv1.handler, (java.lang.Object []) null);
                                                        JRrrecv1.fretOp = null;
                                                    }
                                                    else if ((JRrrecv1.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv1.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv1.retOp != null)
                                                JRrrecv1.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt1.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 1:
                                    {
                                        JRInstmt1.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec1 = (QuantRec)JRInstmt1.armArray[JRInstmt1.timesArray[JRInstmt1.i].armArrayIndex];
                                        Recv_ext JRrrecv1 = null, JRtmprecv1;
                                        // not artificial
                                        // NUMBER 3
                                        Cap_ext_ customer = null;
                                        // not artificial
                                        Pub.Drink type = null;
                                        for (JRInstmt1.iter = JRInstmt1.armArray[JRInstmt1.timesArray[JRInstmt1.i].armArrayIndex].theCap.elements();
                                             JRInstmt1.iter.hasNext();)
                                        {
                                            JRtmprecv1 = (Recv_ext)JRInstmt1.iter.next();
                                            JRInstmt1.JRinit.setInvoc(JRInstmt1.j++);
                                            JRtmprecv1.setInvocation(JRInstmt1.JRinit);
                                            // extract values
                                            customer = (// not artificial
                                            // NUMBER 3
                                            Cap_ext_)JRtmprecv1.JRargs[0];
                                            type = (// not artificial
                                            Pub.Drink)JRtmprecv1.JRargs[1];
                                            if (JRget_op_leave_voidTovoid().length() == 0)
                                                JRrrecv1 = JRtmprecv1;
                                            if (JRrrecv1 != null)
                                                break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv1 != null)
                                        {
                                            JRInstmt1.j = (int)JRrrecv1.getInvoc();
                                            JRInstmt1.serviced = true;
                                            JRInstmt1.iter.remove(JRInstmt1.j);
                                            JRInstmt1.releaseIter();
                                            JRInstmt1.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        System.out.println("Barmaid: Received order of " + type + ". On it!");
                                                        Container drink = this.makeDrink(type);
                                                        customer.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {drink});
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv1.retOp != null && JRrrecv1.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv1.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv1.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv1.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv1.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv1.retOp != null) && (JRrrecv1.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv1.handler != null)
                                                            JRrrecv1.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv1.fretOp.send(jrvm.getTimestamp(), JRrrecv1.handler, (java.lang.Object []) null);
                                                        JRrrecv1.fretOp = null;
                                                    }
                                                    else if ((JRrrecv1.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv1.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv1.retOp != null)
                                                JRrrecv1.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt1.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    
                                }
                            }
                            if (!JRInstmt1.serviced)
                            {
                                // must block and loop
                                JRInstmt1.waitOnLock();
                            }
                        } while (!JRInstmt1.serviced);
                    }
                    // End Inni
                    
                }
                // Begin Expr2
                System.out.println("Barmaid: Good night, Landlord!");
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
    
    
    protected ServingArea getServingArea() {
        // Return
        return (this.servingArea);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRBarmaid jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	super.JRinit();
    	try {
    	op_run_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implrun(this));
    	op_leave_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRBarmaid(super.jrresref, op_run_voidTovoid, op_leave_voidTovoid);
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
