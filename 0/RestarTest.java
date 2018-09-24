package Calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestarTest {

	@Test
	public void TestRestar1() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Restar(3, 2);
		int esperado = 1;
		/* se restan dos numeros positivos, 
		 * se espera resultado positivo*/
		assertEquals(esperado,resultado);
		System.out.println("resta dos numeros positivos (3-2) ");
		 System.out.println("resta "+resultado);
	}
	@Test
	public void TestRestar2() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Restar(2, 3);
		int esperado = -1;
		/* se restan dos numeros positivos, 
		 * se espera resultado negativo*/
		assertEquals(esperado,resultado);
		System.out.println("resta dos numeros positivos (2-3) ");
		 System.out.println("resta "+resultado);
	}
    @Test
	public void TestRestar3() {
				Calculadora calc= new Calculadora();
				int resultado = calc.Restar(3, -2);
				int esperado = 5;
				/*se restan dos numero negativos, 
				 * se espera resultado positivo*/
				assertEquals(esperado,resultado);
				System.out.println("resta un numero positivo y un negativo (3-(-2)) ");
				 System.out.println("resta "+resultado);
	}
    @Test
   	public void TestRestar4() {
   				Calculadora calc= new Calculadora();
   				int resultado = calc.Restar(-2, 3);
   				int esperado = -5;
   				/*se restan dos numero negativos, 
   				 * se espera resultado negativo*/
   				assertEquals(esperado,resultado);
   				System.out.println("resta un numero positivo y un negativo (2-(-3)) ");
   				 System.out.println("resta "+resultado);
   	}
    @Test
	public void TestRestar5() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Restar(-3, -2);
		int esperado = -1;
		/* se restan dos numeros negativos, 
		 * y se espera resultado negativo*/
		assertEquals(esperado,resultado);
		System.out.println("resta de dos numeros negativos (-3--2) "); 
		 System.out.println("resta "+resultado);
    }
    @Test
	public void TestRestar6() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Restar(-2, -3);
		int esperado = 1;
		/* se restan dos numeros negativos, 
		 * y se espera resultado positivo*/
		assertEquals(esperado,resultado);
		System.out.println("resta de dos numeros negativos (-2--3) "); 
		 System.out.println("resta "+resultado);
    }
    @Test
    public  void TestResta7() { 
		Calculadora calc= new Calculadora();
		String resultado = calc.RestarMinimo();
		String esperado = "Overflow";
		/* se resta al minimo valor de la representacion
		 * de los enteros 1, y se
		 * espera que devuelva un error de desvordamiento*/
		assertEquals(esperado,resultado); 
		System.out.println("Maximo valor de representacion de los enteros "+Integer.MIN_VALUE);
		System.out.println(" lo drementamos en 1"+resultado);
	}
}
