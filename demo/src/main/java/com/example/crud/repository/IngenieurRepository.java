package com.example.crud.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.crud.entity.Ingenieur;

@Named
public interface IngenieurRepository extends JpaRepository<Ingenieur, Long> {
	List<Ingenieur> findByName(String name);
	Optional<Ingenieur> findById(Long id);
	public List<Ingenieur> findByNameLike(@Param("name") String name);
	public List<Ingenieur> findAll();
	
	@Transactional
	Long deleteIngenieurById(Long id);
}
