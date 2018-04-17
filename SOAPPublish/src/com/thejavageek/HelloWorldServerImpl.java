package com.thejavageek;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(endpointInterface = "com.thejavageek.HelloWorldServer")
public class HelloWorldServerImpl implements HelloWorldServer {
 
	public String sayHello(String name) {
		return "Hello " + name + " !, Hope you are doing well !!";
	}

	
	public String[] lister() {
		
		String[] list = new String[2];
		list[0] = "Xav";
		list[1] = "Michel";
		return list;
	}
	
	@WebMethod
	public Personne getPersonne() {		
	  return new Personne();
	}
 
}
