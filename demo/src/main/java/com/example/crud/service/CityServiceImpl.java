package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.crud.entity.City;
import com.example.crud.repository.CityRepository;

@Named
public class CityServiceImpl implements CityService {

    @Inject
    CityRepository CityRepository;
	
    public City saveCity(City City) {
	  CityRepository.save(City);
	  return City;
    }

    public List<City> getAll() {
	  return CityRepository.findAll();
    }
    public Optional<City> findbyId(Long id) {
		return CityRepository.findById(id);
    }
    
	public Long deleteCityById(Long id) {
		return CityRepository.deleteCityById(id);
	}

}
