package ejerciciosiniciales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce el num1");
        num1=datos.nextInt();
        System.out.println("Introduce el num2");
        num2=datos.nextInt();
        if(num1>num2){
            System.out.println(num1 + " es mayor que " + num2);}
        else if (num2>num1)
            System.out.println(num2 + " es mayor que " + num1);
        else
            System.out.println("Los nºs son iguales");
    }
    
}
