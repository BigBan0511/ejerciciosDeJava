package excepcionestrycatchfinally;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        System.out.println("Introduce una palabra, frase o lo que sea");
        String texto = datos.nextLine();
        try{
            System.out.println("Introduce un numero entero para visualizar el caracter del texto anterior");
            int num = datos.nextInt();
            System.out.println("El caracter es: " + texto.charAt(num));
        }catch(Exception e){
            System.out.println("No es posible acceder al indice elegido de la cadena de texto");
            System.out.println(e.getMessage());
        }
    }
}
