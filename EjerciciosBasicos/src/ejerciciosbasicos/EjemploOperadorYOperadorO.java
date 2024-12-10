/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

public class EjemploOperadorYOperadorO {

    public static void main(String[] args) {
        //para aprobar necesitas un 5 en la nota y menos de 20 faltas
        double nota;
        int faltas;
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce tu nota");
        nota=datos.nextDouble();
        System.out.println("Introduce tus faltas");
        faltas=datos.nextInt();
        //Cuando después de un if solo quiero ejecutar una sola sentencia puedo
        //omitir las {} con else igual
        if (nota>=5 && faltas<=20)
            System.out.println("Estas aprobado");
        else
            System.out.println("Estas suspenso");
    }
    
}
