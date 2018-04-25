package co.projetWeb.Application.Menu;

/**
 * Elément du menu
 * 
 * @author Xavier Tagliarino <xavier.tagliarino@gmail.com>
 * @name ItemMenu
 *
 */

public class ItemMenu {
	
	/**
	  * @access private
	  * @name libelle
	  * @var String
	  *   
	  */
	
	private String libelle;	
	
	/**
	  * @access private
	  * @name action
	  * @var String
	  * 
	  */
	
	private String action;

	/**
	  * Constructeur 
	  *  
	  * @access public
	  * @name ItemMenu
	  * @param String libelle
	  * @param String action
	  * 
	  */	
	
	public ItemMenu(String libelle,String action ) {
		this.setLibelle(libelle);
		this.setAction(action);
	}
	
	/**
	 * Renvoie le libellé
	 * 
	 * @access public
	 * @return String
	 * @name getLibelle
	 * 
	 */
	
	public String getLibelle() {
		return libelle;
	}
	
	/**
	 * Met à jour le libellé
	 * 
	 * @access public
	 * @param String
	 * @name setLibelle
	 * 
	 */

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	/**
	 * Renvoie l'action
	 * 
	 * @access public
	 * @return String
	 * @name getAction	 
	 * 
	 */

	public String getAction() {
		return action;
	}
	
	/**
	 * Définit l'action
	 * 
	 * @param String
	 * @name setAction
	 * @access public
	 * 
	 */

	public void setAction(String action) {
		this.action = action;
	}
	
	/**	 
	  *
	  * Permet l'affcichage de l'Item
	  * 
	  * @access public
	  * @name toString
	  * @return String
	  * 
	  */
	
	public String toString() {
		return this.getLibelle();
	}
	
}
