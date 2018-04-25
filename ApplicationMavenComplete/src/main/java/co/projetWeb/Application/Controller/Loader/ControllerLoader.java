package co.projetWeb.Application.Controller.Loader;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import co.projetWeb.Application.Controller.AppController;
import co.projetWeb.Application.Controller.Annotation.ComparatorControllerMethodAnnotation;
import co.projetWeb.Application.Controller.Annotation.ControllerMethodAnnotation;

/**
 * Loader of the controller
 * 
 * @author Xavier TAGLIARINO <xavier.tagliarino@gmail.com>
 * @name ControllerLoader
 *
 */


public class ControllerLoader {
	
	
	private static AppController controller = new AppController();
	
	/**
	  *
	  * Lister les méthodes disponibles
	  * 
	  * @access public
	  * @return List<String>
	  * @name listAvailableMethods
	  *
	  */
	
	public static List<ControllerMethodAnnotation> listAvailableMethods() {
		
		Class<?> c = controller.getClass();
		Method[] methods = c.getDeclaredMethods();
			
		List<ControllerMethodAnnotation> listOfAnnotation = new ArrayList<ControllerMethodAnnotation>();
		
		for(Method m : methods) {
			Annotation[] annonations = m.getAnnotations();
			
			for(Annotation annotation : annonations) {
				if (annotation instanceof ControllerMethodAnnotation)
			    {
					listOfAnnotation.add((ControllerMethodAnnotation) annotation);
				}
			}
		}
		listOfAnnotation.sort(new ComparatorControllerMethodAnnotation());
		return listOfAnnotation;
		
				
	}
	
	
	/**
	  * Tente de lancer une méthode dynamiquement via l'API réflexivité
	  * 
	  * @name lancerMethode
	  * @param String : nom de la méthode
	  * @return boolean : indique si la méthode a pu être lancée
	  * 
	  */
	
	public static  boolean lancerMethode(String methode)
	{		
		
		Class<?> classeAInstancier = controller.getClass();
		Class<?>[] types = new Class[] {};				
		try {
			Method methodePresenter = classeAInstancier.getMethod(methode,types);
			methodePresenter.invoke(controller, null);
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			return false;
		} catch (SecurityException e) {
			e.printStackTrace();
			return false;
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
			return false;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
}
