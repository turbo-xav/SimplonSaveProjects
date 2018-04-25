package co.projetWeb.Application.Controller.Loader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import co.projetWeb.Application.Controller.AppController;

public class ControllerLoader {
	
	private static AppController controller = new AppController();
		
	/**
	  * Tente de lancer une méthode dynamiquement via l'API réflexivité
	  * 
	  * @name lancerMethode
	  * @param String : nom de la méthode
	  * @return boolean : indique si la méthode a pu étre lancée
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
			System.err.println("Méthode inexistante : " + e.getMessage());
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
