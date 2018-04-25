package co.projetWeb.Application;

import java.util.ArrayList;
import java.util.List;

import co.projetWeb.Application.Controller.Annotation.ControllerMethodAnnotation;
import co.projetWeb.Application.Controller.Loader.ControllerLoader;
import co.projetWeb.Application.Menu.ItemMenu;
import co.projetWeb.Application.Menu.Menu;
import co.projetWeb.Application.Scanner.ApplicationScanner;

/**
  * Application
  * 
  * @author Xavier TAGLIARINO <xavier.tagliarino@gmail.com>
  * @name App
  *
  */


public class App 
{
    public static void main( String[] args )
    {
		 /* Message de bienvenue */
		System.out.println("Bienvenue");
				
		/* Fabrication du menu */
		Menu menu = new Menu();
		List<ControllerMethodAnnotation> listOfMethodeAnnotations =  ControllerLoader.listAvailableMethods();  	
		if(listOfMethodeAnnotations.size() > 0) {        	
	    	for(ControllerMethodAnnotation controllerMethodAnnotation: listOfMethodeAnnotations) {
	    		System.out.println(controllerMethodAnnotation.lib()+" : "+controllerMethodAnnotation.name());
	    		menu.add(new ItemMenu(controllerMethodAnnotation.lib(),controllerMethodAnnotation.name()));
	    	}
	    }   	
	
		/* On lance les action à la demande */
		boolean quit = false;
		
		//On demande au user ce qu'il veut faire
		ApplicationScanner scanner = new ApplicationScanner();
		while(!quit) {
	    	//Affichage du menu
			System.out.println("**** Menu ****\n"+menu);
	    	    	
	    	int id = scanner.askInt("Choisissez votre méthode :");
	    	String action = ( menu.getItemById(id) != null)? menu.getItemById(id).getAction():"";
	    	
	    	//Si l'action retrouvée est non vide
	    	if(!action.equals("")) { ControllerLoader.lancerMethode(action); }
	    	//On met à jour le flag pour quitter ou non
	    	quit = action == "quit";
		}
		
		//On ferme le scanner
		scanner.close();
    }
}
