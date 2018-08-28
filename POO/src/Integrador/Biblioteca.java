package Integrador;

import java.util.*;
/**
 * Esta class permite administrar los prestamos de libros, asigna nuevos libros y socios (estudiante o docente) a la biblioteca, permite calcula la cantidad de
 * de socio segun el tipo, hace un contro de la devolucion de los libros, devuelve una coleccion con los prestamos vencidos y de los docentes que son 
 * responsables,devuelve una lista con los docentes responsables tambièn devuelve el nombre del socio que tiene el libro y si no se encuentra devuelve un 
 * mensaje, imprime una lista de socios y de los libros de la biblioteca, y busca a un socio segun el dni.
 * @author  
 * @version . 
 */
public class Biblioteca{
   private String nombre;
   private ArrayList<Libro> libros;
   private ArrayList<Socio> socios;
   
   /**
    * Inicializacion del objeto.
    * @param (String p_nombre,ArrayList<Libro> p_libro, ArrayList<Socio> p_socio).
    */
    public Biblioteca(String p_nombre,ArrayList<Libro> p_libro, ArrayList<Socio> p_socio){
    this.setNombre(p_nombre);
    this.setLibros(new ArrayList<Libro>());
    this.setSocios(new ArrayList<Socio>());}
   
   /**
    * Este metodo asigna el valor del nombre. 
    * @param p_nombre.
    * @return no devuelve nada.      
    */ 
   private void setNombre(String p_nombre){
       this.nombre=p_nombre;}
       
   private void setLibros(ArrayList<Libro> p_libro){
       this.libros=p_libro;}
       
   private void setSocios(ArrayList<Socio> p_socio){
       this.socios=p_socio;}
   
  /**Este metodo muestra el valor interno del nombre.
    * @return el nombre.
    */                  
   public String getNombre(){
       return this.nombre;}
       
   public ArrayList<Libro> getLibros(){
       return this.libros;}
       
   public ArrayList<Socio> getSocios(){
       return this.socios;}
       
   /**
    * Agrega un socio
    */    
   public void addSocio(Socio p_socio){
      this.getSocios().add(p_socio);}
      
   /**
    * Elimina un socio
    */   
   public void removeSocio(Socio p_socio){
       this.getSocios().remove(p_socio);}
       
   /**
    * Agrega un libro
    */    
   public void addLibro(Libro p_libro){
       this.getLibros().add(p_libro);}
       
   /**
    * Elimina un libro
    */    
   public void removeLibro(Libro p_libro){
       this.getLibros().remove(p_libro);}
       
   /**
    * Agrega al ArrayList un nuevo libro
    */ 
    public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
      this.getLibros().add(new Libro(p_titulo,p_edicion,p_editorial,p_anio));}
   
      
   /**
    * Agrega un nuevo estudiante al ArrayList
    */   
    public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre, String p_carrera){
      this.getSocios().add(new Estudiante(p_dniSocio,p_nombre,p_carrera));}     
    
   /**
    * Agrega un nuevo docente al ArrayList
    */
   public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area){
      this.getSocios().add(new Docente(p_dniSocio,p_nombre,p_area));} 
   
   /**
    * Calcula y devuelve la cantidad de socio segun su tipo.
    * @return int 
    */ 
   public int cantidadSociosPorTipo(String p_objeto){
        int cantidad = 0;
         for(Socio s:socios){
           if(s.soyDeLaClase() == p_objeto){
              cantidad++;
            }
         }
        return cantidad;
    }
   
       
   /**
    * Crea el prestamo, y lo agrega en el libro y el socio.
    * @return boolean
    */    
   public boolean prestarLibro(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
      boolean prestar=false; 
       if (p_libro.prestado() == false && p_socio.puedePedir() == true){
         Prestamo prestamo = new Prestamo(p_fechaRetiro,p_socio,p_libro);
         p_libro.addPrestamo(prestamo);
         p_socio.addPrestamo(prestamo);
         prestar = true;
        }
      return prestar;
    }
   
      
   /**
    * Asigna la fecha de devolucion del prestamo con la fechaActual.
    */  
   public void devolverLibro(Libro p_libro){
     Calendar fechaActual = Calendar.getInstance();
     if (p_libro.prestado() == true){
            p_libro.getPrestamo().setFechaDevolucion(fechaActual);}
   }
     
   
   /**
    * Busca y devuelve una coleccion con los prestamos vencidos con la fechaActual.
    * @return ArrayList<Prestamo>.
    */
   public ArrayList<Prestamo> prestamosVencidos(){
      Calendar fechaActual = Calendar.getInstance();
      ArrayList<Prestamo> vencidos = new ArrayList<Prestamo> ();
      for (Libro l:libros){
         if (l.getPrestamo().vencido(fechaActual) == true){
             vencidos.add(l.getPrestamo());
         }
      }
      return vencidos;}
    
   /**
    * Devuelve una coleccion con los docentes que son responsables.
    * @return ArrayList<Docente>
    */
   public ArrayList<Docente> docentesResponsables(){
     ArrayList<Docente> responsable = new ArrayList<Docente>();//genero un ArrayLis del tipo docente 
     Docente docente = new Docente(000000000,"","");//Inicializo un objeto del tipo docente
      for (int i=0; i<this.getSocios().size();i++){
        if(this.getSocios().get(i).soyDeLaClase() == "Docente") {
          docente = (Docente)this.getSocios().get(i);//rescato el socio del tipo docente para sabar si esResponsable o no
          if(docente.esResponsable() == true){
            responsable.add(docente);}
         }
      }
     return responsable;}
   
   /**
    * Devuelve el nombre del socio que tiene el libro con el titulo y si no se encuentra devuelve un mensaje.
    * @return String.
    */ 
   public String quienTieneElLibro(Libro p_libro){
       String cadena="";
       if (p_libro.prestado()== true){
           cadena =(p_libro.getPrestamo().getSocio().getNombre()+" "+p_libro.getTitulo());}
       else{   
           cadena = "El Libro se encuentra en la biblioteca";}
       return cadena;}
   
   /**
    * Devuleve la lista de los socios.
    * @return String.
    */
   public String listaDeSocios(){
      String formato1 ="";
      int cont = 0;
       for(Socio s:socios){   
         cont = cont + 1;   
         formato1 = formato1 + cont +") "+ s.toString()+"\n";
      }
        return formato1;}
    
        
   /**
    * Devuelve la lista de los libros.
    * @return String.
    */     
   public String listaDeLibros(){
       String formato2 ="";
       int cont = 0;
       for(int i=0;i<this.getLibros().size();i++){   
        cont = cont + 1;   
        if  (this.getLibros().get(i).prestado() == true){
           formato2 = formato2+cont+") "+this.getLibros().get(i).toString()+" || Prestado: (Si) \n";}
         else{
           formato2 = formato2+cont+") "+this.getLibros().get(i).toString()+" || Prestado: (No) \n";}
      }
      return formato2;}
    
   /**
    * Devuelve un listado de los Dedocentes Responsables.
    * @return String.
    */   
   public String listaDeDocentesResponsables(){
     String cadena = ""; 
     for (int  i=0; i<this.docentesResponsables().size();i++){
          cadena = (cadena + "*" +this.docentesResponsables().get(i).toString() + "\n");}
     return cadena;}
    
   /**
    * Busca el socio segun el DNI.
    * @return socio.
    */ 
   public Socio buscarSocio(int p_dni){
       Socio socio = null;
       for (Socio s:socios){
         if (s.getDniSocio() == p_dni){
             socio = s;}
       }
      return socio;}
      
}