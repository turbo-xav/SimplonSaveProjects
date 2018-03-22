package testJUnit;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

import math.Calculatrice;

public class MainTest {
	@Test
	public void testMain2(){	
		Calculatrice op =  new Calculatrice();
		assertEquals(op.addition(2, 3), 5);
	}
	
	@Test
	public void testMain(){		    	
			System.out.println("Test démarré");
		
			PrintStream originOut = System.out;
			//Sortie en erreur 
			StringBuffer sb = new StringBuffer();
		    sb.append("City");
	   
	        
	        String expectedString = sb.toString();

	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));
	        String[] args = {};
	        Main.main(args);          
	       
	        assertEquals(expectedString, outContent.toString());            
	        
	        System.setOut(originOut);
	        System.out.println("Test fini");
	        
	        Main m = new Main();
	        assertEquals(m.getClass().getSimpleName(), "Main");
  }
}
