package com.example.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ingenieur")
@PrimaryKeyJoinColumn(name = "id")
public class Ingenieur extends Employe {

	public Ingenieur() {
		super();
	}
	
	public Ingenieur(String name) {
		super(name);		
	}
	private static final long serialVersionUID = 1L;

    @Column(name = "statut")
    private String statut;
    @Column(name = "nb_projets")
    private int nbProjets;
	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public int getNbProjets() {
		return nbProjets;
	}

	public void setNbProjets(int nbProjets) {
		this.nbProjets = nbProjets;
	}
    
    

}
