import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.Input;

import sun.reflect.generics.tree.Tree;

public class Main {
	
	private static String fichier1 = "wealth.txt"; 
	private static String fichier2 = "ethics.txt";
	
	
	private static TreeSet<String> monTreeSetFichier1 = new TreeSet<String>();
	private static TreeSet<String> monTreeSetFichier2 = new TreeSet<String>();
	
	
	public static void init() {
		InputStream flux1;
		try {
			flux1 = new FileInputStream(fichier1);
			InputStreamReader lecture1 	=	new InputStreamReader(flux1);
			BufferedReader buff1		=	new BufferedReader(lecture1);
			 
			monTreeSetFichier1 = new TreeSet<String>();
			String ligne1;
			try {
				while ((ligne1=buff1.readLine())!=null){
					
					monTreeSetFichier1.add(ligne1);		
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
	}
	
	public static void main(String[] args) {
		
		init();
		
		long debut = System.currentTimeMillis();	
		afficherMotsCommun();
		System.out.println("Temps exécution afficherMotsCommun : "+(System.currentTimeMillis()-debut)+" ms");
		
		debut =  System.currentTimeMillis();
		afficherOccurences();
		System.out.println("Temps exécution afficherOccurences : "+(System.currentTimeMillis()-debut)+" ms");
		
		
				
		
		
		/*TreeSet<String> monTreeSet = new TreeSet<String>();
		
		monTreeSet.add("B");
		monTreeSet.add("A");
		monTreeSet.add("A");
		monTreeSet.add("C");
		monTreeSet.add("Z");
		monTreeSet.add("AA");
		monTreeSet.add("R");
		monTreeSet.add("Y");
		
		
		
		System.out.println("Tableau de départ : ");
		for (String cnt : monTreeSet) {
			System.out.println(cnt);
		}
		
		System.out.println("Tableau toArray : ");
		String[] elts =  monTreeSet.toArray(new String[monTreeSet.size()]);
		for(String elt : elts) {
			System.out.println(elt);
		}	
		
		System.out.println("First	:	"+monTreeSet.first());
		System.out.println("Last	:	"+monTreeSet.last());	
		
		System.out.println("Contains A : "+monTreeSet.contains("A"));
		System.out.println("Contains K : "+monTreeSet.contains("K"));
		
		
		TreeSet<String> monTreeSetClone = (TreeSet<String>) monTreeSet.clone();
		
		System.out.println("Lower than C : "+monTreeSet.lower("Z"));
		
		monTreeSet.pollFirst();
		monTreeSet.pollLast();
		
		System.out.println("Tableau d'arrivée : ");
		for (String cnt : monTreeSet) {
			System.out.println(cnt);
		}
		
		System.out.println("Tableau cloné : ");
		for (String cnt : monTreeSetClone) {
			System.out.println(cnt);
		}*/	
	}
	
	public static void afficherMotsCommun() {
		//Afficher le mots en communs
		try{		
			//On remplit une liste1
			InputStream flux1=new FileInputStream(fichier1); 
			InputStreamReader lecture1=new InputStreamReader(flux1);
			BufferedReader buff1=new BufferedReader(lecture1);
			 
			TreeSet<String> monTreeSet1 = new TreeSet<String>();
			String ligne1;
			while ((ligne1=buff1.readLine())!=null){
				
				monTreeSet1.add(ligne1);		
			}	
			
			//On remplit une liste2 si le mot est trouvé
			InputStream flux2=new FileInputStream(fichier2); 
			InputStreamReader lecture2=new InputStreamReader(flux2);
			BufferedReader buff2=new BufferedReader(lecture2);
			TreeSet<String> monTreeSet2 = new TreeSet<String>();
			String ligne2;
			int nbLignes = 0;
			while ((ligne2=buff2.readLine())!=null){
				if(monTreeSet1.contains(ligne2)) {					
					monTreeSet2.add(ligne2);					
				}
				else {
					System.out.println(ligne2);
				}
				nbLignes++;				
			}
			
			//On affiche les mots en commun
			for(String str : monTreeSet2) {
				System.out.println("Présent : "+str);
			}
			
			//Bilan
			System.out.println(monTreeSet2.size()+" mots présents / "+nbLignes+" lignes ");
				
			buff1.close(); 
			buff2.close();
			}		
			catch (Exception e){
				System.out.println(e.toString());
			}
		}
	
	
	public static void afficherOccurences() {
		//Comptage nb occurences
		
		
				InputStream flux3;
				try {
					
					flux3 = new FileInputStream(fichier1);
					
					InputStreamReader lecture3=new InputStreamReader(flux3);
					BufferedReader buff3=new BufferedReader(lecture3);
					
					ArrayList<String> listTotale = new ArrayList<String>();
					HashSet<String> monTreeSet3 = new HashSet<String>();
					String ligne3;
					int nbLignes = 0;
					while ((ligne3=buff3.readLine())!=null){				
						listTotale.add(ligne3);
						monTreeSet3.add(ligne3);
						nbLignes++;
					}		
					
					Hashtable monTreeSet4 = new Hashtable();
					
					for(String mot: monTreeSet3) {
						monTreeSet4.put(mot, 0);
					}
					
						
					for(String mot : listTotale) {
						int nb = (int) monTreeSet4.get(mot)+1;
						monTreeSet4.put(mot,nb);
					}
					
					
					
					System.out.println("Listes d'occurences : ");
					for(String mot: monTreeSet3) {
						System.out.println("Mot : "+mot+" nb Occurences :"+ monTreeSet4.get(mot));
					}
					System.out.println("Nb Mots :"+monTreeSet3.size());
					System.out.println("Nb Lignes :"+nbLignes);
					buff3.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	}
	
}
