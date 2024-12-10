/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosifelsehoja;

import java.util.Scanner;

public class mayorQue25 {

    public static void main(String[] args) {
        Scanner datos= new Scanner (System.in);
        System.out.println("Introduce un valor");
        int valor=datos.nextInt();
        if (valor>25) {
            System.out.println("El valor es mayor que 25");
        }else{ if (valor<25) {
            System.out.println("El valor es menor que 25");
            
        }else{ if (valor==25) {
            System.out.println("El valor es igual a 25");
        }
            
        }
    }
    
}
}
