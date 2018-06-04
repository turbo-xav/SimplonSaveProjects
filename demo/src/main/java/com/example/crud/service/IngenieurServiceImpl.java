package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.crud.entity.Ingenieur;
import com.example.crud.repository.IngenieurRepository;

@Named
public class IngenieurServiceImpl implements IngenieurService {

    @Inject
    IngenieurRepository IngenieurRepository;
	
    public Ingenieur saveIngenieur(Ingenieur Ingenieur) {
	  IngenieurRepository.save(Ingenieur);
	  return Ingenieur;
    }

    public List<Ingenieur> getAll() {
	  return IngenieurRepository.findAll();
    }
    public Optional<Ingenieur> findbyId(Long id) {
		return IngenieurRepository.findById(id);
    }
    
	public Long deleteIngenieurById(Long id) {
		return IngenieurRepository.deleteIngenieurById(id);
	}

}
