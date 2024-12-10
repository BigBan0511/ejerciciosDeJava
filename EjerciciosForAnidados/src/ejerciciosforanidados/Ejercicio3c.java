package ejerciciosforanidados;

import java.util.Scanner;

public class Ejercicio3c {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce un valor menor que 15");
        int num1=datos.nextInt();
        if (num1>15 && num1<0) {
            System.out.println("Introduce otro valor, este no es valido");
        }else{
            for (int x = num1; x >0; x--) {
                for (int y = x; y>1; y--) {
                    System.out.print("* ");
                }
                System.out.println("* ");
            }
        }
    } 
}
