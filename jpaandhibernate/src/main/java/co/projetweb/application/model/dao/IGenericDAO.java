package co.projetweb.application.model.dao;

public interface IGenericDAO<T> {	
	public T create(T instance);    
    public T update(T instance);
    public T getById(Long id);
    public void deleteById(Long id);
}
