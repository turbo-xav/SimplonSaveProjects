package Grille;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

/**
 * La grille en 2D
 * 
 * @author <xavier.tagliarino@gmail.com>
 * @name Grille
 *
 */

public class Grille2D implements Grille{

		
	/**
	  * Tableau des lignes composant la grille
	  * 
	  * @access private
	  * @name cases
	  * @var Lignes[]
	  * 
	  */
	
	private ArrayList<Ligne> lines;
	
	/**
	  * Tableau des colonnes composant la grille
	  * 
	  * @access private
	  * @name cols
	  * @var Colonne[]
	  * 
	  */
	
	private ArrayList<Colonne> cols;
	
	
	
	

	/**
	  * Constructeur qui initialise une grille de dimension X,Y
	  * 
	  * @access public
	  * @name Grille2D
	  * @param int x : largeur
	  * @param int y : hauteur
	  * 
	  */
	
	public Grille2D(int l, int h, String value) {
		
		//On créé les lignes
		this.lines	=	new ArrayList<Ligne>();
		for(int i = 0 ; i < l ; i++) { this.lines.add(new Ligne()); }
		//On crée les colonnes
		this.cols	=	new ArrayList<Colonne>();
		for(int i = 0 ; i < h ; i++) { this.cols.add(new Colonne()); }
		
		//On va mettre les cases qui vont bien dans les lignes 
		int cpt = 1;
		for(int i = 0 ; i < l ; i++) {			
			//On renseigne autant de cases que de colonne dans la ligne en cours
			for(int j = 0; j < h ; j++) {
				String val = (value == null)?String.valueOf(cpt):value;
				
				this.lines.get(i).addCase(String.valueOf(val));		
				cpt++;
			}
		}
		
		//On va prendre les cases précédement rentrées dans les lignes pour les mettre dans les bonnes colonnes
		for(int j = 0; j < h ; j++) {
			for(int i = 0 ; i < l ; i++) {	
				this.cols.get(i).addCase(this.lines.get(j).getCase(i));
			}
		}	
	}
	
	/**
	  * Renseigne la valeurs d'une case 
	  *
	  * @access public
	  * @name assignerCase
	  * @param int x
	  * @param int y
	  * @param String value
	  * @return boolean 
	  * 
	  */
	
	public boolean assignerCase(int x, int y, String valeur) {
		if(!this.getCase(x, y).isModified()) {
			this.getCase(x, y).setValue(valeur);
			return true;
		}
		return false;		
	}
			
	/**
	  * Renvoie la case de la position X,Y
	  * 
	  * @access public
	  * @name getCase
	  * @param int x
	  * @param int y
	  * @return Case
	  * 
	  */
	
	
	public Case getCase(int x, int y) {
		
		return  this.lines.get(x).getCase(y);
	}
	
	public ArrayList<Ligne> getLignes() {
		return this.lines;
		
	}
	
	public ArrayList<Colonne> getCols() {
		return this.cols;
		
	}
	
	public ArrayList<ArrayList<Case>> getDiagonals(){
		
		if(this.cols.size() != this.lines.size()) { return null; }
		
		ArrayList<ArrayList<Case>> diagonales = new ArrayList<ArrayList<Case>>();
		
		//Diagonnales gauche 
		ArrayList<Case> diagonale1 = new ArrayList<Case>();
		diagonales.add(diagonale1);
		for(int i = 0 ; i < this.lines.size() ; i++) {
			Ligne ligne = this.lines.get(i);
			diagonale1.add(ligne.getCase(i));
		}
		
		//Diagonnales droite  
		ArrayList<Case> diagonale2 = new ArrayList<Case>();
		diagonales.add(diagonale2);
		for(int i = 0 ; i < this.lines.size() ; i++) {
			Ligne ligne = this.lines.get(this.lines.size() - i - 1);
			diagonale2.add(ligne.getCase(i));
		}
		
		
		return diagonales;
	}
	
	/*
	 * Compte le nombre de cases
	 *
	 * @access public
	 * @
	 * 
	 **/
	
	public int getNbCases() {
		return this.cols.size() * this.lines.size();
	}
	
	/**
	  * Dessine la grille
	  * 
	  * @access public
	  * @name dessiner
	  * 
	  * 
	  */
	
	
	public void dessiner() {		
		
		String str  = "";
		str += "--";
		
		for(int i = 0 ; i < cols.size() ; i++) {
			str += "----";
			
		}
		
		str += "\n";
		
				
		for(int i = 0 ; i < this.lines.size() ; i++) {
			str += "|";
			
			for(int j = 0 ; j < this.cols.size() ; j++) {
								
				str += " "+((this.getCase(i, j).getValue().length() == 1)?" ":"")+this.getCase(i, j).getValue()+" ";
			}
			str += "|\n";
			
		}
		
		for(int i = 0 ; i < cols.size() ; i++) {
			str += "----";
			
		}
		str += "--";
		System.out.print(str);
		
				
		
	}		
}
