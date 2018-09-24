package Calculadora;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DividirTest {

	@Test
	public void TestDividir1() {
		Calculadora calc= new Calculadora();
		double resultado = calc.Dividir(3, 2);
		double esperado = 1.5; 
		assertTrue(esperado == resultado);
		/*divide dos numeros positivos,
		 * se espera resultado positivo*/
		System.out.println(" 3 / 2 :");
		System.out.println("divide "+resultado);
		
		
		}
	@Test
	public void TestDividir2() {
		Calculadora calc= new Calculadora();
		double resultado = calc.Dividir(-3, -2);
		double esperado = 1.5;
		assertTrue(esperado == resultado);
		/*divide dos numeros negativos, 
		 * se espera resultado positivo*/
		System.out.println("(-3)/(-2)");
		System.out.println("divide "+resultado);
		
		
		}
	@Test
	public void TestDividir3() {
		Calculadora calc= new Calculadora();
		double resultado = calc.Dividir(3, -2);
		double esperado = -1.5;
		assertTrue(esperado == resultado);
		/* se divide un numero positivo y un negativo
		 * se espera resultado negativo*/
		System.out.println("Dividir un numero positivo y un numero negativo 3/(-2)");
		System.out.println("divide "+resultado);
		

		}
	@Test
	public void TestDividir4() {
		Calculadora calc= new Calculadora();
		String resultado = calc.DividirCero(7, 0);
		String esperado = "Math ERROR";
		assertTrue(esperado == resultado);
		
	}
	@Test
	public void TestDividir5() {
		Calculadora calc= new Calculadora();
		String resultado = calc.DividirCero(0, 7);
		String esperado = "0";
		assertTrue(esperado == resultado);
		
	}
	@Test
	public void TestDividir6() {
		Calculadora calc= new Calculadora();
		String resultado = calc.DividirCero(0, 0);
		String esperado = "Math ERROR";
		assertTrue(esperado == resultado);
		
	}
}
