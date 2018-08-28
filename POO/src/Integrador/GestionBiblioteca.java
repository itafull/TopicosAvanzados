package Integrador;

import java.util.*;
import java.text.SimpleDateFormat;

public class GestionBiblioteca
{
    private int salida=0;
	private static Scanner teclado;
	private static String opt;
    public static void main(String[] args)
    {
        Calendar fechaHoy = new GregorianCalendar();
        Calendar antigua = new GregorianCalendar(2016,5,11);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss");
        System.out.println(sdf.format(fechaHoy.getTime()));
        
        ArrayList<Libro> libro = new ArrayList<Libro>();
        ArrayList<Socio> socio = new ArrayList<Socio>();
        Biblioteca biblioteca= new Biblioteca("Bibliote UNNE",libro,socio);
        
        biblioteca.nuevoLibro("Java. Como Programar",100,"Moglia",2006);
        biblioteca.nuevoLibro("Longman. Diccionario Pocket",150,"Atlas",1998);
        biblioteca.nuevoLibro("Vivir para Contarla",100,"El Principito",2002);
        biblioteca.nuevoLibro("Java. Como Programar",100,"Moglia",2006);
        biblioteca.nuevoLibro("Programando con Java",9,"oceano",2010);
        biblioteca.nuevoLibro("Algebra y geometria analitica",8,"kapeluz",1995);
        biblioteca.nuevoLibro("TURBO Pascal 7",10,"dunken",1999);
        biblioteca.nuevoLibro("Analisis matematico I",12,"planeta",2001);
        biblioteca.nuevoLibro("Piensa en Java 1",14,"planeta",2010);
        biblioteca.nuevoLibro("Introduccion a las bases de datos",7,"sudamericana",2005);
        
        biblioteca.nuevoSocioEstudiante(33123654,"Lucas Gornatti","Lic en Quimica");
        biblioteca.nuevoSocioEstudiante(30626353,"Paolo Quinteros","Ingenieria Electronica");
        biblioteca.nuevoSocioEstudiante(35363231,"Javier Martinez","L.S.I");
        biblioteca.nuevoSocioEstudiante(29636454,"Miguel Gerlero","Profesorado matematica");
        biblioteca.nuevoSocioEstudiante(28989656,"Pedro Calderon","Lic. em biologia");
        
        biblioteca.nuevoSocioDocente(30815263,"Maria Lopez","Algebra");
        biblioteca.nuevoSocioDocente(26892060,"Juan Perez","informatica");
        biblioteca.nuevoSocioDocente(34718285,"Pedro Solf","informatica");
        
        Estudiante estudiante1 = new Estudiante(37258621,"Martin Soto","Lic en Fisica");
        Docente docente1 = new Docente(25890060,"Alejandro Montechia","Calculo");
        
        biblioteca.addSocio(estudiante1);
        biblioteca.addSocio(docente1);
        
        Libro libro1 = new Libro("Programacion Logica",10,"Corrientes",2006);
        Libro libro2 = new Libro("Calculo II",9,"Moglia",1998);
        
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        
        biblioteca.prestarLibro(antigua,estudiante1,libro1);
        biblioteca.prestarLibro(antigua,docente1,libro2);
        
        teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int opc = 0;
        int dni = 0;
        String nom = "";
        String ape = "";
        String area = "";
        String carrera = "";
        String titulo = "";
        int edicion = 0;
        String editorial = "";
        int anio = 0;
        int opcion = 0;
        int numero = 0;
        setOpt(" ");
        
                
        System.out.println("\t------------------------------------------------------");
        System.out.println("\t        **** Gestion de Biblioteca ****");
        System.out.println("\t------------------------------------------------------"+"\n");
        System.out.println("\tSeleccione Opcion: ");
        do {
         boolean error=false;
            System.out.println("\t 1)  Agregar un Nuevo Socio Docente");
            System.out.println("\t 2)  Agregar un Nuevo Socio Estudiante");
            System.out.println("\t 3)  Agregar un Nuevo Libro");
            System.out.println("\t 4)  Prestar un Libro");
            System.out.println("\t 5)  Devolver un Libro");
            System.out.println("\t 6)  Listar Docentes Responsables");
            System.out.println("\t 7)  Listar Socios");
            System.out.println("\t 8)  Listar Libros");
            System.out.println("\t 9)  Eliminar un Socio");
            System.out.println("\t 10) Eliminar un Libro");
            System.out.println("\t 11) Modificar los datos de un Docente");
            System.out.println("\t 12) Qué socio tiene prestado el libro?"); 
            System.out.println("\t 13) Finalizar Proceso de Gestion");
            System.out.print("\t Opcion --> "); 
            opcion = teclado.nextInt();
            System.out.println("\f");
            
            switch (opcion) {
                case 1:
                  do{
                     error=false;
                     try{
                    System.out.println("\f");
                    System.out.println("\t  *** Cargar nuevo Socio Docente ***\n");
                    System.out.println("\t si quiere regresar al menu principal ");
                    System.out.println("\t sin crear un nuevo Socio Docente presione 0 o 1 para seguir");
                    int salida = teclado.nextInt();
                     if(salida == 0){
                       break;
                      } 

                    System.out.print("\tIngrese numero de D.N.I: "); 
                    dni = teclado.nextInt();
                    System.out.print("\tIngrese Nombre: "); 
                    nom = teclado.next();
                    System.out.print("\tIngrese Apellido: "); 
                    ape = teclado.next();
                    System.out.print("\tIngrese Area: "); 
                    area = teclado.next();
                    biblioteca.nuevoSocioDocente(dni, (nom + " " + ape), area);
                    System.out.println();
                    System.out.println("\tExito, el socio docente fue agregado...");
                }
                   catch(InputMismatchException e){
                     try{
                         Thread.sleep (1000);
                        }
                         catch (InterruptedException ex){}
                     System.out.println("!!! Ha ocurrido un error: volver al menu principal");
                      teclado.next();}
                }while (error);
                  break;
                    
                case 2:
                   do{
                     error=false;
                     try{
                    System.out.println("\f");
                    System.out.println("\t  *** Carga nuevo Socio Estudiante ***\n");
                    System.out.println("\t si quiere regresar al menu principal ");
                    System.out.println("\t sin crear un nuevo Socio Estudiante presione 0 o 1 para seguir");
                    int salida = teclado.nextInt();
                     if(salida == 0){
                       break;
                      } 

                    System.out.print("\tIngrese numero de D.N.I: "); 
                    dni = teclado.nextInt();
                    System.out.print("\tIngrese Nombre: "); 
                    nom = teclado.next();
                    System.out.print("\tIngrese Apellido: "); 
                    ape = teclado.next();
                    System.out.print("\tIngrese Carrera: "); 
                    carrera = teclado.next();
                    biblioteca.nuevoSocioEstudiante(dni, (nom + " " + ape), carrera);
                    System.out.println();
                    System.out.println("\tExito, el socio estudiante fue agregado...");
                     
                     }
                   catch(InputMismatchException e){
                     try{
                         Thread.sleep (1000);
                        }
                         catch (InterruptedException ex){}
                     System.out.println("!!! Ha ocurrido un error: volver al menu principal");
                      teclado.next();}
                }while (error);
                    break;  
                    
                case 3:
                    System.out.println("\t    *** Carga nuevo Libro ***\n");
                    System.out.println("\t si quiere regresar al menu principal ");
                    System.out.println("\t sin cargar un nuevo Nuevo Libro presione 0 o 1 para seguir");
                    int salida = teclado.nextInt();
                     if(salida == 0){
                       break;
                      }
 
                    System.out.print("\tIngrese Titulo; "); 
                    titulo = teclado.next();
                    System.out.print("\tIngrese Edicion: "); 
                    edicion = teclado.nextInt();
                    System.out.print("\tIngrese Editorial: "); 
                    editorial = teclado.next();
                    System.out.print("\tIngrese AÃ±o de Publicacion: ");
                    anio = teclado.nextInt();
                    biblioteca.nuevoLibro(titulo, edicion, editorial, anio);
                    System.out.println();
                    System.out.println("\tExito, el libro ha sido agregado...");
                    break;
                    
                case 4:
                    
                    System.out.println("\t*** Prestar un Libro ***\n");
                    

                    for (int i = 0; i<biblioteca.getLibros().size(); i++){
                        
                        System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                        
                    }
                    
                    System.out.print("\nIngrese el numero del Libro: "); 
                    numero = teclado.nextInt();
                    System.out.print("\nIngrese el numero de DNI del socio: "); 
                    dni = teclado.nextInt();
                    
                    if (numero>0 && numero<=biblioteca.getLibros().size()+1 && biblioteca.buscarSocio(dni)!=null){
                        
                        if (biblioteca.prestarLibro(fechaHoy, biblioteca.buscarSocio(dni), biblioteca.getLibros().get(numero-1))){
                            
                            System.out.println("\nEl " + biblioteca.getLibros().get(numero-1).toString());
                            System.out.println("Ha sido Prestado al Socio: " + biblioteca.buscarSocio(dni).toString());
                            
                        }else{
                            
                            System.out.println("\nEl " + biblioteca.getLibros().get(numero-1).toString());
                            System.out.println("Ya esta Prestado");
                            
                        }
                    }else{
                        
                        System.out.println("\nERROR, no se puede prestar libro..");
                        
                    }
                    
                    
                    break;
                    
                case 5:
                    System.out.println("\t*** Devolver Libro ***\n");
                    
                   
                   for (int i = 0; i<biblioteca.getLibros().size(); i++){
                        
                        System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                        
                    }
                    
                    System.out.print("\nIngrese el numero del Libro: "); 
                    numero = teclado.nextInt();
                    biblioteca.devolverLibro(biblioteca.getLibros().get(numero-1));
                    
                    if (numero>0 && numero<=biblioteca.getLibros().size()+1){
                        
                        System.out.println("\nEl Libro" + biblioteca.getLibros().get(numero-1).toString() + " Ha sido Devuelto");
                        
                    }else{
                        
                        System.out.println("\nERROR, numero ingresado no es valido..");
                        
                    }
                    break;                    
                    
                case 6:
                    System.out.println("\nLista de socios Responsable\n");
                    System.out.println(biblioteca.listaDeDocentesResponsables());
                    break;
                    
                case 7:
                    System.out.println("\nLista de socios\n");
                    System.out.println(biblioteca.listaDeSocios());
                    System.out.println("**********************************************");
                    System.out.println("Cant. Socios tipo Estudiante: " + biblioteca.cantidadSociosPorTipo("Estudiante"));
                    System.out.println("Cant. Socios tipo Docente: " + biblioteca.cantidadSociosPorTipo("Docente"));
                    System.out.println("**********************************************");
                    break;
                
                case 8:
                    System.out.println("\nLista de Libros\n");
                    System.out.println(biblioteca.listaDeLibros());
                    break;
                    
                case 9:
                    System.out.println("\t*** Eliminar Socio ***\n");
                    System.out.print("Ingrese el DNI del Socio:"); 
                    dni = teclado.nextInt();
                    if (biblioteca.buscarSocio(dni) != null){
                        
                        biblioteca.removeSocio(biblioteca.buscarSocio(dni));
                        System.out.println("\nEl socio ha sido eliminado..");
                        
                    }else{
                        
                        System.out.println("\nERROR, el numero de socio es incorrecto..");
                        
                    }
                    break;
                    
                case 10:
                    System.out.println("\t*** Eliminar Libro ***\n");
                    
                    
                    for (int i = 0; i < biblioteca.getLibros().size(); i++){
                        
                        System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                        
                    }
                    
                    System.out.print("\nIngrese el numero del Libro: "); 
                    numero = teclado.nextInt();
                    
                     if (numero > 0 && numero <= biblioteca.getLibros().size()+1){
                         
                         biblioteca.removeLibro(biblioteca.getLibros().get(numero-1));
                         System.out.println("\nEl Libro" + biblioteca.getLibros().get(numero-1).toString() + " Ha sido eliminado");
                         
                    }else{
                        
                        System.out.println("\nERROR, numero ingresado no es valido..");
                        
                    }
                    break;
                
                case 11:
                      do{
                     error=false;
                     try{

                    System.out.println("\t*** Modificar Dias de Docente ***\n");

                    System.out.println(biblioteca.listaDeDocentesResponsables());

                    System.out.print("\nIngrese el numero de DNI del Docente: "); 
                    dni = teclado.nextInt();
                    System.out.print("Ingrese la Cantidad de Dias a Agregar: "); 
                    int nroDias = teclado.nextInt();
                    
                    if (biblioteca.buscarSocio(dni).soyDeLaClase().equals("Docente") && nroDias > 0){
                        
                        Docente v_docente = (Docente)biblioteca.buscarSocio(dni);
                        v_docente.agregarDiasDePrestamo(nroDias);
                        System.out.print("\nSe agregaron los dias indicados..");
                        
                    }else{
                        
                        System.out.print("\nERROR, no se pueden agregar dias..");
                        
                    }
                       }
                   catch(InputMismatchException e){
                     try{
                         Thread.sleep (1000);
                        }
                         catch (InterruptedException ex){}
                     System.out.println("!!! Ha ocurrido un error: volver al menu principal");
                      teclado.next();}
                }while (error);
                  break;
                    
                   // break;
                
                case 12:
                     System.out.println("\t*** Buscar Libro ***\n");
                    
                    for (int i = 0; i < biblioteca.getLibros().size(); i++){
                        
                        System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                        
                    }
                    
                    System.out.print("\nIngrese el numero del Libro: "); 
                    numero = teclado.nextInt();
                    
                     if (numero > 0 && numero <= biblioteca.getLibros().size() + 1){
                         
                          System.out.println("\nEl libro lo tiene "+ biblioteca.quienTieneElLibro(biblioteca.getLibros().get(numero-1)));
                          
                    }else{
                        
                        System.out.println("\nERROR, numero ingresado no es valido..");
                        
                    }
                   
                    break;
                    
                case 13:
                        System.out.println("\t---> EL PROGRAMA HA FINALIZADO <---");
                        System.exit(0);
                        break;
                        
                default:
                        System.err.println("Opcion Invalida!");
                        break;
                }
            System.out.println();
            System.out.print("Presione Enter para continuar... ");
            setOpt(teclado.next());
            System.out.println("\f");
            System.out.println("\tSeleccione una nueva opcion: ");
            System.out.println();
        } while (opc != 13);
        System.exit(13);
    }
	public int getSalida() {
		return salida;
	}
	public void setSalida(int salida) {
		this.salida = salida;
	}
	public static String getOpt() {
		return opt;
	}
	public static void setOpt(String opt) {
		GestionBiblioteca.opt = opt;
	}
}
