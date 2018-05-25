package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.crud.entity.Monument;
import com.example.crud.repository.MonumentRepository;

@Named
public class MonumentServiceImpl implements MonumentService {

    @Inject
    MonumentRepository MonumentRepository;
	
    public Monument saveMonument(Monument Monument) {
	  MonumentRepository.save(Monument);
	  return Monument;
    }

    public List<Monument> getAll() {
	  return MonumentRepository.findAll();
    }
    public Optional<Monument> findbyId(Long id) {
		return MonumentRepository.findById(id);
    }
    
	public Long deleteMonumentById(Long id) {
		return MonumentRepository.deleteMonumentById(id);
	}

}
