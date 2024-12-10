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
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tasaAlcolemia=0.25;
        double miTasa=0.5;
        
        if (miTasa >= tasaAlcolemia){
            System.out.println("Cagaste");
        }
        System.out.println("Tu tasa de alcohol es " + miTasa);
        
        int edadConcierto=16;
        int miEdad=14;
        if(miEdad >= edadConcierto){
            System.out.println("Puedes ir al concierto");
        }else{
            System.out.println("Te jodes marica");
        }
        System.out.println("Tu edad es " + miEdad); 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos años tienes: ");
        int edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        System.out.println("Tu edad es: " + edad);
        //solicitar edad <13 niño 13-18 adolescente >18 adulto
        //if-else-if-else
    }
    
}
