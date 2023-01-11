/**
 * 
 */
package MyUtilitiesTest;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author TRA0004
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOddFunction(null);

	}
	/**
	 * This Function take the array of integers, process it and produce HashMap that
	 * includes even and odd arrays
	 * 
	 * @return HashMap
	 */
	public static HashMap<String, ArrayList<Integer>> evenOddFunction(Integer[] inputarray) {
		if (inputarray==null) {
			return null;
		}
		HashMap<String, ArrayList<Integer>> evenOdd = new HashMap<>();
		ArrayList<Integer> evenArrayList = new ArrayList<>();
		ArrayList<Integer> oddArrayList = new ArrayList<>();
		int temp = 2;

		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] % temp == 0) {
				evenArrayList.add(inputarray[i]);
			} else {
				oddArrayList.add(inputarray[i]);

			}
			evenOdd.put("even", evenArrayList);
			evenOdd.put("odd", oddArrayList);

		}

		return evenOdd;
	}

}
