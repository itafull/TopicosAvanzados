package PracticoNro1;

import java.util.Scanner;

/**
 *Crear una clase denominada OrdenVector, que permita ingresar por teclado (Scanner)
 *  4 elementos dobles, y almacenarlos en un array. Determinar el menor elemento y mostrarlo.
 *  Ordenar los elementos del vector de menor a mayor. 
 *  Mostrar los elementos ordenados, separados por un tabulador. 
 *  Usar sentencia FOR para el ingreso de datos.
 *  Utilizar método de la Burbuja.
 *@author SKULL
 *@version 2018
 */
public class OrdenVector {
	private static Scanner teclado;
	static double [] ordenar = new double [4];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    teclado = new Scanner(System.in);
    int i,j = 0; 
    double aux = 0;
    System.out.println("Ingrese los elementos que desea ordenar: ");
    for(i = 0; i !=4 ;i++) {
    	ordenar[i]= teclado.nextDouble();
    	}
  //ordenar d menor a mayor
    for(i=0; i< ordenar.length-1; i++) {
    	 for(j=0; j< ordenar.length-1; j++) {
    		 if (ordenar[j] > ordenar[j+1] ) {
    				aux = ordenar[j];
    				ordenar[j]= ordenar[j+1];
    				ordenar[j+1] = (int) aux;
    		    }
    	 }
    	 
    }
    System.out.println("El vector ordenado es: ");
    for(i=0; i <= ordenar.length-1; i++){
    	System.out.println(ordenar[i]);
    }
    System.out.println("El menor elemento del vector es: "+ordenar[0]);
	}
}
	
