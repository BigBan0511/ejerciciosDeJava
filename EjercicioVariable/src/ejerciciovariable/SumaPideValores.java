/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovariable;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class SumaPideValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para solicitar datos a los usuarios por consola
        //necesitamos usar un Objeto Scanner
        //int x=0
        //Paso 2: Declaro el scanner
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el primer sumando");
        //Paso 3: declaro una variable y la inicializo a
        //lo que introduzca el usuario `por la consola
        int s1=datos.nextInt();
        System.out.println("s1="+s1);
        System.out.println("Introduce el segundo sumando");
        int s2=datos.nextInt();
        System.out.println("s2="+s2);
        int resultado1=s1+s2;
        System.out.println("el resultado es: " + resultado1);
    }
    
}
