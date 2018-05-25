package com.example.crud.entity;

import java.util.List;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "FOO")
@NamedQueries({
	@NamedQuery(name = "Foo.findAll", query = " SELECT f FROM Foo f ORDER BY f.name "),
	@NamedQuery(name = "Foo.deleteById", query = " DELETE FROM Foo f WHERE f.id = :id") })
public class Foo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="id")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	public Foo() {
		
	}
	public Foo(long id) {
		this.id= id;
	}

	public Foo(String name) {
		this.name= name;
	}
	public Foo(long id, String name) {
		this.id= id;
		this.name= name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id= id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	public String toString() {
		return "id = "+this.getId()+" name ="+this.getName();
		
	}	
}
