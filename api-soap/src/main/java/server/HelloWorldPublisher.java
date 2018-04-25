package server;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWorldPublisher{
	
	public static void main(String[] args) {
	   System.out.println("starting server");
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
		System.out.println("starting server at URL : http://localhost:9999/ws/hello");
		System.out.println("you can get the WSDL at : http://localhost:9999/ws/hello?wsdl");
		System.out.println("OPEN a prompt and type : 'wsimport -keep -p client http://localhost:9999/ws/hello?wsdl'");
		
	}

}
