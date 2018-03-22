package Grille;

import java.util.TreeMap;

public class Ligne extends GrilleElement{

	private TreeMap<Integer, Case> cases; 
	
	public void makeCases(int nbCases,char symbole) {
		this.cases = new TreeMap<Integer,Case>();
		for(int i = 0 ; i < nbCases ; i++) {
			this.cases.put(new Integer(i), new Case(symbole));
		}
	}
	
	public Ligne() {
		
	}
	
	public TreeMap<Integer, Case> getCases() {
		return this.cases;
	}
	
	@Override
	public void draw() {		
		for(int i = 0 ; i < this.cases.size() ; i++) {
			this.cases.get(new Integer(i)).draw();
		}
		System.out.println();
		
	}
	
	public boolean hasAllEquals() {	
		
		for(int j = 0 ; j < this.getCases().size() ; j++) {
			if(j == 0 ) { continue; }
			Case maCasePrecedente = this.getCases().get(new Integer(j - 1));
			Case maCaseEc = this.getCases().get(new Integer(j));
			if(!maCaseEc.isModified() || !maCasePrecedente.isModified()) { return false; }
			if( maCasePrecedente.getVal() != maCaseEc.getVal() ) {
				return false;
			}						
		}
		
		return true;
	}
	

}
