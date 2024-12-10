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
public class a {
    
    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Si desea covertir euros a pesetas introduzca true, de lo contrario false");
        boolean solicitud = datos.nextBoolean();
        if (solicitud==true) {
            System.out.println("Introduce los euros");
            double euros = datos.nextDouble();
            double pesetas = euros*166.386;
            System.out.println("En pesetas serian: " +pesetas);
        }
        if (solicitud==false) {
            System.out.println("Introduce las pesetas");
            double pesetas = datos.nextDouble();
            double euros = pesetas/166.386;
            System.out.println("En euros serian: " +euros);
        }
    }
    
}
