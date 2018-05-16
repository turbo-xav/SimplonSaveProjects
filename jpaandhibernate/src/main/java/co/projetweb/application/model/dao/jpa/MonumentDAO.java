package co.projetweb.application.model.dao.jpa;

import javax.persistence.EntityManager;

import co.projetweb.application.model.entity.Monument;


public class MonumentDAO extends GenericDAO<Monument>{

	public MonumentDAO(EntityManager em) {
		super(em);
		this.setMyClass(Monument.class);
	}	
	
}
