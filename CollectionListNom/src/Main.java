import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis();
		
		TreeSet<String> listSet1 = new TreeSet<String>();
		TreeSet<String> listSetFinal = new TreeSet<String>();
		
		try
		{
		    File f1 = new File ("wealth.txt");
		    File f2 = new File ("ethics.txt");
		    FileReader fr1 = new FileReader (f1);
		    BufferedReader br1 = new BufferedReader (fr1);		   
		    
		    FileReader fr2 = new FileReader (f2);
		    BufferedReader br2 = new BufferedReader (fr2);
		    
		    try
		    {
		        String line;
		        line = br1.readLine();
		 
		        while (line != null) {   
		        	listSet1.add(line);		        	
		            line = br1.readLine();
		        }
		        
		        String line2;
		        line2 = br2.readLine();
		        while (line2 != null) {   
		        	
		        	if(listSet1.contains(line2)) {
		        		listSetFinal.add(line2);
		        	}
		        	
		            line2 = br2.readLine();
		        }
		        
		        br1.close();
		        fr1.close();		        
		        br2.close();
		        fr2.close();
		    }
		    catch (IOException exception) {
		        System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
		    }
		
			for(String elt : listSetFinal) {
				System.out.println(elt);
			}
		}
		catch (FileNotFoundException exception) {
		    System.out.println ("Le fichier n'a pas été trouvé");
		}
		
		System.out.println("Nb d'éléments communs = "+listSetFinal.size());
		System.out.println("Temps d'éxécution = "+(System.currentTimeMillis()-debut)+" ms");
		System.out.println("Fin");

	}

}
