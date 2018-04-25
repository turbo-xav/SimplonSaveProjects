package co.projetWeb.Application.Scanner;

import java.util.Scanner;

public class ApplicationScanner {

	/**
	  * Object scanner for users entry
	  * 
	  * @author Xavier Tagliarino <xavier.tagliarino@gmail.com>
	  * @access public static
	  * @name scanner
	  * @var Scanner
	  * 
	  */
	
	private Scanner scanner = new Scanner(System.in);
	
	/**
	  * Ask an int value to the user via console interfac
	  *
	  * @access public
	  * @param String : question
	  * @return int : input from user
	  * @name askInt
	  */
	
	public int askInt(String question) {
		
		System.out.println(question);
		int choixClavier = 0;
		boolean choixKo = true;
		
		while(choixKo) {
			try{
				choixClavier = Integer.parseInt(scanner.nextLine());
				if(choixClavier < 0) {
					System.err.println("Pas de valeur négative !!");
					continue;
				}
				choixKo = false;
			}
			catch(NumberFormatException e) {
				System.err.println("veuillez saisir une valeur numérique");
			}
		}
		return choixClavier;
	}
	
	/**
	  * Ask an String value to the user via console interfac
	  *  
	  * @access public
	  * @param String : question
	  * @return String : input from user
	  * @name askString
	  */
	
	public String askString(String question) {
		
		System.out.println(question);
		
		String choixClavier="";
		try{
			choixClavier = scanner.nextLine();			
		}
		catch(NumberFormatException e) {
			System.out.println("veuillez saisir une valeur numérique");
		}
		return choixClavier;
		
	}
	
	/**
	  * Close the scanner
	  *
	  * @access public static
	  * @name close
	  * 
	  * 
	  */
	
	public void close() {
		this.scanner.close();
	}
	
}
