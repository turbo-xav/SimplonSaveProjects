package server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "server.HelloWorldServer")
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
	  return new Personne();
	}
	
	
	public ArrayList<Personne> getPersonnes() {		
		ArrayList<Personne> list = new ArrayList<Personne>();
	  list.add(new Personne());
	  list.add(new Personne());
	  return list;
	}
 
}
