package PracticoNro2;

import java.util.Scanner;

public class PersonaEjecuta {
 static Scanner teclado;
 static Persona persona;
 static int opcion = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    teclado = new Scanner(System.in);
   
    
    while (opcion == 0) {
    	 System.out.println("Ingrese los siguientes Datos ");
    	  
    	System.out.println("Dni: ");
    	     int dni = teclado.nextInt();
    	 System.out.println(" Nombre");
    	     String nombre = teclado.nextLine();
    	 System.out.println(" Apellido");
    	     String apellido= teclado.nextLine();
    	 System.out.println("Año de Nacimiento");
    	     int año = teclado.nextInt();
    	     persona = new Persona(dni,nombre,apellido,año);
    	 	persona.mostrar(); 
    	 	 System.out.println("Desea ingresar datos; en caso afirmativo 0 ");	
    	 	opcion = teclado.nextInt();
    }
		
	//persona = new Persona(35123456,"JUAN","PEREZ",1993);
	//persona.mostrar();
	}

}
