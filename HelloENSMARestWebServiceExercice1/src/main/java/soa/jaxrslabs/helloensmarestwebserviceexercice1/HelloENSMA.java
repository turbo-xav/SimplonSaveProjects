package soa.jaxrslabs.helloensmarestwebserviceexercice1;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("helloensma")
public class HelloENSMA {
    
	public HelloENSMA() { }
    
    
    @GET
    @Produces("application/xml")
    public String getXml() {
        return "<bonjour>Bonjour ENSMA</bonjour>";
    }
    
    @GET
    @Path("{id}")
    @Produces("application/xml")
    public Response getXmlWithParams(
            @PathParam("id") String id,
            @DefaultValue("all") @HeaderParam("name") String name) {
        System.out.println(id);
        System.out.println(name);
        return Response
          .status(Status.OK)
          .entity("<bonjour>Bonjour ENSMA de la part de " + name + "</bonjour>")
          .build();
    }
    
    @GET
	@Path("/query")
	public Response getUsers(
		@QueryParam("from") int from,
		@QueryParam("to") int to,
		@QueryParam("orderBy") List<String> orderBy) {

		return Response
		   .status(200)
		   .entity("getUsers is called, from : " + from + ", to : " + to
			+ ", orderBy" + orderBy.toString()).build();

	}
    
}
