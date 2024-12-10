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
public class mayorDeEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        if (edad >=18) {
            System.out.println("Eres mayor de edad");
        }else if (edad <0) {
            System.out.println("La edad introducida no es valida");
        }else {
            System.out.println("No eres mayor de edad");
        }
    }
    
}
