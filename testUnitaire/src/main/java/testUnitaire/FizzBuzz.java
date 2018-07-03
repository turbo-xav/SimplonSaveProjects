package testUnitaire;

public class FizzBuzz {
	
	
	public static String fizzBuzz(int min, int max) {
		
		String strToReturn = "";
		
		if(max > 0 && min <= max) {
			for(int i = min ; i <= max ; i++) {
				if(i%15 == 0) {
					strToReturn += "FizzBuzz";
				}
				else if(i%5 == 0) {
					strToReturn += "Buzz";
				}
				else if(i%3 == 0) {
					strToReturn += "Fizz";
				}
				
				else {
					strToReturn += i;
				}
				
			}
		}		
		
		return strToReturn;		
	}
}
