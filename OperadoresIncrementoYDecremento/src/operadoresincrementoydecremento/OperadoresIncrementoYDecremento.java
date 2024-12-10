/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresincrementoydecremento;

/**
 *
 * @author Daniel
 */
public class OperadoresIncrementoYDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        // Operadores de incremento
        z = 0;
        System.out.println("El valor de z antes de incrementar es: " + z);
        z++;
        System.out.println("El valor de z despues de incrementar es: " + z);
        x = 1;
        y = x+1;
        y = 1+x;
        System.out.println("x= 1; y= x+1; y= " + y);
        // Operadores de decremento
        int decremento=25;
        System.out.println("antes: " + decremento);
        decremento--;
        System.out.println("despues: " + decremento);
        x = 2;
        y = x-1;
        y = 1-x;
        System.out.println("x= 2; y= x-1; y= " + y);
        x = 7;
        y = 14/x;
        System.out.println("x= 7; y = 14/x; y= " + y);
    }
    
}
