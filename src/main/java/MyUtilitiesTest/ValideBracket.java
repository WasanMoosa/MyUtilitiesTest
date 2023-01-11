package MyUtilitiesTest;

import java.util.ArrayList;
import java.util.Stack;
import java.util.function.Consumer;

public class ValideBracket {

	/**
	 * This method takes input of string that has parentheses and check if all
	 * parentheses, square brackets and braces are balanced or no.
	 */
	public static boolean validParantheses(String sentence) {
		Stack<Character> braces = new Stack<>();
		Stack<Character> parentheses = new Stack<>();
		Stack<Character> squareBrackets = new Stack<>();
		boolean validity = false;
		Boolean stop = false;
		Boolean stopIterate = false;


			for (int i = 0; i < sentence.length() && !stop; i++) {

				if (sentence.charAt(i) != '(' && sentence.charAt(i) != '[' && sentence.charAt(i) != '{'
						&& sentence.charAt(i) != ')' && sentence.charAt(i) != ']' && sentence.charAt(i) != '}') {
					stopIterate = true;
				}

				if (!stopIterate) {
					// Pushing parentheses, square brackets and braces inside stack
					if (sentence.charAt(i) == '(') {
						parentheses.push(sentence.charAt(i));
					}

					if (sentence.charAt(i) == '[') {
						squareBrackets.push(sentence.charAt(i));
					}

					if (sentence.charAt(i) == '{') {
						braces.push(sentence.charAt(i));
					}

					// Pulling parentheses, square brackets and braces from stack
					if (sentence.charAt(i) == '}') {
						if (braces.empty()) {
							System.out.print("InValid");
							stop = true;
						} else {
							braces.pop();
						}
					}
					if (sentence.charAt(i) == ']') {
						if (squareBrackets.empty()) {
							System.out.print("InValid");
							stop = true;
						} else {
							squareBrackets.pop();
						}
					}
					if (sentence.charAt(i) == ')') {
						if (parentheses.empty()) {
							System.out.print("InValid");
							stop = true;
						} else {
							parentheses.pop();
						}
					}

				}
			}

			// Check validation
			if (!stop) {
				if (braces.empty() && squareBrackets.empty() && parentheses.empty()) {
					validity=true;
				} else {
					validity=false;
				}
			}
		
		return validity;
	}

}
