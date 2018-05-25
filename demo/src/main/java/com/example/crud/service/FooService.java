package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import com.example.crud.entity.Foo;

@Named
public interface FooService {
	
	public List<Foo> getAll();

	public Optional<Foo> findbyId(Long id);
	
	public Foo saveFoo(Foo foo);
	
	public Long deleteFooById(Long id);
}
