package co.projetweb.application.controller;

import javax.persistence.EntityManager;

import co.projetweb.application.controller.annotation.ControllerMethodAnnotation;
import co.projetweb.application.model.dao.jpa.CityDAO;
import co.projetweb.application.model.dao.jpa.MonumentDAO;
import co.projetweb.application.model.dao.jpa.UserDAO;
import co.projetweb.application.model.entity.City;
import co.projetweb.application.model.entity.EntityManagerQuery;
import co.projetweb.application.model.entity.Monument;
import co.projetweb.application.model.entity.User;


public class AppController {
	
	/**
	  * Quit 
	  * @access public
	  * @return void 
	  * @name quit
	  * 
	  */
	
	@ControllerMethodAnnotation(name="quit",lib="Quitter",order=1)
	public void quit() {
		System.err.println("Bye !");
		System.exit(0);
	}
	
	/**
	  *  Wait
	  *
	  *  @access public
	  *  @name waitALittle
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="waitALittle",lib="Attendre quelques secondes",order=2)
	public void waitALittle() {
		System.out.println("Go dans : ");
		try {
			for(int i = 3 ; i > 0 ; i--) {
				System.out.print(i+" ");			
					Thread.sleep(500);
			}
			System.out.println("Go !!!");
			Thread.sleep(250);
		}
		catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println();
	}
	
	/**
	  *  Affiche une ville
	  *
	  *  @access public
	  *  @name readCity
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="readCity",lib="Afficher une ville",order=3)
	public void readCity() {
		EntityManager em = EntityManagerQuery.getEntityManagerFactory().createEntityManager();
		CityDAO cityDAO= new CityDAO(em);
		City city = cityDAO.getById(new Long(145));
		System.out.println(city);
		
	}
	
	
	/**
	  *  Exécute un ensemble de Create et Update et Delete via les DAO
	  *
	  *  @access public
	  *  @name executeAllQueries
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="executeAllQueries",lib="Exécuter plusiueurs requête",order=4)
	public void executeAllQueries() {
		
		//Création d'un EntityMannager pour gérer les entités liée à toute l'opération qui va se dérouler
		EntityManager em = EntityManagerQuery.getEntityManagerFactory().createEntityManager();
				
		//Création d'une ville
		CityDAO cityDAO = new CityDAO(em);
		City city0 = new City("PARIS IDF",1,2);
		City city = cityDAO.create(city0);
				
		//Récupération d'une ville via son ID
		City city2 = cityDAO.getById(city.getId());
				
		//Ici on voit que les adresses sont les mêmes donc il s'agit de 3 variables qui désigne un seul et unique objet en mémoire
		System.out.println(city0);
		System.out.println(city);
		System.out.println(city2);
				
		//Si la ville est bien trouvée (on ne sait jamais)
		if(city2 != null) {
			city2.setName("Montreuil IDF");
			cityDAO.update(city2);
		}
				
		//On tente de supprimer une une ville via son ID si elle existe en base
		cityDAO.deleteById(new Long(106));
		
		//On créer un nouveau monument dans la ville "city"
		MonumentDAO monumentDAO = new MonumentDAO(em);		
		Monument monument = new Monument("Tour Eiffel");
		city.addMonument(monument);
		
		//On créer un user
		UserDAO userDAO = new UserDAO(em);		
		User user = userDAO.create(new User("Xavier"));
		//Un setCity est implicite et implémentée dans la classe "Monumenyt"
		user.addMonument(monument);
		
		//insert
		monumentDAO.create(monument);
		
		//l'opération est terminée
		em.close();
		
		
	}
	
	/**
	  *  Liste les entités en bdd
	  *
	  *  @access public
	  *  @name list
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="list",lib="list Les Entites",order=5)
	public void list() {
		EntityManager em = EntityManagerQuery.getEntityManagerFactory().createEntityManager();
		CityDAO cityDAO = new CityDAO(em);
		System.out.println(cityDAO.list());
		
		em.close();
	}
	
	/**
	  *  Exécute un ensemble de Create et Update et Delete via les DAO
	  *
	  *  @access public
	  *  @name filter
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="filter",lib="list Les Entites en filtrant selon le name",order=6)
	public void filter() {
		EntityManager em = EntityManagerQuery.getEntityManagerFactory().createEntityManager();
		CityDAO cityDAO = new CityDAO(em);
		System.out.println(cityDAO.filter("Mont"));		
		em.close();
	}
	
	/**
	  *  Liste toutes les entités en bdd
	  *
	  *  @access public
	  *  @name findAll
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="findAll",lib="Utiliser le findAll",order=7)
	public void findAll() {
		
		System.out.println(City.findAll(1, 2));
		
	}
	
	/**
	  *  Liste toutes les entités en bdd
	  *
	  *  @access public
	  *  @name findAll
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="deleteById",lib="Effacer l'id ?",order=8)
	public void deleteById() {
		
		City.deleteById(new Long(217));
		
	}
}

