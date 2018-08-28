
package PracticoNro1;
/**
 * Crear una clase que contenga el método main(),
 * en el que se determinen y muestren por pantalla los números múltiplos
 *  de 4 a partir de 42 y hasta el 150 inclusive. 
 *  Usar la sentencia de bucle más apropiada.
 * @author SKULL
 * @version 208
 */
	public class EjercicioNro2 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 42;
		int resto;
		
		while (numero <= 150) {
			 resto = numero % 4;
			if (resto == 0) {
				System.out.println(numero);
				
			}
			numero++;		
		}
	}

} 