/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRGlass
      extends JRContainer
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public JRGlass(JRGlass copy)
	{
	    super(copy);

	}
	public JRGlass(JRContainer superresref, Object ... opSig)
	{
	    super(superresref);

	}
	public JRGlass(boolean dummy)	{
	    super(dummy);

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRGlass(true);
	}
    }
