package fr.ensma.lisi.helloworldrestwebservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
@Path("/hello")
public class HelloWorldResource {

	/**
	 * @return
	 */
	@GET
	@Produces("text/plain")
	public String getHelloWorld() {
		return "Hello World from text/plain";
	}
}
