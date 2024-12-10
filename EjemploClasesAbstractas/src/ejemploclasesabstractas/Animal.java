package ejemploclasesabstractas;

public abstract class Animal {
    private double altura;
    private double peso;
    private String habitat;

    public Animal(double altura, double peso, String habitat) {
        this.altura = altura;
        this.peso = peso;
        this.habitat = habitat;
    }
    
    public void decirTamaño(){
        if(this.altura>100 && this.peso>30){
            System.out.println("Soy un animal grande");
        }else if(this.altura>50 && this.peso>10){
            System.out.println("Soy un animal mediano");
        }else{
            System.out.println("Soy un animal pequeño");
        }
    }
    
    //Si yo quiero hacer un metodo alimentarse pero cada animal es omnivoro, hervivoro o carnivoro,
    //podria no tener sentido declarar este metodo en el Animal porque va a depender de la clase hija,
    //sin embargo, no todos los Animales pueden alimentarse, la idea es forzar a que las clases hijas 
    //deban implementar obligatoriamente el metodo alimentarse
    
    public abstract void alimentarse();
    
    @Override
    public String toString(){
        return "Mi altura es " + this.altura + " mi peso es " + this.peso + " y mi habitat es " + this.habitat;
    }
}
