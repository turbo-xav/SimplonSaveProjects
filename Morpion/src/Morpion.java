import java.util.ArrayList;

import Grille.Case;
import Grille.Grille;
import Grille.Grille2D;

/**
  * Classe de Morpion qui se comporte comme une grille
  * 
  * @author <xavier.tagliarino@gmail.com>
  * @name Morpion
  *
  */

public class Morpion {

	private Grille2D grille2D;
	
	/**
	  * Ajoute la grille
	  * 
	  * @name setGrille
	  * @param Grille
	  * @return void
	  *
	  */
	
	public void setGrille(Grille grille) {
		this.grille2D = (Grille2D) grille;
	}
	
	/**
	  * Fabrique le morpion
	  * 
	  * @access public
	  * @name Morpion
	  * @param l
	  * @param h
	  * @param value
	  */
	
	
	public Morpion(int l, int h, String value) {
		
		this.setGrille(new Grille2D(l, h, value));
	}
	
	/**
	  * Dessine le Morpion
	  * 
	  * @access public
	  * @name dessiner
	  * @return void
	  *  
	  */
	
	
	public void dessiner() {
		this.grille2D.dessiner();
	}
	
	/**
	  * Renvoie le nombre de cases
	  * 
	  * @access public
	  * @name getNbCases
	  * @return int
	  * 
	  */
	
	public int getNbCases() {
		return this.grille2D.getNbCases();
	}
	
	/**
	  * Renseigne la valeurs d'une case 
	  *
	  * @access public
	  * @name assignerCase
	  * @param int numCase	  
	  * @param String value
	  * @return boolean
	  *  
	  */
	
	public boolean assignerCase(int numCase, String valeur) {
		
		int compteurCase = 1;	
		
		//Sur chaque ligne
		for(int i = 0 ; i < this.grille2D.getLignes().size() ; i++) {
			ArrayList<Case> casesLignes = this.grille2D.getLignes().get(i).getCases();
			
			//On se balade de colonne en colonne
			if(compteurCase <= numCase &&  casesLignes.size() + compteurCase >= numCase) {
				for(int j = 0 ; j < this.grille2D.getLignes().get(i).getCases().size() ; j++) {				
					
					Case caseLigneDeLaColonne = this.grille2D.getLignes().get(i).getCase(j);	
					
					if(compteurCase == numCase && !caseLigneDeLaColonne.isModified()) {
						this.grille2D.assignerCase(i, j, valeur);						
						return true;
					}
					compteurCase++;
				}
			} else {
				compteurCase += casesLignes.size();
			}
		}
		return false;
	}
	
	/**
	  * Indique si le jeu est terminé ou non
	  * 
	  * @access public
	  * @name gameOver
	  * @return boolean
	  * 
	  */
	
	public boolean gameOver() {
		//Boolean de control à chaque ligne
		boolean isAllEquals = true;
		
		//On controle les diagonales		
		for(int i = 0 ; i < this.grille2D.getDiagonals().size() ; i++) {
			
			isAllEquals = true;			
			
			ArrayList<Case> cases = this.grille2D.getDiagonals().get(i);
			
			for(int j = 0 ; j < cases.size() && isAllEquals ; j++) {			
				
				if(!cases.get(j).isModified() ) { isAllEquals = false; }
				if(j == 0) { continue; }
				if(cases.get(j - 1).getValue() != cases.get(j).getValue()) { isAllEquals = false;  }
				
			}
			if(isAllEquals) { return true; }											
		}		
		
		//On controle les lignes
		isAllEquals = true;		
		
		for(int i = 0 ; i < this.grille2D.getLignes().size() ; i++) {
			isAllEquals = true;			
			ArrayList<Case> cases = this.grille2D.getLignes().get(i).getCases();
			
			for(int j = 0 ; j < cases.size() && isAllEquals ; j++) {				
				 
				if(!cases.get(j).isModified() ) { isAllEquals = false; }
				if(j == 0) { continue; }
				if(cases.get(j - 1).getValue() != cases.get(j).getValue()) { isAllEquals = false;  }			
			}
			
			if(isAllEquals) { return true; }
											
		}		
		
		//On controle les colonnes		
		for(int i = 0 ; i < this.grille2D.getCols().size() ; i++) {
			isAllEquals = true;				
			ArrayList<Case> cases = this.grille2D.getCols().get(i).getCases();
			
			for(int j = 0 ; j < cases.size() && isAllEquals ; j++) {				
				if(!cases.get(j).isModified() ) { isAllEquals = false; }
				if(j == 0) { continue; }
				if(cases.get(j - 1).getValue() != cases.get(j).getValue()) { isAllEquals = false;  }			
			}
			
			if(isAllEquals) { return true; }											
		}	
		
		return false;
	}

}
