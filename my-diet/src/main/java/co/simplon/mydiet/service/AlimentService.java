package co.simplon.mydiet.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import co.simplon.mydiet.model.entity.Aliment;

@Named
public interface AlimentService {
	
	public List<Aliment> getAll();

	public Optional<Aliment> findbyId(Long id);
	
	public Aliment saveAliment(Aliment Aliment);
	
	public Long deleteAlimentById(Long id);
}
