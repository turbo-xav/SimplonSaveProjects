
public class Employe {
	private String nom;
	
	public String getNom() {
		return this.nom;
	}
	
	public Employe(String name) {
		this.nom = name;
	}
	
	public void presenter() {
		System.out.println("Je m'appelle : "+this.nom);
	}
}
