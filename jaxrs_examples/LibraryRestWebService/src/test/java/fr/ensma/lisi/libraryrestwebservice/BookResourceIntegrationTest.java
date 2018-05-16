package fr.ensma.lisi.libraryrestwebservice;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import junit.framework.Assert;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
public class BookResourceIntegrationTest {

	@Test
	public void testGetDetailsBookId() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		// Get TEXT for application
		Assert.assertEquals(
				"Ce livre est une introduction sur la vie",
				service.path("books").path("details").path("12")
						.accept(MediaType.TEXT_PLAIN).get(String.class));
		// Get XML for application
		Assert.assertEquals(
				"<?xml version=\"1.0\"?><details>Ce livre est une introduction sur la vie</details>",
				service.path("books").path("details").path("12")
						.accept(MediaType.TEXT_XML).get(String.class));
		// Get HTML for application
		Assert.assertEquals(
				"<html><title>Details</title><body><h1>Ce livre est une introduction sur la vie</h1></body></html>",
				service.path("books").path("details").path("12")
						.accept(MediaType.TEXT_HTML).get(String.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8088/libraryrestwebservice/").build();
	}
}
