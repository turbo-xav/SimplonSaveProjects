import Grille.Symbole;

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
	  * Nom du joueur
	  * 
	  * @access private
	  * @name symbole
	  * @var Symbole
     */
	
	private Symbole symbole;
	
	/**
	  * Constructeur
	  * 
	  * @access public 
	  * @param Joueur
	  * @param String
	  * @param Symbole
	  * 
	  */
	
	public Joueur(String name, Symbole symbole) {
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
	  * @param Joueur
	  * @param String
	  * @param Symbole
	  * 
	  */
	
	public String getCaractere() {
		return this.symbole.getCaractere();
	}
}