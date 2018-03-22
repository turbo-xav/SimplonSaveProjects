package Grille;

import java.util.ArrayList;

public abstract class AbstractGrilleElement {
	/**
	  * Tableau des cases composant la ligne
	  * 
	  * @access private
	  * @name cases
	  * @var ArrayList<Case>
	  * 
	  */
	
	private ArrayList<Case> cases;
	
	/**
	  * Constructeur
	  * 
	  * @access public
	  * @name Ligne
	  *  
	  *  
	  */
	
	public AbstractGrilleElement() {
		this.cases = new ArrayList<Case>();
	}
	
	/**
	  *
	  * @access public
	  * @name addCase
	  * @param String
	  * 
	  */
	
	public void addCase(String value) {
		this.cases.add(new Case(value));
	}
	
	/**
	  * Renseigne la case
	  *
	  * @access public
	  * @name addCase
	  * @param Case
	  * 
	  */
	
	public void addCase(Case maCase) {
		this.cases.add(maCase);
	}
	
	/**
	  * Récupère une case à l'index i 
	  * 
	  * @access public
	  * @name getCase
	  * @param int
	  * @return Case 
	  * 
	  */ 
	
	public Case getCase(int i) {
		return this.cases.get(i);
	}
	
	/**
	  * Récupère une case à l'index i 
	  *
	  *	@access public
	  * @name getCases
	  * @return ArrayList<Case>
	  *
	  * 
	  */ 
	
	public ArrayList<Case> getCases() {
		return this.cases;
	}	 
}
