package designPattern.decorateur;

public class Decorateur implements Traitement{

	protected Traitement traitement;
	
	public Decorateur() {
		
	}
	
	public Decorateur(Traitement traitement) {
		this.traitement = traitement;
	}
	
	@Override
	public void methode() {
		// TODO Auto-generated method stub
		System.out.println("Méthode exécutée de la classe "+this.getClass().getSimpleName()+" avec quelques fonctionnalités");
		if(this.traitement != null) {
			this.traitement.methode();
		}
	}
	
}
