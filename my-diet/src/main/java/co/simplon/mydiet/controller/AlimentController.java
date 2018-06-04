package co.simplon.mydiet.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.simplon.mydiet.model.entity.Aliment;
import co.simplon.mydiet.model.entity.Category;
import co.simplon.mydiet.service.AlimentService;


@Controller
@RequestMapping("/aliment")
public class AlimentController {
	
		
	@Inject
	AlimentService alimentService;
		
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
    public String listeProduits(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "aliment/index";
    }
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Aliment> findAll() {
	   	
		/*Aliment aliment = new Aliment("Banane","Super banane","",5,16,1,50);
	    Category category = new Category("Fruit");
	   	
	    category.addMenuComponent(aliment); 
		aliment.Comment("Sucré");
		aliment.Comment("Pourri");	
	   	   	
		List<Aliment> aliments =  alimentService.getAll();
		for(Aliment myAliment : aliments) {
			alimentService.deleteAlimentById(myAliment.getId());
		}
		
		alimentService.saveAliment(aliment);	
		*/
		//List<Aliment> exportAliments =  alimentService.getAll();
		//return exportAliments;
		return new ArrayList<Aliment>();
			
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Long update(@RequestBody Aliment resource) {

		alimentService.saveAliment(resource);		
	    return resource.getId();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Long delete(@PathVariable("id") Long id) {

		return alimentService.deleteAlimentById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Aliment create(@RequestBody Aliment resource) {
		
		alimentService.saveAliment(resource);		
	    return resource;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Aliment> read(@PathVariable("id") Long id,@CookieValue(value="name", defaultValue="notmyvalue", required=false) String name ) {
		Optional<Aliment> optionalIngenieur = alimentService.findbyId(id);
		return optionalIngenieur.isPresent()?ResponseEntity.ok().body(optionalIngenieur.get()):ResponseEntity.notFound().build();
	}

}
