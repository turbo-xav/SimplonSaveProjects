package soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
@WebService(serviceName = "TestXav")
public class TestXav {
	
	/**
	   * return int 1
	   * 
	   * 
	   * @return int : 1
	   */
	  @WebMethod
	  public int ping() {
	    return 1;
	  }
}
