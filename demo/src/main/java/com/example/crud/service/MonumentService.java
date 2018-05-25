package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import com.example.crud.entity.Monument;

@Named
public interface MonumentService {
	
	public List<Monument> getAll();

	public Optional<Monument> findbyId(Long id);
	
	public Monument saveMonument(Monument Monument);
	
	public Long deleteMonumentById(Long id);
}
