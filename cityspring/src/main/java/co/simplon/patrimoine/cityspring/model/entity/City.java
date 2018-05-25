package co.simplon.patrimoine.cityspring.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name="city", schema="public")
@NamedQueries({
	@NamedQuery(name = "City.findAll", query = " SELECT c FROM City c ORDER BY c.name "),
	@NamedQuery(name = "City.deleteById", query = " DELETE FROM City c WHERE c.id = :id") })
public class City {
    
	@Transient
	public String attr = null; 
	
	@OneToMany(mappedBy = "city", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
	
	private List<Monument> monuments = new ArrayList<Monument>();	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="id")
	private Long id;
	
	@Column(name="name", length=100,nullable=false)
	private String name;
	
	

    public City() {
    }
    
    
    public City(String name) {
	  
      
	  this.name= name;
	  
    }
    

    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
	  return name;
    }

    public void setName(String nom) {
	  this.name = nom;
    }

   

    @Override
    public String toString() {
	  return "Adres :"+this.hashCode()+" City [id=" + id + ", name=" + name + "]";
    }

	/**
	 * @return the monuments
	 */
	public List<Monument> getMonuments() {
		return monuments;
	}

	/**
	 * @param monuments the monuments to set
	 */
	public void setMonuments(List<Monument> monuments) {
		this.monuments = monuments;
	}
	
	/**
	 * @param monuments the monuments to set
	 */
	public void addMonument(Monument monument) {
		this.monuments.add(monument);
		monument.setCity(this);
	}
	
	
	
}
