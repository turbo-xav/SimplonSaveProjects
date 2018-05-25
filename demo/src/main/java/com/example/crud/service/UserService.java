package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import com.example.crud.entity.User;

@Named
public interface UserService {
	
	public List<User> getAll();

	public Optional<User> findbyId(Long id);
	
	public User saveUser(User User);
	
	public Long deleteUserById(Long id);
}
