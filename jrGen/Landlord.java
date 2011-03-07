/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Landlord extends ServicePerson {
    { JRinit(); }
    private List customers;
    private Pub pub;
    private boolean running;
    private boolean serving;
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
    
    public Op_ext.JRProxyOp JRget_op_customerLeft_CustomerTovoid()
    {
        return op_customerLeft_CustomerTovoid;
    }
    
    public Op_ext.JRProxyOp op_customerLeft_CustomerTovoid;
    
    
    public Landlord(Pub pub) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.customers = new Vector();
        // Begin Expr2
        this.pub = pub;
        // Begin Expr2
        this.running = true;
        // Begin Expr2
        this.serving = true;
        Pub.getClock().JRget_op_setAlarmEndTime_Cap_voidTovoidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(this.JRget_op_closingTime_voidTovoid(), "void")// operation void()
        });
        Pub.getClock().JRget_op_setAlarm_Cap_voidTovoidXMyTimeTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(this.JRget_op_lastCall_voidTovoid(), "void")// operation void()
        , Pub.TIME_LAST_CALL});
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
                InStatObj JRInstmt5 = new InStatObj(4, false);
                ServingArea servingArea = this.pub.getServingArea();
                JRLoop12: while (this.running) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt5.armArray[0] = new QuantRec(new Cap_ext_(op_closingTime_voidTovoid, "void"), 0, 0);
                        JRInstmt5.armArray[1] = new QuantRec(new Cap_ext_(op_customerLeft_CustomerTovoid, "void"), 1, 1);
                        JRInstmt5.armArray[2] = new QuantRec(new Cap_ext_(op_lastCall_voidTovoid, "void"), 2, 2);
                        JRInstmt5.armArray[3] = new QuantRec(new Cap_ext_(servingArea.op_order_Cap_ContainerTovoidXPubdotDrinkTovoid, "void"), 3, 3);
                        JRInstmt5.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt5.serviced = false;
                        _label_JRInstmt5: do
                        {
                            Invocation JRfinalInvoc5 = null;
                            // find THE invocation and service it
                            JRInstmt5.gatherAndSortTimes();
                            for (JRInstmt5.i = 0;
                                (JRInstmt5.i < JRInstmt5.N) && !JRInstmt5.serviced;
                                 JRInstmt5.i++)
                            {
                                JRInstmt5.byStrt = true;
                                JRInstmt5.releaseIter();
                                // if the op is empty
                                if (JRInstmt5.timesArray[JRInstmt5.i].time < 0) continue;
                                switch (JRInstmt5.timesArray[JRInstmt5.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt5.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec5 = (QuantRec)JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex];
                                        Recv_ext JRrrecv5 = null, JRtmprecv5;
                                        for (JRInstmt5.iter = JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex].theCap.elements();
                                             JRInstmt5.iter.hasNext();)
                                        {
                                            JRtmprecv5 = (Recv_ext)JRInstmt5.iter.next();
                                            JRInstmt5.JRinit.setInvoc(JRInstmt5.j++);
                                            JRtmprecv5.setInvocation(JRInstmt5.JRinit);
                                            // extract values
                                            JRrrecv5 = JRtmprecv5;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv5 != null)
                                        {
                                            JRInstmt5.j = (int)JRrrecv5.getInvoc();
                                            JRInstmt5.serviced = true;
                                            JRInstmt5.iter.remove(JRInstmt5.j);
                                            JRInstmt5.releaseIter();
                                            JRInstmt5.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        System.out.println("Landlord: Look at the time! Barmaid go home.");
                                                        this.pub.getBarmaid().JRget_op_leave_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                        // Begin Expr2
                                                        this.serving = false;
                                                        // Begin Expr2
                                                        System.out.println("Landlord: Time to go home, fellas!");
                                                        JRLoop10: for (Object c : this.customers) {
                                                            (((Customer)c)).JRget_op_leave_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                        }
                                                        // Begin Expr2
                                                        this.checkClosing();
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv5.retOp != null && JRrrecv5.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv5.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv5.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv5.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv5.retOp != null) && (JRrrecv5.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv5.handler != null)
                                                            JRrrecv5.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv5.fretOp.send(jrvm.getTimestamp(), JRrrecv5.handler, (java.lang.Object []) null);
                                                        JRrrecv5.fretOp = null;
                                                    }
                                                    else if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv5.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv5.retOp != null)
                                                JRrrecv5.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt5.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 1:
                                    {
                                        JRInstmt5.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec5 = (QuantRec)JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex];
                                        Recv_ext JRrrecv5 = null, JRtmprecv5;
                                        // not artificial
                                        Customer c = null;
                                        for (JRInstmt5.iter = JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex].theCap.elements();
                                             JRInstmt5.iter.hasNext();)
                                        {
                                            JRtmprecv5 = (Recv_ext)JRInstmt5.iter.next();
                                            JRInstmt5.JRinit.setInvoc(JRInstmt5.j++);
                                            JRtmprecv5.setInvocation(JRInstmt5.JRinit);
                                            // extract values
                                            c = (// not artificial
                                            Customer)JRtmprecv5.JRargs[0];
                                            JRrrecv5 = JRtmprecv5;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv5 != null)
                                        {
                                            JRInstmt5.j = (int)JRrrecv5.getInvoc();
                                            JRInstmt5.serviced = true;
                                            JRInstmt5.iter.remove(JRInstmt5.j);
                                            JRInstmt5.releaseIter();
                                            JRInstmt5.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        this.customers.remove(c);
                                                        // Begin Expr2
                                                        this.checkClosing();
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv5.retOp != null && JRrrecv5.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv5.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv5.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv5.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv5.retOp != null) && (JRrrecv5.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv5.handler != null)
                                                            JRrrecv5.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv5.fretOp.send(jrvm.getTimestamp(), JRrrecv5.handler, (java.lang.Object []) null);
                                                        JRrrecv5.fretOp = null;
                                                    }
                                                    else if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv5.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv5.retOp != null)
                                                JRrrecv5.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt5.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 2:
                                    {
                                        JRInstmt5.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec5 = (QuantRec)JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex];
                                        Recv_ext JRrrecv5 = null, JRtmprecv5;
                                        for (JRInstmt5.iter = JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex].theCap.elements();
                                             JRInstmt5.iter.hasNext();)
                                        {
                                            JRtmprecv5 = (Recv_ext)JRInstmt5.iter.next();
                                            JRInstmt5.JRinit.setInvoc(JRInstmt5.j++);
                                            JRtmprecv5.setInvocation(JRInstmt5.JRinit);
                                            // extract values
                                            JRrrecv5 = JRtmprecv5;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv5 != null)
                                        {
                                            JRInstmt5.j = (int)JRrrecv5.getInvoc();
                                            JRInstmt5.serviced = true;
                                            JRInstmt5.iter.remove(JRInstmt5.j);
                                            JRInstmt5.releaseIter();
                                            JRInstmt5.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        System.out.println("Landlord: Last call!");
                                                        JRLoop11: for (Object c : this.customers) {
                                                            (((Customer)c)).JRget_op_lastCall_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                        }
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv5.retOp != null && JRrrecv5.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv5.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv5.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv5.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv5.retOp != null) && (JRrrecv5.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv5.handler != null)
                                                            JRrrecv5.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv5.fretOp.send(jrvm.getTimestamp(), JRrrecv5.handler, (java.lang.Object []) null);
                                                        JRrrecv5.fretOp = null;
                                                    }
                                                    else if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv5.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv5.retOp != null)
                                                JRrrecv5.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt5.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 3:
                                    {
                                        JRInstmt5.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec5 = (QuantRec)JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex];
                                        Recv_ext JRrrecv5 = null, JRtmprecv5;
                                        // not artificial
                                        // NUMBER 3
                                        Cap_ext_ customer = null;
                                        // not artificial
                                        Pub.Drink type = null;
                                        for (JRInstmt5.iter = JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex].theCap.elements();
                                             JRInstmt5.iter.hasNext();)
                                        {
                                            JRtmprecv5 = (Recv_ext)JRInstmt5.iter.next();
                                            JRInstmt5.JRinit.setInvoc(JRInstmt5.j++);
                                            JRtmprecv5.setInvocation(JRInstmt5.JRinit);
                                            // extract values
                                            customer = (// not artificial
                                            // NUMBER 3
                                            Cap_ext_)JRtmprecv5.JRargs[0];
                                            type = (// not artificial
                                            Pub.Drink)JRtmprecv5.JRargs[1];
                                            if (JRget_op_closingTime_voidTovoid().length() == 0 && JRget_op_lastCall_voidTovoid().length() == 0 && JRget_op_customerLeft_CustomerTovoid().length() == 0)
                                                JRrrecv5 = JRtmprecv5;
                                            if (JRrrecv5 != null)
                                                break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv5 != null)
                                        {
                                            JRInstmt5.j = (int)JRrrecv5.getInvoc();
                                            JRInstmt5.serviced = true;
                                            JRInstmt5.iter.remove(JRInstmt5.j);
                                            JRInstmt5.releaseIter();
                                            JRInstmt5.unlock();
                                            {
                                                try {
                                                    {
                                                        if (this.serving) {
                                                            // Begin Expr2
                                                            System.out.println("Landlord: Received order of " + type + ". On it!");
                                                            Container drink = this.makeDrink(type);
                                                            customer.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {drink});
                                                        } else {
                                                            // Begin Expr2
                                                            System.out.println("Landlord: Sorry, we\'re closed.");
                                                            customer.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {null});
                                                        }
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv5.retOp != null && JRrrecv5.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv5.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv5.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv5.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv5.retOp != null) && (JRrrecv5.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv5.handler != null)
                                                            JRrrecv5.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv5.fretOp.send(jrvm.getTimestamp(), JRrrecv5.handler, (java.lang.Object []) null);
                                                        JRrrecv5.fretOp = null;
                                                    }
                                                    else if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv5.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv5.retOp != null)
                                                JRrrecv5.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt5.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    
                                }
                            }
                            if (!JRInstmt5.serviced)
                            {
                                // must block and loop
                                JRInstmt5.waitOnLock();
                            }
                        } while (!JRInstmt5.serviced);
                    }
                    // End Inni
                    
                }
                Cupboard cb = this.pub.getServingArea().getCupboard();
                if (cb.getCupAllocator().size() != Pub.NUM_CUPS || cb.getGlassAllocator().size() != Pub.NUM_GLASSES) {
                    // Begin Expr2
                    System.out.println("Landlord: Something is missing from the cupboard!");
                }
                int containersLeft = 0;
                JRLoop13: for (Object t : this.pub.getTables()) {
                    // Begin Expr2
                    containersLeft += (((Table)t)).numberOfContainers();
                }
                if (containersLeft != 0) {
                    // Begin Expr2
                    System.out.println("Landlord: Damn you, lazy assistant!");
                }
                Statistics stats = this.pub.getStatistics();
                // Begin Expr2
                System.out.println("Landlord: We had a total of " + stats.getNumberOfOrders() + " orders tonight.");
                // Begin Expr2
                System.out.println("Landlord: The average time from order to serving was " + stats.getAverage() + ".");
                // Begin Expr2
                System.out.println("Landlord: The longest time was " + stats.getMax() + " and the shortest was " + stats.getMin() + ".");
                // Begin Expr2
                stats.kill();
                // Begin Expr2
                System.out.println("Landlord: That\'s it. Closing up for tonight. Good bye pub!");
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
    
    
    private void checkClosing() {
        if (this.customers.size() == 0 && !this.serving) {
            // Begin Expr2
            System.out.println("Landlord: That\'s all of \'em.");
            // Begin JRCall
            // Begin Expr2
            (new Cap_ext_(this.pub.getAssistant().JRget_op_finalRound_voidTovoid(), "void")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);// End JRCall
            
            Pub.getClock().JRget_op_shutdown_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
            // Begin Expr2
            this.running = false;
        }
    }
    
    public boolean isServing() {
        // Return
        return (this.serving);
        // End Return

    }
    
    public void addCustomer(Customer c) {
        // Begin Expr2
        this.customers.add(c);
    }
    
    public void removeCustomer(Customer c) {
        // Begin Expr2
        this.customers.remove(c);
    }
    
    protected ServingArea getServingArea() {
        // Return
        return (this.pub.getServingArea());
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
    	op_customerLeft_CustomerTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_lastCall_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_closingTime_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRLandlord(super.jrresref, op_run_voidTovoid, op_customerLeft_CustomerTovoid, op_lastCall_voidTovoid, op_closingTime_voidTovoid);
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
