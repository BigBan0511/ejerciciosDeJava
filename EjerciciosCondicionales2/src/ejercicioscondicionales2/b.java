/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscondicionales2;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class b {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduzca un numero");
        int numero=datos.nextInt();
        if (numero>=1 && numero<=100) {
            System.out.println("El numero esta en un rango del 1 al 100");
        }else{
            System.out.println("El numero no esta en un rango del 1 al 100");
        }
    }
    
}
