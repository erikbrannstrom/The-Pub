/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRCoffee
      extends JRResource
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public JRCoffee(JRCoffee copy)
	{
	    super(copy);

	}
	public JRCoffee(JRResource superresref, Object ... opSig)
	{
	    super(superresref);

	}
	public JRCoffee(boolean dummy)	{
	    super(dummy);

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRCoffee(true);
	}
    }
