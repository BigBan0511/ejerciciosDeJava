package clasesjavaejemplospooo;

import java.util.Scanner;

public class ClasesJavaEjemplosPOOO {
    public static Scanner datos=new Scanner(System.in);

    public static void main(String[] args) {
        //El nombre de los objetos siempre en minúscula
        Guerrero gojo = new Guerrero(33, 1000000, "Gojo", 100, "Hollow Purple");
        
        gojo.tomarPocion("veneno", 33);
        gojo.mostrarGuerrero();
        
        /*//Usamos el operador . para que los objetos puedan acceder a
        //sus métodos y a sus atributos
        gojo.mostrarGuerrero();
        gojo.subirNivel();
        System.out.println("--------------------------");
        gojo.mostrarGuerrero();
        System.out.println("--------------------------");
        int vidaGuerrero = 0;
        do{
            System.out.println("Introduce la vida del Guerrero");
            vidaGuerrero = datos.nextInt();
        }while(vidaGuerrero<=0);
        Guerrero nuevoGuerrero = new Guerrero(vidaGuerrero,1000000, "Gojo", 100, "Hollow Purple");
        nuevoGuerrero.setVida(vidaGuerrero);
        System.out.println("la vida del guerrero es: " + nuevoGuerrero.getVida());
        System.out.println("-------------------------------------");
        
        //Si igualamos un objeto a null, este deja de existir aunque lo podamos referenciar
        gojo.recibirGolpe(0);
        gojo.mostrarGuerrero();*/
    }
    
}
