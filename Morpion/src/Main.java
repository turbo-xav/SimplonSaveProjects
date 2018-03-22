import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import Grille.*;

public class Main {

	private static Joueur joueur1; 
	private static Joueur joueur2;
	private static Scanner scanner;
	
	public static void main(String[] args) {			
		
		//Message de bienvenue
		System.out.println("Bienvenue dans le Morpion !");	
		
		//Joueur 1 : présentez vous
		scanner  = new Scanner(System.in);
		System.out.println("Joueur 1 quel est ton nom : ");	
		String nomJoueur1 = scanner.nextLine();
		joueur1 = new Joueur(nomJoueur1,new Croix());
		System.out.println("Joueur 2 quel est ton nom : ");	
		String nomJoueur2 = scanner.nextLine();	
		joueur2 = new Joueur(nomJoueur2 ,new Rond());		
		
		//Pour l'instant aucun joueur n'est sélectionné
		Joueur joueurEc = null;		
		//Création du Morpion
		Morpion morpion = new Morpion(3, 3, null);		
		//Tant que le morpion n'est pas en Game Over
		while(!morpion.gameOver()) {
			
			//On swicth de joueur à chaque itération : par défaut joueur1 (si joeurEc est null)
			joueurEc = (joueurEc == joueur1)?joueur2:joueur1;
			//On dessine le morpion
			morpion.dessiner();		
			//On initialise la case à choisie à une valeur en dehors du scope
			int caseChoisie = 0;
						
			//tant que la case choisie est en dehors du scope
			while((caseChoisie < 1 || caseChoisie > morpion.getNbCases())) {
				//On demande de choisir une case de 1 à 9
				System.out.println(joueurEc.getName()+" choisissez une case de 1 à 9 : ");
				//On récupère la ligne en cours
				String saisieJoueur = scanner.nextLine();				
				//Si on se plante de type (pas un entier)
				try {
					caseChoisie = Integer.parseInt(saisieJoueur);
					
					//On tente de reseigner la case par le caractère désignanr le joueur			
					if(!morpion.assignerCase(caseChoisie, joueurEc.getCaractere())) {
						caseChoisie = 0;
						//On remercie le joueur qui vient de jouer 
						System.out.println("Hummm humm la case a déjà été choisie !!! ");				}
					else {
						//On remercie le joueur qui vient de jouer 
						System.out.println("Merci "+joueurEc.getName()+" !!! ");
					}					
					
				}catch(NumberFormatException e) {
					System.out.println("Hummm peux-tu saisir une valeur numérique de 1 à 9");
					caseChoisie = 0;
				}				
			}			
		}
		//On félicite le joueur qui a gagné		
		System.out.println("Bravo joeur :"+joueurEc.getName());		
		//On réaffiche le morpion final
		morpion.dessiner();		
	}

}
