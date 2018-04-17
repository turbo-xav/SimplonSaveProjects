package com.thejavageek;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType
public class Personne {
	@XmlElement(name = "name")
	  private final String name = "toto";
}