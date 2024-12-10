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
public class sumarhasta0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        int contador = 0;
        int suma = numero;
        while (numero <0 || numero >0){
            contador = contador + 1;
            System.out.println("Introduce un numero: ");
            numero = sc.nextInt();
            suma = suma + numero;
        }
        System.out.println("Se ha introducido un 0 y se ha parado el bucle");
        System.out.println("La suma de todos los numeros es " + suma);
        System.out.println("Se han sumado " + contador + " numeros");
    }
    
}
