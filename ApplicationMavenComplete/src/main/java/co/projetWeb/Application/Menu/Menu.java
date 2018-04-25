package co.projetWeb.Application.Menu;

import java.util.ArrayList;

/**
 * Menu of the application
 * 
 * @author Xavier TAGLIARINO <xavier.tagliarino@gmail.com>
 * @name ApplicationScanner
 *
 */

public class Menu {

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
	  * Display the menu
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

	public ArrayList<ItemMenu> getItemMenus() {
		return itemMenus;
	}

		
	public void add(ItemMenu item) {
		this.getItemMenus().add(item);
	}
	
	public ItemMenu getItemById(int itemId) {
		int i = 0;
		for(ItemMenu item : this.getItemMenus()) {
			if(i == itemId) {
				return item;
			}
			i++;
		}
		return null;
		
	}
		
}
