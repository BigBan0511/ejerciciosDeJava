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
public class Socios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cuota = 800;
        System.out.println("Escribe tu edad");
        int edad = sc.nextInt();
       
        System.out.println("Si tus padres son miembros, escribe S, sin no lo son, escribe N: ");
        String pregpadres = sc.next();
        if (pregpadres.equals("S")) {
            boolean padres = true;
        } else if (pregpadres.equals("N")) {
                boolean padres = false;
            } else {
                System.out.println("No se ha recibido un valor valido, se dará por hecho que no.");
                boolean padres = false;
            }
        
        if (edad > 65) {
            int descuento = (cuota / 100) * 40;
            System.out.println("El precio a pagar es " + (cuota - descuento) + "€");
        } else {
            if (edad < 21) {
                boolean padres = false;
                if (padres) {
                   int descuento = (cuota / 100) * 45;
                    System.out.println("La cuota es " + (cuota - descuento) + "€");
                } else {
                    int descuento = (cuota / 100) * 25;
                    System.out.println("La cuota es " + (cuota - descuento) + "€");
                }
            } else {
                System.out.println("La cuota es " + cuota + "€");
            }
        }
    }
    
}
