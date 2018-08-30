package Integrador;

import java.util.*;
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro{
    private String titulo;
    private int edicion;
    private String editorial;
    private int anio;
    private ArrayList <Prestamo> prestamos;
    
    public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio, ArrayList <Prestamo> p_prestamos){
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(p_prestamos);
    }
    
    public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(new ArrayList <Prestamo>());
    }
    
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    private void setEdicion(int p_edicion){
        this.edicion = p_edicion;
    }
    
    public int getEdicion(){
        return this.edicion;
    }
    
    private void setEditorial(String p_editorial){
        this.editorial = p_editorial;
    }
    
    public String getEditorial(){
        return this.editorial;
    }
    
    private void setAnio(int p_anio){
        this.anio = p_anio;
    }
    
    public int getAnio(){
        return this.anio;
    }
    
    private void setPrestamos(ArrayList <Prestamo> p_prestamos){
        this.prestamos = p_prestamos;
    }
    
    public ArrayList <Prestamo> getPrestamos(){
        return this.prestamos;
    }
    
    public Prestamo getPrestamo(){
        if (this.getPrestamos().isEmpty()){
            return null;
        }else{   
           return this.getPrestamos().get(this.getPrestamos().size()-1);
        }
    }
    
    public boolean addPrestamo(Prestamo p_prestamo){
        return this.getPrestamos().add(p_prestamo);
    }
    
    public boolean prestado(){
        if((getPrestamo() != null) && (this.getPrestamo().getFechaDevolucion() == null)){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return "Titulo: " + this.getTitulo();
    }
    
    public boolean removePrestamo(Prestamo p_prestamo){
        return this.getPrestamos().remove(p_prestamo);
    }
}