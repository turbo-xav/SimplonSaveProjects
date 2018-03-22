import java.util.ArrayList;

public class Entreprise {
	private ArrayList<Employe> employes;
	
	public Entreprise() {
		this.employes = new ArrayList<Employe>();
	}
	
	public void recruterEmploye(Employe e) {
		
		this.employes.add(e);
	}
	
	public void virerEmploye(String nom) {
		for(int i = 0 ; i < this.employes.size(); i++) {
			if(nom.equals(this.employes.get(i).getNom())) {
				this.employes.remove(i);
				break;
			}
		}
	}
	
	public void presenterEmployes() {
		for(int i = 0 ; i < this.employes.size(); i++) {
			this.employes.get(i).presenter();
		}
	}
	
}
