import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import TurboXav.View.*;
import TurboXav.*;
import TurboXav.Model.Aliment;



public class MonApplication {

	public static void main(String[] args) {			
		
		Fenetre f = new Fenetre();		
		f.setVisible(true);		
		
		
	}
	
	public static void list()
	{
		ArrayList<TurboXav.Model.Aliment> aliments = TurboXav.Model.Aliment.listAliments();		
		for(int i = 0; i < aliments.size() ; i++){
			System.out.println(aliments.get(i));
		}
	}
	
	

}
