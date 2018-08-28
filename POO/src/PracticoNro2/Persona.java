package PracticoNro2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
 private int nroDni;
 private String nombre;
 private String apellido;
 private int anioNacimiento; 
 

 public Persona (int p_dni, String p_nombre, String p_apellido, int p_anio) {
	this.setDNI(p_dni);
	this.setNombre(p_nombre);
	this.setApellido(p_apellido);
	this.setAnioNacimiento(p_anio);
		
}

	private void setApellido(String p_apellido) {
	// TODO Auto-generated method stub
	this.apellido= p_apellido;
}
	public String getApellido() {
		return this.apellido;
	}
	private void setAnioNacimiento(int p_anio) {
	// TODO Auto-generated method stub
	this.anioNacimiento = p_anio;
}
	public int getAnioNacimiento() {
		return this.anioNacimiento;
			}
	private void setNombre(String p_nombre) {
	// TODO Auto-generated method stub
	this.nombre = p_nombre; 
}
	public String getNombre() {
		return this.nombre;
	}
	private void setDNI(int p_dni) {
	// TODO Auto-generated method stub
	this.nroDni = p_dni;
}
	
	public int getDNI() {
		return this.nroDni;
	}
	
	
	
	public int edad() {
		GregorianCalendar fechaHoy = new GregorianCalendar();
		int anioHoy = fechaHoy.get(Calendar.YEAR);
		return anioHoy - this.getAnioNacimiento();
		
	}
  public void mostrar() {
	  System.out.println("Nombre y Apellido: "+ this.getNombre()+"  "+this.getApellido());
	  System.out.println("DNI: "+ this.getDNI()+"    edad: "+this.edad());
  }
 





}


