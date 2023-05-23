package tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Calculator;

class CalculatorTest {
	
	private static Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	
		calculator = new Calculator();
	
		
	}
	@Test
	void testAdd() {
		int resultado = calculator.add(3, 4);
		
		assertEquals(7,resultado);
	}

	@Test
	void testSubtract() {
		int resultado = calculator.subtract(3, 4);
		
		assertEquals(-1,resultado);
	}

	@Test
	void testMultiply() {
		int resultado = calculator.multiply(3, 4);
		
		assertEquals(12,resultado);
	}

	@Test
	void testDivide() {
double resultado = calculator.divide(4, 4);
		
		assertEquals(1,resultado);
	}

}
