package server;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServletTurboXav404 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,  java.io.IOException{
		resp.getWriter().println("<?xml version=\"1.0\"?><request>POST ENVOYE !</request>");
		resp.setContentType("text/xml ");
		resp.setStatus(200);
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,  java.io.IOException{
		
		
		resp.setStatus(404);
		resp.getWriter().println("Non non, ce n'est pas par là !");
		
		
	}
	
}
