package co.projetWeb.Application.Model.Dao;

import java.util.ArrayList;
import java.util.List;

import co.projetWeb.Application.Model.*;

public class UserDAO {
	
	/**
	  * Return a list of users
	  * 
	  * @access public
	  * @name listUsers
	  * @return List<User> 
	  */
	
	public List<User> listUsers(){
		List<User> listOfUsers = new ArrayList<User>();
		
		listOfUsers.add(new User(1, "Xavier"));
		return listOfUsers;
		
	}
	
}
