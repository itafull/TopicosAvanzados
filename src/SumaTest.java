import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	   public void sumaPositivos() {
	      System.out.println("Sumando dos números positivos ...");
	       Suma S = new Suma(2, 3);
	       assertTrue(S.sumar() == 5);
	   }

	   @Test
	   public void sumaNegativos() {
	       System.out.println("Sumando dos números negativos ...");
	       Suma S = new Suma(-2, -3);
	       assertTrue(S.sumar() == -5);
	   }

	   @Test
	   public void sumaPositivoNegativo() {
	       System.out.println("Sumando un número positivo y un número negativo ...");
	       Suma S = new Suma(2, -3);
	       assertTrue(S.sumar() == -1);
	   }
	} 


