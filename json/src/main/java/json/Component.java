package json;

public class Component {
	private Long id;
	private String name;
	
	public Component() {
		 
	}
	
	public Component(Long id, String name) {
		this.setId(id);
		this.setName(name);
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
