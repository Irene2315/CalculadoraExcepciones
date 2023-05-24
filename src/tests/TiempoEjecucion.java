package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TiempoEjecucion {

	@Test
	@DisplayName("Tiempo ejecucion")
	void asercionTimeout() {		
		
		assertTimeout(Duration.ofSeconds(2), () -> {
			Thread.sleep(5000);
		});
				
	}
}
