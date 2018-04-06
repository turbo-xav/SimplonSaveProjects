public class Rectangle implements Figure {

	
	private int width = 0;
	
	private int height = 0;
	
	
	public Rectangle(int w, int h) {
		this.setWidth(w);
		this.setHeight(h);
		System.out.println( " - Largeur : "+width+" Hauteur : "+height );
	}
	
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" __");
		System.out.println("|__|");
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}




	

}
