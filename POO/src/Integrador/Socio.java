package Integrador;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public abstract class Socio {
	 private int dniSocio;
	    private String nombre;
	    private int diasPrestamo;
	    private ArrayList<Prestamo> prestamos;
	    
	    /**
	     * Este constructor establece el valor de todos los atributos recibiendo este valor por parámetro, con
	     * excepcion de la coleccion de prestamos, la cual es instanciada como un ArrayList.
	     * @param int p_dniSocio
	     * @param String p_nombre
	     * @param int p_diasPrestamo
	     */
	    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo){
	        this.setDniSocio(p_dniSocio);
	        this.setNombre(p_nombre);
	        this.setDiasPrestamo(p_diasPrestamo);
	        this.setPrestamos(new ArrayList<Prestamo> ());
	    }
	    
	    /**
	     * Este constructor establece el valor de los atributos dniSocio y diasPrestamo recibiendolos por parámetro,
	     * inicializando el nombre como una cadena de caracteres vacía e instanciando la colección de préstamos como
	     * un ArrayList.
	     * @param int p_dniSocio.
	     * @param int p_diasPrestamo.
	     */
	    public Socio(int p_dniSocio, int p_diasPrestamo){
	        this.setDniSocio(p_dniSocio);
	        this.setNombre("");
	        this.setDiasPrestamo(p_diasPrestamo);
	        this.setPrestamos(new ArrayList<Prestamo> ());
	    }
	    
	    /**
	     * Este método permite establecer el valor del dni del socio que recibe el mensaje, recibiendo 
	     * éste valor como parámetro.
	     */
	    private void setDniSocio(int p_dniSocio){
	        this.dniSocio = p_dniSocio;
	    }
	    
	    /**
	     * Este método permite acceder al valor del atributo dniSocio del socio que recibe el mensaje, retornandolo.
	     * @return int.
	     */
	    public int getDniSocio(){
	        return this.dniSocio;
	    }
	    
	    /**
	     * Este método permite establecer el nombre del socio, recibiendo este valor por parámetro.
	     */
	    private void setNombre(String p_nombre){
	        this.nombre = p_nombre;
	    }
	    
	    /**
	     * Este método permite acceder al valor del atributo nombre del socio que recibe el mensaje, retornandolo.
	     * @return String.
	     */
	    public String getNombre(){
	        return this.nombre;
	    }
	    
	    /**
	     * Este método establece el ArrayList recibido por parámetro como valor del atributo prestamos del objeto
	     * Socio que recibe el mensaje.
	     */
	    private void setPrestamos(ArrayList<Prestamo> arrayList){
	        this.prestamos = arrayList;
	    }
	    
	    /**
	     * Este método permite acceder a la coleccion (ArrayList) del objeto Socio que recibe el mensaje,
	     * retornandolo.
	     * @return ArrayList.
	     */
	    public ArrayList<Prestamo> getPrestamos(){
	        return this.prestamos;
	    }
	    
	    /**
	     * Este método permite agregar un objeto de la clase Prestamo(recibido por parámetro) a la coleccion.
	     * @param Prestamo p_prestamo.
	     */
	    public void addPrestamo(Prestamo p_prestamo){
	        ((List<Prestamo>) this.getPrestamos()).add(p_prestamo);
	    }
	    
	    /**
	     * Este método permite quitar(remover) un elemento de la colección de préstamos, el cual es recibido por
	     * parámetro.
	     * @param Prestamo p_prestamo.
	     */
	    public void removePrestamo(Prestamo p_prestamo){
	        ((List<?>) this.getPrestamos()).remove(p_prestamo);
	    }
	    
	    /**
	     * Este método retorna la cantidad de libros prestados que posee el Socio.
	     * @return int.
	     */
	    public int cantLibrosPrestados(){
	        return ((List<?>) this.getPrestamos()).size();
	    }
	    
	    /**
	     * Este método permite establecer el valor del atributo diasPrestamo del socio que recibe el mensaje, dicho
	     * valor es recibido por parámetro.
	     * @param int p_dias.
	     */
	    public void setDiasPrestamo(int p_dias){
	        this.diasPrestamo = p_dias;
	    }
	    
	    /**
	     * Este método permite acceder al valor del atributo diasPrestamo del objeto Socio que recibe el mensaje,
	     * retornandolo.
	     * @return int.
	     */
	    public int getDiasPrestamo(){
	        return this.diasPrestamo;
	    }
	    
	    /**
	     * Este método retorna una cadena de caracteres con los datos del Socio, dni, nombre, y la cantidad de
	     * libros prestados.
	     * @return String.
	     */
	    public String toString(){
	        String dni = ("D.N.I.: " + this.getDniSocio() + " |");
	        String nom = ("| " + this.getNombre() + "(" + this.soyDeLaClase() + ") |");
	        String prest = ("| Libros Prestados: " + this.cantLibrosPrestados());
	        return (dni + nom + prest);
	    }
	    
	    /**
	     * Este método retorna un valor boolean true o false dependiendo de la condición del socio, si no posee
	     * ningun libro vencido retornará true, en caso contrario false.
	     * @return boolean.
	     */
	    public boolean puedePedir(){
	        int cont = 0;
	        GregorianCalendar fechaHoy = new GregorianCalendar();
	        
	        for(int i = 0; i < this.cantLibrosPrestados(); i++){
	            if(((Prestamo) ((List<?>) this.getPrestamos()).get(i) ).vencido(fechaHoy) ){
	                cont += 1;
	            }
	            
	        }
	        
	        if(cont > 0){
	            return false;
	        }else{
	            return true;
	        }
	    }
	    
	    /**
	     * Este método abstracto retorna una cadena de caracteres con el nombre de la clase a la que pertenece el socio, ya
	     * sea ésta Estudiante o Docente, por ello es implementado en las subclases correspondientes.
	     * @return String.
	     */
	    public abstract String soyDeLaClase();
}
