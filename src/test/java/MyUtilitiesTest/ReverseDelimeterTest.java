package MyUtilitiesTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseDelimeterTest {

	@Test
	@DisplayName("Take null for both of the arguments.")
	void test1() {
		ArrayList<String> wordArrayList = new ArrayList<>();
		ReverseDelimeter reverseSentence = new ReverseDelimeter();
		assertEquals(wordArrayList, reverseSentence.meSplite(null, null));
	}

	@Test
	@DisplayName("Take an empty string as the first argument.")
	void test2() {
		ArrayList<String> wordArrayList = new ArrayList<>();
		ReverseDelimeter reverseSentence = new ReverseDelimeter();
		assertEquals(wordArrayList, reverseSentence.meSplite("", ' '));
	}

	@Test
	@DisplayName("Take an empty string as the second argument.")
	void test3() {
		ArrayList<String> wordArrayList = new ArrayList<>();
		ReverseDelimeter reverseSentence = new ReverseDelimeter();
		wordArrayList.add("moosa");
		wordArrayList.add("wasan");
		assertEquals(wordArrayList, reverseSentence.meSplite("wasan moosa", ' '));
	}

	@Test
	@DisplayName("Return an empty array.")
	void test4() {
		ArrayList<String> wordArrayList = new ArrayList<>();
		ReverseDelimeter reverseSentence = new ReverseDelimeter();
		assertEquals(wordArrayList, reverseSentence.meSplite("", null));
	}

}
