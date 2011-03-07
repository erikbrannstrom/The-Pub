/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Statistics extends java.lang.Object {
    { JRinit(); }
    private boolean running;
    private List waitingTimes;
    public Op_ext.JRProxyOp JRget_op_waitingTime_MyTimeTovoid()
    {
        return op_waitingTime_MyTimeTovoid;
    }
    
    public Op_ext.JRProxyOp op_waitingTime_MyTimeTovoid;
    
    
    public Statistics() {
        // Begin Expr2
        super();
        // Begin Expr2
        this.running = true;
        // Begin Expr2
        this.waitingTimes = new Vector();
        JRprocess();
    }
    public Op_ext.JRProxyOp JRget_op_run_voidTovoid()
    {
        return op_run_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_run_voidTovoid;
    class ProcOp_voidTovoid_implrun extends ProcOp_ext_impl
    {
        Statistics thisarg;
        public ProcOp_voidTovoid_implrun(Statistics thisIn) throws RemoteException
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
                InStatObj JRInstmt7 = new InStatObj(1, false);
                JRLoop17: while (this.running) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt7.armArray[0] = new QuantRec(new Cap_ext_(op_waitingTime_MyTimeTovoid, "void"), 0, 0);
                        JRInstmt7.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt7.serviced = false;
                        _label_JRInstmt7: do
                        {
                            Invocation JRfinalInvoc7 = null;
                            // find THE invocation and service it
                            JRInstmt7.gatherAndSortTimes();
                            for (JRInstmt7.i = 0;
                                (JRInstmt7.i < JRInstmt7.N) && !JRInstmt7.serviced;
                                 JRInstmt7.i++)
                            {
                                JRInstmt7.byStrt = true;
                                JRInstmt7.releaseIter();
                                // if the op is empty
                                if (JRInstmt7.timesArray[JRInstmt7.i].time < 0) continue;
                                switch (JRInstmt7.timesArray[JRInstmt7.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt7.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec7 = (QuantRec)JRInstmt7.armArray[JRInstmt7.timesArray[JRInstmt7.i].armArrayIndex];
                                        Recv_ext JRrrecv7 = null, JRtmprecv7;
                                        // not artificial
                                        MyTime time = null;
                                        for (JRInstmt7.iter = JRInstmt7.armArray[JRInstmt7.timesArray[JRInstmt7.i].armArrayIndex].theCap.elements();
                                             JRInstmt7.iter.hasNext();)
                                        {
                                            JRtmprecv7 = (Recv_ext)JRInstmt7.iter.next();
                                            JRInstmt7.JRinit.setInvoc(JRInstmt7.j++);
                                            JRtmprecv7.setInvocation(JRInstmt7.JRinit);
                                            // extract values
                                            time = (// not artificial
                                            MyTime)JRtmprecv7.JRargs[0];
                                            JRrrecv7 = JRtmprecv7;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv7 != null)
                                        {
                                            JRInstmt7.j = (int)JRrrecv7.getInvoc();
                                            JRInstmt7.serviced = true;
                                            JRInstmt7.iter.remove(JRInstmt7.j);
                                            JRInstmt7.releaseIter();
                                            JRInstmt7.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        this.waitingTimes.add(time);
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv7.retOp != null && JRrrecv7.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv7.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv7.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv7.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv7.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv7.retOp != null) && (JRrrecv7.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv7.handler != null)
                                                            JRrrecv7.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv7.fretOp.send(jrvm.getTimestamp(), JRrrecv7.handler, (java.lang.Object []) null);
                                                        JRrrecv7.fretOp = null;
                                                    }
                                                    else if ((JRrrecv7.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv7.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv7.retOp != null)
                                                JRrrecv7.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt7.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    
                                }
                            }
                            if (!JRInstmt7.serviced)
                            {
                                // must block and loop
                                JRInstmt7.waitOnLock();
                            }
                        } while (!JRInstmt7.serviced);
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
    
    
    public MyTime getMax() {
        if (this.waitingTimes.size() == 0) // Return
        return (new MyTime(0));
        // End Return
 else // Return
        return (((MyTime)Collections.max(this.waitingTimes)));
        // End Return

    }
    
    public MyTime getMin() {
        if (this.waitingTimes.size() == 0) // Return
        return (new MyTime(0));
        // End Return
 else // Return
        return (((MyTime)Collections.min(this.waitingTimes)));
        // End Return

    }
    
    public MyTime getAverage() {
        if (this.getNumberOfOrders() == 0) // Return
        return (new MyTime(0));
        // End Return

        int sum = 0;
        JRLoop18: for (Object t : this.waitingTimes) {
            // Begin Expr2
            sum += (((MyTime)t)).getValue();
        }
        // Return
        return (new MyTime(((int)(sum / this.getNumberOfOrders()))));
        // End Return

    }
    
    public int getNumberOfOrders() {
        // Return
        return (this.waitingTimes.size());
        // End Return

    }
    
    public void kill() {
        // Begin Expr2
        this.running = false;
    }
    protected boolean JRcalled = false;
    protected JRStatistics jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_run_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implrun(this));
    	op_waitingTime_MyTimeTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRStatistics(op_run_voidTovoid, op_waitingTime_MyTimeTovoid);
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
