/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

public class EjemploVariosIf {
    
    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        /* Vamos a solicitar la edad de una persona, si es menor de 13
        años será un/a niño/a, si tiene entre 13 y 18 será un/a adolescente
        si tiene más de 18 será un/a adulto/a.
        Para hacerlo vamos a usar if/else if/ else
        1-introd edad
        2-edad input
        3-¿menor o igual a 13?
        4-eres una niña
        5-edad adulta (¿mas de 18?)
        6-adolescente
        7-adulto
        8-dime edad con system
        El operador lógico && sirve para que se tengan que cumplir las 2 condiciones
        El operaror || sirve paara que o se cumple una o la otra
        */
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
