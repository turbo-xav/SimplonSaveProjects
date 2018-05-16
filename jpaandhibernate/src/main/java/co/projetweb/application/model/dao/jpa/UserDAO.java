package co.projetweb.application.model.dao.jpa;

import javax.persistence.EntityManager;

import co.projetweb.application.model.entity.User;

public class UserDAO extends GenericDAO<User>{

	public UserDAO(EntityManager em) {
		super(em);
		this.setMyClass(User.class);
	}	
	
}
