import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
 



import javax.xml.bind.ValidationException;

public class Aliments {

	private static String fileText = "aliments.csv";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*String alimentName = "";
		float alimentKCal = 0;
		float alimentProteine	= 0;
		float alimentGlucide	= 0;*/
		
		 System.out.println("Bonjour et bienvenue dans l'application de gestion de diététique !");

		  // Création de l'objet Scanner qui permet de lire les entrées clavier depuis la console.
		  Scanner scanner = new Scanner(System.in);
		  
		  String[] listmenu = {
								  "Quitter l'application"			,
								  "Lister aliement de la liste"		,
								  "Ajouter un aliments à la liste"	,
								  "Supprimer un aliment de la liste",
								  "Récupérer une catégorie complète"
				  			};
		  
		  
		  int menuChoice = -1;
		  do {
		   
			  // Affichage du menu dans la console.
		    System.out.println("------------------- Menu -------------------");
		    for(int j = 1 ; j < listmenu.length ; j++) {
		    	System.out.println(j+") "+listmenu[j]);			   
		    }	    
		    System.out.println("0) "+listmenu[0]);	

		    // Récupération de l'entrée clavier qui sera utilisée pour définir l'action à faire.
		   try {
			   menuChoice = Integer.parseInt(scanner.nextLine());
			   switch (menuChoice) {  
				  case 1:			    	
				    listerAliments();
				  break;
			    case 2:
			       	ajouterAliment();
			    break;
			    case 3:				     
			    	removeAliment();
			    break;
			    case 4:				     
			    	removeCategory();
			    break;
			    default:
				    throw new NumberFormatException("Ca a merdé.");
			   } 
		   }
		   catch(NumberFormatException e) {
			   menuChoice = -1;
			   System.out.println("Merci de saisir une valeur 0, 1, 2 ou  3 et rien d'autre");
		   }
		   
		   
		  } while (menuChoice != 0);

		  // On ferme l'objet scanner car il ne servira plus (obligatoire pour les objets qui manipulent les Streams).
		  scanner.close();
		}
	
	
	
	
	/*
	 * 
	 * Ecrit dans le fichier une chaine
	 * 
	 * @access private  static
	 * @return void
	 * @name listerAlimentsCompact
	 * 
	 **/
	
	private static void writeInFile(String str)  throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileText));	
		bw.write(str);
		bw.close();
	
	}
	
	
	/*
	 * 
	 * Lister les aliments
	 * 
	 * @access public static
	 * @return void
	 * @name listerAlimentsCompact
	 * 
	 **/
	
	public static void removeAliment() throws IOException
	{
		listerAliments();
		
		System.out.println("Supprimer Quoi ???");
		Scanner scannerEnter = new Scanner(System.in);
		String aliment = scannerEnter.nextLine();
		
		File f = new File (fileText);
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader (fr);
		Scanner scanner = new Scanner (br);		
			
		String strToFile = "";
		int i = 0;
		while(scanner.hasNextLine()) {
			if(i == 0) { i++; continue; }
			String aliments = scanner.nextLine();
			String[] alimentsTab = aliments.split(";");
			String alimentEc = alimentsTab[0];
						
			if(aliment.equals(alimentEc) == false) {
				strToFile += aliments+ "\n";				
			}
			i++;
			
		}		
		
		writeInFile(strToFile);			
		
		listerAliments();	
	}
	
	/*
	 * 
	 * Lister les aliments
	 * 
	 * @access public static
	 * @return void
	 * @name listerAlimentsStr
	 * 
	 **/
	
	public static String listerAlimentsStr() throws FileNotFoundException
	{		
		String str = "";
		try
		{
			File f = new File (fileText);
			FileReader fr = new FileReader (f);
			BufferedReader br = new BufferedReader (fr);
			Scanner scanner = new Scanner (br);
			
			
			
			while(scanner.hasNextLine()) {
				str += scanner.nextLine()+"\n";
			}
			
		}
		catch (FileNotFoundException exception)
		{
		    System.out.println ("Le fichier n'a pas été trouvé");
		}
		return str;
		
	}
		
	
	
	/*
	 * 
	 * Lister les aliments
	 * 
	 * @access public static
	 * @return void
	 * @name listerAliments
	 * 
	 **/
	
	
	public static void listerAliments() throws IOException 
	{
		System.out.println(listerAlimentsStr());		
	}
	
	
	
	/*
	 * 
	 * Ajouter un aliment
	 * 
	 * @access public static
	 * @return void
	 * @name ajouterAliment
	 * 
	 **/
	
	
	public static void ajouterAliment() throws IOException 
	{
		listerAliments();
		System.out.println("Son Nom : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Sa catégorie : ");
		String cat = scanner.nextLine();
		
		System.out.println("Ses KCal : ");
		String kCal = scanner.nextLine();
		
		System.out.println("Protéines : ");
		String proteines = scanner.nextLine();
		
		System.out.println("Glucides : ");
		String glucides = scanner.nextLine();
		
		System.out.println("Lipides : ");
		String lipides = scanner.nextLine();
		
		String strInittial = listerAlimentsStr();
		
		writeInFile(strInittial+name+";"+cat+";"+kCal+";"+proteines+";"+glucides+";"+lipides);       
        listerAliments();
		
	}
	
	/**
	  * 
	  * @access private static
	  * @return void
	 * @throws FileNotFoundException 
	  *
	  **/	
	public static List listCategory() throws FileNotFoundException
	{
		String listStr = listerAlimentsStr();
	    String[] listAliment = listStr.split("\n");
		
		List l = new LinkedList();
		
		for(int i = 0 ; i < listAliment.length ; i++) {
			if(i == 0) { continue; }
			String[] aliment = listAliment[i].split(";");
			boolean contains = l.contains(aliment[1]);
			if(contains == false) {
				l.add(aliment[1]);
			}
		}	    

		return l;
		
		  
	}
	
	public static void removeCategory() throws IOException
	{
		List categories = listCategory();
		int choix = -1;
		do {
		for(int j = 0 ; j < categories.size() ; j++)
		{
			System.out.println(j+") "+categories.get(j));			
		}
		
		Scanner sc = new Scanner(System.in);
			
		try {
			choix = sc.nextInt();
		}
		catch(InputMismatchException exception) {
			System.out.println("valeur Numérique uniquement");
			choix = -1;
		}
		}while(choix == -1);
			
		System.out.println("vous avez choisit : "+categories.get(choix));
		
		String listStr = listerAlimentsStr();
	    String[] listAliment = listStr.split("\n");
	    String strFile = "";
	    for(int j = 0 ; j < listAliment.length ; j++) {
	    	String[] listAlimentTab = listAliment[j].split(";");
	    	if(listAlimentTab[1].equals(categories.get(choix))) { continue; }
	    	strFile += listAliment[j]+"\n";
	    	
	    }
	    writeInFile(strFile);
		listerAliments();
	}

}
