package com.example.crud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.crud.model.Foo;

@Controller
@RequestMapping("/foos")
public class FooController {
	
	@RequestMapping(value = "/cookie",method = RequestMethod.GET)	
	@ResponseStatus(HttpStatus.OK)
	public void addCookie(HttpServletResponse response) {
		
		Cookie newCookie = new Cookie("name", "testCookieValue");
		response.addCookie(newCookie);
		System.out.println("Test");
	}
	
	
	@RequestMapping(value = "/request",method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String request(@RequestParam(name="monParam",defaultValue="defaultValue") String param) {
		return param;
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Foo> findAll() {
	    List<Foo> list = new ArrayList<Foo>();
	    Foo foo = new Foo(1,"test");
	    Foo foo1 = new Foo(2,"test1");
	    list.add(foo);
	    list.add(foo1);
	    return list;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String update() {

	    System.out.println("updade");
		return "udpate";
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String delete() {

		System.out.println("delete"); 
		return "delete";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Foo create(@RequestBody Foo resource) {

	    return resource;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Foo read(@PathVariable("id") Long id,@CookieValue(value="name", defaultValue="notmyvalue", required=false) String name ) {
	  
		System.out.println("Cookie :"+name);
		return new Foo(id,name);
	}
	

}
