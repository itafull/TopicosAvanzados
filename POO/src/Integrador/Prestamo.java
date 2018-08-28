package Integrador;

import java.util.*;
/**
 * Esta clase permite representar los prestamos que realizan los socios de una biblioteca, con una fecha de
 * retiro, un fecha de devolucion, un socio y un libro. Permitiendo saber si el prestamo esta� vencido y pudiendo
 * mostrar los detalles del mismo.
 * 
 * @author (Lopez Noelia Soledad) 
 * @version (version 1)
 */
public class Prestamo{
    private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Socio socio;
    private Libro libro;
    
    /**
     * Este constructor establece el valor de los atributos del Prestamo, recibiendo la fecha de retiro, el
     * Socio y el Libro por parámetro, dejando sin establecer la fecha de devolución.
     * @param Calendar p_fechaRetiro.
     * @param Socio p_socio.
     * @param Libro p_libro.
     */
    public Prestamo(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
        this.setFechaRetiro(p_fechaRetiro);
        this.setSocio(p_socio);
        this.setLibro(p_libro);
    }
    
    /**
     * Este constructor establece el valor de los atributos del Prestamo, recibiendo el Socio y 
     * el Libro por parámetro, la fecha de devolución queda sin establecer y la fecha de retiro se establece como la fecha actual.
     * @param Socio p_socio.
     * @param Libro p_libro.
     */
    public Prestamo(Socio p_socio, Libro p_libro){
        Calendar fechaHoy = new GregorianCalendar();
        this.setFechaRetiro(fechaHoy);
        this.setSocio(p_socio);
        this.setLibro(p_libro);
    }
    
    /**
     * Este método establece el valor del atributo fechaRetiro del objeto Prestamo que recibe el mensaje,
     * recibiendo este valor por parámetro.
     */
    private void setFechaRetiro(Calendar p_fechaRetiro){
        this.fechaRetiro = p_fechaRetiro;
    }
    
    /**
     * Este método permite acceder al valor del atributo fechaRetiro del objeto Prestamo que recibe el mensaje,
     * retornandolo.
     * @return Calendar.
     */
    public Calendar getFechaRetiro(){
        return this.fechaRetiro;
    }
    
    /**
     * Este método permite establecer el valor del atributo fechaDevolucion del objeto Prestamo que recibe el mensaje.
     */
    public void setFechaDevolucion(Calendar p_fechaDevolucion){
        this.fechaDevolucion = p_fechaDevolucion;
    }
    
    /**
     * Este método permite acceder al valor de la fecha de devolucion del objeto Prestamo que recibe el mensaje, retornandolo.
     * @return Calendar.
     */
    public Calendar getFechaDevolucion(){
        return this.fechaDevolucion;
    }
    
    /**
     * Este método permite establecer el objeto Socio recibido por parámetro como valor del atributo socio del objeto Prestamo que recibe el mensaje.
     */
    private void setSocio(Socio p_socio){
        this.socio = p_socio;
    }
    
    /**
     * Este método permite acceder al objeto Socio que posee el objeto Prestamo que recibe el mensaje, retornandolo.
     * @return Socio.
     */
    public Socio getSocio(){
        return this.socio;
    }
    
    /**
     * Este método establece el objeto Libro recibido por parámetro como valor del atributo libro.
     */
    private void setLibro(Libro p_libro){
        this.libro = p_libro;
    }
    
    /**
     * Este método permite acceder al valor del atributo libro del objeto Prestamo que recibe el mensaje, retornandolo.
     * @return Libro.
     */
    public Libro getLibro(){
        return this.libro;
    }
    
    /**
     * Este método retorna un valor boolean true o false dependiendo de si la fecha pasada por parámetro es superior a la fecha de devolución.
     * @param Calendar p_fecha.
     * @return boolean.
     */
    public boolean vencido(Calendar p_fecha){
        if(p_fecha.after(this.getFechaDevolucion())){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Este método retorna una cadena de caracteres con la fecha de retiro, la fecha de devolución, el título del libro y el nombre del socio.
     * @return String.
     */
    public String toString(){
        String  retiro = "Retiro: " + this.getFechaRetiro().get(Calendar.DATE) + "/" + this.getFechaRetiro().get(Calendar.MONTH) + "/" + this.getFechaRetiro().get(Calendar.YEAR);
        String devolucion = "Devolucion: " + this.getFechaDevolucion().get(Calendar.DATE) + "/" + this.getFechaDevolucion().get(Calendar.MONTH) + "/" + this.getFechaDevolucion().get(Calendar.YEAR);
        String libro = "Libro: " + this.getLibro().getTitulo();
        String socio = "Socio: " + this.getSocio().getNombre();
        String stringFinal = (retiro + " - " + devolucion + "\n" + libro + "\n" + socio);
        return stringFinal;
    }
}
