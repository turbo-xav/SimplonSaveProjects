package co.projetWeb.Application.Model.Entite;

/**
 * User of the application
 * 
 * @author Xavier TAGLIARINO <xavier.tagliarino@gmail.com>
 * @name ApplicationScanner
 *
 */

public class User {
	
	/**
	  * user id
	  *
	  * @access private
	  * VAR long
	  * @name id
	  * 
	  */
	
	private long id;
	
	/**
	  * user name
	  * 
	  * @access private
	  * VAR String
	  * @name name
	  * 
	  */
	
	private String name;

	/**
	  * Get the user Id
	  *  
	  * @access public
	  * @name getId 
	  * @return the name
	  * 
	  */
	
	public long getId() {
		return id;
	}

	/**
	  * Set the user id 
	  * @access public
	  * @name setId 
	  * @param id the id to set
	  */
	
	public void setId(long id) {
		this.id = id;
	}

	
	
	/**
	  * Get the user Name
	  *  
	  * @access public
	  * @name getName 
	  * @return the name
	  * 
	  */
	
	public String getName() {
		return name;
	}

	
	/**
	  * Set the user name
	  *  
	  * @access public
	  * @name getName 
	  * @param name the name to set
	  * @return the name
	  * 
	  */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	  * Constructor of User with id and name initiation
	  * 
	  * @access public
	  * @name User
	  * @param id
	  * @param name
	 */
	
	public User(long id,String name) {
		this.setId(id);
		this.setName(name);
	}
	
	/**
	  * Display a user
	  * 
	  * @access public
	  * @return String
	  * 
	  */
	
	public String toString() {
		return this.getId()+" : "+this.getName();
	}
}
