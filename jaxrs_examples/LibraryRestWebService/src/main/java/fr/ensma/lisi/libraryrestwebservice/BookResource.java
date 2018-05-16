package fr.ensma.lisi.libraryrestwebservice;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
@Path("/books")
public class BookResource {

	/**
	 * URI: /
	 * 
	 * @return
	 */
	@GET	
	public String getBooks() {
		System.out.println("BookResource.getBooks()");
		
		return "Cuisine et moi / JavaEE 18";
	}
	
	/**
	 * URI : /
	 * 
	 * @param livre
	 * @return
	 */
	@POST
	@Path("{id}")
	public String createBook(@PathParam("id") String livre) {
		System.out.println("BookResource.createBook()");
		
		return livre;
	}
	
	/**
	 * URI: /borrowed
	 * 
	 * @return
	 */
	@GET
	@Path("/borrowed")
	public String getBorrowedBooks() {
		System.out.println("BookResource.getBorrowedBooks()");
		
		return "Java in 5 lessons / Java VS .NET";
	}
	
	/**
	 * URI: /123
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("{id}")
	public String getBookById(@PathParam("id") int id) {
		System.out.println("BookResource.getBookById()");
		
		return "Java For Life " + id;
	}
	
	/**
	 * URI: /123
	 * 
	 * @param id
	 */
	@PUT
	@Path("{id}")
	public void updateBookById(@PathParam("id") int id) {
		System.out.println("BookResource.updateBookById()");
	}
	
	/**
	 * URI: /123
	 * 
	 * @param id
	 */
	@DELETE
	@Path("{id}")
	@Context
	public void deleteBookById(@PathParam("id") int id) {
		System.out.println("BookResource.deleteBookById()");
	}
	
	/**
	 * URI: /name-sc2-editor-oreilly
	 * 
	 * @param name
	 * @param editor
	 * @return
	 */
	@GET
	@Path("name-{name}-editor-{editor}")
	public String getBookByNameAndEditor(@PathParam("name") String name, @PathParam("editor") String editor) {
		System.out.println("BookResource.getBookByNameAndEditor()");
		
		return "Starcraft 2 for Dummies (Name:" + name + " - Editor:" + editor + ")";
	}	
	
	/**
	 * URI: /123/path1/path2/editor
	 * 
	 * @return
	 */
	@GET
	@Path("{id : .+}/editor")
	public String getBookEditorById(@PathParam("id") String id) {
		System.out.println("BookResource.getBookEditorById()");
		
		return "OReilly";
	}
	
	/**
	 * URI: /123/path1/path2/path3
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("original/{id : .+}")
	public String getOriginalBookById(@PathParam("id") String id) {
		System.out.println("BookResource.getSpecificBookById()");
		
		return "Java For Life 2";
	}
	
	@Path("specific")
	public SpecificBookResource getSpecificBook() {
		System.out.println("BookResource.getSpecificBook()");
		
		return new SpecificBookResource();
	}
	
	/**
	 * URI: /queryparameters/?name=harry&isbn=1-111111-11&isExtended=true
	 * 
	 * @param name
	 * @param isbn
	 * @param isExtented
	 * @return
	 */
	@GET
	@Path("queryparameters")
	public String getQueryParameterBook(
			@DefaultValue("all") @QueryParam("name") String name,
			@DefaultValue("?-???????-?") @QueryParam("isbn") String isbn,
			@DefaultValue("false") @QueryParam("isExtended") boolean isExtented) {
		System.out.println("BookResource.getQueryParameterBook()");
		
		return name + " " + isbn + " " + isExtented;
	}
	
	@POST
	@Path("createfromform")
	@Consumes("application/x-www-form-urlencoded")
	public String createBookFromForm(@FormParam("name") String name) {
		System.out.println("BookResource.createBookFromForm()");
		
		return name;
	}
	
	/**
	 * URI: /headerparameters
	 * 
	 * @param name
	 * @param isbn
	 * @param isExtented
	 * @return
	 */
	@GET
	@Path("headerparameters")
	public String getHeaderParameterBook(
			@DefaultValue("all") @HeaderParam("name") String name,
			@DefaultValue("?-???????-?") @HeaderParam("isbn") String isbn,
			@DefaultValue("false") @HeaderParam("isExtended") boolean isExtented) {
		System.out.println("BookResource.getHeaderParameterBook()");
		
		return name + " " + isbn + " " + isExtented;
	}
	
	/**
	 * @param uriInfo
	 * @param name
	 * @return
	 */
	@GET
	@Path("informationfromuriinfo/{name}")
	public String getInformationFromUriInfo(@Context UriInfo uriInfo, @PathParam("name") String name) {
		System.out.println("getPath(): " + uriInfo.getPath());
		List<PathSegment> pathSegments = uriInfo.getPathSegments();
		System.out.print("getPathSegements(): ");
		for (PathSegment pathSegment : pathSegments) {
			System.out.print(pathSegment.getPath() + " ");
		}
		System.out.println();
		
		System.out.print("getPathParameters(): ");
		MultivaluedMap<String, String> pathParameters = uriInfo.getPathParameters();
		Set<String> pathParametersSet = pathParameters.keySet();
		for (String currentParameter : pathParametersSet) {
			System.out.print(currentParameter + " ");
		}
		System.out.println();
		
		System.out.print("getQueryParameters(): ");
		MultivaluedMap<String, String> queryParameters = uriInfo.getQueryParameters();
		Set<String> queryParametersSet = queryParameters.keySet();
		for (String currentParameter : queryParametersSet) {
			System.out.print(currentParameter + " ");
		}
		System.out.println();
		
		System.out.println("getAbsolutePath(): " + uriInfo.getAbsolutePath());
		System.out.println("getBaseUri(): " + uriInfo.getBaseUri());
		System.out.println("getRequestUri(): " + uriInfo.getRequestUri());
		
		return "";
	}
	
	/**
	 * @param httpheaders
	 * @return
	 */
	@GET
	@Path("informationfromhttpheaders/{name}")
	public String getInformationFromHttpHeaders(@Context HttpHeaders httpheaders) {
		Map<String, Cookie> cookies = httpheaders.getCookies();
		Set<String> currentKeySet = cookies.keySet();
		for (String currentCookie : currentKeySet) {
			System.out.println(currentCookie);
		}
		
		MultivaluedMap<String, String> requestHeaders = httpheaders.getRequestHeaders();
		Set<String> requestHeadersSet = requestHeaders.keySet();
		for (String currentHeader : requestHeadersSet) {
			System.out.println(currentHeader);
		}
		
		return "";
	}	
	
	/**
	 * URI: /details/plain/12
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("details/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getDetailTextBookId(@PathParam("id") String id) {
		System.out.println("BookResource.getDetailTextBookId()");
		
		return "Ce livre est une introduction sur la vie";
	}
	
	/**
	 * URI: /details/xml/12
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("details/{id}")
	@Produces(MediaType.TEXT_XML)
	public String getDetailXMLBookId(@PathParam("id") String id) {
		System.out.println("BookResource.getDetailXMLBookId()");
		
		return "<?xml version=\"1.0\"?>" + "<details>Ce livre est une introduction sur la vie" + "</details>";
	}
	
	/**
	 * URI: /details/html/12
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("details/{id}")
	@Produces(MediaType.TEXT_HTML)
	public String getDetailHTMLBookId(@PathParam("id") String id) {
		System.out.println("BookResource.getDetailHTMLBookId()");
		
		return "<html>" + "<title>" + "Details" + "</title>" + "<body><h1>" + "Ce livre est une introduction sur la vie" + "</h1></body>" + "</html>";
	}	
}
