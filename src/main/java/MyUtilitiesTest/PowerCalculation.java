package MyUtilitiesTest;

import java.util.HashMap;

public class PowerCalculation {
	
	/**
	 * This Function take Hashmaps for exponential.
	 * 
	 * @return HashMap
	 */
	public static HashMap<String, Integer> powerFunction(Integer base, Integer exponent) {
		HashMap<String, Integer> power = new HashMap<>();
		power.put("base", base);
		power.put("exponent", exponent);
		power.put("result", 1);
		
		if ( base ==null || exponent == null) {
			return null;
		}
		for (int i = 0; i < power.get("exponent"); i++) {
			power.put("result", power.get("result") * power.get("base"));

		}

		return power;
	}

}
