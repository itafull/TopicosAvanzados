package Integrador;

public class Docente extends Socio{
    private String area;
    
    Docente(int p_dniSocio, String p_nombre, String p_area){
        super(p_dniSocio, p_nombre, 5);
        this.setArea(p_area);
    }
    
    private void setArea(String p_area){
        this.area = p_area;
    }
    
    public String getArea(){
       return this.area;
    }
    
    public boolean esResponsable(){
        if(super.puedePedir() == true){
            return true;
        }else{
            return false;
        }
    }
    
    public void agregarDiasDePrestamo(int p_dias){
        if(esResponsable() == true){
            this.setDiasPrestamo(this.getDiasPrestamo() + p_dias);
        }
    }
    
    public String soyDeLaClase(){
        return "Docente";
    }
}
