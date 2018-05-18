package co.projetweb.application.enumeration;

public enum Choice {
	
	QUIT("Quitter ?"),
	WAIT("Attendre un peu ?");
	
	private String lib; 
	
	Choice(String lib){
		this.lib = lib;
	}
	
	public String toString() {
		return this.lib; 
	}
}
