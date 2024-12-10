/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosifelsehoja;

import java.util.Scanner;

public class escribeOrdenadosTresNumeros {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce el primer numero");
        double numero1=datos.nextDouble();
        System.out.println("Introduce el segundo numero");
        double numero2=datos.nextDouble();
        System.out.println("Introduce el tercer numero");
        double numero3=datos.nextDouble();
        if (numero1<=numero2 && numero1<=numero3) {
            System.out.println("el orden es el siguiente: " + numero1);
            {
            if (numero2<=numero3) {
                System.out.println("le sigue: " + numero2);
                System.out.println("le sigue: " + numero3);
            }else{
                System.out.println("le sigue: " + numero3);
                System.out.println("le sigue: " + numero2);
            }
        }{ 
            if (numero2<=numero1 && numero2<=numero3) {
            System.out.println("el orden es el siguiente: " + numero2);
            if (numero1<=numero3) {
                System.out.println("le sigue: " + numero1);
                System.out.println("le sigue: " + numero3);
            }else{
                System.out.println("le sigue: " + numero3);
                System.out.println("le sigue: " + numero1);
            }
        }else{ if (numero3<=numero1 && numero3<=numero2) {
            System.out.println("el orden es el siguiente: " + numero3);
            if (numero1<=numero2) {
                System.out.println("le sigue: " + numero1);
                System.out.println("le sigue: " + numero2);
            }else{
                System.out.println("le sigue: " + numero2);
                System.out.println("le sigue: " + numero1);
            }
        }
    }
    
}
}
}
}

