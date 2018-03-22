package Grille;

import java.util.TreeMap;

public class Grille2D extends Grille {

	private TreeMap<Integer, Ligne> lignes;
	
	public int getNbCases() {
		return this.lignes.size() * this.getColonnes().size();		
	}
	
	public Grille2D(int largeur, int hauteur) {
		this.makeLignes(hauteur);
		for(int i = 0 ; i < this.lignes.size() ; i++) {
			this.lignes.get(new Integer(i)).makeCases(largeur,'M');
		}
	}
	
	
	public void makeLignes(int nbLignes) {
		this.lignes = new TreeMap<Integer, Ligne>();
		for(int i = 0; i < nbLignes ; i++) {
			this.lignes.put(new Integer(i),new Ligne());
		}
	}
	
	public TreeMap<Integer, Ligne>getLignes() {
		return this.lignes; 
	}
	
	public void draw() {		
		this.getDiagonals();
		this.getColonnes();
		for(int i = 0 ; i < this.lignes.size() ; i++) {
			this.lignes.get(new Integer(i)).draw();
		}
	}


	public TreeMap<Integer,TreeMap<Integer, Case>> getColonnes() {
		
		TreeMap<Integer,TreeMap<Integer, Case>> colonnes = new  TreeMap<Integer,TreeMap<Integer, Case>>();
		for(int i = 0 ; i < this.lignes.size() ; i++) {
			for(int j = 0 ; j < this.lignes.get(new Integer(i)).getCases().size() ; j++) {
				
				if(!colonnes.containsKey(new Integer(j))) {
					colonnes.put(new Integer(j), new TreeMap<Integer,Case>());
				}
				
				TreeMap<Integer,Case> maColonne = colonnes.get(new Integer(j));
				
				if(!maColonne.containsKey(new Integer(i))) {					
					Case maCase = this.lignes.get(new Integer(i)).getCases().get(new Integer(j));
					maColonne.put(new Integer(i), maCase);					
					//maCase.setModified(false);
				}			
				
			}
		}
		
		
		return colonnes;
		
	}
	
	public TreeMap<Integer,TreeMap<Integer, Case>> getDiagonals() {
		TreeMap<Integer,TreeMap<Integer, Case>> diagonales = new  TreeMap<Integer,TreeMap<Integer, Case>>();
		TreeMap<Integer, Case> diagGauche = new TreeMap<Integer, Case>();
		TreeMap<Integer, Case> diagDroite = new TreeMap<Integer, Case>();
		diagonales.put(new Integer(0), diagGauche);
		diagonales.put(new Integer(1), diagDroite);
		int cptGauche = 0;
		int cptDroite = 0;
		for(int i = 0 ; i < this.lignes.size() ; i++) {		
			
			int nbCasesLigne = this.lignes.get(new Integer(i)).getCases().size();
			
			
			for(int j = 0 ; j < nbCasesLigne ; j++) {
				
				if(i == j) {					
					Case maCase = this.lignes.get(new Integer(i)).getCases().get(new Integer(j));									
					diagGauche.put(new Integer(cptGauche), maCase);
					cptGauche++;
				}				
				
				if(this.lignes.get(new Integer(i)).getCases().size() - i - 1 == j ) {
					diagDroite.put(new Integer(cptDroite),this.lignes.get(new Integer(i)).getCases().get(new Integer(j)));
					cptDroite++;
				}
			}  		
		}
		
		return diagonales;
	}

}
