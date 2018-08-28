package PracticoNro1;

/**
 * Crear una clase que contenga el método main(). 
 * En él declarar las variables a y b de tipo entero. 
 * Inicializarlas con los valores 8 y 3 respectivamente.
 *  Realizar y mostrar por pantalla las siguientes operaciones aritméticas:
 *   suma, resta, multiplicación, división y resto.
 * @author SKULL
 * @version 2018
 */

	public class EjercicioNro1 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 8;
			int b = 3;
			int suma = a+b;
			int resta = a-b;
			int multiplica = a*b;
			int resto = a%b;
			int divide = a/b;
			System.out.println("La suma es: "+suma);
			System.out.println("La resta es: "+resta);
			System.out.println("La division es: "+divide);
			System.out.println("El resto es: "+resto);
			System.out.println("La multiplicacion es: "+multiplica);
 
}
}