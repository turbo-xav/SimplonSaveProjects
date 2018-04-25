package client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import client.HelloWorld;

public class HelloWorldClient{
	
	public static void main(String[] args) throws Exception {
	   
	URL url = new URL("http://localhost:9999/ws/hello?wsdl");
	QName qname = new QName("http://server/", "HelloWorldImplService");
    Service service = Service.create(url, qname);
    HelloWorld hello = service.getPort(HelloWorld.class);
    System.out.println(hello.getHelloWorldAsString("mkyong"));
    System.out.println(hello.getPersonne("Waby").getName());
    System.out.println(hello.getPersonnes().getList().get(1));
    }

}
