package PracticoNro1;

import java.util.Scanner;

/**
 *  EJERCICIO NRO 5
 * Crear una clase denominada Ecuacion que contenga el m�todo main() y
 *  que calcule las ra�ces reales de una ecuaci�n de segundo grado. 
 *  Los valores de los coeficientes a, b y c se ingresar�n por teclado como argumentos del m�todo main().
 *   Considerar que si discriminante > 0 se deben calcular las 2 ra�ces, si discriminante = 0
 *    se debe calcular una sola ra�z, especificando por pantalla que x1 = x2. En caso de ser negativo, 
 *    mostrar un mensaje indicando que se encuentra frente a una soluci�n compleja (numero imaginario).
 * @author SKULL
 * @ version 2018
 */
	public class Ecuacion {
		private static Scanner teclado;
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
	    int b;
	    int c;
	    teclado = new Scanner(System.in);
	    System.out.println("Ingrese el valor del coeficiente a: ");
	    a = teclado.nextInt();
	    System.out.println("Ingrese el valor del coeficiente b: ");
	    b = teclado.nextInt();
	    System.out.println("Ingrese el valor del coeficiente c: ");
	    c = teclado.nextInt();
	    /*calcular el discriminante de la ecuacion*/
	    double discriminante = Math.pow(b,2) + 4*a*c ;  
	    if (discriminante > 0) {
	    	double raiz1 = (-b + Math.sqrt(discriminante))/(2*a);
	    	double raiz2 = (-b - Math.sqrt(discriminante))/(2*a);
	    	System.out.println("Las raices de esta ecuacion son:" +raiz1+" ; " +raiz2);
	    } else if (discriminante ==0) {
	    	double raiz1 = (-b + Math.sqrt(discriminante))/(2*a);
	    	System.out.println("La raiz de esta ecuacion es:" +raiz1);
	    }
	    else {
	    	
	    	System.out.println("Nos encontramos frente a una solucion compleja, numeros imaginarios...");
	    }
    
    
	}

}
