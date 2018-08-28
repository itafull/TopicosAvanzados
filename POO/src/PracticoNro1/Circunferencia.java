
package PracticoNro1;
import java.util.Scanner;
/**
 * EJERCICIO NRO 3
 * Crear una clase denominada Circunferencia, que contenga el método main(), 
 * en el que se calcule el perímetro de una circunferencia, 
 * ingresando el radio de tipo entero a través del argumento del main().
 * @author SKULL
 * @version 2018
 */

public class Circunferencia {
	private static Scanner teclado;
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		 System.out.println("Ingrese el radio: ");
		int radio= teclado.nextInt();
		/* logitud de la circunferencia 
		 * una rueda, al dar vuelta, describe una trayectoria cuaya
		 * longitud es el perimetro de la circunferencia de la rueda
		 * formula 2*pi*r  */
		 int perimetro = (int) (2 * (Math.PI) * radio);
		 System.out.println("El perimetro de la circunferencia es: "+perimetro);
}
}



	

	