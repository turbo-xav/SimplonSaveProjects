package fr.ensma.lisi.librarycontentrestwebservice;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
@Path("/contentbooks")
public class BookResource {
	
	private byte[] readFromStream(InputStream stream) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[1000];
		int wasRead = 0;
		do {
			wasRead = stream.read(buffer);
			if (wasRead > 0) {
				baos.write(buffer, 0, wasRead);
			}
		} while (wasRead > -1);
		return baos.toByteArray();
	}
	
	/**
	 * 
	 * @param newBook
	 * @return
	 */
	@Consumes("application/xml")
	@POST
	@Path("uribuilder2")
	public Response createURIBooks(Book newBook, @Context UriInfo uri) {
		System.out.println("BookResource.createURIBooks()");
		
		URI build = UriBuilder
			.fromUri("http://www.mylocalhost")
			.path("path1")
			.path("path2")
			.build();
		return Response.created(build).build();
	}	
	
	/**
	 * 
	 * @param newBook
	 * @return
	 */
	@Consumes("application/xml")
	@POST
	@Path("uribuilder1")
	public Response createBooksFromURI(Book newBook, @Context UriInfo uri) {
		System.out.println("BookResource.createBooksFromURI()");
		
		URI absolutePath = uri
			.getAbsolutePathBuilder()
			.queryParam("param1", newBook.getName())
			.path(newBook.getIsbn())
			.build();
		return Response.created(absolutePath).build();
	}	
	
	/**
	 * 
	 * @param newBook
	 * @return
	 */
	@Consumes("application/xml")
	@POST
	@Path("response")
	public Response createBasicBooks(Book newBook, @Context UriInfo uri) {
		System.out.println("BookResource.createBasicBooks()");
		
		URI absolutePath = uri.getAbsolutePath();
		return Response.created(absolutePath).build();
	}

	
	/**
	 * URI: /response/maintenance/
	 * 
	 * @return
	 */
	@Path("response/maintenance")
	@GET
	public Response getMaintenanceBooks() {
		System.out.println("BookResource.getMaintenanceBooks()");
		
		return Response
			.serverError()
			.build();
	}
	
	/**
	 * URI: /contentbooks/response/
	 * 
	 * @return
	 */
	@Path("response")
	@GET
	public Response getBooks() {
		System.out.println("BookResource.getBooks()");
		
		return Response
			.status(Response.Status.OK)
			.header("param1", "Bonjour")
			.header("param2", "Hello")
			.entity("Ceci est le message du coprs de la réponse")
			.header("serverd", "keulkeul")
			.build();
	}
	
	/**
	 * URI: /contentbooks/jaxbxml/
	 * 
	 * @return
	 * @throws IOException 
	 */
	@Path("jaxbxml")
	@Consumes("application/xml")
	@PUT
	public void updateContentBooksWithJAXBXML(Book current) throws IOException {
		System.out.println("BookResource.updateContentBooksWithJAXBXML()");
		
		System.out.println("Name: " + current.getName() + ", ISBN: " + current.getIsbn());
	}	
	
	/**
	 * URI: /contentbooks/jaxbjson/12
	 * 
	 * @return
	 * @throws IOException 
	 */
	@Path("jaxbjson/{id}")
	@Produces("application/json")
	@GET
	public Book getContentBooksWithJAXBJSON(@PathParam("id") String id) throws IOException {
		System.out.println("BookResource.updateContentBooksWithJAXBJSON()");
		
		Book myBook = new Book();
		myBook.setIsbn("1112223");
		myBook.setName("Harry Potter");
		
		return myBook;
	}
	
	/**
	 * URI: /contentbooks/jaxbxmlwithjaxbelement/
	 * 
	 * @return
	 * @throws IOException 
	 */
	@Path("jaxbxmlwithjaxbelement")
	@Consumes("application/xml")
	@PUT
	public void updateContentBooksWithJAXBElementXML(JAXBElement<Book> currentJAXBElemnt) throws IOException {
		System.out.println("BookResource.updateContentBooksWithJAXBElementXML()");

		Book current = currentJAXBElemnt.getValue();
		System.out.println("Name: " + current.getName() + ", ISBN: " + current.getIsbn());
	}		
	
	/**
	 * URI: /contentbooks/jaxbxml/
	 * 
	 * @return
	 */
	@Path("jaxbxml")
	@GET
	@Produces("application/xml")
	public Book getContentBooksWithJAXBXML() {
		System.out.println("BookResource.getContentBooksWithJAXBXML()");
		
		Book current = new Book();
		current.setIsbn("123-456-789");
		current.setName("Harry Toper");
		
		return current;		
	}	
	
	/**
	 * URI: /contentbooks/string/
	 * 
	 * @return
	 * @throws IOException 
	 */
	@Path("string")
	@PUT
	public void updateContentBooksWithString(String current) throws IOException {
		System.out.println("BookResource.updateContentBooksWithString()");
		
		System.out.println(current);
	}

	/**
	 * URI: /contentbooks/string/
	 * 
	 * @return
	 */
	@Path("string")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getContentBooksWithString() {
		System.out.println("BookResource.getContentBooksWithString()");
		
		return "<?xml version=\"1.0\"?>" + "<details>Ce livre est une introduction sur la vie" + "</details>";		
	}	
	
	/**
	 * URI: /contentbooks/inputstream/
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	@Path("inputstream")
	@GET
	@Produces(MediaType.TEXT_XML)
	public InputStream getContentBooksWithInputStream() throws FileNotFoundException {
		System.out.println("BookResource.getContentBooksWithInputStream()");
		
		FileInputStream fileInputStream = new FileInputStream("c:\\liaswebsite.xml");
		return fileInputStream;
	}
	
	/**
	 * URI: /contentbooks/file/
	 * 
	 * @return
	 * @throws IOException 
	 */
	@Path("file")
	@PUT
	public void updateContentBooksWithFile(File file) throws IOException {
		System.out.println("BookResource.updateContentBooksWithFile()");
		
		byte[] bytes = readFromStream(new FileInputStream(file));
		String input = new String(bytes);
		System.out.println(input);
	}	
	
	/**
	 * URI: /contentbooks/inputstream/
	 * 
	 * @return
	 * @throws IOException 
	 */
	@Path("inputstream")
	@PUT
	public void updateContentBooksWithInputStream(InputStream is) throws IOException {
		System.out.println("BookResource.updateContentBooksWithInputStream()");
		
		byte[] bytes = readFromStream(is);
		String input = new String(bytes);
		System.out.println(input);
	}
	
	/**
	 * URI: /contentbooks/file/
	 * 
	 * @return
	 */
	@Path("file")
	@GET
	@Produces(MediaType.TEXT_XML)
	public File getContentBooksWithFile() {
		System.out.println("BookResource.getContentBooksWithFile()");
		
		File file = new File("c:\\liaswebsite.xml");
		return file;		
	}
}
