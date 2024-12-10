/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscondicionales2;

import java.util.Scanner;

public class e {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduzca la primera longitud de un triangulo");
        double longitud1 = datos.nextDouble();
        System.out.println("Introduzca la segunda longitud de un triangulo");
        double longitud2 = datos.nextDouble();
        System.out.println("Introduzca la tercera longitud de un triangulo");
        double longitud3 = datos.nextDouble();
        double resultado1= longitud1+longitud2;
        double resultado2= longitud1+longitud3;
        double resultado3= longitud2+longitud3;
        if (resultado1>longitud3) {
            System.out.println("El triangulo es valido");
        }else{
            System.out.println("El triangulo no es valido");
        } if (resultado2>longitud2) {
            System.out.println("El triangulo es valido");
        }else{
            System.out.println("El triangulo no es valido");
        } if (resultado3>longitud1) {
            System.out.println("El triangulo es valido");
        }else{
            System.out.println("El triangulo no es valido");
        }
    }
    
}
