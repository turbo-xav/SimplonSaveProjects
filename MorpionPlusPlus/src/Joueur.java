public class Joueur {
	
	/** 
	  * Nom du joueur
	  * 
	  * @access private
	  * @name name
	  * @var String
      */
	
	private String name;
	
	/** 
	  * Symbole
	  * 
	  * @access private
	  * @name symbole
	  * @var Char
     */
	
	private char symbole;
	
		
	/**
	  * Constructeur
	  * 
	  * @access public 
	  * @param Joueur
	  * @param String
	  * @param Symbole
	  * 
	  */
	
	public Joueur(String name, char symbole) {
		this.name = name;
		this.symbole = symbole;
	}
	
	/**
	  * Constructeur
	  * 
	  * @access public
	  * @param Joueur
	  * @param String
	  * @param Symbole
	  * 
	  */
	
	public String getName() {
		return this.name;
	}
	
	/**
	  * Récupère la valeur du sympbole (O ou X en général)
	  * 
	  * @name getCaractere	  	  
	  * @return Char
	  * 
	  */
	
	public char getCaractere() {
		return this.symbole;
	}
}