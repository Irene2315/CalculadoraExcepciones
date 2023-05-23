package tests;




import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest2 {

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.out.println("al principio de todo");
		
	
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("Antes de todo ");
		
	}

	@BeforeEach
	void setUp() throws Exception {
		
		System.out.println("Antes de cada");
	}

	@AfterEach
	void tearDown() throws Exception {
		
		System.out.println("Antes de cada ");
	}

	@Test
	void test() {
		System.out.println("test ");
	}

}
