package co.simplon.patrimoine.cityspring.model.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import co.simplon.patrimoine.cityspring.model.entity.City;

@Named
public interface CityRepository extends JpaRepository<City, Long> {
	List<City> findByName(String name);
	Optional<City> findById(Long id);
	public List<City> findByNameLike(@Param("name") String name);
	public List<City> findAll();
	
	@Transactional
	Long deleteCityById(Long id);
}
