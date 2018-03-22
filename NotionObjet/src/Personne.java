
public class Personne {
	private String name;
	private String firstName;
	private int age;
	
	public String getName() {
		return this.name;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	
	public Personne(String name, String firstName, int age) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
	}
	
	public Personne(Personne personne) {
		this.name = personne.getName();
		this.firstName = personne.getFirstName();
		this.age = personne.getAge();
	}
	
	public boolean equals(Object o) {
		if(o != null && o instanceof Personne ) {
			Personne pers = (Personne) o;
			return (pers.firstName == this.firstName && pers.name == this.name && this.age == pers.age);
		} 
		return false;
	}
}
