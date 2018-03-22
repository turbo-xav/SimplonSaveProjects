package palindrome;

public class Sapin {

	private int hauteur = 0;
	
	public Sapin() {
		// TODO Auto-generated constructor stub
		System.out.println("Sapinhhhhhh !!");
	}
	
	public void setHauteur(int h)
	{
		hauteur = h;		
	}
	
	public void draw() {
		int nbMaxSquares = 2 * hauteur - 1;
		String sapinDraw = "";
		System.out.println(nbMaxSquares);
		for(int i = 1 ; i <= hauteur + 1 ; i++) {
			
			int nbSquares = 2 * i - 1;
			
			if( i ==  hauteur + 1 )
			{
				nbSquares = 2 * (i - 2) - 1;				
			}	
			int nbSpaces  =  (nbMaxSquares - nbSquares) / 2;
			
			for(int j = 0 ; j < nbSpaces; j ++)
			{
				sapinDraw += " ";	
			}
			for(int j = 0 ; j < nbSquares; j ++)
			{
				sapinDraw += "#";	
			}
			
			for(int j = 0 ; j < nbSpaces; j ++)
			{
				sapinDraw += " ";	
			}
			sapinDraw += "\n";
		}
		
		System.out.println(sapinDraw);
		
		
		
	}
}
