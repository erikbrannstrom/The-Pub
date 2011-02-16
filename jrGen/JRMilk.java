/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRMilk
      extends JRResource
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public JRMilk(JRMilk copy)
	{
	    super(copy);

	}
	public JRMilk(JRResource superresref, Object ... opSig)
	{
	    super(superresref);

	}
	public JRMilk(boolean dummy)	{
	    super(dummy);

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRMilk(true);
	}
    }
