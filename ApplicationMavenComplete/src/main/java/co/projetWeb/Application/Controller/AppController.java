package co.projetWeb.Application.Controller;

import java.util.List;

import co.projetWeb.Application.Controller.Annotation.ControllerMethodAnnotation;
import co.projetWeb.Application.Model.DAO.DatabaseConnection;
import co.projetWeb.Application.Model.DAO.UserDAO;
import co.projetWeb.Application.Model.Entite.User;

public class AppController {
	
	/**
	  * Quit 
	  * @access public
	  * @return void 
	  * @name quit
	  * 
	  */
	
	@ControllerMethodAnnotation(name="quit",lib="Quitter",order=1)
	public void quit() {
		System.err.println("Bye !");
		System.exit(0);
	}
	
	/**
	  *  Wait
	  *
	  *  @access public
	  *  @name waitALittle
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="waitALittle",lib="Attendre quelques secondes",order=2)
	public void waitALittle() {
		System.out.println("Go dans : ");
		try {
			for(int i = 3 ; i > 0 ; i--) {
				System.out.print(i+" ");			
					Thread.sleep(500);
			}
			System.out.println("Go !!!");
			Thread.sleep(250);
		}
		catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println();
	}
	
	
	/**
	  * Affiche la liste de ustilisateurs
	  * 
	  * @access listUsers
	  * @name listUsers 
	  * @return void
	  */
	
	@ControllerMethodAnnotation(name="listUsers",lib="Afficher les utilisateurs",order=3)
	public void listUsers() {
		UserDAO userDao = new UserDAO(DatabaseConnection.getInstance());
		List<User> users = userDao.listUsers();
		for(User user : users) {
			System.out.println(user);
		}		
	}	 
}
