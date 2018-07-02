package co.simplon.mydiet.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -715459683511028371L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
		
	@Column(name = "name")
    private String name;
	
	//@JsonManagedReference
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<DietComponent> dietComponents = new ArrayList<DietComponent>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category() {
		
	}
	
	public Category(String name) {
		this.name = name;
	}
	
	public void addMenuComponent(Aliment menuComponent) {
		this.dietComponents.add(menuComponent);
		menuComponent.setCategory(this);
	}
	
	public List<DietComponent> getDietComponents(){
		return dietComponents;
	}
	
	public String toString() {
		return "name :" + this.getName()+ "dietComponents : "+this.getDietComponents();
	}
}
