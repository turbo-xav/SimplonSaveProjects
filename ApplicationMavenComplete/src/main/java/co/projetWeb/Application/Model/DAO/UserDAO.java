package co.projetWeb.Application.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.projetWeb.Application.Model.Entite.*;

public class UserDAO extends DAO<User>{
	
	/*
	 * Return a list of users
	 * 
	 * @access public
	 * @name listUsers
	 * @return :List<user> list of users
	 * 
	 * */
	
		
	public UserDAO(Connection conn ) {
		super(conn, "utilisateur");		
	}

	public List<User> listUsers(){
		
		List<User> listUsers = new ArrayList<User>();
	    try {
	    	System.out.println("SELECT * from " + tableName);  
	    	PreparedStatement createStatement = connect.prepareStatement("SELECT * from " + tableName);
	    	ResultSet result = createStatement.executeQuery();

	      while(result.next()) {
	    	  listUsers.add( new User( result.getLong("id"), result.getString("name") ) );
	      }
	    } catch (SQLException e) {
	      System.err.println("Une erreur est survenue lors de la réucpération des users : "+e.getMessage());
	    } 	
		
		return listUsers;
		
	}

	@Override
	public User create(User obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
