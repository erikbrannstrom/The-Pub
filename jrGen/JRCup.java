/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRCup
      extends JRContainer
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public JRCup(JRCup copy)
	{
	    super(copy);

	}
	public JRCup(JRContainer superresref, Object ... opSig)
	{
	    super(superresref);

	}
	public JRCup(boolean dummy)	{
	    super(dummy);

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRCup(true);
	}
    }
