package oauth.controller;

import java.util.HashMap;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, String> returnUser(java.security.Principal secuPrincipal, Authentication authentication) {
		
		HashMap<String, String> datas = new HashMap<String, String>();
	    System.out.println(authentication.getAuthorities().toString());
		datas.put("name", authentication.getName());
	    return datas;
	
	}
}
