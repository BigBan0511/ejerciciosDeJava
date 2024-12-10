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
public class OrdenadosTresNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer decimal: ");
        double decimal1 = sc.nextDouble();
        System.out.println("Introduce el segundo decimal: ");
        double decimal2 = sc.nextDouble();
        System.out.println("Introduce el tercer decimal: ");
        double decimal3 = sc.nextDouble();
        if (decimal1 < decimal2) {
            if (decimal2 < decimal3) {
                System.out.println("El orden es " + decimal1 + "," + decimal2 + "," + decimal3);
            } else {
                    if (decimal1 < decimal3) {
                        System.out.println("El orden es " + decimal1 + "," + decimal3 + "," + decimal2);
                    } else {
                        System.out.println("El orden es " + decimal3 + "," + decimal1 + "," + decimal2);
                        }
                }
        } else {
            if (decimal1 < decimal3) {
                System.out.println("El orden es " + decimal2 + "," + decimal1 + "," + decimal3);
                } else {
                    if (decimal2 < decimal3) {
                        System.out.println("El orden es " + decimal2 + "," + decimal3 + "," + decimal1);
                        } else {
                            System.out.println("El orden es " + decimal3 + "," + decimal2 + "," + decimal1);
                            }
                    }
            }
    }
    
}
