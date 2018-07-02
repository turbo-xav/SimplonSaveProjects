package json;

import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;


public class Main {
	public static void main(String[] args) {	
		String jsonStringToParseAliment = "{id:1,name:fruit, recipes : [{id:null,name:banane,taste:Good}, {id:null,name:pomme,taste:Bad}]}";
		factoryComponent(jsonStringToParseAliment);		
	}
	
	public static Category factoryComponent(String jsonStringToParse) {
		JSONObject obj = new JSONObject(jsonStringToParse);
		Set<String> keys = obj.keySet();
		Category cat = new Category();
		for(String key: keys) {
			System.out.println(key);
			if(key.equals("id")) {
				cat.setId(obj.getLong(key));
			}
			
			if(key.equals("name")) {
				cat.setName(obj.getString(key));
			}			
					
			if(obj.get(key) instanceof JSONArray) {
				
				Component component;
				
				JSONArray components = (JSONArray) obj.get(key);
				for(int i = 0; i < components.length() ; i++) {			
					component = null;
					JSONObject jSonComponent = components.getJSONObject(i);
					
					switch( key) {				
						case "aliments"	: {
							component = new Aliment();
							((Aliment) component).setkCal(jSonComponent.isNull("kCal")?null:jSonComponent.getLong("kCal"));
						}
						break;
							
						case "recipes": {
							component = new Recipe();
							((Recipe) component).setTaste(jSonComponent.isNull("taste")?null:jSonComponent.getString("taste"));
							
						}
						break;
					}					
											
					component.setId(jSonComponent.isNull("id")?null:jSonComponent.getLong("id"));
					component.setName(jSonComponent.isNull("name")?null:jSonComponent.getString("name"));
									
					cat.addComponent(component);
					
				}
				
				
				
			}
			
			
			/*if(key.equals("aliments")) {
				System.out.println(obj.get(key) instanceof JSONArray);
				JSONArray aliments = (JSONArray) obj.get(key);
				for(int i = 0; i < aliments.length() ; i++) {			
					
					JSONObject aliment = aliments.getJSONObject(i);
					Long id = aliment.isNull("id")?null:aliment.getLong("id");		
					cat.addComponent( new Aliment(id, aliment.getString("name"),aliment.getLong("kCal")));
					
				}
			}*/
			
			
		}
		System.out.println(cat);
		return cat;
	}
}
