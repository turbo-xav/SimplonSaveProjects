package co.projetWeb.Application.Controller;

import java.util.List;

import co.projetWeb.Application.Model.User;
import co.projetWeb.Application.Model.Dao.UserDAO;

public class AppController {
	
	/*
	 * Quitte le programme
	 *
	 * @access public static
	 * @name quit
	 * @return void
	 * 
	 **/
	
	public static void quit() {
		System.out.println("Bye !!!");
		System.exit(0);
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
		
		System.out.println("Wait !!");
		
		for(int i = 3 ; i > 0 ; i--) {
			System.out.print(i+" ");				
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
		System.out.println("Go !!");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 
	 * @access public
	 * @name listUsers
	 * 
	 **/
	
	public void listUsers() {
		UserDAO userDAO = new UserDAO();
		List<User> listOfUsers = userDAO.listUsers();	
		for(User user : listOfUsers) {
			System.out.println(user);
		}
	}
}
