/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Table extends java.lang.Object {
    { JRinit(); }
    private List containers;
    private int remainingSpaceUnits;
    private int spaceUnits;
    private List waitingCustomers;
    public Op_ext.JRProxyOp JRget_op_putDown_Cap_voidTovoidXContainerToboolean()
    {
        return op_putDown_Cap_voidTovoidXContainerToboolean;
    }
    
    public Op_ext.JRProxyOp op_putDown_Cap_voidTovoidXContainerToboolean;
    
    public Op_ext.JRProxyOp JRget_op_clean_voidTojavadotutildotList()
    {
        return op_clean_voidTojavadotutildotList;
    }
    
    public Op_ext.JRProxyOp op_clean_voidTojavadotutildotList;
    
    
    public Table(int spaceUnits) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.containers = new ArrayList();
        // Begin Expr2
        this.remainingSpaceUnits = spaceUnits;
        // Begin Expr2
        this.spaceUnits = spaceUnits;
        // Begin Expr2
        this.waitingCustomers = new ArrayList();
        JRprocess();
    }
    private Op_ext.JRProxyOp JRget_op_server_voidTovoid()
    {
        return op_server_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_server_voidTovoid;
    class ProcOp_voidTovoid_implserver extends ProcOp_ext_impl
    {
        Table thisarg;
        public ProcOp_voidTovoid_implserver(Table thisIn) throws RemoteException
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
                InStatObj JRInstmt8 = new InStatObj(2, false);
                JRLoop20: while (true) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt8.armArray[0] = new QuantRec(new Cap_ext_(op_putDown_Cap_voidTovoidXContainerToboolean, "boolean"), 0, 0);
                        JRInstmt8.armArray[1] = new QuantRec(new Cap_ext_(op_clean_voidTojavadotutildotList, "java.util.List<Container>"), 1, 1);
                        JRInstmt8.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt8.serviced = false;
                        _label_JRInstmt8: do
                        {
                            Invocation JRfinalInvoc8 = null;
                            // find THE invocation and service it
                            JRInstmt8.gatherAndSortTimes();
                            for (JRInstmt8.i = 0;
                                (JRInstmt8.i < JRInstmt8.N) && !JRInstmt8.serviced;
                                 JRInstmt8.i++)
                            {
                                JRInstmt8.byStrt = true;
                                JRInstmt8.releaseIter();
                                // if the op is empty
                                if (JRInstmt8.timesArray[JRInstmt8.i].time < 0) continue;
                                switch (JRInstmt8.timesArray[JRInstmt8.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt8.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec8 = (QuantRec)JRInstmt8.armArray[JRInstmt8.timesArray[JRInstmt8.i].armArrayIndex];
                                        Recv_ext JRrrecv8 = null, JRtmprecv8;
                                        // not artificial
                                        // NUMBER 3
                                        Cap_ext_ customer = null;
                                        // not artificial
                                        Container container = null;
                                        for (JRInstmt8.iter = JRInstmt8.armArray[JRInstmt8.timesArray[JRInstmt8.i].armArrayIndex].theCap.elements();
                                             JRInstmt8.iter.hasNext();)
                                        {
                                            JRtmprecv8 = (Recv_ext)JRInstmt8.iter.next();
                                            JRInstmt8.JRinit.setInvoc(JRInstmt8.j++);
                                            JRtmprecv8.setInvocation(JRInstmt8.JRinit);
                                            // extract values
                                            customer = (// not artificial
                                            // NUMBER 3
                                            Cap_ext_)JRtmprecv8.JRargs[0];
                                            container = (// not artificial
                                            Container)JRtmprecv8.JRargs[1];
                                            JRrrecv8 = JRtmprecv8;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv8 != null)
                                        {
                                            JRInstmt8.j = (int)JRrrecv8.getInvoc();
                                            JRInstmt8.serviced = true;
                                            JRInstmt8.iter.remove(JRInstmt8.j);
                                            JRInstmt8.releaseIter();
                                            JRInstmt8.unlock();
                                            {
                                                try {
                                                    {
                                                        if (this.remainingSpaceUnits < container.getSize()) {
                                                            // Begin Expr2
                                                            waitingCustomers.add(customer);
                                                            // Return
                                                            {
                                                                if (true)
                                                                    { if (JRrrecv8.retOp != null)
                                                                        JRrrecv8.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(false)});
                                                                    else {
                                                                        boolean JRevaltmp = false;
                                                                        
                                                                    }
                                                                    break _label_JRInstmt8; }}
                                                            
                                                            // End Return

                                                        } else {
                                                            // Begin Expr2
                                                            this.remainingSpaceUnits -= container.getSize();
                                                            // Begin Expr2
                                                            this.containers.add(container);
                                                            // Return
                                                            {
                                                                if (true)
                                                                    { if (JRrrecv8.retOp != null)
                                                                        JRrrecv8.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(true)});
                                                                    else {
                                                                        boolean JRevaltmp = true;
                                                                        
                                                                    }
                                                                    break _label_JRInstmt8; }}
                                                            
                                                            // End Return

                                                        }
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv8.retOp != null && JRrrecv8.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv8.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv8.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv8.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv8.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv8.retOp != null) && (JRrrecv8.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv8.handler != null)
                                                            JRrrecv8.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv8.fretOp.send(jrvm.getTimestamp(), JRrrecv8.handler, (java.lang.Object []) null);
                                                        JRrrecv8.fretOp = null;
                                                    }
                                                    else if ((JRrrecv8.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv8.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            
                                        }
                                        else
                                            JRInstmt8.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 1:
                                    {
                                        JRInstmt8.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec8 = (QuantRec)JRInstmt8.armArray[JRInstmt8.timesArray[JRInstmt8.i].armArrayIndex];
                                        Recv_ext JRrrecv8 = null, JRtmprecv8;
                                        for (JRInstmt8.iter = JRInstmt8.armArray[JRInstmt8.timesArray[JRInstmt8.i].armArrayIndex].theCap.elements();
                                             JRInstmt8.iter.hasNext();)
                                        {
                                            JRtmprecv8 = (Recv_ext)JRInstmt8.iter.next();
                                            JRInstmt8.JRinit.setInvoc(JRInstmt8.j++);
                                            JRtmprecv8.setInvocation(JRInstmt8.JRinit);
                                            // extract values
                                            JRrrecv8 = JRtmprecv8;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv8 != null)
                                        {
                                            JRInstmt8.j = (int)JRrrecv8.getInvoc();
                                            JRInstmt8.serviced = true;
                                            JRInstmt8.iter.remove(JRInstmt8.j);
                                            JRInstmt8.releaseIter();
                                            JRInstmt8.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        this.remainingSpaceUnits = this.spaceUnits;
                                                        List tmp = this.containers;
                                                        // Begin Expr2
                                                        this.containers = new ArrayList();
                                                        JRLoop19: for (Object JRforeachItemcustomer : this.waitingCustomers) {Cap_ext_ customer = (Cap_ext_)JRforeachItemcustomer;{
                                                            customer.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                        }}
                                                        // Return
                                                        {
                                                            if (true)
                                                                { if (JRrrecv8.retOp != null)
                                                                    JRrrecv8.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(tmp)});
                                                                else {
                                                                    java.util.List JRevaltmp = tmp;
                                                                    
                                                                }
                                                                break _label_JRInstmt8; }}
                                                        
                                                        // End Return

                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv8.retOp != null && JRrrecv8.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv8.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv8.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv8.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv8.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv8.retOp != null) && (JRrrecv8.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv8.handler != null)
                                                            JRrrecv8.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv8.fretOp.send(jrvm.getTimestamp(), JRrrecv8.handler, (java.lang.Object []) null);
                                                        JRrrecv8.fretOp = null;
                                                    }
                                                    else if ((JRrrecv8.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv8.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            
                                        }
                                        else
                                            JRInstmt8.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    
                                }
                            }
                            if (!JRInstmt8.serviced)
                            {
                                // must block and loop
                                JRInstmt8.waitOnLock();
                            }
                        } while (!JRInstmt8.serviced);
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
    
    
    public int numberOfContainers() {
        // Return
        return (this.containers.size());
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRTable jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_server_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implserver(this));
    	op_clean_voidTojavadotutildotList = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_putDown_Cap_voidTovoidXContainerToboolean = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRTable(op_server_voidTovoid, op_clean_voidTojavadotutildotList, op_putDown_Cap_voidTovoidXContainerToboolean);
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
