package co.simplon.mydiet.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.HttpEntity;
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


import co.simplon.mydiet.model.entity.Category;
import co.simplon.mydiet.service.CategoryService;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;


@Controller
@RequestMapping("/category")
public class CategoryController {
	
		
	@Inject
	CategoryService categoryService;
		
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
    public String listeProduits(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "aliment/index";
    }
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Category> findAll() {
	   			
		return categoryService.getAll();
					
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Long update(@RequestBody Category resource) {

		categoryService.saveCategory(resource);		
	    return resource.getId();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Long delete(@PathVariable("id") Long id) {

		return categoryService.deleteCategoryById(id);
	}
	
	/*@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Category create(@RequestBody Category resource) {
		
		categoryService.saveCategory(resource);		
	    
		return resource;
	}*/
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public int create(HttpEntity<String> httpEntity) {
		/*JSONParser jsonParser = new JSONParser(1);
		try {
			 Object obj = (JSONObject) jsonParser.parse(httpEntity.getBody());
			System.out.println(obj.get("name"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//System.out.println(map.size());
		//System.out.println(httpEntity.getBody());
	return 1;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Category> read(@PathVariable("id") Long id,@CookieValue(value="name", defaultValue="notmyvalue", required=false) String name ) {
		Optional<Category> optionalCategory = categoryService.findbyId(id);
		Category category = optionalCategory.get();
		System.out.println(category.getDietComponents().size());
		return optionalCategory.isPresent()?ResponseEntity.ok().body(category):ResponseEntity.notFound().build();
	}

}
