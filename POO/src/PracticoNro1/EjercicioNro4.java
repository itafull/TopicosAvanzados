package PracticoNro1;

import java.util.Scanner;

/**Crear una clase que contenga el m�todo main(), declarar las variables a, b y c de tipo double,
 * que corresponden a los lados de un tri�ngulo.
 * Los valores deben ser ingresados por teclado como argumentos del m�todo main().
 *  Calcular y mostrar el semiper�metro y el �rea del tri�ngulo con las siguientes f�rmulas:
 * semiperimetro= (a+b+c)/2
   area= ra�z cuadrada(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c))
   @author SKULL
 * @version 2018
 */
public class EjercicioNro4 {
	private static Scanner teclado;
	
	
	public static void main(String [] args) {
		double a;
		double b;
		double c;
		 teclado = new Scanner(System.in);
		 System.out.println("Ingrese el valor de a: ");
			a= teclado.nextDouble();
		 System.out.println("Ingrese el valor de b: ");
			b= teclado.nextDouble();
		 System.out.println("Ingrese el valor de c: ");
			c= teclado.nextDouble();
		 double semiperimetro = (a+b+c)/2;
		 double sa = semiperimetro - a;
		 double sb = semiperimetro - b;
		 double sc = semiperimetro - c;
		 double resultado = sa*sb*sc;
		 double area = Math.sqrt(resultado);
		 System.out.println("El area de un triangulo es: " + area);
		 System.out.println("El semiperimetro de un triangulo es: "+semiperimetro);
	}

}
