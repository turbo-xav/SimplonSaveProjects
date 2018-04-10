package curl;

import java.io.*;
import java.net.*;
 
public class Curl {
 	
	
  public static void main(String[] args) throws IOException {
 
	  BufferedReader reader = null;
	  for(int i = 0 ; i < 10000 ; i++) {
		  URL url = new URL("http://127.0.0.1:9092/impossible");
	      reader = new BufferedReader(new InputStreamReader(url.openStream()));
		  String line;
	      while ((line = reader.readLine()) != null) {
	         System.out.println(line);
	      }
	  }
      reader.close();
 
    
 
   
 
  }
 
}