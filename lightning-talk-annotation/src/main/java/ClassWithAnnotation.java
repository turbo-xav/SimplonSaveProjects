import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Method;

public class ClassWithAnnotation {
	
	
	@MonAnnotation(name="methode1",lib="moi j'ai un libellé",run=false)
	public void methode1() {		
		System.out.println("Méthode 1 : lancée");	
	}
	
	@MonAnnotation(name="methode2",lib="moi j'ai un libellé",run=true)
	public void methode2() {
		System.out.println("Méthode 2 : lancée");
	}
}
