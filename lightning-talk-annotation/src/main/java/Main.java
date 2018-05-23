import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Je récupère un objet "Class" de la classe "ClassWithAnnotation"
		Class<?> classWithAnnotation;
		//Aller un p'tit rappel
			//Méthode 1 : Accès par la classe
		classWithAnnotation = ClassWithAnnotation.class;
			//Méthode 2 : Accès via une instance de la class
		ClassWithAnnotation objetWithAnnotation = new ClassWithAnnotation();
		classWithAnnotation =  objetWithAnnotation.getClass();
		//On récupère la liste des méthodes de l'objet "classWithAnnotation" issu de la classe
		Method[] methods = classWithAnnotation.getDeclaredMethods();
		
		//Je parcours les méthodes présente dans la classe
		for(Method m : methods) {		
			
			//Jé créer un tableau d'objet "Annotation" à partir de la liste des annoations apportées à la méthode
			Annotation[] annonations = m.getAnnotations();
			
			System.out.println("* La méthode "+m.getName()+" possède :"+annonations.length+" annotations !");
			
			//On parcours le tableau d'annotations de la méthode
			for(Annotation annotation : annonations) {
				//J'affiche le nom de l'interface de mon annotation
				System.out.println("-- Je suis une annotation et je m'appelle : "+annotation.getClass().getInterfaces()[0].getName());
				System.out.println("-- je suis de type : "+annotation.annotationType());
				//Je vais utiliser les infos spécifiques de mes annotations				
				if (annotation instanceof MonAnnotation) {					
					
					//On caste l'annotation du type générique "Annotation" vers le type plus spécifique "MonAnnotation"
						//Les 2 variables "sameAnnotation" et "annotation" désignent le même objet 
					MonAnnotation sameAnnotation = (MonAnnotation) annotation;
					//J'affiche les attributs name, lib et run de mon annotation
					System.out.println("---name	:	"+sameAnnotation.name());
					System.out.println("---lib	:	"+sameAnnotation.lib());
					System.out.println("---run	:	"+sameAnnotation.run());
				}				
			}			
		}	
		
		/* 2 - Exécution dynamique */
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		//On lancer à la main
		objetWithAnnotation.methode1();
		objetWithAnnotation.methode2();
		
		while(!quit) {
						
			System.out.println("Faites votres choix :");
			for(int i = 0 ; i < methods.length ; i++) {
				System.out.println((i+1)+") "+methods[i].getName());
			}
				
			//Dynamiquement
			int methodeId = sc.nextInt();
			if(methodeId == 0) {
				quit = true; 
			}else {
				runMethode(objetWithAnnotation,methods[methodeId-1].getName());
			}
		}
		sc.close();
		
	}
	
	
	public static void runMethode(Object obj, String methode) {
		
		Class<?> classeAInstancier = obj.getClass();
		Class<?>[] types = new Class[] {};				
		try {
			Method methodeToRun = classeAInstancier.getMethod(methode,types);				
			
			MonAnnotation annonation = methodeToRun.getAnnotation(MonAnnotation.class);
			if(annonation.run() == true) {
				methodeToRun.invoke(obj, null);
			}else {
				System.err.println("hélas je n'ai pas le droit de lancer la méthode : "+methodeToRun.getName());
			}			
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
