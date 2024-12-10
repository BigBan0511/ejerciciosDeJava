/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovariable;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class TiposDeVariables {
    
    public static void main(String[] args) {
        //Existen variables de muchas clases.
        //Variables de tipo char, que guardan 1 sólo caracter
        char elCaracter='*';
        //Existen las variables de tipo boolean que guardan 
        //si algo es true o false
        boolean mayorEdad=true;
        boolean menorEdad=false;
        //Tenemos variables de tipo float, que guardan nº decimales
        //Ya los usaremos
        //Tenemos tipo double para nº grandes y decimales
        double num=3.4;
        System.out.println("El valor de el caracter es: " + elCaracter);
        System.out.println("El valor de el mayor de edad es: " + mayorEdad);
        System.out.println("El valor de el menor de edad es: " + menorEdad);
        System.out.println("El valor de num es: " + num);
        //Existe la "variable" de tipo String que es una cadena de caracteres
        String nombre="Daniel";
        System.out.println("Mi nombre es: " + nombre);
        //OTROS TIPOS DE VARIABLES
        byte elByte=127; //Solo ocupa un byte, es decir que sólo puede ir de
        //-128 a 127
        short elEnteroPequeño=-31000;
        //
    }
    
}
