package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.crud.entity.User;
import com.example.crud.repository.UserRepository;

@Named
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository UserRepository;
	
    public User saveUser(User User) {
	  UserRepository.save(User);
	  return User;
    }

    public List<User> getAll() {
	  return UserRepository.findAll();
    }
    public Optional<User> findbyId(Long id) {
		return UserRepository.findById(id);
    }
    
	public Long deleteUserById(Long id) {
		return UserRepository.deleteUserById(id);
	}

}
