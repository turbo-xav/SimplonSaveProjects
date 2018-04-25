package client;

import java.util.ArrayList;

public class Personne {

    private String name;

    private ArrayList<String> list;
    
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }
    
    public ArrayList<String> getList(){
		return this.list;
	}

}
