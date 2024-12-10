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
public class FechaValida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        int ano = sc.nextInt();
        
        if (ano > 0 ) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                if (dia >= 1 && dia <= 31 ) {
                    System.out.println("La fecha es correscta");
                } else {
                    System.out.println("El dia en este mes no puede ser mayor que 31 o menor que 1");
                }
            } else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
                    if (dia >= 1 && dia <= 30 ) {
                        System.out.println("La fecha es correscta");
                    }else {
                        System.out.println("El dia debe ser menor de 30 y mayor de 1");
                    } 
                } else {
                    if (mes == 2) {
                        if (dia >= 1 && dia <= 29 ) {
                            System.out.println("La fecha es correscta");
                        } else {
                            System.out.println("El dia debe ser menor de 29 y mayor de 1");
                        }
                    } else {
                        System.out.println("Elije un mes válido");
                    }
                }
            }
        } else {
            System.out.println("Elige un año válido, debe ser de uno o mayor");
        }
    }
    
}
