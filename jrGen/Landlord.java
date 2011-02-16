/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public class Landlord extends ServicePerson {
    { JRinit(); }
    private Clock clock;
    private Pub pub;
    private boolean running;
    private Op_ext.JRProxyOp JRget_op_closingTime_voidTovoid()
    {
        return op_closingTime_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_closingTime_voidTovoid;
    
    private Op_ext.JRProxyOp JRget_op_lastCall_voidTovoid()
    {
        return op_lastCall_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_lastCall_voidTovoid;
    
    
    public Landlord(Pub pub, MyTime closingTime, MyTime lastCall) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.clock = new Clock(1, closingTime);
        // Begin Expr2
        this.pub = pub;
        // Begin Expr2
        this.running = true;
        this.clock.JRget_op_setAlarmEndTime_Cap_voidTovoidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(this.JRget_op_closingTime_voidTovoid(), "void")// operation void()
        });
        this.clock.JRget_op_setAlarm_Cap_voidTovoidXMyTimeTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(this.JRget_op_lastCall_voidTovoid(), "void")// operation void()
        , lastCall});
        JRprocess();
    }
    public Op_ext.JRProxyOp JRget_op_run_voidTovoid()
    {
        return op_run_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_run_voidTovoid;
    class ProcOp_voidTovoid_implrun extends ProcOp_ext_impl
    {
        Landlord thisarg;
        public ProcOp_voidTovoid_implrun(Landlord thisIn) throws RemoteException
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
                InStatObj JRInstmt3 = new InStatObj(3, false);
                ServingArea servingArea = this.pub.getServingArea();
                JRLoop6: while (this.running) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt3.armArray[0] = new QuantRec(new Cap_ext_(op_closingTime_voidTovoid, "void"), 0, 0);
                        JRInstmt3.armArray[1] = new QuantRec(new Cap_ext_(op_lastCall_voidTovoid, "void"), 1, 1);
                        JRInstmt3.armArray[2] = new QuantRec(new Cap_ext_(servingArea.op_order_Cap_ContainerTovoidXPubdotDrinkTovoid, "void"), 2, 2);
                        JRInstmt3.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt3.serviced = false;
                        _label_JRInstmt3: do
                        {
                            Invocation JRfinalInvoc3 = null;
                            // find THE invocation and service it
                            JRInstmt3.gatherAndSortTimes();
                            for (JRInstmt3.i = 0;
                                (JRInstmt3.i < JRInstmt3.N) && !JRInstmt3.serviced;
                                 JRInstmt3.i++)
                            {
                                JRInstmt3.byStrt = true;
                                JRInstmt3.releaseIter();
                                // if the op is empty
                                if (JRInstmt3.timesArray[JRInstmt3.i].time < 0) continue;
                                switch (JRInstmt3.timesArray[JRInstmt3.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt3.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec3 = (QuantRec)JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex];
                                        Recv_ext JRrrecv3 = null, JRtmprecv3;
                                        for (JRInstmt3.iter = JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex].theCap.elements();
                                             JRInstmt3.iter.hasNext();)
                                        {
                                            JRtmprecv3 = (Recv_ext)JRInstmt3.iter.next();
                                            JRInstmt3.JRinit.setInvoc(JRInstmt3.j++);
                                            JRtmprecv3.setInvocation(JRInstmt3.JRinit);
                                            // extract values
                                            JRrrecv3 = JRtmprecv3;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv3 != null)
                                        {
                                            JRInstmt3.j = (int)JRrrecv3.getInvoc();
                                            JRInstmt3.serviced = true;
                                            JRInstmt3.iter.remove(JRInstmt3.j);
                                            JRInstmt3.releaseIter();
                                            JRInstmt3.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        System.out.println("Landlord: Get OUT!! Barmaid GO HOME!!");
                                                        this.pub.getBarmaid().JRget_op_leave_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                        this.clock.JRget_op_shutdown_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv3.retOp != null && JRrrecv3.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv3.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv3.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv3.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv3.retOp != null) && (JRrrecv3.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv3.handler != null)
                                                            JRrrecv3.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv3.fretOp.send(jrvm.getTimestamp(), JRrrecv3.handler, (java.lang.Object []) null);
                                                        JRrrecv3.fretOp = null;
                                                    }
                                                    else if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv3.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv3.retOp != null)
                                                JRrrecv3.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt3.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 1:
                                    {
                                        JRInstmt3.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec3 = (QuantRec)JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex];
                                        Recv_ext JRrrecv3 = null, JRtmprecv3;
                                        for (JRInstmt3.iter = JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex].theCap.elements();
                                             JRInstmt3.iter.hasNext();)
                                        {
                                            JRtmprecv3 = (Recv_ext)JRInstmt3.iter.next();
                                            JRInstmt3.JRinit.setInvoc(JRInstmt3.j++);
                                            JRtmprecv3.setInvocation(JRInstmt3.JRinit);
                                            // extract values
                                            JRrrecv3 = JRtmprecv3;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv3 != null)
                                        {
                                            JRInstmt3.j = (int)JRrrecv3.getInvoc();
                                            JRInstmt3.serviced = true;
                                            JRInstmt3.iter.remove(JRInstmt3.j);
                                            JRInstmt3.releaseIter();
                                            JRInstmt3.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        System.out.println("Landlord: last call!!");
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv3.retOp != null && JRrrecv3.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv3.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv3.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv3.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv3.retOp != null) && (JRrrecv3.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv3.handler != null)
                                                            JRrrecv3.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv3.fretOp.send(jrvm.getTimestamp(), JRrrecv3.handler, (java.lang.Object []) null);
                                                        JRrrecv3.fretOp = null;
                                                    }
                                                    else if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv3.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv3.retOp != null)
                                                JRrrecv3.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt3.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 2:
                                    {
                                        JRInstmt3.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec3 = (QuantRec)JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex];
                                        Recv_ext JRrrecv3 = null, JRtmprecv3;
                                        // not artificial
                                        // NUMBER 3
                                        Cap_ext_ customer = null;
                                        // not artificial
                                        Pub.Drink type = null;
                                        for (JRInstmt3.iter = JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex].theCap.elements();
                                             JRInstmt3.iter.hasNext();)
                                        {
                                            JRtmprecv3 = (Recv_ext)JRInstmt3.iter.next();
                                            JRInstmt3.JRinit.setInvoc(JRInstmt3.j++);
                                            JRtmprecv3.setInvocation(JRInstmt3.JRinit);
                                            // extract values
                                            customer = (// not artificial
                                            // NUMBER 3
                                            Cap_ext_)JRtmprecv3.JRargs[0];
                                            type = (// not artificial
                                            Pub.Drink)JRtmprecv3.JRargs[1];
                                            JRrrecv3 = JRtmprecv3;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv3 != null)
                                        {
                                            JRInstmt3.j = (int)JRrrecv3.getInvoc();
                                            JRInstmt3.serviced = true;
                                            JRInstmt3.iter.remove(JRInstmt3.j);
                                            JRInstmt3.releaseIter();
                                            JRInstmt3.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        System.out.println("Landlord: Received order of " + type + ". On it!");
                                                        Container drink = this.makeDrink(type);
                                                        customer.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {drink});
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv3.retOp != null && JRrrecv3.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv3.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv3.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv3.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv3.retOp != null) && (JRrrecv3.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv3.handler != null)
                                                            JRrrecv3.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv3.fretOp.send(jrvm.getTimestamp(), JRrrecv3.handler, (java.lang.Object []) null);
                                                        JRrrecv3.fretOp = null;
                                                    }
                                                    else if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv3.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv3.retOp != null)
                                                JRrrecv3.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt3.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    
                                }
                            }
                            if (!JRInstmt3.serviced)
                            {
                                // must block and loop
                                JRInstmt3.waitOnLock();
                            }
                        } while (!JRInstmt3.serviced);
                    }
                    // End Inni
                    
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
    
    
    protected Cupboard getCupboard() {
        // Return
        return (this.pub.getServingArea().getCupboard());
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRLandlord jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	super.JRinit();
    	try {
    	op_run_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implrun(this));
    	op_lastCall_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_closingTime_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRLandlord(super.jrresref, op_run_voidTovoid, op_lastCall_voidTovoid, op_closingTime_voidTovoid);
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
