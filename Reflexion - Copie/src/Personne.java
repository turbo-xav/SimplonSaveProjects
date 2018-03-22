
public class Personne extends Humain {
	
	public String name;
	protected String firstName;
	private int age;
	
	public Personne(String name, String firstName, int age) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void presenter(String str) {
		System.out.println(str + "Bonjour je m'appelle :"+this.firstName+" "+this.name);
	}
	
	public boolean equals(Object o) {
		if(o != null && o instanceof Personne ) {
			Personne pers = (Personne) o;
						
			return (this.firstName.equals(pers.firstName) && this.name.equals(pers.name) && this.age == pers.age);
		} 
		return false;
	}	
}
