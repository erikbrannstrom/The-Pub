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
    
    public int size() {
        // Return
        return (this.units.size());
        // End Return

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
                InStatObj JRInstmt6 = new InStatObj(2, false);
                JRLoop16: while (true) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt6.armArray[0] = new QuantRec(new Cap_ext_(op_allocate_voidTojavadotlangdotObject, "E"), 0, 0);
                        JRInstmt6.armArray[1] = new QuantRec(new Cap_ext_(op_release_javadotlangdotObjectTovoid, "void"), 1, 1);
                        JRInstmt6.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt6.serviced = false;
                        _label_JRInstmt6: do
                        {
                            Invocation JRfinalInvoc6 = null;
                            // find THE invocation and service it
                            JRInstmt6.gatherAndSortTimes();
                            for (JRInstmt6.i = 0;
                                (JRInstmt6.i < JRInstmt6.N) && !JRInstmt6.serviced;
                                 JRInstmt6.i++)
                            {
                                JRInstmt6.byStrt = true;
                                JRInstmt6.releaseIter();
                                // if the op is empty
                                if (JRInstmt6.timesArray[JRInstmt6.i].time < 0) continue;
                                switch (JRInstmt6.timesArray[JRInstmt6.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt6.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                        Recv_ext JRrrecv6 = null, JRtmprecv6;
                                        for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                             JRInstmt6.iter.hasNext();)
                                        {
                                            JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                            JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                            JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                            // extract values
                                            JRrrecv6 = JRtmprecv6;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv6 != null)
                                        {
                                            JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                            JRInstmt6.serviced = true;
                                            JRInstmt6.iter.remove(JRInstmt6.j);
                                            JRInstmt6.releaseIter();
                                            JRInstmt6.unlock();
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
                                                                { if (JRrrecv6.retOp != null)
                                                                    JRrrecv6.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(unit)});
                                                                else {
                                                                    java.lang.Object JRevaltmp = unit;
                                                                    
                                                                }
                                                                break _label_JRInstmt6; }}
                                                        
                                                        // End Return

                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv6.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv6.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv6.handler != null)
                                                            JRrrecv6.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                        JRrrecv6.fretOp = null;
                                                    }
                                                    else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv6.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            
                                        }
                                        else
                                            JRInstmt6.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 1:
                                    {
                                        JRInstmt6.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                        Recv_ext JRrrecv6 = null, JRtmprecv6;
                                        // not artificial
                                        java.lang.Object unit = null;
                                        for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                             JRInstmt6.iter.hasNext();)
                                        {
                                            JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                            JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                            JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                            // extract values
                                            unit = (// not artificial
                                            java.lang.Object)JRtmprecv6.JRargs[0];
                                            JRrrecv6 = JRtmprecv6;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv6 != null)
                                        {
                                            JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                            JRInstmt6.serviced = true;
                                            JRInstmt6.iter.remove(JRInstmt6.j);
                                            JRInstmt6.releaseIter();
                                            JRInstmt6.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        units.add(unit);
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv6.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv6.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv6.handler != null)
                                                            JRrrecv6.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                        JRrrecv6.fretOp = null;
                                                    }
                                                    else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv6.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv6.retOp != null)
                                                JRrrecv6.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt6.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    
                                }
                            }
                            if (!JRInstmt6.serviced)
                            {
                                // must block and loop
                                JRInstmt6.waitOnLock();
                            }
                        } while (!JRInstmt6.serviced);
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
