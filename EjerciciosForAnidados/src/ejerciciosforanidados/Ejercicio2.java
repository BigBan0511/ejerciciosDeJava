
package ejerciciosforanidados;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*
        AMPLIACIÓN:
        Me va a pedir 2 num, 
        lo primero que compruebo es que estos dos sean diferentes, 
        si son iguales que diga que no vale y que repitamos, 
        si son negativos o 0 igual, 
        hasta que no de los numeros buenos no lo dibujo
        Dibujo el rectángulo*/
        
        Scanner datos=new Scanner (System.in);
        System.out.println("Escribe el primer numero");
        int num1=datos.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2=datos.nextInt();
     
            if (num1!=num2 && num1>0 && num2>0 && num1!=0 && num2!=0) {
                if (num1>num2){
                    for (int z = 0; z <= num2-1; z++) {
                        for (int y = 0; y < num1-1; y++) {
                            System.out.print("* ");
                        }
                        System.out.println("* ");
                    }
                }else if (num2>num1) {
                    for (int z = 0; z <= num1-1; z++) {
                        for (int y = 0; y < num2-1; y++) {
                            System.out.print("* ");
                        }
                        System.out.println("* ");
                    } 
            }
    }else{
                System.out.println("Los números introducidos no son validos, por favor, introduzcalos de nuevo");
}
}
}


