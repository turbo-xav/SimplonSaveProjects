package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import com.example.crud.entity.City;

@Named
public interface CityService {
	
	public List<City> getAll();

	public Optional<City> findbyId(Long id);
	
	public City saveCity(City City);
	
	public Long deleteCityById(Long id);
}
