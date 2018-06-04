package co.simplon.mydiet.service.implement;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import co.simplon.mydiet.model.entity.Category;
import co.simplon.mydiet.model.repository.CategoryRepository;
import co.simplon.mydiet.service.CategoryService;

@Named
public class CategoryServiceImpl implements CategoryService {

    @Inject
    CategoryRepository categoryRepository;
	
    public Category saveCategory(Category Category) {
	  categoryRepository.save(Category);
	  return Category;
    }

    public List<Category> getAll() {
	  return categoryRepository.findAll();
    }
    public Optional<Category> findbyId(Long id) {
		return categoryRepository.findById(id);
    }
    
	public Long deleteCategoryById(Long id) {
		return categoryRepository.deleteCategoryById(id);
	}

}
