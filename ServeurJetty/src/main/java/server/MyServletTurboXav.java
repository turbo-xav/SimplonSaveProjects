package server;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServletTurboXav extends HttpServlet {

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
					
		Cookie[] cookies = req.getCookies();
		String strCookies = "";		
		int nbVisites = 1;
		if(cookies != null) {
			strCookies += "<ul>";
			for(Cookie cookie : cookies) {
				strCookies += "<li>"+cookie.getName()+" : "+cookie.getValue()+"</li>";
				if(cookie.getName() .equals("nbVisites")) {
					nbVisites = Integer.parseInt( cookie.getValue());
				}
			}
			strCookies += "</ul>";
			
		}
		resp.addCookie(new Cookie("nbVisites", String.valueOf(nbVisites + 1)));
		
		resp.setContentType("text/html");
		resp.setStatus(200);
		resp.getWriter().println("<html>"
				+ "<head>"
				+ "<title>Mon Formulaire</title>"
				+ "</head>"
				+ "<body>"			
				+ strCookies
				+ "<form method=\"POST\">"
				+ "<input type=\"submit\" value=\"OK\"/>"
				+ "</form>"
				+ "</body>"
				+ "</html>");
	}
	
}
