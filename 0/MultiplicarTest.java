package Calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*la multiplicacion es conmutativa, no necesito
 * conmutar los valores da los mismos resultados*/
class MultiplicarTest {

	@Test
	public void TestMultiplicar1() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Multiplicar(-3, -2);
		int esperado = 6;
		/* al multiplicar dos numeros negativos,
		 * se espera resultado positivo*/
		assertEquals(esperado,resultado);
		System.out.println("(-3)*(-2)");
		System.out.println("multiplica "+resultado);
	}
	
	@Test
	public void TestMultiplicar2() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Multiplicar(3, 2);
		int esperado = 6;
		/*al multiplicar dos numeros positivos, 
		 * se espera resultado positivo*/
		assertEquals(esperado,resultado);
		System.out.println("3*2");
		System.out.println("multiplica "+resultado);
	}
	@Test
	public void TestMultiplicar3() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Multiplicar(3, -2);
		int esperado = -6;
		/* al multiplicar un numero positivo
		 * y negativo, se espera resultado negativo*/
		assertEquals(esperado,resultado);
		System.out.println("3*(-2)");
		System.out.println("multiplica "+resultado);
	}
	@Test
	public void TestMultiplicar4() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Multiplicar(0, 3);
		int esperado = 0;
		/* al multiplicar un numero positivo
		 * y 0, se espera resultado positivo*/
		assertEquals(esperado,resultado);
		System.out.println("0*(3)");
		System.out.println("multiplica "+resultado);
}
	@Test
	public void TestMultiplicar5() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Multiplicar(0,-3 );
		int esperado = 0;
		/* al multiplicar un numero negativo
		 * y 0, se espera resultado positivo*/
		assertEquals(esperado,resultado);
		System.out.println("0*(-3)");
		System.out.println("multiplica "+resultado);
}

	@Test
	public void TestMultiplicar6() {
		Calculadora calc= new Calculadora();
		int resultado = calc.Multiplicar(0,0 );
		int esperado = 0;
		/* al multiplicar 0
		 * y 0, se espera resultado cero*/
		assertEquals(esperado,resultado);
		System.out.println("0*0");
		System.out.println("multiplica "+resultado);
}
}