package server;

import java.util.ArrayList;

public class Personnes {
	
	private ArrayList<String> list;
	
	public Personnes(ArrayList<String> list) {
		this.setList(list);
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}
}
