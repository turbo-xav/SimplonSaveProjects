
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//On crée en mémoire un nouvel objet de type Humain
			//ça appelle automatiquement la méthode Humain() : constructeur de la class Humain
		Humain monHumain = new Humain("Xavier",38,'H');		
			//On récupère la sortie de la méthode présenter de l'objet en cours et on affiche cette chaine de caractères 
		System.out.println(monHumain.presenter());	
		
		//On crée un deuxième objet de type Humain en lui affectant d'autres valeurs à ses propriétés 
		Humain monHumain2 = new Humain("Waby",29,'F');
		System.out.println(monHumain2.presenter());
		
		monHumain2.setSexe('H');		
		System.out.println(monHumain2.presenter());
		
		System.out.println("fin !");		
		
	}

}