package MyUtilitiesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValideBracketTest {

	@Test
	@DisplayName (" Take null  as an arguments.")
	void test1() {
		ValideBracket valideBracket = new ValideBracket();
		assertThrows(NullPointerException.class,()-> valideBracket.validParantheses(null));
	}
	
	
	@Test
	@DisplayName (" Take an empty string as an argument.")
	void test2() {
		ValideBracket valideBracket = new ValideBracket();
		assertEquals(true, valideBracket.validParantheses(""));
	}
	
	@Test
	@DisplayName ("Can throw an exception.")
	void test3() throws Exception{
		ValideBracket valideBracket = new ValideBracket();
		assertThrows(NullPointerException.class,()-> valideBracket.validParantheses(null));
	}



}
