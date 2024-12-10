package ejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio13 {
    public static int numPalabras = 1;
    public static String frase;
    
    public static int contadorPalabras(){
        for (int x = 0; x < frase.length(); x++) {
            if(frase.charAt(x)==' '){
                numPalabras++;
            }
        }
        return numPalabras;
    }
    
    public static String borrarPalabra(String fraseA, int contadorPalabras){
        contadorPalabras = 1;
        fraseA = "";
        do {            
            for (int x = 0; x < frase.length(); x++) {
                fraseA = frase;
            }
        } while (contadorPalabras!=numPalabras);
        return fraseA;
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        System.out.println("Introduce una frase");
        String frase = datos.nextLine();
        String palabraBorrada;
        palabraBorrada = borrarPalabra(frase, contadorPalabras());
    }
    
}
