import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import sun.reflect.generics.tree.Tree;

public class Main {
	public static void main(String[] Args) {
		
		/*** Chap 1 : Les Tableaux ***/
		/*
		//1 - Tableau
		//0 => 1
		//1 => 3
		// ...
		//4 => 9
		
		//méthode 1 pour déclarer
		//int[] armoire = {1, 3, 5, 7, 9};
//		//méthode 2 pour déclarer
		int[] armoire = new int[5];
		//équivalent à ça :
		//int[] armoire = {0, 0, 0, 0, 0};
		for(int i = 0 ; i < 5 ; i++ ) {
			armoire[i] = i;
		}
		armoire[0] = 0;
		armoire[1] = 1;
		armoire[2] = 2;
		armoire[3] = 3;
		armoire[4] = 4;
		System.out.println(armoire[0]);
		System.out.println(armoire[1]);
		System.out.println(armoire[2]);
		System.out.println(armoire[3]);
		System.out.println(armoire[4]);

		
		
		//Affichage de chaque casier d'indice i (i changeant à chaque itération) 
		for(int i = 0 ; i < armoire.length ; i++) {
			System.out.println(armoire[i]);
		}
		
		//Pour chaque "valeur" (déclaré en int) cotenu dans "armoire"
		for(int valeur : armoire) {
			System.out.println(valeur);
		}
		*/
		
		/**** Chapitre 2 : Les collections ****/
		/*
		//ce sont comme des tableaux qui n'ont pas de taille prédéfinies
		//On peut connaitre à tout moment la taille
		//On y empile des éléments		
		//On peut y retrouver les élément via des indices		
		//On peut même effacer les éléments
		
		//J'instanice une collection de type ArrayList
		ArrayList armoireAlphabet = new ArrayList();
		//j'empile des éléments
		armoireAlphabet.add("A");
		armoireAlphabet.add("B");
		armoireAlphabet.add(9);
		
		int[] armoire = {1, 3, 5, 7, 9};
		armoireAlphabet.add(armoire);
		//J'enlève l'élément d'indice "1" tous les autres indices sont recalculés
		//armoireAlphabet.remove(1);
		
		//J'efface tous les éléments
		//armoireAlphabet.clear();
		
		//Si ma collection "armoireAlphabet" n'est pas vide
		if( !armoireAlphabet.isEmpty() ) {
			System.out.println("je tente d'itérer");
			//je boucle (j'itère) sur mes éléments
			for(int i = 0 ; i < armoireAlphabet.size() ; i++) {
				System.out.println("indice = "+i+" element ="+armoireAlphabet.get(i));
			}
		}
		
		//J'affiche l'élément 3
		int[] monTableau =  (int[]) armoireAlphabet.get(3);
		//En modifiant "monTableau", je modifie la même adresse mémoire que celle désignée par "armoire" et "armoireAlphabet.get(3)" les 3 désignent le même tableau en mémoire
		monTableau[1] = 45;
		
		*/
		
		//Je créer une nouvelle ArrayList en précisant le type d'éléments quelle va recevoir
		
		/*ArrayList <Integer> collectionNbReps = new ArrayList<Integer>();
		collectionNbReps.add(8);
		collectionNbReps.add(30);
		collectionNbReps.add(3);
		
		for(int scoreRep : collectionNbReps) {
			System.out.println(scoreRep);
		}
		
		TreeSet<Integer> collectionXav = new TreeSet<Integer>();
		collectionXav.add(9);
		collectionXav.add(4);
		collectionXav.add(14);
		
		for(int scoreXav : collectionXav) {
			System.out.println(scoreXav);
		}
		
		TreeMap<String, String> collectionNom = new TreeMap<String,String>();
		collectionNom.put("Xavier", "Vitry");
		collectionNom.put("Waby","Paris");
		
		//System.out.println(collectionNom.get("Xavier"));
		Set entrySet = collectionNom.entrySet();
		Iterator iterator = entrySet.iterator();
		while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
		
		//int[] tab  = collectionNbReps.toArray();	
		*/
		//Figure carre = new Carre();
		//carre.dessiner();
		//Figure triangle = new Triangle();
		//triangle.dessiner();
		
		//dessinerUnFigure(new Carre());
		//dessinerUnFigure(new Triangle());
		
		/*if(Args.length > 0) {
			for(String arg : Args) {
				System.out.println(arg);
			}
		}*/
		
		/*** Les interfaces ***/
		
		//Méthode 1 : On instancie les objets et on appelle la méthode dessiner de chacun 
		/*Carre carre = new Carre();
		carre.dessiner();
		
		Triangle triangle = new Triangle();
		triangle.dessiner();
		
		Rectangle rectangle = new Rectangle ();
		rectangle.dessiner();
		
		//Méthode 2 : On appelle une fonction qui prend en entrée un paramètre (qui désigne un objet) qui respecte d'interface (contrat) "Figure"
		dessinerUnFigure(carre);
		dessinerUnFigure(triangle);
		dessinerUnFigure(rectangle);
		
		//Méthode 3 : très proche la méthode 2 ou l'on envoie directement une nouvelle instance de "Carre","Rectangle","Triangle"
		dessinerUnFigure(new Carre());
		dessinerUnFigure(new Triangle());
		dessinerUnFigure(new Rectangle ());*/
	}
	
	/*public static void dessinerUnFigure(Figure f) {
		//Quelque soit la "Figure" elle possède forcément la méthode dessiner() (imposé par l'interface "Figure")
		f.dessiner();
	}*/
}
