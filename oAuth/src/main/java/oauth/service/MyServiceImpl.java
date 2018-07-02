package oauth.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl {
	
	
		public String publicInfo() {
		  return "for anybody";
	   }
	   
	   
	   @Secured({ "ROLE_ADMIN" })
	   public String adminInfo() {
		  return "for admin only";
	   }
	   
	   @Secured({ "ROLE_USER" })
	   public String privateInfo() {
		  return "for user";
	   }
}
