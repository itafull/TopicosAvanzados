package Calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*al ser la suma conmutativa no necesito
 * conmutar los valores da los mismos resultados*/
class SumarTest {

	@Test
	public  void TestSumar1() { 
		Calculadora calc= new Calculadora();
		int resultado = calc.Sumar(2, 3);
		int esperado = 5;
		assertEquals(esperado,resultado);
		/*sumamos dos numeros positivo,
		 * se espera resultado positivo*/
		System.out.println(" (2+3) "); 
		System.out.println("suma "+resultado);
	}
	
	@Test
	public  void TestSumar2() { 
		Calculadora calc= new Calculadora();
		int resultado = calc.Sumar(3, -2);
		int esperado = 1;
		assertEquals(esperado,resultado);
		/*se suman un numero positivo y negativo,
		 * se espera que signos distintos se restan
		 * y lleva el signo del mayor*/
		System.out.println(" (3-2) "); 
		System.out.println("suma "+resultado);
	}
	@Test
	public  void TestSumar3() { 
		Calculadora calc= new Calculadora();
		int resultado = calc.Sumar(-3, -2);
		int esperado = -5;
		/* se suman dos numeros negativos,
		 * y se espera resultado negativo*/
		assertEquals(esperado,resultado);
		System.out.println(" (-3-2) "); 
		System.out.println("suma "+resultado);
	}
	@Test
	public  void TestSumar4() { 
		Calculadora calc= new Calculadora();
		String resultado = calc.SumarMaximo();
		String esperado = "Overflow";
		/* se suma al maximo valor de la representacion
		 * de los enteros 1, y se
		 * espera que devuelva un error de desvordamiento*/
		assertEquals(esperado,resultado); 
		System.out.println("Maximo valor de representacion de los enteros "+Integer.MAX_VALUE);
		System.out.println(" lo incrementamos en 1"+resultado);
	}
}
