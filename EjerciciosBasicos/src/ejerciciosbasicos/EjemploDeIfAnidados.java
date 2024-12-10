/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

public class EjemploDeIfAnidados {

    public static void main(String[] args) {
        //Va a determinar si podemos matricularnos en 1ºDAW
        //Haber aprobado BACH
        //Cumplir 18 años en el presente curso
        Scanner datos=new Scanner(System.in);
        System.out.println("Contesta true o false a las siguientes preguntas");
        System.out.println("Has aprobado BACH?");
        boolean bach=datos.nextBoolean();
        System.out.println("Eres mayor de 18 o los cumples este curso?");
        boolean mayor=datos.nextBoolean();
        if (bach==true) {
            if (mayor==true) {
                System.out.println("Puedes matricularte");
            }else{
                System.out.println("No puedes matricularte porque eres y seras menor");
            }
        }else{
            System.out.println("No puedes matricularte porque no aprobaste BACH");
        }
    }
    
}
