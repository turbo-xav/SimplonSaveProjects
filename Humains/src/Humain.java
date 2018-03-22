public class Humain {

	
	private String prenom;
	
	private int age;
	
	private char sexe;
	
	
	public Humain(String pre, int a, char s) {
		
		this.prenom = pre;
		this.age = a;
		this.sexe = s;
		
		System.out.println("Coucou je suis créé");
	}
	
	public String presenter() {
		
		return "Bonjour je m'appelle "+this.prenom+" et j'ai "+this.age+" ans et mon sexe est : "+this.sexe;
	}
	
	public void setSexe(char s) {
		if(s != 'F' && s != 'H'){ return ; }
		this.sexe = s;
	}
	
	public char getSexe() {
		return this.sexe;
	}
}