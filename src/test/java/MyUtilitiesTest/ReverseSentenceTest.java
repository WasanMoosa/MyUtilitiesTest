package MyUtilitiesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseSentenceTest {

	@Test
	@DisplayName ("Take null as an argument.")
	void test1() {
	ReverseSentence reverseSentence = new ReverseSentence();
	assertEquals(null, reverseSentence.reverse(null));
	}
	
	@Test
	@DisplayName ("Take an empty string as as argument.")
	void test2() {
	ReverseSentence reverseSentence = new ReverseSentence();
	assertEquals("", reverseSentence.reverse(""));
	}
	@Test
	@DisplayName ("Take a string with only a single character.")
	void test3() {
	ReverseSentence reverseSentence = new ReverseSentence();
	assertEquals("s", reverseSentence.reverse("s"));
	}

}
