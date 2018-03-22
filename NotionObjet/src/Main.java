import java.util.Arrays;
import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		/*int[] a1 = {1,2};
		int[] a2 = {1,2,3};
		printArrays(a1,a2);*/
		
		/*Personne p1 = new Personne("Checa", "David", 37);
		Personne p2 = new Personne("Checa", "David", 37);
		Personne p3 = p1;
		Class c = Class.forName("Personne");
		System.out.println(c.getName());
		System.out.println(p1.equals(p2));*/
		
		/*int[][] data = new int[2][];
		
		for(int i = 0 ; i < data.length ; i++) {
			data[i] = new int[3];
			for(int j = 0 ; j < data[i].length ; j++) {
				Random random = new Random();
				data[i][j] = random.nextInt(10);
			}
		}
		int[][] dataRef = data;
		int[][] deepCopy = deepCopy(data);
		int[][] supCopy = supCopy(data);
		
		System.out.println("dataRef"+dataRef[0]);		
		System.out.println("deepCopy"+deepCopy[0]);
		System.out.println("supCopy"+supCopy[0]);
		
		
		System.out.println(data.equals(dataRef));		
		System.out.println(data.equals(deepCopy));
		System.out.println(data.equals(supCopy));
		*/
		
		/*
		ProgrammingPair pair;
		pair = new ProgrammingPair();
		pair.setDriver(new Personne("Checa", "Drive", 38));
		pair.setProgramming(new Personne("Tagliarino", "Xavier", 38));
		
		ProgrammingPair other;
		other = new ProgrammingPair();
		other.setDriver(pair.getDriver());
		other.setProgramming(pair.getProgramming());
		
		ProgrammingPair another;
		another =  new ProgrammingPair(pair);
		*/	
		
		char[][] screen= initializedArray2D(' ',initializedArray(' ', 10), 10);
        for(int i= 0; i != Math.min(screen.length, screen[0].length); ++i){
            
        	screen[i][i]='X';
           screen[screen.length-i-1][i]='X';
        }
        display(screen);
        
        
        Stone[][] screen1= initializedArray2D(initializedArray(new Stone(false), 10), 10);
        for(int i= 0; i != Math.min(screen1.length, screen1[0].length); ++i){
            screen1[i][i].setFirstPlayer(true);
            screen1[screen1.length-i-1][i].setFirstPlayer(true);
        }
        display(screen1);
        
		
		System.out.println("fin");
		
	}
	
	public static int[][] supCopy(int[][] tab){
		int[][] result = new int[tab.length][];
		for(int i = 0 ; i < tab.length ; i++) {
			result[i] = tab[i];
		}
		return result;
	}
	
	public static int[][] deepCopy(int[][] tab){
		int[][] result = new int[tab.length][];
		
		for(int i = 0 ; i < tab.length ; i++) {
			result[i] = new int[tab[i].length];
			for(int j = 0 ; j < tab[i].length ; j++) {
				result[i][j] = tab[i][j];
			}
		}
		
		return result;
	}
	
	public static void printArrays(int[] aa1, int[] aa2) {
		if(aa1.length < aa2.length) {
			int [] atemp = aa1;
			aa1 = aa2;
			aa2 = atemp;
			}
		
		printArray(aa1);
		printArray(aa2);		
		System.out.println(comparer(aa1,aa2)?"Yes !!":"No !!");		
	}
	
	public static void printArray(int[] a) {
		String str = "";
		for(int i = 0 ; i < a.length ; i++) {
			str += a[i];
		}
		System.out.println(str);
	}
	
	public static boolean comparer(int [] a1, int [] a2) {
		return Arrays.equals(a1, a2);
	}
	
	public static char[] initializedArray(char c, int nb){
        char[] res= new char[nb];
        for(int i=0; i != res.length; ++i){
            res[i]= c;
        }
        return res;
    }
	
	 public static char[][] initializedArray2D(char car, char[] arr, int nb){
	        char[][] res= new char[nb][];
	        for(int i=0; i != res.length; ++i){
	        	res[i] = initializedArray(car, nb);        	
	        }
	        return res;
	    }
	 
	 public static void display(char[][] arr2D){
	        for(char[] row : arr2D){
	            for(char c : row){
	                System.out.print(c);
	            }
	            System.out.println();
	        }
	    }
	 
	 
	 public static Stone[] initializedArray(Stone s, int nb){
         Stone[] res= new Stone[nb];
         for(int i=0; i != res.length; ++i){             
        	 res[i]= new Stone();
         }
         return res;
   }
   public static Stone[][] initializedArray2D(Stone[] arr, int nb){
         Stone[][] res= new Stone[nb][];
         for(int i=0; i != res.length; ++i){
             res[i]= initializedArray(arr[i], nb);
         }
         return res;
   }
   
   public static void display(Stone[][] board){
       for(Stone[] row : board){
           for(Stone c : row){
               System.out.print(c);
           }
           System.out.println();
       }
 }
	 
	 

}
