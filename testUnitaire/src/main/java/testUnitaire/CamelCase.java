package testUnitaire;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {
	public static String camelCase(String str) {
		
		if(str instanceof String) {
			
			if(str.length() > 0) {
				
				String illegalExpression = "([@~:;,!])";
				str = str.replaceAll(illegalExpression,"");
								
				//Si tout est en majuscules on repasse tout en minuscule
				String regExpAllUpperCase = "([A-Z|0-9]{"+str.length()+"})";
				Pattern p = Pattern.compile(regExpAllUpperCase);
				Matcher m = p.matcher(str);
				if(m.find()) {
			       str = str.toLowerCase();
			    }
				
				//Première lettre en majascule
				if(str.substring(0,1) != null) {
					str = str.substring(0,1).toUpperCase() + str.substring(1,str.length());
				}
				
				
				//Si 2 lettres en majuscules se suivent
				String regExpAll2ConsecutivesUpperCase = "([A-Z]{2,})";
				Pattern p1 = Pattern.compile(regExpAll2ConsecutivesUpperCase);
				Matcher m1 = p1.matcher(str);
				String strReplaced; 
				String strToReplace;
				while (m1.find()) { 					
					strToReplace 	=	m1.group();
					strReplaced 	=	strToReplace.substring(0,1).toUpperCase();
					strReplaced		+=	strToReplace.substring(1,strToReplace.length()).toLowerCase();
					str = str.replaceAll(strToReplace, strReplaced);
				}
				
				String[] specialCharacters = {" ","-","_"};
				
				for(String c : specialCharacters) {					
					String newStr = "";					
					String[] listWords = str.split(c);										
					for(String word : listWords) {
						newStr += word.substring(0,1).toUpperCase()+ word.substring(1,word.length());;
					}					
					str = newStr;
				}				
			}
		}
		
		return str;
	}
}
