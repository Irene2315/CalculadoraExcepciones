package tests;



import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import clases.Calculator;




class TestParametros {
	private static Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	
		calculator = new Calculator();
	
		
	}
	
	
	@ParameterizedTest
	
	@DisplayName("Test suma")
	@CsvSource({"2,3,5","-1,5,4","0,0,0"})
	void testAddParametros(int valor1,int valor2,int esperado) {
		int result = calculator.add(valor1, valor2);
		Assert.assertEquals(result, esperado);
	}
	
	@ParameterizedTest
	@DisplayName("Test resta")
	@CsvSource({"3,1,2","4,2,2", "0,0,0"})
	void testSubtract(int valor1,int valor2,int esperado  ) {
		int result = calculator.subtract(valor1, valor2);
		Assert.assertEquals(result, esperado);
	}
	
	@ParameterizedTest
	@DisplayName("Test multiplicacion")
	@CsvSource({"1,2,2","2,2,4","0,1,0"})
	void testMultiply(int valor1,int valor2,int esperado ) {
		int result = calculator.multiply(valor1, valor2);
		Assert.assertEquals(result, esperado);
		
	}
	
	
	
	@ParameterizedTest
	@DisplayName("Test division")
	@CsvSource({"4,2,2","6,2,3","12,2,6"})
	void testDivision(int valor1,int valor2,double esperado ) {
		double result = calculator.divide(valor1, valor2);
		Assert.assertEquals(result, esperado, 0);
	}
}
