package oauth.service;

import javax.inject.Named;

@Named
public interface MyService {
	public String publicInfo();
		  
	   public String adminInfo(); 
	   public String privateInfo(); 
}
