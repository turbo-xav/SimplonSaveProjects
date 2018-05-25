package com.example.crud.repository;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.crud.entity.User;

@Named
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByName(String name);
	Optional<User> findById(Long id);
	public List<User> findByNameLike(@Param("name") String name);
	public List<User> findAll();
	
	@Transactional
	Long deleteUserById(Long id);
}
