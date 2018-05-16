package fr.ensma.lisi.helloworldrestwebservicefromjavase;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.ext.RuntimeDelegate;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Test;

import com.sun.grizzly.http.SelectorThread;
import com.sun.grizzly.tcp.Adapter;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.container.grizzly.GrizzlyServerFactory;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
public class HelloWorldResourceTest {	
	
	protected SelectorThread st;

	@After
	public void tearDown() {
		if (st != null) {
			st.stopEndpoint();
		}
	}
	
	@Test
	public void testDoGetWithApplication() throws InstantiationException, IllegalArgumentException, IOException {
		Application app = new HelloWorldRestWebServiceApplication();
		
		RuntimeDelegate rd = RuntimeDelegate.getInstance();
		Adapter a = rd.createEndpoint(app, Adapter.class);
		
		st = GrizzlyServerFactory.create(UriBuilder.fromUri("http://127.0.0.1:8084/").build(), a);
		
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		// Get TEXT for application
		Assert.assertEquals(
				"Hello World from text/plain",
				service.path("hello").accept(MediaType.TEXT_PLAIN).get(String.class));
	}
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://127.0.0.1:8084/").build();
	}
}
