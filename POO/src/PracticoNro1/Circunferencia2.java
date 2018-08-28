package PracticoNro1;

import java.util.Scanner;

/**
 * Modificar la clase Circunferencia para permitir que el usuario pueda calcular 
 * el perímetro de muchas circunferencias, utilizando la estructura while. 
 * Modificar además el ingreso de datos, utilizando la clase Scanner
 * @author SKULL
 * @version 2018
 */
 public class Circunferencia2 {
  static Scanner teclado;
  public static void main(String[] args) {
			teclado = new Scanner(System.in);
			char tecla = 'S';
			while (tecla == 'S' || tecla == 's') {
		        System.out.println("Ingrese el radio: ");
				int radio= teclado.nextInt();
				/* logitud de la circunferencia 
				 * una rueda, al dar vuelta, describe una trayectoria cuaya
				 * longitud es el perimetro de la circunferencia de la rueda
				 * formula 2*pi*r  */
				 int perimetro = (int) (2 * (Math.PI) * radio);
				 System.out.println("El perimetro de la circunferencia es: "+perimetro);
				 System.out.println("Desea ingresar algun radio, en caso afirmativo presione S") ;
					tecla = teclado.next().charAt(0); //para poder recibir el valor del chart
			} 
			
			}
	}