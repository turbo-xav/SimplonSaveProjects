package server;

import org.eclipse.jetty.server.*;
import org.eclipse.jetty.servlet.*;

public class ServerJetty {

	public static void main(String[] args) {
		Server server = new Server(9092);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(HelloGenericServlet.class, "/");
        handler.addServletWithMapping(StatefulServlet.class, "/impossible");
        handler.addServletWithMapping(LogServlet.class, "/log");
        try {
			server.start();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        try {
			//Attends que le serveur ai fini d'écouter
        	server.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		/*Server server = new Server(8080);
		 
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
 
        context.addServlet(new ServletHolder(new HelloGenericServlet()),"/");
        context.addServlet(new ServletHolder(new HelloGenericServlet("Buongiorno Mondo")),"/it/*");
        context.addServlet(new ServletHolder(new HelloGenericServlet("Bonjour le Monde")),"/fr/*");
 
        try {
			server.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			server.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

	}

}
