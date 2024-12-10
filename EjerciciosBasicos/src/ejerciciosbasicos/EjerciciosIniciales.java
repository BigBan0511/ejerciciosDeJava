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
public class EjerciciosIniciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.next();
        System.out.println("Tu nombre es " + nombre);
        
        
        System.out.println("Escribe tu nombre: ");
        nombre = sc.next();
        System.out.println("Escribe tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
        
        System.out.println("Introduce el numero 1: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el numero 2: ");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("El primero es mayor que el segundo");
        } else{
            if (num1 < num2){
                System.out.println("El primero es menor que el segundo");
            }else{
            System.out.println("Los numeros son iguales");
            }
        }
        
        
        System.out.println("Inntroduce un numero: ");
        int num3 = sc.nextInt();
        if ((num3 % 2) == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        
        if (num3 < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
        
        
        
    }
    
}
