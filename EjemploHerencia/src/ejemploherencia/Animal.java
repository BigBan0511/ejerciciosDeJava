package ejemploherencia;

//La clase que usaremos como madre, no necesita tener nada especial

import java.util.Scanner;

//se define como cualquier otra clase que hayamos usado hasta ahora
//ESO SI -> Debemos pensar que todos los hijos que tenga deben heredar sus
//atributos y métodos. Aquí ponemos generalidades a todos los animales.
public class Animal {
    //Estos atributos son comunes a todos los animales.
    private Scanner datos;
    private double altura;
    private double peso;
    private String nombreCientifico;
    private String color;
    private boolean pelaje;
    private String tipoAlimentacion;

    public Animal(double altura, double peso, String nombreCientifico, String color, boolean pelaje, String tipoAlimentacion) {
        this.altura = altura;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
        this.color = color;
        this.pelaje = pelaje;
        this.tipoAlimentacion = tipoAlimentacion;
    }
    
    public Animal(boolean pelaje){
        System.out.println("Introduce la altura del animal");
        this.altura = this.datos.nextDouble();
        System.out.println("Introduce el peso del animal");
        this.peso = this.datos.nextDouble();
        System.out.println("Introduce el color del animal");
        this.color = this.datos.nextLine();
        System.out.println("Introduce el nombre cientifico del animal");
        this.nombreCientifico = this.datos.nextLine();
        System.out.println("Introduce la alimentacion");
        this.tipoAlimentacion = this.datos.nextLine();
        this.pelaje = pelaje;
    }
    
    public void comer(){
        if(this.tipoAlimentacion.equalsIgnoreCase("hervivoro")){
            System.out.println("Mmm que rica la hierba");
        }else if(this.tipoAlimentacion.equalsIgnoreCase("Omnivoro")){
            System.out.println("Como carne, verduras y pescado!!!");
        }else if(this.tipoAlimentacion.equalsIgnoreCase("Carnivoro")){
            System.out.println("Como carne solo pipipi");
        }else{
            System.out.println("Me alimento de Nesquik");
        }
    }
    
    public void dormir(){
        System.out.println("ZZzzZZzZzZzZ");
    }
    
    public void necesidades(){
        System.out.println("Me ise caquita UwU");
    }
    
}
