package excepcionestrycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        try{
            System.out.println("Introduce tu nombre");
            String nombre = datos.nextLine();
            System.out.println("Introduce tu edad");
            int edad = datos.nextInt();
            String categoria;
            if(edad<18){
                categoria = "menor de edad";
            }else if(edad>=18 || edad<=65){
                categoria = "mayor de edad";
            }else if(edad>65){
                categoria = "mayor de 65";
            }
        }catch(InputMismatchException e){
            System.out.println("Introduce un numero, no texto");
        }
    }
    
}
