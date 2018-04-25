package run;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import client.HelloWorld;
import client.HelloWorldImplService;


public class Main {

	public static void main(String[] args) {
		HelloWorldImplService service = new HelloWorldImplService();
		HelloWorld h = service.getHelloWorldImplPort();
		System.out.println(h.getHelloWorldAsString("Xavier"));
		
	}

}
