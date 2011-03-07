/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;
import java.util.*;

public class Customer extends java.lang.Object {
    { JRinit(); }
    private static int counter = 0;
    private Pub.Drink preferredDrink;
    private Table preferredTable;
    private boolean running;
    private int id;
    private int numDrinks;
    private Container currentDrink;
    private MyTime orderTime;
    private boolean lastCallInterrupt = false;
    private // NUMBER 8
    Cap_ext_ order;
    private // NUMBER 8
    Cap_ext_ goodbye;
    private // NUMBER 8
    Cap_ext_ stats;
    public Op_ext.JRProxyOp JRget_op_lastCall_voidTovoid()
    {
        return op_lastCall_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_lastCall_voidTovoid;
    
    public Op_ext.JRProxyOp JRget_op_finishedDrink_voidTovoid()
    {
        return op_finishedDrink_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_finishedDrink_voidTovoid;
    
    public Op_ext.JRProxyOp JRget_op_leftDrink_voidTovoid()
    {
        return op_leftDrink_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_leftDrink_voidTovoid;
    
    public Op_ext.JRProxyOp JRget_op_leave_voidTovoid()
    {
        return op_leave_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_leave_voidTovoid;
    
    private Op_ext.JRProxyOp JRget_op_getOrder_ContainerTovoid()
    {
        return op_getOrder_ContainerTovoid;
    }
    
    public Op_ext.JRProxyOp op_getOrder_ContainerTovoid;
    
    
    public Customer(// NUMBER 8
    Cap_ext_ order, // NUMBER 8
    Cap_ext_ goodbye, // NUMBER 8
    Cap_ext_ stats, Table table) {
        // Begin Expr2
        super();
        Random random = new Random();
        // Begin Expr2
        this.order = order;
        // Begin Expr2
        this.goodbye = goodbye;
        // Begin Expr2
        this.stats = stats;
        int rand = random.nextInt(Pub.Drink.values().length);
        // Begin Expr2
        this.preferredDrink = Pub.Drink.values()[rand];
        // Begin Expr2
        this.running = true;
        // Begin Expr2
        this.numDrinks = 1 + random.nextInt(3);
        // Begin Expr2
        this.preferredTable = table;
        // Begin Expr2
        this.id = ++Customer.counter;
        JRprocess();
    }
    public Op_ext.JRProxyOp JRget_op_run_voidTovoid()
    {
        return op_run_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_run_voidTovoid;
    class ProcOp_voidTovoid_implrun extends ProcOp_ext_impl
    {
        Customer thisarg;
        public ProcOp_voidTovoid_implrun(Customer thisIn) throws RemoteException
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
                InStatObj JRInstmt4 = new InStatObj(4, false);
                List greetings = new ArrayList();
                // Begin Expr2
                greetings.add("Good to see you, old chap!");
                // Begin Expr2
                greetings.add("Greetings, friends!");
                // Begin Expr2
                greetings.add("Hello Pub!");
                // Begin Expr2
                System.out.println("Customer " + this.id + ": " + ((String)greetings.get(new Random().nextInt(greetings.size()))));
                // Begin Expr2
                this.getDrink();
                JRLoop9: while (this.running) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt4.armArray[0] = new QuantRec(new Cap_ext_(op_finishedDrink_voidTovoid, "void"), 0, 0);
                        JRInstmt4.armArray[1] = new QuantRec(new Cap_ext_(op_lastCall_voidTovoid, "void"), 1, 1);
                        JRInstmt4.armArray[2] = new QuantRec(new Cap_ext_(op_getOrder_ContainerTovoid, "void"), 2, 2);
                        JRInstmt4.armArray[3] = new QuantRec(new Cap_ext_(op_leave_voidTovoid, "void"), 3, 3);
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
                                                        if (this.lastCallInterrupt) {
                                                            // Begin Expr2
                                                            this.lastCallInterrupt = false;
                                                            { if (JRrrecv4.retOp != null)
                                                                JRrrecv4.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
                                                            continue JRLoop9;}
                                                        }
                                                        // Begin Expr2
                                                        this.leaveContainer();
                                                        if (this.numDrinks == 0) {
                                                            // Begin Expr2
                                                            this.running = false;
                                                        } else {
                                                            // Begin Expr2
                                                            this.getDrink();
                                                        }
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
                                    case 1:
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
                                                        if (this.numDrinks > 0 && this.preferredDrink == Pub.Drink.BEER) {
                                                            // Begin Expr2
                                                            this.lastCallInterrupt = true;
                                                            // Begin Expr2
                                                            this.leaveContainer();
                                                            // Begin Expr2
                                                            this.getDrink();
                                                        }
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
                                    case 2:
                                    {
                                        JRInstmt4.j = 0;
                                        // Inni Arm
                                        QuantRec JRquantRec4 = (QuantRec)JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex];
                                        Recv_ext JRrrecv4 = null, JRtmprecv4;
                                        // not artificial
                                        Container c = null;
                                        for (JRInstmt4.iter = JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex].theCap.elements();
                                             JRInstmt4.iter.hasNext();)
                                        {
                                            JRtmprecv4 = (Recv_ext)JRInstmt4.iter.next();
                                            JRInstmt4.JRinit.setInvoc(JRInstmt4.j++);
                                            JRtmprecv4.setInvocation(JRInstmt4.JRinit);
                                            // extract values
                                            c = (// not artificial
                                            Container)JRtmprecv4.JRargs[0];
                                            if (this.running)
                                                JRrrecv4 = JRtmprecv4;
                                            if (JRrrecv4 != null)
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
                                                        if (c == null) {
                                                            // Begin Expr2
                                                            System.out.println("Customer " + this.id + ": Oh, that\'s to bad. Guess I\'ll head home.");
                                                            { if (JRrrecv4.retOp != null)
                                                                JRrrecv4.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
                                                            continue JRLoop9;}
                                                        }
                                                        // Begin Expr2
                                                        this.currentDrink = c;
                                                        // Begin Expr2
                                                        this.numDrinks--;
                                                        MyTime time = new MyTime(((MyTime) (new Cap_ext_(Pub.getClock().JRget_op_getTime_voidToMyTime(), "MyTime")).call(jrvm.getTimestamp(), (java.lang.Object[]) null)).compareTo(this.orderTime));
                                                        // Begin Expr2
                                                        System.out.println("Customer " + this.id + ": Thank you! I waited " + time + ".");
                                                        this.stats.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {time});
                                                        Pub.getClock().JRget_op_setAlarm_Cap_voidTovoidXMyTimeTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(this.JRget_op_finishedDrink_voidTovoid(), "void")// operation void()
                                                        , new MyTime(0, 10, 0)});
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
                                    case 3:
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
                                                        // Begin Expr2
                                                        this.numDrinks = 0;
                                                        if (this.currentDrink == null) {
                                                            // Begin Expr2
                                                            System.out.println("Customer " + this.id + ": Oh, no more drinking for me..");
                                                            // Begin Expr2
                                                            this.running = false;
                                                        }
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
                this.goodbye.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {this});
                // Begin Expr2
                System.out.println("Customer " + this.id + ": I bid you all adiue!");
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
    
    
    private void leaveContainer() {
        if (((Boolean) (new Cap_ext_(this.preferredTable.JRget_op_putDown_Cap_voidTovoidXContainerToboolean(), "boolean")).call(jrvm.getTimestamp(), new java.lang.Object [] {new Cap_ext_(this.JRget_op_leftDrink_voidTovoid(), "void")// operation void()
        , this.currentDrink})) == false) {
            // Receive
            {
                jrvm.sendAndDie();
                Recv_ext recv_voidTovoid = this.JRget_op_leftDrink_voidTovoid().recv();
                jrvm.ariseAndReceive();
                if (recv_voidTovoid.retOp != null)
                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
            }
            // End Receive
            
        }
        // Begin Expr2
        this.currentDrink = null;
    }
    
    private void getDrink() {
        // Begin Expr2
        System.out.println("Customer " + this.id + ": I would like a " + this.preferredDrink + ", please.");
        this.order.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(JRget_op_getOrder_ContainerTovoid()), this.preferredDrink});
        // Begin Expr2
        this.orderTime = ((MyTime) (new Cap_ext_(Pub.getClock().JRget_op_getTime_voidToMyTime(), "MyTime")).call(jrvm.getTimestamp(), (java.lang.Object[]) null));
    }
    protected boolean JRcalled = false;
    protected JRCustomer jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_run_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implrun(this));
    	op_getOrder_ContainerTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_leave_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_leftDrink_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_finishedDrink_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	op_lastCall_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRCustomer(op_run_voidTovoid, op_getOrder_ContainerTovoid, op_leave_voidTovoid, op_leftDrink_voidTovoid, op_finishedDrink_voidTovoid, op_lastCall_voidTovoid);
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
