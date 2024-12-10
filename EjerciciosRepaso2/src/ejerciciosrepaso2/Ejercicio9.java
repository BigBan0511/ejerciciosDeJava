package ejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        int resultadoNumerosPares = 0;
        int [] numeros = new int[10];
        for (int x = 0; x < numeros.length; x++) {
            System.out.println("Introduce el siguiente numero");
            numeros[x] = datos.nextInt();
            int [] numerosPares = new int [numeros.length];
            if(x%2==0){
                int y = 0;
                numerosPares[y] = numeros[x];
                for (int i = 0; i < numerosPares.length; i++) {
                    resultadoNumerosPares = numerosPares[x] + resultadoNumerosPares;
                }
                y++;
            }
        }
        int media = resultadoNumerosPares / (numeros.length/2);
        System.out.println("La media es: " + media);
    }
    
}
