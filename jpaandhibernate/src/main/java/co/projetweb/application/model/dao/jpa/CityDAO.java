package co.projetweb.application.model.dao.jpa;

import javax.persistence.EntityManager;

import co.projetweb.application.model.entity.City;


public class CityDAO extends GenericDAO<City>{

	public CityDAO(EntityManager em) {
		super(em,City.class);		
	}	
	
}
