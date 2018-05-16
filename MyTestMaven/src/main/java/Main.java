import java.util.*;
import javax.naming.*; 

public class Main {
	

	

	  public static void main(String[] args) {
	    Properties ppt = null;
	    Context ctx = null;
	    Object ref = null;
	    MonPremierBeanHome home = null;
	    MonPremierBean bean = null;

	    try {
	      ppt = new Properties();
	      ppt.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
	      ppt.put(Context.PROVIDER_URL, "localhost:1099");
	      ctx = new InitialContext(ppt);  
	      ref = ctx.lookup("MonPremierBean");
	      home = (MonPremierBeanHome) javax.rmi.PortableRemoteObject.narrow(ref,
	        MonPremierBeanHome.class);      
	      bean = home.create();
	      System.out.println("message = " + bean.message());
	      bean.remove();
	    }
	    catch (Exception e) {
	       e.printStackTrace();
	    }
	  }
	
}
