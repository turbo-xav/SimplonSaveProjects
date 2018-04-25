package co.projetWeb.Application;

import co.projetWeb.Application.Controller.Loader.ControllerLoader;
import co.projetWeb.Application.Menu.ItemMenu;
import co.projetWeb.Application.Menu.MenuAppli;
import co.projetWeb.Application.Scanner.ApplicationScanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 /* Message de bienvenue */
    	System.out.println("Bienvenue");
            	
        /* Fabrication du menu */
    	MenuAppli menu = new MenuAppli();
    	//Les différentes méthodes
		//On quitte le programme
    	menu.add(new ItemMenu("Quitter cette superbe application de la mort qui tue !!", "quit"));
		//Methode d'attente
	menu.add(new ItemMenu("lancer la méthode waitALittle", "waitALittle"));
	
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
