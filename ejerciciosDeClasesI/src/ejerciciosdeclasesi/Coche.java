package ejerciciosdeclasesi;

public class Coche {
    private String marca;
    private String modelo;
    private int ano;
    private String color;
    private int motor;
    
    
    public Coche(String laMarca, String elModelo, int elAno, String elColor, int elMotor){
        marca=laMarca;
        modelo=elModelo;
        ano=elAno;
        color=elColor;
        motor=elMotor;
    }
    
    public void compararCoche(Coche otroCoche){
        if(this.motor>otroCoche.motor){
            System.out.println("El coche " + this.modelo + " es mas rapido que el coche " + (otroCoche.modelo));
        }else if(this.motor==otroCoche.motor){
            System.out.println("Ambos son iguales");
        }else if (this.motor<otroCoche.motor){
            System.out.println("El coche " + (otroCoche.modelo) + " es mas rapido que el coche " + this.modelo);
        }
        
    }
    
    public void setMarca(String parametroMarca){
        this.marca=parametroMarca;
    }
    
    public void setModelo(String parametroModelo){
        this.modelo=parametroModelo;
    }
    
    public void setAno(int parametroAno){
        this.ano=parametroAno;
    }
    
    public void setColor(String parametroColor){
        this.color=parametroColor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getAno(){
        return ano;
    }
    
    public String getColor(){
        return color;
    }
}
