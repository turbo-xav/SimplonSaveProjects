package server;

import org.eclipse.jetty.server.*;
import org.eclipse.jetty.servlet.*;

public class ServerContextStatic {
	public static void main(String[] args)
    {
        System.setProperty("org.eclipse.jetty.LEVEL","INFO");

        Server server = new Server(80);
         // The filesystem paths we will map
        String homePath = System.getProperty("user.home");        
        String pwdPath = System.getProperty("user.dir");
        System.out.println(homePath);
        System.out.println(pwdPath);
        
        ServletContextHandler context = new ServletContextHandler();
        context.setResourceBase(pwdPath);
        context.setContextPath("/");
        server.setHandler(context);
        
        /*ServletHolder holder404= new ServletHolder("404", MyServletTurboXav404.class);
        context.addServlet(holder404, "/*");*/
        MyErrorHandler errorHandler = new MyErrorHandler();
        
        //context.setErrorHandler(errorHandler);
        server.addBean(errorHandler);
        
        
        ServletHolder holderDynamic = new ServletHolder("dynamic", MyServletTurboXav.class);
        context.addServlet(holderDynamic, "/dynamic/*");
        //context.addServlet(holderDynamic,"/");
        
        ServletHolder holderHome = new ServletHolder("static-home", DefaultServlet.class);
        holderHome.setInitParameter("resourceBase",homePath);
        holderHome.setInitParameter("dirAllowed","true");
        holderHome.setInitParameter("pathInfoOnly","true");
        context.addServlet(holderHome,"/home/*");
        
        

        ServletHolder holderPwd = new ServletHolder("default", DefaultServlet.class);
        holderPwd.setInitParameter("resourceBase",pwdPath);
        holderPwd.setInitParameter("dirAllowed","true");
        context.addServlet(holderPwd,"/");
        
        String [] welcomeFiles = {"page.html"};
	    context.setWelcomeFiles(welcomeFiles);
	    context.setResourceBase("./src/main/resources/");

        try
        {
            server.start();
            server.dump(System.err);
            server.join();
        }
        catch (Throwable t)
        {
            t.printStackTrace(System.err);
        }
    }
}
