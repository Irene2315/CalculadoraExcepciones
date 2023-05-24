package tests;



import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import clases.Calculator;

class TestParametrosFicheros {

	private static Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	
		calculator = new Calculator();
	
		
	}
	
	
	@ParameterizedTest
	
	@DisplayName("Test suma")
	@CsvFileSource(resources = "/valoresSum.csv")
	void testAddParametros(int valor1,int valor2,int esperado) {
		int result = calculator.add(valor1, valor2);
		Assert.assertEquals(result, esperado);
	}
	
	@ParameterizedTest
	@DisplayName("Test resta")
	@CsvFileSource(resources = "/valoresResta.csv")
	void testSubtract(int valor1,int valor2,int esperado  ) {
		int result = calculator.subtract(valor1, valor2);
		Assert.assertEquals(result, esperado);
	}
	
	
	@ParameterizedTest
	@DisplayName("Test multiplicacion")
	@CsvFileSource(resources = "/valoresMult.csv")
	void testMultiply(int valor1,int valor2,int esperado ) {
		int result = calculator.multiply(valor1, valor2);
		Assert.assertEquals(result, esperado);
		
	}
	
	
	
	@ParameterizedTest
	@DisplayName("Test division")
	@CsvFileSource(resources = "/valoresDivi.csv")
	void testDivision(int valor1,int valor2,double esperado ) {
		double result = calculator.divide(valor1, valor2);
		Assert.assertEquals(result, esperado, 0);
	}
	
	
	
}
