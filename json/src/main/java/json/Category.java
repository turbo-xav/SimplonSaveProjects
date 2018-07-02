package json;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private Long id;
	
	public Category() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void addComponent(Component component) {
		this.components.add(component);
	}

	private String name;
	
	private List<Component> components = new ArrayList<Component>();
	
	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		String str = "Category id = "+this.id+" name = "+this.name+"\n"; 
				
		str += "Contents : ("+this.components.size()+") : "+"\n";
		
		for(Component component: this.components) {
			str += " - "+component.toString()+"\n";
		}
		
		return str;
	}
}
