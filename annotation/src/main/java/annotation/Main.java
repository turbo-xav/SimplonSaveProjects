package annotation;

import java.lang.annotation.Annotation;

public class Main {
	
	public static void main(String[] args) {
		Class<MaClasse> c = MaClasse.class;
		System.out.println(c.getSimpleName());
		Annotation[] annotations = c.getAnnotations();
		System.out.println(annotations.length);
		for(Annotation annotation : annotations) {
			if (annotation instanceof InfoClasse)
		    {
		        InfoClasse info_classe = (InfoClasse) annotation;
		        System.out.println("auteur : " + info_classe.auteur());
		        System.out.println("revision : " + info_classe.revision());
		    }
		}
		
	}
	
}