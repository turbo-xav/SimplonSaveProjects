package co.simplon.mydiet.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import co.simplon.mydiet.model.entity.Category;

@Named
public interface CategoryService {
	
	public List<Category> getAll();

	public Optional<Category> findbyId(Long id);
	
	public Category saveCategory(Category Category);
	
	public Long deleteCategoryById(Long id);
}
