package Grille;

public class Case extends GrilleElement{
	
	private boolean isModified = false;
	private char val;
	
	public Case(char val) {
		this.setVal(val);
		this.setModified(false);
	}
	
	public void setVal(char val) {
		this.val = val;
		this.setModified(true);
	}
	
	public char getVal() {
		return this.val;
	}
	
	public void setModified(boolean isModified) {
		this.isModified = isModified;
	}
	
	
	public boolean isModified() {
		return this.isModified;
	}
	
	public void draw() {
		System.out.print("|"+this.getVal()+"|");	
	}

}
