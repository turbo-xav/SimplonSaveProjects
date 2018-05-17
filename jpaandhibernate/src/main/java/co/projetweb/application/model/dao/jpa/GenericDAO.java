package co.projetweb.application.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.projetweb.application.model.dao.IGenericDAO;

public abstract class GenericDAO<T> implements IGenericDAO<T> {
	
	private final Class<T> myClass;
	
	private EntityManager em;
	
	public GenericDAO(EntityManager em,Class<T> myClass) {
		this.em = em;
		this.myClass = myClass;
	}
		
	
	
	
	public T getById(Long id) {		
		
		return em.find(this.myClass, id);
	}

	
	public void deleteById(Long id) {
		
		T instance = this.getById(id);		
		if(instance == null) { return ; }		
		em.remove(instance);
		
		
	}
		
	public T create(T instance) {
		
	     em.persist(instance);	    
		return instance;
		
	}
	
	public T update(T instance) {
		
		return em.merge(instance);	   
		
		
	}
	
	public List<T> list(){
		
		String sql = "SELECT instance FROM "+this.myClass.getSimpleName()+" instance";
		System.out.println(sql);
		
		TypedQuery<T> q = em.createQuery(sql,this.myClass);
		List<T> list = q.getResultList();
		return list;	
	}
	
	public List<T> filter(String name) {
		String sql = "SELECT instance FROM "+this.myClass.getSimpleName()+" instance WHERE instance.name LIKE :name";
		System.out.println(sql);
		
		TypedQuery<T> q = em.createQuery(sql,this.myClass);
		q.setParameter("name", "%"+name+"%");
		List<T> list = q.getResultList();
		return list;
	}
	
	
}
