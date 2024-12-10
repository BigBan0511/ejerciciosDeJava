/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovariable;

/**
 *
 * @author Administrador
 */
public class OrdenDeLosOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double resultado=8*3+19;
        System.out.println(resultado);
        //LOS OPERADORES ARITMÉTICOS SE EJECUTAN POR ORDEN PURAMENTE MATEMÁTICO
        //En el caso de arriba se resuelve primero la mult y luego la suma
        //Si queremos que se resuelva antes la suma usamos el ()
        resultado=7*(22%2);
        System.out.println("--------------------");
        System.out.println(resultado);
        System.out.println("--------------------");
        double resultado2= 8/2*3;
        System.out.println(resultado2);
    }
    
}
