package com.example.crud.controller;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.crud.entity.Ingenieur;
import com.example.crud.service.IngenieurService;

@Controller
@RequestMapping("/ingenieur")
public class IngenieurController {
	
	@Inject
	IngenieurService ingenieurService;	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Ingenieur> findAll() {
	   
		Ingenieur ingenieur = new Ingenieur("Xavier");
		ingenieur.setStatut("Viré");
		ingenieur.setNbProjets(1235363);
		ingenieurService.saveIngenieur(ingenieur);
				
		return ingenieurService.getAll();	
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Long update(@RequestBody Ingenieur resource) {

		ingenieurService.saveIngenieur(resource);		
	    return resource.getId();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Long delete(@PathVariable("id") Long id) {

		return ingenieurService.deleteIngenieurById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Ingenieur create(@RequestBody Ingenieur resource) {

		ingenieurService.saveIngenieur(resource);		
	    return resource;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Ingenieur> read(@PathVariable("id") Long id,@CookieValue(value="name", defaultValue="notmyvalue", required=false) String name ) {
		Optional<Ingenieur> optionalIngenieur = ingenieurService.findbyId(id);
		return optionalIngenieur.isPresent()?ResponseEntity.ok().body(optionalIngenieur.get()):ResponseEntity.notFound().build();
	}	

}
