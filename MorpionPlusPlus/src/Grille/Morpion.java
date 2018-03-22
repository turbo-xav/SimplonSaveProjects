package Grille;

import java.util.TreeMap;

public class Morpion extends GrilleElement{

	private Grille2D grille;
	
	public Morpion(GrilleElement grille) {
		this.grille = (Grille2D) grille;
	}
	
	public int getNbCases() {
		return this.grille.getNbCases();
	}
	
	public boolean assignerCase(int numCase,char symbole) {
		int cptCase = 0;
		for(int i = 0 ; i < this.grille.getLignes().size() ; i++ ) {
			for(int j = 0 ; j < this.grille.getLignes().get(new Integer(i)).getCases().size() ; j++) {
				cptCase ++;
				Case maCase = this.grille.getLignes().get(new Integer(i)).getCases().get(new Integer(j));
				if(cptCase == numCase && !maCase.isModified()) {					
					maCase.setVal(symbole);
					return true;
				}
			}
		}
		return false;
	}	
		
	public boolean gameOver() {
		
		//On test les lignes
		TreeMap<Integer, Ligne> lignes = this.grille.getLignes();
			   
		for(int i = 0 ; i < lignes.size() ; i++) {
			if(lignes.get(new Integer(i)).hasAllEquals()) { return true; }
		}
		
		//On test les colonnes		
		TreeMap<Integer,TreeMap<Integer, Case>> colonnes = this.grille.getColonnes();
		
		for(int i = 0 ; i < colonnes.size() ; i++) {
			boolean isAllEquals = true;
			for(int j = 0 ; j < colonnes.get(new Integer(i)).size() ; j++) {
				if(j == 0 ) { continue; }
				
				Case maCasePrecedente = colonnes.get(new Integer(i)).get(new Integer(j - 1));
				Case maCaseEc = colonnes.get(new Integer(i)).get(new Integer(j));
				
				if(!maCaseEc.isModified() || !maCasePrecedente.isModified()) { isAllEquals = false; }
				
				if( maCasePrecedente.getVal() != maCaseEc.getVal() ) {
					isAllEquals = false;
				}						
			}
			if(isAllEquals) { return true; }	
		}
		
		//On teste les diagonales
		TreeMap<Integer,TreeMap<Integer, Case>> diags = this.grille.getDiagonals();
		//System.out.println(diags.get(new Integer(1)));
		for(int i = 0 ; i < diags.size() ; i++) {
			
			boolean isAllEquals = true;
			
			for(int j = 0 ; j < diags.get(new Integer(i)).size() ; j++) {
				
				if(j == 0 ) { continue; }
				
				Case maCasePrecedente = diags.get(new Integer(i)).get(new Integer(j - 1));
				Case maCaseEc = diags.get(new Integer(i)).get(new Integer(j));				
				if(!maCaseEc.isModified() || !maCasePrecedente.isModified()) { isAllEquals = false; }
				
				if( maCasePrecedente.getVal() != maCaseEc.getVal() ) {
					isAllEquals = false;
				}
				
			}
			
			if(isAllEquals) { return true; }
				
		}		
				
		return false;		
	}	

	@Override
	public void draw() {		
		this.grille.draw();		
	}
	
}
