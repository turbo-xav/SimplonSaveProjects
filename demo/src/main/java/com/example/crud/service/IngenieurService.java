package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import com.example.crud.entity.Ingenieur;

@Named
public interface IngenieurService {
	
	public List<Ingenieur> getAll();

	public Optional<Ingenieur> findbyId(Long id);
	
	public Ingenieur saveIngenieur(Ingenieur Ingenieur);
	
	public Long deleteIngenieurById(Long id);
}
