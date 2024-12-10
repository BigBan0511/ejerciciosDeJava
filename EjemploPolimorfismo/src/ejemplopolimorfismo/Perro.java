package ejemplopolimorfismo;
public class Perro extends Animal{
    private String color;
    private String raza;

    public Perro(String color, String raza, int edad, String tipo, double peso) {
        super(edad, tipo, peso);
        this.color = color;
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido(){
        //Sobrescribimos el metodo hacerSonido para que el perro haga sonidos 
        //de perro
        System.out.println("Guau guau guau");
    }
    
    @Override
    public void cumplirAñosHumanos(){
        //Cada año de un perro son 4 de un humano
        this.edad=this.edad+4;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }
    
    
    
    
    
}
