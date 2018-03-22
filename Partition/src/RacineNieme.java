
public class RacineNieme {

	public static void main(String[] args) {
		
		int n = 3;
		double nb = 27;
		
		double valMin = 0;
		double valMax = nb;
		
		double milieu = (valMin + valMax) / 2;				
		double val = calcPowN( milieu, n );
			
		int j = 0;
		
		while(val != nb && j < 100)
		{		
			val = calcPowN( milieu, n );
			if(val <= nb)
			{				
				valMin = milieu;				
			}
			else
			{
				valMax = milieu;
			}	
			
			milieu = (valMin + valMax) / 2;		
				
			j++;
		}	
		
		System.out.println("Racine trouvée : "+milieu);	
		System.out.println("Nombre trouvé : "+ Math.round(Math.pow(milieu, n)));
		System.exit(0);
	}
	
	public static double calcPowN(double val, int n)
	{
		return Math.pow(val, n);		
	}

}
