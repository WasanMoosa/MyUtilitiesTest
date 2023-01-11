package MyUtilitiesTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PowerCalculationTest {

	@Test
	@DisplayName ("base: 0, exponent: 0")
	void test1() {
		PowerCalculation powerCalculation= new PowerCalculation();
		HashMap<String, Integer> power = new HashMap<>();
		Integer base=0;
		Integer exponent=0;
		power.put("base", base);
		power.put("exponent", exponent);
		power.put("result", 1);
		assertEquals(power, powerCalculation.powerFunction(base, exponent));
		
	}
	
	@Test
	@DisplayName ("base: 0, exponent: 0")
	void test2() {
		PowerCalculation powerCalculation= new PowerCalculation();
		HashMap<String, Integer> power = new HashMap<>();
		Integer base=null;
		Integer exponent=null;
		power.put("base", base);
		power.put("exponent", exponent);
		power.put("result", 1);
		assertNull(powerCalculation.powerFunction(base, exponent));
	}
	

	@Test
	@DisplayName ("base: <any positive number>, exponent <any positive number>")
	void test3() {
		PowerCalculation powerCalculation= new PowerCalculation();
		HashMap<String, Integer> power = new HashMap<>();
		Integer base=2;
		Integer exponent=3;
		power.put("base", base);
		power.put("exponent", exponent);
		power.put("result", 8);
		assertEquals(power, powerCalculation.powerFunction(base, exponent));
	}

}
