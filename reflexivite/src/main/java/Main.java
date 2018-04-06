
import java.lang.reflect.Type;
import java.io.Console;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		System.out.println("*****************************************************");
		System.out.println("Bienvenue dans la présentation de l'API réflexivité !");
		System.out.println("*****************************************************");
		
		sc = new Scanner(System.in);
		
		boolean saisieOk = true;
		
		while(saisieOk) {
			try {
				//Saisie du nom de la Classe à analyser
				System.out.println("Veuillez saisir le nom d'une classe à présenter");
				
				String className = sc.nextLine();
				
				//Récupération de la class "Class"
				Class<?> classAinstancier = Class.forName(className);
				
				System.out.println("*********** Présentation de la Classe **********");
				
				//Sa Classe d'instrospection
				System.out.println("Je suis la classe : "+classAinstancier.getClass());
				System.out.println("Le petit nom de la Classe demandée est : "+classAinstancier.getSimpleName());
				System.out.println("Je contient toutes les infos utiles de : "+classAinstancier.getName());
							
				sc.nextLine();
											
				//Nom
				System.out.println("Classe étudiée: "+classAinstancier.getName());
				
				sc.nextLine();
				
				/**********************/
				/*******Attributs******/
				/**********************/
				
				//Liste des attributs
				Field[] fields = classAinstancier.getDeclaredFields();
				//On parcours la liste des attributs 
				System.out.println("*** Je possèdes : "+fields.length+" champs déclarés ***");
				for(int i = 0 ; i < fields.length ; i++) {
					Field field = fields[i];				
					System.out.println("  - Attribut	: '"+field.getName()+"'	- type : "+field.getType()+" Ma visibilité est : "+Modifier.toString(field.getModifiers()));
				}
				
				sc.nextLine();
				
				/**********************/
				/*******Méthodes*******/
				/**********************/
				
				//On liste les methodes déclarées
				Method[] methods = classAinstancier.getDeclaredMethods();
				System.out.println("*** Je possèdes : "+methods.length+" méthodes déclarés que chez moi ***");
				//On parcours les méthodes
				for(int i = 0 ; i < methods.length ; i++) {
					Method method = methods[i];
					//Les paramètre attendu en entrée
					Class<?>[] params = method.getParameterTypes();
					//Type retournée en sortie(void, int, ...)
					Type ret = method.getGenericReturnType();
					
					String visibility  = Modifier.toString(method.getModifiers());
					System.out.print(visibility+" "+ret.toString()+ " " + method.getName()+ "( ");
					
					//On parcours les paramètres
					for(int j = 0 ; j < params.length ; j++) {
						System.out.print(params[j].getSimpleName());
						if(j < params.length - 1) { System.out.print(","); }
					}
					
		
					System.out.println(" )");				
				}
				
				sc.nextLine();
				
				//Héritage
				Class<?> superClass = classAinstancier;
				
				System.out.println("** voici ma hiérarchie **");
				
				//ArrayList contenant la liste des noms de classes
				ArrayList<String> listClasses = new ArrayList<String>();
				
				//On parcours les class en remontant les héritages
				while(superClass != null) {
					
					listClasses.add(superClass.getSimpleName());
					
					//On tente de récupérer la classe parente
					superClass = superClass.getSuperclass();					
				}
				
				
				//Affichage de la hiérachie
				for(int i = listClasses.size() - 1 ; i >= 0 ; i--) {
					
					System.out.println("^");
					System.out.print("|");
					
					for(int j = 0 ; j <= (listClasses.size() - 1 - i) * 2 ; j++) {
						System.out.print("__");
					}
					
					System.out.println(" "+listClasses.get(i));
									
				}
				
				sc.nextLine();
				
				//Interfaces
				//Liste des interfaces
				Class[] interfaces = classAinstancier.getInterfaces();
				System.out.println("J'implémente "+interfaces.length+ " interfaces");
				//On affiche les interces
				for(int i = 0 ; i < interfaces.length ; i++) {
					System.out.println(interfaces[i].getSimpleName());
				}
				
				sc.nextLine();
				
				/*************************************/
				/*******Instanciation Dynamique*******/
				/*************************************/
				
				
				//Intanciation habituelle (Celle que vous connaissez)
				System.out.println(" **** Essais d'instanciation Classique : **** ");
				
				Rectangle r = new Rectangle(10,20);
				r.draw();				
				
				sc.nextLine();
				
				//Instanciation Dynamique via reflexivité
				
				System.out.println(" **** Essais d'instanciation Dynamique : **** ");
				//1 - Je récupère l'objet Class de Rectangle
				Class<Rectangle> classAinstancierRectangle = Rectangle.class;
				//2 - Je récupère le constructeur de la Class Rectangle
				Constructor<?> constructeur = classAinstancierRectangle.getConstructor(int.class,int.class);
				//3 - J'invoque le constructeur qui me renvoie une instance de la Classe Rectangle
				Object instantceRectangle = constructeur.newInstance(new Integer(15),new Integer(12));
				
				//4 - Je prépare une liste de paramètres vides (pour la méthode "draw")
				Class<?>[] types = new Class[] {};				
				//5 - Je récupère la méthode "draw" de l'objet rectangle
				Method methodePresenter = classAinstancierRectangle.getMethod("draw",types);
				//6 - J'invoke la méthode "draw" via l'instance "instantceRectangle"
				methodePresenter.invoke(instantceRectangle, null);
						
			
			} catch (ClassNotFoundException e) {
				System.err.println("Cette classe n'existe pas je crois :( !");
				
			} catch (NoSuchMethodException e) {
				
				e.printStackTrace();
			} catch (SecurityException e) {
				
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
			boolean quitSaisieOk = false;
			while(!quitSaisieOk) {
				System.out.println("Quitter ?");
				String quitStr = sc.nextLine();
				if(quitStr.equals("O")) { quitSaisieOk = true; saisieOk = false; }
				if(quitStr.equals("N")) { quitSaisieOk = true; saisieOk = true; }
								
			}
			
		}
		
		//Au revoir
		sc.close();
		System.out.println("Au revoir !");		
		System.exit(0);

	}
	
	
}
