
package ejerciciosiniciales;

import java.util.Scanner;

public class Ejercicio4B {

    public static void main(String[] args) {
        //CONSIDERAMOS 0 PAR Y SIN SIGNO
        int elNumero;
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce el nº");
        elNumero=datos.nextInt();
        if(elNumero==0)
            System.out.println("El nº es par y no tiene signo");
        else if(elNumero>0 && elNumero%2==0)
            System.out.println("Es positivo y par");
        else if(elNumero>0 && elNumero%2!=0)
            System.out.println("Es positivo e impar");
        else if(elNumero<0 && elNumero%2==0)
            System.out.println("Es negativo y par");
        else
            System.out.println("Es negativo e impar");
    }
}
