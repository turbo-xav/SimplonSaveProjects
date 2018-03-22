
public class Main {

	public static void main(String[] args) {
		
		Entreprise WabyEtXavierEtBonneAmbiance = new Entreprise();
		WabyEtXavierEtBonneAmbiance.recruterEmploye(new Employe("Waby"));
		WabyEtXavierEtBonneAmbiance.recruterEmploye(new Employe("Xavier"));
		WabyEtXavierEtBonneAmbiance.recruterEmploye(new Employe("Bernard"));
		
		WabyEtXavierEtBonneAmbiance.virerEmploye("Bernard");
		
		WabyEtXavierEtBonneAmbiance.presenterEmployes();
	}

}
