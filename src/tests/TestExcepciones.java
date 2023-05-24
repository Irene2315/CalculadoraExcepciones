package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import clases.Calculator;

class TestExcepciones {

	private static Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	
		calculator = new Calculator();
	
		
	}
	
	@Test
	@DisplayName("Dividir entre 0")
	void testDivideZero() {
	    IllegalArgumentException e = assertThrows( IllegalArgumentException.class, () -> {
	    	calculator.divide(1, 0);
	    });
	}
	
}
