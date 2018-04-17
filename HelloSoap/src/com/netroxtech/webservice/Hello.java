package com.netroxtech.webservice;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class Hello {
	@WebMethod
	public String sayHello(String name) {
		return "Hello : "+name+" !";
		
	}
	@WebMethod
	public String sayHello2(String name) {
		return "Hello : "+name+" !";
		
	}
	@WebMethod
	public List<String> list(){
		List<String> list = new ArrayList<>();
		list.add("Michel");
		list.add("Xavier");
		return list;
	}
}
