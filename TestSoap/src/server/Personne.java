package server;

public class Personne {
	private String name = "";
		
	public Personne(String name) {
		this.setName(name);
		
		
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
