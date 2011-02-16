/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRChocolate
      extends JRResource
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public JRChocolate(JRChocolate copy)
	{
	    super(copy);

	}
	public JRChocolate(JRResource superresref, Object ... opSig)
	{
	    super(superresref);

	}
	public JRChocolate(boolean dummy)	{
	    super(dummy);

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRChocolate(true);
	}
    }
