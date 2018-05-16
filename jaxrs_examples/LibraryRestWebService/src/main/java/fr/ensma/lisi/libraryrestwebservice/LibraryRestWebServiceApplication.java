package fr.ensma.lisi.libraryrestwebservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
public class LibraryRestWebServiceApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(BookResource.class);
		
		return classes;
	}
}
