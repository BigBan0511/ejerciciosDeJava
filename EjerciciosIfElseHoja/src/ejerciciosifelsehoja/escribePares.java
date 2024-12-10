/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosifelsehoja;

import java.util.Scanner;

public class escribePares {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce un numero entero");
        int numero=datos.nextInt();
        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}
