package co.projetweb.application;

import java.util.List;

import co.projetweb.application.controller.annotation.ControllerMethodAnnotation;
import co.projetweb.application.controller.loader.ControllerLoader;
import co.projetweb.application.menu.ItemMenu;
import co.projetweb.application.menu.Menu;
import co.projetweb.application.scanner.ApplicationScanner;

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
	    		//System.out.println(controllerMethodAnnotation.lib()+" : "+controllerMethodAnnotation.name());
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
