package co.projetweb.application.enumeration;

public enum Langage {
	
	 JAVA("Langage JAVA", "Eclipse"),
	  C ("Lanage C", "Code Block"),
	  CPlus ("Langage C++", "Visual studio"),
	  PHP ("Langage PHP", "PS Pad");	
	
	 private String name = "";
	 private String editor = "";
	   
	  //Constructeur
	  Langage(String name, String editor){
	    this.name = name;
	    this.editor = editor;
	  }
	   
	  public String toString(){
	    return name+" -> "+editor;
	  }
		
}
