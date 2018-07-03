package testUnitaire;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void shouldReturnEmptyStringWithAllZero() {
		String str = "";
		assertEquals(str, FizzBuzz.fizzBuzz(0, 0));
	}
	
	@Test
	public void shouldReturnEmptyStringWithInvertIndex() {
		String str = "";
		assertEquals(str, FizzBuzz.fizzBuzz(10, 0));
	}
	
	@Test
	public void shouldReturnStringWithOneMultipleOf3() {
		String str = "12Fizz";
		assertEquals(str, FizzBuzz.fizzBuzz(1, 3));
	}
	
	@Test
	public void shouldReturnStringWithOneMultipleOf3And5() {
		String str = "12Fizz4Buzz";
		assertEquals(str, FizzBuzz.fizzBuzz(1, 5));
	}
	
	@Test
	public void shouldReturnStringWithOneMultipleOf3And5And15() {
		String str = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
		assertEquals(str, FizzBuzz.fizzBuzz(1, 15));
	}
}