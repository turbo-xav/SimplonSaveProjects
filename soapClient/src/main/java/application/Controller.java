package application;

import java.util.List;

import client.*;

public class Controller {
	
	public void quit() {
		System.out.println("GoodBye !!!");
		System.exit(0);
	}
	
	
	public void getFoodAttributeListByName() {
		String nameFilter = Loader.askString("Quel aliment chercher ?");
		FoodDBService_Service serv = new FoodDBService_Service();
		FoodDBService service = serv.getFoodDBServicePort();
		List<FoodAttribute> foods = service.getFoodAttributeListByName(nameFilter);
		for(FoodAttribute food : foods) {
			System.out.println(food.getId()+") "+food.getName());
		}
	}
	
	public void listFoodCategories() {
		FoodDBService_Service serv = new FoodDBService_Service();
		FoodDBService service = serv.getFoodDBServicePort();
		List<FoodCategory> foodCategories = service.getFoodCategories();
		for(FoodCategory foodCategory : foodCategories) {
			System.out.println(foodCategory.getId()+") "+foodCategory.getName());
		}
	}
	
	/**
	  * Teste le WS
	  *
	  * @name testWs
	  * @return void
	  * 
	  */
	
	public void ping2() {
		
		FoodDBService_Service serv = new FoodDBService_Service();
		FoodDBService service = serv.getFoodDBServicePort();
		int ping = service.ping2();
		System.out.println(ping);
	}
	
	
	/**
	  * Teste le WS
	  *
	  * @name testWs
	  * @return void
	  * 
	  */
	
	public void ping() {
		
		FoodDBService_Service serv = new FoodDBService_Service();
		FoodDBService service = serv.getFoodDBServicePort();
		int ping = service.ping();
		System.out.println(ping);
	}
}
