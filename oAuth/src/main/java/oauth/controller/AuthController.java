package oauth.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import oauth.service.MyServiceImpl;

@Controller
@RequestMapping("/np")
public class AuthController {
	
	@Inject
	MyServiceImpl myService;
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value="/")
	public String np() {
		return myService.publicInfo();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/private")
	@ResponseBody
	public String returnPrivate() {
		return myService.privateInfo();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/admin")
	@ResponseBody
	public String adminInfo() {
		return myService.adminInfo();
	}
	
	
}