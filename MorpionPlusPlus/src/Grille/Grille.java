package Grille;

import java.util.TreeMap;

public abstract class Grille extends GrilleElement{
	
	public abstract void draw();
	public abstract TreeMap<Integer,TreeMap<Integer, Case>> getDiagonals();

}
