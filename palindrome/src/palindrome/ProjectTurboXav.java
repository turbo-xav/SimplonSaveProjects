package palindrome;

import java.util.Objects;
import java.util.Scanner;

public class ProjectTurboXav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reponse;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			reponse = "";
			
			System.out.println("Voulez-vous au  :");
			System.out.println("P - Palindrome 	?");
			System.out.println("S - Sapin		?");
			
			String reponseJeu  = sc.nextLine().toUpperCase();
			
			switch (reponseJeu)
			{
			  case "P":
				  jouerAuPalindrome();
			  break;
			    
			  case "S":
				  jouerAuSapin();	  
				 
			  break;
			  
		
			
			}
			
				
			while(!reponse.equals( "Y" ) && !reponse.equals( "N" ) ) {				
				
				System.out.println("Voulez-vous réessayer (Y/N) ?");				
				reponse  = sc.nextLine().toUpperCase();									
			}
			
			
		}while(reponse.equals("Y"));
		
		sc.close();	
		System.out.println("Bye !!");
		System.exit(0);
	}
	
	public static void jouerAuSapin()
	{
		System.out.println("Entrer la hauteur du sapin: ");			
		
		Scanner sc = new Scanner(System.in);	
		int hauteur  = sc.nextInt();
		
		Sapin sapin = new Sapin();
		sapin.setHauteur(hauteur);
		sapin.draw();
	}
	
	
	public static void jouerAuPalindrome()
	{				
		System.out.println("Entrer une chaine pour vérfier le palindrome : ");			
		
		Scanner sc = new Scanner(System.in);	
		String val  = sc.nextLine();			
				
		
		Palindrome pal = new Palindrome();
		if(pal.isPalindrome(val)) {
			System.out.println("Yes !!!");
		}
		else {
			System.out.println("No !!!!!!!");
		}	
	}

}
