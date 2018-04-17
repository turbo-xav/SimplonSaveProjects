package application;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Loader {
	
	private static Controller controller = new Controller();
	
	/**
	  * Object scanner pour entrée utilisateur
	  * 
	  * @author Xavier Tagliarino <xavier.tagliarino@gmail.com>
	  * @access public static
	  * @name scanner
	  * @var Scnanner
	  * 
	  */
	
	private static Scanner scanner = new Scanner(System.in);
	
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
		
		
		
		/*Class types[] = {  }; 
		
		Method method;
		
		try {
			
			//Récupération de la méthode
			method = Main.class.getMethod(methode, types);
			//Aucun paramètre n'est envoyé
			Object parametres[] = {  };
			
			try {
				method.invoke(null, parametres);
			} catch (IllegalAccessException e) {				
				e.printStackTrace();
				return false;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				return false;
			} catch (InvocationTargetException e) {
				e.printStackTrace();
				return false;
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			return false;
		} catch (SecurityException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;*/
	}
	
	
	/**
	  * Méthode permettant de factoriser la récupération d'un entier à la console via le scanner
	  *  
	  * @param String : question
	  * @return int : saisie
	  * @name askInt
	  */
	
	public static int askInt(String question) {
		
		System.out.println(question);
		int choixClavier = 0;
		boolean choixKo = true;
		
		while(choixKo) {
			try{
				choixClavier = Integer.parseInt(scanner.nextLine());
				if(choixClavier < 0) {
					System.err.println("Pas de valeur négative !!");
					continue;
				}
				choixKo = false;
			}
			catch(NumberFormatException e) {
				System.err.println("veuillez saisir une valeur numérique");
			}
		}
		return choixClavier;
	}
	
	/**
	  * Méthode permettant de factoriser la récupération d'un entier à la console via le scanner
	  *  
	  * @param String : question
	  * @return int : saisie
	  * @name askString
	  */
	
	public static String askString(String question) {
		
		System.out.println(question);
		
		String choixClavier="";
		try{
			choixClavier = scanner.nextLine();			
		}
		catch(NumberFormatException e) {
			System.out.println("veuillez saisir une valeur numérique");
		}
		return choixClavier;
		
	}
	
	/*
	 * Met en attente
	 *
	 * @access public static
	 * @name waitALittle
	 * @return void
	 * 
	 **/
	
	public static void waitALittle() {
		
		System.out.println("Go dans : ");
		
		for(int i = 3 ; i > 0 ; i--) {
			System.out.print(i+" ");				
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
		System.out.println();
	}
}
