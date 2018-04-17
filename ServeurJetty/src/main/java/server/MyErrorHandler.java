package server;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.http.MetaData.Request;
import org.eclipse.jetty.server.handler.ErrorHandler;

public class MyErrorHandler extends ErrorHandler {
	
	
	protected void writeErrorPageBody(javax.servlet.http.HttpServletRequest request, java.io.Writer writer, int code, java.lang.String message, boolean showStacks) throws java.io.IOException {
		writer.write("NOOON :"+code);		
		
	}
	protected void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.addCookie(new Cookie("Fuck","1"));
	}
}
