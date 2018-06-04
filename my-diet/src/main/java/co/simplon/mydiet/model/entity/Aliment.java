package co.simplon.mydiet.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aliment")
public class Aliment extends DietComponent{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4862710937469913703L;

	@Column(name = "proteins")
    private int proteins;
	
	@Column(name = "glucids")
    private int glucids;
	
	@Column(name = "lipids")
    private int lipids;
	
	@Column(name = "ig")
    private int ig;
		
	public Aliment() {
				
	}
	
	
	
	public Aliment(String name,String description,String  visual, int proteins, int glucids, int lipids, int ig) {
		super(name, description, visual);
		this.proteins = proteins;
		this.glucids = glucids;
		this.lipids = lipids;
		this.ig = ig;
	}

	

	public int getProteins() {
		return proteins;
	}

	public void setProteins(int protein) {
		this.proteins = protein;
	}

	public int getGlucids() {
		return glucids;
	}

	public void setGlucids(int glucids) {
		this.glucids = glucids;
	}

	public int getLipids() {
		return lipids;
	}

	public void setLipids(int lipids) {
		this.lipids = lipids;
	}

	public int getIg() {
		return ig;
	}

	public void setIg(int ig) {
		this.ig = ig;
	} 
	
	public float getEnergy() {
		return 4 * proteins + 4 * glucids + 9 * lipids;
	}
	
	@Override
	public String toString() {
		return 
				"Nom :" +getName()
				+" : Energy "+ getEnergy()
				+ "Proteines " + getProteins()
				+ "Glucides "+ getGlucids()
				+ "Lipides"+ getLipids();
	}
}
