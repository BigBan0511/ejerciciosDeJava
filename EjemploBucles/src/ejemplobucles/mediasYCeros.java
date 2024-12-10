/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplobucles;

import java.util.Scanner;

/**
 *
 * @author GSW1A9456853
 */
public class mediasYCeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador0 = 0;
        int contadorpos = 0;
        int contadorneg = 0;
        int sumapos = 0;
        int sumaneg = 0;
        int contador = 0;
        int numactual = 0;
        while (contador <10) {
            System.out.println("Introduce un numero: ");
            numactual = sc.nextInt();
            if ( numactual == 0 ) {
                contador0 = contador0 + 1;
            } else {
                if (numactual > 0) {
                    sumapos = sumapos + numactual;
                    contadorpos = contadorpos + 1;
                } else {
                    sumaneg = sumaneg + numactual;
                    contadorneg = contadorneg + 1;
                }
            }
            contador = contador + 1;
        }
        if (contadorpos == 0){
            contadorpos = 1;
        }
        if (contadorneg == 0){
            contadorneg = 1;
        }
        System.out.println("La media de los numeros positivos es " + (sumapos / contadorpos));
        System.out.println("La media de los negativos es " + (sumaneg / contadorneg));
        System.out.println("Se han introducido " + contador0 + " ceros");
    }
    
}
