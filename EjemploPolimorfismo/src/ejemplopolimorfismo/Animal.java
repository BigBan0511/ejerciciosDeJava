package ejemplopolimorfismo;

public class Animal {
    protected int edad;
    protected String tipo;
    protected double peso;

    public Animal(int edad, String tipo, double peso) {
        this.edad = edad;
        this.tipo = tipo;
        this.peso = peso;
    }
    
    public void hacerSonido(){
        System.out.println("Puedo emitir sonidos");
    }
    
    public void cumplirAñosHumanos(){
        this.edad++;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }
    
    
    
}
