/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Cat.
 * 
 * @author Utilisateur
 */
public class Cat {
	/**
	 * Description of the property lib.
	 */
	public Object lib = ;

	/**
	 * Description of the property articles.
	 */
	public HashSet<Article> articles = new HashSet<Article>();

	// Start of user code (user defined attributes for Cat)

	// End of user code

	/**
	 * The constructor.
	 */
	public Cat() {
		// Start of user code constructor for Cat)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Cat)

	// End of user code
	/**
	 * Returns lib.
	 * @return lib 
	 */
	public Object getLib() {
		return this.lib;
	}

	/**
	 * Sets a value to attribute lib. 
	 * @param newLib 
	 */
	public void setLib(Object newLib) {
		this.lib = newLib;
	}

	/**
	 * Returns articles.
	 * @return articles 
	 */
	public HashSet<Article> getArticles() {
		return this.articles;
	}

}
