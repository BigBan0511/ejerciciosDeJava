/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosifelsehoja;

import java.util.Scanner;

public class esFechaValida {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        boolean resultado;
        System.out.println("Le vamos a pedir el dia, mes y año de una fecha en forma numerica");
        System.out.println("Diga primero el dia");
        int dia=datos.nextInt();
        System.out.println("Despues el mes");
        int mes=datos.nextInt();
        System.out.println("Finalmente, el año");
        int año=datos.nextInt();
        if (mes>12 || mes<1) {
            resultado=false;
            System.out.println("La fecha es incorrecta, introduzca una fecha valida");
        }
        if (año<1600 || año>3000) {
            resultado=false;
            System.out.println("La fecha es incorrecta, introduzca una fecha valida");
        }
        if (dia>31 || dia<1) {
            resultado=false;
            System.out.println("La fecha es incorrecta, introduzca una fecha valida");
        }
    }
    
}
