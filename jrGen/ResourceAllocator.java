/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class ResourceAllocator extends java.lang.Object {
    { JRinit(); }
    public Op_ext.JRProxyOp JRget_op_allocate_voidTojavadotlangdotObject()
    {
        return op_allocate_voidTojavadotlangdotObject;
    }
    
    public Op_ext.JRProxyOp op_allocate_voidTojavadotlangdotObject;
    
    public Op_ext.JRProxyOp JRget_op_release_javadotlangdotObjectTovoid()
    {
        return op_release_javadotlangdotObjectTovoid;
    }
    
    public Op_ext.JRProxyOp op_release_javadotlangdotObjectTovoid;
    
    private Queue units;
    
    public ResourceAllocator() {
        // Begin Expr2
        super();
        // Begin Expr2
        this.units = new ArrayDeque();
        JRprocess();
    }
    
    public ResourceAllocator(Object unit) {
        // Begin Expr2
        this();
        // Begin Expr2
        this.units.add(unit);
        JRprocess();
    }
    
    public ResourceAllocator(List units) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.units = new ArrayDeque(units);
        JRprocess();
    }
    private Op_ext.JRProxyOp JRget_op_server_voidTovoid()
    {
        return op_server_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_server_voidTovoid;
    class ProcOp_voidTovoid_implserver extends ProcOp_ext_impl
    {
        ResourceAllocator thisarg;
        public ProcOp_voidTovoid_implserver(ResourceAllocator thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.servervoidTovoid(null, null, null, JRargs);
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
                    thisarg.servervoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    
    private void servervoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_server_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void servervoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                InStatObj JRInstmt4 = new InStatObj(2, false);
                JRLoop9: while (true) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt4.armArray[0] = new QuantRec(new Cap_ext_(op_allocate_voidTojavadotlangdotObject, "E"), 0, 0);
                        JRInstmt4.armArray[1] = new QuantRec(new Cap_ext_(op_release_javadotlangdotObjectTovoid, "void"), 1, 1);
                        JRInstmt4.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt4.serviced = false;
                        _label_JRInstmt4: do
                        {
                            Invocation JRfinalInvoc4 = null;
                            // find THE invocation and service it
                            JRInstmt4.gatherAndSortTimes();
                            for (JRInstmt4.i = 0;
                                (JRInstmt4.i < JRInstmt4.N) && !JRInstmt4.serviced;
                                 JRInstmt4.i++)
                            {
                                JRInstmt4.byStrt = true;
                                JRInstmt4.releaseIter();
                                // if the op is empty
                                if (JRInstmt4.timesArray[JRInstmt4.i].time < 0) continue;
                                switch (JRInstmt4.timesArray[JRInstmt4.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt4.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec4 = (QuantRec)JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex];
                                        Recv_ext JRrrecv4 = null, JRtmprecv4;
                                        for (JRInstmt4.iter = JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex].theCap.elements();
                                             JRInstmt4.iter.hasNext();)
                                        {
                                            JRtmprecv4 = (Recv_ext)JRInstmt4.iter.next();
                                            JRInstmt4.JRinit.setInvoc(JRInstmt4.j++);
                                            JRtmprecv4.setInvocation(JRInstmt4.JRinit);
                                            // extract values
                                            JRrrecv4 = JRtmprecv4;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv4 != null)
                                        {
                                            JRInstmt4.j = (int)JRrrecv4.getInvoc();
                                            JRInstmt4.serviced = true;
                                            JRInstmt4.iter.remove(JRInstmt4.j);
                                            JRInstmt4.releaseIter();
                                            JRInstmt4.unlock();
                                            {
                                                try {
                                                    {
                                                        Object unit = /*JR init for inni*/ null;
                                                        if (this.units.isEmpty()) {
                                                            // Receive
                                                            {
                                                                jrvm.sendAndDie();
                                                                Recv_ext recv_javadotlangdotObjectTovoid = JRget_op_release_javadotlangdotObjectTovoid().recv();
                                                                unit = (java.lang.Object) recv_javadotlangdotObjectTovoid.JRargs[0];
                                                                jrvm.ariseAndReceive();
                                                                if (recv_javadotlangdotObjectTovoid.retOp != null)
                                                                    recv_javadotlangdotObjectTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                                                            }
                                                            // End Receive
                                                            
                                                        } else {
                                                            // Begin Expr2
                                                            unit = this.units.remove();
                                                        }
                                                        // Return
                                                        {
                                                            if (true)
                                                                { if (JRrrecv4.retOp != null)
                                                                    JRrrecv4.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(unit)});
                                                                else {
                                                                    java.lang.Object JRevaltmp = unit;
                                                                    
                                                                }
                                                                break _label_JRInstmt4; }}
                                                        
                                                        // End Return

                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv4.retOp != null && JRrrecv4.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv4.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv4.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv4.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv4.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv4.retOp != null) && (JRrrecv4.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv4.handler != null)
                                                            JRrrecv4.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv4.fretOp.send(jrvm.getTimestamp(), JRrrecv4.handler, (java.lang.Object []) null);
                                                        JRrrecv4.fretOp = null;
                                                    }
                                                    else if ((JRrrecv4.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv4.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            
                                        }
                                        else
                                            JRInstmt4.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 1:
                                    {
                                        JRInstmt4.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec4 = (QuantRec)JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex];
                                        Recv_ext JRrrecv4 = null, JRtmprecv4;
                                        // not artificial
                                        java.lang.Object unit = null;
                                        for (JRInstmt4.iter = JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex].theCap.elements();
                                             JRInstmt4.iter.hasNext();)
                                        {
                                            JRtmprecv4 = (Recv_ext)JRInstmt4.iter.next();
                                            JRInstmt4.JRinit.setInvoc(JRInstmt4.j++);
                                            JRtmprecv4.setInvocation(JRInstmt4.JRinit);
                                            // extract values
                                            unit = (// not artificial
                                            java.lang.Object)JRtmprecv4.JRargs[0];
                                            JRrrecv4 = JRtmprecv4;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv4 != null)
                                        {
                                            JRInstmt4.j = (int)JRrrecv4.getInvoc();
                                            JRInstmt4.serviced = true;
                                            JRInstmt4.iter.remove(JRInstmt4.j);
                                            JRInstmt4.releaseIter();
                                            JRInstmt4.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        units.add(unit);
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv4.retOp != null && JRrrecv4.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv4.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv4.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv4.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv4.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv4.retOp != null) && (JRrrecv4.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv4.handler != null)
                                                            JRrrecv4.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv4.fretOp.send(jrvm.getTimestamp(), JRrrecv4.handler, (java.lang.Object []) null);
                                                        JRrrecv4.fretOp = null;
                                                    }
                                                    else if ((JRrrecv4.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv4.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv4.retOp != null)
                                                JRrrecv4.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt4.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    
                                }
                            }
                            if (!JRInstmt4.serviced)
                            {
                                // must block and loop
                                JRInstmt4.waitOnLock();
                            }
                        } while (!JRInstmt4.serviced);
                    }
                    // End Inni
                    
                }
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
    
    protected boolean JRcalled = false;
    protected JRResourceAllocator jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_server_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implserver(this));
    	op_release_javadotlangdotObjectTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_allocate_voidTojavadotlangdotObject = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRResourceAllocator(op_server_voidTovoid, op_release_javadotlangdotObjectTovoid, op_allocate_voidTojavadotlangdotObject);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    	try {
    		op_server_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	} catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    }
}
