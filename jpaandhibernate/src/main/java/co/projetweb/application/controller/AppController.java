package co.projetweb.application.controller;



import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import co.projetweb.application.controller.annotation.ControllerMethodAnnotation;
import co.projetweb.application.model.dao.jpa.CityDAO;
import co.projetweb.application.model.dao.jpa.MonumentDAO;
import co.projetweb.application.model.dao.jpa.UserDAO;
import co.projetweb.application.model.entity.City;
import co.projetweb.application.model.entity.EntityManagerQuery;
import co.projetweb.application.model.entity.Monument;
import co.projetweb.application.model.entity.User;
import co.projetweb.application.enumeration.Choice;
import co.projetweb.application.enumeration.Langage;

public class AppController {
	
	private EntityManager em;
	
	public void preExecute() {
		System.out.println("preExecute");
	}
	public void preExecuteBdd() {
		
		System.out.println("preExecuteBdd");
		
		em = EntityManagerQuery.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
	}
	
	public void postExecute() {
		System.out.println("postExecute");
		this.waitALittle();
	}
	
	public void postExecuteBdd() {
		System.out.println("postExecuteBdd");
		if(em.getTransaction().isActive()) {			
			System.out.println("active");		
			em.getTransaction().commit();
		}
		else {
			System.out.println("inactive");
		}
		em.close();
	}
	
	/**
	  * Execute an action
	  * 
	  * @access public
	  * @return void 
	  * @name execute
	  * @param String : method to load 
	  * 
	  */
	
	public void execute(String methodeName) {
				
		Class<?> classeAInstancier = this.getClass();
		
		Class<?>[] types = new Class[] {};				
		
		try {
			Method methodeToExecute = classeAInstancier.getMethod(methodeName,types);			
			
			ControllerMethodAnnotation annotation = methodeToExecute.getAnnotation(ControllerMethodAnnotation.class);
			this.preExecute();
			if(annotation.bdd() != false) { this.preExecuteBdd(); }			
			methodeToExecute.invoke(this, null);			
			if(annotation.bdd() != false) { this.postExecuteBdd(); }
			this.postExecute();
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}	
	}
	
	/**
	  * Quit 
	  * @access public
	  * @return void 
	  * @name quit
	  * 
	  */
	
	@ControllerMethodAnnotation(name="quit",lib="Quitter",order=1,bdd=false)
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
	
	@ControllerMethodAnnotation(name="waitALittle",lib="Attendre quelques secondes",order=2,bdd=false)
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
	
	@ControllerMethodAnnotation(name="readCity",lib="Afficher une ville",order=3,bdd=true)
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
	
	@ControllerMethodAnnotation(name="executeAllQueries",lib="Exécuter plusiueurs requête",order=4,bdd=true)
	public void executeAllQueries() {
		
		
		
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
			city2.setName("Montreuil IDF 2");
			cityDAO.update(city2);
		}
				
		//On tente de supprimer une une ville via son ID si elle existe en base
		//cityDAO.deleteById(new Long(106));
		
