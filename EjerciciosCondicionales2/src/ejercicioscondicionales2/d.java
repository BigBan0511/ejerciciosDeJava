/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscondicionales2;

import java.util.Scanner;

public class d {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce un valor del 0 al 100");
        int valor=datos.nextInt();
        if (valor<=100 && valor>=90) {
            char calificacion=65;
            System.out.println("Su calificacion es: " +calificacion);
        }else{
            if (valor>=80 && valor<=89) {
            char calificacion=66;
            System.out.println("Su calificacion es: " +calificacion);     
        }else{
            if (valor>=70 && valor<=79) {
            char calificacion=67;
            System.out.println("Su calificacion es: " +calificacion);
        }else{
            if (valor>=60 && valor<=69) {
            char calificacion=68;
            System.out.println("Su calificacion es: " +calificacion);   
            }
        } 
        }
        }
        if (valor<60) {
            char calificacion=70;
            System.out.println("Su calificacion es: " +calificacion);
        }
    }
    
}
