package fr.ensma.lisi.librarycontentrestwebservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;

import junit.framework.Assert;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
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
	public void testCreateURIBooksService() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		
		WebResource path = service.path("contentbooks").path("uribuilder2");
		Book newBook = new Book();
		newBook.setIsbn("1111");
		newBook.setName("Harry");
		ClientResponse post = path.post(ClientResponse.class, newBook);
		Assert.assertEquals("http://www.mylocalhost/path1/path2", post.getLocation().toString());
	}
	
	@Test
	public void testCreateBooksFromURIService() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("uribuilder1");
		
		Book newBook = new Book();
		newBook.setIsbn("1111");
		newBook.setName("Harry");
		
		ClientResponse post = path.post(ClientResponse.class, newBook);
		Assert.assertEquals("http://localhost:8088/librarycontentrestwebservice/contentbooks/uribuilder1/1111?param1=Harry", post.getLocation().toString());
	}
	
	@Test
	public void testCreateBasicBooksService() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("response");
		
		Book newBook = new Book();
		newBook.setIsbn("1111");
		newBook.setName("Harry");
		
		ClientResponse post = path.post(ClientResponse.class, newBook);
		Assert.assertEquals("http://localhost:8088/librarycontentrestwebservice/contentbooks/response", post.getLocation().toString());
	}
	
	@Test
	public void testGetMaintenanceBooksService() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("response/maintenance");
		ClientResponse clientResponse = path.get(ClientResponse.class);
		Assert.assertEquals(500, clientResponse.getStatus());
	}
	
	@Test
	public void testGetBooksService() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("response");
		ClientResponse response = path.get(ClientResponse.class);
		MultivaluedMap<String, String> headers = response.getHeaders();
		Assert.assertEquals("Bonjour", headers.getFirst("param1"));
		Assert.assertEquals("Hello", headers.getFirst("param2"));
		String entity = response.getEntity(String.class);
		Assert.assertEquals("Ceci est le message du coprs de la réponse", entity);
		Assert.assertEquals("Jetty(6.1.14)", headers.getFirst("server"));
	}
	
	@Test
	public void testUpdateContentBooksWithJAXBXMLService() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("jaxbxml");
		Book current = new Book();
		current.setIsbn("123-456-789");
		current.setName("Harry Toper");
		
		path.put(current);
	}
	
	@Test
	public void testGetContentBooksWithJAXBJSON() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("jaxbjson");
		Book book = path.get(Book.class);
		System.out.println(book);
	}
	
	@Test
	public void testUpdateContentBooksWithJAXBElementXML() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("jaxbxmlwithjaxbelement");
		Book current = new Book();
		current.setIsbn("123-456-789");
		current.setName("Harry Toper");
		
		path.put(current);		
	}
	
	@Test
	public void testGetContentBooksWithJAXBXMLService() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("jaxbxml");
		Book book = path.get(Book.class);
		
		Assert.assertNotNull(book);
		Assert.assertEquals("Harry Toper", book.getName());
	}
	
	@Test
	public void testUpdateContentBooksWithStringService() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("string");
		path.put("blabla");
	}
	
	@Test
	public void testGetContentBooksWithStringService() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("string");
		String is = path.get(String.class);
		
		Assert.assertNotNull(is);
		Assert.assertEquals("<?xml version=\"1.0\"?>" + "<details>Ce livre est une introduction sur la vie" + "</details>", is);
	}
		
	@Test
	public void testGetContentBooksWithInputStreamService() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("inputstream");
		InputStream is = path.get(InputStream.class);
		
		Assert.assertNotNull(is);
	}
	
	@Test
	public void testUpdateContentBooksWithFileService() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("file");
		path.put(new File("c:\\liaswebsite.xml"));
	}
	
	@Test
	public void testUpdateContentBooksWithInputStreamService() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("inputstream");
		path.put(new FileInputStream("c:\\liaswebsite.xml"));
	}
	
	@Test
	public void testGetContentBooksWithFileService() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		WebResource path = service.path("contentbooks").path("file");
		File file = path.get(File.class);
		
		Assert.assertNotNull(file);
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8088/librarycontentrestwebservice/").build();
	}
}
