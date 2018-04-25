package server;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{
 
	@WebMethod String getHelloWorldAsString(String name);
	
	@WebMethod
	@WebResult(name = "Personne")
	public Personne getPersonne(String name);
	@WebMethod
	@WebResult(name = "Personnes")
	public Personnes getPersonnes();

}
