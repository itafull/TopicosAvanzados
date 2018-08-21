import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {

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
	   public void RestaPositivos() {
	      System.out.println("Sumando dos números positivos ...");
	       Resta r = new Resta(2, 3);
	       assertTrue(r.restar() == -1);
	   }

	   @Test
	   public void RestaNegativos() {
	       System.out.println("Sumando dos números negativos ...");
	       Resta r = new Resta(-2, -3);
	       assertTrue(r.restar() == 1);
	   }

	   @Test
	   public void RestaPositivoNegativo() {
	       System.out.println("Sumando un número positivo y un número negativo ...");
	       Resta r = new Resta(2, -3);
	       assertTrue(r.restar() == 5);
	   }
	} 



