package ejemplodesobrecarga;

import java.util.Scanner;

public class Humano {
    private String nombre;
    private String sexo;
    private int edad;
    private double peso;

    public Humano(String nombre, String sexo, int edad, double peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    //Sobrecargo el constructor para poder usarlo sin pasarle ningún parámetro

    public Humano() {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce el nombre ddel humano:");
        this.nombre=datos.nextLine();
        System.out.println("Introduce la edad de " + this.nombre);
        this.edad=datos.nextInt();
        System.out.println("Introduce el sexo de " + this.nombre);
        this.sexo=datos.next();
        if(!sexo.equalsIgnoreCase("hombre") && !sexo.equalsIgnoreCase("mujer")){
            this.sexo="no definido";
        }
        if(this.sexo.equals("hombre"))
            this.peso=79;
        else
            this.peso=65;
    }
    
    public void comer(){
        this.peso++;
    }
    
    public void comer(String comida){
        switch (comida){
            case "carne":
                this.peso++;
            break;
            case "pescado":
                this.peso=this.peso+0.5;
            break;
            case "verduras":
                this.peso=this.peso+0.25;
            break;
            case "comida basura":
                this.peso=this.peso+5;
            break;
            default:
                System.out.println("Dime una comida válida");
            break;
        }
    }

    @Override
    public String toString() {
        return "Humano{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + '}';
    }
}
