package MyUtilitiesTest;

import java.util.ArrayList;

public class ReverseDelimeter {
	/**
	 * This function reverse without using .split.
	 */

	public static ArrayList<String> meSplite(String str, Character charct) {
		ArrayList<String> wordArrayList = new ArrayList<>();
		ArrayList<String> wordArrayReverseList = new ArrayList<>();
		String word = "";
		if (str != null && charct != null) {
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != charct) {
				word = word + str.charAt(i);
			}
			if (str.charAt(i) == charct || i == str.length() - 1) {
				wordArrayList.add(word);
				word = "";
			}
		}
		for (int j = wordArrayList.size() - 1; j >= 0; j--) {
			wordArrayReverseList.add(wordArrayList.get(j));

		}
		}
		return wordArrayReverseList;
	}
}
