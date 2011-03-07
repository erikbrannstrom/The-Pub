/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import java.util.*;
import edu.ucdavis.jr.*;

public class Clock extends java.lang.Object {
    { JRinit(); }
    public Op_ext.JRProxyOp JRget_op_getTime_voidToMyTime()
    {
        return op_getTime_voidToMyTime;
    }
    
    public Op_ext.JRProxyOp op_getTime_voidToMyTime;
    
    public Op_ext.JRProxyOp JRget_op_setAlarm_Cap_voidTovoidXMyTimeTovoid()
    {
        return op_setAlarm_Cap_voidTovoidXMyTimeTovoid;
    }
    
    public Op_ext.JRProxyOp op_setAlarm_Cap_voidTovoidXMyTimeTovoid;
    
    public Op_ext.JRProxyOp JRget_op_setAlarmEndTime_Cap_voidTovoidTovoid()
    {
        return op_setAlarmEndTime_Cap_voidTovoidTovoid;
    }
    
    public Op_ext.JRProxyOp op_setAlarmEndTime_Cap_voidTovoidTovoid;
    
    public Op_ext.JRProxyOp JRget_op_shutdown_voidTovoid()
    {
        return op_shutdown_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_shutdown_voidTovoid;
    
    private Op_ext.JRProxyOp JRget_op_tick_voidTovoid()
    {
        return op_tick_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_tick_voidTovoid;
    
    private MyTime currentTime;
    private int ms;
    private Map alarms = new HashMap();
    private MyTime endTime;
    private Op_ext.JRProxyOp JRget_op_stopTicker_voidTovoid()
    {
        return op_stopTicker_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_stopTicker_voidTovoid;
    
    
    public Clock(int ms, MyTime endTime) {
        // Begin Expr2
        super();
        // Begin Expr2
        currentTime = new MyTime(0, 0, 0);
        // Begin Expr2
        this.ms = ms;
        // Begin Expr2
        this.endTime = endTime;
        // Begin Expr2
        alarms.put(endTime, new HashSet());
        JRprocess();
    }
    private Op_ext.JRProxyOp JRget_op_loop_voidTovoid()
    {
        return op_loop_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_loop_voidTovoid;
    class ProcOp_voidTovoid_implloop extends ProcOp_ext_impl
    {
        Clock thisarg;
        public ProcOp_voidTovoid_implloop(Clock thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.loopvoidTovoid(null, null, null, JRargs);
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
                    thisarg.loopvoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    
    private void loopvoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_loop_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void loopvoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                InStatObj JRInstmt2 = new InStatObj(5, false);
                boolean run = true;
                JRLoop5: while (run) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt2.armArray[0] = new QuantRec(new Cap_ext_(op_tick_voidTovoid, "void"), 0, 0);
                        JRInstmt2.armArray[1] = new QuantRec(new Cap_ext_(op_getTime_voidToMyTime, "MyTime"), 1, 1);
                        JRInstmt2.armArray[2] = new QuantRec(new Cap_ext_(op_setAlarm_Cap_voidTovoidXMyTimeTovoid, "void"), 2, 2);
                        JRInstmt2.armArray[3] = new QuantRec(new Cap_ext_(op_setAlarmEndTime_Cap_voidTovoidTovoid, "void"), 3, 3);
                        JRInstmt2.armArray[4] = new QuantRec(new Cap_ext_(op_shutdown_voidTovoid, "void"), 4, 4);
                        JRInstmt2.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt2.serviced = false;
                        _label_JRInstmt2: do
                        {
                            Invocation JRfinalInvoc2 = null;
                            // find THE invocation and service it
                            JRInstmt2.gatherAndSortTimes();
                            for (JRInstmt2.i = 0;
                                (JRInstmt2.i < JRInstmt2.N) && !JRInstmt2.serviced;
                                 JRInstmt2.i++)
                            {
                                JRInstmt2.byStrt = true;
                                JRInstmt2.releaseIter();
                                // if the op is empty
                                if (JRInstmt2.timesArray[JRInstmt2.i].time < 0) continue;
                                switch (JRInstmt2.timesArray[JRInstmt2.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt2.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec2 = (QuantRec)JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex];
                                        Recv_ext JRrrecv2 = null, JRtmprecv2;
                                        for (JRInstmt2.iter = JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex].theCap.elements();
                                             JRInstmt2.iter.hasNext();)
                                        {
                                            JRtmprecv2 = (Recv_ext)JRInstmt2.iter.next();
                                            JRInstmt2.JRinit.setInvoc(JRInstmt2.j++);
                                            JRtmprecv2.setInvocation(JRInstmt2.JRinit);
                                            // extract values
                                            JRrrecv2 = JRtmprecv2;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv2 != null)
                                        {
                                            JRInstmt2.j = (int)JRrrecv2.getInvoc();
                                            JRInstmt2.serviced = true;
                                            JRInstmt2.iter.remove(JRInstmt2.j);
                                            JRInstmt2.releaseIter();
                                            JRInstmt2.unlock();
                                            {
                                                try {
                                                    {
                                                        Set chs = ((Set)alarms.remove(currentTime));
                                                        if (chs != null) JRLoop4: for (Object ch : chs) ((// NUMBER 8
                                                        Cap_ext_)ch).send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                        // Begin Expr2
                                                        currentTime.increment();
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv2.retOp != null && JRrrecv2.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv2.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv2.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv2.retOp != null) && (JRrrecv2.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv2.handler != null)
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv2.fretOp.send(jrvm.getTimestamp(), JRrrecv2.handler, (java.lang.Object []) null);
                                                        JRrrecv2.fretOp = null;
                                                    }
                                                    else if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv2.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv2.retOp != null)
                                                JRrrecv2.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt2.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 1:
                                    {
                                        JRInstmt2.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec2 = (QuantRec)JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex];
                                        Recv_ext JRrrecv2 = null, JRtmprecv2;
                                        for (JRInstmt2.iter = JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex].theCap.elements();
                                             JRInstmt2.iter.hasNext();)
                                        {
                                            JRtmprecv2 = (Recv_ext)JRInstmt2.iter.next();
                                            JRInstmt2.JRinit.setInvoc(JRInstmt2.j++);
                                            JRtmprecv2.setInvocation(JRInstmt2.JRinit);
                                            // extract values
                                            JRrrecv2 = JRtmprecv2;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv2 != null)
                                        {
                                            JRInstmt2.j = (int)JRrrecv2.getInvoc();
                                            JRInstmt2.serviced = true;
                                            JRInstmt2.iter.remove(JRInstmt2.j);
                                            JRInstmt2.releaseIter();
                                            JRInstmt2.unlock();
                                            {
                                                try {
                                                    {
                                                        // Return
                                                        {
                                                            if (true)
                                                                { if (JRrrecv2.retOp != null)
                                                                    JRrrecv2.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(((MyTime)((MyTime)currentTime.clone())))});
                                                                else {
                                                                    MyTime JRevaltmp = ((MyTime)((MyTime)currentTime.clone()));
                                                                    
                                                                }
                                                                break _label_JRInstmt2; }}
                                                        
                                                        // End Return

                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv2.retOp != null && JRrrecv2.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv2.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv2.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv2.retOp != null) && (JRrrecv2.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv2.handler != null)
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv2.fretOp.send(jrvm.getTimestamp(), JRrrecv2.handler, (java.lang.Object []) null);
                                                        JRrrecv2.fretOp = null;
                                                    }
                                                    else if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv2.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            
                                        }
                                        else
                                            JRInstmt2.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 2:
                                    {
                                        JRInstmt2.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec2 = (QuantRec)JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex];
                                        Recv_ext JRrrecv2 = null, JRtmprecv2;
                                        // not artificial
                                        // NUMBER 3
                                        Cap_ext_ ch = null;
                                        // not artificial
                                        MyTime t = null;
                                        for (JRInstmt2.iter = JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex].theCap.elements();
                                             JRInstmt2.iter.hasNext();)
                                        {
                                            JRtmprecv2 = (Recv_ext)JRInstmt2.iter.next();
                                            JRInstmt2.JRinit.setInvoc(JRInstmt2.j++);
                                            JRtmprecv2.setInvocation(JRInstmt2.JRinit);
                                            // extract values
                                            ch = (// not artificial
                                            // NUMBER 3
                                            Cap_ext_)JRtmprecv2.JRargs[0];
                                            t = (// not artificial
                                            MyTime)JRtmprecv2.JRargs[1];
                                            JRrrecv2 = JRtmprecv2;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv2 != null)
                                        {
                                            JRInstmt2.j = (int)JRrrecv2.getInvoc();
                                            JRInstmt2.serviced = true;
                                            JRInstmt2.iter.remove(JRInstmt2.j);
                                            JRInstmt2.releaseIter();
                                            JRInstmt2.unlock();
                                            {
                                                try {
                                                    {
                                                        MyTime at = (((MyTime)((MyTime)currentTime.clone()))).add(t);
                                                        Set chs = ((Set)alarms.remove(at));
                                                        if (chs == null) // Begin Expr2
                                                        chs = new HashSet();
                                                        // Begin Expr2
                                                        chs.add(ch);
                                                        // Begin Expr2
                                                        alarms.put(at, chs);
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv2.retOp != null && JRrrecv2.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv2.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv2.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv2.retOp != null) && (JRrrecv2.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv2.handler != null)
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv2.fretOp.send(jrvm.getTimestamp(), JRrrecv2.handler, (java.lang.Object []) null);
                                                        JRrrecv2.fretOp = null;
                                                    }
                                                    else if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv2.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv2.retOp != null)
                                                JRrrecv2.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt2.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 3:
                                    {
                                        JRInstmt2.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec2 = (QuantRec)JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex];
                                        Recv_ext JRrrecv2 = null, JRtmprecv2;
                                        // not artificial
                                        // NUMBER 3
                                        Cap_ext_ ch = null;
                                        for (JRInstmt2.iter = JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex].theCap.elements();
                                             JRInstmt2.iter.hasNext();)
                                        {
                                            JRtmprecv2 = (Recv_ext)JRInstmt2.iter.next();
                                            JRInstmt2.JRinit.setInvoc(JRInstmt2.j++);
                                            JRtmprecv2.setInvocation(JRInstmt2.JRinit);
                                            // extract values
                                            ch = (// not artificial
                                            // NUMBER 3
                                            Cap_ext_)JRtmprecv2.JRargs[0];
                                            JRrrecv2 = JRtmprecv2;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv2 != null)
                                        {
                                            JRInstmt2.j = (int)JRrrecv2.getInvoc();
                                            JRInstmt2.serviced = true;
                                            JRInstmt2.iter.remove(JRInstmt2.j);
                                            JRInstmt2.releaseIter();
                                            JRInstmt2.unlock();
                                            {
                                                try {
                                                    {
                                                        Set chs = ((Set)alarms.remove(endTime));
                                                        if (chs == null) ch.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null); else {
                                                            // Begin Expr2
                                                            chs.add(ch);
                                                            // Begin Expr2
                                                            alarms.put(endTime, chs);
                                                        }
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv2.retOp != null && JRrrecv2.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv2.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv2.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv2.retOp != null) && (JRrrecv2.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv2.handler != null)
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv2.fretOp.send(jrvm.getTimestamp(), JRrrecv2.handler, (java.lang.Object []) null);
                                                        JRrrecv2.fretOp = null;
                                                    }
                                                    else if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv2.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv2.retOp != null)
                                                JRrrecv2.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt2.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    case 4:
                                    {
                                        JRInstmt2.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec2 = (QuantRec)JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex];
                                        Recv_ext JRrrecv2 = null, JRtmprecv2;
                                        for (JRInstmt2.iter = JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex].theCap.elements();
                                             JRInstmt2.iter.hasNext();)
                                        {
                                            JRtmprecv2 = (Recv_ext)JRInstmt2.iter.next();
                                            JRInstmt2.JRinit.setInvoc(JRInstmt2.j++);
                                            JRtmprecv2.setInvocation(JRInstmt2.JRinit);
                                            // extract values
                                            JRrrecv2 = JRtmprecv2;
                                            break;  // get first one
                                        }
                                        // Start of servicing
                                        if (JRrrecv2 != null)
                                        {
                                            JRInstmt2.j = (int)JRrrecv2.getInvoc();
                                            JRInstmt2.serviced = true;
                                            JRInstmt2.iter.remove(JRInstmt2.j);
                                            JRInstmt2.releaseIter();
                                            JRInstmt2.unlock();
                                            {
                                                try {
                                                    {
                                                        // Begin Expr2
                                                        run = false;
                                                    }
                                                } catch (Exception JRe) {
                                                    if (JRrrecv2.retOp != null && JRrrecv2.fretOp == null)
                                                    {
                                                        // forward of cocall
                                                        if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                        else {
                                                            // give preference to propagation through the call stack
                                                            JRrrecv2.retOp.send(jrvm.getTimestamp(), JRe);
                                                            JRrrecv2.retOp = null;
                                                        }
                                                    }
                                                    else if ((JRrrecv2.retOp != null) && (JRrrecv2.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // for cocall exception handling in operation invocation
                                                        if (JRrrecv2.handler != null)
                                                            JRrrecv2.handler.JRhandler(JRe);
                                                            else {
                                                                // catch all
                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                            }
JRrrecv2.fretOp.send(jrvm.getTimestamp(), JRrrecv2.handler, (java.lang.Object []) null);
                                                        JRrrecv2.fretOp = null;
                                                    }
                                                    else if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    {
                                                        // this should only be a send
                                                        JRrrecv2.handler.JRhandler(JRe);
                                                    }
    else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
                                                }
                                            }
                                            { if (JRrrecv2.retOp != null)
                                                JRrrecv2.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                        }
                                        else
                                            JRInstmt2.releaseIter();
                                        // End of servicing
                                        // End InniArm
                                        break;
                                    }
                                    
                                }
                            }
                            if (!JRInstmt2.serviced)
                            {
                                // must block and loop
                                JRInstmt2.waitOnLock();
                            }
                        } while (!JRInstmt2.serviced);
                    }
                    // End Inni
                    
                }
                JRget_op_stopTicker_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
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
    
    private Op_ext.JRProxyOp JRget_op_ticker_voidTovoid()
    {
        return op_ticker_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_ticker_voidTovoid;
    class ProcOp_voidTovoid_implticker extends ProcOp_ext_impl
    {
        Clock thisarg;
        public ProcOp_voidTovoid_implticker(Clock thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.tickervoidTovoid(null, null, null, JRargs);
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
                    thisarg.tickervoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    
    private void tickervoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_ticker_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void tickervoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                InStatObj JRInstmt3 = new InStatObj(1, false);
                boolean run = true;
                long next = System.currentTimeMillis();
                long w = /*JR init for inni*/ 0;
                JRLoop6: do {
                    {
                        // Inni Statement without quantifier
                        JRInstmt3.armArray[0] = new QuantRec(new Cap_ext_(op_stopTicker_voidTovoid, "void"), 0, 0);
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
                                                        run = false;
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
                                JRInstmt3.unlock();
                                JRInstmt3.serviced = true;
                                {
                                    // Begin Expr2
                                    next += ms;
                                    // Begin Expr2
                                    w = Math.max(0, next - System.currentTimeMillis());
                                    // Begin Expr2
                                    edu.ucdavis.jr.JR.nap(w);
                                    JRget_op_tick_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                }
                            }
                        } while (!JRInstmt3.serviced);
                    }
                    // End Inni
                    
                }                 while (run);
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
    
    protected boolean JRcalled = false;
    protected JRClock jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_ticker_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implticker(this));
    	op_loop_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implloop(this));
    	op_stopTicker_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_tick_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_shutdown_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_setAlarmEndTime_Cap_voidTovoidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_setAlarm_Cap_voidTovoidXMyTimeTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_getTime_voidToMyTime = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRClock(op_ticker_voidTovoid, op_loop_voidTovoid, op_stopTicker_voidTovoid, op_tick_voidTovoid, op_shutdown_voidTovoid, op_setAlarmEndTime_Cap_voidTovoidTovoid, op_setAlarm_Cap_voidTovoidXMyTimeTovoid, op_getTime_voidToMyTime);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    	try {
    		op_ticker_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    		op_loop_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	} catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    }
}
