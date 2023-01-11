package MyUtilitiesTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EvenOddTest {

	@DisplayName("empty array as an argument.")
	@Test
	void test1() {
		EvenOdd evenOdd = new EvenOdd();
		Integer[] inputarray = new Integer[] {};
		HashMap<String, ArrayList<Integer>> evenOddResult = new HashMap<>();
		ArrayList<Integer> evenArrayList = new ArrayList<>();
		ArrayList<Integer> oddArrayList = new ArrayList<>();
		assertEquals(evenOddResult, evenOdd.evenOddFunction(inputarray));
	}

	@DisplayName("array with all even numbers.")
	@Test
	void test2() {
		EvenOdd evenOdd = new EvenOdd();
		Integer[] inputarray = { 2, 8, 6, 4 };
		HashMap<String, ArrayList<Integer>> evenOddResult = new HashMap<>();
		ArrayList<Integer> evenArrayList = new ArrayList<>();
		ArrayList<Integer> oddArrayList = new ArrayList<>();
		evenArrayList.add(2);
		evenArrayList.add(8);
		evenArrayList.add(6);
		evenArrayList.add(4);
		evenOddResult.put("even", evenArrayList);
		evenOddResult.put("odd", oddArrayList);
		assertEquals(evenOddResult, evenOdd.evenOddFunction(inputarray));
	}

	@DisplayName("array with all odd numbers.")
	@Test
	void test3() {
		EvenOdd evenOdd = new EvenOdd();
		Integer[] inputarray = { 1, 3, 5, 7 };
		HashMap<String, ArrayList<Integer>> evenOddResult = new HashMap<>();
		ArrayList<Integer> evenArrayList = new ArrayList<>();
		ArrayList<Integer> oddArrayList = new ArrayList<>();
		oddArrayList.add(1);
		oddArrayList.add(3);
		oddArrayList.add(5);
		oddArrayList.add(7);
		evenOddResult.put("even", evenArrayList);
		evenOddResult.put("odd", oddArrayList);

		assertEquals(evenOddResult, evenOdd.evenOddFunction(inputarray));
	}

	@DisplayName("array with mixed even and odd numbers.")
	@Test
	void test4() {
		EvenOdd evenOdd = new EvenOdd();
		Integer[] inputarray = { 1, 2, 3, 8, 4, 5, 7 };
		HashMap<String, ArrayList<Integer>> evenOddResult = new HashMap<>();
		ArrayList<Integer> evenArrayList = new ArrayList<>();
		ArrayList<Integer> oddArrayList = new ArrayList<>();
		oddArrayList.add(1);
		oddArrayList.add(3);
		oddArrayList.add(5);
		oddArrayList.add(7);
		evenArrayList.add(2);
		evenArrayList.add(8);
		evenArrayList.add(4);
		evenOddResult.put("even", evenArrayList);
		evenOddResult.put("odd", oddArrayList);

		assertEquals(evenOddResult, evenOdd.evenOddFunction(inputarray));
	}

	@DisplayName("null as an argument, instead of an array.")
	@Test
	void test5() {
		EvenOdd evenOdd = new EvenOdd();
		Integer[] inputarray = null;
		assertNull(inputarray);

	}

}
