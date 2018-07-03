package testUnitaire;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CamelCaseTest {

	@Test	
	public void shouldReturnNullFromNull() {
		assertEquals(null,CamelCase.camelCase(null));
	}
	
	@Test	
	public void shouldReturnEmptyStringFromEmptyString() {
		assertEquals("",CamelCase.camelCase(""));
	}
	
	@Test
	public void shouldReturnSameStringFromCamelCaseString() {
		String str = "String";
		assertEquals(str,CamelCase.camelCase(str));
	}
	
	@Test
	public void shouldReturnCamelCaseStringFromNonCamelCaseString() {
		String str = "string";
		assertEquals("String",CamelCase.camelCase(str));
	}
	
	@Test
	public void shouldReturnCamelCaseStringFromNonCamelCaseStringWithSpecialCaracters() {
		String str = "string_ut_popo-hdh popo";
		assertEquals("StringUtPopoHdhPopo",CamelCase.camelCase(str));
	}
	
	@Test
	public void shouldReturnCamelCaseStringFromNonCamelCaseStringWithSpecialCaractersAndIllegalCharacters() {
		String str = "st;rin;;g_ut_po:po-h!dh pop@~o";
		assertEquals("StringUtPopoHdhPopo",CamelCase.camelCase(str));
	}
	
	@Test
	public void shouldReturnCamelCaseFromAllUpperCases() {
		String str = "ABCDEF073384";
		assertEquals("Abcdef073384",CamelCase.camelCase(str));
	}
	
	@Test
	public void shouldReturnCamelCaseFromCamelCaseWord() {
		String str = "camelCaseWord";
		assertEquals("CamelCaseWord",CamelCase.camelCase(str));
	}
	
	@Test
	public void shouldReturnCamelCaseFromSeverelUpperCaseLetters() {
		String str = "nonCameLCasEWord";
		assertEquals("NonCameLcasEword",CamelCase.camelCase(str));
	}
	
	
}