		//On créer un nouveau monument dans la ville "city"
		MonumentDAO monumentDAO = new MonumentDAO(em);		
		Monument monument = new Monument("Tour Eiffel3");
		Monument monument2 = new Monument("Arc de Triomphe");
		Monument monument3 = new Monument("Physical Center");
		Monument monument4 = new Monument("Box");
		Monument monument5 = new Monument("Circuit Carole");
		Monument monument6 = new Monument("Belle Epine");
		
		
		city.addMonument(monument);
		city.addMonument(monument2);
		city.addMonument(monument3);
		city.addMonument(monument4);
		city.addMonument(monument5);
		city.addMonument(monument6);
		//insert
		monumentDAO.create(monument);
		monumentDAO.create(monument2);
		monumentDAO.create(monument3);
		monumentDAO.create(monument4);
		monumentDAO.create(monument5);
		monumentDAO.create(monument6);
		
		
		//On créer un user
		UserDAO userDAO = new UserDAO(em);		
		User user = userDAO.create(new User("Xavier"));
		//Un setCity est implicite et implémentée dans la classe "Monumenyt"
		user.addMonument(monument);		
		user.addMonument(monument2);
		user.addMonument(monument3);
		user.addMonument(monument4);
		
		
		
		
		
		
		
	}
	
	/**
	  *  Liste les entités en bdd
	  *
	  *  @access public
	  *  @name list
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="list",lib="list Les Entites",order=5,bdd=true)
	public void list() {
		
		CityDAO cityDAO = new CityDAO(em);
		System.out.println(cityDAO.list());		
		
		
	}
	
	/**
	  *  Exécute un ensemble de Create et Update et Delete via les DAO
	  *
	  *  @access public
	  *  @name filter
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="filter",lib="list Les Entites en filtrant selon le name",order=6,bdd=true)
	public void filter() {
		
		
		CityDAO cityDAO = new CityDAO(em);
		
		System.out.println(cityDAO.filter("Mont"));		
		
		
	}
	
	/**
	  *  Liste toutes les entités en bdd
	  *
	  *  @access public
	  *  @name findAll
	  *  @return void
	  *  
	  */
	
	@ControllerMethodAnnotation(name="findAll",lib="Utiliser le findAll",order=7,bdd=true)
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
	
	@ControllerMethodAnnotation(name="deleteById",lib="Effacer l'id ?",order=8,bdd=true)
	public void deleteById() {
			
		
		try {
			City.deleteById(em, new Long(217));	
		}catch(PersistenceException e) {
			System.err.println("Pb lors de la suppression de la City demandée !");
			em.getTransaction().rollback();
		}		
	}
	
	/**
	  *
	  * Génère une requete criteria
	  * 
	  */
	@ControllerMethodAnnotation(name="criteria",lib="API Criteria",order=9,bdd=true)
	public void criteria() {
		EntityManager em = EntityManagerQuery.getEntityManagerFactory().createEntityManager();
		/*CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<City> cq = cb.createQuery(City.class);
		Root<City> city = cq.from(City.class);
		cq.select(city);
				
		TypedQuery<City> q = em.createQuery(cq);
		System.out.println(q.getResultList());*/
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Monument> query = cb.createQuery(Monument.class);
		Root<City> city = query.from(City.class);
		Join<City, Monument> monuments = city.join("monuments");
		query.select(monuments);
		TypedQuery<Monument> q = em.createQuery(query);
		System.out.println(q.getResultList());
		
		em.close();
	}
	/**
	  *
	  * Génère une requete criteria
	  * 
	  */
	@ControllerMethodAnnotation(name="testJoinJpQl",lib="Test de jointure avec JPQL",order=10,bdd=true)
	public void testJoinJpQl() {
		 
		//Cas simple
		/*TypedQuery<Monument> query =
			      em.createQuery("SELECT m FROM Monument m", Monument.class);
			  
		 	List<Monument> results = query.setFirstResult(20).setMaxResults(2).getResultList();
			  for (Monument m : results) {
			      System.out.println("-"+m.getName());
			      Set<User> users = m.getUsers();
			      for(User u : users) {
			    	  System.out.println("--"+u.getName());
			      }
			  }
	    //Join			  
		 List<Object[]> results1 = em.createQuery("SELECT c.name, m.name, m.city.name  FROM City c JOIN Monument m ON c.id != m.city").getResultList();

		 for (Object[] result : results1) {
			 //System.out.println(result); 	
			 System.out.println("City : "+result[0]+" = Monument : "+result[1]+" New City"+result[2]);
		 }
		 
		 //Exemple autre
		 TypedQuery<Monument> tq = em.createQuery("SELECT m FROM  Monument m INNER JOIN City c on c = m.city",Monument.class);
		    
		    List<Monument> lstRetour = tq.getResultList();
		    for (Monument m : lstRetour) {
		        System.out.println("Join : "+m.getName());
		    }*/
		  //Fetch Join : ne fais qu'une seule requête
		   TypedQuery<Monument> tq2 = em.createQuery("SELECT m FROM Monument m JOIN FETCH m.city", Monument.class);
		   List<Monument> lstRetour2 = tq2.getResultList();
		    for (Monument m : lstRetour2) {
		        System.out.println("Le monument : "+m.getName()+" est dans la ville "+m.getCity().getName());
		    }
		    
		    
			  
	}
	
	/**
	  *
	  * Génère une requete criteria
	  * 
	  */
	@ControllerMethodAnnotation(name="testEnum",lib="Tester les enumérations",order=11,bdd=false)
	public void testEnum() {
		
		for(Langage lang : Langage.values()){
		    
			if(Langage.JAVA.equals(lang))
		        System.out.println("J'aime le : " + lang);
		      else
		        System.out.println(lang);
		    }
		
		System.out.println(Choice.QUIT);
		
		
	}
	
}

