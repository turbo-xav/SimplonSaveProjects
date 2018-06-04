package co.simplon.mydiet.model.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import co.simplon.mydiet.model.entity.Aliment;

@Named
public interface AlimentRepository extends JpaRepository<Aliment, Long> {
	List<Aliment> findByName(String name);
	Optional<Aliment> findById(Long id);
	public List<Aliment> findByNameLike(@Param("name") String name);
	public List<Aliment> findAll();
	
	@Transactional
	Long deleteAlimentById(Long id);
}
