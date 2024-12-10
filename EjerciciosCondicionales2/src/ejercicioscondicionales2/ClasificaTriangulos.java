package ejercicioscondicionales2;

import java.util.Scanner;

public class ClasificaTriangulos {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Introuce el lado 1");
        int lado1=datos.nextInt();
        System.out.println("Introuce el lado 2");
        int lado2=datos.nextInt();
        System.out.println("Introuce el lado 3");
        int lado3=datos.nextInt();
        if(lado1==lado2 && lado2==lado3)
            System.out.println("Triángulo equilátero");
        else if(lado1==lado2 || lado1==lado3 || lado2==lado3)
            System.out.println("Triángulo isósceles");
        else
            System.out.println("Triángulo escaleno");
    }
    
}
