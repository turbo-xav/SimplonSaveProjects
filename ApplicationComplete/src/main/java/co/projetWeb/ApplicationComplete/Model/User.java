package co.projetWeb.Application.Model;

public class User {
	
	/**
	  * Id du user
	  *
	  * @access private
	  * @name id
	  * @var long
	  * 
	  */
	
	private long id;
	
	/**
	  *
	  * @access private
	  * @name name
	  * @var String
	  * 
	  */
	
	private String name = null;
	
	
	/**
	  * Constructor of user which initalize user with id and name
	  * 
	  * @access public
	  * @name User
	  * @param long 	: id
	  * @param String 	: name
	  */
	
	public User(long id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
	/**
	  * Return the user Id
	  * 
	  * @access public
	  * @name getId 
	  * @return long : Id of user
	  */
	
	
	public long getId() {
		return id;
	}
	
	/**
	  * Assign the user Id
	  * 
	  * @access public
	  * @name setId 
	  * @param long : Id of user
	  */
	
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	  * Return the user Name
	  * 
	  * @access public
	  * @name getName 
	  * @return String : name of user
	  */
	
	public String getName() {
		return name;
	}	
	
	/**
	  * Assign the user Name
	  * 
	  * @access public
	  * @name setName 
	  * @param String : name of user
	  */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	  * toString Method
	  * 
	  * @access public
	  * @name toString
	  * @return String
	  */
	
	public String toString() {
		return this.getId()+" : "+this.getName();
	}
}