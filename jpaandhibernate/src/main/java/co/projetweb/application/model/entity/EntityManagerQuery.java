package co.projetweb.application.model.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerQuery {
	
	private static String persistenceUnitName= "demo-jpa-1";
	
	private static EntityManagerFactory entityManagerFactory;
            
	
	public static EntityManagerFactory getEntityManagerFactory() {
		
		if(entityManagerFactory != null) { 			
			return entityManagerFactory;
		}
		
		Map<String, String> env = System.getenv();
		
		Map<String, Object> configOverrides = new HashMap<String, Object>();
		for (String envName : env.keySet()) {
		  if (envName.contains("DB_USER")) {
		    configOverrides.put("javax.persistence.jdbc.user", env.get(envName));
		  }
		  if (envName.contains("DB_PASS")) {
		    configOverrides.put("javax.persistence.jdbc.password", env.get(envName));
		  }
		  if (envName.contains("DB_URL")) {
		    configOverrides.put("javax.persistence.jdbc.url", env.get(envName));    
		  }
		}
		entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName
		                                            ,configOverrides);
		return entityManagerFactory;
		
	}
}
