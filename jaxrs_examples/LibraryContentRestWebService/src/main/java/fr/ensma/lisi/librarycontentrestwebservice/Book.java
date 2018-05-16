package fr.ensma.lisi.librarycontentrestwebservice;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
@XmlRootElement(name = "book")
public class Book {
	protected String name;
	
	protected String isbn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		return name;
	}
}
