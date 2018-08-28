package Integrador;

public class Estudiante extends Socio{
    private String carrera;
    
    Estudiante(int p_dniSocio, String p_nombre, String p_carrera){
        super(p_dniSocio, p_nombre, 20);
        this.setCarrera(p_carrera);
    }
    
    private void setCarrera(String p_carrera){
        this.carrera = p_carrera;
    }
    
    public String getCarrera(){
        return this.carrera;
    }
    
    public boolean puedePedir(){
        if((super.puedePedir() == true) && (this.cantLibrosPrestados() < 4)){
            return true;
        }else{
            return false;
        }
    }
    
    public String soyDeLaClase(){
        return "Estudiante";
    }
        
}
