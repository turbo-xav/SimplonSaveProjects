package com.thejavageek;

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


	public Personne getPersonne() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* @WebMethod
	public Personne getPersonne() {		
	  return new Personne();
	}*/
	
	/*@WebMethod
	public ArrayList<Personne> getPersonnes() {		
	  ArrayList<Personne> list = new ArrayList<Personne>();
	  list.add(new Personne());
	  list.add(new Personne());
	  return list;
	}*/
 
}
