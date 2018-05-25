package com.example.crud.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.crud.entity.Foo;

@Named
public interface FooRepository extends JpaRepository<Foo, Long> {
	List<Foo> findByName(String name);
	Optional<Foo> findById(Long id);
	public List<Foo> findByNameLike(@Param("name") String name);
	public List<Foo> findAll();
	
	@Transactional
	Long deleteFooById(Long id);
}
