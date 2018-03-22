import designPattern.decorateur.Decorateur;
import designPattern.decorateur.Decorateur1;
import designPattern.decorateur.Decorateur2;
import designPattern.decorateur.Decore;

public class DesignPattern {
	public static void main(String[] args) {
		
		Decorateur decorateur	=	new Decorateur2(new Decorateur1(new Decore()));		
		decorateur.methode();
		
	}
}
