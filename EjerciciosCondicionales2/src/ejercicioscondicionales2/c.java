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
public class c {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduzca un numero");
        int rango1=datos.nextInt();
        System.out.println("Introduzca otro mayor al anterior");
        int rango2=datos.nextInt();
        System.out.println("Introduzca otro numero");
        int numero=datos.nextInt();
        if (numero>=rango1 && numero<=rango2) {
            System.out.println("El numero esta dentro de su rango");
        }else{
            System.out.println("El numero no esta dentro de su rango");
        }
    }
    
}
