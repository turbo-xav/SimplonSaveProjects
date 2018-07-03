package testUnitaire;

import java.util.List;

public class Smileys {
	
	public static int countSmileys(List<String> arr) {
		// Counter
	    int smilingFaces = 0;
	    
	    if( arr instanceof List ){	    
		    // List analysis
		    for (String face : arr) {
		      // If smiley is smiling then counter++
		      if (matchesSmiley(face))
		        smilingFaces++; 
		    }
	    }
	    return smilingFaces;
	}
	
	private static boolean matchesSmiley(String input) {
	    return input.matches("[:;][-~]?[\\)D]");
	  }
}
