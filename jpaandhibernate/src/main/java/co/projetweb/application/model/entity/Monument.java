package co.projetweb.application.model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="monument", schema="public")
public class Monument {
   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="id")
	
	private Long id;
	
	@Column(name="name", length=100,nullable=false)
    private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_city", nullable=false)
	private City city;
   
	@ManyToMany(mappedBy="monuments")
	private Set<User> users = new HashSet<User>();
	
	public Set<User> getUsers(){
		return this.users; 
	}
	
    public Monument(String name) {
	  super();
	  this.name = name;
    }
    public Monument() {
    }
    public Long getId() {
	  return this.id;
    }
    public void setId(Long id) {
	  this.id = id;
    }
    public String getName() {
	  return this.name;
    }
    public void setName(String name) {
	  this.name = name;
    }
    
    public City getCity() {
	  return city;
    }
  
    public void setCity(City city) {
	  this.city = city;
    }
    
    public void removeCity() {
    	this.setCity(null);
    }
    
    @Override
    public String toString() {
	  return "Monument [id=" + id + ", name=" + name
	      + ", city=" /*+ city */+ "]";
    }
}