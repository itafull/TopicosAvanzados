package PracticoNro1;

import java.util.Scanner;

/**
 * EJERCICIO NRO 6
 * Crear una clase denominada TrianguloRectangulo, que contenga el método main(),
 *  en el que se determine si un triangulo es rectángulo 
 *  (Teorema de Pitágoras  h2 = cateto12 + cateto22). 
 *  Los lados se deben ingresar por teclado, utilizando el argumento del main().
 * @author SKULL
 * @version 2018
 */
public class TrianguloRectangulo {
	static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	teclado = new Scanner(System.in);
	int hipotenusa;
	int cateto1;
	int cateto2;
	System.out.println("Ingrese la hipotenusa: ");
	hipotenusa = teclado.nextInt();
	System.out.println("Ingresa el primer cateto");
	cateto1= teclado.nextInt();
	System.out.println("Ingrese el segundo cateto");
	cateto2 = teclado.nextInt();
	double rectangulo = Math.pow(cateto1,2) +Math.pow(cateto2,2);
	double h2 = Math.pow(hipotenusa, 2);
	if (h2 == rectangulo) {
		System.out.println("El triangulo es rectangulo...");
		
	} else {
		System.out.println("El triangulo no es rectangulo...");
	}
	
	
	}

}
