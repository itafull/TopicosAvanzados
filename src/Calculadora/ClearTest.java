package Calculadora;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClearTest {

	@Test
	public void TestClear1() {
	 Calculadora calc= new Calculadora();
	 int resultado = calc.Clear(12);
	 /* si el numero guardo fue positivo
	  * lo serializa*/
	 int esperado = 0;
	 assertEquals(esperado, resultado);
	}
	@Test
	public void TestClear2() {
	 Calculadora calc= new Calculadora();
	 int resultado = calc.Clear(-12);
	 /*si el numero es negativo lo serealiza */
	 int esperado = 0;
	 assertEquals(esperado, resultado);
	}
	@Test
	public void TestClear3() {
	 Calculadora calc= new Calculadora();
	 int resultado = calc.Clear(0);
	 /*si el numero es cero lo serealiza */
	 int esperado = 0;
	 assertEquals(esperado, resultado);
	}
}
