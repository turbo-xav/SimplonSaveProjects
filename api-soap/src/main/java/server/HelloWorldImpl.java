package server;

import java.util.Date;

import javax.jws.WebService;

import model.Compte;

//Service Implementation
@WebService(endpointInterface = "server.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

	public Compte getCompte() {
		// TODO Auto-generated method stub
		return new Compte(1,new Date());
	}

}