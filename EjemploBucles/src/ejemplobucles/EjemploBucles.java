/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplobucles;

import java.util.Scanner;

/**
 *
 * @author GSW1A9456853
 */
public class EjemploBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sintaxis de for:
        //for (variavle_inicio;condicion_ parada; incremento/decremento){BUCLE}
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (x<10 || x>10){
            System.out.println("Introduce un numero");
            x = sc.nextInt();
        }
        System.out.println("El numero es 10");
    }
    
}
