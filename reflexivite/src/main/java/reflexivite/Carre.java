package reflexivite;


public class Carre extends Rectangle {

	public void draw() {
		System.out.println(" _");
		System.out.println("|_|");	
	}
	
	public Carre(int l) {
		super(l,l);				
	}
	
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);		
	}
	
	public void setHeight(int height) {
		this.setWidth(height);		
	}

}
