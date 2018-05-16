import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;


public class MonPremierEJBBean implements SessionBean {

  public String message() {
    return "Bonjour";	
  }

  public void ejbActivate() {
  }

  public void ejbPassivate() {
  }

  public void ejbRemove() {
  }

  public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
  }
   
  public void ejbCreate() {
  }
}
