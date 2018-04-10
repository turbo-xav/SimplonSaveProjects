package server;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloGenericServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String phrase = "Hello World !";
	
	public HelloGenericServlet() {
		super();
	}
	
	public HelloGenericServlet(String phrase) {
		this.phrase = phrase;
	}
	
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		//this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		response.getWriter().println("Hello from HelloGenericServlet !\n"+"got:\n"+request);
		response.getWriter().println(request.getParameter("test"));
		response.getWriter().println(this.phrase);
	}
	/*@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println("Hello from HelloGenericServlet !\n"+"got:\n"+request);
		response.getWriter().println(request.getParameter("test"));
		response.getWriter().println(this.phrase);
		
		if(!request.toString().contains("/favicon.ico")) {
			System.out.println("Saisir une chaine : ");
			Scanner sc = new Scanner(System.in);
			String saisie = sc.nextLine();
			System.out.println("Requete "+saisie);
			response.getWriter().println(saisie);
		}
	}*/

}
