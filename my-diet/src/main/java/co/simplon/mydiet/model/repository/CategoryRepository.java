package co.simplon.mydiet.model.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import co.simplon.mydiet.model.entity.Category;

@Named
public interface CategoryRepository extends JpaRepository<Category, Long> {
	List<Category> findByName(String name);
	Optional<Category> findById(Long id);
	public List<Category> findByNameLike(@Param("name") String name);
	public List<Category> findAll();
	
	@Transactional
	Long deleteCategoryById(Long id);
}
