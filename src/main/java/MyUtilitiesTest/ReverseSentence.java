package MyUtilitiesTest;

public class ReverseSentence {
	/**
	 * This Function take sentence and reverse it .
	 * 
	 * @return string of reversed sentence
	 */
	public static String reverse(String sentence) {
		String result = "";
		if (sentence == null) {
			return null;
		}
		for (int i = sentence.length() - 1; i >= 0; i--) {
			result = result + sentence.charAt(i);

		}

		return result;

	}
}
