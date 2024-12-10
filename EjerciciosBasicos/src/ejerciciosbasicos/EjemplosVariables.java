/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class EjemplosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Las constantes se declaran con final tipoDato nombre=valor
        //Una vez declaradas NO PUEDE CAMBIARSE SU VALOR
        final double PI=3.14159;
        int edad=18;
        System.out.println("Mi edad es: " + edad);
        Scanner datos=new Scanner(System.in);
        System.out.println("Digame el precio");
        int precio=datos.nextInt();
        System.out.println("El precio es: " + precio);
        int año=2005;
        System.out.println("Mi año de nacimiento es: " + año);
        boolean esPrimo=false;
        System.out.println("Mi edad es un numero primo? " + esPrimo);
        System.out.println("Digame la letra del carnet");
        String letraCarnet=datos.next();
        System.out.println("La letra es: " + letraCarnet);
        String tipoSangre="¿?";
        System.out.println("Tu tipo de sangre es: " + tipoSangre);
        double precioJuego=59.99;
        System.out.println("El precio del juego es: " + precioJuego);
        System.out.println("Introduce tu altura: ");
        double altura=datos.nextDouble();
        System.out.println("Tu altura es: " + altura);
        System.out.println("La primera variable de tipo int llamada edad es: " + edad);
        System.out.println("La segunda variable de tipo int es llamada precio: " + precio);
        System.out.println("La tercera variable de tipo int llamada año es: " + año);
        System.out.println("La variable de tipo boolean llamada esPrimo es: " + esPrimo);
        System.out.println("La primera variable de tipo double llamada precioJuego es: " + precioJuego);
        System.out.println("La segunda variable de tipo double llamada altura es: " + altura);
        System.out.println("La tercera variable de tipo double llamada PI es: " + PI);
    }
    
}
