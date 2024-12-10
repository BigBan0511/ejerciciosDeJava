/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author GSW1A8570413
 */
public class EjercicioEdadCondicionales {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad =datos.nextInt();
        if (edad>=18) {
            System.out.println("Eres mayor de edad crack");
        }else{
            System.out.println("Eres menor llora");
        }
        System.out.println("Tu edad es: " + edad);
    }
    
}
