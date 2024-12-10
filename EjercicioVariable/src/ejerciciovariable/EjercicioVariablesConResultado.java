/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovariable;

/**
 *
 * @author Administrador
 */
public class EjercicioVariablesConResultado {

   
    public static void main(String[] args) {
        //Vamos a usar datos de tipo double que pueden almacenar números decimales
        double operando1=7.5;
        double operando2=5.5;
        //Voy a crear una variable resultado para cada operación
        double resultadoSuma=operando1+operando2;
        System.out.println("el resultado es: " + (resultadoSuma));
        double resultadoResta=operando1-operando2;
        System.out.println("el resultado es: " + (resultadoResta));
        double resultadoDivision=operando1/operando2;
        System.out.println("el resultado es: " + (resultadoDivision));
        //Para ver el resto de una division usamos el operador resto % (shift + 5)
        double resultadoResto=operando1%operando2;
        System.out.println("El resto es: " + (resultadoResto));
        double resultadoMultiplicacion=operando1*operando2;
        System.out.println("el resultado es: " + (resultadoMultiplicacion));
        //Demuestro que las variables PUEDEN CAMBIAR DE VALORES
        resultadoSuma=35;
        System.out.println("--------------------------------------------");
        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }
    
}
