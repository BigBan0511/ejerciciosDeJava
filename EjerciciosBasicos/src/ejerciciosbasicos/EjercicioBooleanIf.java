/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

public class EjercicioBooleanIf {
public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce tu edad: ");
        int edad=datos.nextInt();
        if (edad<=13) {
            System.out.println("Eres un/a niño/a");
        }else {if (edad>13 && edad<18)  {
            System.out.println("Eres un/a adolescente");
        }else{ if (edad>=18) {
            System.out.println("Eres un/a adulto/a");
        }
            
            }
        }
            System.out.println("tu edad es: " + edad);
        }    
}
