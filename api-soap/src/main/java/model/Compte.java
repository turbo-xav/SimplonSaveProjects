package model;

import java.util.Date;
import javax.xml.bind.annotation.*;

public class Compte {
	
	public Compte(int code, Date date) {
		this.code = code;
		this.date = date;
	}
	
	private int code;
	private Date date;
}
