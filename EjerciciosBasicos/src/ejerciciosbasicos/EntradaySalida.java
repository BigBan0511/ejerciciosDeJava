/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class EntradaySalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EL ORDEN SECUENCIAL ES VITAL, NO PUEDO USAR SCANNER DATOS SI NO
        //LO DECLARO ANTES
        Scanner datos=new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre=datos.next();
        System.out.println("Hola " + nombre);
        System.out.println("Dime el primer valor");
        int sumando1=datos.nextInt();
        System.out.println("Dime el segundo valor");
        int sumando2=datos.nextInt();
        int resultado=sumando1+sumando2;
        System.out.println("El resultado es: " + resultado);
        System.out.println("La suma de " + sumando1 + " y " + sumando2 + " es " + resultado);
        System.out.println("Dime el primer numero");
        double valor1=datos.nextDouble();
        double resultado2=valor1*valor1;
        System.out.println("El cuadrado del valor dado es: " +resultado2);
        System.out.print("Ahora dime el primer valor: ");
        String string1 = datos.next();
        System.out.print("Ahora dime el segundo valor: ");
        String string2 = datos.next();
        System.out.print("Ahora dime el tercer valor: ");
        String string3 = datos.next();
        System.out.print("Ahora dime el cuarto valor: ");
        String string4 = datos.next();
        System.out.print("Ahora dime el quinto valor: ");
        String string5 = datos.next();
        System.out.print("Ahora dime el sexto valor: ");
        String string6 = datos.next();
        System.out.print("Ahora dime el septimo valor: ");
        String string7 = datos.next();
        System.out.print("Ahora dime el octavo valor: ");
        String string8 = datos.next();
        System.out.print("Ahora dime el noveno valor: ");
        String string9 = datos.next();
        System.out.print("Ahora dime el decimo valor: ");
        String string10 = datos.next();

        String respuestaString = string1 + string2 + string3 + string4 + string5 + string6 + string7 + string8 + string9 + string10;

        System.out.println("La concatenacion es: " + respuestaString);
    }
    
}
