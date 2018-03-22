public class ProgrammingPair {

	private Personne driver;
	private Personne programming;
	
	
	public void setDriver(Personne driver) {
		this.driver = driver;
	}
	
	public Personne getDriver() {
		return this.driver;
	}
	
	public void setProgramming(Personne programming) {
		this.programming = programming;
	}
	
	public Personne getProgramming() {
		return this.programming;
	}
	
	public ProgrammingPair(ProgrammingPair prog) {		
		this.setDriver(new Personne(prog.getDriver()));
		this.setProgramming(new Personne(prog.getProgramming()));
		
	}

	public ProgrammingPair() {
		
	}
	
	
}
