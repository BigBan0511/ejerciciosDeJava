/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author GSW1A9456853
 */
public class escribePares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0 ) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
    
}
