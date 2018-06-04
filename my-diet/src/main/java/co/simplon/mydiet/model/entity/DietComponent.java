package co.simplon.mydiet.model.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "dietcomponent")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DietComponent extends Commentable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6345264871573285951L;

	@Column(name = "description")
    private String description;
	
	@Column(name = "visual")
    private String visual;
	
	
	//@JsonBackReference
	//@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_category", nullable=true)	
	private Category category;
	
	
	public Category getCategory() {
		return category;
		
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public DietComponent() {
		
	}
	
	public DietComponent(String name) {
		super(name);		
	}
	
	public DietComponent(String name,String description) {
		this(name);
		this.description = description;
	}
	
	public DietComponent(String name,String description,String  visual) {
		this(name,description);		
		this.visual = visual;		
	}
	
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getVisual() {
		return visual;
	}


	public void setVisual(String visual) {
		this.visual = visual;
	}	
	
	
}
