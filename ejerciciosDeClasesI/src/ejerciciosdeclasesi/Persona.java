package ejerciciosdeclasesi;

public class Persona {
    private String nombre;
    private int edad;
    private int alturaCm;
    private double pesoKg;
    
    public Persona(String elNombre, int laEdad, int laAlturaCm, double elPesoKg){
        nombre=elNombre;
        edad=laEdad;
        alturaCm=laAlturaCm;
        pesoKg=elPesoKg;
    }
    
    public String comer(String comida){
        System.out.println("Que rica la " + comida);
        
        return comida;
    }
    
    public int respirar(int cantidadDeOxigeno){
        System.out.println("La cantidad de oxigeno en sangre es: " + cantidadDeOxigeno);
        
        return cantidadDeOxigeno;
    }
    
    public void verRangoEdad(){
        if(edad<0){
            System.out.println("No has ni nacido XD");
        }
        if(edad>110){
            System.out.println("Sigues vivo?????");
        }
        if (edad>=0 && edad<=17){
            System.out.println("Eres un nino");
        }else if(edad>=18 && edad<=69){
            System.out.println("Eres un adulto");
        }else if(edad>=70 && edad<=110){
            System.out.println("Eres un anciano");
        }
    }
    
    public void setNombre(String parametroNombre){
        this.nombre=parametroNombre;
    }
    
    public void setEdad(int parametroEdad){
        this.edad=parametroEdad;
    }
    
    public void setAlturaCm(int parametroAlturaCm){
        this.alturaCm=parametroAlturaCm;
    }
    
    public void setPesoKg(double parametroPesoKg){
        this.pesoKg=parametroPesoKg;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getAlturaCm(){
        return alturaCm;
    }
    
    public double getPesoKg(){
        return pesoKg;
    }
}
