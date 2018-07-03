package testUnitaire;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SmileysTest {

	@Test
	public void ShlouldReturn0SmileysFromNull() {
		assertEquals(0, Smileys.countSmileys(null) );
	}
	
	@Test
	public void ShlouldReturn0SmileysFromVoidList() {
		List<String> myList = new ArrayList<String>();
		assertEquals(0, Smileys.countSmileys(myList));
	}
	
	@Test
	public void ShlouldReturn0SmileysFromSingleWrongSmileysList() {
		List<String> myList = new ArrayList<String>();
		myList.add(")");
		assertEquals(0, Smileys.countSmileys(myList) );
	}
	
	@Test
	public void ShlouldReturn1SmileysFromSingleGoodSmileysList() {
		List<String> myList = new ArrayList<String>();
		myList.add(":)");
		assertEquals(1, Smileys.countSmileys(myList) );
	}
	
	@Test
	public void ShlouldReturn9SmileysFromWrongAndRightSmileysList() {
		List<String> myList = new ArrayList<String>();
		
		//Good
		myList.add(":)");
		myList.add(":-)");
		myList.add(":~)");
		myList.add(";)");
		myList.add(";-)");
		myList.add(";~)");
		myList.add(":D");
		myList.add(":-D");
		myList.add(":~D");
		
		//Wrong
		myList.add(")");
		assertEquals(9, Smileys.countSmileys(myList) );
	}
	
}
