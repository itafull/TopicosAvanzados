package PracticoNro1;

import java.util.Scanner;

/**
 * Crear una clase denominada OperarVector que permita ingresar por teclado (Scanner)
 *  5 notas de alumnos, las que serán almacenadas en un array de enteros. 
 *  Calcular el promedio y determinar la mayor nota.
 *   El promedio debe permitir resultado con decimales 
 *   (aplicar cast a los elementos enteros cuando sea necesario para obtener dicho resultado). 
 *   Mostrar los elementos ingresados, separados por un tabulador. 
 *   Mostrar el promedio y la mayor nota con el mensaje respectivo.
 * @author SKULL
 * @version 2018
 */
public class OperarVector {
	static Scanner teclado;
	static int [] notas = new int [5] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teclado = new Scanner(System.in);
		int i;
		int suma = 0;
		double promedio;
		int mayor= Integer.MIN_VALUE;		
		System.out.println("Ingrese las notas, solo hasta 5 notas...");
		for (i = 0; i != 5; i++) {
		 System.out.println("\t");
		notas[i] = teclado.nextInt();
		 suma =(suma+ notas[i]);
			if (notas[i] > mayor) {
				mayor = notas[i];
				}
		}
		promedio = suma / i;
		System.out.println("El promedio de las notas es: " + promedio);
		System.out.println("La mayor notas es: " + mayor);
}
}

	