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
public class LimiteInferiorsuperior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el límite inferior: ");
        int inferior = sc.nextInt();
        System.out.println("Introduce el límite superior: ");
        int superior = sc.nextInt();
        
        if (superior < inferior) {
        int intermedia = superior;
        superior = inferior;
        inferior = intermedia;
            System.out.println("El limite inferior era superior al superior, así que se han invertido los valores");
            System.out.println("El límite inferior es " + inferior + " y el superior es " + superior);
        } else {
            System.out.println("El límite inferior es " + inferior + " y el superior es " + superior);
        }
    }
    
}
