 package ejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        int numPalabras = 1;
        System.out.println("Introduce una frase");
        String frase = datos.nextLine();
        for (int x = 0; x < frase.length(); x++) {
            if(frase.charAt(x)==' '){
                numPalabras++;
            }
        }
        System.out.println("El numero de palabras en la frase elegida es: " + numPalabras);
    }
}
