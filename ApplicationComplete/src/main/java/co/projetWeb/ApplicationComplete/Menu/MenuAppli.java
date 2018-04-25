package co.projetWeb.Application.Menu;

import java.util.ArrayList;

public class MenuAppli {

	/**
	  * 
	  * @author Xavier Tagliarino <xavier.tagliarino@gmail.com>
	  * @access private
	  * @name itemMenus
	  * @var ArrayList<Menu> 
	  * 
	  */
	
	private ArrayList<ItemMenu> itemMenus = new ArrayList<ItemMenu>();
	
	/**	 
	  *
	  * Permet l'affcichage du menu
	  * 
	  * @access public
	  * @name toString
	  * @return String
	  * 
	  */
	
	public String toString() {
		
		String str= "";
		
		for(int i = 0 ; i < this.getItemMenus().size() ; i++) {
			str += i+") "+this.getItemMenus().get(i)+"\n";
		}
		return str;
	}
	
	/**
	  * Return list of itemMenu from the Menu
	  * 
	  * @name getItemMenus
	  * @return ArrayList
	  */

	public ArrayList<ItemMenu> getItemMenus() {
		return itemMenus;
	}
	
	/**
	  * Add an item in the list of ItemMenu
	  * 
	  * @name add
	  * @param ItemMenu item
	  */

		
	public void add(ItemMenu item) {
		this.getItemMenus().add(item);
	}
	
	/**
	  * Get an item in the list of ItemMenu
	  * 
	  * @name getItemById
	  * @return ItemMenu item
	  */

		
	public ItemMenu getItemById(int itemId) {
		int i = 0;
		for(ItemMenu item : this.itemMenus) {
			if(i == itemId) {
				return item;
			}
			i++;
		}
		return null;
	}
		
}
