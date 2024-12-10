package excepcionestrycatchfinally;

import java.util.Scanner;

public class ExcepcionesConBucle {

    public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);
        boolean datosValidos = false;
        while(datosValidos==false){
            try{
                System.out.println("Introduce tu edad:");
                int edad = datos.nextInt();
                System.out.println("Tu edad es: " + edad + " años");
            }catch(Exception e){
                System.out.println("Debes introducir un numero para la edad");
                datos.next();
            }
        }
    }
    
}
