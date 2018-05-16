package fr.ensma.lisi.libraryrestwebservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
public class SpecificBookResource {
	
	@GET
	@Path("{id}")
	public String getSpecificBookById(@PathParam("id") int id) {
		System.out.println("SpecificBookResource.getSpecificBookById()");
		
		return ".NET platform is Bad";
	}
}
