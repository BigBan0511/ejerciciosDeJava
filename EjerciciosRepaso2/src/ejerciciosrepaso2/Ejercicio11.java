package ejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        double resultadoSumaAlturas = 0;
        int numAlturas = 0;
        int numAlturasMayores = 0;
        int numAlturasMenores = 0;
        do {
            System.out.println("Introduce el numero de alturas que desea hacer la media");
            numAlturas = datos.nextInt();
        } while (numAlturas<=0);
        double [] altura = new double [numAlturas+1];
        for (int x = 0; x <= numAlturas; x++) {
            do {                
                System.out.println("Introduce la altura " + x);
                altura [x] = datos.nextDouble();
            } while (altura[x]<=0);
            resultadoSumaAlturas = resultadoSumaAlturas + altura[x];
        }
        double mediaAltura = resultadoSumaAlturas/numAlturas;
        for (int x = 0; x < numAlturas; x++) {
            if(altura[x]>mediaAltura){
                numAlturasMayores++;
            }else if(altura[x]<mediaAltura){
                numAlturasMenores++;
            }
        }
        System.out.println("La media de alturas es " + mediaAltura);
        System.out.println("La altura/s mayor/es a la media es/son " + numAlturasMayores);
        System.out.println("La altura/s menor/es a la media es/son " + numAlturasMenores);
    }
}
