package json;

public class Recipe extends Component{

	private String taste;
	
	public Recipe() {
		
	}
	
	public Recipe(Long id, String name) {
		super(id, name);
	}

	/**
	 * @return the taste
	 */
	public String getTaste() {
		return taste;
	}

	/**
	 * @param taste the taste to set
	 */
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public String toString() {
		return "Recipe id = "+this.getId()+" name = "+this.getName()+ " Taste = "+this.taste; 
	}
	
}
