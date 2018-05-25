package com.example.crud.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.crud.entity.Monument;

@Named
public interface MonumentRepository extends JpaRepository<Monument, Long> {
	List<Monument> findByName(String name);
	Optional<Monument> findById(Long id);
	public List<Monument> findByNameLike(@Param("name") String name);
	public List<Monument> findAll();
	
	@Transactional
	Long deleteMonumentById(Long id);
}
