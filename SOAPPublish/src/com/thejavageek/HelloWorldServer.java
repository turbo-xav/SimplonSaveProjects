package com.thejavageek;

import java.util.*;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorldServer {
 
	@WebMethod
	public String sayHello(String name);
	
	@WebMethod
	public String[] lister();
	
	@WebMethod	
	@WebResult
	public Personne getPersonne();
}