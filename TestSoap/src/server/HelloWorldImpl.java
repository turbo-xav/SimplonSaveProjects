package server;

import java.util.ArrayList;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "server.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
	
	@Override
	public Personne getPersonne(String name) {
		return new Personne(name);
	}
	
	@Override
	public Personnes getPersonnes() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Test");
		list.add("Test2");
		return new Personnes(list);
	}
	
	

}